package com.example.linearexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edt_uname,edt_pass;
    Button btn_sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_uname = findViewById(R.id.edt_uname);
        edt_pass = findViewById(R.id.edt_pass);


        btn_sub = findViewById(R.id.btn_submit);


        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String uname = edt_uname.getText().toString();
                String pass = edt_pass.getText().toString();


                Intent i  = new Intent(MainActivity.this,Dashboard.class);


                i.putExtra("un",uname);
                i.putExtra("ps",pass);

                startActivity(i);


            }
        });


    }
}
