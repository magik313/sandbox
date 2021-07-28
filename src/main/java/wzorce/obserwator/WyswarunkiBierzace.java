package wzorce.obserwator;

public class WyswarunkiBierzace implements Obserwator, WyswietlElement{

    private float temperatura;
    private float wilgotnosc;
    private Podmiot danePogodowe;

    public WyswarunkiBierzace(Podmiot danePogodowe) {
        this.danePogodowe = danePogodowe;
        danePogodowe.zarejestrujObserwatora(this);

    }

    @Override
    public void aktualizacja(float temp, float wilgotnosc, float cisnienie) {
        this.temperatura = temp;
        this.wilgotnosc = wilgotnosc;
        wyswietl();
    }

    @Override
    public void wyswietl() {
        System.out.println("Warunki bierzace " + temperatura + "C" + " wilgotnosc" + "%");
    }
}
