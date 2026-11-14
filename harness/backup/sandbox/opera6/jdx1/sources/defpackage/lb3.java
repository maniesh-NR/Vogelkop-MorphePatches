package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class lb3 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sjl b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ lb3(sjl sjlVar, Function1 function1, byte b) {
        this.a = b;
        this.b = sjlVar;
        this.c = function1;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        Function1 function1 = this.c;
        sjl sjlVar = this.b;
        switch (b) {
            case 0:
                njl njlVar = (njl) obj;
                if (sjlVar != null) {
                    sjlVar.a.setValue(njlVar);
                }
                if (function1 != null) {
                    function1.invoke(njlVar);
                }
                return Unit.a;
            default:
                sjlVar.c.add(function1);
                return new rz2(sjlVar, function1, (byte) 5);
        }
    }
}
