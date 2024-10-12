package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText editHobbies;
    private Button btnhobbies;
    private TextView txthobbies;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        editHobbies=findViewById(R.id.editHobbies);
        btnhobbies=findViewById(R.id.btnhobbies);
        txthobbies=findViewById(R.id.txthobbies);

        btnhobbies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=editHobbies.getText().toString();
                if (str.isEmpty()){
                    Toast.makeText(MainActivity.this,"Error:Text is Empty",Toast.LENGTH_SHORT).show();
                }else{
                    txthobbies.setText(str);
                    txthobbies.setVisibility(View.VISIBLE);
                }
            }
        });



    }
}