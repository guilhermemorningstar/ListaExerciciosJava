package listaexercicios2;

import javax.swing.*;

public class Ex_02 {
    
    public static void main(String[] args) {
        String a, alunos[] = new String[6];
        int b, nota[] = new int[6];
        
        
        for (int i = 0; i < 6; i++) {
            b = i + 1;
            alunos[i] = JOptionPane.showInputDialog(null, "Digite o nome do aluno " + b);

            for (int o = 0; o < 2; o++) {
                int p = o + 1; 
                a = JOptionPane.showInputDialog(null,"Digite a " + p +"º nota: ");
                nota[o] = Integer.parseInt(a);
                }
            
        }

    }

}
