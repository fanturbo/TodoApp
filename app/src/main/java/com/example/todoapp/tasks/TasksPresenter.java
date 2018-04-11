package com.example.todoapp.tasks;

import android.support.annotation.NonNull;
import android.util.Log;

import com.example.todoapp.model.Task;

import javax.inject.Inject;

public class TasksPresenter implements TasksContract.Presenter {

    @Inject
    public TasksPresenter() {
    }

    @Override
    public void result(int requestCode, int resultCode) {

    }

    @Override
    public void loadTasks(boolean forceUpdate) {
        Log.i("======", "loadTasks");
    }

    @Override
    public void addNewTask() {

    }

    @Override
    public void openTaskDetails(@NonNull Task requestedTask) {

    }

    @Override
    public void completeTask(@NonNull Task completedTask) {

    }

    @Override
    public void activateTask(@NonNull Task activeTask) {

    }

    @Override
    public void clearCompletedTasks() {

    }

    @Override
    public void takeView(TasksContract.View view) {

    }

    @Override
    public void dropView() {

    }
}
