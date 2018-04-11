package com.example.todoapp.di;

import com.example.todoapp.TodoApplication;
import com.example.todoapp.tasks.TasksFragmentModule;
import com.example.todoapp.tasks.TasksFragmentSubcomponent;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Component(modules = {TasksFragmentModule.class, AndroidInjectionModule.class})
public interface TodoApplicationComponent {
    void inject(TodoApplication app);
}
//todo 为什么不写AndroidInjectionModule 会报错https://stackoverflow.com/questions/48482202/fragmentdispatchingandroidinjector-while-using-support-fragments