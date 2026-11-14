package defpackage;

/* loaded from: classes.dex */
public final class frf {
    public final String a;
    public final int b;

    public frf() {
        this.b = 0;
        this.a = "";
    }

    public frf(izd izdVar) {
        this.b = izdVar.readInt();
        this.a = izdVar.readUTF();
    }
}
