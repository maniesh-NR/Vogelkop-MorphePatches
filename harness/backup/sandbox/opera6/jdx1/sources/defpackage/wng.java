package defpackage;

/* loaded from: classes.dex */
public final class wng extends vng {
    public final Object c;

    public wng(int i) {
        super(i);
        this.c = new Object();
    }

    @Override // defpackage.vng
    public final Object a() {
        Object objA;
        synchronized (this.c) {
            objA = super.a();
        }
        return objA;
    }

    @Override // defpackage.vng
    public final boolean c(Object obj) {
        boolean zC;
        synchronized (this.c) {
            zC = super.c(obj);
        }
        return zC;
    }
}
