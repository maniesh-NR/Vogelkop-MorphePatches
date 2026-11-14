package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class m48 extends ozb implements Function1 {
    public final /* synthetic */ boolean i;
    public final /* synthetic */ Function0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m48(boolean z, Function0 function0) {
        super(1);
        this.i = z;
        this.j = function0;
    }

    public final Object invoke(Object obj) {
        ((m1i) obj).f(!this.i && ((Boolean) this.j.invoke()).booleanValue());
        return Unit.a;
    }
}
