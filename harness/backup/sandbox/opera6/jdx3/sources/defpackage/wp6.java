package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class wp6 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public /* synthetic */ Object v;
    public final /* synthetic */ cq6 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wp6(cq6 cq6Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.w = cq6Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        cq6 cq6Var = this.w;
        switch (b) {
            case 0:
                wp6 wp6Var = new wp6(cq6Var, mt5Var, (byte) 0);
                wp6Var.v = obj;
                return wp6Var;
            case 1:
                wp6 wp6Var2 = new wp6(cq6Var, mt5Var, (byte) 1);
                wp6Var2.v = obj;
                return wp6Var2;
            case 2:
                wp6 wp6Var3 = new wp6(cq6Var, mt5Var, (byte) 2);
                wp6Var3.v = obj;
                return wp6Var3;
            case 3:
                wp6 wp6Var4 = new wp6(cq6Var, mt5Var, (byte) 3);
                wp6Var4.v = obj;
                return wp6Var4;
            case 4:
                wp6 wp6Var5 = new wp6(cq6Var, mt5Var, (byte) 4);
                wp6Var5.v = obj;
                return wp6Var5;
            default:
                wp6 wp6Var6 = new wp6(cq6Var, mt5Var, (byte) 5);
                wp6Var6.v = obj;
                return wp6Var6;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                return create((List) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 1:
                return create((List) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 2:
                return create((Map) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 3:
                return create((List) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 4:
                return create((l99) obj, (mt5) obj2).invokeSuspend(Unit.a);
            default:
                return create((List) obj, (mt5) obj2).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1026
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wp6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
