package defpackage;

import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import java.util.Collections;

/* loaded from: classes.dex */
public final class jyd extends qrm {
    public final Size s;
    public final Object t;
    public r3j u;
    public s0b v;

    /* JADX WARN: Code restructure failed: missing block: B:36:0x009e, code lost:
    
        if (r0 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a0, code lost:
    
        r11 = r10[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a3, code lost:
    
        r11 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jyd(defpackage.pe4 r10, defpackage.iyd r11, defpackage.kb7 r12) {
        /*
            r9 = this;
            r9.<init>(r11)
            android.util.Size r11 = defpackage.kyd.a
            ge4 r10 = r10.b
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP
            ma4 r10 = (defpackage.ma4) r10
            java.lang.Object r10 = r10.c(r0)
            android.hardware.camera2.params.StreamConfigurationMap r10 = (android.hardware.camera2.params.StreamConfigurationMap) r10
            r0 = 0
            if (r10 != 0) goto L16
            r10 = r0
            goto L1c
        L16:
            r1 = 34
            android.util.Size[] r10 = r10.getOutputSizes(r1)
        L1c:
            if (r10 == 0) goto La4
            int r1 = r10.length
            if (r1 == 0) goto La4
            android.util.Size r11 = defpackage.ysk.a
            java.lang.Class<androidx.camera.camera2.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk> r11 = androidx.camera.camera2.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk.class
            tgh r11 = defpackage.d77.a(r11)
            androidx.camera.camera2.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk r11 = (androidx.camera.camera2.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk) r11
            r1 = 0
            if (r11 != 0) goto L30
            r11 = r10
            goto L53
        L30:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            int r2 = r10.length
            r3 = r1
        L37:
            if (r3 >= r2) goto L4b
            r4 = r10[r3]
            uc5 r5 = defpackage.ysk.b
            android.util.Size r6 = defpackage.ysk.a
            int r5 = r5.compare(r4, r6)
            if (r5 < 0) goto L48
            r11.add(r4)
        L48:
            int r3 = r3 + 1
            goto L37
        L4b:
            android.util.Size[] r2 = new android.util.Size[r1]
            java.lang.Object[] r11 = r11.toArray(r2)
            android.util.Size[] r11 = (android.util.Size[]) r11
        L53:
            int r2 = r11.length
            if (r2 == 0) goto L57
            r10 = r11
        L57:
            int r11 = r10.length
            r2 = 1
            if (r11 <= r2) goto L68
            au9 r11 = new au9
            r3 = 8
            r11.<init>(r3)
            int r3 = r10.length
            if (r3 <= r2) goto L68
            java.util.Arrays.sort(r10, r11)
        L68:
            android.util.Size r11 = r12.c()
            int r12 = r11.getWidth()
            long r2 = (long) r12
            int r11 = r11.getHeight()
            long r11 = (long) r11
            long r2 = r2 * r11
            r11 = 307200(0x4b000, double:1.51777E-318)
            long r11 = java.lang.Math.min(r11, r2)
            int r2 = r10.length
            r3 = r1
        L80:
            if (r3 >= r2) goto L9e
            r4 = r10[r3]
            int r5 = r4.getWidth()
            long r5 = (long) r5
            int r7 = r4.getHeight()
            long r7 = (long) r7
            long r5 = r5 * r7
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 != 0) goto L95
            r11 = r4
            goto La4
        L95:
            if (r5 <= 0) goto L9a
            if (r0 != 0) goto La3
            goto L9e
        L9a:
            int r3 = r3 + 1
            r0 = r4
            goto L80
        L9e:
            if (r0 != 0) goto La3
            r11 = r10[r1]
            goto La4
        La3:
            r11 = r0
        La4:
            r9.s = r11
            java.lang.Object r10 = new java.lang.Object
            r10.<init>()
            r9.t = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jyd.<init>(pe4, iyd, kb7):void");
    }

    @Override // defpackage.qrm
    public final to2 A(to2 to2Var, to2 to2Var2) {
        Size size = this.s;
        G(Collections.singletonList(J(size).b()));
        ne5 ne5VarB = to2Var.b();
        ne5VarB.a = size;
        return ne5VarB.p();
    }

    @Override // defpackage.qrm
    public final void B() {
        r3j r3jVar = this.u;
        if (r3jVar != null) {
            r3jVar.b();
        }
        this.u = null;
        synchronized (this.t) {
            s0b s0bVar = this.v;
            if (s0bVar != null) {
                s0bVar.a();
            }
            this.v = null;
        }
    }

    public final s0b I(Size size) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        s0b s0bVar = this.v;
        if (s0bVar != null) {
            s0bVar.a();
        }
        s0b s0bVar2 = new s0b(surface, size, this.h.m());
        this.v = s0bVar2;
        k1g.O(s0bVar2.e).addListener(new hpd(surface, surfaceTexture, (byte) 6), n97.a());
        return s0bVar2;
    }

    public final q3j J(Size size) {
        s0b s0bVarI;
        synchronized (this.t) {
            s0bVarI = I(size);
        }
        r3j r3jVar = this.u;
        if (r3jVar != null) {
            r3jVar.b();
        }
        r3j r3jVar2 = new r3j(new kva(this, size, (byte) 1));
        this.u = r3jVar2;
        q3j q3jVarC = q3j.c(new iyd(), size);
        q3jVarC.b.b = 1;
        q3jVarC.a(s0bVarI, ip7.d, -1);
        q3jVarC.f = r3jVar2;
        return q3jVarC;
    }

    public final void K() {
        H(to2.a(kyd.a).p(), null);
    }

    @Override // defpackage.qrm
    public final psm n(tj5 tj5Var) {
        return new ix5((byte) 18);
    }
}
