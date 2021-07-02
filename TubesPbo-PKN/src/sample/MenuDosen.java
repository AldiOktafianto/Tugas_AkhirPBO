package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuDosen {

    @FXML
    private AnchorPane menuDosen;

    @FXML
    private TableView<?> tvPelaksanaanUjian;

    @FXML
    private Button btn_back;

    @FXML
    void back(ActionEvent event) throws IOException {
        btn_back.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("../fxmlClass/tampilanLogin.fxml"));
        Stage mainStage = new Stage();
        Scene scene = new Scene(root);
        mainStage.setScene(scene);
        mainStage.show();

    }

}

