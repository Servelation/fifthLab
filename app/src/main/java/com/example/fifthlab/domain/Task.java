package com.example.fifthlab.domain;

import static java.util.Objects.requireNonNull;

import androidx.annotation.NonNull;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author anechaev
 * @since 22.01.2022
 */
public class Task {
    private final String name;
    private final String text;
    private final LocalDate date;

    public Task(@NonNull String name, @NonNull String text, @NonNull LocalDate date) {
        this.name = requireNonNull(name, "name");
        this.text = requireNonNull(text, "text");
        this.date = requireNonNull(date, "date");
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Task))
            return false;
        Task task = (Task) o;
        return name.equals(task.name) && text.equals(task.text) && date.equals(task.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, text, date);
    }
}
