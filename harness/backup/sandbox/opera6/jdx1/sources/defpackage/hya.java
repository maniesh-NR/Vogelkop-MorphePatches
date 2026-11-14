package defpackage;

import android.util.Size;
import java.util.List;

/* loaded from: classes.dex */
public interface hya extends skh {
    public static final an2 kp = new an2("camerax.core.imageOutput.targetAspectRatio", na2.class, null);
    public static final an2 lp;
    public static final an2 np;
    public static final an2 op;
    public static final an2 pp;
    public static final an2 qp;
    public static final an2 rp;
    public static final an2 tp;
    public static final an2 up;
    public static final an2 vp;

    static {
        Class cls = Integer.TYPE;
        lp = new an2("camerax.core.imageOutput.targetRotation", cls, null);
        np = new an2("camerax.core.imageOutput.appTargetRotation", cls, null);
        op = new an2("camerax.core.imageOutput.mirrorMode", cls, null);
        pp = new an2("camerax.core.imageOutput.targetResolution", Size.class, null);
        qp = new an2("camerax.core.imageOutput.defaultResolution", Size.class, null);
        rp = new an2("camerax.core.imageOutput.maxResolution", Size.class, null);
        tp = new an2("camerax.core.imageOutput.supportedResolutions", List.class, null);
        up = new an2("camerax.core.imageOutput.resolutionSelector", zxh.class, null);
        vp = new an2("camerax.core.imageOutput.customOrderedResolutions", List.class, null);
    }

    static void t(hya hyaVar) {
        boolean zG = hyaVar.g(kp);
        boolean z = ((Size) hyaVar.b(pp, null)) != null;
        if (zG && z) {
            qp2.o("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        } else if (((zxh) hyaVar.b(up, null)) != null) {
            if (zG || z) {
                qp2.o("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    default int u(int i) {
        return ((Integer) b(lp, Integer.valueOf(i))).intValue();
    }
}
