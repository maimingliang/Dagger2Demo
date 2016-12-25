package com.maiml.dagger2demo.di;

import com.maiml.dagger2demo.User;

import dagger.Module;
import dagger.Provides;

/**
 * Created by maimingliang on 2016/12/24.
 */
@Module
public class UserModule {


    @Provides
    public User provideUser(){
        return new User();
    }
}
