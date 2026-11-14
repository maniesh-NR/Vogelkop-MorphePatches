package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ej7 extends j0i implements Function2 {
    public final /* synthetic */ pqh A;
    public fmg u;
    public boolean v;
    public byte w;
    public /* synthetic */ Object x;
    public final /* synthetic */ lqh y;
    public final /* synthetic */ pqh z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej7(lqh lqhVar, pqh pqhVar, pqh pqhVar2, mt5 mt5Var) {
        super(2, mt5Var);
        this.y = lqhVar;
        this.z = pqhVar;
        this.A = pqhVar2;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        ej7 ej7Var = new ej7(this.y, this.z, this.A, mt5Var);
        ej7Var.x = obj;
        return ej7Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((uuk) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d3 A[EDGE_INSN: B:64:0x00d3->B:42:0x00d3 BREAK  A[LOOP:0: B:37:0x00c0->B:41:0x00d0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b1 -> B:36:0x00b4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ej7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
