import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Nomes: Brenda Brizola, Isadora Morari, Luana Thurow

public class Aplicacao {
    private static List<Caixa> caixas;

    public static void main(String[] args) {
        caixas = new ArrayList<>();
        lerArquivo("caixas_2000.txt");

        //for pra testar se as medidas estão na ordem certa
        for (Caixa caixa : caixas) {
            System.out.println("Comprimento: " + caixa.getComprimento() + ", Largura: " + caixa.getLargura() + ", Altura: " + caixa.getAltura());
        }
    }

    public static void lerArquivo(String arquivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] medidas = linha.split(" ");
                int altura = Integer.parseInt(medidas[0]);
                int largura = Integer.parseInt(medidas[1]);
                int comprimento = Integer.parseInt(medidas[2]);
                Caixa caixa = new Caixa(comprimento, largura, altura);
                caixas.add(caixa);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void maiorSequencia(int caixa[][]){
        for (int[] caixas:caixa) {
            Arrays.sort(caixa);
        }

        Arrays.sort(caixa, (a,b)->{
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
            if (a[1] != b[1]) return Integer.compare(a[1], b[1]);
            return Integer.compare(a[2], b[2]);
        });
    }

    public List<Caixa> getCaixas() {
        return caixas;
    }
}