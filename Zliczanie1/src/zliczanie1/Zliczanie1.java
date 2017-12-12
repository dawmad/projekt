/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zliczanie1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class Zliczanie1 {



    
public static void main(String[] args) {
    try {
        System.out.println("Podaj ścieżkę dostępu do pliku: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sciezka = br.readLine();
        FileReader in = new FileReader(sciezka);
        System.out.println("Ilość linii: " + numberOfLines(in));
        System.out.println("Liczba slów: " + numberOFWords(in));
        in.close();
        br.close();

    } catch (FileNotFoundException e) {
        System.out.println("Plik nie istnieje");
        System.exit(1);
    } catch (IOException ex) {
        ex.printStackTrace();
    }
}

public static int numberOfLines(FileReader r) throws IOException {
    LineNumberReader ln = new LineNumberReader(r);
    int count = 0;
    while (ln.readLine() != null) {
        count++;
    }
    return count;
}

public static int numberOFWords(FileReader r) {
    Scanner skaner = new Scanner(r);
    int count = 0;
    while (skaner.hasNext()) {
        skaner.next();
        count++;
    }
    skaner.close();
    return count;
}
}

