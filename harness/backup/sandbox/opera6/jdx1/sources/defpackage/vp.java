package defpackage;

/* loaded from: classes.dex */
public enum vp {
    HTML("html"),
    NATIVE("native"),
    JAVASCRIPT("javascript");

    public final String a;

    vp(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
