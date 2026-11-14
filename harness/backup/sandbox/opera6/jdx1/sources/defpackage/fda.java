package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class fda implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;

    public /* synthetic */ fda(String str, Function0 function0, Function0 function02, int i, byte b) {
        this.a = b;
        this.b = str;
        this.c = function0;
        this.d = function02;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        ih5 ih5Var = (ih5) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                y9m.l(this.b, this.c, this.d, ih5Var, aoh.m(1));
                break;
            default:
                qyn.b(this.b, this.c, this.d, ih5Var, aoh.m(1));
                break;
        }
        return Unit.a;
    }
}
