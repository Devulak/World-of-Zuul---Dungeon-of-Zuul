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

public class MainmenuController implements Initializable
{

	@Override
	public void initialize(URL url, ResourceBundle rb)
	{
		// TODO
	}
	
	@FXML
	private void scenarios(ActionEvent event) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("Scenarios.fxml"));
		Scene scene = new Scene(root);
		
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML
	private void scoreboard(ActionEvent event) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("Scoreboard.fxml"));
		Scene scene = new Scene(root);
		
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML
	private void quit(ActionEvent event)
	{
		System.exit(0);
	}
}
