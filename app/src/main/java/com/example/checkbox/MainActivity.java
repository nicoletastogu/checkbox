package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCheckboxClicked(View view) {
        CheckBox checkBox = (CheckBox) view;
        TextView selection = findViewById(R.id.selection);
        if (checkBox.isChecked()) {
            selection.setText("Male");
            checkBox.setText("Female");
            selection.setTextColor(ResourcesCompat.getColor(getResources(), R.color.blue, null));
        } else {
            selection.setText("Female");
            checkBox.setText("Male");
            selection.setTextColor(ResourcesCompat.getColor(getResources(), R.color.red, null));
        }
    }
}