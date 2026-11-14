package defpackage;

import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class tmk {
    public static final long l;
    public static final long m;
    public final mcj a;
    public final shf b;
    public final xbf c;
    public final Set d;
    public final dnj e;
    public final nv1 f;
    public final kze g = new kze(wvg.k);
    public final ode h = new ode();
    public final LinkedHashSet i = new LinkedHashSet();
    public boolean j;
    public Iterable k;

    static {
        on7 on7Var = pn7.b;
        un7 un7Var = un7.g;
        l = pn7.f(cs5.x0(24, un7Var));
        m = pn7.f(cs5.x0(24, un7Var));
    }

    public tmk(mcj mcjVar, shf shfVar, xbf xbfVar, Set set, dnj dnjVar, nv1 nv1Var) {
        this.a = mcjVar;
        this.b = shfVar;
        this.c = xbfVar;
        this.d = set;
        this.e = dnjVar;
        this.f = nv1Var;
        ((nrl) mcjVar.b).d(new qlk(this, (byte) 2));
    }

    public final void a(String str, String str2, long j, eof eofVar) {
        if (str == null) {
            eofVar.run(new dk8(1));
            return;
        }
        eof eofVar2 = new eof((Object) this, (Object) eofVar, (byte) 24);
        shf shfVar = this.b;
        ((wth) shfVar.a).w(new za(str, str2, j, shfVar, eofVar2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
    
        if (r15 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bc, code lost:
    
        if (r15 != r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00bc -> B:34:0x00be). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r14, nt5 r15) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tmk.b(java.util.List, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(nt5 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.omk
            if (r0 == 0) goto L13
            r0 = r8
            omk r0 = (defpackage.omk) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            omk r0 = new omk
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L35
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            ybh.y(r8)
            return r8
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r7)
            return r3
        L31:
            ybh.y(r8)
            goto L42
        L35:
            ybh.y(r8)
            r0.v = r5
            xbf r8 = r7.c
            java.lang.Object r8 = w0h.d(r8, r0)
            if (r8 == r1) goto L6c
        L42:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L4c
            clk r7 = new clk
            r7.<init>()
            return r7
        L4c:
            mcj r2 = r7.a
            long r5 = java.lang.System.currentTimeMillis()
            r2.p(r5)
            r0.v = r4
            cv6 r2 = bb7.a
            d7a r2 = s6d.a
            d7a r2 = r2.e
            r8h r4 = new r8h
            r5 = 24
            shf r7 = r7.b
            r4.<init>(r7, r8, r3, r5)
            java.lang.Object r7 = na2.Z(r2, r4, r0)
            if (r7 != r1) goto L6d
        L6c:
            return r1
        L6d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tmk.c(nt5):java.lang.Object");
    }

    public final void d(prh prhVar, zzh zzhVar) {
        if (prhVar != null) {
            boolean z = prhVar instanceof nrh;
            LinkedHashSet linkedHashSet = this.i;
            if (z) {
                linkedHashSet.remove(((nrh) prhVar).a);
                l();
            } else if (prhVar instanceof orh) {
                String str = ((orh) prhVar).a;
                linkedHashSet.remove(str);
                b59 b59Var = (b59) this.a.a;
                HashSet hashSetM = w1h.m((SharedPreferences) b59Var.get(), "acked_tokens");
                if (hashSetM.add(str)) {
                    ((SharedPreferences) b59Var.get()).edit().putStringSet("acked_tokens", hashSetM).apply();
                }
                this.j = true;
            }
            zzhVar.run(prhVar);
            return;
        }
        h9o.p();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.elk r10, nt5 r11) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tmk.e(elk, nt5):java.lang.Object");
    }

    public final boolean f() {
        mcj mcjVar = this.a;
        b59 b59Var = (b59) mcjVar.a;
        long j = ((SharedPreferences) b59Var.get()).getLong("last_response", -1L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (j < 0 || j > jCurrentTimeMillis || jCurrentTimeMillis - j >= l) {
            if (((SharedPreferences) b59Var.get()).getBoolean("stale", false)) {
                return true;
            }
            long j2 = ((SharedPreferences) b59Var.get()).getLong("last_request", -1L);
            if (j2 >= 0 && j2 <= jCurrentTimeMillis && jCurrentTimeMillis - j2 < ((Number) this.e.invoke()).longValue()) {
                mcjVar.o(true);
                return true;
            }
        }
        return false;
    }

    public final void g(String str) {
        this.j = false;
        s6h s6hVarL = b8h.l(str);
        if (s6hVarL != null) {
            boolean zIsEmpty = ((csh) s6hVarL.a).isEmpty();
            mcj mcjVar = this.a;
            if (zIsEmpty && ((csh) s6hVarL.b).isEmpty()) {
                String string = ((SharedPreferences) ((b59) mcjVar.a).get()).getString("info_data", null);
                String[] strArr = aik.a;
                if (string == null) {
                    string = "";
                }
                wvg wvgVarH = h(string);
                if (wvgVarH != null && wvgVarH.a()) {
                    this.h.r(new eb8(null));
                }
            }
            mcjVar.n(str);
        }
        l();
    }

    public final wvg h(String str) {
        s6h s6hVarL = b8h.l(str);
        i7b i7bVar = null;
        if (s6hVarL == null) {
            return null;
        }
        csh cshVar = (csh) s6hVarL.a;
        boolean zIsEmpty = cshVar.isEmpty();
        Set set = this.d;
        boolean z = false;
        if (zIsEmpty) {
            a1b a1bVarU = ((csh) s6hVarL.b).u(0);
            while (a1bVarU.hasNext()) {
                i7b i7bVar2 = (i7b) a1bVarU.next();
                if (set.contains(i7bVar2.b) && (i7bVar == null || i7bVar2.d > i7bVar.d)) {
                    i7bVar = i7bVar2;
                }
            }
        } else {
            a1b a1bVarU2 = cshVar.u(0);
            while (a1bVarU2.hasNext()) {
                i7b i7bVar3 = (i7b) a1bVarU2.next();
                if (set.contains(i7bVar3.b) && (i7bVar == null || i7bVar3.c > i7bVar.c)) {
                    i7bVar = i7bVar3;
                }
            }
        }
        i7b i7bVar4 = i7bVar;
        if (i7bVar4 == null) {
            return wvg.l;
        }
        if (cshVar.isEmpty() && i7bVar4.e != 6) {
            z = true;
        }
        long j = ((SharedPreferences) ((b59) this.a.a).get()).getLong("last_extend_response", 0L);
        return xvg.x(i7bVar4, System.currentTimeMillis(), z, j, m, f(), true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
    
        if (e((defpackage.elk) r8, r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(nt5 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.qmk
            if (r0 == 0) goto L13
            r0 = r8
            qmk r0 = (defpackage.qmk) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            qmk r0 = new qmk
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L35
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            ybh.y(r8)
            goto L82
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r7)
            return r3
        L31:
            ybh.y(r8)
            goto L77
        L35:
            ybh.y(r8)
            java.lang.Iterable r8 = r7.k
            r2 = 0
            if (r8 == 0) goto L48
            f15 r3 = new f15
            r3.<init>(r7, r4)
            zlb r6 = new zlb
            r6.<init>(r8, r3, r2)
            r3 = r6
        L48:
            if (r3 == 0) goto L85
            java.util.List r8 = kotlin.collections.CollectionsKt.k0(r3)
            if (r8 == 0) goto L85
            boolean r3 = r8.isEmpty()
            mcj r6 = r7.a
            if (r3 == 0) goto L68
            r7.j = r2
            java.lang.String r8 = ""
            r6.n(r8)
            r6.o(r2)
            r7.l()
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L68:
            long r2 = java.lang.System.currentTimeMillis()
            r6.p(r2)
            r0.v = r5
            java.lang.Object r8 = r7.b(r8, r0)
            if (r8 == r1) goto L81
        L77:
            elk r8 = (defpackage.elk) r8
            r0.v = r4
            java.lang.Object r7 = r7.e(r8, r0)
            if (r7 != r1) goto L82
        L81:
            return r1
        L82:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L85:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tmk.i(nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (e((defpackage.elk) r6, r0) == r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(nt5 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.rmk
            if (r0 == 0) goto L13
            r0 = r6
            rmk r0 = (defpackage.rmk) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            rmk r0 = new rmk
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            ybh.y(r6)
            goto L4b
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r5)
            r5 = 0
            return r5
        L31:
            ybh.y(r6)
            goto L40
        L35:
            ybh.y(r6)
            r0.v = r4
            java.lang.Object r6 = r5.c(r0)
            if (r6 == r1) goto L4a
        L40:
            elk r6 = (defpackage.elk) r6
            r0.v = r3
            java.lang.Object r5 = r5.e(r6, r0)
            if (r5 != r1) goto L4b
        L4a:
            return r1
        L4b:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tmk.j(nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (r14 != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00b2 -> B:35:0x00b4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.util.List r13, nt5 r14) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tmk.k(java.util.List, nt5):java.lang.Object");
    }

    public final void l() {
        wvg wvgVar;
        b59 b59Var = (b59) this.a.a;
        if (!this.i.isEmpty() || this.j) {
            wvgVar = wvg.m;
        } else {
            String string = ((SharedPreferences) b59Var.get()).getString("info_data", null);
            if (string == null || (wvgVar = h(string)) == null) {
                long j = ((SharedPreferences) b59Var.get()).getLong("range_start", -1L);
                if (j >= 0) {
                    long j2 = ((SharedPreferences) b59Var.get()).getLong("range_end", -1L);
                    wvgVar = new wvg("unknown", j, j2, -1L, xvg.k(System.currentTimeMillis(), j, j2, m, ((SharedPreferences) b59Var.get()).getBoolean("range_cancelled", false), f(), 1), null, null, null, null, null);
                } else {
                    wvgVar = wvg.l;
                }
            }
        }
        kze kzeVar = this.g;
        if (wvgVar.equals(kzeVar.g())) {
            return;
        }
        kzeVar.r(wvgVar);
    }
}
