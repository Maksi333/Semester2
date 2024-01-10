package gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;

import java.awt.*;

public class PizzaInputWindow extends Stage {
	private TextField txfNavn = new TextField();
	private TextField txfPris = new TextField();

	public PizzaInputWindow(String title, Stage owner) {
		this.initOwner(owner);
		this.initStyle(StageStyle.UTILITY);
		this.initModality(Modality.APPLICATION_MODAL);
		this.setMinHeight(100);
		this.setMinWidth(200);
		this.setResizable(false);

		this.setTitle(title);
		GridPane pane = new GridPane();
		this.initContent(pane);

		Scene scene = new Scene(pane);
		this.setScene(scene);

	}

	// -------------------------------------------------------------------------

	private void initContent(GridPane pane) {
		pane.setPadding(new Insets(20));
		pane.setHgap(20);
		pane.setVgap(10);
		pane.setGridLinesVisible(false);

		Label lblNavn = new Label("Navn");
		Label lblPris = new Label("Pris");

		pane.add(lblNavn, 0,0);
		pane.add(lblPris,0,1);
		pane.add(txfNavn, 1,0);
		pane.add(txfPris,1,1);


	}

}
