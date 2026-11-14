package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class inl {
    public final int a;
    public final b8e b;
    public final Function1 c;
    public inl d;
    public long e;
    public long f;
    public long g = Long.MIN_VALUE;
    public final /* synthetic */ jnl h;

    public inl(jnl jnlVar, int i, b8e b8eVar, Function1 function1) {
        this.h = jnlVar;
        this.a = i;
        this.b = b8eVar;
        this.c = function1;
    }

    public final void a(long j, long j2, long j3, long j4, float[] fArr) {
        xsh xshVar;
        xsh xshVar2;
        long j5 = this.h.f;
        b8e b8eVar = this.b;
        wye wyeVarC0 = ui6.c0(b8eVar, 2);
        m3c m3cVarE0 = ui6.e0(b8eVar);
        boolean zI = m3cVarE0.I();
        tah tahVar = m3cVarE0.F;
        if (zI) {
            if (((wye) tahVar.e) != wyeVarC0) {
                wyeVarC0.getClass();
                long j6 = wyeVarC0.c;
                wye wyeVar = (wye) tahVar.e;
                wyeVar.getClass();
                xshVar = new xsh(scd.f0(wyeVar.x(wyeVarC0, (Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L))), ((((int) (r1 >> 32)) + ((int) (j6 >> 32))) << 32) | ((((int) (r1 & 4294967295L)) + ((int) (j6 & 4294967295L))) & 4294967295L), j3, j4, j5, fArr, b8eVar);
            } else {
                xshVar = new xsh(j, j2, j3, j4, j5, fArr, b8eVar);
            }
            xshVar2 = xshVar;
        } else {
            xshVar2 = null;
        }
        if (xshVar2 == null) {
            return;
        }
        this.c.invoke(xshVar2);
    }

    public final void b() throws pxb {
        jnl jnlVar = this.h;
        jde jdeVar = jnlVar.a;
        int i = this.a;
        inl inlVar = (inl) jdeVar.g(i);
        if (inlVar != null) {
            if (inlVar == this) {
                inl inlVar2 = this.d;
                this.d = null;
                if (inlVar2 != null) {
                    int iC = jdeVar.c(i);
                    Object[] objArr = jdeVar.c;
                    Object obj = objArr[iC];
                    jdeVar.b[iC] = i;
                    objArr[iC] = inlVar2;
                    return;
                }
                m3c m3cVarE0 = ui6.e0(this.b.a);
                if (m3cVarE0.H()) {
                    yoh yohVar = p3c.a(m3cVarE0).t;
                    yohVar.getClass();
                    if (m3cVarE0.g != -4) {
                        ro9 ro9Var = yohVar.c;
                        int iD = yohVar.d(m3cVarE0);
                        long[] jArr = (long[]) ro9Var.c;
                        int i2 = iD + 2;
                        jArr[i2] = jArr[i2] & 8070450532247928831L;
                        return;
                    }
                    return;
                }
                return;
            }
            int iC2 = jdeVar.c(i);
            Object[] objArr2 = jdeVar.c;
            Object obj2 = objArr2[iC2];
            jdeVar.b[iC2] = i;
            objArr2[iC2] = inlVar;
            while (true) {
                inl inlVar3 = inlVar.d;
                if (inlVar3 == null) {
                    break;
                }
                if (inlVar3 == this) {
                    inlVar.d = this.d;
                    this.d = null;
                    return;
                }
                inlVar = inlVar3;
            }
        }
        inl inlVar4 = jnlVar.b;
        if (inlVar4 == this) {
            jnlVar.b = inlVar4.d;
            this.d = null;
            return;
        }
        inl inlVar5 = inlVar4 != null ? inlVar4.d : null;
        while (true) {
            inl inlVar6 = inlVar4;
            inlVar4 = inlVar5;
            if (inlVar4 == null) {
                return;
            }
            if (inlVar4 == this) {
                if (inlVar6 != null) {
                    inlVar6.d = inlVar4.d;
                }
                this.d = null;
                return;
            }
            inlVar5 = inlVar4.d;
        }
    }
}
