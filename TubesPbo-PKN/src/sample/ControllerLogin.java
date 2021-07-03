package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javax.swing.*;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class ControllerLogin implements Initializable {

    @FXML
    private AnchorPane pane_login;

    @FXML
    private TextField txt_username;

    @FXML
    private PasswordField txt_password;

    @FXML
    private ComboBox type;

    @FXML
    private Button btn_login;

    @FXML
    private AnchorPane pane_signup;

    @FXML
    private TextField txt_username_up;

    @FXML
    private TextField txt_password_up;

    @FXML
    private TextField email_up;

    @FXML
    private ComboBox  type_up;


    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public void LoginpaneShow(){

        pane_login.setVisible(true);
        pane_signup.setVisible(false);
    }

    public void SignuppaneShow(){

        pane_login.setVisible(false);
        pane_signup.setVisible(true);
    }


    @FXML
    private void Login (ActionEvent event) throws Exception{
        

    }


    public void add_users(ActionEvent event){
        conn = mysqlconnect.ConnectDb();
        String sql = "insert into users (username,password,type,email) values (?,?,?,?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_username_up.getText());
            pst.setString(2, txt_password_up.getText());
            pst.setString(3, type_up.getValue().toString());
            pst.setString(4, email_up.getText());
            pst.execute();

            JOptionPane.showMessageDialog(null, "Data telah disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data tidak disimpan");
        }
    }



    @Override
    public void initialize(URL url, ResourceBundle rb) {
        type_up.getItems().addAll("Mahasiswa","Dosen","Admin");
        type.getItems().addAll("Mahasiswa","Dosen","Admin");
    }

}
