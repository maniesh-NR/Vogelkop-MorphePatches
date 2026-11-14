package defpackage;

/* loaded from: classes.dex */
public final class muh {
    public final q83 a;
    public final int b;
    public final q83 c;
    public byte d = 0;
    public boolean e = false;
    public boolean f = false;

    public muh(q83 q83Var, q83 q83Var2, int i) {
        this.a = q83Var;
        this.b = i;
        this.c = q83Var2;
    }

    public static void b(q83 q83Var) {
        byte b = q83Var.h;
        if (b == 2) {
            z4o.H(b == 2);
            q83Var.h = (byte) 1;
            q83Var.u();
        }
    }

    public static boolean h(q83 q83Var) {
        return q83Var.h != 0;
    }

    public static void l(q83 q83Var, long j) {
        q83Var.n = true;
        if (q83Var instanceof zjl) {
            zjl zjlVar = (zjl) q83Var;
            z4o.H(zjlVar.n);
            zjlVar.K = j;
        }
    }

    public final void a(q83 q83Var, qt6 qt6Var) {
        z4o.H(this.a == q83Var || this.c == q83Var);
        if (h(q83Var)) {
            if (q83Var == ((q83) qt6Var.e)) {
                qt6Var.f = null;
                qt6Var.e = null;
                qt6Var.a = true;
            }
            b(q83Var);
            z4o.H(q83Var.h == 1);
            q83Var.c.k();
            q83Var.h = (byte) 0;
            q83Var.i = null;
            q83Var.j = null;
            q83Var.n = false;
            q83Var.n();
            q83Var.q = null;
        }
    }

    public final int c() {
        boolean zH = h(this.a);
        q83 q83Var = this.c;
        return (zH ? 1 : 0) + ((q83Var == null || !h(q83Var)) ? 0 : 1);
    }

    public final q83 d(okd okdVar) {
        vhi vhiVar;
        if (okdVar == null || (vhiVar = okdVar.c[this.b]) == null) {
            return null;
        }
        q83 q83Var = this.a;
        if (q83Var.i == vhiVar) {
            return q83Var;
        }
        q83 q83Var2 = this.c;
        if (q83Var2 == null || q83Var2.i != vhiVar) {
            return null;
        }
        return q83Var2;
    }

    public final boolean e(okd okdVar, q83 q83Var) {
        if (q83Var == null) {
            return true;
        }
        vhi[] vhiVarArr = okdVar.c;
        int i = this.b;
        vhi vhiVar = vhiVarArr[i];
        vhi vhiVar2 = q83Var.i;
        if (vhiVar2 == null) {
            return true;
        }
        if (vhiVar2 == vhiVar) {
            if (vhiVar == null || q83Var.k()) {
                return true;
            }
            okd okdVar2 = okdVar.m;
            if (okdVar.g.g && okdVar2 != null && okdVar2.e && ((q83Var instanceof zjl) || (q83Var instanceof byd) || q83Var.m >= okdVar2.e())) {
                return true;
            }
        }
        okd okdVar3 = okdVar.m;
        return okdVar3 != null && okdVar3.c[i] == q83Var.i;
    }

    public final boolean f() {
        byte b = this.d;
        return b == 2 || b == 4 || b == 3;
    }

    public final boolean g() {
        byte b = this.d;
        if (b == 0 || b == 2 || b == 4) {
            return h(this.a);
        }
        q83 q83Var = this.c;
        q83Var.getClass();
        return q83Var.h != 0;
    }

    public final void i(boolean z) {
        if (z) {
            if (this.e) {
                q83 q83Var = this.a;
                z4o.H(q83Var.h == 0);
                q83Var.c.k();
                q83Var.s();
                this.e = false;
                return;
            }
            return;
        }
        if (this.f) {
            q83 q83Var2 = this.c;
            q83Var2.getClass();
            z4o.H(q83Var2.h == 0);
            q83Var2.c.k();
            q83Var2.s();
            this.f = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int j(q83 q83Var, okd okdVar, pyl pylVar, qt6 qt6Var) {
        q83 q83Var2;
        byte b;
        if (q83Var == null || q83Var.h == 0 || (q83Var == (q83Var2 = this.a) && ((b = this.d) == 2 || b == 4))) {
            return 1;
        }
        if (q83Var == this.c && this.d == 3) {
            return 1;
        }
        vhi vhiVar = q83Var.i;
        vhi[] vhiVarArr = okdVar.c;
        int i = this.b;
        Object[] objArr = vhiVar != vhiVarArr[i];
        boolean zP = pylVar.p(i);
        if (!zP || objArr != false) {
            if (!q83Var.n) {
                bj8 bj8Var = ((bj8[]) pylVar.d)[i];
                int length = bj8Var != null ? bj8Var.length() : 0;
                oj9[] oj9VarArr = new oj9[length];
                for (int i2 = 0; i2 < length; i2++) {
                    bj8Var.getClass();
                    oj9VarArr[i2] = bj8Var.getFormat(i2);
                }
                vhi vhiVar2 = okdVar.c[i];
                vhiVar2.getClass();
                q83Var.z(oj9VarArr, vhiVar2, okdVar.e(), okdVar.p, okdVar.g.a);
                return 3;
            }
            if (!q83Var.l()) {
                return 0;
            }
            a(q83Var, qt6Var);
            if (!zP || f()) {
                i(q83Var == q83Var2);
                return 1;
            }
        }
        return 1;
    }

    public final void k() {
        if (!h(this.a)) {
            i(true);
        }
        q83 q83Var = this.c;
        if (q83Var == null || q83Var.h != 0) {
            return;
        }
        i(false);
    }

    public final void m() {
        byte b;
        q83 q83Var = this.a;
        byte b2 = q83Var.h;
        if (b2 == 1 && this.d != 4) {
            z4o.H(b2 == 1);
            q83Var.h = (byte) 2;
            q83Var.t();
            return;
        }
        q83 q83Var2 = this.c;
        if (q83Var2 == null || (b = q83Var2.h) != 1 || this.d == 3) {
            return;
        }
        z4o.H(b == 1);
        q83Var2.h = (byte) 2;
        q83Var2.t();
    }
}
