package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class v41 implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v41(long j, Object obj, br9 br9Var, int i, byte b) {
        this.a = b;
        this.b = j;
        this.c = obj;
        this.d = br9Var;
    }

    public /* synthetic */ v41(k9f k9fVar, c8e c8eVar, long j, int i) {
        this.a = (byte) 0;
        this.c = k9fVar;
        this.d = c8eVar;
        this.b = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = aoh.m(1);
                z41.a((k9f) obj4, (c8e) obj3, this.b, (ih5) obj, iM);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM2 = aoh.m(49);
                ic4.g(this.b, (xam) obj4, (Function2) obj3, (ih5) obj, iM2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM3 = aoh.m(1);
                lcp.d(this.b, (Function0) obj4, (Function0) obj3, (ih5) obj, iM3);
                break;
        }
        return Unit.a;
    }
}
