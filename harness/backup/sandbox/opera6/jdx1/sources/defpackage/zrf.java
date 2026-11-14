package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zrf extends dgk {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean e(g1g g1gVar, byte[] bArr) {
        if (g1gVar.a() < bArr.length) {
            return false;
        }
        int i = g1gVar.b;
        byte[] bArr2 = new byte[bArr.length];
        g1gVar.k(bArr2, 0, bArr.length);
        g1gVar.N(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // defpackage.dgk
    public final long b(g1g g1gVar) {
        byte[] bArr = g1gVar.a;
        return (this.i * sgb.I(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // defpackage.dgk
    public final boolean c(g1g g1gVar, long j, qsh qshVar) {
        if (e(g1gVar, o)) {
            byte[] bArrCopyOf = Arrays.copyOf(g1gVar.a, g1gVar.c);
            int i = bArrCopyOf[9] & 255;
            ArrayList arrayListJ = sgb.j(bArrCopyOf);
            if (((oj9) qshVar.b) == null) {
                nj9 nj9Var = new nj9();
                nj9Var.l = dzd.p("audio/ogg");
                nj9Var.m = dzd.p("audio/opus");
                nj9Var.E = i;
                nj9Var.F = 48000;
                nj9Var.p = arrayListJ;
                qshVar.b = new oj9(nj9Var);
                return true;
            }
        } else {
            boolean zE = e(g1gVar, p);
            oj9 oj9Var = (oj9) qshVar.b;
            if (!zE) {
                oj9Var.getClass();
                return false;
            }
            oj9Var.getClass();
            if (!this.n) {
                this.n = true;
                g1gVar.O(8);
                lxd lxdVarV = jym.v(h1b.t((String[]) jym.y(g1gVar, false, false).a));
                if (lxdVarV != null) {
                    nj9 nj9VarA = ((oj9) qshVar.b).a();
                    nj9VarA.k = lxdVarV.b(((oj9) qshVar.b).l);
                    qshVar.b = new oj9(nj9VarA);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // defpackage.dgk
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = false;
        }
    }
}
