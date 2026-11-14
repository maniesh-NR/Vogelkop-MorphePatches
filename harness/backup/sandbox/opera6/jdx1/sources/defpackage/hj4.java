package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class hj4 extends kuk implements Function2 {
    public final /* synthetic */ byte t = 0;
    public byte u;
    public final /* synthetic */ int v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj4(List list, mt5 mt5Var, rj4 rj4Var, int i) {
        super(2, mt5Var);
        this.w = list;
        this.x = rj4Var;
        this.v = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj4(u6c u6cVar, int i, ndf ndfVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.w = u6cVar;
        this.v = i;
        this.x = ndfVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.x;
        int i = this.v;
        Object obj3 = this.w;
        switch (b) {
            case 0:
                return new hj4((List) obj3, mt5Var, (rj4) obj2, i);
            default:
                return new hj4((u6c) obj3, i, (ndf) obj2, mt5Var);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        nx5 nx5Var = (nx5) obj;
        mt5 mt5Var = (mt5) obj2;
        switch (this.t) {
        }
        return create(nx5Var, mt5Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        if (defpackage.z7h.d(r6, r10, r1, r9) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        if (r6.f(r7, r9) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        if (((defpackage.rj4) r1).i(r7, r9) == r0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            byte r0 = r9.t
            java.lang.Object r1 = r9.x
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            r5 = 2
            java.lang.Object r6 = r9.w
            int r7 = r9.v
            switch(r0) {
                case 0: goto L4c;
                default: goto L10;
            }
        L10:
            u6c r6 = (defpackage.u6c) r6
            px5 r0 = px5.a
            byte r8 = r9.u
            if (r8 == 0) goto L24
            if (r8 == r4) goto L20
            if (r8 == r5) goto L20
            qp2.n(r3)
            goto L4b
        L20:
            defpackage.ybh.y(r10)
            goto L49
        L24:
            defpackage.ybh.y(r10)
            int r10 = defpackage.fr3.n(r6)
            if (r10 < 0) goto L3f
            int r7 = r7 - r10
            float r10 = (float) r7
            ndf r1 = (defpackage.ndf) r1
            float r1 = r1.d
            float r10 = r10 * r1
            e8m r1 = defpackage.gef.a
            r9.u = r4
            java.lang.Object r9 = defpackage.z7h.d(r6, r10, r1, r9)
            if (r9 != r0) goto L49
            goto L47
        L3f:
            r9.u = r5
            java.lang.Object r9 = r6.f(r7, r9)
            if (r9 != r0) goto L49
        L47:
            r2 = r0
            goto L4b
        L49:
            kotlin.Unit r2 = kotlin.Unit.a
        L4b:
            return r2
        L4c:
            px5 r0 = px5.a
            byte r8 = r9.u
            if (r8 == 0) goto L62
            if (r8 == r4) goto L5e
            if (r8 != r5) goto L5a
            defpackage.ybh.y(r10)
            goto L7d
        L5a:
            qp2.n(r3)
            goto L7f
        L5e:
            defpackage.ybh.y(r10)
            goto L71
        L62:
            defpackage.ybh.y(r10)
            java.util.List r6 = (java.util.List) r6
            java.util.Collection r6 = (java.util.Collection) r6
            r9.u = r4
            java.lang.Object r10 = defpackage.cs5.b0(r6, r9)
            if (r10 == r0) goto L7b
        L71:
            rj4 r1 = (defpackage.rj4) r1
            r9.u = r5
            java.lang.Object r9 = r1.i(r7, r9)
            if (r9 != r0) goto L7d
        L7b:
            r2 = r0
            goto L7f
        L7d:
            kotlin.Unit r2 = kotlin.Unit.a
        L7f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hj4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
