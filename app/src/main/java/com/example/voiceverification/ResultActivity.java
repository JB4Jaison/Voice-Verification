package com.example.voiceverification;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.JsonElement;

import java.util.ArrayList;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Response;

public class ResultActivity extends AppCompatActivity {
    String taskID;
    ListView resultListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent data = getIntent();
        taskID = data.getStringExtra("taskId");

        resultListView = findViewById(R.id.resultListView);
        ArrayList<String> answers = getTaskResults(taskID);

        resultListView.setAdapter(new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, answers));
    }

    private ArrayList<String> getTaskResults(String taskId) {
        ArrayList<String> arrayOfAnswers = new ArrayList<>();
        try
        {
            GetTaskResultsAPI api = RetrofitClientResults.getInstance().getTaskResultApi();
            Call<TaskResults> call = api.getResults(36683946);
            Response<TaskResults> response = call.execute();
            String currentTask = "";
            for (JsonElement e :  response.body().getresults()) {

                for(Map.Entry<String, JsonElement> entry : e.getAsJsonObject().entrySet()) {
                    if (entry.getKey().equals("tasks")){

                        entry.getValue().getAsJsonArray().get(0).getAsJsonObject().get("id");
                        currentTask = entry.getValue().getAsJsonArray().get(0).getAsJsonObject().get("id").getAsString();
                    }
                    if (entry.getKey().equals("solutions")){
                        if (currentTask.equals(taskId)){
                            arrayOfAnswers.add(entry.getValue().getAsJsonArray().get(0).getAsJsonObject().get("output_values").getAsJsonObject().get("transcription").getAsString());
                        }

                    }
                }
            }
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
        return arrayOfAnswers;
    }
}