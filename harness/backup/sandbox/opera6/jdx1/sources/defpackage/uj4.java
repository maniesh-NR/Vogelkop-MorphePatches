package defpackage;

import android.hardware.camera2.CaptureResult;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class uj4 implements yb4, inm {
    public final owh a;
    public final go9 b;

    public uj4(owh owhVar, go9 go9Var) {
        this.a = owhVar;
        this.b = go9Var;
    }

    @Override // defpackage.inm
    public final Object E(s15 s15Var) {
        boolean zEquals = s15Var.equals(uqh.a(go9.class));
        go9 go9Var = this.b;
        return zEquals ? go9Var : go9Var.E(s15Var);
    }

    @Override // defpackage.yb4
    public final void a(xg8 xg8Var) {
        super.a(xg8Var);
        ArrayList arrayList = xg8Var.a;
        x61 metadata = this.b.getMetadata();
        try {
            Integer num = (Integer) metadata.c(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                xg8Var.d(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
        }
        if (((Long) metadata.c(CaptureResult.SENSOR_EXPOSURE_TIME)) != null) {
            xg8Var.c("ExposureTime", String.valueOf(r1.longValue() / 1.0E9d), arrayList);
        }
        Float f = (Float) metadata.c(CaptureResult.LENS_APERTURE);
        if (f != null) {
            xg8Var.c("FNumber", String.valueOf(f.floatValue()), arrayList);
        }
        Integer num2 = (Integer) metadata.c(CaptureResult.SENSOR_SENSITIVITY);
        if (num2 != null) {
            int iIntValue = num2.intValue();
            xg8Var.c("SensitivityType", String.valueOf(3), arrayList);
            xg8Var.c("PhotographicSensitivity", String.valueOf(Math.min(65535, iIntValue)), arrayList);
            if (((Integer) metadata.c(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                xg8Var.c("SensitivityType", String.valueOf(3), arrayList);
                xg8Var.c("PhotographicSensitivity", String.valueOf(Math.min(65535, iIntValue * ((int) (r5.intValue() / 100.0f)))), arrayList);
            }
        }
        Float f2 = (Float) metadata.c(CaptureResult.LENS_FOCAL_LENGTH);
        if (f2 != null) {
            xg8Var.c("FocalLength", ((long) (f2.floatValue() * 1000.0f)) + "/1000", arrayList);
        }
        Integer num3 = (Integer) metadata.c(CaptureResult.CONTROL_AWB_MODE);
        if (num3 != null) {
            int iA = vep.A(num3.intValue() == 0 ? 2 : 1);
            xg8Var.c("WhiteBalance", iA != 0 ? iA != 1 ? null : String.valueOf(1) : String.valueOf(0), arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    @Override // defpackage.yb4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c() {
        /*
            r6 = this;
            go9 r6 = r6.b
            x61 r6 = r6.getMetadata()
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.FLASH_STATE
            java.lang.Object r0 = r6.c(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r1 = 2
            if (r0 == 0) goto L17
            int r2 = r0.intValue()
            if (r2 == 0) goto L4c
        L17:
            r2 = 1
            if (r0 == 0) goto L20
            int r3 = r0.intValue()
            if (r3 == r2) goto L4c
        L20:
            r3 = 4
            r4 = 3
            if (r0 == 0) goto L31
            int r5 = r0.intValue()
            if (r5 != r1) goto L2b
            return r4
        L2b:
            int r1 = r0.intValue()
            if (r1 == r4) goto L4b
        L31:
            if (r0 == 0) goto L4a
            int r0 = r0.intValue()
            if (r0 == r3) goto L4b
            java.lang.String r0 = "CXCP"
            boolean r0 = defpackage.gyg.G(r4, r0)
            if (r0 == 0) goto L4a
            android.hardware.camera2.CaptureResult r6 = r6.a
            long r0 = r6.getFrameNumber()
            defpackage.ho9.a(r0)
        L4a:
            return r2
        L4b:
            return r3
        L4c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj4.c():int");
    }

    @Override // defpackage.yb4
    public final hbl d() {
        return (hbl) this.a.b(kbl.a, hbl.b);
    }

    @Override // defpackage.yb4
    public final long e() {
        Object objC = this.b.getMetadata().c(CaptureResult.SENSOR_TIMESTAMP);
        return ((Number) (objC != null ? objC : -1L)).longValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    @Override // defpackage.yb4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.vb4 p() {
        /*
            r4 = this;
            go9 r4 = r4.b
            x61 r4 = r4.getMetadata()
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AF_STATE
            java.lang.Object r0 = r4.c(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r1 = 3
            if (r0 == 0) goto L20
            int r2 = r0.intValue()
            if (r2 != 0) goto L1a
            vb4 r4 = defpackage.vb4.b
            return r4
        L1a:
            int r2 = r0.intValue()
            if (r2 == r1) goto L6d
        L20:
            if (r0 == 0) goto L29
            int r2 = r0.intValue()
            r3 = 1
            if (r2 == r3) goto L6d
        L29:
            if (r0 == 0) goto L35
            int r2 = r0.intValue()
            r3 = 4
            if (r2 != r3) goto L35
            vb4 r4 = defpackage.vb4.f
            return r4
        L35:
            if (r0 == 0) goto L41
            int r2 = r0.intValue()
            r3 = 5
            if (r2 != r3) goto L41
            vb4 r4 = defpackage.vb4.g
            return r4
        L41:
            if (r0 == 0) goto L4d
            int r2 = r0.intValue()
            r3 = 2
            if (r2 != r3) goto L4d
            vb4 r4 = defpackage.vb4.d
            return r4
        L4d:
            vb4 r2 = defpackage.vb4.a
            if (r0 == 0) goto L6c
            int r0 = r0.intValue()
            r3 = 6
            if (r0 != r3) goto L5b
            vb4 r4 = defpackage.vb4.e
            return r4
        L5b:
            java.lang.String r0 = "CXCP"
            boolean r0 = defpackage.gyg.G(r1, r0)
            if (r0 == 0) goto L6c
            android.hardware.camera2.CaptureResult r4 = r4.a
            long r0 = r4.getFrameNumber()
            defpackage.ho9.a(r0)
        L6c:
            return r2
        L6d:
            vb4 r4 = defpackage.vb4.c
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj4.p():vb4");
    }

    @Override // defpackage.yb4
    public final wb4 q() {
        x61 metadata = this.b.getMetadata();
        Integer num = (Integer) metadata.c(CaptureResult.CONTROL_AWB_STATE);
        if (num != null && num.intValue() == 0) {
            return wb4.b;
        }
        if (num != null && num.intValue() == 1) {
            return wb4.c;
        }
        wb4 wb4Var = wb4.a;
        if (num != null) {
            if (num.intValue() == 2) {
                return wb4.d;
            }
            if (num.intValue() == 3) {
                return wb4.e;
            }
            if (gyg.G(3, "CXCP")) {
                ho9.a(metadata.a.getFrameNumber());
            }
        }
        return wb4Var;
    }

    @Override // defpackage.yb4
    public final ub4 t() {
        x61 metadata = this.b.getMetadata();
        Integer num = (Integer) metadata.c(CaptureResult.CONTROL_AE_STATE);
        if (num != null && num.intValue() == 0) {
            return ub4.b;
        }
        if ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 5)) {
            return ub4.c;
        }
        if (num != null && num.intValue() == 4) {
            return ub4.d;
        }
        ub4 ub4Var = ub4.a;
        if (num != null) {
            if (num.intValue() == 2) {
                return ub4.e;
            }
            if (num.intValue() == 3) {
                return ub4.f;
            }
            if (gyg.G(3, "CXCP")) {
                ho9.a(metadata.a.getFrameNumber());
            }
        }
        return ub4Var;
    }
}
