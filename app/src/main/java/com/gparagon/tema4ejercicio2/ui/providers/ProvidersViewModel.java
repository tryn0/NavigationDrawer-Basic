package com.gparagon.tema4ejercicio2.ui.providers;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProvidersViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ProvidersViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is providers fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
