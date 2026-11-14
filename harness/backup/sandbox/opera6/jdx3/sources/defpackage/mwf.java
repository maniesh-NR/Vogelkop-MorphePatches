package defpackage;

/* loaded from: classes.dex */
public final class mwf extends mzg {
    public final /* synthetic */ byte b;
    public final /* synthetic */ nwf c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ mwf(nwf nwfVar, boolean z, byte b) {
        this.b = b;
        this.c = nwfVar;
        this.d = z;
    }

    public final void g() {
        byte b = this.b;
        boolean z = this.d;
        nwf nwfVar = this.c;
        switch (b) {
            case 0:
                nwfVar.b.j(z);
                break;
            default:
                nwfVar.b.p(null, z);
                break;
        }
    }

    public final void o() {
        byte b = this.b;
        nwf nwfVar = this.c;
        switch (b) {
            case 0:
                nwfVar.w(this.d ? xl0.u : xl0.v);
                break;
            default:
                nwfVar.w(xl0.f);
                break;
        }
    }
}
