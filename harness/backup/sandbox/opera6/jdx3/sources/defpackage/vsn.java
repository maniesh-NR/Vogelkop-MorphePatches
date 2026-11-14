package defpackage;

import android.net.Uri;
import androidx.fragment.app.w;
import com.leanplum.internal.Constants;
import com.opera.api.Callback;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class vsn {
    public final ize a;
    public final boolean b;
    public final s62 c;
    public final Function2 d;
    public final Function2 e;
    public final esk f;
    public final kze g;
    public final Runnable h;
    public final urn i;
    public final esk j;
    public final g7m k;
    public final kze l;
    public final boolean m;
    public final kze n;
    public final nak o;
    public final rlh p;
    public final wnm q;
    public final y1n r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;

    public vsn(ize izeVar, boolean z, s62 s62Var, Function2 function2, Function2 function22, esk eskVar, kze kzeVar, Runnable runnable, urn urnVar, esk eskVar2) {
        this.a = izeVar;
        this.b = z;
        this.c = s62Var;
        this.d = function2;
        this.e = function22;
        this.f = eskVar;
        this.g = kzeVar;
        this.h = runnable;
        this.i = urnVar;
        this.j = eskVar2;
        this.k = s62Var.c;
        kze kzeVar2 = new kze(og.a);
        this.l = kzeVar2;
        this.m = ((Boolean) izeVar.g()).booleanValue();
        this.n = new kze(Boolean.FALSE);
        nak nakVarF = z4o.f((Object) null);
        this.o = nakVarF;
        this.p = a26.j(nakVarF);
        byte b = 0;
        tsn tsnVar = new tsn(rsn.f, new isn(z, true), nsn.e, false, false, false);
        ekc ekcVar = s62Var.s;
        wnm wnmVar = new wnm(tsnVar, Arrays.asList(ekcVar, xf8.B(s62Var.r.i), kzeVar, s62Var.t, s62Var.f().k, s62Var.u, s62Var.e().m, s62Var.p.c), new fza((byte) 17), new cfn(0, this, vsn.class, "calculateNewState", "calculateNewState()Lcom/opera/android/webaiassistant/WebAiAssistantViewModel$ViewState;", 0, (byte) 4));
        wnmVar.s(s62Var.f().i, new jqn(new vrn(this, b), (byte) 1));
        wnmVar.s(s62Var.f().j, new jqn(new vrn(this, (byte) 1), (byte) 1));
        this.q = wnmVar;
        this.r = new y1n((Object) this, (byte) 28);
        kzeVar2.k(new jqn(new vrn(this, (byte) 2), (byte) 1));
        a26.T(ekcVar, kzeVar2, new wrn(this, b));
    }

    public static void j(vsn vsnVar, boolean z) {
        ju4 ju4VarC = vsnVar.c();
        if (ju4VarC != null) {
            long j = ju4VarC.a;
            ole oleVar = vsnVar.c.c().a;
            l08 l08Var = l08.a;
            qu4 qu4Var = new qu4(l08Var, l08Var, z);
            t40 t40Var = new t40((byte) 17);
            oleVar.getClass();
            vpb vpbVar = new vpb();
            orb orbVar = new orb();
            vpbVar.a(orbVar);
            orbVar.o(j, "id");
            orbVar.p(qu4Var.a(), "modifiers");
            qq8 qq8Var = (qq8) oleVar.a;
            String strH = qq8Var.h();
            orb orbVarJ = o18.j("jsonrpc", "2.0", "method", "actions.v1.updateChatModifiers");
            orbVarJ.p(vpbVar, Constants.Params.PARAMS);
            orbVarJ.p(strH, "id");
            qq8Var.l(orbVarJ, new c42(t40Var, (byte) 1));
        }
    }

    public final void a(Uri uri) {
        if (b().size() >= 3) {
            return;
        }
        iy1 iy1VarE = this.c.e();
        ux1 ux1Var = ux1.c;
        iy1VarE.getClass();
        String strValueOf = String.valueOf(System.currentTimeMillis());
        iy1VarE.e(strValueOf, new w12(uri, iy1VarE.c(strValueOf)), ux1Var);
    }

    public final List b() {
        return (List) this.c.e().m.g();
    }

    public final ju4 c() {
        u42 u42Var = (u42) this.c.s.g();
        if (u42Var != null) {
            return new ju4(u42Var.c.a);
        }
        return null;
    }

    public final void d(boolean z) {
        this.s = z;
        this.q.u();
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.nv0 r8, joh r9, fw0 r10) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vsn.e(nv0, joh, fw0):void");
    }

    public final qx1 f(String str) {
        Object next;
        Iterator it = b().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.a(((jx1) next).getId(), str)) {
                break;
            }
        }
        jx1 jx1Var = (jx1) next;
        if (jx1Var != null && (jx1Var instanceof vx1)) {
            wxe wxeVar = ((vx1) jx1Var).b;
            if (wxeVar instanceof qx1) {
                return (qx1) wxeVar;
            }
        }
        return null;
    }

    public final void g() {
        if (((Boolean) this.n.g()).booleanValue()) {
            l();
            return;
        }
        qyj qyjVarF = this.c.f();
        bzj bzjVar = (bzj) qyjVarF.j.g();
        if (bzjVar != null && bzjVar.a()) {
            qyjVarF.m();
            return;
        }
        hbn hbnVar = (hbn) qyjVarF.i.g();
        if (hbnVar == null || (hbnVar instanceof ebn) || (hbnVar instanceof fbn) || (hbnVar instanceof cbn)) {
            qyjVarF.f();
            qyjVarF.b();
        } else if ((hbnVar instanceof gbn) || (hbnVar instanceof bbn) || hbnVar.equals(dbn.a)) {
            qyjVarF.f();
        } else {
            h9o.p();
        }
    }

    public final void h(ux1 ux1Var, boolean z, Callback callback) {
        if (b().size() >= 3) {
            return;
        }
        if (z) {
            this.k.c(l60.g);
        }
        this.c.e().f(ux1Var, new j12(callback, (byte) 14));
    }

    public final void i(ux1 ux1Var) {
        if (b().size() >= 3) {
            return;
        }
        iy1 iy1VarE = this.c.e();
        iy1VarE.getClass();
        String strValueOf = String.valueOf(System.currentTimeMillis());
        File fileC = iy1VarE.c(strValueOf);
        b8h.m(iy1VarE.d.a, new j12(new xx1((Object) iy1VarE, (Object) strValueOf, (Object) fileC, (Object) ux1Var, (byte) 0), (byte) 1));
    }

    public final void k(b80 b80Var) {
        hxk hxkVar = (hxk) this.j.get();
        gil gilVar = new gil((Object) this, (Object) b80Var, (byte) 21);
        w wVar = ((kxk) hxkVar).f;
        xih.t(wVar, false, null);
        wVar.i0("SyncAuthPortalFragment_request", this.c, new crk(gilVar, (byte) 3));
    }

    public final void l() {
        ju4 ju4VarC = c();
        if (ju4VarC != null) {
            long j = ju4VarC.a;
            p62 p62VarC = this.c.c();
            ole oleVar = p62VarC.a;
            bi biVar = new bi(p62VarC, (byte) 24);
            oleVar.getClass();
            vpb vpbVar = new vpb();
            orb orbVar = new orb();
            vpbVar.a(orbVar);
            orbVar.o(j, "id");
            qq8 qq8Var = (qq8) oleVar.a;
            String strH = qq8Var.h();
            orb orbVarJ = o18.j("jsonrpc", "2.0", "method", "actions.v1.stopChat");
            orbVarJ.p(vpbVar, Constants.Params.PARAMS);
            orbVarJ.p(strH, "id");
            qq8Var.l(orbVarJ, new t02(biVar, (byte) 8));
        }
    }

    public final void m(String str, boolean z) {
        ju4 ju4VarC = c();
        if (ju4VarC != null) {
            long j = ju4VarC.a;
            s62 s62Var = this.c;
            iy1 iy1VarE = s62Var.e();
            iy1VarE.j.c((List) iy1VarE.m.g(), ez1.c, z);
            p62 p62VarC = s62Var.c();
            w52[] w52VarArr = w52.a;
            a52 a52Var = p62VarC.e;
            z42 z42VarB = a52Var.b();
            p62VarC.c(j, str, z42VarB);
            a52Var.a(z42VarB);
            s62Var.e().b();
        }
    }
}
