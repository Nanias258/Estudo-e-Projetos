package ex1_04_03;
import java.util.Scanner;
import javax.swing.JOptionPane;


//

/**
 *
 * @author Cliente
 */
public class Ex1_04_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta;
        resposta = null;
        String nome;
        int X;
        int Y;
        int media;
        
        resposta = JOptionPane.showInputDialog(null, "Digite o nome do aluno: ");
        System.out.print("Digite o nome do aluno: ");
        nome = scanner.nextLine();
        
        //resposta = JOptionPane.showInputDialog(null, " Digite a nota X: ");
        //X = Interger.parseInt(resposta);
        System.out.print("Digite a nota X: ");
        X = scanner.nextInt();
          
        //resposta = JOptionPane.showInputDialog(null, " Digite a nota Y: ");
        //Y = Interger.parseInt(resposta);
        System.out.print("Digite a nota Y: ");
        Y = scanner.nextInt();
        
        media=(X+Y)/2;
        
        
        System.out.println(" A media do aluno "+(nome)+"é "+media+" pontos");
        if(media > 7){
            System.out.println("Aprovado");
        }
        
        
        
        
        
        
        
    }
    
}
