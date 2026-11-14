package defpackage;

/* loaded from: classes.dex */
public class qre {
    public final String a;
    public final yqe b;

    public qre(String str, yqe yqeVar) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(yqeVar == null ? "" : yqeVar.a);
        this.a = sb.toString();
        this.b = yqeVar;
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == getClass() && ((qre) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
