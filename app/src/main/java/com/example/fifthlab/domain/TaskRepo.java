package com.example.fifthlab.domain;

import android.os.Build;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author anechaev
 * @since 22.01.2022
 */
@RequiresApi(api = Build.VERSION_CODES.O)
public class TaskRepo {
    private static final TaskRepo ourInstance = new TaskRepo();

    public static TaskRepo getInstance() {
        return ourInstance;
    }

    private TaskRepo() {

    }

    private final List<Task> tasks = new ArrayList<>(Arrays.asList(
        new Task("ПРЕСС КАЧАТ", "3 подхода по 20 рас",
            LocalDate.of(2022, 2, 7)),
        new Task("Т) БЕГИТ", "3 км",
            LocalDate.of(2022, 2, 8)),
        new Task("ТУРНИК", "4 подхода по 12 раз",
            LocalDate.of(2022, 2, 12)),
        new Task("АНЖУМАНЯ", "3 подхода по 50 раз",
            LocalDate.of(2022, 2, 10)),

        new Task("ПРЕСС КАЧАТ", "4 подхода по 30 раз",
            LocalDate.of(2022, 2, 11)),
        new Task("БЕГИТ", "2 подхода, каждый по 1 км",
            LocalDate.of(2022, 2, 12)),
        new Task("ГАНТЕЛИ", "Тяжелые",
            LocalDate.of(2022, 2, 13))
    ));

    @NonNull
    public List<Task> getTasks() {
        return new ArrayList<>(tasks);
    }
}
