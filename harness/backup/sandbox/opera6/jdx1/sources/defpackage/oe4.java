package defpackage;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class oe4 {
    public final Executor a;

    public oe4(b2j b2jVar, int i) {
        this.a = (i & 8) != 0 ? null : b2jVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof oe4) && Intrinsics.a(this.a, ((oe4) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        Executor executor = this.a;
        return (executor == null ? 0 : executor.hashCode()) * 29791;
    }

    public final String toString() {
        return "ThreadConfig(defaultLightweightExecutor=null, defaultBackgroundExecutor=null, defaultBlockingExecutor=null, defaultCameraExecutor=" + this.a + ", defaultCameraHandler=null, defaultCameraHandlerFn=null, testOnlyScope=null)";
    }
}
