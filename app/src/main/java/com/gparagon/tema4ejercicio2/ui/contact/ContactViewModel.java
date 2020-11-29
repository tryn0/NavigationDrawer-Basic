package com.gparagon.tema4ejercicio2.ui.contact;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ContactViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    // Contenido del view (TextView)
    public ContactViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is contact fragment");
    }

    // metodo para obtener el texto del TextView
    public LiveData<String> getText() {
        return mText;
    }
}