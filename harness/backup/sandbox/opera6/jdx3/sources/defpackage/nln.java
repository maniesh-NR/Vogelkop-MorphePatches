package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class nln implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qln b;

    public /* synthetic */ nln(qln qlnVar, byte b) {
        this.a = b;
        this.b = qlnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        qln qlnVar = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                qlnVar.f.k(qlnVar.o.n(qlnVar.i()), 0, new oln(qlnVar, b2));
                break;
            default:
                qjn qjnVar = (qjn) qlnVar.h.g();
                qlnVar.f.k(qjnVar.a.a, 0, new iyk(qlnVar, qjnVar, (byte) 13));
                break;
        }
    }
}
