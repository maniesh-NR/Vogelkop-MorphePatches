package defpackage;

import android.view.Surface;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class btm {
    public final ctm a;
    public final qe4 b;
    public final k4b c;
    public final w3j d;
    public i07 f;
    public LinkedHashMap h;
    public cd5 i;
    public final Object e = new Object();
    public final LinkedHashMap g = new LinkedHashMap();

    public btm(ctm ctmVar, qe4 qe4Var, k4b k4bVar, w3j w3jVar) {
        this.a = ctmVar;
        this.b = qe4Var;
        this.c = k4bVar;
        this.d = w3jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(defpackage.btm r4, nt5 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.zsm
            if (r0 == 0) goto L13
            r0 = r5
            zsm r0 = (defpackage.zsm) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            zsm r0 = new zsm
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.ybh.y(r5)     // Catch: java.util.concurrent.CancellationException -> L47
            return r5
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.ybh.y(r5)
            java.lang.Object r5 = r4.e
            monitor-enter(r5)
            i07 r2 = r4.f     // Catch: java.lang.Throwable -> L4e
            if (r2 == 0) goto L4a
            cd5 r4 = r4.i     // Catch: java.lang.Throwable -> L4e
            if (r4 != 0) goto L4a
            monitor-exit(r5)
            r0.v = r3     // Catch: java.util.concurrent.CancellationException -> L47
            java.lang.Object r4 = r2.A(r0)     // Catch: java.util.concurrent.CancellationException -> L47
            if (r4 != r1) goto L46
            return r1
        L46:
            return r4
        L47:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4a:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r5)
            return r4
        L4e:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btm.a(btm, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r5, long r6, nt5 r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.atm
            if (r0 == 0) goto L13
            r0 = r8
            atm r0 = (defpackage.atm) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            atm r0 = new atm
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r4 = r0.t
            px5 r8 = px5.a
            int r1 = r0.v
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            defpackage.ybh.y(r4)
            goto L40
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            return r2
        L2e:
            defpackage.ybh.y(r4)
            zhl r4 = new zhl
            r1 = 5
            r4.<init>(r1, r2, r5)
            r0.v = r3
            java.lang.Object r4 = uyg.w(r6, r4, r0)
            if (r4 != r8) goto L40
            return r8
        L40:
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L46
            l08 r4 = l08.a
        L46:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btm.b(java.util.List, long, nt5):java.lang.Object");
    }

    public final void c(Surface surface) {
        g07 g07Var;
        synchronized (this.e) {
            LinkedHashMap linkedHashMap = this.h;
            if (linkedHashMap != null && (g07Var = (g07) linkedHashMap.get(surface)) != null && !this.g.containsKey(surface)) {
                if (gyg.G(3, "CXCP")) {
                    g07Var.toString();
                }
                this.g.put(surface, g07Var);
                try {
                    g07Var.d();
                } catch (f07 e) {
                    if (gyg.G(5, "CXCP")) {
                        Objects.toString(surface);
                    }
                    this.d.a(e.a);
                }
            }
        }
    }

    public final void d() {
        Set setKeySet;
        gg4 gg4VarA = this.b.a();
        synchronized (gg4VarA.a) {
            gg4VarA.c.add(this);
            LinkedHashMap linkedHashMap = gg4VarA.b;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (((Number) entry.getValue()).intValue() > 0) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            setKeySet = linkedHashMap2.keySet();
        }
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            c((Surface) it.next());
        }
    }

    public final void e() {
        synchronized (this.e) {
            if (this.g.isEmpty() && this.h == null) {
                gg4 gg4VarA = this.b.a();
                synchronized (gg4VarA.a) {
                    gg4VarA.c.remove(this);
                }
                cd5 cd5Var = this.i;
                if (cd5Var != null) {
                    cd5Var.j0(Unit.a);
                }
            }
        }
    }
}
