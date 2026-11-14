package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class gyb {
    public final pna a;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(pna r6, defpackage.joe r7, kotlin.jvm.functions.Function2 r8, mt5 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.fyb
            if (r0 == 0) goto L13
            r0 = r9
            fyb r0 = (defpackage.fyb) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            fyb r0 = new fyb
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.v
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            defpackage.ybh.y(r9)
            return r9
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r5
        L31:
            pna r6 = r0.u
            kuk r7 = r0.t
            r8 = r7
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            defpackage.ybh.y(r9)
            goto L4e
        L3c:
            defpackage.ybh.y(r9)
            r9 = r8
            kuk r9 = (kuk) r9
            r0.t = r9
            r0.u = r6
            r0.w = r4
            spa r9 = ioh.F(r7, r0)
            if (r9 == r1) goto L69
        L4e:
            spa r9 = (spa) r9
            yqa r7 = new yqa
            r2 = 0
            r7.<init>(r9, r6, r2)
            hz1 r6 = new hz1
            r9 = 15
            r6.<init>(r9, r5, r8)
            r0.t = r5
            r0.u = r5
            r0.w = r3
            java.lang.Object r6 = r7.c(r6, r0)
            if (r6 != r1) goto L6a
        L69:
            return r1
        L6a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gyb.a(pna, joe, kotlin.jvm.functions.Function2, mt5):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gyb) {
            return Intrinsics.a(this.a, ((gyb) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KtorNetworkClient(httpClient=" + this.a + ")";
    }
}
