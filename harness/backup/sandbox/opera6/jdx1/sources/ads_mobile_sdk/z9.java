package ads_mobile_sdk;

import defpackage.gdp;
import defpackage.hpo;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class z9 extends k8 implements hpo, gdp {
    public final pfe c;
    public nn3 d;

    public z9(nx5 nx5Var, Map map) {
        super(nx5Var, map);
        this.c = new pfe();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.z9 r7, ads_mobile_sdk.nn3 r8, nt5 r9) {
        /*
            boolean r0 = r9 instanceof ads_mobile_sdk.x9
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.x9 r0 = (ads_mobile_sdk.x9) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.x9 r0 = new ads_mobile_sdk.x9
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.d
            px5 r1 = px5.a
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L30
            pfe r7 = r0.c
            ads_mobile_sdk.nn3 r8 = r0.b
            ads_mobile_sdk.z9 r0 = r0.a
            defpackage.ybh.y(r9)
            r9 = r7
            r7 = r0
        L2e:
            r4 = r8
            goto L4b
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            r7 = 0
            return r7
        L37:
            defpackage.ybh.y(r9)
            pfe r9 = r7.c
            r0.a = r7
            r0.b = r8
            r0.c = r9
            r0.f = r3
            java.lang.Object r0 = r9.i(r0)
            if (r0 != r1) goto L2e
            return r1
        L4b:
            r3 = 0
            ads_mobile_sdk.nn3 r8 = r7.d     // Catch: java.lang.Throwable -> L9e
            if (r8 == 0) goto L5c
            boolean r8 = kotlin.jvm.internal.Intrinsics.a(r4, r8)     // Catch: java.lang.Throwable -> L9e
            if (r8 == 0) goto L5c
            kotlin.Unit r7 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L9e
            r9.l(r3)
            return r7
        L5c:
            r7.d = r4     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r8 = r7.b     // Catch: java.lang.Throwable -> L9e
            java.util.Map r8 = (java.util.Map) r8     // Catch: java.lang.Throwable -> L9e
            java.util.Set r8 = r8.entrySet()     // Catch: java.lang.Throwable -> L9e
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L9e
        L6a:
            boolean r0 = r8.hasNext()     // Catch: java.lang.Throwable -> L9e
            if (r0 == 0) goto L98
            java.lang.Object r0 = r8.next()     // Catch: java.lang.Throwable -> L9e
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r2 = r0.getValue()     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r0 = r7.a     // Catch: java.lang.Throwable -> L9e
            r6 = r0
            nx5 r6 = (nx5) r6     // Catch: java.lang.Throwable -> L9e
            ads_mobile_sdk.y9 r0 = new ads_mobile_sdk.y9     // Catch: java.lang.Throwable -> L9e
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L9e
            kotlin.coroutines.h r1 = kotlin.coroutines.h.a     // Catch: java.lang.Throwable -> L9e
            fsg r2 = new fsg     // Catch: java.lang.Throwable -> L9e
            r5 = 3
            r2.<init>(r0, r3, r5)     // Catch: java.lang.Throwable -> L9e
            r0 = 2
            defpackage.na2.B(r6, r1, r3, r2, r0)     // Catch: java.lang.Throwable -> L9e
            goto L6a
        L98:
            kotlin.Unit r7 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L9e
            r9.l(r3)
            return r7
        L9e:
            r0 = move-exception
            r7 = r0
            r9.l(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.z9.a(ads_mobile_sdk.z9, ads_mobile_sdk.nn3, nt5):java.lang.Object");
    }

    @Override // defpackage.hpo
    public final Object a(nn3 nn3Var, mt5 mt5Var) {
        return a(this, nn3Var, (nt5) mt5Var);
    }

    @Override // defpackage.gdp
    public final Object c(nn3 nn3Var, kuk kukVar) {
        Object objA = a(this, nn3Var, kukVar);
        return objA == px5.a ? objA : Unit.a;
    }
}
