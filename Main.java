import java.util.Scanner;
import java.util.Random;




public class Main {
  public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int numeroSecreto = random.nextInt(100) + 1;
    int tentativas = 0;
    int chute;
    boolean acertou = false;


    while(!acertou){
      System.out.println("Jᴏɢᴏ ᴅᴀ ᴀᴅɪᴠɪɴʜᴀᴄ̧ᴀ̃ᴏ.");
      System.out.println("Digite um número entre 1 e 100: ");
      chute = scanner.nextInt();
      tentativas++;
      if(chute == numeroSecreto){
        System.out.println("Parabéns, você acertou!" + tentativas + "tentativas");
        acertou = true;
      }else if(chute > numeroSecreto){
        System.out.println("O número secreto é menor que o seu chute");
      }else{
        System.out.println("O número secreto é maior que o seu chute");
      }
    }
    
  }


}