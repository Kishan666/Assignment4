package com.Question3.ISP.Obey.Implementation;

import com.Question3.ISP.Obey.Interface.CopyServiceIspGood;
import com.Question3.ISP.Obey.Interface.PrintServiceIspGood;
import com.Question3.ISP.Obey.Interface.ScanServiceIspGood;

/**
 * Created by Kishan on 2017/03/31.
 */
public class XeroxPrinterIspGood implements PrintServiceIspGood, CopyServiceIspGood, ScanServiceIspGood
{
    public void print() {
        System.out.println("Printing job...");
    }

    public void copy() {
        System.out.println("Copying job...");
    }

    public void scan() {
        System.out.println("Scanning job...");
    }


}
