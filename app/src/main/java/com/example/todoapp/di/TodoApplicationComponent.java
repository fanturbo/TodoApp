package com.example.todoapp.di;

import android.app.Application;

import com.example.todoapp.TodoApplication;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {
        AllActivityModule.class,
        TodoApplicationModule.class,
        AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class})
public interface TodoApplicationComponent extends AndroidInjector<TodoApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        TodoApplicationComponent.Builder application(Application application);

        TodoApplicationComponent build();
    }
}