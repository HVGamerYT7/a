/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

public class Ejercicio
{
  private String Nombre;
  private int Repeticiones;
  private int Series;
  private String TipoDeEjercicio;
  private float Tiempo;
  private int Intensidad;

  public Ejercicio(String Nombre , int Repeticiones , int Series , String TipoDeEjercicio , float Tiempo , int Intensidad){
    this.Nombre = Nombre;
    this.Repeticiones = Repeticiones;
    this.Series = Series;
    this.TipoDeEjercicio = TipoDeEjercicio;
    this.Tiempo = Tiempo;
    this.Intensidad = Intensidad;
  }
  
//Set
  
  public Ejercicio(String nombre, String tipoEjercicio, int intensidad)
  {
    this.Nombre = nombre;
    this.TipoDeEjercicio = tipoEjercicio;
    this.Intensidad = intensidad;
  }
  
  public void setIntensidad(int intensidad)
  {
    this.Intensidad = intensidad;
  }
  
  public void setTiempo(float tiempo)
  {
    this.Tiempo = tiempo;
  }
  
  public void setTipoEjercicio(String ejercicio)
  {
    this.TipoDeEjercicio = ejercicio;
  }
  
  public void setSeries(int serie)
  {
    this.Series = serie;
  }
  
  public void setNombre(String nombre)
  {
    this.Nombre = nombre;
  }
  
  public void setRepeticiones(int repeticiones)
  {
    this.Repeticiones = repeticiones;
  }
  public String getNombre(){
    return this.Nombre;
  }

  public int getRepeticiones(){
    return this.Repeticiones;
  }

  public int getSeries(){
    return this.Series;
  }

  public String getTipoDeEjercicio(){
    return this.TipoDeEjercicio;
  }

  public float getTiempo(){
    return this.Tiempo;
  }

  public int getIntensidad(){
    return this.Intensidad;
  }
}
