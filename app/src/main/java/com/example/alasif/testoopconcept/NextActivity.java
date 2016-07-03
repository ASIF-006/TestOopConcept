package com.example.alasif.testoopconcept;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    TextView nameT, descriptionT;
    Button btnPre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        nameT = (TextView) findViewById(R.id.nameTextView);
        descriptionT = (TextView) findViewById(R.id.descriptionTextView);
        btnPre = (Button) findViewById(R.id.btnPreviousButton);

        String nam = getIntent().getStringExtra("name");
        String desc = getIntent().getStringExtra("desc");

        nameT.setText(nam);
        descriptionT.setText(desc);
    }


    public void prev(View view) {

        Intent intent = new Intent(NextActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
