package buscarReemplazar;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;


	public class View extends BorderPane {
	
	private TextField buscarText;
	private TextField reemplazarText;
	private Button buscarBt;
	private Button reemplazarBt;
	private Button reemplazarTodoBt;
	private Button cerrarBt;
	private Button ayudaBt;
	private CheckBox mayusMinCb;
	private CheckBox expresionCb;
	private CheckBox buscarAtrasCb;
	private CheckBox resaltarCb;
	
	public View() {
		
		Button buscarBt = new Button("Buscar");
		Button reemplazarBt = new Button("Reemplazar");
		Button reemplazarTodoBt = new Button("Reemplazar todo");
		Button cerrarBt = new Button("Cerrar");
		Button ayudaBt = new Button("Ayuda");
		
		VBox botonesBox = new VBox();
		botonesBox.setSpacing(5);
		botonesBox.getChildren().addAll(buscarBt,reemplazarBt,reemplazarTodoBt,cerrarBt,ayudaBt);
		botonesBox.setPadding(new Insets(5,10,0,10));
		
		GridPane root = new GridPane();
		root.setPadding(new Insets(5));
		root.setHgap(5);
		root.setVgap(5);
		
		TextField buscarText = new TextField();
		TextField reemplazarText = new TextField();
		
		root.addRow(0, new Label("Buscar:"),buscarText);
		root.addRow(1, new Label("Reemplazar con:"),reemplazarText);
		
		CheckBox mayusMinCb = new CheckBox();
		CheckBox expresionCb = new CheckBox();
		CheckBox buscarAtrasCb = new CheckBox();
		CheckBox resaltarCb = new CheckBox();
	
		GridPane funcionesBox = new GridPane();
		funcionesBox.addRow(0,mayusMinCb,new Label("Mayúsculas y minúsculas"),buscarAtrasCb,new Label("Buscar hacia atrás"));
		funcionesBox.addRow(1,expresionCb,new Label("Expresión regular"),resaltarCb,new Label("Resaltar resultados"));
		
		root.add(funcionesBox, 1, 2);
		
		this.setRight(botonesBox);
		this.setCenter(root);
		
	}

	public TextField getBuscarText() {
		return buscarText;
	}

	public void setBuscarText(TextField buscarText) {
		this.buscarText = buscarText;
	}

	public TextField getReemplazarText() {
		return reemplazarText;
	}

	public void setReemplazarText(TextField reemplazarText) {
		this.reemplazarText = reemplazarText;
	}

	public Button getBuscarBt() {
		return buscarBt;
	}

	public void setBuscarBt(Button buscarBt) {
		this.buscarBt = buscarBt;
	}

	public Button getReemplazarBt() {
		return reemplazarBt;
	}

	public void setReemplazarBt(Button reemplazarBt) {
		this.reemplazarBt = reemplazarBt;
	}

	public Button getReemplazarTodoBt() {
		return reemplazarTodoBt;
	}

	public void setReemplazarTodoBt(Button reemplazarTodoBt) {
		this.reemplazarTodoBt = reemplazarTodoBt;
	}

	public Button getCerrarBt() {
		return cerrarBt;
	}

	public void setCerrarBt(Button cerrarBt) {
		this.cerrarBt = cerrarBt;
	}

	public Button getAyudaBt() {
		return ayudaBt;
	}

	public void setAyudaBt(Button ayudaBt) {
		this.ayudaBt = ayudaBt;
	}

	public CheckBox getMayusMinCb() {
		return mayusMinCb;
	}

	public void setMayusMinCb(CheckBox mayusMinCb) {
		this.mayusMinCb = mayusMinCb;
	}

	public CheckBox getExpresionCb() {
		return expresionCb;
	}

	public void setExpresionCb(CheckBox expresionCb) {
		this.expresionCb = expresionCb;
	}

	public CheckBox getBuscarAtrasCb() {
		return buscarAtrasCb;
	}

	public void setBuscarAtrasCb(CheckBox buscarAtrasCb) {
		this.buscarAtrasCb = buscarAtrasCb;
	}

	public CheckBox getResaltarCb() {
		return resaltarCb;
	}

	public void setResaltarCb(CheckBox resaltarCb) {
		this.resaltarCb = resaltarCb;
	}

}