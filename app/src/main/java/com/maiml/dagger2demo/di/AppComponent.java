package com.maiml.dagger2demo.di;

import com.maiml.dagger2demo.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by maimingliang on 2016/12/19.
 */
@Component(modules = {AppModule.class,UserModule.class})
@Singleton
public interface AppComponent {

    void inject(MainActivity activity);
}
