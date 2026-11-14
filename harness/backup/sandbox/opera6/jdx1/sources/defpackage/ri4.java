package defpackage;

import android.app.Application;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ri4 extends kuk implements Function2 {
    public final /* synthetic */ byte t = 1;
    public byte u;
    public final /* synthetic */ List v;
    public final /* synthetic */ int w;
    public /* synthetic */ Object x;
    public Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri4(List list, int i, Application application, mt5 mt5Var) {
        super(2, mt5Var);
        this.v = list;
        this.w = i;
        this.y = application;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri4(List list, mt5 mt5Var, rj4 rj4Var, int i) {
        super(2, mt5Var);
        this.v = list;
        this.x = rj4Var;
        this.w = i;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        int i = this.w;
        List list = this.v;
        switch (b) {
            case 0:
                return new ri4(list, mt5Var, (rj4) this.x, i);
            default:
                ri4 ri4Var = new ri4(list, i, (Application) this.y, mt5Var);
                ri4Var.x = obj;
                return ri4Var;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
        }
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
    
        if (r9 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0097, code lost:
    
        if (oio.a(r9, r1, r8) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ri4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
