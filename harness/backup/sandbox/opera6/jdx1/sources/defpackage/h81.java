package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* loaded from: classes.dex */
public final class h81 implements inm {
    public final OutputConfiguration a;
    public final Surface b;

    public h81(OutputConfiguration outputConfiguration) {
        this.a = outputConfiguration;
        this.b = outputConfiguration.getSurface();
    }

    @Override // defpackage.inm
    public final Object E(s15 s15Var) {
        if (s15Var.equals(uqh.a(OutputConfiguration.class))) {
            return this.a;
        }
        return null;
    }

    public final String toString() {
        return this.a.toString();
    }
}
