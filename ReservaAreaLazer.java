import java.util.Scanner;

public class ReservaAreaLazer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String[] areasDeLazer = {"Piscina", "Churrasqueira", "Quadra de Esportes", "Salão de Festas"};
        int escolha;
        String nome;
        String data;

       
        System.out.println("Escolha uma área de lazer para reservar:");
        for (int i = 0; i < areasDeLazer.length; i++) {
            System.out.println((i + 1) + ". " + areasDeLazer[i]);
        }

      
        System.out.print("Digite o número da área de lazer desejada: ");
        escolha = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.print("Digite a data da reserva (dd/mm/aaaa): ");
        data = scanner.nextLine();

        
        System.out.println("Reserva confirmada!");
        System.out.println("Área de lazer: " + areasDeLazer[escolha - 1]);
        System.out.println("Nome: " + nome);
        System.out.println("Data: " + data);

        scanner.close();
    }
}