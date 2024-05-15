import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    // Metoda pentru a crea o matrice de tip double pe baza de colecții
    public static ArrayList<ArrayList<Double>> creareMatrice() {    //metoda CreareMatrice pe baza de colectii
        ArrayList<ArrayList<Double>> matrice = new ArrayList<>();   //declaram var matrice . Lista de liste dubla
        matrice.add(new ArrayList<Double>() {{ add(2.6); add(3.4); add(5.6); }});
        matrice.add(new ArrayList<Double>() {{ add(2.4); add(5.0); add(7.3); }});   //populam matricile
        matrice.add(new ArrayList<Double>() {{ add(3.2); add(4.5); add(1.5); }});
        return matrice;
    }

    // Metoda pentru a crea o hartă care asociază fiecare rând din matrice unui identificator unic (CHEIE)
    public static Map<Integer, ArrayList<Double>> creareHarta(ArrayList<ArrayList<Double>> matrice) {
        Map<Integer, ArrayList<Double>> harta = new HashMap<>();    //declara var harta folosind clasa HashMap
        for (int i = 0; i < matrice.size(); i++) {  //popularea hartii
            harta.put(i, matrice.get(i));
        }
        return harta;
    }

    // Metoda pentru a extrage obiecte din hărți și colecții
    public static ArrayList<Double> extrageObiecte(Map<Integer, ArrayList<Double>> harta, int index) {
        return harta.get(index);
    }

    public static void main(String[] args) {
        // Crearea matricei
        ArrayList<ArrayList<Double>> matrice = creareMatrice();

        // Crearea hărții care asociază fiecare rând din matrice unui identificator unic
        Map<Integer, ArrayList<Double>> harta = creareHarta(matrice);

        // Extrageți obiecte din hărți și colecții
        ArrayList<Double> rand = extrageObiecte(harta, 1); // Extragem al doilea rand din matrice (index 1)

        // Afișarea rezultatului sub forma cerută
        System.out.print("Rand extras din harta: ");
        for (Double element : rand) {
            System.out.print(element + " ");
        }
    }
}
