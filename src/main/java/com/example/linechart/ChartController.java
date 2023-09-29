package com.example.linechart;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

import java.net.URL;
import java.util.ResourceBundle;


public class ChartController implements Initializable {

    private double x = 0, y = 0;

    @FXML
    private LineChart<?, ?> chart;
    

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        XYChart.Series series = new XYChart.Series();
        XYChart.Series series2 = new XYChart.Series();

        // Adding data
        series.getData().add(new XYChart.Data("1", 5));
        series.getData().add(new XYChart.Data("2", 4));
        series.getData().add(new XYChart.Data("3", 6));


        series2.getData().add(new XYChart.Data("1", 2));
        series2.getData().add(new XYChart.Data("3", 2));
        series2.getData().add(new XYChart.Data("4", 5));

        chart.getData().addAll(series, series2);
    }

}