package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class wb3 extends j0i implements Function2 {
    public final /* synthetic */ byte u;
    public boolean v;
    public /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wb3(byte b, mt5 mt5Var, Object obj) {
        super(2, mt5Var);
        this.u = b;
        this.x = obj;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.u;
        Object obj2 = this.x;
        switch (b) {
            case 0:
                wb3 wb3Var = new wb3((byte) 0, mt5Var, (gmg) obj2);
                wb3Var.w = obj;
                return wb3Var;
            default:
                wb3 wb3Var2 = new wb3((byte) 1, mt5Var, (lw5) obj2);
                wb3Var2.w = obj;
                return wb3Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        uuk uukVar = (uuk) obj;
        mt5 mt5Var = (mt5) obj2;
        switch (this.u) {
            case 0:
                return create(uukVar, mt5Var).invokeSuspend(Unit.a);
            default:
                create(uukVar, mt5Var).invokeSuspend(Unit.a);
                return px5.a;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0031 -> B:14:0x0035). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            byte r0 = r6.u
            java.lang.Object r1 = r6.x
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            switch(r0) {
                case 0: goto L4b;
                default: goto Lb;
            }
        Lb:
            px5 r0 = px5.a
            boolean r5 = r6.v
            if (r5 == 0) goto L1f
            if (r5 != r4) goto L1b
            java.lang.Object r2 = r6.w
            uuk r2 = (defpackage.uuk) r2
            defpackage.ybh.y(r7)
            goto L35
        L1b:
            qp2.n(r3)
            goto L34
        L1f:
            defpackage.ybh.y(r7)
            java.lang.Object r7 = r6.w
            uuk r7 = (defpackage.uuk) r7
            r2 = r7
        L27:
            gmg r7 = defpackage.gmg.a
            r6.w = r2
            r6.v = r4
            java.lang.Object r7 = r2.a(r7, r6)
            if (r7 != r0) goto L35
            r2 = r0
        L34:
            return r2
        L35:
            fmg r7 = (defpackage.fmg) r7
            r3 = r1
            lw5 r3 = (defpackage.lw5) r3
            boolean r7 = defpackage.ezi.a(r7)
            r7 = r7 ^ r4
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            gbc r3 = r3.b
            t0g r3 = r3.q
            r3.setValue(r7)
            goto L27
        L4b:
            px5 r0 = px5.a
            boolean r5 = r6.v
            if (r5 == 0) goto L5c
            if (r5 != r4) goto L57
            defpackage.ybh.y(r7)
            goto L6e
        L57:
            qp2.n(r3)
            r7 = r2
            goto L6e
        L5c:
            defpackage.ybh.y(r7)
            java.lang.Object r7 = r6.w
            uuk r7 = (defpackage.uuk) r7
            gmg r1 = (defpackage.gmg) r1
            r6.v = r4
            java.lang.Object r7 = defpackage.xbl.i(r7, r1, r6)
            if (r7 != r0) goto L6e
            r7 = r0
        L6e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
