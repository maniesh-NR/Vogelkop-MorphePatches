package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class y4a extends uzm {
    public float[] b;
    public d91 h;
    public Function1 i;
    public float l;
    public float m;
    public float n;
    public float q;
    public float r;
    public final ArrayList c = new ArrayList();
    public boolean d = true;
    public long e = u95.g;
    public List f = u0n.a;
    public boolean g = true;
    public final tu7 j = new tu7(this, (byte) 23);
    public String k = "";
    public float o = 1.0f;
    public float p = 1.0f;
    public boolean s = true;

    @Override // defpackage.uzm
    public final void a(mk7 mk7Var) {
        if (this.s) {
            float[] fArrA = this.b;
            if (fArrA == null) {
                fArrA = afd.a();
                this.b = fArrA;
            } else {
                afd.d(fArrA);
            }
            afd.f(fArrA, this.q + this.m, this.r + this.n);
            float f = this.l;
            if (fArrA.length >= 16) {
                double d = f * 0.017453292519943295d;
                float fSin = (float) Math.sin(d);
                float fCos = (float) Math.cos(d);
                float f2 = fArrA[0];
                float f3 = fArrA[4];
                float f4 = (fSin * f3) + (fCos * f2);
                float f5 = -fSin;
                float f6 = (f3 * fCos) + (f2 * f5);
                float f7 = fArrA[1];
                float f8 = fArrA[5];
                float f9 = (fSin * f8) + (fCos * f7);
                float f10 = (f8 * fCos) + (f7 * f5);
                float f11 = fArrA[2];
                float f12 = fArrA[6];
                float f13 = (fSin * f12) + (fCos * f11);
                float f14 = (f12 * fCos) + (f11 * f5);
                float f15 = fArrA[3];
                float f16 = fArrA[7];
                fArrA[0] = f4;
                fArrA[1] = f9;
                fArrA[2] = f13;
                fArrA[3] = (fSin * f16) + (fCos * f15);
                fArrA[4] = f6;
                fArrA[5] = f10;
                fArrA[6] = f14;
                fArrA[7] = (fCos * f16) + (f5 * f15);
            }
            float f17 = this.o;
            float f18 = this.p;
            if (fArrA.length >= 16) {
                fArrA[0] = fArrA[0] * f17;
                fArrA[1] = fArrA[1] * f17;
                fArrA[2] = fArrA[2] * f17;
                fArrA[3] = fArrA[3] * f17;
                fArrA[4] = fArrA[4] * f18;
                fArrA[5] = fArrA[5] * f18;
                fArrA[6] = fArrA[6] * f18;
                fArrA[7] = fArrA[7] * f18;
                fArrA[8] = fArrA[8] * 1.0f;
                fArrA[9] = fArrA[9] * 1.0f;
                fArrA[10] = fArrA[10] * 1.0f;
                fArrA[11] = fArrA[11] * 1.0f;
            }
            afd.f(fArrA, -this.m, -this.n);
            this.s = false;
        }
        if (this.g) {
            if (!this.f.isEmpty()) {
                d91 d91VarA = this.h;
                if (d91VarA == null) {
                    d91VarA = f91.a();
                    this.h = d91VarA;
                }
                uup.M(this.f, d91VarA);
            }
            this.g = false;
        }
        d5o d5oVarS0 = mk7Var.s0();
        long jD = d5oVarS0.D();
        d5oVarS0.A().j();
        try {
            d5o d5oVar = (d5o) ((wth) d5oVarS0.a).b;
            float[] fArr = this.b;
            if (fArr != null) {
                d5oVar.A().m(fArr);
            }
            d91 d91Var = this.h;
            if (!this.f.isEmpty() && d91Var != null) {
                d5oVar.A().n(d91Var);
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((uzm) arrayList.get(i)).a(mk7Var);
            }
        } finally {
            am2.w(d5oVarS0, jD);
        }
    }

    @Override // defpackage.uzm
    public final Function1 b() {
        return this.i;
    }

    @Override // defpackage.uzm
    public final void d(tu7 tu7Var) {
        this.i = tu7Var;
    }

    public final void e(int i, uzm uzmVar) {
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            arrayList.set(i, uzmVar);
        } else {
            arrayList.add(uzmVar);
        }
        g(uzmVar);
        uzmVar.d(this.j);
        c();
    }

    public final void f(long j) {
        if (!this.d || j == 16) {
            return;
        }
        long j2 = this.e;
        if (j2 == 16) {
            this.e = j;
            return;
        }
        l08 l08Var = u0n.a;
        if (u95.g(j2) == u95.g(j) && u95.f(j2) == u95.f(j) && u95.d(j2) == u95.d(j)) {
            return;
        }
        this.d = false;
        this.e = u95.g;
    }

    public final void g(uzm uzmVar) {
        if (!(uzmVar instanceof y6g)) {
            if (uzmVar instanceof y4a) {
                y4a y4aVar = (y4a) uzmVar;
                if (y4aVar.d && this.d) {
                    f(y4aVar.e);
                    return;
                } else {
                    this.d = false;
                    this.e = u95.g;
                    return;
                }
            }
            return;
        }
        y6g y6gVar = (y6g) uzmVar;
        dz3 dz3Var = y6gVar.b;
        if (this.d && dz3Var != null) {
            if (dz3Var instanceof nvj) {
                f(((nvj) dz3Var).a);
            } else {
                this.d = false;
                this.e = u95.g;
            }
        }
        dz3 dz3Var2 = y6gVar.g;
        if (!this.d || dz3Var2 == null) {
            return;
        }
        if (dz3Var2 instanceof nvj) {
            f(((nvj) dz3Var2).a);
        } else {
            this.d = false;
            this.e = u95.g;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.k);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            uzm uzmVar = (uzm) arrayList.get(i);
            sb.append("\t");
            sb.append(uzmVar.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
