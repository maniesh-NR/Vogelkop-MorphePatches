package defpackage;

import android.util.Range;
import android.util.Size;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public interface qsm extends fcl, txa {
    public static final an2 Hp = new an2("camerax.core.useCase.defaultSessionConfig", u3j.class, null);
    public static final an2 Ip = new an2("camerax.core.useCase.defaultCaptureConfig", ai4.class, null);
    public static final an2 Jp = new an2("camerax.core.useCase.sessionConfigUnpacker", og4.class, null);
    public static final an2 Kp = new an2("camerax.core.useCase.captureConfigUnpacker", ng4.class, null);
    public static final an2 Lp;
    public static final an2 Mp;
    public static final an2 Np;
    public static final an2 Op;
    public static final an2 Pp;
    public static final an2 Qp;
    public static final an2 Rp;
    public static final an2 Sp;
    public static final an2 Tp;
    public static final an2 Up;
    public static final an2 Vp;
    public static final an2 Wp;
    public static final an2 Xp;

    static {
        Class cls = Integer.TYPE;
        Lp = new an2("camerax.core.useCase.surfaceOccupancyPriority", cls, null);
        Mp = new an2("camerax.core.useCase.sessionType", cls, null);
        Np = new an2("camerax.core.useCase.targetFrameRate", Range.class, null);
        Op = new an2("camerax.core.useCase.isStrictFrameRateRequired", Boolean.class, null);
        Pp = new an2("camerax.core.useCase.resolutionToMaxFrameRate", Map.class, null);
        Class cls2 = Boolean.TYPE;
        Qp = new an2("camerax.core.useCase.zslDisabled", cls2, null);
        Rp = new an2("camerax.core.useCase.highResolutionDisabled", cls2, null);
        Sp = new an2("camerax.core.useCase.captureType", ssm.class, null);
        Tp = new an2("camerax.core.useCase.previewStabilizationMode", cls, null);
        Up = new an2("camerax.core.useCase.videoStabilizationMode", cls, null);
        Vp = new an2("camerax.core.useCase.isVideoQualitySelectorDefault", Boolean.class, null);
        Wp = new an2("camerax.core.useCase.takePictureManagerProvider", osm.class, null);
        Xp = new an2("camerax.core.useCase.streamUseCase", igk.class, null);
    }

    default igk B() {
        igk igkVar = (igk) b(Xp, igk.DEFAULT);
        Objects.requireNonNull(igkVar);
        return igkVar;
    }

    default ssm C() {
        return (ssm) i(Sp);
    }

    default int D(Size size) {
        Map map = (Map) b(Pp, null);
        if (map == null || !map.containsKey(size)) {
            return Integer.MAX_VALUE;
        }
        Integer num = (Integer) map.get(size);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    default int o() {
        return ((Integer) b(Up, 0)).intValue();
    }

    default int r() {
        return ((Integer) b(Tp, 0)).intValue();
    }
}
