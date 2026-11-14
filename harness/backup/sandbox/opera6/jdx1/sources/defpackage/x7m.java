package defpackage;

import android.text.Layout;

/* loaded from: classes.dex */
public final class x7m {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public qgl r;
    public String t;
    public String u;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final void a(x7m x7mVar) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (x7mVar != null) {
            if (!this.c && x7mVar.c) {
                this.b = x7mVar.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = x7mVar.h;
            }
            if (this.i == -1) {
                this.i = x7mVar.i;
            }
            if (this.a == null && (str = x7mVar.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = x7mVar.f;
            }
            if (this.g == -1) {
                this.g = x7mVar.g;
            }
            if (this.n == -1) {
                this.n = x7mVar.n;
            }
            if (this.o == null && (alignment2 = x7mVar.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = x7mVar.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = x7mVar.q;
            }
            if (this.j == -1) {
                this.j = x7mVar.j;
                this.k = x7mVar.k;
            }
            if (this.r == null) {
                this.r = x7mVar.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = x7mVar.s;
            }
            if (this.t == null) {
                this.t = x7mVar.t;
            }
            if (this.u == null) {
                this.u = x7mVar.u;
            }
            if (!this.e && x7mVar.e) {
                this.d = x7mVar.d;
                this.e = true;
            }
            if (this.m != -1 || (i = x7mVar.m) == -1) {
                return;
            }
            this.m = i;
        }
    }
}
