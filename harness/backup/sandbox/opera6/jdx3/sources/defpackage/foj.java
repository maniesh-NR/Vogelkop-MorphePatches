package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final /* synthetic */ class foj implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qsh b;

    public /* synthetic */ foj(qsh qshVar, byte b) {
        this.a = b;
        this.b = qshVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        qsh qshVar = this.b;
        switch (b) {
            case 0:
                ava.a.a(new foj(qshVar, (byte) 1));
                break;
            default:
                k6l k6lVar = (k6l) qshVar.c;
                if (!Collections.unmodifiableList(k6lVar.b).isEmpty()) {
                    eoj eojVar = (eoj) qshVar.b;
                    List listUnmodifiableList = Collections.unmodifiableList(k6lVar.b);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listUnmodifiableList) {
                        if (((b2l) obj).T() == p6l.a) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(k95.o(arrayList, 10));
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj2 = arrayList.get(i);
                        i++;
                        arrayList2.add(((d7l) ((b2l) obj2)).h0());
                    }
                    Set setN0 = CollectionsKt.n0(arrayList2);
                    ivg ivgVar = eojVar.c;
                    new rml(Unit.a, (umi) ivgVar.b).b(new joj(ivgVar, (byte) 0)).t(new tji((Object) new vvf(setN0, eojVar, (byte) 25), (byte) 21)).l();
                    break;
                }
                break;
        }
    }
}
