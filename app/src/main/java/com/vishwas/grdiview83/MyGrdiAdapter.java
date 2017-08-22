package com.vishwas.grdiview83;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.vishwas.grdiview83.R;

/**
 * Created by Vishwas on 7/23/2017.
 * created a MyGrdiAdapter class by extending BaseAdapter in it.
 */

public class MyGrdiAdapter extends BaseAdapter{
    //declaring variable
    Context context;
    View view;
    private final String[]versionName;
    private final Integer[]VersionImages;
    LayoutInflater layoutInflater;

    //creating constructor
    public MyGrdiAdapter(Context context, String[] version, Integer[] images) {
        this.context = context;
        this.versionName = version;
        this.VersionImages = images;
    }

    @Override
    public int getCount() {
        return versionName.length;
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
        layoutInflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        if(convertView==null){
            view=new View (context);
            view = layoutInflater.inflate(R.layout.view,null);// inflate the layout
            // get the reference of ImageView and testView
            ImageView imageView=(ImageView)view.findViewById(R.id.versionImages);
            TextView textView=(TextView)view.findViewById(R.id.versionName);
            imageView.setImageResource(VersionImages[position]);//set logo images
            textView.setText(versionName[position]);

        }
        return view;
    }
}
