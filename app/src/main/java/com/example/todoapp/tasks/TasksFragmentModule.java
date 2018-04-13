package com.example.todoapp.tasks;

import android.support.v4.app.Fragment;

import com.example.todoapp.di.ActivityScoped;
import com.example.todoapp.di.FragmentScoped;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.ContributesAndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

/**
 * Created by tubro on 2018/4/11.
 */

@Module
public abstract class TasksFragmentModule {

    @ContributesAndroidInjector
    abstract TasksFragment tasksFragment();

    @ActivityScoped
    @Binds
    abstract TasksContract.Presenter taskPresenter(TasksPresenter presenter);
}
