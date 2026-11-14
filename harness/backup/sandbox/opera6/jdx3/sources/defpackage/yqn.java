package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class yqn implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mrn b;

    public /* synthetic */ yqn(mrn mrnVar, byte b) {
        this.a = b;
        this.b = mrnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n2d n2dVar;
        byte b = this.a;
        mrn mrnVar = this.b;
        switch (b) {
            case 0:
                crn crnVar = mrnVar.o;
                if (mrnVar.e()) {
                    n2d n2dVar2 = mrnVar.d;
                    n2d n2dVar3 = mrnVar.c;
                    if (mrn.f(n2dVar3)) {
                        n2dVar = n2dVar3;
                    } else {
                        if (!mrn.f(n2dVar2)) {
                            n2dVar2 = null;
                        }
                        n2dVar = n2dVar2;
                    }
                    if (n2dVar != null) {
                        rn9 rn9VarJ = crnVar.j();
                        qba qbaVar = new qba(crnVar.b(), n2dVar, fan.a(8.0f, n2dVar.getResources()), 3, new sxh(2132021479, new Object[0]), null, 2131558476, null, true);
                        crnVar.m(new sba(qbaVar), new lrn(mrnVar, rn9VarJ));
                        break;
                    }
                }
                break;
            case 1:
                mrnVar.m.setVisibility(8);
                break;
            default:
                mrnVar.p.f(drn.j);
                break;
        }
    }
}
