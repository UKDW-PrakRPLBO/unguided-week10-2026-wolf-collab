package org.rplbo.app.ug8.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import org.rplbo.app.ug8.UmbrellaApp;
import org.rplbo.app.ug8.UmbrellaDBManager;

import java.io.IOException;

public class LoginController {
    @FXML private TextField txtUsername;
    @FXML private PasswordField txtPassword;
    private static final String CORRECT_USERNAME = "hunk";
    private static final String CORRECT_PASSWORD = "123";

    @FXML
    private void handleLogin(ActionEvent event) {
        // ==============================================================================
        // TODO 1: PROSES AUTENTIKASI (LOGIN)
        // ==============================================================================
        // 1. Ambil input teks dari txtUsername dan txtPassword.
        // 2. Buat instansiasi dari class UmbrellaDBManager.
        // 3. Panggil metode validateUser() dari db manager tersebut.
        // 4. Jika hasil validasi berhasil (tidak null):
        //    a. Simpan nama user ke variabel statis UmbrellaApp.loggedInUser.
        //    b. Pindah ke halaman "umbrella-view.fxml" menggunakan UmbrellaApp.switchScene().
        // 5. Jika gagal, tampilkan pesan error "AUTHENTICATION FAILED" pada lblStatus.
        // ==============================================================================

        // --- TULIS KODE ANDA DI BAWAH INI ---

        Button tombol = (Button) event.getSource();
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        }

    @FXML
    protected void btnLogin() throws IOException{
        Alert a;
        if (txtUsername.getText().equals(CORRECT_USERNAME) && txtPassword.getText().equals(CORRECT_PASSWORD)) {
            a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText(txtUsername.getText());
            a.setContentText(txtPassword.getText());
            a.setHeaderText("Information");
            a.setContentText("Login Success!");
            a.setContentText("Welcome " +  txtUsername.getText());
            a.showAndWait();
            UmbrellaApp.switchScene("umbrella-view.fxml");
        } else {
            a = new Alert(Alert.AlertType.ERROR);
            a.setHeaderText("Error");
            a.setContentText("Login gagal!! Silahkan coba lagi.");
            a.showAndWait();
            txtUsername.requestFocus();
        }
    }


    }
