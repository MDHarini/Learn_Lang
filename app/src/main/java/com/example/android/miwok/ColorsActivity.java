package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> familyList = new ArrayList<Word>();
        familyList.add(new Word("Green","Hasiru",R.drawable.color_green,R.raw.number_ten));
        familyList.add(new Word("White","bili",R.drawable.color_white,R.raw.number_ten));
        WordAdapter adapter = new WordAdapter(this,familyList,R.color.category_colors);
        ListView list = (ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
    }
}
