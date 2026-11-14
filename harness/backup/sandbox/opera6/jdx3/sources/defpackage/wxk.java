package defpackage;

/* loaded from: classes.dex */
public final class wxk {
    public final int a;
    public final int b;
    public final int c;

    public wxk(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wxk)) {
            return false;
        }
        wxk wxkVar = (wxk) obj;
        return this.a == wxkVar.a && this.b == wxkVar.b && this.c == wxkVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + rfp.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "";
    }
}
