package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class us6 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public byte u;
    public final /* synthetic */ long v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ us6(byte b, long j, mt5 mt5Var, Object obj) {
        super(2, mt5Var);
        this.t = b;
        this.w = obj;
        this.v = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us6(long j, uuk uukVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 3;
        this.v = j;
        this.w = uukVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us6(gmc gmcVar, long j, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 1;
        ix5 ix5Var = apc.b;
        this.w = gmcVar;
        this.v = j;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        long j = this.v;
        Object obj2 = this.w;
        switch (b) {
            case 0:
                return new us6((byte) 0, this.v, mt5Var, (vs6) obj2);
            case 1:
                ix5 ix5Var = apc.b;
                return new us6((gmc) obj2, j, mt5Var);
            case 2:
                return new us6((byte) 2, this.v, mt5Var, (sze) obj2);
            default:
                return new us6(j, (uuk) obj2, mt5Var);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        nx5 nx5Var = (nx5) obj;
        mt5 mt5Var = (mt5) obj2;
        switch (this.t) {
        }
        return create(nx5Var, mt5Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (nb6.p(8, r11) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        if (r2.b(r12, r11) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a4, code lost:
    
        if (r12 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ae, code lost:
    
        if (r12 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d2, code lost:
    
        if (r12 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0113, code lost:
    
        if (r2.c(r7, r12, r11) == r0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x011e, code lost:
    
        if (r2.c(r7, r12, r11) == r0) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.us6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
