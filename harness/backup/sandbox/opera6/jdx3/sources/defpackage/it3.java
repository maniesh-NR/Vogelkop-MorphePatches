package defpackage;

/* loaded from: classes.dex */
public final class it3 implements sni {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ it3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.sni
    public final void Y(boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                jt3 jt3Var = (jt3) obj;
                xf8.G0(jt3Var.g, Boolean.valueOf(jt3Var.i && !z));
                break;
            default:
                ((xwe) obj).g.a();
                break;
        }
    }
}
