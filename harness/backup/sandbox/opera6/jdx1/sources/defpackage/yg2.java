package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class yg2 {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final pf2 g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;

    public yg2(xg2 xg2Var) {
        this.a = xg2Var.a;
        this.b = xg2Var.b;
        this.c = xg2Var.c;
        this.d = xg2Var.d;
        this.e = xg2Var.e;
        this.f = xg2Var.f;
        this.g = xg2Var.g;
        this.h = xg2Var.h;
        this.i = xg2Var.i;
        this.j = xg2Var.j;
        this.k = xg2Var.k;
    }

    public final xg2 a() {
        xg2 xg2Var = new xg2();
        xg2Var.a = this.a;
        xg2Var.b = this.b;
        xg2Var.c = this.c;
        xg2Var.d = this.d;
        xg2Var.e = this.e;
        xg2Var.f = this.f;
        xg2Var.g = this.g;
        xg2Var.h = this.h;
        xg2Var.i = this.i;
        xg2Var.j = this.j;
        xg2Var.k = this.k;
        return xg2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yg2.class != obj.getClass()) {
            return false;
        }
        yg2 yg2Var = (yg2) obj;
        return this.a == yg2Var.a && this.b == yg2Var.b && this.c == yg2Var.c && this.d == yg2Var.d && this.e == yg2Var.e && this.f == yg2Var.f && this.h == yg2Var.h && this.i == yg2Var.i && this.j == yg2Var.j && this.k == yg2Var.k && this.g.equals(yg2Var.g);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Integer.valueOf(this.f), this.g, Integer.valueOf(this.h), Integer.valueOf(this.i), Boolean.valueOf(this.k), Boolean.valueOf(this.j));
    }
}
