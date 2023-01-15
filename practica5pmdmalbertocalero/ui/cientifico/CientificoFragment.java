package com.example.practica5pmdmalbertocalero.ui.cientifico;

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
import com.example.practica5pmdmalbertocalero.databinding.FragmentCientificoBinding;

public class CientificoFragment extends Fragment {

    private CientificoViewModel cientificoViewModel ;
    private FragmentCientificoBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        cientificoViewModel = new ViewModelProvider(this).get(CientificoViewModel.class);
        binding = FragmentCientificoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textoCientifico;
        cientificoViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(R.string.texto_cientifico);
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