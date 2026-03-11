package Main;

import relogio.model.Relogio;

public class Main {

    public static void main(String[] args) {

        Relogio meuRelogio = new Relogio();

        // Teste 1: programar hora válida
        meuRelogio.reprogramarHora("12:30");
        System.out.println("Hora atual: " + meuRelogio.getHoraAtual()); 
        // Esperado: "Hora atual: 12:30"

        // Teste 2: tentar burlar com hora inválida
        meuRelogio.reprogramarHora("99:99");  
        // Esperado: "Hora inválida! Use o formato HH:MM."
        System.out.println("Hora atual: " + meuRelogio.getHoraAtual()); 
        // Esperado: "Hora atual: 12:30"

        // Teste 3: tentar burlar com valor nulo
        meuRelogio.reprogramarHora(null);  
        // Esperado: "Horário inválido."
        System.out.println("Hora atual: " + meuRelogio.getHoraAtual()); 
        // Esperado: "Hora atual: 12:30" 
   
    }

}