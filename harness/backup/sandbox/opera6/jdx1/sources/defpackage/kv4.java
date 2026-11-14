package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class kv4 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ kv4(Function1 function1, boolean z, byte b) {
        this.a = b;
        this.b = function1;
        this.c = z;
    }

    public final Object invoke() {
        byte b = this.a;
        boolean z = this.c;
        Function1 function1 = this.b;
        boolean z2 = !z;
        switch (b) {
            case 0:
                function1.invoke(Boolean.valueOf(z2));
                break;
            default:
                function1.invoke(Boolean.valueOf(z2));
                break;
        }
        return Unit.a;
    }
}
