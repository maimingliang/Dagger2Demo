package com.maiml.dagger2demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maimingliang on 2016/12/19.
 */

public class DataManager {


    public List<String> findData(){

        List<String> datas = new ArrayList<>();

        for(int i =0 ; i < 100 ; i++){

            datas.add("item = " + i);
        }

        return datas;

    }

}
