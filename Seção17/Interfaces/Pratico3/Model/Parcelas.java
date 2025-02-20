package Seção17.Interfaces.Pratico3.Model;

import java.text.SimpleDateFormat;
// diferença as lists!
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Parcelas {

     SimpleDateFormat dtf = new SimpleDateFormat("dd/MM/yyyy");
    // Arraylist responsavel por guardar as parcelas
    // A lista um objeto do tipo 'Parcela' e armazena uma coleção deles
    private List<Parcela> listaparcelas = new ArrayList<>();

    // Metodo responsavel pelo armazenamento de objeto 'Parcela' na lista de parcelas
    // O metodo recebe como parametro os atributos do objeto parcela em em seguida cria um novo objeto
    // O novo objeto do tipo parcela é criado diretamente na inserção dele na lista
    public void adicionarParcela(Date vencimento, Double valor) {
        listaparcelas.add(new Parcela(vencimento, valor));
    }

    // Metodo responsavel por retorno da lista (dessa forma podemos visualiza-la)
    public String getListaParcelas(){
        // String builder utilizado para retornar atributos do objeto parcela
        Integer contador = 0;
        StringBuilder sb = new StringBuilder();
        for (Parcela parcela : listaparcelas) {
            sb.append("Parcela #" + contador++);
            sb.append(" " + dtf.format(parcela.getdatadeVencimento()));
            sb.append(" " + parcela.getQuantia() + "\n");
        }
    return sb.toString();
    }

}
