package defpackage;

/* loaded from: classes.dex */
public final class o4a {
    public final s4a a;
    public final u4a b;
    public boolean c = true;

    public o4a(s4a s4aVar, u4a u4aVar) {
        this.a = s4aVar;
        this.b = u4aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(" ");
        sb.append(!this.c ? "+>" : "->");
        sb.append(" ");
        sb.append(this.b);
        return sb.toString();
    }
}
