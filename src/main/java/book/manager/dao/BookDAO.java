package book.manager.dao;

import book.manager.model.Book;

import java.util.List;

public interface BookDAO {
    public void addBook(Book book);

    public void updateBook(Book book);

    public void removeBook(int id);

    public Book getBookById(int id);

    public List<Book> listBooks();

}
