package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class pw7 implements bcf {
    public final /* synthetic */ byte a;
    public int b;
    public int c;
    public int d;
    public int e;
    public Object f;

    public /* synthetic */ pw7(byte b) {
        this.a = b;
    }

    public pw7(int i, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = (byte) 4;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = bArr;
    }

    public pw7(View view, int i, int i2, int i3, int i4) {
        this.a = (byte) 2;
        this.b = i;
        this.f = view;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public pw7(sf1 sf1Var, long j) {
        this.a = (byte) 0;
        String str = sf1Var.b;
        i1 i1Var = new i1((byte) 5);
        i1Var.d = str;
        i1Var.b = -1;
        i1Var.c = -1;
        this.f = i1Var;
        this.b = xjl.f(j);
        this.c = xjl.e(j);
        this.d = -1;
        this.e = -1;
        int iF = xjl.f(j);
        int iE = xjl.e(j);
        if (iF < 0 || iF > str.length()) {
            h9o.u(sko.h(iF, str.length(), "start (", ") offset is outside of text region "));
            throw null;
        }
        if (iE < 0 || iE > str.length()) {
            h9o.u(sko.h(iE, str.length(), "end (", ") offset is outside of text region "));
            throw null;
        }
        if (iF <= iE) {
            return;
        }
        qp2.o(sko.h(iF, iE, "Do not set reversed range: ", " > "));
        throw null;
    }

    public final void a(int i, int i2) {
        long jC = upj.c(i, i2);
        ((i1) this.f).T(i, i2, "");
        long jV = qbe.V(upj.c(this.b, this.c), jC);
        i(xjl.f(jV));
        h(xjl.e(jV));
        int i3 = this.d;
        if (i3 != -1) {
            long jV2 = qbe.V(upj.c(i3, this.e), jC);
            if (xjl.c(jV2)) {
                this.d = -1;
                this.e = -1;
            } else {
                this.d = xjl.f(jV2);
                this.e = xjl.e(jV2);
            }
        }
    }

    public final char b(int i) {
        i1 i1Var = (i1) this.f;
        r05 r05Var = (r05) i1Var.e;
        if (r05Var != null && i >= i1Var.b) {
            int iV = r05Var.b - r05Var.v();
            int i2 = i1Var.b;
            if (i >= iV + i2) {
                return ((String) i1Var.d).charAt(i - ((iV - i1Var.c) + i2));
            }
            int i3 = i - i2;
            int i4 = r05Var.c;
            char[] cArr = (char[]) r05Var.e;
            return i3 < i4 ? cArr[i3] : cArr[(i3 - i4) + r05Var.d];
        }
        return ((String) i1Var.d).charAt(i);
    }

    public final xjl c() {
        int i = this.d;
        if (i != -1) {
            return new xjl(upj.c(i, this.e));
        }
        return null;
    }

    public final long d() {
        int i = this.d;
        if (i == 0) {
            t3p.y();
            return 0L;
        }
        long[] jArr = (long[]) this.f;
        int i2 = this.b;
        long j = jArr[i2];
        this.b = (i2 + 1) & this.e;
        this.d = i - 1;
        return j;
    }

    public final void e(int i, int i2, String str) {
        i1 i1Var = (i1) this.f;
        if (i < 0 || i > i1Var.t()) {
            h9o.u(sko.h(i, i1Var.t(), "start (", ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > i1Var.t()) {
            h9o.u(sko.h(i2, i1Var.t(), "end (", ") offset is outside of text region "));
            return;
        }
        if (i > i2) {
            qp2.o(sko.h(i, i2, "Do not set reversed range: ", " > "));
            return;
        }
        i1Var.T(i, i2, str);
        i(str.length() + i);
        h(str.length() + i);
        this.d = -1;
        this.e = -1;
    }

    public final void f(int i, int i2) {
        i1 i1Var = (i1) this.f;
        if (i < 0 || i > i1Var.t()) {
            h9o.u(sko.h(i, i1Var.t(), "start (", ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > i1Var.t()) {
            h9o.u(sko.h(i2, i1Var.t(), "end (", ") offset is outside of text region "));
        } else if (i >= i2) {
            qp2.o(sko.h(i, i2, "Do not set reversed or empty range: ", " > "));
        } else {
            this.d = i;
            this.e = i2;
        }
    }

    public final void g(int i, int i2) {
        i1 i1Var = (i1) this.f;
        if (i < 0 || i > i1Var.t()) {
            h9o.u(sko.h(i, i1Var.t(), "start (", ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > i1Var.t()) {
            h9o.u(sko.h(i2, i1Var.t(), "end (", ") offset is outside of text region "));
        } else if (i > i2) {
            qp2.o(sko.h(i, i2, "Do not set reversed range: ", " > "));
        } else {
            i(i);
            h(i2);
        }
    }

    public final void h(int i) {
        if (!(i >= 0)) {
            b8b.a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.c = i;
    }

    public final void i(int i) {
        if (!(i >= 0)) {
            b8b.a("Cannot set selectionStart to a negative value: " + i);
        }
        this.b = i;
    }

    @Override // defpackage.bcf
    public final g3o l0(View view, g3o g3oVar) {
        View view2 = (View) this.f;
        r9b r9bVarI = g3oVar.a.i(519);
        int i = this.b;
        if (i >= 0) {
            view2.getLayoutParams().height = i + r9bVarI.b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.c + r9bVarI.a, this.d + r9bVarI.b, this.e + r9bVarI.c, view2.getPaddingBottom());
        return g3oVar;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return ((i1) this.f).toString();
            default:
                return super.toString();
        }
    }
}
