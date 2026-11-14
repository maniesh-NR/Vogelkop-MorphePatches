package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class gqd implements tqd, uqd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xqd b;
    public final /* synthetic */ int c;

    public /* synthetic */ gqd(xqd xqdVar, int i, byte b) {
        this.a = b;
        this.b = xqdVar;
        this.c = i;
    }

    public final void a(xkg xkgVar, nod nodVar, List list) {
        byte b = this.a;
        int i = this.c;
        xqd xqdVar = this.b;
        switch (b) {
            case 1:
                xkgVar.b0(xqdVar.T0(nodVar, xkgVar, i), list);
                break;
            case 2:
                if (list.size() != 1) {
                    xkgVar.l(xqdVar.T0(nodVar, xkgVar, i), xqdVar.T0(nodVar, xkgVar, i + 1), list);
                    break;
                } else {
                    xkgVar.H(xqdVar.T0(nodVar, xkgVar, i), (qjd) list.get(0));
                    break;
                }
            default:
                xkgVar.b0(xqdVar.T0(nodVar, xkgVar, i), list);
                break;
        }
    }

    public final void h(xkg xkgVar, nod nodVar) {
        byte b = this.a;
        int i = this.c;
        xqd xqdVar = this.b;
        switch (b) {
            case 0:
                xkgVar.seekToDefaultPosition(xqdVar.T0(nodVar, xkgVar, i));
                break;
            default:
                xkgVar.o(xqdVar.T0(nodVar, xkgVar, i));
                break;
        }
    }
}
