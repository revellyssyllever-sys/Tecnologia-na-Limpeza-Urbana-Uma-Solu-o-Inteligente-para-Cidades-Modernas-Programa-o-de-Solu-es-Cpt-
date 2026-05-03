import model.SensorLixeira;
import controller.SensorController;
import view.TelaSistema;

public class Main {
    public static void main(String[] args) {
        SensorLixeira sensor = new SensorLixeira(90, "Centro Urbano");
        SensorController controller = new SensorController();
        TelaSistema tela = new TelaSistema();

        String resultado = controller.processarSensor(sensor);
        tela.exibirResultado(resultado);
    }
}