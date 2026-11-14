package defpackage;

/* loaded from: classes.dex */
public final class j52 extends o52 {
    public final cpf a;

    public j52(cpf cpfVar) {
        this.a = cpfVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof j52) && this.a.equals(((j52) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "";
    }
}
