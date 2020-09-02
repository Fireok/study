package com.JuniorJava;

import java.util.Scanner;
import static java.lang.Character.isLetter;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user_input;
        String output = "";
        String [] splitwords;
        char [] splitbysymbol;
        System.out.print("Введите строку: ");
        user_input = sc.nextLine();
        splitwords = user_input.split(" "); //разедляем введеную строку пользователем на слова

        for (int i = 0; i<=splitwords.length-1; i++){
            splitbysymbol=splitwords[i].toCharArray();
            for(int j = 0; j<(splitbysymbol.length/2); j++){
                if(isLetter(splitbysymbol[j])) {
                    if(isLetter(splitbysymbol[splitbysymbol.length - 1 - j])){
                    char temp;
                    temp = splitbysymbol[j];
                    splitbysymbol[j] = splitbysymbol[splitbysymbol.length - (1+j)];
                    splitbysymbol[splitbysymbol.length - 1 - j] = temp;
                }
                }
            }
            for (int j = 0; j<=splitbysymbol.length-1; j++){
                output += splitbysymbol[j];
            }
            output = output + " ";
        }
        System.out.println("Анаграмма веденой строки: " + output);
    }
}





