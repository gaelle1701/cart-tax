package com.gc;

public class Main {
    public static void main(String[] args) {

        Product livre = new Product("Livre 1", 12.49, 10, false);

        System.out.println("Produit : "+livre.getName());
        System.out.println("HT : "+livre.getHt()+" + TVA : "+livre.getTva());
        System.out.println("Is imported ? : "+livre.isImported);
        System.out.println("TTC : "+livre.calculateTtc());
    }
}