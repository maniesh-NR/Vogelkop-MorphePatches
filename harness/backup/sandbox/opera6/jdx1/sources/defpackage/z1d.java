package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class z1d extends kuk implements Function2 {
    public boolean t;
    public final /* synthetic */ unb u;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;
    public final /* synthetic */ e2d x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1d(unb unbVar, int i, int i2, e2d e2dVar, mt5 mt5Var) {
        super(2, mt5Var);
        o2d[] o2dVarArr = o2d.a;
        this.u = unbVar;
        this.v = i;
        this.w = i2;
        this.x = e2dVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        o2d[] o2dVarArr = o2d.a;
        return new z1d(this.u, this.v, this.w, this.x, mt5Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            px5 r0 = px5.a
            boolean r1 = r5.t
            r2 = 1
            if (r1 == 0) goto L14
            if (r1 != r2) goto Ld
            defpackage.ybh.y(r6)
            goto L56
        Ld:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            r5 = 0
            return r5
        L14:
            defpackage.ybh.y(r6)
        L17:
            o2d[] r6 = defpackage.o2d.a
            int[] r6 = defpackage.y1d.a
            r1 = 0
            r6 = r6[r1]
            int r3 = r5.v
            if (r6 != r2) goto L2c
            unb r6 = r5.u
            boolean r6 = r6.isActive()
            if (r6 != 0) goto L2c
            int r3 = r5.w
        L2c:
            r5.t = r2
            e2d r6 = r5.x
            r6.getClass()
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r3 != r4) goto L42
            b2d r4 = new b2d
            r4.<init>(r6, r3, r1)
            java.lang.Object r6 = defpackage.z5i.D0(r4, r5)
            goto L53
        L42:
            b2d r1 = new b2d
            r1.<init>(r6, r3, r2)
            kotlin.coroutines.CoroutineContext r6 = r5.getContext()
            d9e r6 = defpackage.zi4.C(r6)
            java.lang.Object r6 = r6.t(r1, r5)
        L53:
            if (r6 != r0) goto L56
            return r0
        L56:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L17
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z1d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
