package com.Question3.LSP.Obey.Domain;

/**
 * Created by Kishan on 2017-03-31.
 */
public class ColourPrintLspGood extends NonColourPrintLspGood {

    public void print(int baseX, int baseY, int baseZ)
    {
        super.print(baseX);
        System.out.println("printing in colour...");
    }
}
