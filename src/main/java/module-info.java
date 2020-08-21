module org.translator {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.logging.log4j;
    requires javafx.graphics;

    opens org.translator to javafx.fxml;
    exports org.translator;
}