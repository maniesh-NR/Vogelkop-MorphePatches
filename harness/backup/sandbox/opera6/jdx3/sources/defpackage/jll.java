package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class jll implements esk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hjf b;

    public /* synthetic */ jll(hjf hjfVar, byte b) {
        this.a = b;
        this.b = hjfVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.Context, hjf] */
    public final Object get() {
        byte b = this.a;
        ?? r1 = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(r1.E());
            default:
                return Boolean.valueOf(ozk.b(r1));
        }
    }
}
