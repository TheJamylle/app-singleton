/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import app.App;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;


public class MainScene extends AbstractScene {

    public MainScene(App app) {
        super(app);
        
        var btnRelatorio = new Button("Relatórios");
        var btnConfig = new Button("Configurações");
        setRoot(new TilePane(btnRelatorio, btnConfig));
        
        btnRelatorio.setOnAction(event -> app.setScene(new RelatorioScene(app)));
        btnConfig.setOnAction(event -> app.setScene(new ConfigScene(app)));
    }
    
}
