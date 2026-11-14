package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class di8 implements fjc, op5 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vjd b;

    public /* synthetic */ di8(vjd vjdVar, byte b) {
        this.a = b;
        this.b = vjdVar;
    }

    @Override // defpackage.op5
    public final void accept(Object obj) {
        ((xkg) obj).B(this.b);
    }

    public final void invoke(Object obj) {
        byte b = this.a;
        vjd vjdVar = this.b;
        eig eigVar = (eig) obj;
        switch (b) {
            case 0:
                eigVar.I(vjdVar);
                break;
            default:
                eigVar.o(vjdVar);
                break;
        }
    }
}
