package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class lv4 implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ c8e c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ lv4(c2i c2iVar, ldh ldhVar, c8e c8eVar, boolean z, boolean z2, int i) {
        this.a = (byte) 2;
        this.e = c2iVar;
        this.f = ldhVar;
        this.c = c8eVar;
        this.b = z;
        this.d = z2;
    }

    public /* synthetic */ lv4(boolean z, br9 br9Var, c8e c8eVar, boolean z2, Object obj, int i, byte b) {
        this.a = b;
        this.b = z;
        this.e = br9Var;
        this.c = c8eVar;
        this.d = z2;
        this.f = obj;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = aoh.m(1);
                k1g.a(this.b, (Function1) obj4, this.c, this.d, (hv4) obj3, (ih5) obj, iM);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM2 = aoh.m(1);
                rih.b(this.b, (Function0) obj4, this.c, this.d, (qih) obj3, (ih5) obj, iM2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM3 = aoh.m(9);
                jym.b((c2i) obj4, (ldh) obj3, this.c, this.b, this.d, (ih5) obj, iM3);
                break;
        }
        return Unit.a;
    }
}
