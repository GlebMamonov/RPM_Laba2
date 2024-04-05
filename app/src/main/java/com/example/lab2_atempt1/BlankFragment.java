package com.example.lab2_atempt1;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lab2_atempt1.databinding.FragmentBlankBinding;
import com.example.lab2_atempt1.databinding.FragmentInnerInterfaceBinding;
import org.greenrobot.eventbus.EventBus;
public class BlankFragment extends Fragment {

    private FragmentBlankBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBlankBinding.inflate(getLayoutInflater());
        View v = binding.getRoot();
        binding.button3.setOnClickListener(this::Button1);
        return v;
    }

    public void Button1(View view){
        EventBus.getDefault().post(new Bus(binding.textInputEditText.getText().toString()));
    }
}