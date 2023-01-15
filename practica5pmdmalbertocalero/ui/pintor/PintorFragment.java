package com.example.practica5pmdmalbertocalero.ui.pintor;

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
import com.example.practica5pmdmalbertocalero.databinding.FragmentPintorBinding;

public class PintorFragment extends Fragment {

    private PintorViewModel pintorViewModel ;
    private FragmentPintorBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        pintorViewModel = new ViewModelProvider(this).get(PintorViewModel.class);
        binding = FragmentPintorBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textoPintor;
        pintorViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(R.string.texto_pintor);
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