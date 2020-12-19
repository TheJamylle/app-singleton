/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import app.App;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import model.Config;


public class ConfigScene extends AbstractScene {
    private final Config config = Config.getInstance();

    public ConfigScene(App app) {
        super(app);
        var label = new Label("Formato de Relatórios");
        var fieldFormatoRelatorio = new TextField(config.getFormatRelatorios());
        var label2 = new Label("Tipo de Gráficos");
        var fieldTipoGrafico = new TextField(config.getTipoGraficos());
        var btnOk = new Button("OK");
        
        setRoot(new VBox(label, fieldFormatoRelatorio, label2, fieldTipoGrafico, btnOk));
        
        btnOk.setOnAction(event -> {
            config.setFormatRelatorios(fieldFormatoRelatorio.getText());
            config.setTipoGraficos(fieldTipoGrafico.getText());
            app.setScene(new MainScene(app));
        });
    }
    
}
