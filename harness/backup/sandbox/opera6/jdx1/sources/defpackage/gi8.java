package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class gi8 implements fjc, kid, mpd, op5 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ gi8(int i, int i2, byte b) {
        this.a = b;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.op5
    public final void accept(Object obj) {
        switch (this.a) {
            case 4:
                ((xkg) obj).Y(this.b, this.c);
                break;
            default:
                ((xkg) obj).h0(this.b, this.c);
                break;
        }
    }

    @Override // defpackage.mpd
    public final void c(mod modVar, int i) {
        modVar.c(i, this.b, this.c);
    }

    public final void f(gid gidVar) {
        gidVar.B(this.b, this.c);
    }

    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((eig) obj).s(this.b, this.c);
                break;
            default:
                ((eig) obj).s(this.b, this.c);
                break;
        }
    }
}
