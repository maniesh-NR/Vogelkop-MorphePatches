package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class bj9 extends j0i implements Function2 {
    public final /* synthetic */ byte u;
    public byte v;
    public /* synthetic */ Object w;
    public Object x;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bj9(Object obj, Object obj2, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.u = b;
        this.x = obj;
        this.y = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj9(mgl mglVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.u = (byte) 1;
        this.y = mglVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.u;
        Object obj2 = this.y;
        switch (b) {
            case 0:
                bj9 bj9Var = new bj9((CoroutineContext) this.x, (Function2) obj2, mt5Var, (byte) 0);
                bj9Var.w = obj;
                return bj9Var;
            case 1:
                bj9 bj9Var2 = new bj9((mgl) obj2, mt5Var);
                bj9Var2.w = obj;
                return bj9Var2;
            case 2:
                bj9 bj9Var3 = new bj9((gmg) this.x, (pqh) obj2, mt5Var, (byte) 2);
                bj9Var3.w = obj;
                return bj9Var3;
            default:
                bj9 bj9Var4 = new bj9((d82) this.x, (Pair) obj2, mt5Var, (byte) 3);
                bj9Var4.w = obj;
                return bj9Var4;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.u) {
            case 0:
                return create((uuk) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 1:
                return create((uuk) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 2:
                return create((uuk) obj, (mt5) obj2).invokeSuspend(Unit.a);
            default:
                return create((l1j) obj, (mt5) obj2).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e9, code lost:
    
        if (r7 == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0157, code lost:
    
        if (r5 != r0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0171, code lost:
    
        if (r7 != r0) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0091 A[PHI: r4 r7
      0x0091: PHI (r4v21 uuk) = (r4v22 uuk), (r4v25 uuk) binds: [B:25:0x008f, B:22:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0091: PHI (r7v14 java.lang.Object) = (r7v24 java.lang.Object), (r7v29 java.lang.Object) binds: [B:25:0x008f, B:22:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d8 A[PHI: r4
      0x01d8: PHI (r4v3 ??) = (r4v34 ??), (r4v35 ??), (r4v4 ??), (r4v36 ??) binds: [B:102:0x0209, B:96:0x01f5, B:90:0x01d7, B:84:0x01c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01de A[Catch: CancellationException -> 0x01f8, TRY_ENTER, TryCatch #0 {CancellationException -> 0x01f8, blocks: (B:93:0x01de, B:95:0x01eb, B:84:0x01c3, B:87:0x01cc), top: B:107:0x01aa }] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x0209 -> B:91:0x01d8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00e9 -> B:44:0x00ed). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0171 -> B:67:0x0175). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x01f5 -> B:91:0x01d8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bj9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
