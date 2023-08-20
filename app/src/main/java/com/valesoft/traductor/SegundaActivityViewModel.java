package com.valesoft.traductor;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.valesoft.traductor.modelo.Palabra;

public class SegundaActivityViewModel extends AndroidViewModel {
    private Context context;
    private MutableLiveData <Palabra> palabraM;
    public SegundaActivityViewModel(@NonNull Application application) {
        super(application);
        context = application.getApplicationContext();

    }

    public LiveData<Palabra> getPalabraM(){
        if(palabraM == null){
            palabraM = new MutableLiveData<Palabra>();
        }
        return palabraM;

    }
    public void resultadoTraduccion(String pal){
        if(pal.equalsIgnoreCase("Leon")){
            Palabra palabra1 = new Palabra("Leon", "Lion",R.drawable.leon);
            palabraM.setValue(palabra1);
        }
         if(pal.equalsIgnoreCase("Perro")){
            Palabra palabra2 = new Palabra("Perro","Dog",R.drawable.perro);
            palabraM.setValue(palabra2);
         }

        if(pal.equalsIgnoreCase("Gato")){
            Palabra palabra3 = new Palabra("Gato", "Cat",R.drawable.gato);
            palabraM.setValue(palabra3);
        }

    }



}
