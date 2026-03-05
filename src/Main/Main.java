package Main;

import relogio.model.Relogio;

public class Main {

    public static void main(String[] args) {

        Relogio relogio = new Relogio();

        // valores válidos
        relogio.reprogramarHora("14:30");
        relogio.mostrarHora();

        relogio.definirAlarme("07:00");

        // valores inválidos
        relogio.reprogramarHora("abc");
        relogio.definirAlarme("99:99");

        relogio.desativarAlarme();

    }

}