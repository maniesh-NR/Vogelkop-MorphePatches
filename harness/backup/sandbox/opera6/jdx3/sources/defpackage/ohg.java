package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class ohg {
    public final kpo a;
    public final pfe b;
    public cqo c;

    public ohg(Context context) {
        uko ukoVar;
        Context applicationContext = context.getApplicationContext();
        synchronized (jpo.class) {
            ukoVar = jpo.a;
            if (ukoVar == null) {
                Context applicationContext2 = applicationContext.getApplicationContext();
                ukoVar = new uko(applicationContext2 != null ? applicationContext2 : applicationContext);
                jpo.a = ukoVar;
            }
        }
        this.a = (kpo) ukoVar.a.a();
        this.b = new pfe();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(nt5 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.lhg
            if (r0 == 0) goto L13
            r0 = r9
            lhg r0 = (defpackage.lhg) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            lhg r0 = new lhg
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            ybh.y(r9)
            return r9
        L28:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r8)
            return r3
        L2e:
            ybh.y(r9)
            c9p r9 = new c9p
            r9.<init>()
            kpo r8 = r8.a
            r8.getClass()
            ypo r2 = r8.a
            r5 = 148284525743(0x2286724caf, double:7.32622899795E-313)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            igp r6 = r2.a
            java.lang.String r7 = "warmUpIntegrityToken(%s)"
            r6.b(r7, r5)
            com.google.android.gms.tasks.TaskCompletionSource r5 = new com.google.android.gms.tasks.TaskCompletionSource
            r5.<init>()
            ppo r6 = new ppo
            r6.<init>(r2, r5, r5)
            vko r2 = r2.f
            r2.c(r6, r5)
            com.google.android.gms.tasks.Task r2 = r5.getTask()
            tvk r5 = new tvk
            r5.<init>(r8, r9)
            com.google.android.gms.tasks.Task r8 = r2.onSuccessTask(r5)
            r0.v = r4
            java.lang.Object r8 = a4h.b(r8, r3, r0)
            if (r8 != r1) goto L76
            return r1
        L76:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ohg.a(nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r7, nt5 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.mhg
            if (r0 == 0) goto L13
            r0 = r8
            mhg r0 = (defpackage.mhg) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            mhg r0 = new mhg
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            ybh.y(r8)
            return r8
        L28:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r6)
            return r3
        L2e:
            ybh.y(r8)
            cv6 r8 = bb7.a
            d7a r8 = s6d.a
            d7a r8 = r8.e
            qa6 r2 = new qa6
            r5 = 5
            r2.<init>(r7, r6, r3, r5)
            r0.v = r4
            java.lang.Object r6 = na2.Z(r8, r2, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ohg.b(java.lang.String, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(ccp r7, nt5 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.nhg
            if (r0 == 0) goto L13
            r0 = r8
            nhg r0 = (defpackage.nhg) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            nhg r0 = new nhg
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            ybh.y(r8)
            return r8
        L28:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r6)
            return r3
        L2e:
            ybh.y(r8)
            cv6 r8 = bb7.a
            d7a r8 = s6d.a
            d7a r8 = r8.e
            qmb r2 = new qmb
            r5 = 25
            r2.<init>(r6, r7, r3, r5)
            r0.v = r4
            java.lang.Object r6 = na2.Z(r8, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ohg.c(ccp, nt5):java.lang.Object");
    }
}
