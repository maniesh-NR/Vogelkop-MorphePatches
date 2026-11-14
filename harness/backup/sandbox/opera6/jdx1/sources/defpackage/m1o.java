package defpackage;

/* loaded from: classes.dex */
public final class m1o {
    public final a4o a;
    public final nog b;

    public m1o(a4o a4oVar, nog nogVar) {
        this.a = a4oVar;
        this.b = nogVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1o)) {
            return false;
        }
        m1o m1oVar = (m1o) obj;
        return this.a.equals(m1oVar.a) && this.b.equals(m1oVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowAdaptiveInfo(windowSizeClass=" + this.a + ", windowPosture=" + this.b + ")";
    }
}
