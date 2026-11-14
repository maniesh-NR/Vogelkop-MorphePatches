package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class er4 extends f1o {
    public final ArrayList k;
    public int l;

    public er4(uo5 uo5Var, int i) {
        uo5 uo5Var2;
        super(uo5Var);
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.f = i;
        uo5 uo5Var3 = this.b;
        uo5 uo5VarM = uo5Var3.m(i);
        while (true) {
            uo5Var2 = uo5Var3;
            uo5Var3 = uo5VarM;
            if (uo5Var3 == null) {
                break;
            } else {
                uo5VarM = uo5Var3.m(this.f);
            }
        }
        this.b = uo5Var2;
        int i2 = this.f;
        arrayList.add(i2 == 0 ? uo5Var2.d : i2 == 1 ? uo5Var2.e : null);
        uo5 uo5VarL = uo5Var2.l(this.f);
        while (uo5VarL != null) {
            int i3 = this.f;
            arrayList.add(i3 == 0 ? uo5VarL.d : i3 == 1 ? uo5VarL.e : null);
            uo5VarL = uo5VarL.l(this.f);
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            f1o f1oVar = (f1o) obj;
            int i5 = this.f;
            if (i5 == 0) {
                f1oVar.b.b = this;
            } else if (i5 == 1) {
                f1oVar.b.c = this;
            }
        }
        if (this.f == 0 && this.b.S.u0 && arrayList.size() > 1) {
            this.b = ((f1o) am2.k(1, arrayList)).b;
        }
        int i6 = this.f;
        uo5 uo5Var4 = this.b;
        this.l = i6 == 0 ? uo5Var4.h0 : uo5Var4.i0;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d3  */
    @Override // defpackage.z27
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.z27 r28) {
        /*
            Method dump skipped, instructions count: 910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.er4.a(z27):void");
    }

    @Override // defpackage.f1o
    public final void d() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((f1o) obj).d();
        }
        int size2 = arrayList.size();
        if (size2 < 1) {
            return;
        }
        uo5 uo5Var = ((f1o) arrayList.get(0)).b;
        uo5 uo5Var2 = ((f1o) arrayList.get(size2 - 1)).b;
        int i2 = this.f;
        e37 e37Var = this.i;
        e37 e37Var2 = this.h;
        if (i2 == 0) {
            eo5 eo5Var = uo5Var.H;
            eo5 eo5Var2 = uo5Var2.J;
            e37 e37VarI = f1o.i(eo5Var, 0);
            int iE = eo5Var.e();
            uo5 uo5VarM = m();
            if (uo5VarM != null) {
                iE = uo5VarM.H.e();
            }
            if (e37VarI != null) {
                f1o.b(e37Var2, e37VarI, iE);
            }
            e37 e37VarI2 = f1o.i(eo5Var2, 0);
            int iE2 = eo5Var2.e();
            uo5 uo5VarN = n();
            if (uo5VarN != null) {
                iE2 = uo5VarN.J.e();
            }
            if (e37VarI2 != null) {
                f1o.b(e37Var, e37VarI2, -iE2);
            }
        } else {
            eo5 eo5Var3 = uo5Var.I;
            eo5 eo5Var4 = uo5Var2.K;
            e37 e37VarI3 = f1o.i(eo5Var3, 1);
            int iE3 = eo5Var3.e();
            uo5 uo5VarM2 = m();
            if (uo5VarM2 != null) {
                iE3 = uo5VarM2.I.e();
            }
            if (e37VarI3 != null) {
                f1o.b(e37Var2, e37VarI3, iE3);
            }
            e37 e37VarI4 = f1o.i(eo5Var4, 1);
            int iE4 = eo5Var4.e();
            uo5 uo5VarN2 = n();
            if (uo5VarN2 != null) {
                iE4 = uo5VarN2.K.e();
            }
            if (e37VarI4 != null) {
                f1o.b(e37Var, e37VarI4, -iE4);
            }
        }
        e37Var2.a = this;
        e37Var.a = this;
    }

    @Override // defpackage.f1o
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return;
            }
            ((f1o) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // defpackage.f1o
    public final void f() {
        this.c = null;
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((f1o) obj).f();
        }
    }

    @Override // defpackage.f1o
    public final long j() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = r4.i.f + ((f1o) arrayList.get(i)).j() + j + r4.h.f;
        }
        return j;
    }

    @Override // defpackage.f1o
    public final boolean k() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((f1o) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final uo5 m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return null;
            }
            uo5 uo5Var = ((f1o) arrayList.get(i)).b;
            if (uo5Var.f0 != 8) {
                return uo5Var;
            }
            i++;
        }
    }

    public final uo5 n() {
        ArrayList arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            uo5 uo5Var = ((f1o) arrayList.get(size)).b;
            if (uo5Var.f0 != 8) {
                return uo5Var;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sb.append("<");
            sb.append((f1o) obj);
            sb.append("> ");
        }
        return sb.toString();
    }
}
