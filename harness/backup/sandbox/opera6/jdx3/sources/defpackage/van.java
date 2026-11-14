package defpackage;

import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class van extends dca {
    public final ArrayList e;
    public final txi f;

    public van(long j, rzj rzjVar, ArrayList arrayList, txi txiVar) {
        super(rzjVar, j);
        this.e = arrayList;
        this.f = txiVar;
    }

    @Override // defpackage.dca
    public final Object c(List list, LongSparseArray longSparseArray, long j) {
        rqm rqmVar;
        ArrayList arrayList = this.e;
        HashMap map = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            map.put((String) obj, 0L);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wan wanVar = (wan) it.next();
            if (dca.a(wanVar) && (rqmVar = (rqm) longSparseArray.get(wanVar.a)) != null) {
                String str = rqmVar.b;
                rr8 rr8Var = (rr8) ((eq6) this.f.b).a;
                rr8Var.i();
                String strB = aik.b((String) rr8Var.l.get(str), str);
                Long l = (Long) map.get(strB);
                if (l != null) {
                    map.put(strB, Long.valueOf(l.longValue() + 1));
                }
            }
        }
        return map;
    }
}
