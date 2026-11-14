package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class whl extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public byte u;
    public final /* synthetic */ dil v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ whl(dil dilVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = dilVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        dil dilVar = this.v;
        switch (b) {
            case 0:
                whl whlVar = new whl(dilVar, mt5Var, (byte) 0);
                long j = ((y8f) obj).a;
                return whlVar;
            default:
                return new whl(dilVar, mt5Var, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                long j = ((y8f) obj).a;
                return new whl(this.v, (mt5) obj2, (byte) 0).invokeSuspend(Unit.a);
            default:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x034e, code lost:
    
        if (r2 == r1) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x042f, code lost:
    
        if (r0 == r4) goto L207;
     */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r56) {
        /*
            Method dump skipped, instructions count: 1084
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.whl.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
