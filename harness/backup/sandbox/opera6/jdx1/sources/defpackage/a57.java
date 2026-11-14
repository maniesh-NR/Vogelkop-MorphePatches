package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class a57 implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ c8e c;

    public /* synthetic */ a57(String str, c8e c8eVar, int i, byte b) {
        this.a = b;
        this.b = str;
        this.c = c8eVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        c8e c8eVar = this.c;
        String str = this.b;
        ih5 ih5Var = (ih5) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                aib.g(str, c8eVar, ih5Var, aoh.m(7));
                break;
            default:
                a26.b(str, c8eVar, ih5Var, aoh.m(49));
                break;
        }
        return Unit.a;
    }
}
