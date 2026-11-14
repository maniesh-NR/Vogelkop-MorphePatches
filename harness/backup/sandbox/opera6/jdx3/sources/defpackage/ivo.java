package defpackage;

import java.io.File;

/* loaded from: classes.dex */
public final /* synthetic */ class ivo implements n1p {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ pxo b;

    public /* synthetic */ ivo(boolean z, pxo pxoVar) {
        this.a = z;
        this.b = pxoVar;
    }

    @Override // defpackage.n1p
    public final void invoke(Object obj) {
        int i;
        boolean z = this.a;
        pxo pxoVar = this.b;
        t0i t0iVar = (t0i) obj;
        if (z) {
            vdp vdpVar = (vdp) pxoVar.b.b;
            ((w9p) vdpVar.a).C();
            vjo vjoVarD = t0i.d(t0iVar.a);
            if (vjoVarD == null) {
                i = 0;
            } else {
                vjo vjoVar = vjoVarD instanceof vjo ? vjoVarD : null;
                i = vjoVar != null ? vjoVar.a : -1;
            }
            vdpVar.h(i);
        }
        Object obj2 = t0iVar.a;
        if (!(obj2 instanceof q0i)) {
            voo vooVar = (voo) obj2;
            vooVar.x = new File((File) ((zyk) ((wjh) pxoVar.b.c).f).getValue(), (String) pxoVar.j.getValue());
            pxoVar.d = vooVar;
            pxoVar.i = new p7p(vooVar);
            pxoVar.b(vooVar);
        }
        Throwable thD = t0i.d(obj2);
        if (thD != null) {
            pxoVar.e = pxoVar.e.a();
            uuj uujVar = pxoVar.c;
            if (uujVar != null) {
                uujVar.g(b8h.a(thD));
            }
            b8h.a(thD);
        }
    }
}
