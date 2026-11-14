package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ge1 extends ozb implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ c8e k;
    public final /* synthetic */ x48 l;
    public final /* synthetic */ vh8 m;
    public final /* synthetic */ String n;
    public final /* synthetic */ ue5 o;
    public final /* synthetic */ int p;
    public final /* synthetic */ byte q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ge1(boolean z, c8e c8eVar, x48 x48Var, vh8 vh8Var, String str, ue5 ue5Var, int i, int i2, byte b) {
        super(2);
        this.i = b;
        this.j = z;
        this.k = c8eVar;
        this.l = x48Var;
        this.m = vh8Var;
        this.n = str;
        this.o = ue5Var;
        this.p = i;
        this.q = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.i;
        int i = this.p;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iM = aoh.m(i | 1);
                byte b2 = this.q;
                xf8.d(this.j, this.k, this.l, this.m, this.n, this.o, (ih5) obj, iM, b2);
                break;
            default:
                ((Number) obj2).intValue();
                int iM2 = aoh.m(i | 1);
                byte b3 = this.q;
                xf8.e(this.j, this.k, this.l, this.m, this.n, this.o, (ih5) obj, iM2, b3);
                break;
        }
        return Unit.a;
    }
}
