/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;

public class playlist{
  private String nombre;
  private float duracion;
  private String link;
  private String tipoMusica;

  public ArrayList <Canciones> canciones = new ArrayList<>();
  
  public void Crearplaylist(String nombre, String link, String tipoMusica)
  {
    this.nombre = nombre;
    this.link = link;
    this.tipoMusica = tipoMusica;
  }
  //Set
  public void setTipoM(String TipoMusica)
  {
    this.tipoMusica = TipoMusica;
  }
  public void setLink(String link)
  {
    this.link = link;
  }
  public void setDuracion(float duracion)
  {
    this.duracion = duracion;
  }
  public void setNombre(String nombre)
  {
    this.nombre = nombre;
  }
  public String getNombre()
  {
    return this.nombre;
  }

  public float getDuracion()
  {
    return this.duracion;
  }

  public String getLink()
  {
    return this.link;
  }

  public String GetTipoMusica()
  {
    return this.tipoMusica;
  }
  
  
}
