package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class mrg extends ozb implements Function1 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ ghf j;
    public final /* synthetic */ Map.Entry k;
    public final /* synthetic */ Map.Entry l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mrg(ghf ghfVar, Map.Entry entry, Map.Entry entry2, byte b) {
        super(1);
        this.i = b;
        this.j = ghfVar;
        this.k = entry;
        this.l = entry2;
    }

    public final Object invoke(Object obj) {
        byte b = this.i;
        Map.Entry entry = this.l;
        Map.Entry entry2 = this.k;
        ghf ghfVar = this.j;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                String str = (String) entry2.getKey();
                String str2 = (String) entry.getKey();
                List list = (List) ((LinkedHashMap) ghfVar.b).get(str);
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ghfVar.N((String) it.next(), str2, zBooleanValue);
                    }
                }
                break;
            default:
                ghfVar.D((String) entry2.getKey(), (String) entry.getKey(), ((Boolean) obj).booleanValue());
                break;
        }
        return Unit.a;
    }
}
