package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class a56 implements aln {
    public final int a;
    public final int b;

    public a56(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.aln
    public final boolean a() {
        return false;
    }

    @Override // defpackage.aln
    public final g7j b() {
        return null;
    }

    @Override // defpackage.aln
    public final xkn c(Context context, o2c o2cVar) {
        return xkn.a(this, this.a, this.b);
    }

    @Override // defpackage.aln
    public final int f() {
        return this.a != this.b ? 20 : 19;
    }

    @Override // defpackage.aln
    public final String getId() {
        return "CUSTOM_COLOR";
    }

    @Override // defpackage.aln
    public final int getType() {
        return this.a != this.b ? 1 : 0;
    }
}
