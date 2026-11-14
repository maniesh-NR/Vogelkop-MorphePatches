package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class mef implements l99 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ List c;

    public /* synthetic */ mef(Function1 function1, List list, byte b) {
        this.a = b;
        this.b = function1;
        this.c = list;
    }

    public final Object emit(Object obj, mt5 mt5Var) {
        byte b = this.a;
        List list = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                int size = list.size();
                function1.invoke(list.get(((iIntValue % size) + size) % size));
                break;
            default:
                int iIntValue2 = ((Number) obj).intValue();
                int size2 = list.size();
                function1.invoke(list.get(((iIntValue2 % size2) + size2) % size2));
                break;
        }
        return Unit.a;
    }
}
