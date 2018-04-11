package com.example.todoapp.tasks;

import android.support.v4.app.Fragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

/**
 * Created by tubro on 2018/4/11.
 */

@Module(subcomponents = TasksFragmentSubcomponent.class)
public abstract class TasksFragmentModule {
    @Binds
    @IntoMap
    @FragmentKey(TasksFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment> bindTasksFragmentInjectorFactory(TasksFragmentSubcomponent.Builder builder);
}
