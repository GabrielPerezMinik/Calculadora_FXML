package dad.calculadora;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class App extends Application{

	public static Stage primaryStage;
	private Controller control;
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		control = new Controller();
		App.primaryStage=primaryStage;
		primaryStage.setTitle("Calculadora FXML");
//		primaryStage.setScene(new Scene(new BorderPane(),600,400));
		primaryStage.setScene(new Scene(control.getView()));
//		primaryStage.getIcons().add(new Image("/images/email-send-icon-32x32 (1).png"));
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		
		launch(args);

	}

	

}
