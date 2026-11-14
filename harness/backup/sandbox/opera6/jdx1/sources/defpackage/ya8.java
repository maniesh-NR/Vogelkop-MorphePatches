package defpackage;

/* loaded from: classes.dex */
public final class ya8 implements fb8 {
    public final String a;

    public ya8(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ya8) && this.a.equals(((ya8) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return sko.k("EnterSdk(entryPoint=", this.a, ")");
    }
}
