package ads_mobile_sdk;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class qf0 extends kuk implements Function2 {
    public byte a;
    public final /* synthetic */ AtomicInteger b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ cg0 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf0(AtomicInteger atomicInteger, int i, int i2, cg0 cg0Var, int i3, mt5 mt5Var) {
        super(2, mt5Var);
        this.b = atomicInteger;
        this.c = i;
        this.d = i2;
        this.e = cg0Var;
        this.f = i3;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        return new qf0(this.b, this.c, this.d, this.e, this.f, mt5Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r7.a((android.app.Activity) null, (nt5) r9) == r0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            px5 r0 = px5.a
            byte r1 = r9.a
            r2 = 0
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            ads_mobile_sdk.cg0 r7 = r9.e
            if (r1 == 0) goto L23
            if (r1 == r6) goto L1f
            if (r1 == r5) goto L1f
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L19
            defpackage.ybh.y(r10)
            goto L70
        L19:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r9)
            return r2
        L1f:
            defpackage.ybh.y(r10)
            goto L65
        L23:
            defpackage.ybh.y(r10)
            java.util.concurrent.atomic.AtomicInteger r10 = r9.b
            int r1 = r10.get()
            int r8 = r9.c
            if (r1 == r8) goto L65
            int r10 = r10.get()
            int r1 = r9.d
            if (r10 != r1) goto L46
            ads_mobile_sdk.d91 r10 = r7.j
            r9.a = r6
            r10.getClass()
            java.lang.Object r10 = ads_mobile_sdk.d91.a(r10, r4, r9)
            if (r10 != r0) goto L65
            goto L6f
        L46:
            int r1 = r9.f
            if (r10 != r1) goto L58
            ads_mobile_sdk.d91 r10 = r7.j
            r9.a = r5
            r10.getClass()
            java.lang.Object r10 = ads_mobile_sdk.d91.a(r10, r5, r9)
            if (r10 != r0) goto L65
            goto L6f
        L58:
            ads_mobile_sdk.d91 r10 = r7.j
            r9.a = r4
            r10.getClass()
            java.lang.Object r10 = ads_mobile_sdk.d91.a(r10, r6, r9)
            if (r10 == r0) goto L6f
        L65:
            r9.a = r3
            android.net.Uri r10 = ads_mobile_sdk.cg0.q
            java.lang.Object r9 = r7.a(r2, r9)
            if (r9 != r0) goto L70
        L6f:
            return r0
        L70:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.qf0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
