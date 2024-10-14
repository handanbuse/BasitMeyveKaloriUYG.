package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


public class meyveAdapter extends ArrayAdapter<String>
{
    private String[] meyveler;
    private int[] kaloriler;
    private int[] resimler;
    private Context context;
    private TextView meyveİsmi, MeyveKalori;
    private ImageView imagemeyve;

    public meyveAdapter(String[] meyveler, int[]kaloriler,int[] resimler,Context context){
        super(context,R.layout.meyve_item,meyveler);
        this.meyveler=meyveler;
        this.kaloriler=kaloriler;
        this.resimler=resimler;
        this.context=context;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view= LayoutInflater.from(context).inflate(R.layout.meyve_item,null);

        // burada bağlama işini yap.
     if (view !=null){
            meyveİsmi=view.findViewById(R.id.meyve_item_Meyveİsmi);
            MeyveKalori=view.findViewById(R.id.meyve_item_Meyvekalori);
            imagemeyve=view.findViewById(R.id.meyve_item_imageviewResim);

            meyveİsmi.setText(meyveler[position]);
            MeyveKalori.setText(String.valueOf(kaloriler[position]));
            imagemeyve.setBackgroundResource(resimler[position]);




        }




        return  view;


    }
}
