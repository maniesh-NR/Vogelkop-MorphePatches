package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class t51 extends j0i implements Function2 {
    public final /* synthetic */ byte u;
    public byte v;
    public /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t51(byte b, mt5 mt5Var, Object obj) {
        super(2, mt5Var);
        this.u = b;
        this.x = obj;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.u;
        Object obj2 = this.x;
        switch (b) {
            case 0:
                t51 t51Var = new t51((byte) 0, mt5Var, (v51) obj2);
                t51Var.w = obj;
                return t51Var;
            case 1:
                t51 t51Var2 = new t51((byte) 1, mt5Var, (zb7) obj2);
                t51Var2.w = obj;
                return t51Var2;
            default:
                t51 t51Var3 = new t51((byte) 2, mt5Var, (Function1) obj2);
                t51Var3.w = obj;
                return t51Var3;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        uuk uukVar = (uuk) obj;
        mt5 mt5Var = (mt5) obj2;
        switch (this.u) {
        }
        return create(uukVar, mt5Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        if (r13 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009d, code lost:
    
        if (r13 == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00de, code lost:
    
        if (r13 != r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f4, code lost:
    
        if (r13 != r0) goto L51;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00f4 -> B:51:0x00f8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t51.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
