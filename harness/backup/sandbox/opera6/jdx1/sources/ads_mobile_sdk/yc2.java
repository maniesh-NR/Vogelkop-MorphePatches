package ads_mobile_sdk;

import android.content.Context;
import defpackage.fjp;

/* loaded from: classes.dex */
public final class yc2 extends k61 {
    public final k1 c;
    public final d6 d;
    public final Context e;
    public final fjp f;
    public ae2 g;

    public yc2(k1 k1Var, d6 d6Var, Context context, fjp fjpVar) {
        super((fw0) null, false);
        this.c = k1Var;
        this.d = d6Var;
        this.e = context;
        this.f = fjpVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.yc2 r5, nt5 r6) throws m2 {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.wc2
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.wc2 r0 = (ads_mobile_sdk.wc2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.wc2 r0 = new ads_mobile_sdk.wc2
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2f
            java.util.LinkedHashSet r5 = r0.b
            ads_mobile_sdk.yc2 r0 = r0.a
            defpackage.ybh.y(r6)
            r4 = r6
            r6 = r5
            r5 = r0
            r0 = r4
            goto L59
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            r5 = 0
            return r5
        L36:
            defpackage.ybh.y(r6)
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet
            r6.<init>()
            ads_mobile_sdk.k1 r2 = r5.c
            kap r2 = r2.a
            java.lang.Object r2 = r2.get()
            qd6 r2 = (defpackage.qd6) r2
            f99 r2 = r2.getData()
            r0.a = r5
            r0.b = r6
            r0.e = r3
            java.lang.Object r0 = defpackage.cs5.E(r2, r0)
            if (r0 != r1) goto L59
            return r1
        L59:
            ads_mobile_sdk.h1 r0 = (ads_mobile_sdk.h1) r0
            java.util.Map r0 = r0.u()
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L67:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La7
            java.lang.Object r1 = r0.next()
            ads_mobile_sdk.ds0 r1 = (ads_mobile_sdk.ds0) r1
            java.util.Map r1 = r1.o()
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L7f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L67
            java.lang.Object r2 = r1.next()
            ads_mobile_sdk.h6 r2 = (ads_mobile_sdk.h6) r2
            flp r2 = r2.r()
            java.util.Iterator r2 = r2.iterator()
        L93:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L7f
            java.lang.Object r3 = r2.next()
            ads_mobile_sdk.c6 r3 = (ads_mobile_sdk.c6) r3
            java.lang.String r3 = r3.q()
            r6.add(r3)
            goto L93
        La7:
            ads_mobile_sdk.d6 r5 = r5.d
            java.util.List r5 = r5.a()
            java.util.Iterator r5 = r5.iterator()
        Lb1:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Ldc
            java.lang.Object r0 = r5.next()
            java.io.File r0 = (java.io.File) r0
            java.lang.String r1 = r0.getName()
            java.lang.String r2 = ".tmp"
            r3 = 0
            boolean r1 = kotlin.text.c.l(r1, r2, r3)
            if (r1 == 0) goto Lce
            r0.delete()
            goto Lb1
        Lce:
            java.lang.String r1 = r0.getName()
            boolean r1 = r6.contains(r1)
            if (r1 != 0) goto Lb1
            r0.delete()
            goto Lb1
        Ldc:
            ads_mobile_sdk.hv0 r5 = new ads_mobile_sdk.hv0
            kotlin.Unit r6 = kotlin.Unit.a
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.yc2.a(ads_mobile_sdk.yc2, nt5):java.lang.Object");
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    public static java.lang.Object b(ads_mobile_sdk.yc2 r11, nt5 r12) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.yc2.b(ads_mobile_sdk.yc2, nt5):java.lang.Object");
    }

    @Override // ads_mobile_sdk.k61
    public final Object h(mt5 mt5Var) {
        return b(this, (nt5) mt5Var);
    }
}
