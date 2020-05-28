package com.example.gridimagebrrrou;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context miContexto;
    public int[] arrayID={
            R.drawable.camping, R.drawable.granjero, R.drawable.guitarra, R.drawable.cumple, R.drawable.objetivo,
            R.drawable.palmera,R.drawable.a,R.drawable.b,R.drawable.c
    };

    public ImageAdapter(Context c){
        miContexto=c;
    }
    @Override
    public int getCount() {
        return arrayID.length;
    }

    @Override
    public Object getItem(int position) {
        return arrayID[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView=new ImageView(miContexto);
        imageView.setImageResource(arrayID[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(370,370));
        return imageView;
    }
}
