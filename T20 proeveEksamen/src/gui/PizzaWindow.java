package gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.Pizza;

public class PizzaWindow extends Application {

	private ListView<Pizza> lwPizzas = new ListView<>();
	private Stage stage = new Stage();


	@Override
	public void start(Stage stage) {
		stage.setTitle("Pizzaer");
		GridPane pane = new GridPane();
		this.initContent(pane);

		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.show();
	}

	private void initContent(GridPane pane) {
		pane.setPadding(new Insets(20));
		pane.setHgap(20);
		pane.setVgap(10);
		pane.setGridLinesVisible(false);

		Label lblComp = new Label("Liste over pizzaer");
		pane.add(lblComp, 0, 0);

		pane.add(lwPizzas,0,1);
		Button btnCreateNewPizza = new Button("Lav ny pizza");
		btnCreateNewPizza.setOnAction(actionEvent -> new PizzaInputWindow("opret pizza",null).showAndWait());
		pane.add(btnCreateNewPizza,0,2);

	}
}
