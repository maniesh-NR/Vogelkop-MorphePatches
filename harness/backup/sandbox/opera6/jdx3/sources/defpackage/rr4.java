package defpackage;

/* loaded from: classes.dex */
public final class rr4 {
    public final String a;
    public final int b;
    public final byte c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    /* JADX WARN: Multi-variable type inference failed */
    public rr4(String str, int i, int i2, boolean z, boolean z2, int i3, boolean z3, boolean z4) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
        this.f = i3;
        this.g = z3;
        this.h = z4;
    }

    public static rr4 a(int i, int i2, String str, boolean z, boolean z2, int i3) {
        return new rr4(str, i, i2, z, z2, i3, false, false);
    }
}
