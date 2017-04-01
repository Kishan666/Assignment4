package com.Question3.ISP.Obey.Implementation;

import com.Question3.ISP.Obey.Interface.CopyServiceIspGood;
import com.Question3.ISP.Obey.Interface.PrintServiceIspGood;

/**
 * Created by Kishan on 2017/03/31.
 */
public class HpPrinterIspGood implements PrintServiceIspGood, CopyServiceIspGood {
    public void copy() {
        System.out.println("Copying job...");
    }

    public void print() {
        System.out.println("Printing job...");
    }
}
