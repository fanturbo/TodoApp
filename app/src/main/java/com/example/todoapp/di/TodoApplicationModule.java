package com.example.todoapp.di;

import android.app.Application;
import android.content.Context;

import dagger.Binds;
import dagger.Module;

/**
 * Created by tubro on 2018/4/12.
 */
@Module
public abstract class TodoApplicationModule {
    @Binds
    abstract Context bindContext(Application application);
}
