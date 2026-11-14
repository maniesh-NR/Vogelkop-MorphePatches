package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class lfe extends kuk implements Function2 {
    public Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ byte t = 0;
    public byte u;
    public Object v;
    public Object w;
    public Object x;
    public Object y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lfe(gfe gfeVar, mfe mfeVar, Function2 function2, Object obj, mt5 mt5Var) {
        super(2, mt5Var);
        this.C = gfeVar;
        this.B = mfeVar;
        this.D = function2;
        this.z = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lfe(v04 v04Var, CoroutineContext coroutineContext, ami amiVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.B = v04Var;
        this.C = coroutineContext;
        this.D = amiVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.D;
        Object obj3 = this.C;
        Object obj4 = this.B;
        switch (b) {
            case 0:
                lfe lfeVar = new lfe((gfe) obj3, (mfe) obj4, (Function2) obj2, this.z, mt5Var);
                lfeVar.y = obj;
                return lfeVar;
            default:
                lfe lfeVar2 = new lfe((v04) obj4, (CoroutineContext) obj3, (ami) obj2, mt5Var);
                lfeVar2.v = obj;
                return lfeVar2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            default:
                return create((d8o) obj, (mt5) obj2).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c4, code lost:
    
        if (r11.c(r17) != r9) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v1, types: [byte] */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, pfe] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00c4 -> B:30:0x00c8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lfe.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
