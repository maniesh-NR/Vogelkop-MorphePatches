package defpackage;

import android.view.ViewParent;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class s3a implements evf {
    public q3a a;
    public final a71 b;
    public final v31 c;
    public Function2 d;
    public tye e;
    public boolean g;
    public float[] i;
    public boolean j;
    public int n;
    public w7d p;
    public boolean q;
    public boolean r;
    public boolean t;
    public long f = 9223372034707292159L;
    public final float[] h = afd.a();
    public n27 k = xf8.i();
    public d2c l = d2c.a;
    public final uh4 m = new uh4();
    public long o = a2m.b;
    public boolean s = true;
    public final tu7 u = new tu7(this, (byte) 22);

    public s3a(q3a q3aVar, a71 a71Var, v31 v31Var, Function2 function2, tye tyeVar) {
        this.a = q3aVar;
        this.b = a71Var;
        this.c = v31Var;
        this.d = function2;
        this.e = tyeVar;
    }

    public final float[] a() {
        float[] fArrA = this.i;
        if (fArrA == null) {
            fArrA = afd.a();
            this.i = fArrA;
        }
        if (this.r) {
            this.r = false;
            float[] fArrB = b();
            if (this.s) {
                return fArrB;
            }
            if (!aib.y(fArrB, fArrA)) {
                fArrA[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrA[0])) {
            return null;
        }
        return fArrA;
    }

    public final float[] b() {
        boolean z = this.q;
        float[] fArr = this.h;
        if (z) {
            q3a q3aVar = this.a;
            long jO = q3aVar.z;
            if ((9223372034707292159L & jO) == 9205357640488583168L) {
                jO = mfh.o(fr3.g0(this.f));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jO >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jO & 4294967295L));
            u3a u3aVar = q3aVar.a;
            float f = u3aVar.n;
            float f2 = u3aVar.o;
            float f3 = u3aVar.s;
            float f4 = u3aVar.t;
            float f5 = u3aVar.u;
            float f6 = u3aVar.l;
            float f7 = u3aVar.m;
            double d = f3 * 0.017453292519943295d;
            float fSin = (float) Math.sin(d);
            float fCos = (float) Math.cos(d);
            float f8 = -fSin;
            float f9 = (f2 * fCos) - (0.0f * fSin);
            float f10 = (0.0f * fCos) + (f2 * fSin);
            double d2 = f4 * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d2);
            float fCos2 = (float) Math.cos(d2);
            float f11 = -fSin2;
            float f12 = fSin * fSin2;
            float f13 = fSin * fCos2;
            float f14 = fCos * fSin2;
            float f15 = fCos * fCos2;
            float f16 = (f10 * fSin2) + (f * fCos2);
            float f17 = (f10 * fCos2) + ((-f) * fSin2);
            double d3 = f5 * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d3);
            float fCos3 = (float) Math.cos(d3);
            float f18 = -fSin3;
            float f19 = (fCos3 * f12) + (f18 * fCos2);
            float f20 = ((f12 * fSin3) + (fCos2 * fCos3)) * f6;
            float f21 = fSin3 * fCos * f6;
            float f22 = ((fSin3 * f13) + (fCos3 * f11)) * f6;
            float f23 = f19 * f7;
            float f24 = fCos * fCos3 * f7;
            float f25 = ((fCos3 * f13) + (f18 * f11)) * f7;
            float f26 = f14 * 1.0f;
            float f27 = f8 * 1.0f;
            float f28 = f15 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f20;
                fArr[1] = f21;
                fArr[2] = f22;
                fArr[3] = 0.0f;
                fArr[4] = f23;
                fArr[5] = f24;
                fArr[6] = f25;
                fArr[7] = 0.0f;
                fArr[8] = f26;
                fArr[9] = f27;
                fArr[10] = f28;
                fArr[11] = 0.0f;
                float f29 = -fIntBitsToFloat;
                fArr[12] = ((f20 * f29) - (fIntBitsToFloat2 * f23)) + f16 + fIntBitsToFloat;
                fArr[13] = ((f21 * f29) - (fIntBitsToFloat2 * f24)) + f9 + fIntBitsToFloat2;
                fArr[14] = ((f29 * f22) - (fIntBitsToFloat2 * f25)) + f17;
                fArr[15] = 1.0f;
            }
            this.q = false;
            this.s = p37.S(fArr);
        }
        return fArr;
    }

    public final void c() {
        if (this.j || this.g) {
            return;
        }
        this.c.invalidate();
        f(true);
    }

    public final void d(long j) {
        boolean zS = v31.s();
        v31 v31Var = this.c;
        if (zS) {
            v31Var.U(-4.0f);
        }
        q3a q3aVar = this.a;
        if (!ybb.a(q3aVar.t, j)) {
            q3aVar.t = j;
            q3aVar.h(j, q3aVar.u);
        }
        ViewParent parent = v31Var.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(v31Var, v31Var);
        }
    }

    public final void e(long j) {
        if (gcb.a(j, this.f)) {
            return;
        }
        if (v31.s()) {
            this.c.U(-4.0f);
        }
        this.f = j;
        c();
    }

    public final void f(boolean z) {
        if (z != this.j) {
            this.j = z;
            v31 v31Var = this.c;
            dee deeVar = v31Var.z;
            boolean z2 = v31Var.B;
            if (!z) {
                if (z2) {
                    return;
                }
                deeVar.k(this);
                dee deeVar2 = v31Var.A;
                if (deeVar2 != null) {
                    deeVar2.k(this);
                    return;
                }
                return;
            }
            if (!z2) {
                deeVar.a(this);
                return;
            }
            dee deeVar3 = v31Var.A;
            if (deeVar3 == null) {
                deeVar3 = new dee();
                v31Var.A = deeVar3;
            }
            deeVar3.a(this);
        }
    }

    public final void g() {
        v31.s();
        if (this.j) {
            if (!a2m.a(this.o, a2m.b) && !gcb.a(this.a.u, this.f)) {
                q3a q3aVar = this.a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.o >> 32)) * ((int) (this.f >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.o & 4294967295L)) * ((int) (this.f & 4294967295L));
                q3aVar.g((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
            }
            this.a.e(this.k, this.l, this.f, this.u);
            f(false);
        }
    }
}
