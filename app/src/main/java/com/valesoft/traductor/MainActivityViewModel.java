package com.valesoft.traductor;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class MainActivityViewModel extends AndroidViewModel {
private Context context;
    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        context = application.getApplicationContext();
    }

    public void traducirPalabra(String p){
        if(p.length()>0){
            if(p.equalsIgnoreCase("Leon")|| p.equalsIgnoreCase("Perro") || p.equalsIgnoreCase("Gato")){
                Intent intent = new Intent(context, SegundaActivity.class);
                intent.putExtra("palabraEnviada",p);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);

            } else{
                Toast.makeText(context,"Este traductor solo traduce Perro, Gato y Leon",Toast.LENGTH_LONG).show();

            }
        }else {
            Toast.makeText(context,"Ingrese una palabra",Toast.LENGTH_LONG).show();
        }

    }
}
