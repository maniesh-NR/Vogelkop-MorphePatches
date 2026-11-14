package defpackage;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ex6 {
    public final Spatializer a;
    public final boolean b;
    public final Handler c;
    public final dx6 d;

    public ex6(Context context, jx6 jx6Var, Boolean bool) {
        AudioManager audioManagerE = context == null ? null : scd.E(context);
        if (audioManagerE == null || (bool != null && bool.booleanValue())) {
            this.a = null;
            this.b = false;
            this.c = null;
            this.d = null;
            return;
        }
        Spatializer spatializer = audioManagerE.getSpatializer();
        this.a = spatializer;
        this.b = spatializer.getImmersiveAudioLevel() != 0;
        dx6 dx6Var = new dx6(jx6Var);
        this.d = dx6Var;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        Handler handler = new Handler(looperMyLooper);
        this.c = handler;
        spatializer.addOnSpatializerStateChangedListener(new jj5(handler, (byte) 0), dx6Var);
    }

    public final boolean a(pf2 pf2Var, oj9 oj9Var) throws IllegalArgumentException {
        String str = oj9Var.n;
        int i = oj9Var.F;
        if (Objects.equals(str, "audio/eac3-joc")) {
            if (i == 16) {
                i = 12;
            }
        } else if (Objects.equals(str, "audio/iamf")) {
            if (i == -1) {
                i = 6;
            }
        } else if (Objects.equals(str, "audio/ac4") && (i == 18 || i == 21)) {
            i = 24;
        }
        int iR = tym.r(i);
        if (iR == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iR);
        int i2 = oj9Var.G;
        if (i2 != -1) {
            channelMask.setSampleRate(i2);
        }
        Spatializer spatializer = this.a;
        spatializer.getClass();
        return spatializer.canBeSpatialized(pf2Var.b(), channelMask.build());
    }

    public final boolean b() {
        Spatializer spatializer = this.a;
        spatializer.getClass();
        return spatializer.isAvailable();
    }

    public final boolean c() {
        Spatializer spatializer = this.a;
        spatializer.getClass();
        return spatializer.isEnabled();
    }

    public final void d() {
        dx6 dx6Var;
        Handler handler;
        Spatializer spatializer = this.a;
        if (spatializer == null || (dx6Var = this.d) == null || (handler = this.c) == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(dx6Var);
        handler.removeCallbacksAndMessages(null);
    }
}
