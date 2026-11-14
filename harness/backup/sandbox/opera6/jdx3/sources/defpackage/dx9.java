package defpackage;

/* loaded from: classes.dex */
public final class dx9 extends slm {
    public final /* synthetic */ byte b;
    public uik c;

    public /* synthetic */ dx9(byte b) {
        this.b = b;
    }

    @Override // defpackage.slm
    public final void a(bp bpVar, int i) throws e22 {
        switch (this.b) {
            case 0:
                bpVar.y(16, i);
                bpVar.y(this.a, i + 4);
                byte b = this.a;
                if (b == 0) {
                    bpVar.J((sw9) this.c, i + 8, false);
                    break;
                } else if (b == 1) {
                    bpVar.J(null, i + 8, false);
                    break;
                }
                break;
            default:
                bpVar.y(16, i);
                bpVar.y(this.a, i + 4);
                if (this.a == 0) {
                    bpVar.J((kgh) this.c, i + 8, false);
                    break;
                }
                break;
        }
    }
}
