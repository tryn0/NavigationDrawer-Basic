package com.gparagon.tema4ejercicio2.ui.providers;

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

public class ProvidersFragment extends Fragment {

    private ProvidersViewModel providersViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        providersViewModel = new ViewModelProvider(this).get(ProvidersViewModel.class);
        View root = inflater.inflate(R.layout.fragment_providers, container, false);
        final TextView textView = root.findViewById(R.id.text_providers);
        providersViewModel.getText().observe(getViewLifecycleOwner(), s -> textView.setText(s));
        return root;
    }
}
