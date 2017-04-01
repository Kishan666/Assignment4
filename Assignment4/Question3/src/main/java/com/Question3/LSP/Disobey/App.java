package com.Question3.LSP.Disobey;

/**
 * Created by Kishan on 2017-03-31.
 */
public class App {
    public static void main (String[] args)
    {
        PrinterLspBad printLspBad = new PrinterLspBad();
        printLspBad.print(3);
        try {
            printLspBad.print(1, 2, 3);
        }catch(Exception e)
        {
            System.out.println("This printer cannot print in colour.");
        }
    }
}
