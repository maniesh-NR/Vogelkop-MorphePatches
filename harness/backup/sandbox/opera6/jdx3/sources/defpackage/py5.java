package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class py5 implements Function2 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ short c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ py5(String str, String str2, int i, int i2, boolean z) {
        this.e = str;
        this.f = str2;
        this.b = z;
        this.c = i;
        this.d = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ py5(nof nofVar, boolean z, ue5 ue5Var, int i, int i2) {
        this.e = nofVar;
        this.b = z;
        this.f = ue5Var;
        this.c = i;
        this.d = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        short s = this.c;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = aoh.m(s | 1);
                xy5.j((String) obj4, (String) obj3, this.b, (ih5) obj, iM, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM2 = aoh.m(s | 1);
                rof.c((nof) obj4, this.b, (ue5) obj3, (ih5) obj, iM2, this.d);
                break;
        }
        return Unit.a;
    }
}
