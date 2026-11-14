package defpackage;

import kotlin.text.Regex;

/* loaded from: classes.dex */
public interface eyo {
    static {
        Regex regex = uso.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object c(defpackage.eyo r5, nt5 r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.dm3
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.dm3 r0 = (ads_mobile_sdk.dm3) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ads_mobile_sdk.dm3 r0 = new ads_mobile_sdk.dm3
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            px5 r1 = px5.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.ybh.y(r6)
            goto L3a
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r3
        L2e:
            defpackage.ybh.y(r6)
            r0.c = r4
            java.lang.Object r6 = r5.a()
            if (r6 != r1) goto L3a
            return r1
        L3a:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L53
            kotlin.text.Regex r5 = defpackage.uso.a
            ucd r5 = kotlin.text.Regex.d(r5, r6)
            if (r5 == 0) goto L53
            java.util.List r5 = r5.a()
            tcd r5 = (tcd) r5
            java.lang.Object r5 = r5.get(r4)
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L53:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eyo.c(eyo, nt5):java.lang.Object");
    }

    default Object a() {
        return null;
    }

    Object a(nt5 nt5Var);

    Object b(nt5 nt5Var);
}
