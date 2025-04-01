import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DropdownApp extends HelloApplication {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Carregar o arquivo FXML
        VBox root = FXMLLoader.load(getClass().getResource("dropdown.fxml"));

        // Obter o ComboBox do FXML
        ComboBox<String> comboBox = (ComboBox<String>) root.lookup("#comboBoxGen");

        // Adicionar opções ao ComboBox
        comboBox.getItems().addAll("Masculino", "Feminino", "Outro");

        // Manipular a seleção do ComboBox
        comboBox.setOnAction(e -> {
            String selectedOption = comboBox.getValue();
            System.out.println("Opção selecionada: " + selectedOption);
        });

        // Criar a cena
        Scene scene = new Scene(root, 300, 150);

        // Configurar o palco (janela)
        primaryStage.setTitle("Dropdown Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
