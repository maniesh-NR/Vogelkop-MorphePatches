package defpackage;

/* loaded from: classes.dex */
public final class dn5 implements gn5 {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public boolean e;
    public boolean f = true;

    public dn5(int i, boolean z, boolean z2, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
        this.e = z2;
    }

    @Override // defpackage.gn5
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.gn5
    public final int getType() {
        return this.d ? 1 : 2;
    }
}
