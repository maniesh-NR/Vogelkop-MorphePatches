package defpackage;

import android.content.Context;
import android.net.Uri;
import android.widget.FrameLayout;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class bie {
    public final zyk a;
    public ksd b;
    public final phe c;
    public final zyk d;
    public final zyk e;

    public bie(Context context, String str) {
        wjo wjoVar = wjo.REGULAR;
        this.a = z4c.b(new m53(context, str));
        phe.a.getClass();
        this.c = phe.b;
        this.d = z4c.b(new xhe(this, (byte) 1));
        this.e = z4c.b(new xhe(this, (byte) 0));
    }

    public final qhe a(Function1 function1) {
        sro sroVar;
        y2p y2pVar = (y2p) b().d;
        if (y2pVar == null || (sroVar = (sro) function1.invoke(y2pVar)) == null) {
            return null;
        }
        return new qhe(Uri.parse(sroVar.b), sroVar.f);
    }

    public final o7p b() {
        return (o7p) this.a.getValue();
    }

    public final String c() {
        c4p c4pVarJ = b().j();
        if (c4pVarJ != null) {
            return (String) c4pVarJ.l.getValue();
        }
        return null;
    }

    public final void d() {
        g();
        o7p o7pVarB = b();
        o7pVarB.e = o7pVarB.e.c(new u6p(o7pVarB, (byte) 0));
    }

    public final void e(FrameLayout frameLayout, igi igiVar) {
        iko ikoVar = new iko(frameLayout);
        ejo ejoVar = fko.a;
        fko.b(frameLayout);
        o7p o7pVarB = b();
        o7pVarB.e = o7pVarB.e.b(new k48(o7pVarB, ikoVar, igiVar, this.c, (byte) 3), new u6p(o7pVarB, (byte) 3));
        if (o7pVarB.e instanceof u9p) {
            this.b = (ksd) igiVar.b;
        }
    }

    public final String f() {
        c4p c4pVarJ = b().j();
        if (c4pVarJ != null) {
            return (String) c4pVarJ.o.getValue();
        }
        return null;
    }

    public final void g() {
        o7p o7pVarB = b();
        o7pVarB.e = o7pVarB.e.i();
        ksd ksdVar = this.b;
        if (ksdVar != null) {
            ksdVar.removeAllViews();
            ksdVar.a = null;
            ksdVar.b = null;
        }
        this.b = null;
    }
}
