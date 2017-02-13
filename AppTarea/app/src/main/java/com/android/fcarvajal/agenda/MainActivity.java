package com.android.fcarvajal.agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

//        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);

        setTitle(R.string.titulo_agregar_contacto);
        setContentView(R.layout.activity_main);

        Button btnSiguiente = (Button) findViewById(R.id.siguiente);

        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ConfirmarActivity.class);

                TextView nombre_completo = (TextView)findViewById(R.id.nombre_completo);
                String nc = nombre_completo.getText().toString();
                intent.putExtra(getResources().getString(R.string.formulario_nombrecompleto), nc);

                DatePicker fecha_nacimiento = (DatePicker) findViewById(R.id.fecha_nacimiento);
                String f = fecha_nacimiento.getDayOfMonth() + "/" + fecha_nacimiento.getMonth() + "/" + fecha_nacimiento.getYear();
                intent.putExtra(getResources().getString(R.string.formulario_fechanacimiento), f);

                TextView telefono = (TextView)findViewById(R.id.telefono);
                String t = telefono.getText().toString();
                intent.putExtra(getResources().getString(R.string.formulario_telefono), t);

                TextView email = (TextView)findViewById(R.id.email);
                String e = email.getText().toString();
                intent.putExtra(getResources().getString(R.string.formulario_email), e);

                TextView descripcion = (TextView)findViewById(R.id.descripcion);
                String d = descripcion.getText().toString();
                intent.putExtra(getResources().getString(R.string.formulario_descripcioncontacto), d);

                startActivity(intent);
            }
        });


    }
}
