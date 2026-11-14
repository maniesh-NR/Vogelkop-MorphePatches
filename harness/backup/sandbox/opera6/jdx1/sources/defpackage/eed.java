package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class eed implements Function2 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ ue5 b;
    public final /* synthetic */ short c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ eed(sa5 sa5Var, acj acjVar, wam wamVar, ue5 ue5Var, int i, int i2) {
        this.e = sa5Var;
        this.f = acjVar;
        this.g = wamVar;
        this.b = ue5Var;
        this.c = i;
        this.d = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ eed(ue5 ue5Var, ue5 ue5Var2, c8e c8eVar, ue5 ue5Var3, int i, int i2) {
        this.b = ue5Var;
        this.e = ue5Var2;
        this.f = c8eVar;
        this.g = ue5Var3;
        this.c = i;
        this.d = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        short s = this.c;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = aoh.m(s | 1);
                fed.b((sa5) obj5, (acj) obj4, (wam) obj3, this.b, (ih5) obj, iM, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM2 = aoh.m(s | 1);
                na2.c(this.b, (ue5) obj5, (c8e) obj4, (ue5) obj3, (ih5) obj, iM2, this.d);
                break;
        }
        return Unit.a;
    }
}
