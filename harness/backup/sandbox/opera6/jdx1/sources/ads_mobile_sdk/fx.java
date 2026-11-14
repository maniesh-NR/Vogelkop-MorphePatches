package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class fx extends kuk implements Function2 {
    public byte a;
    public final /* synthetic */ lx b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fx(lx lxVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.b = lxVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        lx lxVar = this.b;
        switch (b) {
            case 0:
                return new fx(lxVar, mt5Var, (byte) 0);
            default:
                return new fx(lxVar, mt5Var, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        lx lxVar = this.b;
        switch (b) {
            case 0:
                return new fx(lxVar, (mt5) obj2, (byte) 0).invokeSuspend(Unit.a);
            default:
                return new fx(lxVar, (mt5) obj2, (byte) 1).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (r10 == r7) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d1, code lost:
    
        if (defpackage.na2.Z(r2.c, new dg6(r2, true, (java.lang.String) null, (mt5) null), r9) == r0) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            byte r0 = r9.t
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            ads_mobile_sdk.lx r2 = r9.b
            r3 = 2
            r4 = 1
            r5 = 0
            switch(r0) {
                case 0: goto L88;
                default: goto Lc;
            }
        Lc:
            nx5 r0 = r2.d
            ads_mobile_sdk.dk r6 = r2.i
            px5 r7 = px5.a
            byte r8 = r9.a
            if (r8 == 0) goto L26
            if (r8 == r4) goto L22
            if (r8 != r3) goto L1e
            defpackage.ybh.y(r10)
            goto L4b
        L1e:
            qp2.n(r1)
            goto L87
        L22:
            defpackage.ybh.y(r10)
            goto L3e
        L26:
            defpackage.ybh.y(r10)
            r9.a = r4
            kotlin.coroutines.CoroutineContext r10 = r6.a
            rf4 r1 = new rf4
            r8 = 26
            r1.<init>(r8, r5, r6)
            java.lang.Object r10 = defpackage.na2.Z(r10, r1, r9)
            if (r10 == r7) goto L3c
            kotlin.Unit r10 = kotlin.Unit.a
        L3c:
            if (r10 == r7) goto L49
        L3e:
            r9.a = r3
            r6.getClass()
            java.lang.Object r10 = ads_mobile_sdk.dk.a(r6, r9)
            if (r10 != r7) goto L4b
        L49:
            r5 = r7
            goto L87
        L4b:
            ads_mobile_sdk.xi r10 = (ads_mobile_sdk.xi) r10
            java.lang.String r9 = r10.u()
            int r9 = r9.length()
            r10 = 3
            if (r9 <= 0) goto L76
            ads_mobile_sdk.fx r9 = new ads_mobile_sdk.fx
            r1 = 0
            r9.<init>(r2, r5, r1)
            kotlin.coroutines.h r4 = kotlin.coroutines.h.a
            fsg r6 = new fsg
            r6.<init>(r9, r5, r10)
            defpackage.na2.B(r0, r4, r5, r6, r3)
            ads_mobile_sdk.gx r9 = new ads_mobile_sdk.gx
            r9.<init>(r2, r5, r1)
            fsg r1 = new fsg
            r1.<init>(r9, r5, r10)
            defpackage.na2.B(r0, r4, r5, r1, r3)
            goto L85
        L76:
            ads_mobile_sdk.gx r9 = new ads_mobile_sdk.gx
            r9.<init>(r2, r5, r4)
            kotlin.coroutines.h r1 = kotlin.coroutines.h.a
            fsg r2 = new fsg
            r2.<init>(r9, r5, r10)
            defpackage.na2.B(r0, r1, r5, r2, r3)
        L85:
            kotlin.Unit r5 = kotlin.Unit.a
        L87:
            return r5
        L88:
            px5 r0 = px5.a
            byte r6 = r9.a
            if (r6 == 0) goto L9e
            if (r6 == r4) goto L9a
            if (r6 != r3) goto L96
            defpackage.ybh.y(r10)
            goto Ld5
        L96:
            qp2.n(r1)
            goto Ld7
        L9a:
            defpackage.ybh.y(r10)
            goto Lc4
        L9e:
            defpackage.ybh.y(r10)
            ads_mobile_sdk.qr0 r10 = r2.m
            r10.getClass()
            on7 r1 = pn7.b
            r1 = 60
            un7 r6 = un7.e
            pn7 r1 = u0h.b(r1, r6)
            ads_mobile_sdk.fo r6 = ads_mobile_sdk.fo.a$21
            java.lang.String r7 = "gads:cld_fetch_delay_on_cache_hit"
            java.lang.Object r10 = r10.a(r7, r1, r6)
            pn7 r10 = (pn7) r10
            long r6 = r10.a
            r9.a = r4
            java.lang.Object r10 = defpackage.nb6.q(r6, r9)
            if (r10 == r0) goto Ld3
        Lc4:
            r9.a = r3
            kotlin.coroutines.CoroutineContext r10 = r2.c
            dg6 r1 = new dg6
            r1.<init>(r2, r4, r5, r5)
            java.lang.Object r9 = defpackage.na2.Z(r10, r1, r9)
            if (r9 != r0) goto Ld5
        Ld3:
            r5 = r0
            goto Ld7
        Ld5:
            kotlin.Unit r5 = kotlin.Unit.a
        Ld7:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fx.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
