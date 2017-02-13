package com.android.fcarvajal.agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);

        setTitle(R.string.titulo_agregar_contacto);
        setContentView(R.layout.activity_confirmar);

        Bundle parametros = getIntent().getExtras();

        //String nombre = parametros.getString(getResources().getString(R.string.formulario_nombrecompleto));
        //String fecha_nacimiento = parametros.getString(getResources().getString(R.string.formulario_fechanacimiento));
        //String telefono = parametros.getString(getResources().getString(R.string.formulario_telefono));
        //String email = parametros.getString(getResources().getString(R.string.formulario_email));
        //String descripcion = parametros.getString(getResources().getString(R.string.formulario_descripcioncontacto));

        TextView nombre_completo = (TextView) findViewById(R.id.cd_nombre_completo);
        nombre_completo.setText(parametros.getString(getResources().getString(R.string.formulario_nombrecompleto)));

        TextView fecha_nacimiento = (TextView) findViewById(R.id.cd_fecha_nacimiento);
        fecha_nacimiento.setText("Fecha nacimiento: " + parametros.getString(getResources().getString(R.string.formulario_fechanacimiento)));

        TextView telefono = (TextView) findViewById(R.id.cd_telefono);
        telefono.setText("Tel: " + parametros.getString(getResources().getString(R.string.formulario_telefono)));

        TextView email = (TextView) findViewById(R.id.cd_email);
        email.setText("Email: " + parametros.getString(getResources().getString(R.string.formulario_email)));

        TextView descripcion = (TextView) findViewById(R.id.cd_descripciondetalle);
        descripcion.setText(parametros.getString(getResources().getString(R.string.formulario_descripcioncontacto)));

        Button btnEditarDatos = (Button) findViewById(R.id.cd_editar_datos);

        btnEditarDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(ConfirmarInformacion.this, MainActivity.class);
//                startActivity(intent);

                finish();
            }
        });

    }

}
