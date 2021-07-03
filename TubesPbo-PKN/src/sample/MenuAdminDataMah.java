package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.sql.*;
import java.util.ArrayList;

public class MenuAdminDataMah {
    Connection conn = null;
    ResultSet rs = null;
    Statement pst = null;

    @FXML
    private Button btn_back;

    @FXML
    private Button btn_lihatCV;

    @FXML
    private Button btn_lihatPortofolio;

    @FXML
    private TextArea fieldAlamatPKN;

    @FXML
    private TextArea AnggotaKelompok;

    @FXML
    private TextField fieldWaktuPKN;

    @FXML
    private TextField fieldWaktuPKN2;

    @FXML
    private Button btn_backward;

    @FXML
    private Button btn_forward;

    @FXML
    void back(ActionEvent event) {

    }

    @FXML
    void backward(ActionEvent event) {
        if(btn_backward.isManaged()){

        }
    }

    @FXML
    void forward(ActionEvent event) {
       
    }

    @FXML
    void lihatPortofolio(ActionEvent event) {

    }

    @FXML
    void lihatV(ActionEvent event) {

    }

}
