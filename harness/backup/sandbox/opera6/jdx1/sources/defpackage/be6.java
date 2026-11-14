package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class be6 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public byte u;
    public final /* synthetic */ ie6 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ be6(ie6 ie6Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = ie6Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        ie6 ie6Var = this.v;
        switch (b) {
            case 0:
                return new be6(ie6Var, mt5Var, (byte) 0);
            default:
                return new be6(ie6Var, mt5Var, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        nx5 nx5Var = (nx5) obj;
        mt5 mt5Var = (mt5) obj2;
        switch (this.t) {
        }
        return create(nx5Var, mt5Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r10 == r7) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:
    
        if (r10.collect(r1, r9) == r0) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            byte r0 = r9.t
            r1 = -1
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            ie6 r4 = r9.v
            r5 = 1
            r6 = 2
            switch(r0) {
                case 0: goto L53;
                default: goto Ld;
            }
        Ld:
            je6 r0 = r4.h
            px5 r7 = px5.a
            byte r8 = r9.u
            if (r8 == 0) goto L25
            if (r8 == r5) goto L21
            if (r8 != r6) goto L1d
            defpackage.ybh.y(r10)
            goto L48
        L1d:
            qp2.n(r3)
            goto L52
        L21:
            defpackage.ybh.y(r10)     // Catch: java.lang.Throwable -> L4c
            goto L3d
        L25:
            defpackage.ybh.y(r10)
            fak r10 = r0.b()
            boolean r10 = r10 instanceof w39
            if (r10 == 0) goto L35
            fak r2 = r0.b()
            goto L52
        L35:
            r9.u = r5     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r10 = r4.f(r9)     // Catch: java.lang.Throwable -> L4c
            if (r10 == r7) goto L46
        L3d:
            r9.u = r6
            r10 = 0
            java.lang.Object r10 = r4.g(r10, r9)
            if (r10 != r7) goto L48
        L46:
            r2 = r7
            goto L52
        L48:
            r2 = r10
            fak r2 = (defpackage.fak) r2
            goto L52
        L4c:
            r9 = move-exception
            okh r2 = new okh
            r2.<init>(r1, r9)
        L52:
            return r2
        L53:
            px5 r0 = px5.a
            byte r7 = r9.u
            if (r7 == 0) goto L69
            if (r7 == r5) goto L65
            if (r7 != r6) goto L61
            defpackage.ybh.y(r10)
            goto L98
        L61:
            qp2.n(r3)
            goto L9a
        L65:
            defpackage.ybh.y(r10)
            goto L7e
        L69:
            defpackage.ybh.y(r10)
            s9i r10 = r4.i
            r9.u = r5
            java.lang.Object r10 = r10.c
            cd5 r10 = (cd5) r10
            java.lang.Object r10 = r10.A(r9)
            if (r10 == r0) goto L7c
            kotlin.Unit r10 = kotlin.Unit.a
        L7c:
            if (r10 == r0) goto L96
        L7e:
            ylj r10 = r4.c()
            xd6 r10 = r10.c
            f99 r10 = defpackage.ic4.l(r10, r1)
            o71 r1 = new o71
            r2 = 3
            r1.<init>(r4, r2)
            r9.u = r6
            java.lang.Object r9 = r10.collect(r1, r9)
            if (r9 != r0) goto L98
        L96:
            r2 = r0
            goto L9a
        L98:
            kotlin.Unit r2 = kotlin.Unit.a
        L9a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
