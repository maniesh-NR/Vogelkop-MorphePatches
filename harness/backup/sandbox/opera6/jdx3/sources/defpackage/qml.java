package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class qml implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rml b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ qml(rml rmlVar, Function1 function1, byte b) {
        this.a = b;
        this.b = rmlVar;
        this.c = function1;
    }

    public final Object invoke() {
        byte b = this.a;
        Function1 function1 = this.c;
        rml rmlVar = this.b;
        switch (b) {
            case 0:
                return ((umi) rmlVar.b).e(new o62(function1, (byte) 3));
            case 1:
                return ((umi) rmlVar.b).e(new pml(new ra(function1, (byte) 17), (byte) 2));
            default:
                return ((umi) rmlVar.b).f(new o62(function1, (byte) 5));
        }
    }
}
