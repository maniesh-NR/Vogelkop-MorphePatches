package defpackage;

/* loaded from: classes.dex */
public final class cpf extends ipf {
    public final String a;
    public final int b;

    public cpf(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpf)) {
            return false;
        }
        cpf cpfVar = (cpf) obj;
        return this.a.equals(cpfVar.a) && this.b == cpfVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
