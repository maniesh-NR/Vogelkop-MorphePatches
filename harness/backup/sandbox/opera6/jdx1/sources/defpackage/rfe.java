package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class rfe extends nr9 implements Function2 {
    public static final rfe a = new rfe(2, sfe.class, "lockWithoutOwner", "lockWithoutOwner(Lkotlinx/coroutines/sync/Mutex;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);

    public final Object invoke(Object obj, Object obj2) {
        Object objI = ((pfe) obj).i((mt5) obj2);
        return objI == px5.a ? objI : Unit.a;
    }
}
