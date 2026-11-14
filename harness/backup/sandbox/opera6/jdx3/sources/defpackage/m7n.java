package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class m7n implements AutoCloseable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m7n(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((kze) ((tvk) obj).a).r(og.a);
                break;
            default:
                ((atl) obj).b.g(qcc.a);
                break;
        }
    }
}
