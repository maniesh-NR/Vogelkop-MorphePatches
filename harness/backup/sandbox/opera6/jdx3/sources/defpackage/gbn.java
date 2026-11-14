package defpackage;

/* loaded from: classes.dex */
public final class gbn extends hbn {
    public final abn a;

    public gbn(abn abnVar) {
        this.a = abnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gbn) && this.a == ((gbn) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "";
    }
}
