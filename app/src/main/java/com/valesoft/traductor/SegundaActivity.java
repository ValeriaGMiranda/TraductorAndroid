package com.valesoft.traductor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import com.valesoft.traductor.databinding.ActivitySegundaBinding;
import com.valesoft.traductor.modelo.Palabra;

public class SegundaActivity extends AppCompatActivity {
    private SegundaActivityViewModel mv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySegundaBinding binding = ActivitySegundaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = getIntent();
        String pal = (String)intent.getStringExtra("palabraEnviada");
        mv = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(SegundaActivityViewModel.class);// genera la instancia del View Model.
        mv.getPalabraM().observe(this, new Observer<Palabra>() {
            @Override
            public void onChanged(Palabra palabra) {
                binding.etPalabraTraducida.setText(palabra.getPalabraTrad());
                binding.imgPalabra.setImageResource(palabra.getFoto());
            }
        });
        mv.resultadoTraduccion(pal);


    }
}