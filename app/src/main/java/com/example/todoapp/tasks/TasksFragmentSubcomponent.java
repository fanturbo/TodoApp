package com.example.todoapp.tasks;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by tubro on 2018/4/11.
 */

@Subcomponent
public interface TasksFragmentSubcomponent extends AndroidInjector<TasksFragment> {
    @Subcomponent.Builder
    public abstract class Builder extends AndroidInjector.Builder<TasksFragment> {}
}