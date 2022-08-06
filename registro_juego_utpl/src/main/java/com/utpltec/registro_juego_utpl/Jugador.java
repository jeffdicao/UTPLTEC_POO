package com.utpltec.registro_juego_utpl;

public class Jugador
{
    private String nombre;
    private String apellido;
    private String nickname;
    private int edad;
    private String genero; //masculino o femenino
    
    //constructores
    public Jugador()
    {
        //System.out.println( "Prueba de llamada a constructor sin parametros !" );
    }
    
    public Jugador(String nombre, String apellido, String nickname, int edad, String genero)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nickname = nickname;
        this.edad = edad;
        this.genero = genero;
        //System.out.println( "Llamada a constructor con parametros de inicializacion !" );
    }
    
    //setters and getters
    //nombre
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    //apellido
    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }
    
    public String getApellido()
    {
        return this.apellido;
    }
    
    //nick
    public void setNickName(String nickname)
    {
        this.nickname = nickname;
    }
    
    public String getNickName()
    {
        return this.nickname;
    }    
    
    //edad
    public void setEdad(int edad)
    {
        this.edad = edad;
    }
    
    public int getEdad()
    {
        return this.edad;
    }  
    
    //genero
    public void setGenero(String genero)
    {
        this.genero = genero;
    }
    
    public String getGenero()
    {
        return this.genero;
    } 
    
}
    