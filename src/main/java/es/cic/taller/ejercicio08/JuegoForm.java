package es.cic.taller.ejercicio08;


import com.vaadin.ui.FormLayout;
import com.vaadin.ui.TextField;

public class JuegoForm extends FormLayout{

	private TextField carta1 = new TextField("Carta 1");
	private TextField carta2 = new TextField("Carta 2");
	private TextField carta3 = new TextField("Carta 3");
	private TextField carta4 = new TextField("Carta 4");
	
	private MyUI miUI;
	
	public JuegoForm(MyUI myUI) {
		this.miUI = myUI;
		
		addComponents(carta1, carta2, carta3, carta4);
	}

	
	
	
}
