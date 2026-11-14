package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class iv4 implements Function2 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ c8e d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ iv4(bsl bslVar, Function0 function0, qik qikVar, qik qikVar2, c8e c8eVar, boolean z, hv4 hv4Var, int i) {
        this.f = bslVar;
        this.c = function0;
        this.g = qikVar;
        this.h = qikVar2;
        this.d = c8eVar;
        this.b = z;
        this.i = hv4Var;
        this.e = i;
    }

    public /* synthetic */ iv4(boolean z, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, c8e c8eVar, int i) {
        this.b = z;
        this.c = function0;
        this.f = function02;
        this.g = function03;
        this.h = function04;
        this.i = function05;
        this.d = c8eVar;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.e;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = aoh.m(i | 1);
                k1g.f((bsl) obj6, this.c, (qik) obj5, (qik) obj4, this.d, this.b, (hv4) obj3, (ih5) obj, iM);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM2 = aoh.m(i | 1);
                alo.d(this.b, this.c, (Function0) obj6, (Function0) obj5, (Function0) obj4, (Function0) obj3, this.d, (ih5) obj, iM2);
                break;
        }
        return Unit.a;
    }
}
