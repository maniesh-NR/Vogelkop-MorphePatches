package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class g14 extends kuk implements Function2 {
    public Object A;
    public Object B;
    public Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ byte t = 0;
    public int u;
    public int v;
    public int w;
    public byte x;
    public Object y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g14(yqa yqaVar, cd5 cd5Var, mt5 mt5Var) {
        super(2, mt5Var);
        this.z = yqaVar;
        this.D = cd5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g14(c7f[] c7fVarArr, g7m g7mVar, j3g j3gVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.B = c7fVarArr;
        this.C = g7mVar;
        this.D = j3gVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.D;
        switch (b) {
            case 0:
                return new g14((yqa) this.z, (cd5) obj2, mt5Var);
            default:
                return new g14((c7f[]) this.B, (g7m) this.C, (j3g) obj2, mt5Var);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            default:
                return create((g3g) obj, (mt5) obj2).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0087, code lost:
    
        r2 = r5;
        r5 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0081, code lost:
    
        if (r8.l(r7, r15, r14) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01eb, code lost:
    
        if (r14 != r0) goto L97;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013f A[Catch: all -> 0x01fc, TryCatch #5 {all -> 0x01fc, blocks: (B:56:0x013b, B:58:0x013f, B:61:0x016c, B:65:0x017c), top: B:106:0x013b }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016c A[Catch: all -> 0x01fc, TRY_LEAVE, TryCatch #5 {all -> 0x01fc, blocks: (B:56:0x013b, B:58:0x013f, B:61:0x016c, B:65:0x017c), top: B:106:0x013b }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a0 A[Catch: all -> 0x01fa, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x01fa, blocks: (B:42:0x00ee, B:69:0x01a0, B:79:0x01f2, B:80:0x01f9), top: B:102:0x00ee }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f2 A[Catch: all -> 0x01fa, TRY_ENTER, TryCatch #3 {all -> 0x01fa, blocks: (B:42:0x00ee, B:69:0x01a0, B:79:0x01f2, B:80:0x01f9), top: B:102:0x00ee }] */
    /* JADX WARN: Type inference failed for: r14v0, types: [g14, mt5, nt5] */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v4, types: [g14, mt5] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v34 */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r15v36 */
    /* JADX WARN: Type inference failed for: r15v7, types: [fr6, java.lang.Object, nx5] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r5v19, types: [fr6] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [byte] */
    /* JADX WARN: Type inference failed for: r7v1, types: [yqa] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x008a -> B:26:0x008b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g14.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
