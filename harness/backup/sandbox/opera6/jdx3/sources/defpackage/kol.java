package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.leanplum.internal.ResourceQualifiers;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class kol {
    public static final ColorDrawable r = new ColorDrawable(0);
    public static final hol s = new hol(new fol(0, p6l.a, "about:blank"), vnl.a);
    public static final Bitmap.Config t = Bitmap.Config.RGB_565;
    public final Context a;
    public final ikc b;
    public final Function1 c;
    public n9h d;
    public hol e = s;
    public int f;
    public boolean g;
    public ynj h;
    public ne5 i;
    public final deg j;
    public final LinkedHashSet k;
    public final yqa l;
    public final zyk m;
    public final yqa n;
    public final zyk o;
    public final zyk p;
    public final yqa q;

    public kol(Context context, final pde pdeVar, ikc ikcVar, final yqa yqaVar, Function1 function1) {
        this.a = context;
        this.b = ikcVar;
        this.c = function1;
        yqaVar.getClass();
        this.j = yne.b;
        this.k = new LinkedHashSet();
        this.l = yqaVar;
        final byte b = 0;
        this.m = z4c.b(new Function0() { // from class: rnl
            public final Object invoke() {
                byte b2 = b;
                kol kolVar = this;
                pde pdeVar2 = pdeVar;
                yqa yqaVar2 = yqaVar;
                switch (b2) {
                    case 0:
                        c8l c8lVar = (c8l) ((BrowserActivity) yqaVar2.c).w0.get();
                        a26.V(c8lVar, pdeVar2, new qv3(kolVar, (byte) 2));
                        return c8lVar;
                    default:
                        kze kzeVar = ((BrowserActivity) yqaVar2.c).Q0().h;
                        a26.S(kzeVar, pdeVar2, new snl(kolVar, (byte) 1));
                        return kzeVar;
                }
            }
        });
        this.n = yqaVar;
        final byte b2 = 1;
        this.o = z4c.b(new Function0() { // from class: rnl
            public final Object invoke() {
                byte b22 = b2;
                kol kolVar = this;
                pde pdeVar2 = pdeVar;
                yqa yqaVar2 = yqaVar;
                switch (b22) {
                    case 0:
                        c8l c8lVar = (c8l) ((BrowserActivity) yqaVar2.c).w0.get();
                        a26.V(c8lVar, pdeVar2, new qv3(kolVar, (byte) 2));
                        return c8lVar;
                    default:
                        kze kzeVar = ((BrowserActivity) yqaVar2.c).Q0().h;
                        a26.S(kzeVar, pdeVar2, new snl(kolVar, (byte) 1));
                        return kzeVar;
                }
            }
        });
        this.p = z4c.b(new p7l(yqaVar, (byte) 14));
        this.q = yqaVar;
        a26.T(ikcVar, pdeVar, new snl(this, (byte) 0));
    }

    public final cyj a() {
        return (cyj) this.b.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(final defpackage.dol[] r6, final int r7) {
        /*
            r5 = this;
            int r0 = r6.length
            r1 = 1
            int r0 = r0 - r1
            if (r7 <= r0) goto L6
            return
        L6:
            r0 = r6[r7]
            int r0 = r0.ordinal()
            r2 = 2
            r3 = 0
            if (r0 == 0) goto L74
            r4 = 3
            if (r0 == r1) goto L6b
            if (r0 == r2) goto L62
            if (r0 == r4) goto L59
            r2 = 4
            if (r0 != r2) goto L55
            dol r0 = defpackage.dol.d
            int r6 = e82.u(r0, r6)
            r0 = -1
            if (r6 == r0) goto L50
            if (r6 >= r7) goto L50
            ne5 r6 = r5.i
            if (r6 != 0) goto L4f
            yqa r6 = r5.l
            java.lang.Object r6 = r6.c
            com.opera.android.BrowserActivity r6 = (com.opera.android.BrowserActivity) r6
            j4c r6 = r6.x0
            java.lang.Object r6 = r6.get()
            j8l r6 = (defpackage.j8l) r6
            hol r7 = r5.e
            fol r7 = r7.a
            int r7 = r7.c
            k6l r0 = r6.b
            b2l r7 = r0.r(r7)
            if (r7 != 0) goto L47
            r6 = r3
            goto L4d
        L47:
            java.util.LinkedHashMap r6 = r6.c
            boolean r6 = r6.containsKey(r7)
        L4d:
            if (r6 == 0) goto L50
        L4f:
            r3 = r1
        L50:
            r3 = r3 ^ r1
            r5.g(r3)
            return
        L55:
            h9o.p()
            return
        L59:
            pnl r0 = new pnl
            r0.<init>(r5)
            r5.e(r0)
            return
        L62:
            pnl r0 = new pnl
            r0.<init>(r5)
            r5.d(r1, r0)
            return
        L6b:
            pnl r0 = new pnl
            r0.<init>(r5)
            r5.d(r3, r0)
            return
        L74:
            pnl r0 = new pnl
            r0.<init>(r5)
            r5.f(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kol.b(dol[], int):void");
    }

    public final void c() {
        n9h n9hVar;
        int i;
        int iK;
        int i2;
        bwg bwgVar = this.e.b;
        if (bwgVar.equals(ynl.a) || bwgVar.equals(aol.a) || bwgVar.equals(bol.a) || (bwgVar instanceof znl) || (bwgVar instanceof col)) {
            return;
        }
        boolean zEquals = bwgVar.equals(vnl.a);
        xnl xnlVar = xnl.a;
        wnl wnlVar = wnl.a;
        if (!zEquals && !bwgVar.equals(wnlVar) && !bwgVar.equals(xnlVar)) {
            h9o.p();
            return;
        }
        y7h y7hVar = a().e.a;
        boolean z = y7hVar instanceof ayj;
        Context context = this.a;
        if (!z) {
            if (!(y7hVar instanceof byj)) {
                h9o.p();
                return;
            }
            Drawable drawableF = z5i.a0(this.e.a.a) ? new lxh(2131231724).f(context) : btb.b(this.e.a.a) ? new lxh(2131232120).f(context) : ((byj) y7hVar).d.f(context);
            j14.o0(drawableF, ((byj) y7hVar).e.b(context));
            i(drawableF, xnlVar);
            return;
        }
        ayj ayjVar = (ayj) y7hVar;
        umj umjVar = ayjVar.g;
        if (z5i.a0(this.e.a.a)) {
            na5 na5Var = na5.e;
            Drawable drawableU = w8h.u(2131231724, context);
            int i3 = na5Var.d(context).b;
            int iK2 = new ixh(1.0f).k(context);
            int iA = new dxh(2130969115).a(context);
            n9h n9hVar2 = new n9h((byte) 9, null, new xmj(this.a, new mxh(drawableU), umjVar, drawableU.getIntrinsicWidth(), drawableU.getIntrinsicHeight(), na5Var), false);
            this.d = n9hVar2;
            n9hVar = n9hVar2;
            iK = iK2;
            i2 = iA;
            i = i3;
        } else if (btb.b(this.e.a.a)) {
            na5 na5Var2 = na5.b;
            Drawable drawableU2 = w8h.u(2131232120, context);
            int i4 = na5Var2.d(context).b;
            int iK3 = new ixh(1.0f).k(context);
            int iA2 = new dxh(2130969115).a(context);
            n9h n9hVar3 = new n9h((byte) 9, null, new xmj(this.a, new mxh(drawableU2), umjVar, drawableU2.getIntrinsicWidth(), drawableU2.getIntrinsicHeight(), na5Var2), false);
            this.d = n9hVar3;
            n9hVar = n9hVar3;
            i = i4;
            iK = iK3;
            i2 = iA2;
        } else {
            int i5 = zmj.i;
            anj anjVarT = r9h.t(this.e.a.a);
            n9h n9hVar4 = this.d;
            if (n9hVar4 == null || !Intrinsics.a((anj) n9hVar4.b, anjVarT)) {
                String str = this.e.a.a;
                ixh ixhVar = ayjVar.d;
                Context context2 = this.a;
                n9hVar4 = new n9h((byte) 9, anjVarT, new zmj(context2, str, anjVarT, umjVar, ixhVar.k(context2), ayjVar.e.k(context), na5.b.g(context2, str), ayjVar.h), false);
                this.d = n9hVar4;
            }
            n9hVar = n9hVar4;
            int i6 = ((vmj) n9hVar.c).c.b;
            int iA3 = a().e.b.a(context);
            i = i6;
            iK = a().e.c.k(context);
            i2 = iA3;
        }
        int iK4 = a().b.k(context);
        vmj vmjVar = (vmj) n9hVar.c;
        i(new ir(iK4, i, i2, iK, ayjVar.f.k(context), vmjVar, new fr(vmjVar.a, vmjVar.b, (byte) 1), null, ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL), wnlVar);
    }

    public final void d(boolean z, Function0 function0) {
        yqa yqaVar = this.q;
        yqaVar.getClass();
        String[] strArr = OperaApplication.K;
        xd5 xd5Var = (BrowserActivity) yqaVar.c;
        eoj eojVar = (eoj) ((OperaApplication) xd5Var.getApplication()).r.S0.get();
        if (((qsh) yqaVar.b) == null) {
            tcc lifecycle = xd5Var.getLifecycle();
            k6l k6lVar = xd5Var.V;
            if (k6lVar == null) {
                k6lVar = null;
            }
            yqaVar.b = new qsh(lifecycle, eojVar, k6lVar);
            tcc lifecycle2 = xd5Var.getLifecycle();
            v4b v4bVar = (v4b) xd5Var.t0.getValue();
            eojVar.getClass();
            oup.l0(lifecycle2, new vvf(eojVar, v4bVar, (byte) 24), new tji(eojVar, v4bVar), (Function1) null, (Function1) null, 12);
        }
        fol folVar = this.e.a;
        doj dojVar = new doj(folVar.a, folVar.b);
        qfl qflVar = new qfl((Object) this, (byte) 6);
        qnl qnlVar = new qnl(this, function0, (byte) 0);
        eojVar.getClass();
        this.h = new ynj(eojVar, dojVar, this.j, qflVar, z, qnlVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(Function0 function0) {
        jol jolVar;
        ne5 ne5Var = this.i;
        if (ne5Var != null) {
            ne5Var.cancel();
        }
        Object obj = null;
        this.i = null;
        zyk zykVar = this.m;
        c8l c8lVar = (c8l) zykVar.getValue();
        int i = this.e.a.c;
        ArrayList arrayList = c8lVar.h;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            Object obj2 = arrayList.get(i2);
            i2++;
            if (((x7l) obj2).c.a == i) {
                obj = obj2;
                break;
            }
        }
        x7l x7lVar = (x7l) obj;
        if (x7lVar != null) {
            i(xvg.s(this.a, x7lVar.b, a()), new znl(eol.a));
            if (this.g) {
                return;
            }
        }
        if (this.g) {
            iol iolVar = new iol();
            iolVar.a = eol.b;
            jolVar = iolVar;
        } else {
            jolVar = new jol(a().d.a, a().d.b);
        }
        c8l c8lVar2 = (c8l) zykVar.getValue();
        fol folVar = this.e.a;
        int i3 = folVar.c;
        p6l p6lVar = folVar.b;
        crk crkVar = new crk(jolVar, (byte) 15);
        qfl qflVar = new qfl((Object) jolVar, (byte) 5);
        tmi tmiVar = new tmi(this, function0, jolVar, (byte) 16);
        mcj mcjVarC = c8lVar2.c(p6lVar);
        ne5 ne5Var2 = new ne5();
        ne5Var2.g = c8lVar2;
        ne5Var2.a = mcjVarC;
        ne5Var2.b = qflVar;
        ne5Var2.c = tmiVar;
        ne5Var2.f = new nwa(ne5Var2, (byte) 4);
        ne5Var2.d = ((o7l) mcjVarC.b).l(i3, new d7k(crkVar, ne5Var2, i3));
        this.i = ne5Var2;
    }

    public final void f(boolean z, Function0 function0) {
        if (this.e.b.equals(aol.a)) {
            return;
        }
        Uri uriS = dbh.s(cqp.f0((BrowserActivity) this.n.c).a, this.e.a.a);
        if (Intrinsics.a(uriS, Uri.EMPTY)) {
            function0.invoke();
            return;
        }
        qnl qnlVar = new qnl(this, function0, (byte) 1);
        e3g e3gVar = new e3g(this, qnlVar, uriS);
        LinkedHashSet linkedHashSet = this.k;
        linkedHashSet.add(e3gVar);
        deg degVar = this.j;
        dwh dwhVarG = degVar.g(uriS);
        dwhVarG.c(t);
        ixh ixhVar = a().f.a;
        Context context = this.a;
        dwhVarG.b.b(ixhVar.k(context), a().f.a.k(context));
        dwhVarG.a();
        dwhVarG.j();
        if (z) {
            dwhVarG.i(3, new int[0]);
        }
        dwhVarG.f(e3gVar);
        if (z && linkedHashSet.contains(e3gVar)) {
            linkedHashSet.remove(e3gVar);
            degVar.a(e3gVar);
            qnlVar.invoke(null);
        }
    }

    public final void g(boolean z) {
        lkn lknVarA;
        Drawable drawableP;
        int iOrdinal = this.e.a.b.ordinal();
        Context context = this.a;
        if (iOrdinal == 0) {
            lknVarA = ((qjn) ((ikc) this.o.getValue()).g()).a(a().b.k(context), context);
            lknVarA.c(context);
        } else {
            if (iOrdinal != 1) {
                h9o.p();
                return;
            }
            lknVarA = ((qjn) this.p.getValue()).a(a().b.k(context), context);
        }
        cyj cyjVarA = a();
        y7h y7hVar = cyjVarA.b;
        qxj qxjVar = cyjVarA.g;
        int iK = y7hVar.k(context);
        if (z) {
            Drawable drawableF = qxjVar.a.f(context);
            j14.n0(drawableF, (lknVarA.a.g ? qxjVar.f : qxjVar.g).a(context));
            drawableP = j14.p(lknVarA, new tnl(drawableF, zed.b(drawableF.getIntrinsicWidth() * qxjVar.h)));
        } else {
            drawableP = lknVarA;
        }
        i(new ir(iK, 0, 0, 0, 0, drawableP, new fr(lknVarA.b(), lknVarA.a(), (byte) 0), null, 144), new col(z));
    }

    public final void h() {
        if (Intrinsics.a(this.e, s)) {
            return;
        }
        k(this.e.a);
    }

    public final void i(Drawable drawable, bwg bwgVar) {
        this.e = new hol(this.e.a, bwgVar);
        this.c.invoke(drawable);
    }

    public final void j(fol folVar) {
        if (folVar.equals(this.e.a)) {
            return;
        }
        this.f = 0;
        k(folVar);
    }

    public final void k(fol folVar) {
        ynj ynjVar = this.h;
        if (ynjVar != null) {
            ynjVar.cancel();
        }
        ne5 ne5Var = this.i;
        if (ne5Var != null) {
            ne5Var.cancel();
        }
        this.i = null;
        LinkedHashSet linkedHashSet = this.k;
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            this.j.b((acl) it.next());
        }
        linkedHashSet.clear();
        boolean zA = Intrinsics.a(this.e.a.a, folVar.a);
        this.e = new hol(folVar, vnl.a);
        rxj rxjVar = a().d;
        if (rxjVar.a <= 0 || rxjVar.b <= 0) {
            return;
        }
        jsc jscVar = a().a;
        rxj rxjVar2 = a().d;
        jscVar.getClass();
        int i = rxjVar2.a;
        ixh ixhVar = jsc.c;
        Context context = this.a;
        shf shfVar = i < ixhVar.k(context) ? jscVar.a : jscVar.b;
        dol[] dolVarArr = (dol[]) shfVar.a;
        if (!((Boolean) this.e.e.getValue()).booleanValue()) {
            if (zA) {
                c();
            } else {
                this.c.invoke(r);
                f(true, new p7l(this, (byte) 13));
            }
            b(((Boolean) this.e.d.getValue()).booleanValue() ? (dol[]) shfVar.b : (dol[]) shfVar.c, 0);
            return;
        }
        if (e82.u(dol.e, dolVarArr) >= 0) {
            g(false);
        } else {
            Drawable drawableF = a().g.a.f(context);
            int iK = a().b.k(context);
            int iA = a().g.b.a(context);
            int iA2 = a().g.d.a(context);
            int iK2 = a().g.e.k(context);
            j14.o0(drawableF, a().g.c.b(context));
            i(new ir(iK, iA, iA2, iK2, 0, drawableF, new fr(drawableF.getIntrinsicWidth(), drawableF.getIntrinsicHeight(), (byte) 1), null, 144), ynl.a);
        }
        b(dolVarArr, 0);
    }
}
