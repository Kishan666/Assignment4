package com.Question3.ISP.Disobey.Implementation;

import com.Question3.ISP.Disobey.Interface.MachineServiceIspBad;

/**
 * Created by Kishan on 2017/03/31.
 */
public class XeroxPrinterIspBad implements MachineServiceIspBad {
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
