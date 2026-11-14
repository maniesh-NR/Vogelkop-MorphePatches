package defpackage;

import android.os.Build;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;

/* loaded from: classes.dex */
public final class w4n {
    public final z8b a;
    public final zpl b;
    public final CameraUseInconsistentTimebaseQuirk c;
    public long d = -1;
    public zpl e;

    public w4n(z8b z8bVar, zpl zplVar, CameraUseInconsistentTimebaseQuirk cameraUseInconsistentTimebaseQuirk) {
        this.a = z8bVar;
        this.b = zplVar;
        this.c = cameraUseInconsistentTimebaseQuirk;
    }

    public final long a(long j) {
        boolean z;
        zpl zplVar = this.e;
        z8b z8bVar = this.a;
        if (zplVar == null) {
            CameraUseInconsistentTimebaseQuirk cameraUseInconsistentTimebaseQuirk = this.c;
            zpl zplVar2 = this.b;
            if (cameraUseInconsistentTimebaseQuirk != null) {
                z = false;
            } else if (z8bVar.K() - z8bVar.O() > 3000000) {
                z = true;
            } else {
                zplVar = zplVar2;
                this.e = zplVar;
            }
            zpl zplVar3 = Math.abs(j - z8bVar.K()) < Math.abs(j - z8bVar.O()) ? zpl.b : zpl.a;
            if (!z || zplVar3 == zplVar2) {
                zplVar3.toString();
            } else {
                int i = Build.VERSION.SDK_INT;
                String.format("Detected camera timebase inconsistent. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, Hardware: %s, API Level: %d%s].\nCamera timebase is inconsistent. The timebase reported by the camera is %s, but the actual timebase contained in the frame is detected as %s.", Build.MANUFACTURER, Build.MODEL, Build.HARDWARE, Integer.valueOf(i), i >= 31 ? ", SOC: " + t14.b() : "", this.b, zplVar3);
            }
            zplVar = zplVar3;
            this.e = zplVar;
        }
        int iOrdinal = zplVar.ordinal();
        if (iOrdinal == 0) {
            return j;
        }
        if (iOrdinal != 1) {
            t14.d(this.e, "Unknown timebase: ");
            return 0L;
        }
        long jMax = this.d;
        if (jMax == -1) {
            long j2 = Long.MAX_VALUE;
            long j3 = 0;
            for (int i2 = 0; i2 < 3; i2++) {
                long jO = z8bVar.O();
                long jK = z8bVar.K();
                long jO2 = z8bVar.O();
                long j4 = jO2 - jO;
                if (i2 == 0 || j4 < j2) {
                    j3 = jK - ((jO + jO2) >> 1);
                    j2 = j4;
                }
            }
            jMax = Math.max(0L, j3);
            this.d = jMax;
        }
        return j - jMax;
    }
}
