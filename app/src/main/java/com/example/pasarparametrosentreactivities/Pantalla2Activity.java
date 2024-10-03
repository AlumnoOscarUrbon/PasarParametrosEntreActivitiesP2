package com.example.pasarparametrosentreactivities;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.pasarparametrosentreactivities.beans.Usuario;
import com.example.pasarparametrosentreactivities.datos.ExampleData;

public class Pantalla2Activity extends AppCompatActivity {
private TextView txtUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        txtUser = (TextView) findViewById( R.id.txtUser2);

        //Bundle variables = getIntent().getExtras();
        //Usuario usuario = (Usuario)variables.getSerializable("USUARIO");

        txtUser.setText(ExampleData.getUsuario().getEmail());
    }
}