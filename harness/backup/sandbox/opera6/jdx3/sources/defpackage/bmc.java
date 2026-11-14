package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class bmc extends kuk implements Function1 {
    public final /* synthetic */ joc A;
    public final /* synthetic */ long B;
    public final /* synthetic */ boolean C;
    public pfe t;
    public gmc u;
    public joc v;
    public boolean w;
    public byte x;
    public final /* synthetic */ smc y;
    public final /* synthetic */ gmc z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bmc(smc smcVar, gmc gmcVar, joc jocVar, long j, boolean z, mt5 mt5Var) {
        super(1, mt5Var);
        this.y = smcVar;
        this.z = gmcVar;
        this.A = jocVar;
        this.B = j;
        this.C = z;
    }

    public final mt5 create(mt5 mt5Var) {
        return new bmc(this.y, this.z, this.A, this.B, this.C, mt5Var);
    }

    public final Object invoke(Object obj) {
        return create((mt5) obj).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b6, code lost:
    
        if (r2.i(r20) == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
