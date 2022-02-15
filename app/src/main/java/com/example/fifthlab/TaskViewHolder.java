package com.example.fifthlab;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fifthlab.domain.Task;

/**
 * @author anechaev
 * @since 22.01.2022
 */
public class TaskViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private TextView taskName;
    private TextView taskDate;
    private CheckBox checkBox;
    private Context context;
    private Task task;

    TaskViewHolder(@NonNull View itemView) {
        super(itemView);
        taskName = itemView.findViewById(R.id.taskName);
        taskDate = itemView.findViewById(R.id.taskDate);
        checkBox = itemView.findViewById(R.id.checkBox);
    }

    public TaskViewHolder(@NonNull View itemView, @NonNull Context context) {
        this(itemView);
        this.context = context;
        itemView.setOnClickListener(this);
    }

    public void bindTask(Task task, View.OnClickListener listener) {
        this.task = task;
        taskName.setText(task.getName());
        taskDate.setText(task.getDate().toString());
        checkBox.setOnClickListener(listener);
        checkBox.setChecked(false);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(context, task.getText(), Toast.LENGTH_SHORT).show();
    }


}
