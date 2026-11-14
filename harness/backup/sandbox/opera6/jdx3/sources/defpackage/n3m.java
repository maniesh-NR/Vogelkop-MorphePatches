package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class n3m implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o3m b;
    public final /* synthetic */ List c;

    public /* synthetic */ n3m(o3m o3mVar, List list, byte b) {
        this.a = b;
        this.b = o3mVar;
        this.c = list;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        List list = this.c;
        o3m o3mVar = this.b;
        osk oskVar = (osk) obj;
        switch (b) {
            case 0:
                y5i y5iVar = o3mVar.a;
                kfo.Y(y5iVar, false, true, new qjl((byte) 9));
                kfo.Y(y5iVar, false, true, new n3m(o3mVar, list, (byte) 2));
                break;
            case 1:
                y5i y5iVar2 = o3mVar.a;
                kfo.Y(y5iVar2, false, true, new qjl((byte) 8));
                List list2 = list;
                ArrayList arrayList = new ArrayList(k95.o(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new zf8((String) it.next()));
                }
                kfo.Y(y5iVar2, false, true, new gil(o3mVar, arrayList, (byte) 13));
                break;
            default:
                o3mVar.b.P(oskVar, list);
                break;
        }
        return Unit.a;
    }
}
