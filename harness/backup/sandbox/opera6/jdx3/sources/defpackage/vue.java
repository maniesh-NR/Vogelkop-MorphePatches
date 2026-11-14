package defpackage;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.w;
import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.BrowserActivity;
import com.opera.android.browser.UrlMangler;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class vue extends iu8 implements fu8, ylg {
    public final qq6 h;
    public final ro9 i;
    public final hu8 j;
    public final x5f k;
    public final umi l;
    public final rl3 m;
    public final w n;
    public final amg o;
    public final ghf p;
    public final que q;

    /* JADX WARN: Multi-variable type inference failed */
    public vue(BrowserActivity browserActivity, xw8 xw8Var, uqe uqeVar, hu8 hu8Var, x5f x5fVar, umi umiVar, rl3 rl3Var, qq6 qq6Var) {
        x79 x79Var;
        RecyclerView recyclerView = xw8Var.g;
        ow8 ow8Var = xw8Var.h;
        q82 q82Var = (q82) browserActivity.l0.get();
        bwf bwfVar = xw8Var.b;
        String strA = bwfVar.a();
        p12 p12Var = new p12();
        p12Var.a = recyclerView;
        p12Var.b = ow8Var;
        p12Var.c = q82Var;
        p12Var.d = strA;
        tsh tshVar = new tsh(recyclerView.getContext());
        p12Var.e = tshVar;
        q82Var.a.b(tshVar);
        lve lveVar = new lve(p12Var);
        p12Var.g = lveVar;
        p12Var.h = uqeVar;
        ac8.c(lveVar);
        if (xw8Var.c) {
            ow8 ow8Var2 = xw8Var.h;
            String strA2 = bwfVar.a();
            x79Var = new x79();
            x79Var.d = new HashMap();
            x79Var.a = recyclerView;
            x79Var.b = ow8Var2;
            x79Var.c = strA2;
            x79Var.e = uqeVar;
        } else {
            x79Var = null;
        }
        super(browserActivity, xw8Var, uqeVar, p12Var, x79Var);
        que queVar = new que(this, (byte) 0);
        this.q = queVar;
        bwfVar.b();
        this.h = qq6Var;
        this.i = recyclerView.c.c();
        this.j = hu8Var;
        this.k = x5fVar;
        this.l = umiVar;
        this.m = rl3Var;
        w supportFragmentManager = browserActivity.getSupportFragmentManager();
        this.n = supportFragmentManager;
        supportFragmentManager.b0(queVar, false);
        xnh.t(browserActivity);
        this.o = new amg(x5fVar, uqeVar);
        this.p = new ghf(x5fVar, uqeVar);
    }

    public static int t(oqe oqeVar, boolean z) {
        if (oqeVar instanceof jre) {
            return z ? 2131558788 : 2131558786;
        }
        if (oqeVar instanceof ure) {
            return z ? 2131558794 : 2131558786;
        }
        if (oqeVar instanceof dre) {
            return z ? 2131558791 : 2131558793;
        }
        if (oqeVar instanceof rre) {
            return z ? 2131558789 : 2131558786;
        }
        if (oqeVar instanceof d9i) {
            return 2131558795;
        }
        if (oqeVar.getClass().equals(msh.class)) {
            return 2131558786;
        }
        return oqeVar instanceof fre ? 2131558818 : 0;
    }

    @Override // defpackage.ea2
    public final ab2 k(ViewGroup viewGroup, int i) {
        rl3 rl3Var = this.m;
        amg amgVar = this.o;
        uqe uqeVar = this.c;
        p0c p0cVar = this.g;
        if (i == 2131558786) {
            return new uue(ha2.M(viewGroup, i, 0), new r9i((Object) uqeVar, (Object) this, (Object) this, (Object) amgVar, (byte) 22), rl3Var, p0cVar);
        }
        if (i == 2131558788) {
            return new sue(ha2.M(viewGroup, i, 0), uqeVar, this, this, this.o, this.m, p0cVar);
        }
        if (i == 2131558794) {
            return new nve(ha2.M(viewGroup, i, 0), new mve(uqeVar, this, this, amgVar, (byte) 1), rl3Var, p0cVar);
        }
        if (i == 2131558791) {
            return new nve(ha2.M(viewGroup, i, 0), new mve(uqeVar, this, this, amgVar, (byte) 0), rl3Var, p0cVar);
        }
        if (i == 2131558793) {
            return new uue(ha2.M(viewGroup, i, 0), new mve(uqeVar, this, this, amgVar, (byte) 0), rl3Var, p0cVar);
        }
        if (i == 2131558789) {
            return new tue(ha2.M(viewGroup, i, 0), new r9i((Object) uqeVar, (Object) this, (Object) this, (Object) amgVar, (byte) 22), rl3Var, p0cVar);
        }
        Object obj = null;
        if (i == 2131558795) {
            return new uue(ha2.M(viewGroup, i, 0), new r9i((Object) uqeVar, (Object) this, obj, (Object) amgVar, (byte) 22), p0cVar, this.l);
        }
        if (i == 2131558801) {
            return new cve(ha2.M(viewGroup, i, 0), this.i, uqeVar, this, this, this.o);
        }
        if (i == 2131558799) {
            return new kve(ha2.M(viewGroup, i, 0), this.i, uqeVar, this, this, this.o, this.k);
        }
        if (i == 2131558811) {
            return new gve(ha2.M(viewGroup, i, 0), this.i, uqeVar, this, this, this.o);
        }
        if (i == 2131558812) {
            return new bve(ha2.M(viewGroup, i, 0), this.i, uqeVar, this, this, this.o, this.k, (byte) 1);
        }
        if (i == 2131558806) {
            return new bve(ha2.M(viewGroup, i, 0), this.i, uqeVar, this, this, this.o, this.k, (byte) 0);
        }
        if (i == 2131558818) {
            return new ive(ha2.M(viewGroup, i, 0), new hve(uqeVar, this, this, amgVar), p0cVar);
        }
        if (i != 2131558819) {
            return null;
        }
        return new jve(ha2.M(viewGroup, i, 0), this.i, uqeVar, this, this, this.o, this.k);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    @Override // defpackage.ylg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(defpackage.lx8 r12, defpackage.j82 r13) {
        /*
            r11 = this;
            r0 = r13
            pue r0 = (defpackage.pue) r0
            oqe r0 = r0.c
            boolean r1 = r0 instanceof defpackage.msh
            if (r1 == 0) goto Lad
            msh r0 = (defpackage.msh) r0
            xlg r0 = r0.z
            if (r0 == 0) goto Lad
            cmg r1 = r12.c0()
            f90 r10 = r1.a
            ghf r1 = r11.p
            java.lang.Object r2 = r1.d
            java.util.LinkedHashSet r2 = (java.util.LinkedHashSet) r2
            boolean r3 = r2.contains(r13)
            if (r3 != 0) goto L8b
            r2.add(r13)
            java.lang.Object r2 = r1.b
            x5f r2 = (defpackage.x5f) r2
            boolean r3 = r2.h
            r4 = 2
            if (r3 == 0) goto L30
            r2.w(r10, r4)
        L30:
            boolean r2 = r13 instanceof defpackage.pue
            if (r2 == 0) goto L41
            pue r13 = (defpackage.pue) r13
            oqe r13 = r13.c
            boolean r2 = r13 instanceof defpackage.msh
            if (r2 == 0) goto L41
            msh r13 = (defpackage.msh) r13
            p12 r13 = r13.v
            goto L42
        L41:
            r13 = 0
        L42:
            if (r13 == 0) goto L8b
            java.lang.Object r1 = r1.c
            uqe r1 = (defpackage.uqe) r1
            java.lang.Object r13 = r13.b
            java.lang.String r13 = (java.lang.String) r13
            uy8 r1 = r1.h
            f90 r2 = defpackage.f90.e
            r3 = 0
            if (r10 != r2) goto L61
            r1.getClass()
            sy8 r2 = new sy8
            java.lang.String r4 = "podcast_in_article_card"
            r2.<init>(r4, r13, r3)
            r1.c(r2)
            goto L8b
        L61:
            f90 r2 = defpackage.f90.f
            if (r10 != r2) goto L73
            r1.getClass()
            sy8 r2 = new sy8
            java.lang.String r4 = "podcast_in_article_detail"
            r2.<init>(r4, r13, r3)
            r1.c(r2)
            goto L8b
        L73:
            f90 r2 = defpackage.f90.b
            if (r10 != r2) goto L7b
            r1.l(r3, r13)
            goto L8b
        L7b:
            f90 r2 = defpackage.f90.c
            if (r10 != r2) goto L84
            r2 = 1
            r1.l(r2, r13)
            goto L8b
        L84:
            f90 r2 = defpackage.f90.d
            if (r10 != r2) goto L8b
            r1.l(r4, r13)
        L8b:
            qq6 r11 = r11.h
            java.lang.Object r11 = r11.b
            hw3 r11 = (defpackage.hw3) r11
            java.lang.Object r11 = r11.get()
            r2 = r11
            bmg r2 = (defpackage.bmg) r2
            android.view.View r11 = r12.itemView
            android.content.Context r3 = r11.getContext()
            java.lang.String r4 = r0.d
            java.lang.String r5 = r0.b
            java.lang.String r6 = r0.a
            java.lang.String r7 = r0.f
            java.lang.String r8 = r0.i
            java.util.List r9 = r0.c
            r2.a(r3, r4, r5, r6, r7, r8, r9, r10)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vue.n(lx8, j82):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        ((java.util.concurrent.CopyOnWriteArrayList) r0.b).remove(r3);
     */
    @Override // defpackage.ba2, defpackage.fa2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDestroy() {
        /*
            r5 = this;
            p12 r0 = r5.d
            r1 = 0
            r0.f = r1
            java.lang.Object r1 = r0.c
            q82 r1 = (defpackage.q82) r1
            java.lang.Object r2 = r0.e
            tsh r2 = (defpackage.tsh) r2
            h7f r1 = r1.a
            r1.c(r2)
            java.lang.Object r0 = r0.g
            lve r0 = (defpackage.lve) r0
            defpackage.ac8.d(r0)
            x79 r0 = r5.e
            if (r0 == 0) goto L24
            java.lang.Object r0 = r0.d
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.clear()
        L24:
            androidx.fragment.app.w r0 = r5.n
            que r5 = r5.q
            z8b r0 = r0.p
            java.lang.Object r1 = r0.b
            java.util.concurrent.CopyOnWriteArrayList r1 = (java.util.concurrent.CopyOnWriteArrayList) r1
            monitor-enter(r1)
            java.lang.Object r2 = r0.b     // Catch: java.lang.Throwable -> L55
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2     // Catch: java.lang.Throwable -> L55
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L55
            r3 = 0
        L38:
            if (r3 >= r2) goto L53
            java.lang.Object r4 = r0.b     // Catch: java.lang.Throwable -> L55
            java.util.concurrent.CopyOnWriteArrayList r4 = (java.util.concurrent.CopyOnWriteArrayList) r4     // Catch: java.lang.Throwable -> L55
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L55
            rl9 r4 = (rl9) r4     // Catch: java.lang.Throwable -> L55
            x1p r4 = r4.a     // Catch: java.lang.Throwable -> L55
            if (r4 != r5) goto L50
            java.lang.Object r5 = r0.b     // Catch: java.lang.Throwable -> L55
            java.util.concurrent.CopyOnWriteArrayList r5 = (java.util.concurrent.CopyOnWriteArrayList) r5     // Catch: java.lang.Throwable -> L55
            r5.remove(r3)     // Catch: java.lang.Throwable -> L55
            goto L53
        L50:
            int r3 = r3 + 1
            goto L38
        L53:
            monitor-exit(r1)
            return
        L55:
            r5 = move-exception
            monitor-exit(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vue.onDestroy():void");
    }

    @Override // defpackage.ea2
    public final int q(ja2 ja2Var, int i, ca2 ca2Var) {
        if (!(ja2Var instanceof fve)) {
            return t(((pue) ja2Var).c, ca2Var.a);
        }
        fve fveVar = (fve) ja2Var;
        if (fveVar.g) {
            return 2131558799;
        }
        Iterator it = fveVar.f.iterator();
        if (it.hasNext() && (it.next() instanceof mre)) {
            return 2131558811;
        }
        if (fveVar.h) {
            return 2131558812;
        }
        if (fveVar.i) {
            return 2131558806;
        }
        return fveVar.k ? 2131558819 : 2131558801;
    }

    @Override // defpackage.fu8
    public final void r(lx8 lx8Var, j82 j82Var) {
        msh mshVar = (msh) ((pue) j82Var).c;
        boolean z = mshVar instanceof dre;
        uqe uqeVar = this.c;
        fp1 fp1Var = this.b;
        if (z) {
            Uri uri = ((dre) mshVar).D.e.d;
            kx8 kx8Var = new kx8();
            Bundle bundle = new Bundle();
            bundle.putParcelable("uri", uri);
            kx8Var.setArguments(bundle);
            zhj.a(kx8Var, 4099).c(fp1Var);
        } else if ((mshVar instanceof d9i) || "podcast".equals(mshVar.c)) {
            n(lx8Var, j82Var);
        } else if (mshVar instanceof fre) {
            jb8 jb8Var = ((fre) mshVar).D;
            boolean zV = wqm.v(jb8Var.j);
            String str = jb8Var.j;
            lqm lqmVar = lqm.C;
            if (zV) {
                lk6.a(Uri.parse(str), lqmVar, 1, fp1Var);
            } else {
                UrlMangler.Builder builder = new UrlMangler.Builder("newsevent", str);
                builder.displayString(jb8Var.a);
                vx3 vx3VarA = ay3.a(builder.build(), lqmVar, false);
                vx3VarA.a(true);
                am2.v(vx3VarA);
            }
        } else {
            ac8.a(new whj(uqeVar.i(mshVar, j82Var.e), 0, lqm.e, null));
            if (!(lx8Var instanceof ou8) && !mshVar.A.b) {
                p12 p12Var = this.d;
                p12Var.f = mshVar;
                if (p12.h(mshVar).isEmpty()) {
                    ((msh) ((oqe) p12Var.f)).d((uqe) p12Var.h, ssh.a, false);
                }
            }
        }
        uy8 uy8Var = uqeVar.h;
        if (z) {
            uy8Var.h(0, mshVar);
        }
        if (mshVar instanceof ire) {
            uy8Var.h(0, mshVar);
        }
        if (mshVar instanceof ure) {
            ure ureVar = (ure) mshVar;
            if (uy8Var.q.add((String) ureVar.v.b)) {
                SharedPreferences sharedPreferences = (SharedPreferences) uy8Var.n.get();
                sharedPreferences.edit().putInt("FEEDBACK_TRACKER_ARTICLES_CLICKED", sharedPreferences.getInt("FEEDBACK_TRACKER_ARTICLES_CLICKED", 0) + 1).apply();
                uy8Var.K.a(ureVar);
                if (uy8Var.L.M()) {
                    uy8Var.e(new by8(ureVar, (byte) 0));
                }
            }
        }
        hu8 hu8Var = this.j;
        if (hu8Var != null) {
            hu8Var.r(lx8Var, j82Var);
        }
    }
}
