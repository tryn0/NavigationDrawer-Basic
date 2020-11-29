package com.gparagon.tema4ejercicio2.ui.contact;

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

public class ContactFragment extends Fragment {

    private ContactViewModel contactViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        contactViewModel = new ViewModelProvider(this).get(ContactViewModel.class); // Setea el view
        View root = inflater.inflate(R.layout.fragment_contact, container, false); // infla el layout
        final TextView textView = root.findViewById(R.id.text_contact); // Obtiene el textview
        contactViewModel.getText().observe(getViewLifecycleOwner(), s -> textView.setText(s)); // Cambio de texto
        return root;
    }
}