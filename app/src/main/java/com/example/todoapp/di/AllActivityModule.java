package com.example.todoapp.di;

import com.example.todoapp.tasks.TasksActivity;
import com.example.todoapp.tasks.TasksFragmentModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by tubro on 2018/4/13.
 */
@ActivityScoped
@Module
public abstract class AllActivityModule {
    @ActivityScoped
    @ContributesAndroidInjector(modules = TasksFragmentModule.class)
    abstract TasksActivity contributeTasksActivityInjector();
}
