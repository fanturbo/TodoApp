package com.example.todoapp.di;

import com.example.todoapp.tasks.TasksActivity;
import com.example.todoapp.tasks.TasksModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by tubro on 2018/4/13.
 */
@Module
public abstract class AllActivityModule {
    @ActivityScoped
    @ContributesAndroidInjector(modules = TasksModule.class)
    abstract TasksActivity contributeTasksActivityInjector();
}
