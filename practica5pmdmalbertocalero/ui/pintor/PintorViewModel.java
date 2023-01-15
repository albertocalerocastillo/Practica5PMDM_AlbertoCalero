package com.example.practica5pmdmalbertocalero.ui.pintor;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PintorViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public PintorViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is pintor fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}