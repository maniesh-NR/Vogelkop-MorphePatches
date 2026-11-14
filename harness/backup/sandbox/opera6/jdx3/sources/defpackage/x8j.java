package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class x8j extends k1g {
    public final /* synthetic */ List i;
    public final /* synthetic */ int j;
    public final /* synthetic */ j9j k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ jk7 m;

    /* JADX WARN: Multi-variable type inference failed */
    public x8j(List list, int i, j9j j9jVar, int i2, jk7 jk7Var) {
        this.i = list;
        this.j = i;
        this.k = j9jVar;
        this.l = i2;
        this.m = jk7Var;
    }

    public final int C() {
        return this.k.b.size() + (this.l ? 1 : 0);
    }

    public final int D() {
        return this.i.size() + this.j;
    }

    public final boolean h(int i, int i2) {
        boolean z;
        int i3 = i - this.j;
        int i4 = i2 - (this.l ? 1 : 0);
        if (i3 >= 0) {
            z = false;
        } else {
            if (i4 < 0) {
                return true;
            }
            z = true;
        }
        if (z != (i4 < 0)) {
            return false;
        }
        return ((gyg) ((c37) this.m.d).b).i(this.i.get(i3), this.k.b.get(i4));
    }

    public final boolean i(int i, int i2) {
        boolean z;
        int i3 = i - this.j;
        int i4 = i2 - (this.l ? 1 : 0);
        if (i3 >= 0) {
            z = false;
        } else {
            if (i4 < 0) {
                return true;
            }
            z = true;
        }
        if (z != (i4 < 0)) {
            return false;
        }
        return ((gyg) ((c37) this.m.d).b).j(this.i.get(i3), this.k.b.get(i4));
    }

    public final Object u(int i, int i2) {
        int i3 = i - this.j;
        int i4 = i2 - (this.l ? 1 : 0);
        if (i3 < 0 || i4 < 0) {
            return null;
        }
        return Boolean.valueOf(((gyg) ((c37) this.m.d).b).i(this.i.get(i3), this.k.b.get(i4)));
    }
}
