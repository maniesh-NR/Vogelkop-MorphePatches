package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class hw9 implements rwf {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hw9(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.rwf
    public final void a(boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                iw9 iw9Var = (iw9) obj;
                if (z) {
                    iw9Var.h();
                    break;
                }
                break;
            default:
                swf swfVar = (swf) obj;
                swfVar.a.c(swfVar.e, swfVar.a());
                swfVar.b();
                break;
        }
    }
}
