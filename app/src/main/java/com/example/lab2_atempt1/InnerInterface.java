package com.example.lab2_atempt1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.lab2_atempt1.databinding.ActivityMainBinding;
import com.example.lab2_atempt1.databinding.FragmentInnerInterfaceBinding;


public class InnerInterface extends Fragment {
    private Interface callback;
    public interface Interface
    {
        void activButton1(View view);
        void activButton2(View view);
    }

    private FragmentInnerInterfaceBinding binding;

    @Override
    public void onAttach(@NonNull Context Context) {
        super.onAttach(Context);
        try {
            callback = (Interface) Context;
        }
        catch (ClassCastException e) {
            throw new ClassCastException("err");
        }
    }

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentInnerInterfaceBinding.inflate(getLayoutInflater());
        View v = binding.getRoot();
        binding.button41.setOnClickListener(this::Button1);
        binding.button42.setOnClickListener(this::Button2);
        return v;
    }

    public void Button1(View view){
        callback.activButton1(view);
    }
    public void Button2(View view){
        callback.activButton2(view);
    }

}