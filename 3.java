
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> listaID = new ArrayList<>();
        List<String> listaNome = new ArrayList<>();
        List<Float> listaAltura = new ArrayList<>();
        List<Float> listaPeso = new ArrayList<>();
        List<Integer> listaIdade = new ArrayList<>();
        List<Float> listaIMC = new ArrayList<>();

        System.out.print("Digite o ID: ");
        int id = 1;
        id = input.nextInt();
        while(id != 0){
            listaID.add(id);
            String nome = "";
            int idade = 0;
            float peso, altura, imc = 0;


            System.out.print("Digite o nome: ");
            nome = input.next();
            listaNome.add(nome);

            System.out.print("Digite a altura: ");
            altura = input.nextFloat();
            listaAltura.add(altura);

            System.out.print("Digite o peso: ");
            peso = input.nextFloat();
            listaPeso.add(peso);

            System.out.print("Digite sua idade: ");
            idade = input.nextInt();
            listaIdade.add(idade);

            imc = peso / (altura*altura);
            imc = imc * 10000;
            System.out.println(imc);
            listaIMC.add(imc);

            System.out.print("Digite o ID: ");
            id = input.nextInt();
        }


        float totalimc = 0.0f;
        float totalpeso = 0.0f;
        float totalaltura = 0.0f;
        float totalidade = 0.0f;
        for (int i = 0; i < listaID.size(); i++) {
            totalimc += (float) listaIMC.get(i);
            totalpeso += (float) listaPeso.get(i);
            totalaltura += (float) listaAltura.get(i);
            totalidade += (float) listaIdade.get(i);
        }
        System.out.println("Média de imc:" + totalimc/ listaIMC.size());
        System.out.println("Média de peso:" + totalpeso/ listaPeso.size());
        System.out.println("Média de altura:" + totalaltura/ listaAltura.size());
        System.out.println("Média de idade:" + totalidade/ listaIdade.size());

}}