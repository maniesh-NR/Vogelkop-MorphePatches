package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ooc extends kuk implements dr9 {
    public final /* synthetic */ byte t;
    public /* synthetic */ boolean u;
    public /* synthetic */ Object v;
    public /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ooc(int i, mt5 mt5Var, byte b) {
        super(i, mt5Var);
        this.t = b;
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.t) {
            case 0:
                Boolean bool = (Boolean) this.v;
                Boolean bool2 = (Boolean) this.w;
                boolean z = this.u;
                px5 px5Var = px5.a;
                ybh.y(obj);
                return Boolean.valueOf(bool.booleanValue() && bool2.booleanValue() && z);
            default:
                boolean z2 = this.u;
                Set set = (Set) this.v;
                List list = (List) this.w;
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                if (!z2) {
                    return l08.a;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (set.contains(((joc) obj2).b)) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
        }
    }

    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = 4;
        Boolean bool = (Boolean) obj;
        switch (this.t) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                ooc oocVar = new ooc(i, (mt5) obj4, (byte) 0);
                oocVar.v = bool;
                oocVar.w = (Boolean) obj2;
                oocVar.u = zBooleanValue;
                return oocVar.invokeSuspend(Unit.a);
            default:
                boolean zBooleanValue2 = bool.booleanValue();
                ooc oocVar2 = new ooc(i, (mt5) obj4, (byte) 1);
                oocVar2.u = zBooleanValue2;
                oocVar2.v = (Set) obj2;
                oocVar2.w = (List) obj3;
                return oocVar2.invokeSuspend(Unit.a);
        }
    }
}
