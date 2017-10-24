import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.ComboBox;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.collections.ObservableList;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Label;
	public class AccountType extends Application{
		@Override
		public void start(Stage primaryStage){
		primaryStage.setTitle("Account Type");
		primaryStage.setWidth(400);
		ObservableList <String> options=FXCollections.observableArrayList("Administrator", "Faculty", "Staff", "Student", "Guest");
		ComboBox combobox=new ComboBox(options);
		Label label=new Label ("Greeting!");
		FlowPane pane=new FlowPane();
		combobox.setOnAction(e->label.setText("Welcome "+ combobox.getValue()));
		pane.getChildren().add(label);
		pane.getChildren().add(combobox);
		
		Scene scene=new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
		}

	}
