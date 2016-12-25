package com.maiml.dagger2demo;

import android.app.Application;

import com.maiml.dagger2demo.di.AppComponent;
import com.maiml.dagger2demo.di.AppModule;
import com.maiml.dagger2demo.di.ComponentHolder;
import com.maiml.dagger2demo.di.DaggerAppComponent;

/**
 * Created by maimingliang on 2016/12/19.
 */

public class MyApplication extends Application {



    @Override
    public void onCreate() {
        super.onCreate();

//        AppComponent appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
//        ComponentHolder.setAppComponent(appComponent);
    }
}
