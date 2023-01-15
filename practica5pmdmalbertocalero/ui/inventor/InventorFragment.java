package com.example.practica5pmdmalbertocalero.ui.inventor;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.practica5pmdmalbertocalero.R;
import com.example.practica5pmdmalbertocalero.databinding.FragmentInventorBinding;

public class InventorFragment extends Fragment {

    private InventorViewModel inventorViewModel ;
    private FragmentInventorBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        inventorViewModel = new ViewModelProvider(this).get(InventorViewModel.class);
        binding = FragmentInventorBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textoInventor;
        inventorViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(R.string.texto_inventor);
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