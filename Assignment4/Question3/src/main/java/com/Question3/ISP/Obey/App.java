package com.Question3.ISP.Obey;

import com.Question3.ISP.Obey.Implementation.HpPrinterIspGood;
import com.Question3.ISP.Obey.Implementation.XeroxPrinterIspGood;

/**
 * Created by Kishan on 2017-03-31.
 */
public class App {
    public static void main(String[] args) {
        HpPrinterIspGood hp = new HpPrinterIspGood();
        XeroxPrinterIspGood xe = new XeroxPrinterIspGood();
        hp.copy();
        hp.print();
        xe.scan();
        xe.print();
        xe.copy();
    }
}
