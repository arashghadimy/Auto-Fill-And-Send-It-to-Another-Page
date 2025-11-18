package com.example.auto_fillin_class_poject;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity  extends  AppCompatActivity{
        EditText nameBox, familyBox;
        Button submitBtn;
        protected void  onCreate(Bundle savedInstanceState){
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);


                nameBox = findViewById(R.id.nameBox);
                familyBox = findViewById(R.id.familyBox);
                submitBtn = findViewById(R.id.submitBtn);


                new Handler().postDelayed(() -> nameBox.setText("Arash"), 3000);
                new Handler().postDelayed(() -> familyBox.setText("Ghadimy"), 5000);
                new Handler().postDelayed(() -> {
                        Intent i =new Intent(MainActivity.this, ResultActivity.class);
                        i.putExtra("name", nameBox.getText().toString());
                        i.putExtra("family" , familyBox.getText().toString());
                        startActivity(i);
                } ,7000);
                submitBtn.setOnClickListener(v -> {
                        Intent i = new Intent(MainActivity.this,ResultActivity.class);
                        i.putExtra("name", nameBox.getText().toString());
                        i.putExtra("family", familyBox.getText().toString());
                        startActivity(i);
                });

        }
}

