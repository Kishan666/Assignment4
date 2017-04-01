package com.Question3.ISP.Disobey;

import com.Question3.ISP.Disobey.Implementation.HpPrinterIspBad;
import com.Question3.ISP.Disobey.Implementation.XeroxPrinterIspBad;

/**
 * Created by Kishan on 2017-03-31.
 */
public class App {
    public static void main (String[] args)
    {
        HpPrinterIspBad hpBad = new HpPrinterIspBad();
        XeroxPrinterIspBad xeBad = new XeroxPrinterIspBad();
        hpBad.copy();
        hpBad.print();
        hpBad.scan();
        xeBad.scan();
        xeBad.print();
        xeBad.scan();
    }
}
