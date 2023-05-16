package HomeWork11;

public class MainHomeWork {

    public static void main(String[] args) {
        Author sapkovski = new Author(" Анджей ", " Сапковский ");
        Author tven = new Author(" Марк ", " Твен ");
        Book vedmak = new Book(" Ведьмак ",  1986, sapkovski);
        Book soyer = new Book(" Приключения Тома Сойера ", 1876, tven );

        System.out.println(vedmak);
        System.out.println(soyer);
    }
}


