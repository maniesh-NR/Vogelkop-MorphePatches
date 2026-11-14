package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class uta implements Function2 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ c8e b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ byte f;
    public final /* synthetic */ Object g;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ uta(c8e c8eVar, String str, ue5 ue5Var, long j, int i, int i2, int i3) {
        this.b = c8eVar;
        this.c = str;
        this.g = ue5Var;
        this.d = j;
        this.e = i;
        this.f = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ uta(hyf hyfVar, String str, c8e c8eVar, long j, int i, int i2) {
        this.g = hyfVar;
        this.c = str;
        this.b = c8eVar;
        this.d = j;
        this.e = i;
        this.f = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                wta.b((hyf) this.g, this.c, this.b, this.d, (ih5) obj, aoh.m(this.e | 1), this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM = aoh.m(1);
                j14.e(this.b, this.c, (ue5) this.g, this.d, this.e, this.f, (ih5) obj, iM);
                break;
        }
        return Unit.a;
    }
}
