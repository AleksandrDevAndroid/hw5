public class Book {
    public String title;
    public int releaseYear;
    public Author author ;
    public int page;

    public Book(String title, int releaseYear, Author author, int page){
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.page = page;
    }
    public String isBig(int page){
        return page >= 500 ? "Да":"Нет";
     }
     public String matches(String word){
         return word != null && this.title.toLowerCase().contains(word.toLowerCase()) ||
                 this.author.name.toLowerCase().contains(word.toLowerCase())
                 || this.author.surname.toLowerCase().contains(word.toLowerCase()) ? "Да":"Нет";
     }

     public int estimatePrice(int page){
        return page > 250 ? (int) Math.floor(Math.sqrt(author.rating) * (page * 3)) : 250;
     }
}
