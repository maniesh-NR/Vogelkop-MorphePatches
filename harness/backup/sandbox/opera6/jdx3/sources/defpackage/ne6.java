package defpackage;

/* loaded from: classes.dex */
public final class ne6 {
    public final int a;
    public final String b;

    public ne6(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ne6.class == obj.getClass()) {
            if (this.a == ((ne6) obj).a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
