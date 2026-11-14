package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class jej implements ble {
    public final /* synthetic */ pej a;
    public final /* synthetic */ Function1 b;

    public jej(pej pejVar, Function1 function1) {
        fsf fsfVar = fsf.a;
        this.a = pejVar;
        this.b = function1;
    }

    @Override // defpackage.ble
    public final Object B0(long j, long j2, mt5 mt5Var) {
        fsf fsfVar = fsf.a;
        this.b.invoke(new Float(i1n.c(j2)));
        return new i1n(j2);
    }

    @Override // defpackage.ble
    public final long K(int i, long j, long j2) {
        if (i != 1) {
            return 0L;
        }
        a21 a21Var = this.a.d;
        fsf fsfVar = fsf.a;
        float fI = a21Var.i(Float.intBitsToFloat((int) (j2 & 4294967295L)));
        p0g p0gVar = (p0g) a21Var.k;
        float fH = Float.isNaN(p0gVar.h()) ? 0.0f : p0gVar.h();
        p0gVar.i(fI);
        return a(fI - fH);
    }

    public final long a(float f) {
        fsf fsfVar = fsf.a;
        fsf fsfVar2 = fsf.a;
        return (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L);
    }

    @Override // defpackage.ble
    public final Object f0(long j, mt5 mt5Var) {
        fsf fsfVar = fsf.a;
        float fC = i1n.c(j);
        pej pejVar = this.a;
        float fL = pejVar.d.l();
        float fC2 = pejVar.d.h().c();
        if (fC >= 0.0f || fL <= fC2) {
            j = 0;
        } else {
            this.b.invoke(new Float(fC));
        }
        return new i1n(j);
    }

    @Override // defpackage.ble
    public final long v(int i, long j) {
        fsf fsfVar = fsf.a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f || i != 1) {
            return 0L;
        }
        a21 a21Var = this.a.d;
        float fI = a21Var.i(fIntBitsToFloat);
        p0g p0gVar = (p0g) a21Var.k;
        float fH = Float.isNaN(p0gVar.h()) ? 0.0f : p0gVar.h();
        p0gVar.i(fI);
        return a(fI - fH);
    }
}
