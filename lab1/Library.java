public class Library {
    private List<Book> books; // Використовуємо List<Book> для зберігання книг

    public Library() {
        books = new ArrayList<>(); // Ініціалізація колекції книг
    }

    public void addBook(Book book) {
        books.add(book); // Додавання книги до колекції
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book); // Виведення книг на екран
        }
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book; // Знайдена книга за назвою
            }
        }
        return null; // Книга з такою назвою не знайдена
    }

    public void removeBookByIsbn(String isbn) {
        Book bookToRemove = null;
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                bookToRemove = book;
                break; // Знаходження книги за ISBN та виход із циклу
            }
        }
        if (bookToRemove != null) {
            books.remove(bookToRemove); // Видалення книги з колекції
        }
    }

}
