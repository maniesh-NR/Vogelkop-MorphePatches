package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class nba extends kuk implements Function2 {
    public final /* synthetic */ afe A;
    public final /* synthetic */ dg5 B;
    public final /* synthetic */ hba C;
    public final /* synthetic */ qs3 D;
    public cd1 t;
    public byte u;
    public int v;
    public int w;
    public byte x;
    public /* synthetic */ Object y;
    public final /* synthetic */ cd1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nba(cd1 cd1Var, afe afeVar, dg5 dg5Var, hba hbaVar, qs3 qs3Var, mt5 mt5Var) {
        super(2, mt5Var);
        this.z = cd1Var;
        this.A = afeVar;
        this.B = dg5Var;
        this.C = hbaVar;
        this.D = qs3Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        nba nbaVar = new nba(this.z, this.A, this.B, this.C, this.D, mt5Var);
        nbaVar.y = obj;
        return nbaVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0091, code lost:
    
        if (defpackage.mkh.C(r0, r14, r2, r10, r13) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00dd, code lost:
    
        if (defpackage.cd1.a(r10, r11, r12, r13, 12) != r1) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x011b, code lost:
    
        if (defpackage.cd1.a(r3, r14, r0, r13, 12) != r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0107  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00dd -> B:10:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws m2 {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nba.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
