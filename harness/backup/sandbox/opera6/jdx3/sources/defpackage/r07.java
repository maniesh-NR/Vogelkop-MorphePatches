package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class r07 extends kuk implements Function2 {
    public final /* synthetic */ byte t = 2;
    public byte u;
    public boolean v;
    public /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r07(int i, mt5 mt5Var) {
        super(2, mt5Var);
        avj avjVar = cak.d;
        this.u = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r07(u07 u07Var, mt5 mt5Var, int i) {
        super(2, mt5Var);
        this.w = u07Var;
        this.u = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r07(x4i x4iVar, boolean z, mt5 mt5Var) {
        super(2, mt5Var);
        this.w = x4iVar;
        this.v = z;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        switch (this.t) {
            case 0:
                return new r07((u07) this.w, mt5Var, this.u);
            case 1:
                return new r07((x4i) this.w, this.v, mt5Var);
            default:
                avj avjVar = cak.d;
                r07 r07Var = new r07(this.u, mt5Var);
                r07Var.w = obj;
                return r07Var;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        nx5 nx5Var = (nx5) obj;
        mt5 mt5Var = (mt5) obj2;
        switch (this.t) {
        }
        return create(nx5Var, mt5Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009a, code lost:
    
        if (r10 != r6) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00af, code lost:
    
        if (r9 != r6) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r07.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
