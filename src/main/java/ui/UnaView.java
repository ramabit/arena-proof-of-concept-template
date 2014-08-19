package ui;

import java.awt.Color;

import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.MainWindow;

import domain.UnModel;

//IMPORTANTE: correr con -Djava.system.class.loader=com.uqbar.apo.APOClassLoader
public class UnaView extends MainWindow<UnViewModel> {

  public UnaView() {
    super(new UnViewModel(new UnModel()));
  }

  @Override
  public void createContents(Panel mainPanel) {
	  setTitle("Programita de prueba");
	  mainPanel.setLayout(new VerticalLayout());

	  new Label(mainPanel).setText("Ingresa tu nombre");
	  new TextBox(mainPanel).bindValueToProperty("nombre");
	  
	  new Label(mainPanel) //
	    .setBackground(Color.GREEN) //
	    .bindValueToProperty("saludo");
	  
	  new Button(mainPanel) //
	    .setCaption("Saludar") //
	    .onClick(() -> getModelObject().saludar());
  }

  public static void main(String[] args) {

    new UnaView().startApplication();
  }
}
