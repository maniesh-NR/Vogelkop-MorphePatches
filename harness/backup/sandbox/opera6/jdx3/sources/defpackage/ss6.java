package defpackage;

import ads_mobile_sdk.fh2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ss6 extends kuk implements Function2 {
    public final /* synthetic */ byte t = 1;
    public byte u;
    public final /* synthetic */ long v;
    public Object w;
    public Object x;
    public Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss6(long j, fh2 fh2Var, mt5 mt5Var) {
        super(2, mt5Var);
        this.v = j;
        this.z = fh2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss6(ch9 ch9Var, vs6 vs6Var, long j, mt5 mt5Var) {
        super(2, mt5Var);
        this.z = ch9Var;
        this.x = vs6Var;
        this.v = j;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.z;
        switch (b) {
            case 0:
                return new ss6((ch9) obj2, (vs6) this.x, this.v, mt5Var);
            default:
                ss6 ss6Var = new ss6(this.v, (fh2) obj2, mt5Var);
                ss6Var.y = obj;
                return ss6Var;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
        }
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x010f, code lost:
    
        if (r9.g(r1, r14) != r10) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x015b, code lost:
    
        if (r9.c(r1, r15, r14) == r10) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0178, code lost:
    
        if (r9.g(r15, r14) == r10) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096 A[Catch: all -> 0x009f, TryCatch #0 {all -> 0x009f, blocks: (B:26:0x0084, B:28:0x0096, B:29:0x0098), top: B:79:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ss6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
