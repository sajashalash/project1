package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.print.PrinterInfo;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void swt1_onclik(View view) {
        String info = "";
        Switch swt = (Switch) view;
        if (swt.isChecked()) {
            info = "switch is on";}
        else {
            info = "switch is off";
        }

        PrinterInfo(info);
    }

    private void PrinterInfo(String info) {
        Toast.makeText(this,info, Toast.LENGTH_SHORT).show();
    }

}