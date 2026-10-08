package com.example.gridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    private Context context;
    private int[] images;

    public ImageAdapter(MainActivity context, int[] images) {

        this.context = context;
        this.images = images;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(
            int position,
            View convertView,
            ViewGroup parent) {

        ImageView imageView;

        if (convertView == null) {

            imageView = new ImageView(context);

            imageView.setLayoutParams(
                    new GridView.LayoutParams(200, 200)
            );

            imageView.setScaleType(
                    ImageView.ScaleType.CENTER_CROP
            );

            imageView.setPadding(5, 5, 5, 5);

        } else {

            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(images[position]);

        return imageView;
    }
}