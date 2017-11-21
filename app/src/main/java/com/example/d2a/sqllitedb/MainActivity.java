package com.example.d2a.sqllitedb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name,college;
    MyCoreDb myData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText)findViewById(R.id.edit1);
        college = (EditText)findViewById(R.id.edit2);
        myData = new MyCoreDb(this);
    }

    public void save(View view) {
        myData.InsertData(name.getText().toString(),college.getText().toString());
    }

    public void load(View view) {
        myData.getAll();
    }
}
