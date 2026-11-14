package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class ct5 implements Function2 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ c8e b;
    public final /* synthetic */ byte c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ct5(c8e c8eVar, is5 is5Var, Function1 function1, int i, int i2) {
        this.b = c8eVar;
        this.d = is5Var;
        this.e = function1;
        this.c = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ct5(String str, String str2, c8e c8eVar, int i, int i2) {
        this.d = str;
        this.e = str2;
        this.b = c8eVar;
        this.c = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ct5(Function0 function0, c8e c8eVar, ue5 ue5Var, int i, int i2) {
        this.d = function0;
        this.b = c8eVar;
        this.e = ue5Var;
        this.c = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ct5(qsj qsjVar, c8e c8eVar, ue5 ue5Var, int i) {
        this.d = qsjVar;
        this.b = c8eVar;
        this.e = ue5Var;
        this.c = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = aoh.m(1);
                et5.b(this.b, (is5) obj4, (Function1) obj3, (ih5) obj, iM, this.c);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM2 = aoh.m(1);
                xy5.a((String) obj4, (String) obj3, this.b, (ih5) obj, iM2, this.c);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iM3 = aoh.m(this.c | 1);
                aoh.b((qsj) obj4, this.b, (ue5) obj3, (ih5) obj, iM3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM4 = aoh.m(385);
                ddh.a((Function0) obj4, this.b, (ue5) obj3, (ih5) obj, iM4, this.c);
                break;
        }
        return Unit.a;
    }
}
