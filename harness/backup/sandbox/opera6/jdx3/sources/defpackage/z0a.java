package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class z0a implements esk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k6l b;

    public /* synthetic */ z0a(k6l k6lVar, byte b) {
        this.a = b;
        this.b = k6lVar;
    }

    public final Object get() {
        byte b = this.a;
        k6l k6lVar = this.b;
        switch (b) {
            case 0:
                return k6lVar.o;
            default:
                b2l b2lVar = k6lVar.o;
                return Boolean.valueOf(b2lVar != null && ((d7l) b2lVar).j.m());
        }
    }
}
