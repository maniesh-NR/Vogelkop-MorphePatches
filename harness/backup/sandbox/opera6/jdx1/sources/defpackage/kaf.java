package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class kaf implements hdk {
    public final g29 a;
    public final w6g b;
    public final yhe c;
    public final ylj d;
    public final gaf e;
    public final ole f = new ole((byte) 8);
    public final pfe g = new pfe();

    public kaf(g29 g29Var, w6g w6gVar, yhe yheVar, ylj yljVar, gaf gafVar) {
        this.a = g29Var;
        this.b = w6gVar;
        this.c = yheVar;
        this.d = yljVar;
        this.e = gafVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077 A[Catch: all -> 0x0086, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0086, blocks: (B:33:0x0077, B:40:0x0085, B:39:0x0082, B:36:0x007d), top: B:51:0x0022, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v0, types: [kaf] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // defpackage.hdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(sn4 r9, nt5 r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.iaf
            if (r0 == 0) goto L13
            r0 = r10
            iaf r0 = (defpackage.iaf) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            iaf r0 = new iaf
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.v
            px5 r1 = px5.a
            int r2 = r0.x
            pfe r3 = r8.g
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L36
            if (r2 != r4) goto L30
            boolean r8 = r0.t
            faf r9 = r0.u
            defpackage.ybh.y(r10)     // Catch: java.lang.Throwable -> L2e
            goto L69
        L2e:
            r10 = move-exception
            goto L7d
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r8)
            return r5
        L36:
            defpackage.ybh.y(r10)
            ole r10 = r8.f
            java.lang.Object r10 = r10.a
            java.util.concurrent.atomic.AtomicBoolean r10 = (java.util.concurrent.atomic.AtomicBoolean) r10
            boolean r10 = r10.get()
            if (r10 != 0) goto L90
            boolean r10 = r3.j()
            faf r2 = new faf     // Catch: java.lang.Throwable -> L89
            g29 r6 = r8.a     // Catch: java.lang.Throwable -> L89
            w6g r7 = r8.b     // Catch: java.lang.Throwable -> L89
            yhe r8 = r8.c     // Catch: java.lang.Throwable -> L89
            r2.<init>(r6, r7, r8)     // Catch: java.lang.Throwable -> L89
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Throwable -> L78
            r0.u = r2     // Catch: java.lang.Throwable -> L78
            r0.t = r10     // Catch: java.lang.Throwable -> L78
            r0.x = r4     // Catch: java.lang.Throwable -> L78
            java.lang.Object r8 = r9.invoke(r2, r8, r0)     // Catch: java.lang.Throwable -> L78
            if (r8 != r1) goto L65
            return r1
        L65:
            r9 = r10
            r10 = r8
            r8 = r9
            r9 = r2
        L69:
            r9.close()     // Catch: java.lang.Throwable -> L6e
            r9 = r5
            goto L6f
        L6e:
            r9 = move-exception
        L6f:
            if (r9 != 0) goto L77
            if (r8 == 0) goto L76
            r3.l(r5)
        L76:
            return r10
        L77:
            throw r9     // Catch: java.lang.Throwable -> L86
        L78:
            r8 = move-exception
            r9 = r10
            r10 = r8
            r8 = r9
            r9 = r2
        L7d:
            r9.close()     // Catch: java.lang.Throwable -> L81
            goto L85
        L81:
            r9 = move-exception
            defpackage.wf8.a(r10, r9)     // Catch: java.lang.Throwable -> L86
        L85:
            throw r10     // Catch: java.lang.Throwable -> L86
        L86:
            r9 = move-exception
            r10 = r8
            goto L8a
        L89:
            r9 = move-exception
        L8a:
            if (r10 == 0) goto L8f
            r3.l(r5)
        L8f:
            throw r9
        L90:
            java.lang.String r8 = "StorageConnection has already been disposed."
            qp2.n(r8)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kaf.b(sn4, nt5):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ad A[Catch: all -> 0x00cb, IOException -> 0x00ce, TRY_ENTER, TryCatch #9 {IOException -> 0x00ce, all -> 0x00cb, blocks: (B:36:0x00ad, B:38:0x00b3, B:41:0x00bc, B:48:0x00ca, B:47:0x00c7, B:44:0x00c2), top: B:80:0x0028, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc A[Catch: all -> 0x00cb, IOException -> 0x00ce, TRY_ENTER, TRY_LEAVE, TryCatch #9 {IOException -> 0x00ce, all -> 0x00cb, blocks: (B:36:0x00ad, B:38:0x00b3, B:41:0x00bc, B:48:0x00ca, B:47:0x00c7, B:44:0x00c2), top: B:80:0x0028, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r6v4, types: [kotlin.jvm.functions.Function2] */
    @Override // defpackage.hdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.he6 r11, nt5 r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kaf.c(he6, nt5):java.lang.Object");
    }

    @Override // defpackage.e65
    public final void close() {
        ((AtomicBoolean) this.f.a).set(true);
        this.e.invoke();
    }

    @Override // defpackage.hdk
    public final ylj e() {
        return this.d;
    }
}
