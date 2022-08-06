/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utpltec.registro_juego_utpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author jeffd
 */
public class PrincipalJuego {
    public static void main( String[] args )
    {
        String cOpcion;
        String SaltoLinea;
        Scanner scannerObj = new Scanner(System.in);
        //coleccion para almacenar jugadores
        ArrayList<Jugador> colJugador = new ArrayList<>();
        //coleccion para almacenar juegos de estrategia
        ArrayList<JuegoEstrategia> colJuego = new ArrayList<>();
        //coleccion para almacenar registros de juegos
        ArrayList<RegistroJuego> colRegistroJuego = new ArrayList<>();
        //variable de control para while de menu principal
        int opcion = -1;
        
        while (opcion != 0)
        {
            System.out.println( "----------------------------" );
            System.out.println( "------ MENU PRINCIPAL ------" );
            System.out.println( "----------------------------" );
            System.out.println( " " );
            System.out.println( "1.- Agregar Jugador" );
            System.out.println( "2.- Agregar Juego Nuevo" );
            System.out.println( "3.- Registrar Juego" );
            System.out.println( "4.- Listar Jugadores" );
            System.out.println( "5.- Listar Registros de Juegos Ingresados" );
            System.out.println( "6.- Buscar Registro de Jugador" );
            System.out.println( "7.- Eliminar Jugador" );
            System.out.println( "0.- Salir" );
            System.out.println( " " );
            cOpcion = scannerObj.nextLine();
            
            if (cOpcion.matches("[0-7]*"))
            {
                opcion = Integer.parseInt(cOpcion);
                //opcion = scannerObj.nextInt();
                 //SaltoLinea = scannerObj.nextLine();
                //opcion agregar jugador
                if (opcion == 1)
                {
                    Jugador objJugadorTmp = IngresaJugador();
                    colJugador.add(objJugadorTmp);
                }
                //opcion agregar juego nuevo
                if (opcion == 2)
                {
                    JuegoEstrategia objJuego = IngresaJuegoEstrategia();
                    colJuego.add(objJuego);
                }            
                //opcion registrar juego
                if (opcion == 3)
                {
                    RegistroJuego objRegistro = RegistraJuego();
                    colRegistroJuego.add(objRegistro);
                }
                //listar jugadores ingresados
                if (opcion == 4)
                {
                    System.out.println( "** Jugadores Ingresados **" );
                    for (int i = 0; i < colJugador.size(); i++)
                    {
                        System.out.println("Nombre: " + colJugador.get(i).getNombre() + " Apellido: " + colJugador.get(i).getApellido() + " NickName: " + colJugador.get(i).getNickName() + " Edad: " + colJugador.get(i).getEdad() + " Genero: " + colJugador.get(i).getGenero()  );
                    }
                    System.out.println( " " );
                }
                //listar juegos registrados
                if (opcion == 5)
                {
                    System.out.println( "** Registros Ingresados **" );
                    for (int i = 0; i < colRegistroJuego.size(); i++)
                    {
                        System.out.println("Fecha: " + colRegistroJuego.get(i).getFecha() + " Jugador: " + colRegistroJuego.get(i).getJugador() + " Juego: " + colRegistroJuego.get(i).getJuego() + " Puntaje: " + colRegistroJuego.get(i).getPuntaje());
                    }
                    System.out.println( " " );
                }
                //buscar rgistro de jugador por nickname
                if (opcion == 6)
                {
                    BuscaJugador(colRegistroJuego);
                    System.out.println( " " );
                }
                //eliminar un jugador
                if (opcion == 7)
                {
                    Scanner scan = new Scanner(System.in);
                    String nickname;
                    int contador = 0;

                    System.out.println( " " );
                    System.out.println( "Ingrese el NickName del jugador a eliminar: " );
                    nickname = scan.nextLine();
                    System.out.println( " " );
                    System.out.println( "** Eliminando jugador **" );
                    for (int i = 0; i < colJugador.size(); i++)
                    {
                        if (colJugador.get(i).getNickName().equals(nickname))
                        {
                            contador++;
                            System.out.println("ELIMINANDO JUGADOR  --> Nombre: " + colJugador.get(i).getNombre() + " Apellido: " + colJugador.get(i).getApellido() + " NickName: " + colJugador.get(i).getNickName() + " Edad: " + colJugador.get(i).getEdad() + " Genero: " + colJugador.get(i).getGenero()  );
                            colJugador.remove(i);
                        }
                    }
                    if (contador == 0)
                    {
                          System.out.println( "No se encontro ningun jugador con el nickname ingresado. " );      
                    }
                    System.out.println( " " );
                }
            }
            else
            {
                System.out.println( "La opcion ingresada es incorrecta !!! " ); 
            }
            
        }
      
    }
    //buscar registros de juegos psra un jugador
    public static void BuscaJugador(ArrayList<RegistroJuego> coleccionRegistros)
    {
        Scanner scannerObj = new Scanner(System.in);
        String nickname;
        int contador = 0;
        
        System.out.println( "***** Busqueda de registros de jugadores *****" );
        System.out.println( " " );
        System.out.println( "Ingrese el NickName del jugador para buscar sus registros: " );
        nickname = scannerObj.nextLine();
        System.out.println( " " );
        System.out.println( "Registros encontrados: " );
        for (int i = 0; i < coleccionRegistros.size(); i++)
        {
            if (coleccionRegistros.get(i).getJugador().equals(nickname))
            {
                contador++;
                System.out.println("Fecha: " + coleccionRegistros.get(i).getFecha() + " Jugador: " + coleccionRegistros.get(i).getJugador() + " Juego: " + coleccionRegistros.get(i).getJuego() + " Puntaje: " + coleccionRegistros.get(i).getPuntaje());
            }
            System.out.println( " " );
        }
        if (contador == 0)
        {
              System.out.println( "No se encontro ningun registro para el nickname del jugador ingresado. " );      
        }
    }
    //funcion que devuleve un objeto tipo registro de juego con sus datos ingresados por pantalla
    public static RegistroJuego RegistraJuego()
    {
        String sJuegoingresado;
        String sJugador;
        int nPuntaje;
        String SaltoLinea;
        Scanner scannerObj = new Scanner(System.in);
        
        System.out.println( "***** Ingreso de jugadores *****" );
        System.out.println( " " );
        
        System.out.println("Ingrese el nick del jugador: " );
        sJugador = scannerObj.nextLine();
        System.out.println("Ingrese el nombre del juego a registrar: " );
        sJuegoingresado = scannerObj.nextLine();
        System.out.println("Ingrese el puntaje: " );
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
        
        return objRegistro1;
    }
    
    //funcion que devuleve un objeto tipo juego con sus datos ingresados por pantalla
    public static JuegoEstrategia IngresaJuegoEstrategia()
    {
        String SaltoLinea;
        Scanner scannerObj = new Scanner(System.in);
        String nombrejuego;
        String tipojuego;
        String dificultad;
        int nnivel;
        
        System.out.println( "***** Ingreso de Juego *****" );
        System.out.println( " " );
        
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
        
        return objJuego1;
    }
    //funcion que devuleve un objeto tipo jugador con sus datos ingresados por pantalla
    public static Jugador IngresaJugador()
    {
        String nombre;
        String apellido;
        String nickname;
        String genero;
        int edad;
        String SaltoLinea;
        Scanner scannerObj = new Scanner(System.in);
        
        System.out.println( "***** Ingreso de jugadores *****" );
        System.out.println( " " );
        
        System.out.println( "Ingrese el nombre del jugador:" );
    	nombre = scannerObj.nextLine();
    	
        System.out.println( "Ingrese el apellido del jugador:" );
    	apellido = scannerObj.nextLine();
        
        System.out.println( "Ingrese el nickname:" );
    	nickname = scannerObj.nextLine();
        
        System.out.println( "Ingrese el genero del jugador:" );
    	genero = scannerObj.nextLine();
    	
        System.out.println( "Ingrese la edad del jugador:" );
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
        return objJugador1;
    }
}
