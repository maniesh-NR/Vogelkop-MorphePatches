package defpackage;

import java.util.LinkedList;

/* loaded from: classes.dex */
public final class cdk implements trm {
    public final n79 a;
    public final ctm b;
    public zrm d;
    public final pfe c = new pfe();
    public final LinkedList e = new LinkedList();

    public cdk(n79 n79Var, ctm ctmVar) {
        this.a = n79Var;
        this.b = ctmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.zck r7, defpackage.zrm r8, nt5 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.bdk
            if (r0 == 0) goto L13
            r0 = r9
            bdk r0 = (defpackage.bdk) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            bdk r0 = new bdk
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.v
            px5 r1 = px5.a
            int r2 = r0.x
            r3 = 3
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L33
            if (r2 != r5) goto L2d
            zrm r8 = r0.u
            zck r7 = r0.t
            defpackage.ybh.y(r9)
            goto L53
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r4
        L33:
            defpackage.ybh.y(r9)
            java.lang.String r9 = "CXCP"
            boolean r9 = defpackage.gyg.G(r3, r9)
            if (r9 == 0) goto L44
            java.util.Objects.toString(r7)
            java.util.Objects.toString(r8)
        L44:
            r0.t = r7
            r0.u = r8
            r0.x = r5
            n79 r9 = r6.a
            java.lang.Object r9 = r9.c(r0)
            if (r9 != r1) goto L53
            return r1
        L53:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.util.ArrayList r0 = r7.a
            int r1 = r7.b
            int r2 = r7.c
            java.util.List r8 = r8.c(r0, r1, r2, r9)
            ctm r6 = r6.b
            a64 r6 = r6.f
            r8h r9 = new r8h
            r0 = 22
            r9.<init>(r8, r7, r4, r0)
            i07 r6 = defpackage.na2.g(r6, r4, r4, r9, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdk.a(zck, zrm, nt5):java.lang.Object");
    }

    @Override // defpackage.trm
    public final void b(zrm zrmVar) {
        this.d = zrmVar;
        na2.B(this.b.f, null, null, new ogb(this, null), 3);
    }

    @Override // defpackage.trm
    public final void reset() {
        na2.B(this.b.f, null, null, new mz9((byte) 28, null, this), 3);
    }
}
