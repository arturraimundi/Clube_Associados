import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Distância em KM");
        float distancia = input.nextFloat();
        System.out.println("Média do carro L/Km");
        float media = input.nextFloat();
        System.out.println("Valor da Gasolina");
        float valor_gasolina = input.nextFloat();
        System.out.println("Dias trabalhados");
        int dias_trabalhados = input.nextInt();
        float valor_total = (distancia * dias_trabalhados/media) * valor_gasolina;
        System.out.printf("Gabriel vai gastar: R$ %.2f", valor_total);
    }
}
