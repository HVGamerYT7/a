/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.a.A;
import Clases.*;
import java.util.Scanner;
//import java.util.Date;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

class Main {
  //variables globales

  public static Usuario persona;
  public static Meta metaLlegar;
  public static ArrayList<playlist> playlists;
  
  public static void main(String[] args) {
    if(verificarArchivo("datosPersona.txt") == false){

      //Agregar canciones 

      //canciones = new ArrayList<Canciones>();

      /*for(int i = 0; i< 5;i++)
      {
        Canciones canciones1 = new Canciones();
        canciones.add(canciones1);
      }*/

      //Agregar datos del usuario

      String nombre;
      Scanner leer = new Scanner(System.in);
      //FileWriter fw = new FileWriter(file);
      //PrintWriter pw = new PrintWriter(fw);
    
      int flag = 0;
    
      do{
          System.out.println("Insertar Nombre: ");
          nombre = leer.next(); 
          if(nombre.matches("[a-zA-Z].*"))
            flag = 1;
        else
          System.out.println("El nombre no se ingreso correctamente, se pusieron numeros o caracteres, por favor vuelva a ingresar el nombre.");
      }while(flag == 0);
    
      System.out.println("Insertar edad: ");
      int edad = leer.nextInt();

      System.out.println("Insertar peso: ");
      float peso = leer.nextFloat();
    
      System.out.println("Insertar altura: ");
      float altura = leer.nextFloat();
    
      //System.out.println("Insertar fecha de nacimiento: ");
      //Date fecha = new Date();

      persona = new Usuario(nombre, edad, peso, altura);
      String datos = nombre+";"+edad+";"+peso+";"+altura;
      guardarUsuario(datos,"datos/datosPersona.txt");
      persona.obtenerImc(peso, altura);
      double imc = persona.getImc();
      //pw.println(persona); //Guardar persona en archivo

      //pw.close();

      //Metas de usuario
      
      System.out.println("Ingresar IMC al que se quiere llegar: ");
      float imcDeseado = leer.nextFloat();
    

      System.out.println("Ingresar peso al que se quiere llegar: ");
      float pesoDeseado = leer.nextFloat();

      metaLlegar = new Meta(imcDeseado,pesoDeseado);
      datos = imcDeseado+";"+pesoDeseado;
      verificarArchivo("datos/metaPersona.txt");
      guardarUsuario(datos,"datos/metaPersona.txt");

/*               Crear la rutina del usuario            
    
        1.El usuario debe elegir opciones Switch opciones              
        ejemplo: 1 cuerpo completo, 2 pecho , 3 abdomen etc;
        cada ejerciocio tendra su tipo como para buscarlos
        2.El tiempo
        con el tiempo se hara un tiempo total y se restara con los tiempos de ejercicios hasta llegar a 0 o < 0 
        3.Seleccion de partes de cuerpo del 1 al 3
        los cuales se buscaran en un ciclo hasta igualar y agregar a la nueva lista de rutina creada}
*/
    }
    else{
      System.out.println("Iniciando Sesion...");
      iniciarSesion();
    }
    menu(persona);
    
  }


  public static void menu(Usuario persona){
    Scanner leer = new Scanner(System.in);
    int flag;
    int valid = 1;
    
    while(true){
      System.out.println("Seleccione una opcion");
      System.out.println("Opcion 1 : Agregar cancion a Playlist");
      System.out.println("Opcion 2 : Mostrar datos de usuario");
      System.out.println("Opcion 3 : Ver PlayList");
      System.out.println("Opcion 4 : Crear Playlist");
      System.out.println("Opcion 5 : Eliminar Datos Usuario");
      System.out.println("Opcion 6 : Eliminar Aplicacion");
 
      flag = leer.nextInt();
      
      //Agregar canciones.
      if(flag == 1)
      {
        int i = 1;
        int opcion = 0;
        String nombre = leer.next();
        if(nombre == null)
        {
          System.out.println("El nombre no es valido.");
          i = 0;
        }
        while(i != 0)
          {
            Canciones cancion = new Canciones();
            for(int  j = 0; j < playlists.size(); j++)
              {
                if(playlists.get(j).getNombre() == null ? nombre == null : playlists.get(j).getNombre().equals(nombre))
                {
                  playlists.get(j).canciones.add(cancion);
                  valid = 0;
                }
              }
            if(valid != 0)
            {
              System.out.println("No se pudo agregar la cancion ~w~ .");
            }
            
            if(valid == 0)
            {
              System.out.println("Se agrego la cancion correctamente! .");
              valid = 1;
            }

            System.out.println("Desea agregar otra cancion ?");
            System.out.println("opcion 1 : si");
            System.out.println("opcion 2 : no");

            opcion = leer.nextInt();
            if(opcion == 2)
              i = 0;
            if(opcion != 1 && opcion != 2)
            {
              System.out.println("la opcion ingresada no es valida, se dejaran de agregar canciones a la playlist.");
              i = 0;
            }

          }
      }
      
      if(flag == 2){
        System.out.println("El nombre del usuario es: " + persona.getNombre());
        if(persona.getEdad() > 0 && persona.getEdad() < 100){
          System.out.println("La edad del usuario es: " + persona.getEdad());
          System.out.println("El peso del usuario es: " + persona.getPeso());
          System.out.println("La altura del usuario es: " + persona.getAltura());
          System.out.println("El Imc del usuario es: " + persona.getImc());
        }
        else{
          System.out.println("La edad del usuario no se encuentra agregada");
          System.out.println("El peso del usuario es: " + persona.getPeso());
          System.out.println("La altura del usuario es: " + persona.getAltura());
          System.out.println("El Imc del usuario es: " + persona.getImc());
        }
        
        
      }
      
      if(flag == 3){
        int antonioFlag = 0;
        String nombre = leer.next();
        if(nombre == null)
        {
          System.out.println("El nombre no es valido.");
        }
        for(int i = 0 ; i < playlists.size() ; i++){
          if(playlists.get(i).getNombre() == null ? nombre == null : playlists.get(i).getNombre().equals(nombre)){
            antonioFlag = 1;
            for(int j = 0 ; j < playlists.get(i).canciones.size() ; j++){
              int posc = j+1;
              System.out.println(posc + "-" + playlists.get(i).canciones.get(j).getNombre());
              System.out.println("  " + playlists.get(i).canciones.get(j).getBPM());
              System.out.println("  " + playlists.get(i).canciones.get(j).getDuracion());
              System.out.println("  " + playlists.get(i).canciones.get(j).getGenero());
              System.out.println("  " + playlists.get(i).canciones.get(j).getLink());
            }
          }
        }
        if(antonioFlag == 0){
          System.out.println("No se encontro la lista de reproduccion ~w~.");
        }
      }
      
      if(flag == 4){
        System.out.println("Ingresa el nombre de la playlist.");
        String nombre = leer.next();
        System.out.println("Ingresa el link de la playlist.");
        String link = leer.next();
        System.out.println("Ingresa el tipo de musica de la playlist.");
        String tipoMusica = leer.next();
        playlist play = new playlist();
        play.Crearplaylist(nombre, link, tipoMusica);
        playlists.add(play);
      }
    }
  }

  public static boolean verificarArchivo(String ruta){
    File archivo = new File(ruta); //Cargar archivo en ruta ()
    if (!archivo.exists()){ //si archivo no existe
    try{
      archivo.createNewFile(); //crear
      return false;
    }catch (IOException e){
      System.out.print(e);
    }
    }
    return true;
  }

  public static void guardarUsuario(String datos, String ruta){
    File archivo = new File(ruta); //load archivo
    try{
      FileWriter escribir = new FileWriter(archivo,true); //Escribir en archivo en linea
        try (PrintWriter escritor = new PrintWriter(escribir) //Escribir en archivo
        ) {
            escritor.print(datos); //escribir
            //cerrar escritor
        } //escribir
      
    } catch (IOException e) {
      System.out.println(e);
    }
  }

  public static void iniciarSesion() {
    cargarUsuario();
    cargarMeta();
  }

  public static void cargarUsuario() {
    try {
      BufferedReader archivo = new BufferedReader(new FileReader("datos/datosPersona.txt"));

      String linea; // leer primer linea
      while ((linea = archivo.readLine()) != null) { // Avanzar siempre que existan lineas
        String[] campos = linea.split(";"); // separar en campos por ";"
        persona = new Usuario((campos[0]),(Integer.parseInt(campos[1])),(Float.parseFloat(campos[2])),(Float.parseFloat(campos[3])));
      }
    } catch (FileNotFoundException ex) {
      Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException e) {
      System.out.println(e);
    }
  }

    public static void cargarMeta() {
    try {
      BufferedReader archivo = new BufferedReader(new FileReader("datos/metaPersona.txt"));

      String linea; // leer primer linea
      while ((linea = archivo.readLine()) != null) { // Avanzar siempre que existan lineas
        String[] campos = linea.split(";"); // separar en campos por ";"
        metaLlegar = new Meta((Float.parseFloat(campos[0])),(Float.parseFloat(campos[1])));
      }
    } catch (FileNotFoundException ex) {
      Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}