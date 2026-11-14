package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class n76 extends kuk implements Function2 {
    public final /* synthetic */ Function1 A;
    public final /* synthetic */ byte t;
    public s1m u;
    public byte v;
    public /* synthetic */ Object w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ y5i z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n76(boolean z, boolean z2, y5i y5iVar, mt5 mt5Var, Function1 function1, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.x = z;
        this.y = z2;
        this.z = y5iVar;
        this.A = function1;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        switch (this.t) {
            case 0:
                n76 n76Var = new n76(this.x, this.y, this.z, mt5Var, this.A, (byte) 0);
                n76Var.w = obj;
                return n76Var;
            default:
                n76 n76Var2 = new n76(this.x, this.y, this.z, mt5Var, this.A, (byte) 1);
                n76Var2.w = obj;
                return n76Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        j3g j3gVar = (j3g) obj;
        mt5 mt5Var = (mt5) obj2;
        switch (this.t) {
        }
        return create(j3gVar, mt5Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        if (r14.c(r13) != r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x013b, code lost:
    
        if (r14.c(r13) != r0) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c A[PHI: r1 r14
      0x009c: PHI (r1v22 j3g) = (r1v19 j3g), (r1v26 j3g) binds: [B:34:0x009a, B:12:0x002e] A[DONT_GENERATE, DONT_INLINE]
      0x009c: PHI (r14v37 java.lang.Object) = (r14v35 java.lang.Object), (r14v0 java.lang.Object) binds: [B:34:0x009a, B:12:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0155 A[PHI: r1 r14
      0x0155: PHI (r1v9 j3g) = (r1v6 j3g), (r1v13 j3g) binds: [B:80:0x0153, B:58:0x00e6] A[DONT_GENERATE, DONT_INLINE]
      0x0155: PHI (r14v16 java.lang.Object) = (r14v14 java.lang.Object), (r14v0 java.lang.Object) binds: [B:80:0x0153, B:58:0x00e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n76.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
