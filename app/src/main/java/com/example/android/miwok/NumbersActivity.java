package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //adding the array of words
        final ArrayList<Word> numberWords = new ArrayList<Word>();
        // Word nrds = new Word("One","litto");

        numberWords.add(new Word("One", "ondu", R.drawable.number_one, R.raw.number_one));
        numberWords.add(new Word("Two", "eradu", R.drawable.number_two, R.raw.number_two));
        numberWords.add(new Word("Three", "muuru", R.drawable.number_three, R.raw.number_three));
        numberWords.add(new Word("Four", "nalak", R.drawable.number_four, R.raw.number_four));
        numberWords.add(new Word("Five", "idu", R.drawable.number_five, R.raw.number_five));
        numberWords.add(new Word("Six", "aaru", R.drawable.number_six, R.raw.number_six));
//        numberWords.add("Five");
//        numberWords.add("Six");
        WordAdapter wordAdapter = new WordAdapter(this, numberWords, R.color.category_numbers);
//        GridView girds = (GridView) findViewById(R.id.list_of_num);
//        girds.setAdapter(arrayAdapter);
        ListView lists = (ListView) findViewById(R.id.list);
        lists.setAdapter(wordAdapter);
        lists.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Word word = numberWords.get(i);
                mediaPlayer = MediaPlayer.create(NumbersActivity.this, word.getAudioID());
                mediaPlayer.start();
            }
        });
    }
}
//        LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);
//        int index = 0;
//        while(index<4)
//        {
//            TextView numberWord = new TextView(this);
//            numberWord.setText(numberWords.get(index));
//            rootView.addView(numberWord);
//            index++;
//        }




