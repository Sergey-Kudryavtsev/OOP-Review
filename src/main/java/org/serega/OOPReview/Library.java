package org.serega.OOPReview;

import java.util.ArrayList;
import java.util.List;

// Библиотека
public class Library {
   private List<Publication> publications = new ArrayList<>();

   public void addPublication(Publication pub) {
       publications.add(pub);
   }

   public void listPublication() {
       for (Publication p : publications) {
           System.out.println("Список публикаций: " + p.toString());
       }
   }

   public void searchByAuthor(String author) {
       boolean found = false;
       for (Publication p : publications) {
           if(p.getAuthor().equalsIgnoreCase(author)) {
               System.out.println(p.toString());
               found = true;
           }
        }
       if (!found) {
           System.out.println("У данного автора нет публикаций");
       }
   }

   public int countPublication() {
       return publications.size();
   }
}
