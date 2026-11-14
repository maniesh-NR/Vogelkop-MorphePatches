package defpackage;

import ads_mobile_sdk.kh3;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public abstract class zf3 {
    public final int a;
    public final Object b;
    public final Object c;
    public Object d;

    public zf3(String str, int i, kh3 kh3Var, glp glpVar) {
        this.b = str;
        this.a = i;
        this.c = kh3Var;
        this.d = glpVar;
    }

    public zf3(wf3 wf3Var, yf3 yf3Var, long j, long j2, long j3, long j4, long j5, int i) {
        this.c = yf3Var;
        this.a = i;
        this.b = new uf3(wf3Var, j, j2, j3, j4, j5);
    }

    public static int c(lp6 lp6Var, long j, hp2 hp2Var) {
        if (j == lp6Var.d) {
            return 0;
        }
        hp2Var.b = j;
        return 1;
    }

    public final int b(lp6 lp6Var, hp2 hp2Var) throws InterruptedIOException {
        boolean z;
        yf3 yf3Var = (yf3) this.c;
        while (true) {
            vf3 vf3Var = (vf3) this.d;
            vf3Var.getClass();
            long j = vf3Var.f;
            long j2 = vf3Var.g;
            long j3 = vf3Var.h;
            if (j2 - j <= this.a) {
                this.d = null;
                yf3Var.x();
                return c(lp6Var, j, hp2Var);
            }
            long j4 = j3 - lp6Var.d;
            if (j4 < 0 || j4 > 262144) {
                z = false;
            } else {
                lp6Var.h((int) j4, false);
                z = true;
            }
            if (!z) {
                return c(lp6Var, j3, hp2Var);
            }
            lp6Var.f = 0;
            xf3 xf3VarO = yf3Var.o(lp6Var, vf3Var.b);
            int i = xf3VarO.a;
            long j5 = xf3VarO.b;
            long j6 = xf3VarO.c;
            if (i == -3) {
                this.d = null;
                yf3Var.x();
                return c(lp6Var, j3, hp2Var);
            }
            if (i == -2) {
                vf3Var.d = j5;
                vf3Var.f = j6;
                vf3Var.h = vf3.a(vf3Var.b, j5, vf3Var.e, j6, vf3Var.g, vf3Var.c);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        qp2.n("Invalid case");
                        return 0;
                    }
                    long j7 = j6 - lp6Var.d;
                    if (j7 >= 0 && j7 <= 262144) {
                        lp6Var.h((int) j7, false);
                    }
                    this.d = null;
                    yf3Var.x();
                    return c(lp6Var, j6, hp2Var);
                }
                vf3Var.e = j5;
                vf3Var.g = j6;
                vf3Var.h = vf3.a(vf3Var.b, vf3Var.d, j5, vf3Var.f, j6, vf3Var.c);
            }
        }
    }

    public final void d(long j) {
        vf3 vf3Var = (vf3) this.d;
        if (vf3Var == null || vf3Var.a != j) {
            uf3 uf3Var = (uf3) this.b;
            this.d = new vf3(j, uf3Var.a.e(j), uf3Var.c, uf3Var.d, uf3Var.e, uf3Var.f);
        }
    }
}
