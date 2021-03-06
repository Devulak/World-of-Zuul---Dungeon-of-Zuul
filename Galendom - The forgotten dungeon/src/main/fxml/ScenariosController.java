package main.fxml;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main.Game;
import main.GameInterface;

public class ScenariosController implements Initializable
{
	private GameInterface game = Game.getInstance();
	
	@Override
	public void initialize(URL url, ResourceBundle rb)
	{
		
	}

	@FXML
	private void scenario1(ActionEvent event) throws IOException
	{
		game.setScenario(1);
		Parent root = FXMLLoader.load(getClass().getResource("Game.fxml"));
		Scene scene = new Scene(root);
		
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	private void scenario2(ActionEvent event) throws IOException
	{
		game.setScenario(2);
		Parent root = FXMLLoader.load(getClass().getResource("Game.fxml"));
		Scene scene = new Scene(root);
		
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	private void back(ActionEvent event) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("Mainmenu.fxml"));
		Scene scene = new Scene(root);
		
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		
		stage.setScene(scene);
		stage.show();
	}
	
}
