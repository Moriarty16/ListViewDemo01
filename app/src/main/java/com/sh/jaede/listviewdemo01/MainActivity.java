package com.sh.jaede.listviewdemo01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private ListView chooserView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();
        Map<String, String> map3 = new HashMap<>();
        map1.put("mode_id", "1  ");
        map1.put("mode_name", "1HD");
        map2.put("mode_id", "2  ");
        map2.put("mode_name", "1HD + 3SD");
        map3.put("mode_id", "3  ");
        map3.put("mode_name", "1HD + 4SD");
        list.add(map1);
        list.add(map2);
        list.add(map3);
        SimpleAdapter adapter = new SimpleAdapter(
                this,
                list,
                R.layout.demo,
                new String[]{"mode_id", "mode_name"},
                new int[]{R.id.mode_id, R.id.mode_name}
        );
        chooserView = findViewById(R.id.modeChooser);
        chooserView.setAdapter(adapter);
    }
}
