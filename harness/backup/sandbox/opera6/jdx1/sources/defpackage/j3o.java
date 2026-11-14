package defpackage;

/* loaded from: classes.dex */
public final class j3o extends i3o {
    @Override // defpackage.i3o, defpackage.w1h
    public final boolean q() {
        return (this.a.getSystemBarsAppearance() & 8) != 0;
    }

    @Override // defpackage.i3o, defpackage.w1h
    public final void v(boolean z) {
        this.a.setSystemBarsAppearance(z ? 16 : 0, 16);
    }

    @Override // defpackage.i3o, defpackage.w1h
    public final void w(boolean z) {
        this.a.setSystemBarsAppearance(z ? 8 : 0, 8);
    }

    @Override // defpackage.i3o, defpackage.w1h
    public final void x() {
        this.a.setSystemBarsBehavior(2);
    }
}
