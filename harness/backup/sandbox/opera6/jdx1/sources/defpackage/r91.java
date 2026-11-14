package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class r91 implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ r91(Object obj, Function0 function0, Object obj2, Object obj3, int i, int i2, byte b) {
        this.a = b;
        this.e = obj;
        this.b = function0;
        this.f = obj2;
        this.g = obj3;
        this.c = i;
        this.d = i2;
    }

    public final Object invoke(Object obj, Object obj2) throws oye {
        byte b = this.a;
        int i = this.c;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = aoh.m(i | 1);
                w91.a((fog) obj5, this.b, (gog) obj4, (ue5) obj3, (ih5) obj, iM, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM2 = aoh.m(i | 1);
                kfo.q((sek) obj5, this.b, (Function0) obj4, (c8e) obj3, (ih5) obj, iM2, this.d);
                break;
        }
        return Unit.a;
    }
}
