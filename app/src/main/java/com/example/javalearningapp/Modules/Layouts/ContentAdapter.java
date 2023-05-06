package com.example.javalearningapp.Modules.Layouts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.javalearningapp.Modules.Content;
import com.example.javalearningapp.R;

import java.util.List;

public class ContentAdapter extends BaseAdapter {

    Context context;
    List<Content> contents;
    LayoutInflater inflater;

    public ContentAdapter(Context context, List<Content> contents) {
        this.contents= contents;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return contents.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = inflater.inflate(R.layout.content_row, null);
        TextView contentTitle = (TextView) convertView.findViewById(R.id.contentTitle);
        TextView content = (TextView) convertView.findViewById(R.id.courseContentItem);
        contentTitle.setText(contents.get(position).getTitle());
        content.setText(contents.get(position).getThisContent());
        return convertView;
    }
}
