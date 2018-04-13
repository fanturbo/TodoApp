package com.example.todoapp.tasks;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.todoapp.R;
import com.example.todoapp.base.BaseFragment;

import javax.inject.Inject;

import dagger.android.support.AndroidSupportInjection;

/**
 * A simple {@link Fragment} subclass.
 */
public class TasksFragment extends BaseFragment {

    @Inject
    TasksPresenter tasksPresenter;

    public TasksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        tasksPresenter.loadTasks(false);
        return inflater.inflate(R.layout.fragment_tasks, container, false);
    }
}
