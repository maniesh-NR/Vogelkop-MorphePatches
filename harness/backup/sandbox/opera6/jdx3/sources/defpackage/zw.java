package defpackage;

/* loaded from: classes.dex */
public final class zw {
    public final boolean a;
    public final sfe b;

    public zw(boolean z, sfe sfeVar) {
        this.a = z;
        this.b = sfeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zw)) {
            return false;
        }
        zw zwVar = (zw) obj;
        return this.a == zwVar.a && this.b.equals(zwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
