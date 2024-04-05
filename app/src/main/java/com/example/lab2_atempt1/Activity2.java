package com.example.lab2_atempt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.lab2_atempt1.databinding.Activity1Binding;
import com.example.lab2_atempt1.databinding.Activity2Binding;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
public class Activity2 extends AppCompatActivity {

    private Activity2Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = Activity2Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        EventBus.getDefault().register(this);
        binding.button6.setOnClickListener(this::bckButton2);
    }
    @Subscribe
        public void doThis(Bus bus){
        binding.textView3.setText(bus.text);
    }
    public void bckButton2(View view){
        Intent intent = new Intent(Activity2.this,MainActivity.class);

        startActivity(intent);
    }
}