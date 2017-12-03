package Aplicacion;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
	Stage escenario;

	public static void main(String[] args) {

		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		escenario = primaryStage;
		mainWindow();
	}

	private void mainWindow() {

		try {
			FXMLLoader cargador = new FXMLLoader(getClass().getResource("introFXSebas.fxml"));
			AnchorPane panelAncaldo = cargador.load();
			//escenario.initStyle(StageStyle.UNDECORATED);
			escenario.setTitle("INTRODUCCION");
			escenario.setScene(new Scene(panelAncaldo));
			escenario.show();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
