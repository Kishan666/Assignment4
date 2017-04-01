package com.Question3.LSP.Obey.Domain;

/**
 * Created by Kishan on 2017-03-31.
 */
public class App {
    public static void main  (String[] args)
    {
        ColourPrintLspGood printLspGood = new ColourPrintLspGood();
        NonColourPrintLspGood test = new NonColourPrintLspGood();
        test = printLspGood;
        printLspGood.print(1, 2, 3);
    }
}
