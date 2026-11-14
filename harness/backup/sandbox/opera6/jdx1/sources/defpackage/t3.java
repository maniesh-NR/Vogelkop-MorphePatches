package defpackage;

import com.opera.api.Callback;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class t3 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public long u;
    public byte v;
    public Object w;
    public Object x;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t3(byte b, long j, mt5 mt5Var, Object obj) {
        super(2, mt5Var);
        this.t = b;
        this.u = j;
        this.y = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(e2f e2fVar, joc jocVar, long j, Callback callback, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 3;
        this.w = e2fVar;
        this.x = jocVar;
        this.u = j;
        this.y = callback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t3(Object obj, long j, lde ldeVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.x = obj;
        this.u = j;
        this.y = ldeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(mg6 mg6Var, ggb ggbVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 1;
        this.x = mg6Var;
        this.y = ggbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(mg6 mg6Var, ggb ggbVar, byte[] bArr, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 2;
        this.w = mg6Var;
        this.x = ggbVar;
        this.y = bArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(pfl pflVar, long j, ufl uflVar, ofl oflVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 4;
        this.w = pflVar;
        this.u = j;
        this.x = uflVar;
        this.y = oflVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.y;
        switch (b) {
            case 0:
                return new t3(this.x, this.u, (lde) obj2, mt5Var, (byte) 0);
            case 1:
                return new t3((mg6) this.x, (ggb) obj2, mt5Var);
            case 2:
                return new t3((mg6) this.w, (ggb) this.x, (byte[]) obj2, mt5Var);
            case 3:
                return new t3((e2f) this.w, (joc) this.x, this.u, (Callback) obj2, mt5Var);
            case 4:
                return new t3((pfl) this.w, this.u, (ufl) this.x, (ofl) obj2, mt5Var);
            case 5:
                return new t3(this.x, this.u, (lde) obj2, mt5Var, (byte) 5);
            case 6:
                return new t3((byte) 6, this.u, mt5Var, obj2);
            default:
                return new t3((byte) 7, this.u, mt5Var, obj2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        Object obj3 = this.y;
        switch (b) {
            case 0:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 1:
                return create((yuk) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 2:
                return create((yuk) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 3:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 4:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 5:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 6:
                return new t3((byte) 6, this.u, (mt5) obj2, obj3).invokeSuspend(Unit.a);
            default:
                return new t3((byte) 7, this.u, (mt5) obj2, obj3).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x023d, code lost:
    
        if (r0.S0(r10, r18) != r1) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02ac, code lost:
    
        if (r1 != r10) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02ce, code lost:
    
        if (r0.e(r1, r2, r3, r18) == r10) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0327, code lost:
    
        if (r7.a(r1, r18) != r0) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f2, code lost:
    
        if (r7.a(r4, r18) != r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0153, code lost:
    
        if (((defpackage.ufl) r18.x).a((defpackage.ofl) r7, r18) == r0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a7, code lost:
    
        if (defpackage.na2.Z(r1, r2, r18) == r6) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0101  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:135:0x02ce -> B:137:0x02d2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws m2 {
        /*
            Method dump skipped, instructions count: 832
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
