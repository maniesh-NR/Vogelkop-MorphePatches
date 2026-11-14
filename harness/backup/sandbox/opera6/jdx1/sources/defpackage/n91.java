package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class n91 implements nx5 {
    public final View a;
    public final ajl b;
    public final nx5 c;
    public final AtomicReference d = new AtomicReference(null);

    public n91(View view, ajl ajlVar, nx5 nx5Var) {
        this.a = view;
        this.b = ajlVar;
        this.c = nx5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.hbc r9, nt5 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.l91
            if (r0 == 0) goto L13
            r0 = r10
            l91 r0 = (defpackage.l91) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            l91 r0 = new l91
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2d
            if (r2 == r3) goto L29
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r8)
            return
        L29:
            defpackage.ybh.y(r10)
            goto L51
        L2d:
            defpackage.ybh.y(r10)
            r10 = r3
            q3 r3 = new q3
            r2 = 8
            r3.<init>(r9, r8, r2)
            r3 r5 = new r3
            r9 = 2
            r6 = 0
            r5.<init>(r9, r6, r8)
            r0.v = r10
            jj4 r2 = new jj4
            r7 = 16
            java.util.concurrent.atomic.AtomicReference r4 = r8.d
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Object r8 = defpackage.sgb.q(r2, r0)
            if (r8 != r1) goto L51
            return
        L51:
            defpackage.t3p.v()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n91.a(hbc, nt5):void");
    }

    public final CoroutineContext l() {
        return this.c.l();
    }
}
