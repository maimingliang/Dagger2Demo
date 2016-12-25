package com.maiml.dagger2demo.di;

import android.content.Context;
import android.content.SharedPreferences;

import com.maiml.dagger2demo.DataManager;
import com.maiml.dagger2demo.Person;

import dagger.Module;
import dagger.Provides;

/**
 * Created by maimingliang on 2016/12/19.
 */
@Module
public class AppModule {


    /**
     * 带@Provides 注解 ，说明该方法是提供依赖
     * @return
     */
    @Provides
    public DataManager provideManager() {
        return new DataManager();
    }


    @Provides
    public Person providePerson(){
        return new Person();
    }


}
