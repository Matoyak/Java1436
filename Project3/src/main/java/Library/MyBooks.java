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

        flag = true;
        do {
            String choice = JOptionPane.showInputDialog("How do you wish to search your books:\n"
                    + "1. Name\n"
                    + "2. Genre");

            switch (choice) {
                case "1":
                    searchBooksName(books);
                    int confirm = JOptionPane.showConfirmDialog(null, "Do you wish to search again?");
                    if (confirm == JOptionPane.NO_OPTION || confirm == JOptionPane.CANCEL_OPTION) {
                        flag = false;
                    }
                    break;
                case "2":
                    searchBooksGenre(books);
                    confirm = JOptionPane.showConfirmDialog(null, "Do you wish to search again?");
                    if (confirm == JOptionPane.NO_OPTION || confirm == JOptionPane.CANCEL_OPTION) {
                        flag = false;
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid input. Please try again.");
            }
        } while (flag);
        //binarySearch(books,"Apple", "1", 0, books.size());
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
            char bCh = books.get(j - 1).getName().charAt(0);
            char tCh = tempBook.getName().charAt(0);
            while (j > 0 && bCh > tCh) {
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
            char bCh = books.get(j - 1).getGenre().toLowerCase().charAt(k);
            char tCh = tempBook.getGenre().toLowerCase().charAt(k);
            while (j > 0 && bCh > tCh) {
                books.get(j).setName(books.get(j - 1).getName());
                books.get(j).setGenre(books.get(j - 1).getGenre());
                j -= 1;
            }
            books.get(j).setName(tempBook.getName());
            books.get(j).setGenre(tempBook.getGenre());
        }
        display(books);
    }

    private static void searchBooksName(List<Book> books) {
        String name = JOptionPane.showInputDialog("Please enter the name to search for: ");
        boolean check = false;
        for(Book b : books){
            if(b.getName().equalsIgnoreCase(name)) {
                JOptionPane.showMessageDialog(null, "We have found "+b.getName() + ".");
                check = true;
            }
        }
        if (!check) {
            JOptionPane.showMessageDialog(null, "We did not find any books by that name.");
        }
    }

    private static void searchBooksGenre(List<Book> books) {
        String genre = JOptionPane.showInputDialog("Please enter the name to search for: ");
        boolean check = false;
        for(Book b : books){
            if(b.getGenre().equalsIgnoreCase(genre)) {
                JOptionPane.showMessageDialog(null, "We have found "+b.getGenre() + ".");
                check = true;
            }
        }
        if (!check) {
            JOptionPane.showMessageDialog(null, "We did not find any books with that genre.");
        }
    }



    //I could not get this to properly work. Due to work, I ran out of time. I believe the issue is due to the recursion
    //and going too complex too quickly. I built it up too quickly to fully grasp, especially when combined with the
    //unfortunate dirtiness of my sorting and searching algs. I could break it down and fix it, but I am running out of
    //time. So linear search unconnected to sort, rather than a binary search.

    /*public static String binarySearch(List<Book> books, String key, String choice, int min, int max) {
        *//*switch (choice) {
            case "1":
                sortBooksName(books);
                break;
            case "2":
                sortBooksGenre(books);
                break;
            default:
                return "ERROR: Invalid Input.";
        }*//*
        switch (choice) {
            case "1":
                if (max < min) {
                    return "Item Not Found.";
                } else {
                    int midpoint = books.size() / 2;
                    String searchValue = books.get(midpoint).getName();
                    int compValue = key.compareToIgnoreCase(searchValue);
                    if (compValue > 0) {
                        return binarySearch(books, key, choice, min, midpoint - 1);
                    } else if (compValue < 0) {
                        return binarySearch(books, key, choice, midpoint + 1, max);
                    } else {
                        return searchValue;
                    }
                }
            case "2":
                if (max < min) {
                    return "Item Not Found.";
                } else {
                    int midpoint = books.size() / 2;
                    String searchValue = books.get(midpoint).getGenre();
                    int compValue = key.compareToIgnoreCase(searchValue);
                    if (compValue > 0) {
                        return binarySearch(books, key, choice, min, midpoint - 1);
                    } else if (compValue < 0) {
                        return binarySearch(books, key, choice, midpoint + 1, max);
                    } else {
                        return searchValue;
                    }
                }
            default:
                return "ERROR: Invalid Input.";
        }
    }*/
}
