package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class xb3 extends j0i implements Function2 {
    public final /* synthetic */ ztl A;
    public nak u;
    public gmg v;
    public long w;
    public byte x;
    public /* synthetic */ Object y;
    public final /* synthetic */ nx5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb3(nx5 nx5Var, ztl ztlVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.z = nx5Var;
        this.A = ztlVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        xb3 xb3Var = new xb3(this.z, this.A, mt5Var);
        xb3Var.y = obj;
        return xb3Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((uuk) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6 A[Catch: all -> 0x00c2, TRY_LEAVE, TryCatch #0 {all -> 0x00c2, blocks: (B:8:0x0014, B:34:0x00b2, B:36:0x00b6), top: B:46:0x0014 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xb3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
