package defpackage;

/* loaded from: classes.dex */
public final class t5i extends v5i {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t5i(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void a(to9 to9Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((rmg) obj).invoke(to9Var);
                break;
            default:
                a5l a5lVar = (a5l) obj;
                a5lVar.a.d(new w4l(a5lVar, (byte) 1)).a(null);
                break;
        }
    }
}
