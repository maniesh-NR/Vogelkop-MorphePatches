package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import java.util.Collections;

/* loaded from: classes.dex */
public final class na8 implements trm {
    public final pa8 a;
    public qa8 b;
    public zrm c;

    public na8(pa8 pa8Var) {
        this.a = pa8Var;
        this.b = new qa8(pa8Var.d, pa8Var.c, pa8Var.e);
    }

    public final cd5 a(boolean z) {
        pa8 pa8Var = this.a;
        boolean z2 = pa8Var.d;
        Range range = pa8Var.c;
        if (!z2) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("ExposureCompensation is not supported");
            cd5 cd5Var = new cd5();
            cd5Var.B0(illegalArgumentException);
            return cd5Var;
        }
        if (!range.contains((Range) 0)) {
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Requested ExposureCompensation 0 is not within valid range [" + range.getUpper() + " .. " + range.getLower() + ']');
            cd5 cd5Var2 = new cd5();
            cd5Var2.B0(illegalArgumentException2);
            return cd5Var2;
        }
        zrm zrmVar = this.c;
        if (zrmVar == null) {
            gc4 gc4Var = new gc4("Camera is not active.");
            cd5 cd5Var3 = pa8Var.f;
            if (cd5Var3 != null) {
                cd5Var3.B0(gc4Var);
            }
            cd5 cd5Var4 = new cd5();
            cd5Var4.B0(gc4Var);
            return cd5Var4;
        }
        qa8 qa8Var = this.b;
        this.b = new qa8(qa8Var.a, qa8Var.b, qa8Var.c);
        tb5 tb5Var = pa8Var.b;
        cd5 cd5Var5 = new cd5();
        cd5 cd5Var6 = pa8Var.f;
        if (cd5Var6 != null) {
            if (z) {
                am2.z("Cancelled by another setExposureCompensationIndex()", cd5Var6);
            } else {
                p37.f0(cd5Var5, cd5Var6);
            }
        }
        pa8Var.f = cd5Var5;
        oa8 oa8Var = pa8Var.g;
        if (oa8Var != null) {
            tb5Var.b(oa8Var);
            pa8Var.g = null;
        }
        zrm.h(zrmVar, Collections.singletonMap(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, 0));
        oa8 oa8Var2 = new oa8(cd5Var5);
        tb5Var.a(oa8Var2, pa8Var.a.e);
        cd5Var5.s(new ry7(pa8Var, oa8Var2, (byte) 4));
        pa8Var.g = oa8Var2;
        return cd5Var5;
    }

    @Override // defpackage.trm
    public final void b(zrm zrmVar) {
        this.c = zrmVar;
        a(false);
    }

    @Override // defpackage.trm
    public final void reset() {
        qa8 qa8Var = this.b;
        this.b = new qa8(qa8Var.a, qa8Var.b, qa8Var.c);
        a(true);
    }
}
