package Aplicacion;

import java.net.URL;
import java.util.ResourceBundle;

import org.omg.CORBA.TRANSACTION_MODE;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

public class Controlador implements Initializable {

	@FXML
	private AnchorPane pane1;

	@FXML
	private AnchorPane pane2;

	@FXML
	private AnchorPane pane3;

	@FXML
	private Label countLabel;

	public void transladarAnimacion(double duracion, Node nodo, double byX) {
		TranslateTransition transladarTransicion = new TranslateTransition(Duration.seconds(duracion), nodo);
		transladarTransicion.setByX(byX);
		transladarTransicion.play();

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		transladarAnimacion(0.5, pane2, 600);
		transladarAnimacion(0.5, pane3, 600);

	}

	int showSlide = 0;

	@FXML
	void nextAction(ActionEvent event) {

		if (showSlide == 0) {
			transladarAnimacion(0.5, pane2, -600);
			showSlide++; // showSlide=1
			countLabel.setText("2/3");
		} else if (showSlide == 1) {

			transladarAnimacion(0.5, pane3, -600);
			showSlide++; // showSlide=2
			countLabel.setText("3/3");

		} else {
			System.out.println("No more slides");
		}

	}

	@FXML
	void backAction(ActionEvent event) {

		if (showSlide == 0) {
			System.out.println("No more slide");
		} else if (showSlide == 1) {
			transladarAnimacion(0.5, pane2, 600);
			showSlide--; // showSlide=0
			countLabel.setText("1/3");
		} else if (showSlide == 2) {
			transladarAnimacion(0.5, pane3, 600);
			showSlide--; // showSlide=1
			countLabel.setText("2/3");
		}

	}

}
