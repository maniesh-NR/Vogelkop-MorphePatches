package defpackage;

/* loaded from: classes.dex */
public final class oje implements ndc {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final qdc d;

    public /* synthetic */ oje(int i, String str, boolean z) {
        this(str, true, (i & 4) != 0 ? false : z);
    }

    public oje(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = new qdc(this, true);
    }

    public final tcc getLifecycle() {
        return this.d;
    }
}
