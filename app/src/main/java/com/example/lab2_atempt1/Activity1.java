package com.example.lab2_atempt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.lab2_atempt1.databinding.Activity1Binding;

import java.util.Date;

public class Activity1 extends AppCompatActivity {
    private Activity1Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = Activity1Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        binding.button5.setOnClickListener(this::bckButton1);
    }
    public void bckButton1(View view){
        Intent intent = new Intent(Activity1.this,MainActivity.class);
        intent.putExtra("text",binding.editText.getText().toString());
        startActivity(intent);

    }

}