package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class eej implements ok5 {
    public final nej a;
    public final aal b;
    public final gjm c;

    public eej(nej nejVar, aal aalVar, gjm gjmVar) {
        this.a = nejVar;
        this.b = aalVar;
        this.c = gjmVar;
    }

    public final v4g a(zwk zwkVar, lld lldVar, boolean z) {
        pxh sxhVar;
        v4g v4gVar;
        if (z) {
            v4gVar = new v4g(new s9i(new rxh(2132020891), new rxh(2132020905), new rxh(2132022708), new rxh(2132020030), (byte) 24, false), new odf((byte) 12), false, lldVar);
        } else {
            rxh rxhVar = new rxh(2132020891);
            zwkVar.getClass();
            if (zwk.e()) {
                Iterator it = zwk.b().a.iterator();
                while (it.hasNext()) {
                    if (((ne6) it.next()).a == 3) {
                        sxhVar = new rxh(2132020892);
                        break;
                    }
                }
                sxhVar = new sxh(2132020888, new Object[]{new rxh(2132017591)});
                v4gVar = new v4g(new s9i(rxhVar, sxhVar, new rxh(2132020890), new rxh(2132020889), (byte) 24, false), new odf((byte) 11), true, lldVar);
            } else {
                sxhVar = new sxh(2132020888, new Object[]{new rxh(2132017591)});
                v4gVar = new v4g(new s9i(rxhVar, sxhVar, new rxh(2132020890), new rxh(2132020889), (byte) 24, false), new odf((byte) 11), true, lldVar);
            }
        }
        nej nejVar = this.a;
        nejVar.getClass();
        nejVar.b(v4gVar, ijm.b);
        return v4gVar;
    }
}
