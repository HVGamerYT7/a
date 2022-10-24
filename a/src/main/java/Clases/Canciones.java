/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author hvera
 */
import java.util.Scanner;


public class Canciones
{
  private String Nombre;
  private int BPM;
  private float Duracion;
  private String Genero;
  private String Link;


  public void agregarCancion()
  {
    Scanner Entrada = new Scanner(System.in);
    int bpm;
    float duracion;
    String genero;
    String link;
    String nombre;
    
    //Ingreso de datos.
    
    System.out.println("Ingrese Nombre de Cancion: ");
    nombre = Entrada.next();
    System.out.println("Ingrese bpm");
    bpm = Entrada.nextInt();
    System.out.println("Ingrese la duracion de la cancion : ");
    duracion = Entrada.nextFloat();
    System.out.println("Ingresar genero de la cancion : ");
    genero = Entrada.next();
    System.out.println("Ingrese el link de la cancion : ");
    link = Entrada.next();
    
    this.Nombre = nombre;
    this.BPM = bpm;
    this.Duracion = duracion;
    this.Genero = genero;
    this.Link = link;
  }

  //Get

  public String getNombre()
  {
    return this.Nombre;
  }

  public int getBPM()
  {
    return this.BPM;
  }

  public float getDuracion()
  {
    return this.Duracion;
  }

  public String getGenero()
  {
    return this.Genero;
  }

  public String getLink()
  {
    return this.Link;
  }

  //Set

  public void setNombre(String n)
  {
    this.Nombre = n;
  }

  public void setBPM(int n)
  {
    this.BPM = n;
  }

  public void setDuracion(float n)
  {
    this.Duracion = n;
  }

  public void setGenero(String n)
  {
    this.Genero = n;
  }

  public void setLink(String n)
  {
    this.Link = n;
  }
}
