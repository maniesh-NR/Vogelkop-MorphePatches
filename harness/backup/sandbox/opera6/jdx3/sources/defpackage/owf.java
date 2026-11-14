package defpackage;

/* loaded from: classes.dex */
public enum owf {
    c("DEFAULT", true),
    d("HIGH_USAGE", false),
    e("HIGHEST_USAGE", false),
    f("NAVIGATION", false);

    public final byte a;
    public final boolean b;

    /* JADX WARN: Multi-variable type inference failed */
    owf(String str, boolean z) {
        this.a = i;
        this.b = z;
    }
}
