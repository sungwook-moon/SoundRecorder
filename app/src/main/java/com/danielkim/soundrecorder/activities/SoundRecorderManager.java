package com.danielkim.soundrecorder.activities;

import com.danielkim.soundrecorder.DoPrint;

import sapphire.app.SapphireObject;
import sapphire.policy.ShiftPolicy;

import static sapphire.runtime.Sapphire.new_;

/**
 * Created by s00432254 on 1/8/2018.
 */

public class SoundRecorderManager implements SapphireObject<ShiftPolicy> {
    private DoPrint doPrint;

    public SoundRecorderManager () {
        doPrint = (DoPrint) new_(DoPrint.class);
    }

    public DoPrint getDoPrintManager() { return doPrint; }
}
