package defpackage;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n3c {
    public final xz0 a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public xz0 h;
    public final /* synthetic */ byte j;
    public boolean b = true;
    public final HashMap i = new HashMap();

    public n3c(xz0 xz0Var, byte b) {
        this.j = b;
        this.a = xz0Var;
    }

    public final void a(sz0 sz0Var, int i, wye wyeVar) {
        float f = i;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L);
        while (true) {
            switch (this.j) {
                case 0:
                    evf evfVar = wyeVar.T;
                    if (evfVar != null) {
                        s3a s3aVar = (s3a) evfVar;
                        float[] fArrB = s3aVar.b();
                        if (!s3aVar.s) {
                            jFloatToRawIntBits = afd.b(fArrB, jFloatToRawIntBits);
                        }
                    }
                    jFloatToRawIntBits = scd.c0(jFloatToRawIntBits, wyeVar.F);
                    break;
                default:
                    long j = wyeVar.X0().v;
                    jFloatToRawIntBits = y8f.e((Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L), jFloatToRawIntBits);
                    break;
            }
            wyeVar = wyeVar.w;
            if (Intrinsics.a(wyeVar, this.a.C())) {
                int iRound = Math.round(sz0Var instanceof mga ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)));
                HashMap map = this.i;
                if (map.containsKey(sz0Var)) {
                    int iIntValue = ((Number) rbd.b(map, sz0Var)).intValue();
                    mga mgaVar = vz0.a;
                    iRound = ((Number) sz0Var.a.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
                }
                map.put(sz0Var, Integer.valueOf(iRound));
                return;
            }
            if (b(wyeVar).containsKey(sz0Var)) {
                float fC = c(wyeVar, sz0Var);
                jFloatToRawIntBits = (Float.floatToRawIntBits(fC) << 32) | (Float.floatToRawIntBits(fC) & 4294967295L);
            }
        }
    }

    public final Map b(wye wyeVar) {
        switch (this.j) {
            case 0:
                return wyeVar.G0().a();
            default:
                return wyeVar.X0().G0().a();
        }
    }

    public final int c(wye wyeVar, sz0 sz0Var) {
        switch (this.j) {
            case 0:
                return wyeVar.W(sz0Var);
            default:
                return wyeVar.X0().W(sz0Var);
        }
    }

    public final boolean d() {
        return this.c || this.e || this.f || this.g;
    }

    public final boolean e() {
        h();
        return this.h != null;
    }

    public final void f() {
        this.b = true;
        xz0 xz0Var = this.a;
        xz0 xz0VarD = xz0Var.d();
        if (xz0VarD == null) {
            return;
        }
        if (this.c) {
            xz0VarD.V();
        } else if (this.e || this.d) {
            xz0VarD.requestLayout();
        }
        if (this.f) {
            xz0Var.V();
        }
        if (this.g) {
            xz0Var.requestLayout();
        }
        xz0VarD.a().f();
    }

    public final void g() {
        HashMap map = this.i;
        map.clear();
        z3 z3Var = new z3(this, (byte) 15);
        xz0 xz0Var = this.a;
        xz0Var.n(z3Var);
        map.putAll(b(xz0Var.C()));
        this.b = false;
    }

    public final void h() {
        n3c n3cVarA;
        n3c n3cVarA2;
        boolean zD = d();
        xz0 xz0Var = this.a;
        if (!zD) {
            xz0 xz0VarD = xz0Var.d();
            if (xz0VarD == null) {
                return;
            }
            xz0Var = xz0VarD.a().h;
            if (xz0Var == null || !xz0Var.a().d()) {
                xz0 xz0Var2 = this.h;
                if (xz0Var2 == null || xz0Var2.a().d()) {
                    return;
                }
                xz0 xz0VarD2 = xz0Var2.d();
                if (xz0VarD2 != null && (n3cVarA2 = xz0VarD2.a()) != null) {
                    n3cVarA2.h();
                }
                xz0 xz0VarD3 = xz0Var2.d();
                xz0Var = (xz0VarD3 == null || (n3cVarA = xz0VarD3.a()) == null) ? null : n3cVarA.h;
            }
        }
        this.h = xz0Var;
    }
}
