/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

//import java.util.Date;
import static java.lang.Math. *;

public class Usuario
{
  private String Nombre;
  private int Edad;
  private float Peso;
  private float Altura;
  //private date FechaNacimiento;
  private double IMC;

  public Usuario(String nombre, int edad, float peso, float altura)
  {
    this.Nombre = nombre;
    this.Edad = edad;
    this.Peso = peso;
    this.Altura = altura;
  }

  public Usuario(String nombre, float peso, float altura)
  {
    this.Nombre = nombre;
    this.Altura = altura;
    this.Peso = peso;
  }  
  
  //Set
  
  public void setAltura(float altura)
  {
    this.Altura = altura;
  }
  
  public void setPeso(float peso)
  {
    this.Peso = peso;
  }
  
  public void setEdad(int edad)
  {
    this.Edad = edad;
  }
  
  public void setNombre(String nombre)
  {
    this.Nombre = nombre;
  }
  
  public void obtenerImc(float peso, float altura)
  {
    this.IMC = peso/(Math.sqrt(altura));
  }
  
  public String getNombre()
  {
    return this.Nombre;
  }

  public int getEdad()
  {
    return this.Edad;
  }

  public float getPeso()
  {
    return this.Peso;
  }

  public float getAltura()
  {
    return this.Altura;
  }

  public double getImc()
  {
    return this.IMC;
  }
}


