package com.gparagon.tema4ejercicio2.ui.food;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.gparagon.tema4ejercicio2.R;

public class FoodFragment extends Fragment {

    private FoodViewModel foodViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        foodViewModel = new ViewModelProvider(this).get(FoodViewModel.class);
        View root = inflater.inflate(R.layout.fragment_food, container, false);
        final TextView textView = root.findViewById(R.id.text_food);
        foodViewModel.getText().observe(getViewLifecycleOwner(), s -> textView.setText(s));
        return root;
    }
}