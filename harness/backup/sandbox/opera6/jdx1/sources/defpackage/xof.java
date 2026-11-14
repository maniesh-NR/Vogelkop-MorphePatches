package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class xof implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c8e b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ikl d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ hyf f;
    public final /* synthetic */ String g;
    public final /* synthetic */ ue5 h;
    public final /* synthetic */ cec i;
    public final /* synthetic */ nul j;
    public final /* synthetic */ rul k;

    public /* synthetic */ xof(c8e c8eVar, String str, ikl iklVar, Function0 function0, hyf hyfVar, String str2, ue5 ue5Var, cec cecVar, nul nulVar, rul rulVar, int i, byte b) {
        this.a = b;
        this.b = c8eVar;
        this.c = str;
        this.d = iklVar;
        this.e = function0;
        this.f = hyfVar;
        this.g = str2;
        this.h = ue5Var;
        this.i = cecVar;
        this.j = nulVar;
        this.k = rulVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = aoh.m(32769);
                zi4.c(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (ih5) obj, iM);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM2 = aoh.m(32769);
                zi4.d(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (ih5) obj, iM2);
                break;
        }
        return Unit.a;
    }
}
