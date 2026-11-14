package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class o76 extends kuk implements Function2 {
    public final /* synthetic */ byte t = 2;
    public boolean u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o76(mt5 mt5Var, t3d t3dVar, cd5 cd5Var, boolean z, boolean z2) {
        super(2, mt5Var);
        this.v = t3dVar;
        this.y = cd5Var;
        this.w = z;
        this.x = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o76(mt5 mt5Var, y5i y5iVar, boolean z, boolean z2, Function1 function1) {
        super(2, mt5Var);
        this.v = y5iVar;
        this.w = z;
        this.x = z2;
        this.y = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o76(y5i y5iVar, boolean z, boolean z2, Function1 function1, mt5 mt5Var) {
        super(2, mt5Var);
        this.v = y5iVar;
        this.w = z;
        this.x = z2;
        this.y = function1;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.y;
        Object obj3 = this.v;
        switch (b) {
            case 0:
                return new o76((y5i) obj3, this.w, this.x, (Function1) obj2, mt5Var);
            case 1:
                return new o76(mt5Var, (y5i) obj3, this.w, this.x, (Function1) obj2);
            default:
                return new o76(mt5Var, (t3d) obj3, (cd5) obj2, this.w, this.x);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        nx5 nx5Var = (nx5) obj;
        mt5 mt5Var = (mt5) obj2;
        switch (this.t) {
        }
        return create(nx5Var, mt5Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o76.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
