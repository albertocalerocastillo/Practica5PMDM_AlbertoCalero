package com.example.practica5pmdmalbertocalero.ui.escultor;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EscultorViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public EscultorViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is escultor fragment");
    }
    public LiveData<String> getText() {
        return mText;
    }
}