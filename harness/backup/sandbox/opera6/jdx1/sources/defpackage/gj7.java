package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class gj7 extends j0i implements Function2 {
    public final /* synthetic */ br9 A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ byte u = 0;
    public byte v;
    public /* synthetic */ Object w;
    public Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ br9 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj7(ki5 ki5Var, j04 j04Var, a7b a7bVar, a1d a1dVar, wg5 wg5Var, mt5 mt5Var) {
        super(2, mt5Var);
        this.x = ki5Var;
        this.y = j04Var;
        this.z = a7bVar;
        this.A = a1dVar;
        this.B = wg5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj7(nx5 nx5Var, rhl rhlVar, gb1 gb1Var, lwg lwgVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.y = nx5Var;
        this.z = rhlVar;
        this.A = gb1Var;
        this.B = lwgVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.u;
        Object obj2 = this.B;
        br9 br9Var = this.A;
        rhl rhlVar = this.z;
        Object obj3 = this.y;
        switch (b) {
            case 0:
                gj7 gj7Var = new gj7((ki5) this.x, (j04) obj3, (a7b) rhlVar, (a1d) br9Var, (wg5) obj2, mt5Var);
                gj7Var.w = obj;
                return gj7Var;
            default:
                gj7 gj7Var2 = new gj7((nx5) obj3, rhlVar, (gb1) br9Var, (lwg) obj2, mt5Var);
                gj7Var2.w = obj;
                return gj7Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        uuk uukVar = (uuk) obj;
        mt5 mt5Var = (mt5) obj2;
        switch (this.u) {
        }
        return create(uukVar, mt5Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fc, code lost:
    
        if (defpackage.i41.d0(r0, (defpackage.lmg) r3, (ki5) r17.x, (j04) r6, (a7b) r2, (defpackage.a1d) r1, (wg5) r4, r17) == r11) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gj7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
