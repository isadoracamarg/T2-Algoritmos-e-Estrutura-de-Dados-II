import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Caixa {
    private int comprimento;
    private int largura;
    private int altura;

    public Caixa(int comprimento, int largura, int altura){
        //Cria um arraylist caixa pra guardar as medidas de cada caixa
        List<Integer> caixa = new ArrayList<>();
        caixa.add(comprimento);
        caixa.add(largura);
        caixa.add(altura);

        //Ordena as medidas em ordem crescente, sendo a menor a altura, a do meio a largura e a maior o comprimento
        Collections.sort(caixa);
        this.altura = caixa.get(0);
        this.largura = caixa.get(1);
        this.comprimento = caixa.get(2);
    }

    public int getComprimento(){
        return comprimento;
    }

    public int getLargura(){
        return largura;
    }

    public int getAltura(){
        return altura;
    }
}
