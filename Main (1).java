public class Main {
  public static void main(String[] args) {
   int iteracoes = 10000000;
    double pi = 0.0;
    for (int i = 0; i < iteracoes; i++){
      if(i % 2 == 0){
        pi += 1.0 / (2 * i + 1);
        System.out.println("Interação: " + i + ": " + pi);
      }else{
        pi -= 1.0 / (2 * i + 1);
        System.out.println("Interação: " + i + ": " + pi);
      }
    }
    pi *=4; 
    System.out.println("O número aproximado foi: " + pi);
    }

 
}