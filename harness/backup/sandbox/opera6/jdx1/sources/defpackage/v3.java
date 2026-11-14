package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class v3 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public byte u;
    public final /* synthetic */ lde v;
    public final /* synthetic */ nwg w;
    public final /* synthetic */ y3 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v3(lde ldeVar, nwg nwgVar, y3 y3Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = ldeVar;
        this.w = nwgVar;
        this.x = y3Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        switch (this.t) {
            case 0:
                return new v3(this.v, this.w, this.x, mt5Var, (byte) 0);
            default:
                return new v3(this.v, this.w, this.x, mt5Var, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        nx5 nx5Var = (nx5) obj;
        mt5 mt5Var = (mt5) obj2;
        switch (this.t) {
        }
        return create(nx5Var, mt5Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r2.a(r7, r9) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
    
        if (r2.a(r7, r9) == r0) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            byte r0 = r9.t
            y3 r1 = r9.x
            lde r2 = r9.v
            r3 = 0
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 1
            r6 = 2
            nwg r7 = r9.w
            switch(r0) {
                case 0: goto L42;
                default: goto L10;
            }
        L10:
            px5 r0 = px5.a
            byte r8 = r9.u
            if (r8 == 0) goto L26
            if (r8 == r5) goto L22
            if (r8 != r6) goto L1e
            defpackage.ybh.y(r10)
            goto L3d
        L1e:
            qp2.n(r4)
            goto L41
        L22:
            defpackage.ybh.y(r10)
            goto L33
        L26:
            defpackage.ybh.y(r10)
            long r3 = defpackage.c45.a
            r9.u = r5
            java.lang.Object r10 = defpackage.nb6.p(r3, r9)
            if (r10 == r0) goto L3b
        L33:
            r9.u = r6
            java.lang.Object r9 = r2.a(r7, r9)
            if (r9 != r0) goto L3d
        L3b:
            r3 = r0
            goto L41
        L3d:
            r1.C = r7
            kotlin.Unit r3 = kotlin.Unit.a
        L41:
            return r3
        L42:
            px5 r0 = px5.a
            byte r8 = r9.u
            if (r8 == 0) goto L58
            if (r8 == r5) goto L54
            if (r8 != r6) goto L50
            defpackage.ybh.y(r10)
            goto L6f
        L50:
            qp2.n(r4)
            goto L73
        L54:
            defpackage.ybh.y(r10)
            goto L65
        L58:
            defpackage.ybh.y(r10)
            long r3 = defpackage.c45.a
            r9.u = r5
            java.lang.Object r10 = defpackage.nb6.p(r3, r9)
            if (r10 == r0) goto L6d
        L65:
            r9.u = r6
            java.lang.Object r9 = r2.a(r7, r9)
            if (r9 != r0) goto L6f
        L6d:
            r3 = r0
            goto L73
        L6f:
            r1.G = r7
            kotlin.Unit r3 = kotlin.Unit.a
        L73:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
