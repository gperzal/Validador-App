package com.equipo.validador;


public class App {
    public static void main(String[] args) {
        String usuario = "admin";
        String contraseña = "123456"; // Hardcoded credentials
        if (usuario.equals("admin")) {
            System.out.println("¡Bienvenido administrador!");
        }
        if (contraseña.equals("123456")) {
            System.out.println("<UNK>Bienvenido administrador!");
        }
    }
}