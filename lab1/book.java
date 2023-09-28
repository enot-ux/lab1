public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add a Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Find a Book by Title");
            System.out.println("4. Remove a Book by ISBN");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Очищення буфера після введення числа

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Enter year of publication: ");
                    int year = scanner.nextInt();
                    library.addBook(new Book(title, author, isbn, year));
                    System.out.println("Book added successfully!");
                    break;
                case 2:
                    System.out.println("\nAll books in the library:");
                    library.displayBooks();
                    break;
                case 3:
                    System.out.print("Enter the title to search for: ");
                    String searchTitle = scanner.nextLine();
                    Book foundBook = library.findBookByTitle(searchTitle);
                    if (foundBook != null) {
                        System.out.println("Found book: " + foundBook.toString());
                    } else {
                        System.out.println("Book not found: " + searchTitle);
                    }
                    break;
                case 4:
                    System.out.print("Enter ISBN to remove: ");
                    String isbnToRemove = scanner.nextLine();
                    library.removeBookByIsbn(isbnToRemove);
                    System.out.println("Book removed successfully!");
                    break;
                case 5:
                    System.out.println("Exiting the application.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
