package Library;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Library of Project3
 * Created by Mason Matlock on 7/16/2015.
 */
public class MyBooks {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        boolean flag = true;
        do {
            String make = JOptionPane.showInputDialog("What is the name of your book?");
            String model = JOptionPane.showInputDialog("What is the genre of this book?");
            Book book = new Book(make, model);
            books.add(book);
            int confirm = JOptionPane.showConfirmDialog(null, "Do you wish to add more books?");
            if (confirm == JOptionPane.NO_OPTION || confirm == JOptionPane.CANCEL_OPTION) {
                flag = false;
            }
        } while (flag);

        if (books.size() == 0) {
            JOptionPane.showMessageDialog(null, "There are no books. No Sorting or Searching can be done.");
            flag = false;
        } else {
            flag = true;
        }

        do {
            String choice = JOptionPane.showInputDialog("How do you wish to sort your books:\n"
                    + "1. Name\n"
                    + "2. Genre");

            switch (choice) {
                case "1":
                    sortBooksName(books);
                    int confirm = JOptionPane.showConfirmDialog(null, "Do you wish to sort again?");
                    if (confirm == JOptionPane.NO_OPTION || confirm == JOptionPane.CANCEL_OPTION) {
                        flag = false;
                    }
                    break;
                case "2":
                    sortBooksGenre(books);
                    confirm = JOptionPane.showConfirmDialog(null, "Do you wish to sort again?");
                    if (confirm == JOptionPane.NO_OPTION || confirm == JOptionPane.CANCEL_OPTION) {
                        flag = false;
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid input. Please try again.");
            }
        } while (flag);
    }

    public static void display(List<Book> books) {
        String output = "";
        for (Book b : books) {
            output += "Name: " + b.getName() + "\nGenre: " + b.getGenre() + "\n\n";
        }
        JOptionPane.showMessageDialog(null, output);
    }

    public static void sortBooksName(List<Book> books) {
        Book tempBook = new Book();
        int i, j;

        for (i = 1; i < books.size(); ++i) {
            tempBook.setName(books.get(i).getName());
            tempBook.setGenre(books.get(i).getGenre());
            j = i;
            while (j > 0 && (books.get(j - 1).getName().charAt(0) > tempBook.getName().charAt(0))) {
                books.get(j).setName(books.get(j - 1).getName());
                books.get(j).setGenre(books.get(j - 1).getGenre());
                j -= 1;
            }
            books.get(j).setName(tempBook.getName());
            books.get(j).setGenre(tempBook.getGenre());
        }
        display(books);
    }

    public static void sortBooksGenre(List<Book> books) {
        Book tempBook = new Book();
        int i, j, k;

        for (i = 1; i < books.size(); ++i) {
            tempBook.setName(books.get(i).getName());
            tempBook.setGenre(books.get(i).getGenre());
            k = 0;
            j = i;
            /*while (books.get(j - 1).getGenre().toLowerCase().charAt(k) == tempBook.getGenre().toLowerCase().charAt(k) && books.get(j - 1).getGenre().length() != tempBook.getGenre().length()) {
                ++k;
                System.out.println("k: " + k);
            }*/
            while (j > 0 && (books.get(j - 1).getGenre().toLowerCase().charAt(k) > tempBook.getGenre().toLowerCase().charAt(k))) {
                /*System.out.println(books.get(j - 1).getGenre().toLowerCase().charAt(k));
                System.out.println(tempBook.getGenre().toLowerCase().charAt(k));*/
                books.get(j).setName(books.get(j - 1).getName());
                books.get(j).setGenre(books.get(j - 1).getGenre());
                j -= 1;
            }
            books.get(j).setName(tempBook.getName());
            books.get(j).setGenre(tempBook.getGenre());
        }
        display(books);
    }

    public static String binarySearch() {
        return "There are no books.";
    }
}
