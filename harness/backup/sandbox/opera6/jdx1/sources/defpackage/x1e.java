package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class x1e implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ e2e c;

    public /* synthetic */ x1e(Function1 function1, e2e e2eVar, byte b) {
        this.a = b;
        this.b = function1;
        this.c = e2eVar;
    }

    public final Object invoke() {
        byte b = this.a;
        e2e e2eVar = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(e2eVar);
                break;
            default:
                function1.invoke(e2eVar);
                break;
        }
        return Unit.a;
    }
}
