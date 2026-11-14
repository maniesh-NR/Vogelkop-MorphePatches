package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class tz2 implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tz2(byte b, int i, Object obj, boolean z) {
        this.a = b;
        this.b = z;
        this.d = obj;
        this.c = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = aoh.m(this.c | 1);
                ui6.b(this.b, (Function0) this.d, (ih5) obj, iM);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM2 = aoh.m(this.c | 1);
                kfo.k(this.b, (c8e) this.d, (ih5) obj, iM2);
                break;
        }
        return Unit.a;
    }
}
