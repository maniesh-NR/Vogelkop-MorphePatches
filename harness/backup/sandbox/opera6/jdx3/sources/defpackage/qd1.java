package defpackage;

import java.io.OutputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class qd1 extends ozb implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qd1(Object obj, byte b) {
        super(2);
        this.i = b;
        this.j = obj;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.i;
        Object obj3 = this.j;
        switch (b) {
            case 0:
                e48 e48Var = (e48) obj;
                e48 e48Var2 = (e48) obj2;
                e48 e48Var3 = e48.c;
                break;
            case 1:
                Map map = (Map) obj2;
                for (Map.Entry entry : ((bqg) rbd.b((LinkedHashMap) obj3, (String) obj)).b.entrySet()) {
                    String str = (String) entry.getKey();
                    boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
                    lrg lrgVar = (lrg) map.get(str);
                    if (lrgVar != null) {
                        lrgVar.a(zBooleanValue);
                    }
                }
                break;
            default:
                oio oioVar = (oio) obj3;
                cqp.O(oioVar.c, oioVar.d, obj, (OutputStream) obj2);
                break;
        }
        return Unit.a;
    }
}
