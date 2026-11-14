package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class jho extends kuk implements Function2 {
    public final /* synthetic */ byte t = 0;
    public /* synthetic */ Object u;
    public final /* synthetic */ Context v;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jho(Context context, mt5 mt5Var) {
        super(2, mt5Var);
        this.v = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jho(Context context, boolean z, mt5 mt5Var) {
        super(2, mt5Var);
        this.v = context;
        this.w = z;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        switch (this.t) {
            case 0:
                jho jhoVar = new jho(this.v, mt5Var);
                jhoVar.u = obj;
                return jhoVar;
            default:
                jho jhoVar2 = new jho(this.v, this.w, mt5Var);
                jhoVar2.u = obj;
                return jhoVar2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
        }
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jho.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
