package defpackage;

import android.app.Activity;
import java.util.Collections;

/* loaded from: classes.dex */
public final class lhb {
    public final i16 a;
    public final x5f b;
    public final yl c;
    public final i16 d;
    public final csh e;
    public final nhb f;
    public final po7 g;
    public yz h;
    public s50 i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;

    public lhb(ndc ndcVar, x5f x5fVar, yl ylVar, pza pzaVar, pza pzaVar2, ni6 ni6Var, i16 i16Var, csh cshVar, nhb nhbVar, po7 po7Var) {
        this.a = new i16((Object) pzaVar2, (Object) ni6Var, (byte) 22);
        this.b = x5fVar;
        this.c = ylVar;
        this.d = i16Var;
        this.e = cshVar;
        this.f = nhbVar;
        this.g = po7Var;
        po7Var.j(ndcVar, new ihb(this, (byte) 0));
    }

    public final void a() {
        bz p7hVar;
        yz yzVar = this.h;
        if (yzVar != null) {
            if (!yzVar.q()) {
                this.k = !this.l;
                return;
            } else {
                this.h.c();
                this.h = null;
            }
        }
        if (this.j) {
            this.k = !this.l;
            return;
        }
        this.j = true;
        hl hlVar = this.f.b;
        byte b = 0;
        hhb hhbVar = new hhb(this, (byte) 0);
        hhb hhbVar2 = new hhb(this, (byte) 1);
        i16 i16Var = this.d;
        w7h w7hVar = (w7h) i16Var.b;
        if (hlVar != null) {
            p7hVar = w7hVar.a(hlVar);
        } else {
            p7h p7hVar2 = (p7h) i16Var.c;
            if (p7hVar2 == null) {
                r9g r9gVar = w7hVar.s;
                xnh xnhVar = w7hVar.e;
                qyf qyfVar = (qyf) ep7.a.get();
                if (qyfVar.a0()) {
                    Activity activity = w7hVar.a;
                    rm rmVar = rm.NATIVE;
                    dz dzVarS0 = qyfVar.s0(new xo7(activity, rmVar, "980088188", w7hVar.f, w7hVar.j, w7hVar.w, new r68(xnhVar), w7hVar.n, ap.b(0, 0), w7hVar.s));
                    yo yoVar = yo.PANGLE;
                    p7hVar = new p7h(dzVarS0, new vo("", "", "", yoVar, 0, yo.g(yoVar, rmVar), 0), r9gVar);
                } else {
                    Activity activity2 = w7hVar.a;
                    umi umiVar = w7hVar.b;
                    rm rmVar2 = rm.NATIVE;
                    ao aoVar = new ao(activity2, umiVar, rmVar2, "ca-app-pub-3940256099942544/1033173712", w7hVar.f, w7hVar.j, w7hVar.w, new r68(xnhVar), w7hVar.n, ap.b(0, 0), w7hVar.s, false, new t7h(w7hVar, b), new t7h(w7hVar, (byte) 1), new t7h(w7hVar, (byte) 2));
                    yo yoVar2 = yo.ADMOB;
                    p7hVar = new p7h(aoVar, new vo("", "", "", yoVar2, 0, yo.g(yoVar2, rmVar2), 0), r9gVar);
                }
                i16Var.c = p7hVar;
            } else {
                p7hVar = p7hVar2;
            }
            hlVar = new hl(1, "", 0, 0, 0, false, null, null);
        }
        if (p7hVar.a()) {
            p7hVar.e(new mhb(i16Var, hhbVar, hhbVar2, p7hVar), new m43(hlVar, null, 3, Collections.EMPTY_LIST));
        } else {
            hhbVar2.run(s50.c);
        }
    }

    public final boolean b(int i) {
        hl hlVar = this.f.b;
        if (hlVar == null) {
            return false;
        }
        if (hlVar.j) {
            if (i != 1) {
                return false;
            }
        } else if (this.m < hlVar.i) {
            return false;
        }
        return this.a.A(hlVar.h, hlVar.g);
    }
}
