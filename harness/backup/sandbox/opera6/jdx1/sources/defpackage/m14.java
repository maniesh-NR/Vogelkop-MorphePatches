package defpackage;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class m14 implements en8 {
    public static final hp2 j = new hp2((byte) 9, false);
    public final cn8 a;
    public final int b;
    public final oj9 c;
    public final SparseArray d = new SparseArray();
    public boolean e;
    public k5o f;
    public long g;
    public twi h;
    public oj9[] i;

    public m14(cn8 cn8Var, int i, oj9 oj9Var) {
        this.a = cn8Var;
        this.b = i;
        this.c = oj9Var;
    }

    public final xz4 a() {
        twi twiVar = this.h;
        if (twiVar instanceof xz4) {
            return (xz4) twiVar;
        }
        if (twiVar instanceof cfd) {
            return ((cfd) twiVar).a;
        }
        return null;
    }

    public final void b(k5o k5oVar, long j2, long j3) {
        this.f = k5oVar;
        this.g = j3;
        boolean z = this.e;
        cn8 cn8Var = this.a;
        if (!z) {
            cn8Var.d(this);
            if (j2 != -9223372036854775807L) {
                cn8Var.seek(0L, j2);
            }
            this.e = true;
            return;
        }
        if (j2 == -9223372036854775807L) {
            j2 = 0;
        }
        cn8Var.seek(0L, j2);
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.d;
            if (i >= sparseArray.size()) {
                return;
            }
            l14 l14Var = (l14) sparseArray.valueAt(i);
            if (k5oVar == null) {
                l14Var.e = l14Var.c;
            } else {
                l14Var.f = j3;
                hyl hylVarS = k5oVar.s(l14Var.a);
                l14Var.e = hylVarS;
                oj9 oj9Var = l14Var.d;
                if (oj9Var != null) {
                    hylVarS.g(oj9Var);
                }
            }
            i++;
        }
    }

    @Override // defpackage.en8
    public final void endTracks() {
        SparseArray sparseArray = this.d;
        oj9[] oj9VarArr = new oj9[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            oj9 oj9Var = ((l14) sparseArray.valueAt(i)).d;
            oj9Var.getClass();
            oj9VarArr[i] = oj9Var;
        }
        this.i = oj9VarArr;
    }

    @Override // defpackage.en8
    public final void h(twi twiVar) {
        this.h = twiVar;
    }

    @Override // defpackage.en8
    public final hyl track(int i, int i2) {
        SparseArray sparseArray = this.d;
        l14 l14Var = (l14) sparseArray.get(i);
        if (l14Var == null) {
            z4o.H(this.i == null);
            l14Var = new l14(i, i2, i2 == this.b ? this.c : null);
            k5o k5oVar = this.f;
            long j2 = this.g;
            if (k5oVar == null) {
                l14Var.e = l14Var.c;
            } else {
                l14Var.f = j2;
                hyl hylVarS = k5oVar.s(i2);
                l14Var.e = hylVarS;
                oj9 oj9Var = l14Var.d;
                if (oj9Var != null) {
                    hylVarS.g(oj9Var);
                }
            }
            sparseArray.put(i, l14Var);
        }
        return l14Var;
    }
}
