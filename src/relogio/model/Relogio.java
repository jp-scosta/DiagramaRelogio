package relogio.model;

public class Relogio {

    private String material;
    private String modelo;
    private double tamanho;
    private String horaAtual;
    private String horarioAlarme;
    
    public void mostrarHora() {

        if (horaAtual != null) {
            System.out.println("Hora atual: " + horaAtual);
        } else {
            System.out.println("A hora ainda não foi configurada.");
        }

    }

    public void reprogramarHora(String novaHora) {

        if (novaHora != null) {
        	setHoraAtual(novaHora);
        } else {
        	System.out.println("Horário inválido.");
        }

    }

    public void definirAlarme(String horario) {

        if (horario != null && horario.matches("([01]\\d|2[0-3]):[0-5]\\d")) {
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
    
    public String getMaterial() {
    	return this.material;
    }
    
    public String getModelo() {
    	return this.modelo;
    }
    
    public double getTamanho() {
    	return this.tamanho;
    }
    
    public String getHoraAtual() {
    	return this.horaAtual;
    }
    
    public String getHorarioAlarme() {
    	return this.horarioAlarme;
    }
    
    private void setHoraAtual(String horaAtual) {
        if (horaAtual.matches("([01]\\d|2[0-3]):[0-5]\\d")) {
            this.horaAtual = horaAtual;
        } else {
            System.out.println("Hora inválida! Use o formato HH:MM.");
        }
    }
    
    private void setHorarioAlarme(String horarioAlarme) {
    	this.horarioAlarme = horarioAlarme;
    }
    
}