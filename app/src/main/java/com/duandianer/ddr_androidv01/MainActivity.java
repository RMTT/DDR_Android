package com.duandianer.ddr_androidv01;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;

import com.duandianer.ddr_androidv01.widget.okhttp.HTTPDownLoad;

import java.io.File;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final File file = new File(Environment.getExternalStorageDirectory(), "/01.png");
        if (!file.exists())
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        new Thread() {
            @Override
            public void run() {
                try {
                    HTTPDownLoad.SynchronousDownLoad("http://s4.51cto.com/wyfs02/M02/70/81/wKioL1W5e5GQU3qEAAEXNvlEskQ360.jpg-wh_651x363-s_2834990474.jpg", file);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
}
