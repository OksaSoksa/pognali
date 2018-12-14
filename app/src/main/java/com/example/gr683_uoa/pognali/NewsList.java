package com.example.gr683_uoa.pognali;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class NewsList extends ArrayAdapter<News> {
    private Activity context;
    private List<News> newsList;
    Date date  = new Date();
    Long dateLong;

    public NewsList(Activity context,List<News> newsList) {
        super(context, R.layout.custom_news,newsList);
        this.context = context;
        this.newsList = newsList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.custom_news,null,true);
        TextView zagolovok = listViewItem.findViewById(R.id.name);
        TextView novost = listViewItem.findViewById(R.id.novost);
        TextView dateNews = listViewItem.findViewById(R.id.date);
        ImageView img = listViewItem.findViewById(R.id.img);
        News news = newsList.get(position);
        Glide.with(listViewItem).load(news.getImage()).into(img);
        zagolovok.setText(news.getName());
        novost.setText(news.getDescription());
        dateLong = news.getDate()*1000;
        date = new java.util.Date(dateLong);
        String dateTimeNews = new SimpleDateFormat("MM dd, yyyy, hh:mma").format(date);
        dateNews.setText(dateTimeNews);

        return listViewItem;
    }
}
