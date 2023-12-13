package controlador;

import java.io.IOException;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;

public class ControladorIndex {

    //----- instanciación del FXML -----//
    @FXML
    private Tab tabMRU;
    @FXML
    private Tab tabTiroParabolico;
    @FXML
    private TabPane tablePaneViews;
    @FXML
    private AnchorPane anchorPaneVistas;

    //----- Métodos FXML -----//
    @FXML
    void cargarContenido(Event event) throws IOException {
        Tab selectedTab = (Tab) event.getSource();
        if (selectedTab == tabMRU) {
            cargarFXML("/vista/MRU.fxml");
        } else if (selectedTab == tabTiroParabolico) {
            cargarFXML("/vista/TiroParabolico.fxml");
        }
    }

    private void cargarFXML(String fxmlPath) throws IOException {
        AnchorPane content = FXMLLoader.load(getClass().getResource(fxmlPath));
        anchorPaneVistas.getChildren().setAll(content);
    }

}
