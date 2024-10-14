package com.example.myapplication;

import android.os.Bundle;
import android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private ListView mlistview;
    private String[] meyveler={"muz" ,"elma", "kiraz","çilek"};
    private int[] kaloriler={88,52,50,32};
    private  int [] resimler={R.drawable.muz,R.drawable.elma,R.drawable.kiraz,R.drawable.cilek};
    private meyveAdapter adapter; // adapter tanımla
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mlistview=findViewById(R.id.main_activity_listview);
        adapter= new meyveAdapter(meyveler,kaloriler,resimler,this);
        mlistview.setAdapter(adapter);

        mlistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),meyveler[position],Toast.LENGTH_SHORT).show();
            }
        });



    }
}