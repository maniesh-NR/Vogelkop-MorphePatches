package defpackage;

/* loaded from: classes.dex */
public final class kxj {
    public final int a;
    public final lxh b;
    public final lxh c;
    public final lxh d;

    public kxj(int i, lxh lxhVar, lxh lxhVar2, lxh lxhVar3) {
        this.a = i;
        this.b = lxhVar;
        this.c = lxhVar2;
        this.d = lxhVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxj)) {
            return false;
        }
        kxj kxjVar = (kxj) obj;
        return this.a == kxjVar.a && this.b.equals(kxjVar.b) && this.c.equals(kxjVar.c) && this.d.equals(kxjVar.d);
    }

    public final int hashCode() {
        return Integer.hashCode(this.d.a) + rfp.c(this.c.a, rfp.c(this.b.a, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "";
    }
}
