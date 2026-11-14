package defpackage;

/* loaded from: classes.dex */
public final class n3o implements m3o {
    public final String b;
    public final k8b c;
    public final k8b d;

    public n3o(String str) {
        this.b = str;
        this.c = new k8b(str);
        this.d = new k8b(str.concat(" maximum"));
    }

    public final String toString() {
        return this.b;
    }
}
