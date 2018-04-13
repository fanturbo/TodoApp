package com.example.todoapp.di;

import com.example.todoapp.TodoApplication;

import javax.inject.Singleton;

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
public interface TodoApplicationComponent  extends AndroidInjector<TodoApplication> {
    void inject(TodoApplication app);
}
//todo 为什么不写AndroidInjectionModule 会报错https://stackoverflow.com/questions/48482202/fragmentdispatchingandroidinjector-while-using-support-fragments