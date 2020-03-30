public class Main {

    public static void main(String[] args) {
        Plane plane = new Plane.Builder()
                .withName("LITACHOK")
                .withdateProizvdotsva(2222200)
                .withAge(-111111)
                .withkolichestvoKoles(76498)
                .withstranaProizdatsva("Konoxa")
                .withcolor("sero-buro-makinoviy")
                .build();
        Plane.Builder p1 = new Plane.Builder();
    }
}