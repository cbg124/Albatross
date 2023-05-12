package com.company.albatross;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class ListAdapter2 extends ArrayAdapter<String> {
    private Context mContext;

    public ListAdapter2(Context context, ArrayList<String> items) {
        super(context, 0, items);
        mContext = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = LayoutInflater.from(mContext).inflate(R.layout.item_layout2, parent, false);
        }

        String item = getItem(position);
        TextView textView = view.findViewById(R.id.item_textview2);
        textView.setText(item);

//        // 아이콘 설정
//        ImageView imageView = view.findViewById(R.id.item_icon);
//        imageView.setImageResource(R.drawable.icon_image);

        // 아이템의 배경색 변경

        view.setBackgroundColor(Color.parseColor("#FFE3EE"));


        return view;
    }
}
