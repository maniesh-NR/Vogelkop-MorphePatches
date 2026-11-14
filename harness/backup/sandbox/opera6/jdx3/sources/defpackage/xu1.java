package defpackage;

/* loaded from: classes.dex */
public final class xu1 implements nwe, cxe {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xu1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.cxe
    public final void B() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((yu1) obj).c();
                break;
            case 1:
                ((kxe) obj).J0();
                break;
            default:
                ((daj) obj).g();
                break;
        }
    }

    @Override // defpackage.nwe
    public final void y(boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((yu1) obj).c();
                break;
            case 1:
                ((kxe) obj).J0();
                break;
            default:
                ((daj) obj).g();
                break;
        }
    }
}
