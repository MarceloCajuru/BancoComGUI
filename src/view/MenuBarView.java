package view;

import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class MenuBarView {

    public MenuBar getMenuBar(Stage stage) {
        MenuBar menuBar = new MenuBar();

        Menu cadastrar = new Menu("Cadastrar");
        MenuItem cadastrarCliente = new MenuItem("Cliente");
        MenuItem cadastrarProduto = new MenuItem("Produto");
        MenuItem cadastrarFuncionario = new MenuItem("Funcionario");
        Menu operações = new Menu("Operações");
        MenuItem operacaoDepositoRetirada = new MenuItem("Depositar/Retirar");


        cadastrar.getItems().addAll(cadastrarCliente);
        operações.getItems().addAll(operacaoDepositoRetirada);
        cadastrar.getItems().addAll(cadastrarProduto);
        cadastrar.getItems().add(cadastrarFuncionario);

        Menu ajuda = new Menu("Ajuda");
        MenuItem sobreItem = new MenuItem("Sobre");


        menuBar.getMenus().addAll(cadastrar, operações, ajuda);

        ajuda.getItems().addAll(sobreItem);

        cadastrarCliente.setOnAction(actionEvent -> {
            stage.setTitle("Cadastrar Cliente");
            TelaCadastroClienteView telaCadastroClienteView = new TelaCadastroClienteView();
            stage.setScene(new Scene(telaCadastroClienteView.getTelaCadastro(stage), 500, 275));
            stage.show();

        });
        operacaoDepositoRetirada.setOnAction(actionEvent -> {
            stage.setTitle("Depositar/Retirar");
            TelaDepositarRetirarView telaDepositarRetirarView = new TelaDepositarRetirarView();
            stage.setScene(new Scene(telaDepositarRetirarView.getTelaDepositarRetirar(stage), 500, 275));
            stage.show();
        });

        sobreItem.setOnAction(actionEvent -> {
            stage.setTitle("Sobre");
            TelaAjudaView telaAjudaView = new TelaAjudaView();
            stage.setScene(new Scene(telaAjudaView.getTelaAjuda(stage), 500, 275));
            stage.show();
        });

        cadastrarProduto.setOnAction(actionEvent -> {
            stage.setTitle("Produto");
            TelaProdutoView telaProdutoView = new TelaProdutoView();
            stage.setScene(new Scene(telaProdutoView.getTelaProduto(stage), 500, 275));
            stage.show();
        });

        cadastrarFuncionario.setOnAction(actionEvent -> {
            stage.setTitle("Funcionario");
            TelaFuncionarioView telaFuncionarioView = new TelaFuncionarioView();
            stage.setScene(new Scene(telaFuncionarioView.getTelaFuncionario(stage), 500, 275));
            stage.show();



        });
        return menuBar;
    }
}
