package view;

import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaAjudaView {

    public VBox getTelaAjuda(Stage stage){
        VBox vbox = new VBox();

        MenuBarView menuBarView = new MenuBarView();
        MenuBar menuBar = menuBarView.getMenuBar(stage);
        Label lblDesenvolvido = new Label("Desennvolvido por SENAC");

        vbox.getChildren().addAll(menuBar, lblDesenvolvido);

        return vbox;

    }
}