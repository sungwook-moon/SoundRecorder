package com.danielkim.soundrecorder;

import sapphire.app.SapphireObject;
import sapphire.policy.ShiftPolicy;

/**
 * Created by Daniel on 5/22/2017.
 */

public class DoPrint implements SapphireObject<ShiftPolicy> {

    private int cnt = 0;

    public DoPrint(){

    }

    public void PrintMsg() {
        System.out.println("PrintMsg to test Sapphire. Cnt = " + cnt);
        cnt++;
    }
}
