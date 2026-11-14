package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class v0a implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ c8e d;
    public final /* synthetic */ int e;

    public /* synthetic */ v0a(Function0 function0, Function0 function02, c8e c8eVar, int i, byte b) {
        this.a = b;
        this.b = function0;
        this.c = function02;
        this.d = c8eVar;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        ih5 ih5Var = (ih5) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                wyh.d(this.b, this.c, this.d, ih5Var, aoh.m(this.e | 1));
                break;
            default:
                b9k.b(this.b, this.c, this.d, ih5Var, aoh.m(this.e | 1));
                break;
        }
        return Unit.a;
    }
}
