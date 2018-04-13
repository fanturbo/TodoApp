package com.example.todoapp.base;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.AndroidSupportInjection;
import dagger.android.support.HasSupportFragmentInjector;

/**
 * Created by tubro on 2018/4/11.
 */

public class BaseActivity extends AppCompatActivity implements HasSupportFragmentInjector {
    @Inject
    DispatchingAndroidInjector<Fragment> dispatchingFragmentInjector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        injectDependencies();
        super.onCreate(savedInstanceState);
    }

    protected void injectDependencies() {
        AndroidInjection.inject(this);
    }

    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return dispatchingFragmentInjector;
    }
}
