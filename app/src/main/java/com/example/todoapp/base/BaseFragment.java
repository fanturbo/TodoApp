package com.example.todoapp.base;

import android.content.Context;
import android.support.v4.app.Fragment;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.AndroidSupportInjection;

/**
 * Created by tubro on 2018/4/11.
 */

public class BaseFragment extends Fragment {

    @Override
    public void onAttach(Context context) {
        injectDependencies();
        super.onAttach(context);
    }

    protected void injectDependencies() {
        AndroidSupportInjection.inject(this); // v4 Fragment
    }
}
