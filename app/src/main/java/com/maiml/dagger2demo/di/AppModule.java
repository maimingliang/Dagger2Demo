package com.maiml.dagger2demo.di;

import android.content.Context;
import android.content.SharedPreferences;

import com.maiml.dagger2demo.DataManager;

import dagger.Module;
import dagger.Provides;

/**
 * Created by maimingliang on 2016/12/19.
 */
@Module
public class AppModule {


    private final Context mContext;


    public AppModule(Context context) {
        this.mContext = context;
    }


    @Provides
    public DataManager provideUserManager() {
        return new DataManager();
    }


    @Provides
    public Context provideContext() {
        return mContext;
    }
}
