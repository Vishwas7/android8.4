package com.vishwas.grdiview83;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // declaring variable
    GridView grdView;


    //creating array for version names
    String[] versionName = {"Gingerbread", "Honeycomb", "Ice Cream Sandwich", "Jelly Bean", "KitKat", "Lollipop"};
    //// Keeping all Images in array
    Integer[] VersionImages = {R.drawable.gingerbread, R.drawable.honeycomb,
                        R.drawable.ice_cream_sandwich,
                        R.drawable.jelly_bean, R.drawable.kitkat,R.drawable.lollipop};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grdView = (GridView) findViewById(R.id.GrdiView);
        //  // Create an object of MyGrdiAdapter and set Adapter to GirdView
        MyGrdiAdapter grildAdapter=new MyGrdiAdapter(this,versionName,VersionImages);
        grdView.setAdapter(grildAdapter);
        grdView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"version " +versionName[position],Toast.LENGTH_SHORT).show();
            }
        });

    }
}
