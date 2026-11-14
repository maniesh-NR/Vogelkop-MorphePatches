package defpackage;

/* loaded from: classes.dex */
public final class wg implements j6l {
    public final /* synthetic */ xg a;

    public wg(xg xgVar) {
        this.a = xgVar;
    }

    @Override // defpackage.j6l
    public final void H(b2l b2lVar, b2l b2lVar2, int i) {
        h7f h7fVar = (h7f) this.a.b;
        if (b2lVar != null) {
            g7f g7fVarH = am2.h(h7fVar, h7fVar);
            while (g7fVarH.hasNext()) {
                ((d7l) b2lVar).H((a2l) g7fVarH.next());
            }
        }
        g7f g7fVarH2 = am2.h(h7fVar, h7fVar);
        while (g7fVarH2.hasNext()) {
            a2l a2lVar = (a2l) g7fVarH2.next();
            d7l d7lVar = (d7l) b2lVar2;
            d7lVar.F(a2lVar);
            a2lVar.G(d7lVar);
        }
    }
}
