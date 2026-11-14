package defpackage;

/* loaded from: classes.dex */
public final class ram implements sam {
    public final Object a;
    public final boolean b;

    public ram(Object obj, boolean z) {
        this.a = obj;
        this.b = z;
    }

    @Override // defpackage.sam
    public final boolean a() {
        return this.b;
    }

    @Override // defpackage.iak
    public final Object getValue() {
        return this.a;
    }
}
