package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class qz3 extends x1p {
    public final uz3 p;
    public final int q;
    public final int r;
    public final boolean s;

    public qz3(uz3 uz3Var, int i, int i2, boolean z) {
        this.p = uz3Var;
        this.q = i;
        this.r = i2;
        this.s = z;
        uz3Var.getClass();
    }

    public final CharSequence A(Context context) {
        int i = this.r;
        if (i == 1) {
            return null;
        }
        return context.getString(2132020143, Integer.valueOf(this.q), Integer.valueOf(i));
    }

    public final CharSequence B(Context context) {
        return this.p.a.a(context.getResources());
    }

    public final boolean o() {
        this.p.getClass();
        return true;
    }

    public final Integer u() {
        return null;
    }

    public final CharSequence v(Context context) {
        this.p.getClass();
        return context.getString(this.q < this.r ? 2132020022 : 2132018586);
    }

    public final CharSequence z(Context context) {
        boolean z = this.s;
        uz3 uz3Var = this.p;
        return z ? uz3Var.c.a(context.getResources()) : uz3Var.b.a(context.getResources());
    }
}
