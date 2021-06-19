package Exercicio06;

import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;

public class Exercicio06 {
    public static void main(String[] args) {
 
       Pessoa p1 = new Pessoa();
        p1.setNome(JOptionPane.showInputDialog(null,"Digite seu nome: "));
        p1.setAltura(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite sua altura: ")));
        int d = Integer.parseInt(JOptionPane.showInputDialog(null, "Dia do nascimento: "));
        int m = Integer.parseInt(JOptionPane.showInputDialog(null, "Mês do nascimento: "));
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ano do nascimento: "));
        String nascimento = d+"/"+m+"/"+a;
        p1.setData(nascimento);
        
        LocalDate nasc = LocalDate.of(a,m,d);
        LocalDate dataAtual = LocalDate.now();        
        Period periodo = Period.between(nasc, dataAtual);
        
        int dias = periodo.getDays(); 
        int meses = periodo.getMonths();
        int anos = periodo.getYears();        
        String msg = p1.toString()+"Idade: "+anos+" anos.";
        JOptionPane.showMessageDialog(null, msg);
       
    }
}