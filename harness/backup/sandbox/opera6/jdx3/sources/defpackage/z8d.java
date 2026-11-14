package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class z8d extends kuk implements dr9 {
    public final /* synthetic */ byte t;
    public /* synthetic */ boolean u;
    public /* synthetic */ Object v;
    public /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z8d(byte b, mt5 mt5Var, Object obj) {
        super(4, mt5Var);
        this.t = b;
        this.x = obj;
    }

    public final Object invokeSuspend(Object obj) {
        byte b;
        switch (this.t) {
            case 0:
                u8d u8dVar = (u8d) this.v;
                boolean z = this.u;
                Integer num = (Integer) this.w;
                px5 px5Var = px5.a;
                ybh.y(obj);
                lyi lyiVar = (z || u8dVar == null || (b = u8dVar.a) == 1 || b == 3) ? lyi.a : num != null ? lyi.b : lyi.b;
                return new v8d(u8dVar, lyiVar, num);
            default:
                s5h s5hVar = (s5h) this.v;
                nsl nslVar = (nsl) this.w;
                boolean z2 = this.u;
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                return new uij(!z2 && CollectionsKt.E((List) this.x, nslVar) && (nslVar == nsl.e || nslVar == nsl.f || nslVar == nsl.g), nslVar == nsl.f || nslVar == nsl.g, nslVar == nsl.g, s5hVar);
        }
    }

    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.t;
        Object obj5 = this.x;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                z8d z8dVar = new z8d((byte) 0, (mt5) obj4, (a9d) obj5);
                z8dVar.v = (u8d) obj;
                z8dVar.u = zBooleanValue;
                z8dVar.w = (Integer) obj3;
                return z8dVar.invokeSuspend(Unit.a);
            default:
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                z8d z8dVar2 = new z8d((byte) 1, (mt5) obj4, (List) obj5);
                z8dVar2.v = (s5h) obj;
                z8dVar2.w = (nsl) obj2;
                z8dVar2.u = zBooleanValue2;
                return z8dVar2.invokeSuspend(Unit.a);
        }
    }
}
