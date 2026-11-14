package defpackage;

import ads_mobile_sdk.cy0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public interface v7p extends zep {
    cy0 a();

    default Object b(Function2 function2, nt5 nt5Var) {
        Object objInvoke = function2.invoke(a(), nt5Var);
        return objInvoke == px5.a ? objInvoke : Unit.a;
    }
}
