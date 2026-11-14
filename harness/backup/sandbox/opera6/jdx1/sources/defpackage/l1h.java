package defpackage;

/* loaded from: classes.dex */
public final class l1h {
    public final int a;

    public l1h(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l1h) {
            return this.a == ((l1h) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
