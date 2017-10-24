import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.ChoiceDialog;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
	public class AccountType2 extends Application{
	public static void main(String[]args){
	launch(args);}
	@Override
	public void start (Stage primaryStage) throws Exception{
		List choices= new ArrayList<String>();
		choices.add("Administrator");
		choices.add("Staff");
		choices.add("Faculty");
		choices.add("Student");
		choices.add("Guest");
		ChoiceDialog dialog= new ChoiceDialog<String>("Administrator", choices);
		Optional<String> input= dialog.showAndWait();
		String VALUE=input.get();

		switch (VALUE){
			case "Administrator":
				System.out.println("Welcome "+ VALUE);
				break;
			case "Staff":
				System.out.println("Welcome "+ VALUE);
				break;
			case"Faculty":
				System.out.println("Welcome "+ VALUE);
				break;
			case "Student":
				System.out.println("Welcome "+ VALUE);
				break;
			case "Guest":
				System.out.println("Welcome "+ VALUE);
				break;
			default:
				System.out.println("Invalid input");
							

	
	
	}

	}
	}
