package com.example.guillermo.obligatorio;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);



        AlertDialog.Builder dialogo1 = new AlertDialog.Builder(this);
        dialogo1.setTitle("Advertencia");
        dialogo1.setMessage("Usted accedio como invitado, Desea Registrarse?");
        dialogo1.setCancelable(false);
        dialogo1.setPositiveButton("Si", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogo1, int id) {
                SI();
            }
        });
        dialogo1.setNegativeButton("No", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogo1, int id) {
                NO();
            }
        });
        dialogo1.show();
    }

    public void SI() {

        Intent RegistroIntent = new Intent(getApplicationContext(), Registro.class);
        startActivity(RegistroIntent); //inicio la actividad de mi intent explicito
    }

    public void NO(){
        Toast t = Toast .makeText(this, "Modo Observador.", Toast.LENGTH_SHORT);
        t.show();
    }

}






