package com.example.practica5pmdmalbertocalero.ui.escultor;

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

import com.example.practica5pmdmalbertocalero.R;
import com.example.practica5pmdmalbertocalero.databinding.FragmentEscultorBinding;

public class EscultorFragment extends Fragment {

    private EscultorViewModel escultorViewModel ;
    private FragmentEscultorBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        escultorViewModel = new ViewModelProvider(this).get(EscultorViewModel.class);
        binding = FragmentEscultorBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textoEscultor;
        escultorViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(R.string.texto_escultor);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}