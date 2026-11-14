package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class lqd implements vqd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vqd b;

    public /* synthetic */ lqd(vqd vqdVar, byte b) {
        this.a = b;
        this.b = vqdVar;
    }

    @Override // defpackage.vqd
    public final Object l(npd npdVar, nod nodVar, int i) {
        byte b = this.a;
        vqd vqdVar = this.b;
        switch (b) {
            case 0:
                if (npdVar != null) {
                    throw new ClassCastException();
                }
                xqd.S0(null, nodVar, i, vqdVar, new g00(nodVar, i, (byte) 4));
                throw null;
            default:
                return xqd.S0(npdVar, nodVar, i, vqdVar, new so4(npdVar, nodVar, i, (byte) 9));
        }
    }
}
