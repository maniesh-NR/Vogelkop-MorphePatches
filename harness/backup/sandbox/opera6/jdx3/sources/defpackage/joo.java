package defpackage;

import android.content.Context;
import com.opera.ad.interstitial.AdActivity;
import com.opera.android.BrowserActivity;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class joo extends k8 implements ioo {
    public final lxo o;
    public final w6j p;

    public joo(Context context, chb chbVar, w6j w6jVar, l45 l45Var, uuj uujVar, p12 p12Var, fio fioVar) {
        super(uujVar, p12Var);
        this.p = w6jVar;
        l45 l45Var2 = l45Var;
        this.o = new lxo(context, chbVar, w6jVar, new wzg((byte) 15, this, l45Var2 == null ? dn.Co : l45Var2, false), null, fioVar);
    }

    @Override // defpackage.ioo
    public final boolean a() {
        return ((tmo) this.p.a).a != i7c.c && ((dzo) this.o.p.a).e;
    }

    @Override // defpackage.ioo
    public final bm b() {
        if (((tmo) this.p.a).a != i7c.c) {
            return null;
        }
        return bm.d;
    }

    @Override // defpackage.ioo
    public final void p(qb7 qb7Var) {
        this.o.a = qb7Var;
    }

    public final y9p s0(AdActivity adActivity) throws zno {
        lxo lxoVar = this.o;
        if (lxoVar.r == null) {
            try {
                y9p y9pVar = new y9p(adActivity, lxoVar.p);
                lxoVar.r = y9pVar;
                y9pVar.i = lxoVar.o;
                y9pVar.e = new tvk(lxoVar);
                w6j w6jVar = lxoVar.q;
                y9pVar.h = (ArrayList) w6jVar.d;
                y9pVar.r = (oam) w6jVar.c;
                y9pVar.l((w06) w6jVar.e);
            } catch (UnsupportedOperationException unused) {
                throw new zno(bm.INTERNAL_ERROR);
            }
        }
        return lxoVar.r;
    }

    @Override // defpackage.ioo
    public final void v(BrowserActivity browserActivity) {
        lxo lxoVar = this.o;
        if (((dzo) lxoVar.p.a).c != null) {
            AdActivity.b(this, browserActivity);
            return;
        }
        wm wmVar = (wm) lxoVar.a;
        if (wmVar != null) {
            wmVar.d(bm.INTERNAL_ERROR);
        }
    }
}
