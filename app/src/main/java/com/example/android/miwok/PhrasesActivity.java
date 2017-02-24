package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> familyList = new ArrayList<Word>();
        familyList.add(new Word("Good Morning","Shubodhaya"));
        familyList.add(new Word("How are you?","hengidira?"));
        familyList.add(new Word("I am fine", "channagiddini"));
        familyList.add(new Word("Thank you", "Dhanyawadagalu"));
        WordAdapter adapter = new WordAdapter(this,familyList,R.color.category_phrases);
        ListView list = (ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
    }
}
