package sample;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        //test commit
        //coomit test 2
        primaryStage.show();
        // test theophile
        //test du commit 2
        //test du commit 3
        //xad la tepu
    }


    public static void main(String[] args) {
        launch(args);
    }
}
