package defpackage;

import ads_mobile_sdk.xj2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class hc1 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public byte u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ long w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hc1(boolean z, Object obj, long j, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = z;
        this.x = obj;
        this.w = j;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.x;
        switch (b) {
            case 0:
                return new hc1(this.v, (c6n) obj2, this.w, mt5Var, (byte) 0);
            case 1:
                return new hc1(this.v, (qlo) obj2, this.w, mt5Var, (byte) 1);
            default:
                return new hc1(this.v, (xj2) obj2, this.w, mt5Var, (byte) 2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
        }
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (ads_mobile_sdk.xj2.c(r3, r1, r11) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (ads_mobile_sdk.xj2.d(r3, r1, r11) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
    
        if (r3.d(r1, r11) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006d, code lost:
    
        if (r3.b(r1, r11) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a0, code lost:
    
        if (r0 != r10) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b2, code lost:
    
        if (r0 == r10) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            byte r0 = r11.t
            long r1 = r11.w
            java.lang.Object r3 = r11.x
            boolean r4 = r11.v
            r6 = 0
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r8 = 1
            r9 = 2
            switch(r0) {
                case 0: goto L74;
                case 1: goto L45;
                default: goto L10;
            }
        L10:
            px5 r0 = px5.a
            byte r10 = r11.u
            if (r10 == 0) goto L22
            if (r10 == r8) goto L1e
            if (r10 == r9) goto L1e
            qp2.n(r7)
            goto L44
        L1e:
            defpackage.ybh.y(r12)
            goto L42
        L22:
            defpackage.ybh.y(r12)
            ads_mobile_sdk.xj2 r3 = (ads_mobile_sdk.xj2) r3
            if (r4 == 0) goto L35
            r11.u = r8
            r3.getClass()
            java.lang.Object r1 = ads_mobile_sdk.xj2.c(r3, r1, r11)
            if (r1 != r0) goto L42
            goto L40
        L35:
            r11.u = r9
            r3.getClass()
            java.lang.Object r1 = ads_mobile_sdk.xj2.d(r3, r1, r11)
            if (r1 != r0) goto L42
        L40:
            r6 = r0
            goto L44
        L42:
            kotlin.Unit r6 = kotlin.Unit.a
        L44:
            return r6
        L45:
            px5 r0 = px5.a
            byte r10 = r11.u
            if (r10 == 0) goto L57
            if (r10 == r8) goto L53
            if (r10 == r9) goto L53
            qp2.n(r7)
            goto L73
        L53:
            defpackage.ybh.y(r12)
            goto L71
        L57:
            defpackage.ybh.y(r12)
            qlo r3 = (defpackage.qlo) r3
            if (r4 == 0) goto L67
            r11.u = r8
            java.lang.Object r1 = r3.d(r1, r11)
            if (r1 != r0) goto L71
            goto L6f
        L67:
            r11.u = r9
            java.lang.Object r1 = r3.b(r1, r11)
            if (r1 != r0) goto L71
        L6f:
            r6 = r0
            goto L73
        L71:
            kotlin.Unit r6 = kotlin.Unit.a
        L73:
            return r6
        L74:
            px5 r10 = px5.a
            byte r0 = r11.u
            if (r0 == 0) goto L8c
            if (r0 == r8) goto L87
            if (r0 != r9) goto L83
            defpackage.ybh.y(r12)
            r0 = r12
            goto Lb6
        L83:
            qp2.n(r7)
            goto Lbc
        L87:
            defpackage.ybh.y(r12)
            r0 = r12
            goto La2
        L8c:
            defpackage.ybh.y(r12)
            c6n r3 = (defpackage.c6n) r3
            s9i r0 = r3.a
            if (r4 != 0) goto La7
            r11.u = r8
            r1 = 0
            long r3 = r11.w
            r5 = r11
            java.lang.Object r0 = r0.K(r1, r3, r5)
            if (r0 == r10) goto Lb4
        La2:
            i1n r0 = (defpackage.i1n) r0
            long r0 = r0.a
            goto Lba
        La7:
            r11.u = r9
            long r1 = r11.w
            r3 = 0
            r5 = r11
            java.lang.Object r0 = r0.K(r1, r3, r5)
            if (r0 != r10) goto Lb6
        Lb4:
            r6 = r10
            goto Lbc
        Lb6:
            i1n r0 = (defpackage.i1n) r0
            long r0 = r0.a
        Lba:
            kotlin.Unit r6 = kotlin.Unit.a
        Lbc:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hc1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
