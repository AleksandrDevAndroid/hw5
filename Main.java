//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Author Hennry = new Author("Оливье","Генри",5);

        Book book = new Book("Сборник рассказов Благородные жулики",1908,Hennry,333);


        System.out.println(book.matches("генри"));
        System.out.printf("Это большая книга?: %s\n",book.isBig(333));
        System.out.printf("Стоимость книги: %s рублей\n",book.estimatePrice(333));


    }
}