package agibank.invest7_frontend;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;  // Importação da classe ImageView

public class HelloController {
    @FXML
    private ImageView logoImageView;  // A variável logoImageView foi declarada corretamente.

    @FXML
    public void initialize() {
        // Carregar a imagem (verifique se o caminho está correto)
        Image image = new Image(getClass().getResource("/assets/logocolor.png").toExternalForm());
        logoImageView.setImage(image); // Definir a imagem no ImageView
    }

    FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
    Parent root = loader.load();
    Scene scene = new Scene(root);
    stage.setScene(scene);
stage.show();



}
