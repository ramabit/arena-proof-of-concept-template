package ui;

import org.uqbar.commons.utils.Observable;

import domain.UnModel;

@Observable
public class UnViewModel {

  private UnModel unModel;
  private String saludo;
  private String nombre;

  public UnViewModel(UnModel unModel) {
	  this.unModel = unModel;
  }

  public void saludar() {
	  saludo = unModel.saludar(nombre);
  }

  public String getSaludo() {
	  return saludo;
  }

  public void setSaludo(String saludo) {
	  this.saludo = saludo;
  }

  public String getNombre() {
	  return nombre;
  }

  public void setNombre(String nombre) {
	  this.nombre = nombre;
  }

}
