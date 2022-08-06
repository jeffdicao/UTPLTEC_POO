package com.utpltec.registro_juego_utpl;

import java.util.Date;

public class RegistroJuego
{
    private Date fecha;
    private String jugador;
    private String juego;
    private int puntaje;

    //constructores
    public RegistroJuego()
    {
        //System.out.println( "Prueba de llamada a constructor sin parametros !" );
    }
    
    public RegistroJuego(Date fecha, String jugador, String juego, int puntaje)
    {
        this.fecha = fecha;
        this.jugador = jugador;
        this.juego = juego;
        this.puntaje = puntaje;
        //System.out.println( "Llamada a constructor con parametros de inicializacion !" );
    }
    
    //setters and getters
    //fecha del juego
    public void setFecha(Date fecha)
    {
        this.fecha = fecha;
    }
    
    public Date getFecha()
    {
        return this.fecha;
    }
    
    //nombre del jugador
    public void setJugador(String jugador)
    {
        this.jugador = jugador;
    }
    
    public String getJugador()
    {
        return this.jugador;
    }
    
    //juego
    public void setJuego(String juego)
    {
        this.juego = juego;
    }
    
    public String getJuego()
    {
        return this.juego;
    }    
    
    //puntaje
    public void setPuntaje(int puntaje)
    {
        this.puntaje = puntaje;
    }
    
    public int getPuntaje()
    {
        return this.puntaje;
    }  
    
    
    
    
    
}
    