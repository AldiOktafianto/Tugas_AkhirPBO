package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuMahasiswa{

    @FXML
    private AnchorPane loadingMenu;

    @FXML
    private AnchorPane menuMahasiswa;

    @FXML
    private Button btn_pengajuanProposal;

    @FXML
    private Button btn_pendaftaranUjian;

    @FXML
    private Button btn_back;

    @FXML
    void PendaftaranUjian(ActionEvent event) throws IOException{
        btn_pengajuanProposal.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("../fxmlClass/MenuMahasiswaUjian.fxml"));
        Stage mainStage = new Stage();
        Scene scene = new Scene(root);
        mainStage.setScene(scene);
        mainStage.show();

    }

    @FXML
    void PengajuanProposal(ActionEvent event) throws IOException {
        
    }

    @FXML
    void back(ActionEvent event) throws IOException {
        
}
