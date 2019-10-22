package view;

import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Cliente;
import model.Conta;

public class TelaCadastroClienteView {


    public VBox getTelaCadastro(Stage stage) {
        VBox raiz = new VBox();

        Label lblNome = new Label("Nome:");
        Label lblCPF = new Label("CPF:");
        Label lblNumeroConta = new Label("Numero da Conta:");

        TextField txtNome = new TextField();
        TextField txtCPF = new TextField();
        TextField txtNumeroConta = new TextField();

        Button btnCadastrar = new Button("Cadastrar");
        Button btnLimpar = new Button("Limpar");

        MenuBarView menuBarView = new MenuBarView();
        MenuBar menuBar = menuBarView.getMenuBar(stage);

        raiz.getChildren().addAll(menuBar, lblNome, txtNome, lblCPF, txtCPF, lblNumeroConta, txtNumeroConta, btnCadastrar, btnLimpar);

        btnCadastrar.setOnAction(event -> {
            Conta conta = new Conta(Integer.valueOf(txtNumeroConta.getText()),
                    0.0);


            Cliente cliente = new Cliente(txtNome.getText(), txtCPF.getText(),
                    conta);
            System.out.println(cliente);


        });
        btnLimpar.setOnAction(event -> {
            txtNome.setText(" ");
            txtCPF.setText(" ");
            txtNumeroConta.setText(" ");
        });
        return raiz;
    }

}