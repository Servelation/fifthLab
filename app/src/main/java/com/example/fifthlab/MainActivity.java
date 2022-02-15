package com.example.fifthlab;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;

import com.example.fifthlab.domain.Task;
import com.example.fifthlab.domain.TaskRepo;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

/**
 * @author anechaev
 * @since 22.01.2022
 */
public class MainActivity extends AppCompatActivity {

    private FloatingActionButton actionButton;
    private RecyclerView recyclerView;
    private TaskAdapter taskAdapter;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        updateAdapter();

        actionButton = findViewById(R.id.floatingActionButton);
        actionButton.setOnClickListener(e -> updateAdapter());
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private void updateAdapter() {
        List<Task> tasks = TaskRepo.getInstance().getTasks();
        taskAdapter = new TaskAdapter(this, tasks);
        recyclerView.setAdapter(taskAdapter);
    }
}