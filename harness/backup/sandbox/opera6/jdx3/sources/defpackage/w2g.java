package defpackage;

/* loaded from: classes.dex */
public final class w2g implements ozj {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ w2g(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.ozj
    public final String a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((l2g) obj).f;
            default:
                return ((tqi) obj).g;
        }
    }

    @Override // defpackage.ozj
    public final int b() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((l2g) obj).a;
            default:
                return ((tqi) obj).a;
        }
    }
}
