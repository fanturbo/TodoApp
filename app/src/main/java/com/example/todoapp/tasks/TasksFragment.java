package com.example.todoapp.tasks;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.todoapp.R;
import com.example.todoapp.base.BaseFragment;
import com.example.todoapp.di.FragmentScoped;

import javax.inject.Inject;

import dagger.android.support.AndroidSupportInjection;

/**
 * A simple {@link Fragment} subclass.
 */
@FragmentScoped
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
        View view = inflater.inflate(R.layout.fragment_tasks, container, false);
        view.findViewById(R.id.textView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tasksPresenter.loadTasks(false);
            }
        });
        return view;
    }
}
