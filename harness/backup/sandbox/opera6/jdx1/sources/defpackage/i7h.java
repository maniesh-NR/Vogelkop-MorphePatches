package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class i7h implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ ikl c;
    public final /* synthetic */ short d;
    public final /* synthetic */ Function2 e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ i7h(long j, ikl iklVar, Function2 function2, int i, byte b) {
        this.a = b;
        this.b = j;
        this.c = iklVar;
        this.e = function2;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        short s = this.d;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = aoh.m(s | 1);
                j7h.a(this.b, this.c, this.e, (ih5) obj, iM);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM2 = aoh.m(s | 1);
                hn9.c(this.b, this.c, (ue5) this.e, (ih5) obj, iM2);
                break;
        }
        return Unit.a;
    }
}
