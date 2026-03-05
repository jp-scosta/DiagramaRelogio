package relogio.model;

public class Relogio {

    String material;
    String modelo;
    double tamanho;
    String horaAtual;
    String horarioAlarme;
    
    public void mostrarHora() {

        if (horaAtual != null) {
            System.out.println("Hora atual: " + horaAtual);
        } else {
            System.out.println("A hora ainda não foi configurada.");
        }

    }

    public void reprogramarHora(String novaHora) {

        if (novaHora != null && novaHora.matches("\\d{2}:\\d{2}")) {
            horaAtual = novaHora;
            System.out.println("Hora atualizada para: " + horaAtual);
        } else {
            System.out.println("Formato de hora inválido. Use HH:MM");
        }

    }

    public void definirAlarme(String horario) {

        if (horario != null && horario.matches("\\d{2}:\\d{2}")) {
            horarioAlarme = horario;
            System.out.println("Alarme ativado para: " + horarioAlarme);
        } else {
            System.out.println("Horário de alarme inválido.");
        }

    }

    public void desativarAlarme() {

        if (horarioAlarme != null) {
            horarioAlarme = null;
            System.out.println("Alarme desativado.");
        } else {
            System.out.println("Nenhum alarme estava ativado.");
        }

    }

}