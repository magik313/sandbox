package wzorce.obserwator;

import java.util.ArrayList;

public class DanePogodowe implements Podmiot{
    private ArrayList obserwatorzy;
    private float temperatura;
    private float wilgotnosc;
    private float cisnienie;

    public DanePogodowe() {
        obserwatorzy = new ArrayList();
    }


    @Override
    public void zarejestrujObserwatora(Obserwator o) {
        obserwatorzy.add(o);
    }

    @Override
    public void usunObserwatora(Obserwator o) {
        int i = obserwatorzy.indexOf(o);
        if (i >= 0){
            obserwatorzy.remove(o);
        }
    }

    @Override
    public void powiadomObserwatorow() {
        for (Object o: obserwatorzy) {
            ((Obserwator)o).aktualizacja(temperatura, wilgotnosc, cisnienie);
        }
    }

    public void odczytyZmiana(){
        powiadomObserwatorow();
    }

    public void ustawOdczyty(float temperatura, float wilgotnosc, float cisnienie){
        this.temperatura = temperatura;
        this.wilgotnosc = wilgotnosc;
        this.cisnienie = cisnienie;
        odczytyZmiana();
    }
}
