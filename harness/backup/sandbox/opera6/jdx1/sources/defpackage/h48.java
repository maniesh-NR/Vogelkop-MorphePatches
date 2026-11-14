package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class h48 extends ozb implements Function2 {
    public final /* synthetic */ b3m i;
    public final /* synthetic */ Function0 j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h48(b3m b3mVar, Function0 function0, int i) {
        super(2);
        this.i = b3mVar;
        this.j = function0;
        this.k = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM = aoh.m(this.k | 1);
        o48.a(this.i, this.j, (ih5) obj, iM);
        return Unit.a;
    }
}
