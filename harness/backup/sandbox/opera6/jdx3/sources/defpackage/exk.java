package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class exk implements n5o {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xbf b;

    public /* synthetic */ exk(xbf xbfVar, byte b) {
        this.a = b;
        this.b = xbfVar;
    }

    public final Object g(Object obj) {
        byte b = this.a;
        xbf xbfVar = this.b;
        List<fxk> list = (List) obj;
        switch (b) {
            case 0:
                if (list == null) {
                    xbf.h = null;
                    break;
                } else {
                    ((glh) xbfVar.d).f(new eof(xbfVar, list, (byte) 27));
                    break;
                }
            default:
                glh glhVar = (glh) xbfVar.d;
                if (!glhVar.e() && !list.isEmpty()) {
                    vr9 vr9Var = new vr9(new koj(xbfVar, (byte) 1), list.size());
                    for (fxk fxkVar : list) {
                        String str = fxkVar.b;
                        s2g s2gVar = new s2g(xbfVar, fxkVar, vr9Var, (byte) 10);
                        qie qieVar = glhVar.d;
                        umi umiVar = glhVar.c;
                        nml nmlVarB = umiVar.b(new ow3(glhVar, str, (byte) 7));
                        nmlVarB.b(umiVar.f(new r9g(s2gVar, (byte) 15)));
                        qieVar.n(new oml(nmlVarB), null);
                    }
                    break;
                } else {
                    xbf.h = null;
                    break;
                }
                break;
        }
        return null;
    }
}
