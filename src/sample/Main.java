package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Cliente;
import model.Conta;
import model.Funcionario;
import model.Produto;
import view.MenuBarView;


public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox raiz = new VBox();

        MenuBarView menuBarView = new MenuBarView();

        raiz.getChildren().addAll(menuBarView.getMenuBar(primaryStage));

        primaryStage.setTitle("Página Inicial");
        primaryStage.setScene(new Scene(raiz, 300, 275));
        primaryStage.show();
    }
















    public static void main(String[] args) {
        launch(args);
    }
}
