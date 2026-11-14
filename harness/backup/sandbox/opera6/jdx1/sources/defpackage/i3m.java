package defpackage;

/* loaded from: classes.dex */
public final class i3m extends e3m {
    public final /* synthetic */ byte a;
    public y2m b;

    public /* synthetic */ i3m() {
        this.a = (byte) 1;
    }

    public /* synthetic */ i3m(y2m y2mVar, byte b) {
        this.a = b;
        this.b = y2mVar;
    }

    @Override // defpackage.e3m, defpackage.x2m
    public final void d(y2m y2mVar) {
        switch (this.a) {
            case 0:
                j3m j3mVar = (j3m) this.b;
                j3mVar.F.remove(y2mVar);
                if (!j3mVar.v()) {
                    j3mVar.z(j3mVar, bxl.d, false);
                    j3mVar.r = true;
                    j3mVar.z(j3mVar, bxl.c, false);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.e3m, defpackage.x2m
    public final void e(y2m y2mVar) {
        switch (this.a) {
            case 1:
                j3m j3mVar = (j3m) this.b;
                int i = j3mVar.H - 1;
                j3mVar.H = i;
                if (i == 0) {
                    j3mVar.I = false;
                    j3mVar.p();
                }
                y2mVar.C(this);
                break;
            case 2:
                this.b.F();
                y2mVar.C(this);
                break;
        }
    }

    @Override // defpackage.e3m, defpackage.x2m
    public final void f(y2m y2mVar) {
        switch (this.a) {
            case 1:
                j3m j3mVar = (j3m) this.b;
                if (!j3mVar.I) {
                    j3mVar.N();
                    j3mVar.I = true;
                    break;
                }
                break;
        }
    }
}
