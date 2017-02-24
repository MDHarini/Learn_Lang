package com.example.android.miwok;

import android.app.Activity;
import android.opengl.Visibility;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Context;

import java.util.ArrayList;

/**
 * Created by Vivek on 2/11/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorID;
    public WordAdapter(Context context, ArrayList<Word> words, int colorID){
        super(context,0,words);
        mColorID=colorID;
    }

        @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_items,parent,false);
        }
        Word list = getItem(position);
        TextView kan = (TextView) listItemView.findViewById(R.id.kan);
        kan.setText(list.getMiwokTranslatedWord());
        TextView eng = (TextView) listItemView.findViewById(R.id.english);
        eng.setText(list.getDefaultTranslateWord());
        ImageView img = (ImageView) listItemView.findViewById(R.id.image);
        if(list.getResourceID()!=-1)
        {
            img.setImageResource(list.getResourceID());
            img.setVisibility(View.VISIBLE);
        }
        else {
             img.setVisibility(View.GONE);
        }
            View textContainer = listItemView.findViewById(R.id.Text_container);
            int color = ContextCompat.getColor(getContext(), mColorID);
            textContainer.setBackgroundColor(color);
        return listItemView;
    }
}
