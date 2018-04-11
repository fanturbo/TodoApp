package com.example.todoapp.base;

import android.content.Context;
import android.support.v4.app.Fragment;

import dagger.android.AndroidInjection;
import dagger.android.support.AndroidSupportInjection;

/**
 * Created by tubro on 2018/4/11.
 */

public class BaseFragment extends Fragment {

    @Override
    public void onAttach(Context context) {
        AndroidSupportInjection.inject(this); // v4 Fragment
//        AndroidInjection.inject(this); // Fragment
        super.onAttach(context);
    }
}
