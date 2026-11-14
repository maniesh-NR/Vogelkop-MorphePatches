package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class z19 implements hdk {
    public final File a;
    public final u2j b;
    public final ylj c;
    public final al7 d;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final pfe f = new pfe();

    public z19(File file, u2j u2jVar, ylj yljVar, al7 al7Var) {
        this.a = file;
        this.b = u2jVar;
        this.c = yljVar;
        this.d = al7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0071 A[Catch: all -> 0x0080, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0080, blocks: (B:33:0x0071, B:40:0x007f, B:39:0x007c, B:36:0x0077), top: B:49:0x0022, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v0, types: [z19] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // defpackage.hdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(sn4 r8, nt5 r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.x19
            if (r0 == 0) goto L13
            r0 = r9
            x19 r0 = (defpackage.x19) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            x19 r0 = new x19
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            px5 r1 = px5.a
            int r2 = r0.x
            pfe r3 = r7.f
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L36
            if (r2 != r4) goto L30
            boolean r7 = r0.t
            v19 r8 = r0.u
            defpackage.ybh.y(r9)     // Catch: java.lang.Throwable -> L2e
            goto L63
        L2e:
            r9 = move-exception
            goto L77
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r5
        L36:
            defpackage.ybh.y(r9)
            java.util.concurrent.atomic.AtomicBoolean r9 = r7.e
            boolean r9 = r9.get()
            if (r9 != 0) goto L8a
            boolean r9 = r3.j()
            v19 r2 = new v19     // Catch: java.lang.Throwable -> L83
            java.io.File r6 = r7.a     // Catch: java.lang.Throwable -> L83
            u2j r7 = r7.b     // Catch: java.lang.Throwable -> L83
            r2.<init>(r6, r7)     // Catch: java.lang.Throwable -> L83
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> L72
            r0.u = r2     // Catch: java.lang.Throwable -> L72
            r0.t = r9     // Catch: java.lang.Throwable -> L72
            r0.x = r4     // Catch: java.lang.Throwable -> L72
            java.lang.Object r7 = r8.invoke(r2, r7, r0)     // Catch: java.lang.Throwable -> L72
            if (r7 != r1) goto L5f
            return r1
        L5f:
            r8 = r9
            r9 = r7
            r7 = r8
            r8 = r2
        L63:
            r8.close()     // Catch: java.lang.Throwable -> L68
            r8 = r5
            goto L69
        L68:
            r8 = move-exception
        L69:
            if (r8 != 0) goto L71
            if (r7 == 0) goto L70
            r3.l(r5)
        L70:
            return r9
        L71:
            throw r8     // Catch: java.lang.Throwable -> L80
        L72:
            r7 = move-exception
            r8 = r9
            r9 = r7
            r7 = r8
            r8 = r2
        L77:
            r8.close()     // Catch: java.lang.Throwable -> L7b
            goto L7f
        L7b:
            r8 = move-exception
            defpackage.wf8.a(r9, r8)     // Catch: java.lang.Throwable -> L80
        L7f:
            throw r9     // Catch: java.lang.Throwable -> L80
        L80:
            r8 = move-exception
            r9 = r7
            goto L84
        L83:
            r8 = move-exception
        L84:
            if (r9 == 0) goto L89
            r3.l(r5)
        L89:
            throw r8
        L8a:
            java.lang.String r7 = "StorageConnection has already been disposed."
            qp2.n(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z19.b(sn4, nt5):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be A[Catch: all -> 0x010d, IOException -> 0x010f, TRY_ENTER, TRY_LEAVE, TryCatch #3 {IOException -> 0x010f, blocks: (B:40:0x00be, B:45:0x00d9, B:46:0x00f7, B:49:0x00fe, B:56:0x010c, B:55:0x0109), top: B:77:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fe A[Catch: all -> 0x010d, IOException -> 0x010f, TRY_ENTER, TRY_LEAVE, TryCatch #3 {IOException -> 0x010f, blocks: (B:40:0x00be, B:45:0x00d9, B:46:0x00f7, B:49:0x00fe, B:56:0x010c, B:55:0x0109), top: B:77:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [kotlin.jvm.functions.Function2] */
    @Override // defpackage.hdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.he6 r11, nt5 r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z19.c(he6, nt5):java.lang.Object");
    }

    @Override // defpackage.e65
    public final void close() {
        this.e.set(true);
        this.d.invoke();
    }

    @Override // defpackage.hdk
    public final ylj e() {
        return this.c;
    }
}
