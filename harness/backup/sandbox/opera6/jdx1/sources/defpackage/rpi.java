package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class rpi extends kuk implements Function2 {
    public long t;
    public byte u;
    public /* synthetic */ long v;
    public final /* synthetic */ spi w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rpi(spi spiVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.w = spiVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        rpi rpiVar = new rpi(this.w, mt5Var);
        rpiVar.v = ((i1n) obj).a;
        return rpiVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        long j = ((i1n) obj).a;
        rpi rpiVar = new rpi(this.w, (mt5) obj2);
        rpiVar.v = j;
        return rpiVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            px5 r0 = px5.a
            byte r1 = r14.u
            r2 = 3
            r3 = 2
            r4 = 1
            spi r5 = r14.w
            if (r1 == 0) goto L2e
            if (r1 == r4) goto L28
            if (r1 == r3) goto L20
            if (r1 != r2) goto L19
            long r0 = r14.t
            long r2 = r14.v
            defpackage.ybh.y(r15)
            goto L6e
        L19:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r14)
            r14 = 0
            return r14
        L20:
            long r3 = r14.t
            long r6 = r14.v
            defpackage.ybh.y(r15)
            goto L54
        L28:
            long r6 = r14.v
            defpackage.ybh.y(r15)
            goto L3f
        L2e:
            defpackage.ybh.y(r15)
            long r6 = r14.v
            s9i r15 = r5.f
            r14.v = r6
            r14.u = r4
            java.lang.Object r15 = r15.L(r6, r14)
            if (r15 == r0) goto L6b
        L3f:
            i1n r15 = (defpackage.i1n) r15
            long r8 = r15.a
            long r8 = defpackage.i1n.d(r6, r8)
            r14.v = r6
            r14.t = r8
            r14.u = r3
            java.lang.Object r15 = r5.a(r8, r14)
            if (r15 == r0) goto L6b
            r3 = r8
        L54:
            i1n r15 = (defpackage.i1n) r15
            long r11 = r15.a
            s9i r8 = r5.f
            long r9 = defpackage.i1n.d(r3, r11)
            r14.v = r6
            r14.t = r11
            r14.u = r2
            r13 = r14
            java.lang.Object r15 = r8.K(r9, r11, r13)
            if (r15 != r0) goto L6c
        L6b:
            return r0
        L6c:
            r2 = r6
            r0 = r11
        L6e:
            i1n r15 = (defpackage.i1n) r15
            long r14 = r15.a
            long r14 = defpackage.i1n.d(r0, r14)
            long r14 = defpackage.i1n.d(r2, r14)
            i1n r0 = new i1n
            r0.<init>(r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rpi.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
