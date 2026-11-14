package org.chromium.device.sensors;

import android.content.Context;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import defpackage.t8;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class PlatformSensorProvider {
    public SensorManager a;
    public HandlerThread b;
    public Handler c;
    public final HashSet d = new HashSet();

    public PlatformSensorProvider(Context context) {
        this.a = (SensorManager) context.getSystemService("sensor");
    }

    public static PlatformSensorProvider create() {
        return new PlatformSensorProvider(t8.a);
    }

    public final boolean hasSensorType(int i) {
        if (this.a == null) {
            return false;
        }
        int i2 = 5;
        if (i != 0) {
            if (i == 1) {
                i2 = 1;
            } else if (i == 2) {
                i2 = 10;
            } else if (i == 3) {
                i2 = 9;
            } else if (i == 4) {
                i2 = 4;
            } else if (i == 5) {
                i2 = 2;
            } else if (i == 7) {
                i2 = 11;
            } else {
                if (i != 9) {
                    return false;
                }
                i2 = 15;
            }
        }
        return !r6.getSensorList(i2).isEmpty();
    }

    public final void setSensorManagerToNullForTesting() {
        this.a = null;
    }
}
