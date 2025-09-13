module com.example.comp3111lex {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.comp3111lex to javafx.fxml;
    exports com.example.comp3111lex;
}