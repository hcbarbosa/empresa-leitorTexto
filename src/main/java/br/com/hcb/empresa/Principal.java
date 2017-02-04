package br.com.hcb.empresa;

import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.hcb.empresa.modelo.Funcionario;

public class Principal {

    public static void main(String[] args) {
        Calendar dataNascimento = new GregorianCalendar(1985, 3, 18);
        Funcionario funcionario = new Funcionario("José", 25, dataNascimento);
        System.out.println(funcionario);
    }

}
