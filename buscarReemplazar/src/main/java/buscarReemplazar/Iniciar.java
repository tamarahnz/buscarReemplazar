package buscarReemplazar;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Iniciar extends Application {
	
	private Controller controller = new Controller();

	public void start(Stage primaryStage) throws Exception {
				
		Scene escena = new Scene(controller.getView(), 550, 200);
		
		primaryStage.setScene(escena);
		primaryStage.setTitle("Buscar y reemplazar");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
