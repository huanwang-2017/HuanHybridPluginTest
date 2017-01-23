package com.example.TestHHP;

import android.os.Bundle;
import com.huan.hhp.App_configActivity;

public class MyActivity extends App_configActivity {

    /**
     * Called when the activity is first created.
     */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.main);
//        setApp_config("com.huan.plugin2", "http://172.10.10.211:8080/testhhp/app_config.xml");
        setApp_config("com.huan.service.test", "http://172.10.10.211:8080/service-demo/app_config.xml");
    }
}
