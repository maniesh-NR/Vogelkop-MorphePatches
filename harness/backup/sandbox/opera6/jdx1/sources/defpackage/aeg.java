package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraMetadata;

/* loaded from: classes.dex */
public final class aeg implements ud4, inm {
    public final pe4 a;
    public final zyk b = z4c.b(new d8e(this, (byte) 16));

    public aeg(pe4 pe4Var) {
        this.a = pe4Var;
    }

    @Override // defpackage.ud4
    public final int C(int i) {
        return kfo.M(kfo.f0(i), ((Number) ((ma4) this.a.b).c(CameraCharacteristics.SENSOR_ORIENTATION)).intValue(), 1 == j());
    }

    @Override // defpackage.inm
    public final Object E(s15 s15Var) {
        if (s15Var.equals(uqh.a(ka4.class))) {
            return (ka4) this.b.getValue();
        }
        boolean zEquals = s15Var.equals(uqh.a(pe4.class));
        pe4 pe4Var = this.a;
        if (zEquals) {
            return pe4Var;
        }
        boolean zEquals2 = s15Var.equals(uqh.a(CameraMetadata.class));
        ge4 ge4Var = pe4Var.b;
        return zEquals2 ? ge4Var : ((ma4) ge4Var).E(s15Var);
    }

    @Override // defpackage.ud4
    public final ekc L() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // defpackage.ud4
    public final int c() {
        return C(0);
    }

    @Override // defpackage.ud4
    public final int j() {
        int iIntValue = ((Number) ((ma4) this.a.b).c(CameraCharacteristics.LENS_FACING)).intValue();
        if (iIntValue == 0) {
            return 0;
        }
        if (iIntValue == 1) {
            return 1;
        }
        if (iIntValue == 2) {
            return 2;
        }
        qp2.o(p3p.i(iIntValue, "The specified lens facing integer ", " can not be recognized."));
        return 0;
    }

    @Override // defpackage.ud4
    public final boolean q() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // defpackage.ud4
    public final ekc x() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }
}
