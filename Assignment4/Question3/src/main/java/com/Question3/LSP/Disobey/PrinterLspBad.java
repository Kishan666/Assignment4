package com.Question3.LSP.Disobey;

import java.rmi.UnexpectedException;

/**
 * Created by Kishan on 2017-03-31.
 */
public class PrinterLspBad
{
    public void print(int baseX)
    {
        System.out.println("printing in non colour...");
    }
    public void print(int baseX, int baseY, int baseZ)
    {
        throw new UnsupportedOperationException();
    }
}
