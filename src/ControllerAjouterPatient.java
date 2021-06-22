package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class ControllerAjouterPatient {
    @FXML
    private TextField Nom ;
    @FXML
    private TextField prenom ;
    @FXML
    private TextField adress ;
    @FXML
    private TextField email ;
    @FXML
    private TextField  telephone ;
    @FXML
    private TextArea informations ;
    /* Asma use this attributes ,they contain the values of the attributs*/
    private String nomValeur;

    private String prenomValeur;
    private String adressValeur;
    private String emailValeur;
    private String telephoneValeur;
    private String informationsValeur;
    public void ValiderClicked(ActionEvent event) throws Exception {

        if (!this.Nom.getText().isEmpty())
        {    nomValeur=this.Nom.getText();
            System.out.println(this.Nom.getText());
        }
        if (!this.prenom.getText().isEmpty())
        {    prenomValeur=this.prenom.getText();
            System.out.println(this.prenom.getText());
        }
        if (!this.adress.getText().isEmpty())
        {    adressValeur=this.adress.getText();
            System.out.println(this.adress.getText());
        }
        if (!this.email.getText().isEmpty())
        {   emailValeur=this.email.getText();
            System.out.println(this.email.getText());
        }
        if (!this.telephone.getText().isEmpty())
        {   telephoneValeur=this.telephone.getText();
            System.out.println(this.telephone.getText());
        }
        if (!this.informations.getText().isEmpty())
        {   informationsValeur=informations.getText();
            System.out.println(this.informations.getText());
        }
        //Asma here u can add ur code.





        //here on affiche le mssg que l'element est enregistré et on ferme la fenetre
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("PageElementAjouterAvecSucees.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Ajouter Patient");
        stage.setScene(scene);
        stage.show();

    }




}
