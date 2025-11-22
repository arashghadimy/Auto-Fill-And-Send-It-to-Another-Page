package com.example.auto_fillin_class_poject;
/*import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class ResultActivity extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState){
        super .onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_main);


        TextView txtName = findViewById(R.id.txtName);
        TextView txtFamily = findViewById(R.id.txtFamily);
        TextView txt = new TextView(this);
        txt.setTextSize(24);
        String name = getIntent().getStringExtra("name");
        String family = getIntent().getStringExtra("family");
        txt.setText("name: "+name+ "\nfamily:" +family);
    }
}*/
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_main);  // فقط همین!

        TextView txtName = findViewById(R.id.txtName);
        TextView txtFamily = findViewById(R.id.txtFamily);

        String name = getIntent().getStringExtra("name");
        String family = getIntent().getStringExtra("family");

        txtName.setText("Name: " + name);
        txtFamily.setText("Family: " + family);
    }
}