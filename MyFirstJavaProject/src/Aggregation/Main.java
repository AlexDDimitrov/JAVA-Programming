package Aggregation;

public class Main {
    public void main(String[] args) {

        Book book1 = new Book("The Fellow of the Ring", 423);
        Book book2 = new Book("The Two Towers", 352);
        Book book3 = new Book("The Return of the Jedi", 416);

        Book[] books = {book1, book2, book3};

        Library library = new Library("NYC Public Library", 1897, books);//aggregation -> books part of Library
        //has - a relation between objects
        //one object is a part of another but the contained object can exist independently

        library.displayInfo();
    }
}
