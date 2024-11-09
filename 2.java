
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List listaSocios = new ArrayList<>();
        List listaAltura = new ArrayList<>();
        List listaSalario = new ArrayList<>();
        List listaSexo = new ArrayList<>();
        List listaFilhos = new ArrayList<>();
        List listaID = new ArrayList<>();

        System.out.println("Digite o número de sócios: ");
        int N = input.nextInt();

        for (int i = 0; i < N; i++) {
            String socio = "";
            int id, qtd_filhos, sexo = 0;
            float salario, altura = 0;
            System.out.print("Digite o nome: ");
            socio = input.next();
            listaSocios.add(socio);

            System.out.print("Digite o ID: ");
            id = input.nextInt();
            listaID.add(id);

            System.out.print("Digite a altura: ");
            altura = input.nextFloat();
            listaAltura.add(altura);

            System.out.print("Digite o salário: ");
            salario = input.nextFloat();
            listaSalario.add(salario);

            System.out.print("Digite o numero de filhos(a): ");
            qtd_filhos = input.nextInt();
            listaFilhos.add(qtd_filhos);

            System.out.print("Digite o sexo(1 para feminino e 2 para masculino): ");
            sexo = input.nextInt();
            listaSexo.add(sexo);

        }
        while(true){
            System.out.println("Digite aqui sua próxima ação:");
            System.out.println("1- Lista de sócios (Nome, sexo, altura, salario, filhos)");
            System.out.println("2- Média da altura dos associados");
            System.out.println("3- Total de dependentes");
            System.out.println("4- Quantidade de homens e mulheres e sua representatividade na associação em\n" +
                    "porcentagem ( X% de homens e X% de mulheres)\n");
            System.out.println("5- Maior salário e nome de quem ganha o maior salário (se mais que um associado\n" +
                    "possui o mesmo maior salário deve imprimir todos)\n");
            System.out.println("0- Encerra o programa\n");
            int gerenciar = input.nextInt();

            if(gerenciar == 0){
                break;
            } else if (gerenciar == 1) {
                for(int i = 0; i < listaSocios.size(); i++){
                    System.out.println("Dados do socio:"+ i);
                    System.out.println("Nome:"+listaSocios.get(i));
                    System.out.println("sexo:"+listaSexo.get(i));
                    System.out.println("altura:"+listaAltura.get(i));
                    System.out.println("Filhos:"+ listaFilhos.get(i));
                }

            } else if(gerenciar == 2) {
                float altura = 0.0f;
                for(int i = 0; i < listaAltura.size(); i++){
                    altura += (float) listaAltura.get(i);
                }
                float media = altura/ (float) listaAltura.size();
                System.out.println("a media de todos as alturas é igual a:"+media);
            } else if (gerenciar == 3) {
                int dependentes = 0;
                for(int i = 0; i <listaFilhos.size(); i++){
                    dependentes += (int) listaFilhos.get(i);
                }
                System.out.println("O total de dependentes é:"+ dependentes);
            } else if (gerenciar == 4) {
                int fem = 0;
                int masc = 0;
                for(int i = 0; i < listaSexo.size(); i++){
                    int sexoAtual = (int) listaSexo.get(i);
                    if (sexoAtual == 2) {
                        masc += 1;
                    } else if (sexoAtual == 1) {
                        fem += 1;
                    }
                }
                float total = (float) masc + (float) fem;
                float percfem = 100/total * fem;
                float percmasc = 100/total * masc;

                System.out.println("O total de homens é de:"+masc);
                System.out.println("e representam "+ percmasc + "% do total");
                System.out.println("O total de mulheres é de:"+fem);
                System.out.println("e representam "+ percfem + "% do total");
            } else if (gerenciar == 5) {

                int repetido = 0;
                int indice = 0;
                float maiorsalario = 0.0f;
                for(int i = 0; i < listaSalario.size(); i++){
                    if(maiorsalario <= (float) listaSalario.get(i)){
                        indice = i;
                    }
                }
                for(int i = 0; i < listaSalario.size(); i++){
                    if(maiorsalario == (float) listaSalario.get(i)){
                        repetido ++;
                    }
                }
                System.out.println(repetido);
                if(repetido > 1){
                    System.out.println("Existem salário repetidos:");
                    for(int i = 0; i < listaSocios.size(); i++){
                        System.out.println("Dados do socio:"+ i);
                        System.out.println("Nome:"+listaSocios.get(i));
                        System.out.println("sexo:"+listaSexo.get(i));
                        System.out.println("altura:"+listaAltura.get(i));
                        System.out.println("Filhos:"+ listaFilhos.get(i));
                    }
                }else{
                    System.out.println("o maior salário é de:" + listaSalario.get(indice));
                    System.out.println("e pertence a:"+listaSocios.get(indice));
                }
            }
        }

}}
