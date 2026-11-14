package defpackage;

/* loaded from: classes.dex */
public final class rdb {
    public final ws7 a;
    public int b;

    public rdb(ws7 ws7Var) {
        this.a = ws7Var;
    }

    public final void a(boolean z) {
        int i;
        int i2 = this.b;
        if (z) {
            i = i2 + 1;
            this.b = i;
        } else {
            i = i2 - 1;
            this.b = i;
        }
        ws7 ws7Var = this.a;
        if (i == 1) {
            ws7Var.invoke(Boolean.TRUE);
        } else if (i == 0) {
            ws7Var.invoke(Boolean.FALSE);
        }
    }
}
