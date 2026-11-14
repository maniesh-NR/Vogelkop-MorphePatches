package ads_mobile_sdk;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class it2 extends kuk implements Function2 {
    public zm1 a;
    public ArrayList b;
    public n13 c;
    public a2 d;
    public Integer e;
    public byte f;
    public final /* synthetic */ mt2 g;
    public final /* synthetic */ ArrayList h;
    public final /* synthetic */ a2 i;
    public final /* synthetic */ long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public it2(mt2 mt2Var, ArrayList arrayList, a2 a2Var, long j, mt5 mt5Var) {
        super(2, mt5Var);
        this.g = mt2Var;
        this.h = arrayList;
        this.i = a2Var;
        this.j = j;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        return new it2(this.g, this.h, this.i, this.j, mt5Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0090, code lost:
    
        if (r0 == r13) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 179
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.it2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
