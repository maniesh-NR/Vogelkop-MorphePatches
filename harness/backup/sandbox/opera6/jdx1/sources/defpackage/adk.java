package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class adk extends kuk implements Function2 {
    public final /* synthetic */ cd5 A;
    public final /* synthetic */ cdk B;
    public zck t;
    public Object u;
    public cdk v;
    public byte w;
    public final /* synthetic */ ArrayList x;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adk(ArrayList arrayList, int i, int i2, cd5 cd5Var, cdk cdkVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.x = arrayList;
        this.y = i;
        this.z = i2;
        this.A = cd5Var;
        this.B = cdkVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        return new adk(this.x, this.y, this.z, this.A, this.B, mt5Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d A[PHI: r1
      0x009d: PHI (r1v2 zck) = (r1v1 zck), (r1v3 zck) binds: [B:14:0x0059, B:18:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adk.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
