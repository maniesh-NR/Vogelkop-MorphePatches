package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class e1b extends z4 {
    public final j6 b;
    public final int c;
    public final int d;

    /* JADX WARN: Multi-variable type inference failed */
    public e1b(j6 j6Var, int i, int i2) {
        this.b = j6Var;
        this.c = i;
        j14.s(i, i2, j6Var.size());
        this.d = i2 - i;
    }

    public final int d() {
        return this.d;
    }

    public final Object get(int i) {
        j14.q(i, this.d);
        return this.b.get(this.c + i);
    }

    public final List subList(int i, int i2) {
        j14.s(i, i2, this.d);
        int i3 = this.c;
        return new e1b(this.b, i + i3, i3 + i2);
    }
}
