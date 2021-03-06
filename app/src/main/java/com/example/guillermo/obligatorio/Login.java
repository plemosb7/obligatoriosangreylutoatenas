package com.example.guillermo.obligatorio;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Login extends AppCompatActivity {

    Button btncrearusuario;
    Button btnentrar;
    TextView txtAccederInvitado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btncrearusuario = (Button) findViewById(R.id.crearcuenta); //Asocio la vista de Registro al boton crear usuario
        btnentrar = (Button) findViewById(R.id.entrar);
        txtAccederInvitado = (TextView) findViewById(R.id.invitado); //Asocio la vista al registro de txt

        btncrearusuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                starActivityRegistro();
            }
        });

        btnentrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                starActivityPrincipal();
            }
        });
        txtAccederInvitado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                starActivityPrincipal();

            }
        });
    }
    private void starActivityRegistro() {
        Intent RegistroIntent = new Intent(getApplicationContext(), Registro.class); //defino el intent
        startActivity(RegistroIntent); //inicio la actividad con mi intent explicito
    }

    private void starActivityEmpresa() {
        Intent EmpresaIntent = new Intent(getApplicationContext(), Registro.class); //defino el intent
        startActivity(EmpresaIntent); //inicio la actividad con mi intent explicito
    }

    private void starActivityPrincipal() {

        Intent PrincipalIntent = new Intent(getApplicationContext(), Principal.class);
        startActivity(PrincipalIntent); //inicio la actividad de mi intent explicito
    }



}




