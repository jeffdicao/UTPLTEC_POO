/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utpltec.registro_juego_utpl;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author jeffd
 */
public class TestClases {
    public static void main( String[] args )
    {
        Scanner scannerObj = new Scanner(System.in);
        String SaltoLinea;
        //variables para probar el registro de juego
        String sJuegoingresado;
        String sJugador;
        int nPuntaje;
        
        //variables para probar ingreso de jugador
        String nombre;
        String apellido;
        String nickname;
        String genero;
        int edad;        
        
        //variables para probar creacion de juegos
        String nombrejuego;
        String tipojuego;
        String dificultad;
        int nnivel;
        
        
        //probar clase registro de jugador
        System.out.println("-----------------------------------------" );
        System.out.println("PRUEBA DE CLASE CREACION DE JUEGO: " );
        System.out.println("-----------------------------------------" );
        
        System.out.println( "Ingrese el nombre del juego:" );
    	nombrejuego = scannerObj.nextLine();
    	
        System.out.println( "Ingrese el tipo de juego:" );
    	tipojuego = scannerObj.nextLine();
        
        System.out.println( "Ingrese la dificultad:" );
    	dificultad = scannerObj.nextLine();
        
        System.out.println( "Ingrese el nivel de la estrategia (numero entero):" );
    	nnivel = scannerObj.nextInt();
        SaltoLinea = scannerObj.nextLine();
        
        JuegoEstrategia objJuego1; //Instanciar la clase
        objJuego1 = new JuegoEstrategia(); //Inicializar la clase con el constructor sin parametros
        
        //setear valores leidos a las propiedades de la clase
        objJuego1.setNombreJuego(nombrejuego);
        objJuego1.setTipoJuego(tipojuego);
        objJuego1.setDificultad(dificultad);
        objJuego1.setNumeronivel(nnivel);
        
        //presentar valores seteados
        System.out.println("Valores registrados en el objeto: " );
        System.out.println("Nombre del Juego: " + objJuego1.getNombreJuego() + " Tipo de juego: " + objJuego1.getTipoJuego() + " Dificultad: " + objJuego1.getDificultad() + " Nivel: " + objJuego1.getNumeronivel());
        
        System.out.println(" " );
        System.out.println(" " );
                
        
 //probar clase registro de jugador
        System.out.println("-----------------------------------------" );
        System.out.println("PRUEBA DE CLASE REGISTRO DE JUGADOR: " );
        System.out.println("-----------------------------------------" );

        
        System.out.println( "Ingrese el nombre del jugador:" );
    	nombre = scannerObj.nextLine();
    	
        System.out.println( "Ingrese el apellido del jugador:" );
    	apellido = scannerObj.nextLine();
        
        System.out.println( "Ingrese el nickname:" );
    	nickname = scannerObj.nextLine();
        
        System.out.println( "Ingrese el genero del jugador:" );
    	genero = scannerObj.nextLine();
    	
        System.out.println( "Ingrese la edad del jugador (numero entero):" );
    	edad = scannerObj.nextInt();
        SaltoLinea = scannerObj.nextLine();
    	
        Jugador objJugador1; //Instanciar la clase
        objJugador1 = new Jugador(); //Inicializar la clase con el constructor sin parametros
        
        //setear valores leidos a las propiedades de la clase
        objJugador1.setNombre(nombre);
        objJugador1.setApellido(apellido);
        objJugador1.setNickName(nickname);
        objJugador1.setGenero(genero);
        objJugador1.setEdad(edad);
        
        //presentar valores seteados
        System.out.println("Valores registrados en el primer objeto: " );
        System.out.println("Nombre: " + objJugador1.getNombre() + " Apellido: " + objJugador1.getApellido() + " NickName: " + objJugador1.getNickName() + " Edad: " + objJugador1.getEdad() + " Genero: " + objJugador1.getGenero()  );
                
        
        System.out.println(" " );
        System.out.println(" " );        
        
        //probar clase registro de juego
        System.out.println("-----------------------------------------" );
        System.out.println("PRUEBA DE CLASE REGISTRO DE JUEGO: " );
        System.out.println("-----------------------------------------" );
        
        
        System.out.println("Ingrese el nick del jugador: " );
        sJugador = scannerObj.nextLine();
        System.out.println("Ingrese el nombre del juego a registrar: " );
        sJuegoingresado = scannerObj.nextLine();
        System.out.println("Ingrese el puntaje (numero entero): " );
        nPuntaje = scannerObj.nextInt();
        SaltoLinea = scannerObj.nextLine();
        
    	Date hoy = new Date();
        RegistroJuego objRegistro1; //Instanciar la clase
        objRegistro1 = new RegistroJuego(); //Inicializar la clase con el constructor sin parametros
        
        //setear valores leidos a las propiedades de la clase
        objRegistro1.setFecha(hoy);
        objRegistro1.setJuego(sJuegoingresado);
        objRegistro1.setJugador(sJugador);
        objRegistro1.setPuntaje(nPuntaje);
        
        //presentar valores seteados
        System.out.println("Valores registrados en el primer objeto: " );
        System.out.println("Fecha: " + objRegistro1.getFecha() + " Jugador: " + objRegistro1.getJugador() + " Juego: " + objRegistro1.getJuego() + " Puntaje: " + objRegistro1.getPuntaje());
        
        System.out.println(" " );
        System.out.println(" " );

       


        System.out.println( "Fin" );
    }    
}
