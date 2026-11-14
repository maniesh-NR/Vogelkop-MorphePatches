package com.opera.android.browser;

import J.N;
import android.net.Uri;
import defpackage.nml;
import defpackage.oml;
import defpackage.p6l;
import defpackage.sko;
import defpackage.tcl;
import defpackage.ttn;
import defpackage.umi;
import defpackage.wa;
import defpackage.zun;

/* loaded from: classes.dex */
public final class b {
    public static final long e;
    public static final t6a f;
    public final String a;
    public final zun b;
    public final boolean c;
    public boolean d;

    static {
        on7 on7Var = pn7.b;
        e = cs5.x0(5, un7.e);
        f = new t6a();
    }

    public b(tcl tclVar, String str, p6l p6lVar, zun zunVar, boolean z) {
        this.a = str;
        this.b = zunVar;
        this.c = z;
        if (!Uri.parse(str).isAbsolute()) {
            if (this.d) {
                return;
            }
            this.d = true;
            zunVar.f(false);
            return;
        }
        String strJ = sko.j("User-Agent: ", (String) N.MeR1QuE8());
        umi umiVar = (umi) tclVar;
        nml nmlVarE = umiVar.e(new yun(this, (byte) 0));
        nmlVarE.b(umiVar.f(new yun(this, (byte) 1)));
        SimpleUrlLoader simpleUrlLoaderA = SimpleUrlLoader.a(str, strJ, new yun(this, (byte) 2));
        N.MpBW0XH2(simpleUrlLoaderA.a, p6lVar == p6l.b, new wa(nmlVarE, (byte) 26), new wa(this, (byte) 27));
        coh.k(new oml(umiVar.d(new ttn(this, (byte) 1))), (Object) null, e);
    }
}
