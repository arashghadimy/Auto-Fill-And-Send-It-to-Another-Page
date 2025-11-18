package com.example.auto_fillin_class_poject;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class ResultActivity extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState){
        super .onCreate(savedInstanceState);
        TextView txt = new TextView(this);
        txt.setTextSize(24);
        String name = getIntent().getStringExtra("name");
        String family = getIntent().getStringExtra("family");
        txt.setText("name: "+name+ "\nfamily:" +family);

        setContentView(txt);
    }
}