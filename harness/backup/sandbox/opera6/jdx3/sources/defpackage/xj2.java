package defpackage;

/* loaded from: classes.dex */
public final class xj2 extends uik {
    public static final bc6 e = new bc6[]{new bc6(64, 0)}[0];
    public boolean b;
    public boolean c;
    public szm[] d;

    public xj2(int i) {
        super(64);
    }

    public final void a(bp bpVar) throws e22 {
        bp bpVarQ = bpVar.Q(e);
        bpVarQ.A(8, 0, this.b);
        bpVarQ.A(8, 1, false);
        bpVarQ.A(8, 2, this.c);
        bpVarQ.A(8, 3, false);
        bpVarQ.A(8, 4, false);
        bpVarQ.A(8, 5, false);
        bpVarQ.A(8, 6, false);
        bpVarQ.A(8, 7, false);
        bpVarQ.A(9, 0, false);
        bpVarQ.A(9, 1, false);
        bpVarQ.A(9, 2, false);
        szm[] szmVarArr = this.d;
        if (szmVarArr != null) {
            bp bpVarO = bpVarQ.O(8, szmVarArr.length, 16, -1);
            int i = 0;
            while (true) {
                szm[] szmVarArr2 = this.d;
                if (i >= szmVarArr2.length) {
                    break;
                }
                bpVarO.J(szmVarArr2[i], (i << 3) + 8, false);
                i++;
            }
        } else {
            bpVarQ.N(16, true);
        }
        bpVarQ.J(null, 24, true);
        bpVarQ.z(32, 1, -1, null);
        bpVarQ.z(40, 1, -1, null);
        bpVarQ.J(null, 48, true);
        bpVarQ.J(null, 56, true);
    }
}
