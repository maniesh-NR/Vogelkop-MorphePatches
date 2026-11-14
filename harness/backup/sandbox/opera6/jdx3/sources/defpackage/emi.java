package defpackage;

/* loaded from: classes.dex */
public final class emi implements fmi {
    public final String a;
    public final l1o b;

    public emi(String str, l1o l1oVar) {
        this.a = str;
        this.b = l1oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof emi)) {
            return false;
        }
        emi emiVar = (emi) obj;
        return this.a.equals(emiVar.a) && this.b.equals(emiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
