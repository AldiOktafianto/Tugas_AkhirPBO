package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuAdminApproval {

    @FXML
    private Button btn_LihatData;

    @FXML
    private Button btn_Perusahaan;

    @FXML
    private Button btn_back;

    @FXML
    void LihatData(ActionEvent event) throws IOException {
       btn_back.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("../fxmlClass/MenuAdminDataMah.fxml"));
        Stage mainStage = new Stage();
        Scene scene = new Scene(root);
        mainStage.setScene(scene);
        mainStage.show();
        
    }

    @FXML
    void back(ActionEvent event) throws IOException {
        btn_back.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("../fxmlClass/MenuAdmin.fxml"));
        Stage mainStage = new Stage();
        Scene scene = new Scene(root);
        mainStage.setScene(scene);
        mainStage.show();
    }

    @FXML
    void perusahaan(ActionEvent event) {

    }

}
