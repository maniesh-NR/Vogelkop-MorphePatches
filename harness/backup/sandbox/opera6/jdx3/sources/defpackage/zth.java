package defpackage;

/* loaded from: classes.dex */
public interface zth {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e4 A[Catch: IOException -> 0x00ff, hth -> 0x0109, TRY_LEAVE, TryCatch #1 {IOException -> 0x00ff, blocks: (B:27:0x00ce, B:29:0x00e4), top: B:61:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x015e -> B:49:0x0164). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object a(defpackage.zth r17, defpackage.tth r18, int r19, nt5 r20) throws defpackage.hth {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zth.a(zth, tth, int, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object b(defpackage.zth r7, defpackage.tth r8, nt5 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.xth
            if (r0 == 0) goto L13
            r0 = r9
            xth r0 = (defpackage.xth) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            xth r0 = new xth
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            tth r8 = r0.t
            ybh.y(r9)
            goto L61
        L2a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r7)
            return r3
        L30:
            ybh.y(r9)
            qfb r9 = new qfb
            java.lang.String r2 = r8.a
            kotlinx.serialization.json.b[] r5 = r8.b
            int r6 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r6)
            kotlinx.serialization.json.b[] r5 = (kotlinx.serialization.json.b[]) r5
            r9.<init>(r2, r5)
            r0.t = r8
            r0.w = r4
            ece r7 = (defpackage.ece) r7
            cb7 r2 = r7.c
            kzd r2 = (kzd) r2
            ab7 r2 = r2.a
            dx5 r2 = r2.c()
            p71 r4 = new p71
            r5 = 17
            r4.<init>(r7, r9, r3, r5)
            java.lang.Object r9 = na2.Z(r2, r4, r0)
            if (r9 != r1) goto L61
            return r1
        L61:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r7 = defpackage.y4h.s(r9, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zth.b(zth, tth, nt5):java.lang.Object");
    }

    static Object c(zth zthVar, tth tthVar, nt5 nt5Var) {
        zthVar.getClass();
        return a(zthVar, tthVar, 2, nt5Var);
    }
}
