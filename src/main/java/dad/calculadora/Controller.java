package dad.calculadora;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Controller implements Initializable{

		Calculadora calc = new Calculadora();
	
		@FXML
	    private TextField calcViewText;
	
	    @FXML
	    private Button cButton;

	    @FXML
	    private Button ceButton;

	    @FXML
	    private Button ceroButton;

	    @FXML
	    private Button cincoButton;

	    @FXML
	    private Button cuatroButton;

	    @FXML
	    private Button dividirButton;

	    @FXML
	    private Button dosButton;

	    @FXML
	    private Button igualButton;

	    @FXML
	    private Button menosButton;

	    @FXML
	    private Button multiplicarButton;

	    @FXML
	    private Button nueveButton;

	    @FXML
	    private Button ochoButton;

	    @FXML
	    private Button puntoButton;

	    @FXML
	    private Button seisButton;

	    @FXML
	    private Button sieteButton;

	    @FXML
	    private Button sumaButton;

	    @FXML
	    private Button tresButton;

	    @FXML
	    private Button unoButton;

	    @FXML
	    private GridPane view;

	    
	    public Controller() throws IOException {
	    	
	    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Root.fxml"));
			loader.setController(this);
			loader.load();
	    	
	    }
	    

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			
			calcViewText.textProperty().bind(calc.pantallaProperty());
		}
	    
	    @FXML
	    void onBorrar(ActionEvent event) {

	    	calc.borrar();
	    }

	    @FXML
	    void onBorrarTodo(ActionEvent event) {

	    	calc.borrarTodo();
	    }
	    
	    @FXML
	    void onComa(ActionEvent event) {

	    	calc.insertarComa();
	    }

	    @FXML
	    void onDividir(ActionEvent event) {

	    	char division=(((Button) event.getSource()).getText().charAt(0));
	    	calc.operar(division);
	    }

	    @FXML
	    void onIgual(ActionEvent event) {

	    	char igual=(((Button) event.getSource()).getText().charAt(0));
	    	calc.operar(igual);
	    }

	    @FXML
	    void onMultiplicar(ActionEvent event) {

	    	char multiplicar=(((Button) event.getSource()).getText().charAt(0));
	    	calc.operar(multiplicar);
	    }

	    @FXML
	    void onPulsarAction(ActionEvent event) {

	    	char operando = ((Button)event.getSource()).getText().charAt(0);
			calc.insertar(operando);
	    	
	    }

	    @FXML
	    void onRestar(ActionEvent event) {
	    	char restar=(((Button) event.getSource()).getText().charAt(0));
	    	calc.operar(restar);
	    }

	    @FXML
	    void onSumar(ActionEvent event) {
	    	char sumar=(((Button) event.getSource()).getText().charAt(0));
	    	calc.operar(sumar);
	    }

	    public GridPane getView() {
			return view;
		}

	
}
