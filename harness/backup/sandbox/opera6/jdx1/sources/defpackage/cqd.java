package defpackage;

/* loaded from: classes.dex */
public final class cqd {
    public eqd a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cqd) {
            return this.a.equals(((cqd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
