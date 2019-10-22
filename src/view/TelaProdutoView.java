package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Conta;
import model.Produto;

public class TelaProdutoView {


    public VBox getTelaProduto(Stage stage){
        VBox raiz = new VBox();

        Label lblProduto = new Label("Nome:");
        Label lblPreco = new Label("Preço:");

        TextField txtProduto = new TextField();
        TextField txtPreco = new TextField();

        Button btnCadastrar = new Button("Cadastrar");
        Button btnLimpar = new Button("Limpar");

        btnCadastrar.setOnAction(event -> {
            Produto produto = new Produto(txtProduto.getText(),
                    Double.valueOf(txtPreco.getText()));
            System.out.print(produto);
        });
        MenuBarView menuBarView = new MenuBarView();
        MenuBar menuBar = menuBarView.getMenuBar(stage);

        raiz.getChildren().addAll(menuBar,lblProduto, txtProduto, lblPreco,txtPreco, btnCadastrar, btnLimpar);

        btnCadastrar.setOnAction(event -> {
            Conta conta = new Conta(Integer.valueOf(txtPreco.getText()),
                    0.0);
        });

        btnLimpar.setOnAction(event -> {
            txtProduto.setText(" ");
            txtPreco.setText(" ");
        });
        return raiz;

    }
}