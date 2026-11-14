package defpackage;

/* loaded from: classes.dex */
public final class d52 extends c52 {
    public final String b;

    public d52(String str) {
        super(b52.e);
        this.b = str;
    }

    @Override // defpackage.c52
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof d52) && this.b.equals(((d52) obj).b);
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "";
    }
}
