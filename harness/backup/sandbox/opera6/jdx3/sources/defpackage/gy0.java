package defpackage;

/* loaded from: classes.dex */
public final class gy0 extends fy0 implements aca {
    public final yda a;
    public final long b;
    public final String c;

    public gy0(yda ydaVar) {
        this.a = ydaVar;
        this.b = ydaVar.a.d.i();
        this.c = ydaVar.a.c;
    }

    @Override // defpackage.aca
    public final zda a() {
        return this.a;
    }

    @Override // defpackage.fy0
    public final long b() {
        return this.a.a.hashCode() + 4611686018427387904L;
    }
}
