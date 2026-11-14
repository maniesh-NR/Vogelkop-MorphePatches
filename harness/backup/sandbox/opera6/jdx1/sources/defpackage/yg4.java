package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class yg4 implements fcl {
    public static final an2 b = new an2("camerax.core.appConfig.cameraFactoryProvider", ed4.class, null);
    public static final an2 c = new an2("camerax.core.appConfig.deviceSurfaceManagerProvider", ua4.class, null);
    public static final an2 d = new an2("camerax.core.appConfig.useCaseConfigFactoryProvider", va4.class, null);
    public static final an2 e = new an2("camerax.core.appConfig.cameraExecutor", Executor.class, null);
    public static final an2 f = new an2("camerax.core.appConfig.schedulerHandler", Handler.class, null);
    public static final an2 g = new an2("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE, null);
    public static final an2 h = new an2("camerax.core.appConfig.availableCamerasLimiter", jf4.class, null);
    public static final an2 i = new an2("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE, null);
    public static final an2 j = new an2("camerax.core.appConfig.cameraProviderInitRetryPolicy", i1i.class, null);
    public static final an2 k = new an2("camerax.core.appConfig.quirksSettings", ugh.class, null);
    public static final an2 l = new an2("camerax.core.appConfig.repeatingStreamForced", Boolean.TYPE, null);
    public final wrf a;

    public yg4(wrf wrfVar) {
        this.a = wrfVar;
    }

    @Override // defpackage.skh
    public final tj5 a() {
        return this.a;
    }

    public final jf4 f() {
        return (jf4) this.a.b(h, null);
    }

    public final ed4 k() {
        return (ed4) this.a.b(b, null);
    }

    public final long l() {
        return ((Long) this.a.b(i, -1L)).longValue();
    }

    public final ua4 q() {
        return (ua4) this.a.b(c, null);
    }

    public final va4 s() {
        return (va4) this.a.b(d, null);
    }
}
