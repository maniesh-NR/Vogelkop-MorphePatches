package defpackage;

import android.app.Application;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class v9p extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public byte u;
    public final /* synthetic */ Application v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v9p(Application application, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = application;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Application application = this.v;
        switch (b) {
            case 0:
                return new v9p(application, mt5Var, (byte) 0);
            default:
                return new v9p(application, mt5Var, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
                return px5.a;
            default:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        if (r9 == r0) goto L19;
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
            r2 = 1
            r3 = 2
            android.app.Application r4 = r9.v
            r5 = 0
            switch(r0) {
                case 0: goto L71;
                default: goto Lc;
            }
        Lc:
            px5 r0 = px5.a
            byte r6 = r9.u
            if (r6 == 0) goto L22
            if (r6 == r2) goto L1e
            if (r6 != r3) goto L1a
            ybh.y(r10)
            goto L6e
        L1a:
            defpackage.qp2.n(r1)
            goto L70
        L1e:
            ybh.y(r10)
            goto L51
        L22:
            ybh.y(r10)
            r9.u = r2
            zyk r10 = defpackage.aap.a
            defpackage.pfp.b()
            zyk r10 = defpackage.fcp.a
            android.content.Context r10 = r4.getApplicationContext()
            zyk r1 = defpackage.aap.a
            java.lang.Object r1 = r1.getValue()
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
            dze r2 = dze.b
            kotlin.coroutines.CoroutineContext r1 = r1.plus(r2)
            jj4 r2 = new jj4
            r6 = 25
            r2.<init>(r6, r5, r10)
            java.lang.Object r10 = na2.Z(r1, r2, r9)
            if (r10 == r0) goto L4f
            kotlin.Unit r10 = kotlin.Unit.a
        L4f:
            if (r10 == r0) goto L6c
        L51:
            dap r10 = defpackage.dap.a
            r9.u = r3
            android.content.Context r10 = r4.getApplicationContext()
            cv6 r1 = bb7.a
            mr6 r1 = mr6.b
            wr r2 = new wr
            r2.<init>(r10, r5)
            java.lang.Object r9 = na2.Z(r1, r2, r9)
            if (r9 == r0) goto L6a
            kotlin.Unit r9 = kotlin.Unit.a
        L6a:
            if (r9 != r0) goto L6e
        L6c:
            r5 = r0
            goto L70
        L6e:
            kotlin.Unit r5 = kotlin.Unit.a
        L70:
            return r5
        L71:
            px5 r0 = px5.a
            byte r6 = r9.u
            if (r6 == 0) goto L83
            if (r6 == r2) goto L7f
            if (r6 == r3) goto L7f
            defpackage.qp2.n(r1)
            goto Lb3
        L7f:
            ybh.y(r10)
            goto L9e
        L83:
            ybh.y(r10)
            long r5 = defpackage.aap.f
            long r7 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5 - r7
            r7 = 0
            long r5 = java.lang.Math.max(r7, r5)
            defpackage.aap.b(r5, r2)
            r9.u = r2
            java.lang.Object r10 = nb6.p(r5, r9)
            if (r10 == r0) goto Lb2
        L9e:
            defpackage.aap.d(r4)
            z8p r10 = defpackage.aap.f()
            long r5 = r10.C
            defpackage.aap.b(r5, r2)
            r9.u = r3
            java.lang.Object r10 = nb6.p(r5, r9)
            if (r10 != r0) goto L9e
        Lb2:
            r5 = r0
        Lb3:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
