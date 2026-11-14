package defpackage;

import com.opera.android.feed.FeedScrollView;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class noc implements y9n {
    public final js6 a;
    public final can b;
    public final lw7 c;
    public final HashMap d;
    public boolean e;

    public noc(ndc ndcVar, FeedScrollView feedScrollView, js6 js6Var) {
        this.a = js6Var;
        can canVar = new can();
        this.b = canVar;
        this.c = new lw7(this, ndcVar.getLifecycle(), (byte) 1);
        this.d = new HashMap();
        canVar.b(true);
        feedScrollView.F(new hw7(this, (byte) 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    @Override // defpackage.y9n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T(android.view.View r4, int r5, int r6) {
        /*
            r3 = this;
            r6 = 99
            if (r5 <= r6) goto L93
            java.util.HashMap r3 = r3.d
            java.lang.Object r3 = r3.get(r4)
            uoc r3 = (defpackage.uoc) r3
            if (r3 == 0) goto L93
            igi r3 = r3.a
            java.lang.Object r4 = r3.c
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            java.lang.Object r4 = r4.invoke()
            zmc r4 = (defpackage.zmc) r4
            if (r4 == 0) goto L93
            java.lang.Object r3 = r3.d
            pkc r3 = (defpackage.pkc) r3
            qkc r3 = r3.a
            js6 r3 = r3.b
            java.lang.Object r5 = r3.j
            java.util.HashSet r5 = (java.util.HashSet) r5
            lmc r6 = r4.a()
            long r0 = r6.a
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            boolean r6 = r5.contains(r6)
            if (r6 != 0) goto L93
            lmc r6 = r4.a()
            imc r6 = r6.h
            if (r6 == 0) goto L50
            java.util.List r6 = r6.b
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L50
            r0 = 0
            java.lang.Object r6 = r6.get(r0)
            tmc r6 = (defpackage.tmc) r6
            goto L51
        L50:
            r6 = 0
        L51:
            if (r6 == 0) goto L93
            java.lang.String r0 = r6.b
            java.lang.String r6 = r6.a
            if (r6 == 0) goto L93
            if (r0 == 0) goto L93
            lmc r4 = r4.a()
            long r1 = r4.a
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
            r5.add(r4)
            java.lang.Object r3 = r3.g
            xoc r3 = (defpackage.xoc) r3
            x5f r3 = r3.a
            boolean r4 = r3.h
            if (r4 == 0) goto L93
            zpa r4 = r3.d
            x56 r5 = defpackage.zpa.F()
            ck0 r1 = new ck0
            r1.<init>(r4, r5)
            hi0 r4 = r1.e()
            vg0 r4 = r4.a()
            e5f r1 = new e5f
            r2 = 1
            r1.<init>(r6, r0, r2)
            java.lang.String r6 = "start_page"
            r4.b(r6, r1)
            r3.U0(r5)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.noc.T(android.view.View, int, int):void");
    }

    public final void a() {
        this.b.d();
    }
}
