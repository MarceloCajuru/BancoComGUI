package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Funcionario;

public class TelaFuncionarioView {


    public VBox getTelaFuncionario(Stage stage) {
        VBox raiz = new VBox();

        Label lblnome = new Label("Nome");
        Label lblarea = new Label("Área");
        Label lblcodigo = new Label("Código");
        Label lblider = new Label("Líder");
        Label lblmsg = new Label("");

        TextField txtnome = new TextField();
        TextField txtarea = new TextField();
        TextField txtcodigo = new TextField();
        TextField txtlider = new TextField();

        Button btnCadastrar = new Button("Cadastrar");
        Button btnLimpar = new Button("Limpar");

        btnCadastrar.setOnAction(event -> {
            Funcionario funcionario = new Funcionario(txtnome.getText(),
                    txtarea.getText(), String.valueOf(txtcodigo.getText()),
                    String.valueOf(txtlider.getText()));

            lblmsg.setText("Cadastrado com Sucesso");
            lblmsg.setVisible(true);
            stage.show();


            System.out.print(funcionario);
        });
        MenuBarView menuBarView = new MenuBarView();
        MenuBar menuBar = menuBarView.getMenuBar(stage);

        raiz.getChildren().addAll(menuBar, lblnome, txtnome, lblarea, txtarea, lblcodigo, txtcodigo, lblider, txtlider, btnCadastrar, btnLimpar, lblmsg);

        btnLimpar.setOnAction(event -> {
            txtnome.setText(" ");
            txtarea.setText(" ");
            txtcodigo.setText(" ");
            txtlider.setText(" ");
        });

        return raiz;


    }
}