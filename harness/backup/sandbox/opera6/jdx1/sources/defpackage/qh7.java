package defpackage;

import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class qh7 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qh7(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                u5m u5mVar = (u5m) obj;
                rh7 rh7Var = (rh7) u5mVar;
                if (!ui6.f0((rh7) obj3).n.b.contains(rh7Var) || !vtp.w(rh7Var, oup.d0((d06) obj2))) {
                    return t5m.a;
                }
                ((pqh) obj4).a = u5mVar;
                return t5m.c;
            default:
                cv6 cv6Var = bb7.a;
                d7a d7aVar = s6d.a.e;
                dze dzeVar = dze.b;
                d7aVar.getClass();
                na2.B((nx5) obj4, e.a(d7aVar, dzeVar), null, new vr((no7) obj3, (p1) obj2, (mt5) null, (byte) 27), 2);
                return Unit.a;
        }
    }
}
