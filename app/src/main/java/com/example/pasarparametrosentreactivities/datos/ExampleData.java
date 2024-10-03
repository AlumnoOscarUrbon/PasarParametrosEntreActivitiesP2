package com.example.pasarparametrosentreactivities.datos;

import com.example.pasarparametrosentreactivities.beans.Usuario;

import java.util.ArrayList;

public class ExampleData {

    private static Usuario usuario;
    private static ArrayList<Usuario>  listaUsuarios;
     public static Usuario getUsuario() {
        return usuario;
    }
     public static void setUsuario(Usuario usuario) {
        ExampleData.usuario = usuario;
    }
}
