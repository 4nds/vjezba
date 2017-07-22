package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Trokut prvi = new Trokut(4,3,6);
		Krug drugi = new Krug(5);
		Pravokutnik treci = new Pravokutnik(3,7);
		Kvadrat cetvrti = new Kvadrat(10);
		System.out.println(prvi.opseg());
		System.out.println(drugi.povrsina());
		System.out.println(treci.povrsina());
		System.out.println(cetvrti.opseg());
		System.out.println(cetvrti.povrsina());
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
