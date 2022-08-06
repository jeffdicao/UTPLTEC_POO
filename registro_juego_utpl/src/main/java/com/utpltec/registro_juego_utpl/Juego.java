package com.utpltec.registro_juego_utpl;


public class Juego
{
    private String nombre_juego;
    private String tipo;
    private String dificultad;

    //constructores
    public Juego()
    {
        //System.out.println( "Prueba de llamada a constructor sin parametros !" );
    }
    
    public Juego(String nombre_juego, String tipo, String dificultad)
    {
        this.nombre_juego = nombre_juego;
        this.tipo = tipo;
        this.dificultad = dificultad;
        //System.out.println( "Llamada a constructor con parametros de inicializacion !" );
    }
    
    //setters and getters
    //nombre del juego
    public void setNombreJuego(String nombre_juego)
    {
        this.nombre_juego = nombre_juego;
    }
    
    public String getNombreJuego()
    {
        return this.nombre_juego;
    }
    
    //tipo de juego
    public void setTipoJuego(String tipo)
    {
        this.tipo = tipo;
    }
    
    public String getTipoJuego()
    {
        return this.tipo;
    }
    
    //dificultad
    public void setDificultad(String dificultad)
    {
        this.dificultad = dificultad;
    }
    
    public String getDificultad()
    {
        return this.dificultad;
    }   
    
}
    