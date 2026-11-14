package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class loe extends ozb implements Function0 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ Function0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ loe(Function0 function0, byte b) {
        super(0);
        this.i = b;
        this.j = function0;
    }

    public final Object invoke() {
        byte b = this.i;
        Function0 function0 = this.j;
        switch (b) {
            case 0:
                function0.invoke();
                break;
            default:
                function0.invoke();
                break;
        }
        return Unit.a;
    }
}
