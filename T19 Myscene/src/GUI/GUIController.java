package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class GUIController {

    @FXML
    private Label LblName;

    @FXML
    private Label LblTitle;

    @FXML
    private Button bttAddPerson;

    @FXML
    private CheckBox cbSenior;

    @FXML
    private Label lblPersons;

    @FXML
    private ListView<?> lwPersons;

    @FXML
    private TextField txfName;

    @FXML
    private TextField txfTitle;

}