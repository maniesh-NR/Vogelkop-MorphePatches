package androidx.media3.exoplayer;

import android.os.Build;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.image.ImageOutput;
import defpackage.cqp;
import defpackage.gig;
import defpackage.tym;

/* loaded from: classes.dex */
public interface ExoPlayer extends gig {
    public static final short a;

    static {
        String str = tym.a;
        String strK0 = cqp.K0(Build.DEVICE);
        a = (strK0.contains("emulator") || strK0.contains("emu64a") || strK0.contains("emu64x") || strK0.contains("generic")) ? (short) 30000 : (short) 10000;
    }

    boolean isScrubbingModeEnabled();

    void setImageOutput(@Nullable ImageOutput imageOutput);

    void setScrubbingModeEnabled(boolean z);
}
