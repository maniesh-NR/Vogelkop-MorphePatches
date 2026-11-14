package defpackage;

/* loaded from: classes.dex */
public final class r64 {
    public t64 a;
    public bfi b;
    public int c;

    public final String toString() {
        StringBuilder sb = new StringBuilder(String.valueOf(this.a));
        sb.append(" {...} (src=");
        int i = this.c;
        sb.append(i != 1 ? i != 2 ? "null" : "RenderOptions" : "Document");
        sb.append(")");
        return sb.toString();
    }
}
