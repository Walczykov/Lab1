import java.util.ArrayList;
import java.util.List;
public class klasaGlowna {
    public klasaGlowna() {
    }
    public static void main(String[] args) {
        PunktMaterialny punkt01 = new PunktMaterialny();
        PunktMaterialny punkt02 = new PunktMaterialny(10.0F);
        System.out.println("Punkt pierwszy \tOpis: " + punkt01.opis());
        System.out.println("\tMasa:" + punkt01.pobierzMase());
        System.out.println("\tGlowny momet bezwladnosci:" +
                punkt01.pobierzGlownyMomentBezwladnosci());
        System.out.println("\tMomet bezwladnosci wzgledem nowej osi:" +
                punkt01.obliczMometBezwladnosciWzdluzOsi(10.0F));
        System.out.println("Punkt drugi \tOpis: " + punkt02.opis());
        System.out.println("\tMasa:" + punkt02.pobierzMase());
        System.out.println("\tGlowny momet bezwladnosci:" +
                punkt02.pobierzGlownyMomentBezwladnosci());
        System.out.println("\tMomet bezwladnosci wzgledem nowej osi:" +
                punkt02.obliczMometBezwladnosciWzdluzOsi(10.0F));
        punkt01.zmienMase(9.0F);
        System.out.println("Punkt pierwszy \tOpis: " + punkt01.opis());
        System.out.println("\tMasa:" + punkt01.pobierzMase());
        System.out.println("\tGlowny momet bezwladnosci:" +
                punkt01.pobierzGlownyMomentBezwladnosci());
        System.out.println("\tMomet bezwladnosci wzgledem nowej osi:" +
                punkt01.obliczMometBezwladnosciWzdluzOsi(10.0F));
        List<PunktMaterialny> ListaTymczasowa = new ArrayList<>();
        for(int i = 0; i < 10; ++i) {
            ListaTymczasowa.add(new PunktMaterialny((float)i));
        }
        new PunktMaterialny();
        for(int i = 0; i < ListaTymczasowa.size(); ++i) {
            PunktMaterialny temp = (PunktMaterialny)ListaTymczasowa.get(i);
            System.out.println("Punkt pierwszy \tOpis: " + temp.opis());
            System.out.println("\tMasa:" + temp.pobierzMase());
            System.out.println("\tGlowny momet bezwladnosci:" +
                    temp.pobierzGlownyMomentBezwladnosci());
            System.out.println("\tMomet bezwladnosci wzgledem nowej osi:" +
                    temp.obliczMometBezwladnosciWzdluzOsi(10.0F));
        }
    }
}