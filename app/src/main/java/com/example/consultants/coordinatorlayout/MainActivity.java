package com.example.consultants.coordinatorlayout;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.lib.MyClass;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private MyClass myClass;
    private ArrayList<String> list;
    private ListView listView;
    private FloatingActionButton mFab;
    private CoordinatorLayout mCoordinatorLayout;
    private CollapsingToolbarLayout collapsingToolbarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        collapsingToolbarLayout = findViewById(R.id.collapsing_toolbar);
        collapsingToolbarLayout.setTitle("List Of Elements");

        mCoordinatorLayout = findViewById(R.id.main_content);

        mFab = findViewById(R.id.fab);
        mFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(mCoordinatorLayout,
                        "Snack Bar", Snackbar.LENGTH_LONG)
                        .setAction("CLOSE", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                            }
                        }).show();
            }
        });

        myClass = new MyClass();
        list = myClass.createList(100);

        MyListViewAdapter adapter = new MyListViewAdapter(this, list);

        listView = findViewById(R.id.listViewID);
        listView.setAdapter(adapter);
    }
}
