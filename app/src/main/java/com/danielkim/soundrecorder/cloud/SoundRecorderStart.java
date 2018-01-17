package com.danielkim.soundrecorder.cloud;

/**
 * Created by s00432254 on 1/8/2018.
 */
import com.danielkim.soundrecorder.activities.SoundRecorderManager;

import sapphire.app.AppEntryPoint;
import sapphire.app.AppObjectNotCreatedException;
import static sapphire.runtime.Sapphire.*;
import sapphire.common.AppObjectStub;

public class SoundRecorderStart implements AppEntryPoint {

    @Override
    public AppObjectStub start() throws AppObjectNotCreatedException {
        return (AppObjectStub) new_(SoundRecorderManager.class);
    }
}

