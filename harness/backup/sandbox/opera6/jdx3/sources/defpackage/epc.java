package defpackage;

/* loaded from: classes.dex */
public final class epc {
    public final String a;

    public epc(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof epc) && this.a.equals(((epc) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return sko.k("LiveScoreState(state=", this.a, ")");
    }
}
