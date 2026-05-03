package controller;

import model.SensorLixeira;

public class SensorController {
    public String processarSensor(SensorLixeira sensor) {
        return "Local: " + sensor.getLocalizacao() +
               " | Status: " + sensor.verificarStatus();
    }
}