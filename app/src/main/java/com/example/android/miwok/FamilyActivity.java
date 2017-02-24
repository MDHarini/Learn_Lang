package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> familyList = new ArrayList<Word>();
        familyList.add(new Word("Father","Appa",R.drawable.family_father,R.raw.number_nine));
        familyList.add(new Word("Mother","Amma",R.drawable.family_mother,R.raw.number_nine));
        familyList.add(new Word("Daughter","magalu",R.drawable.family_daughter,R.raw.number_nine));
        familyList.add(new Word("Son","maga",R.drawable.family_son,R.raw.number_nine));
        familyList.add(new Word("Grand Father","Thaatha",R.drawable.family_grandfather,R.raw.number_nine));
        familyList.add(new Word("Grand Mother","Ajji",R.drawable.family_grandmother,R.raw.number_nine));
        WordAdapter adapter = new WordAdapter(this,familyList,R.color.category_family);
        ListView list = (ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
    }
}
