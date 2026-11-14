package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class zlc extends kuk implements Function1 {
    public final /* synthetic */ byte t;
    public byte u;
    public final /* synthetic */ byte v;
    public final /* synthetic */ gmc w;
    public final /* synthetic */ long x;
    public final /* synthetic */ apc y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ zlc(int i, gmc gmcVar, long j, apc apcVar, mt5 mt5Var, byte b) {
        super(1, mt5Var);
        this.t = b;
        this.v = i;
        this.w = gmcVar;
        this.x = j;
        this.y = apcVar;
    }

    public final mt5 create(mt5 mt5Var) {
        switch (this.t) {
            case 0:
                return new zlc(this.v, this.w, this.x, this.y, mt5Var, (byte) 0);
            default:
                return new zlc(this.v, this.w, this.x, this.y, mt5Var, (byte) 1);
        }
    }

    public final Object invoke(Object obj) {
        mt5 mt5Var = (mt5) obj;
        switch (this.t) {
        }
        return create(mt5Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        if (kfo.a0(r13, r14.a, false, true, new defpackage.slc(r14, r1, r10)) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (kfo.a0(r13, r14.a, false, true, new defpackage.qlc(r14, r1, r11)) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008c, code lost:
    
        if (kfo.a0(r13, r14.a, false, true, new defpackage.tlc(r14, r1, r10)) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ce, code lost:
    
        if (kfo.a0(r13, r14.a, false, true, new defpackage.slc(r14, r1, r11)) == r0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ee, code lost:
    
        if (kfo.a0(r13, r14.a, false, true, new defpackage.qlc(r14, r1, r10)) == r0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010e, code lost:
    
        if (kfo.a0(r13, r14.a, false, true, new defpackage.tlc(r14, r1, r11)) == r0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zlc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
