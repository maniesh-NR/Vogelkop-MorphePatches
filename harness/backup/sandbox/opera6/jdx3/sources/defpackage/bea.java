package defpackage;

import com.opera.android.history.HistoryManager;
import com.opera.android.history.c;
import com.opera.android.history.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class bea extends nr9 implements dr9 {
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        ArrayList arrayList;
        HistoryManager.NativeHistoryEntry[] nativeHistoryEntryArr = (HistoryManager.NativeHistoryEntry[]) obj;
        HistoryManager.NativeHistoryEntry[] nativeHistoryEntryArr2 = (HistoryManager.NativeHistoryEntry[]) obj2;
        List list = (List) obj3;
        List list2 = (List) obj4;
        e eVar = (e) ((z84) this).receiver;
        eVar.getClass();
        int i = 0;
        eVar.d = nativeHistoryEntryArr != null;
        int iOrdinal = eVar.e.ordinal();
        ArrayList arrayList2 = null;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                h9o.p();
                return null;
            }
            if (eVar.j != null) {
                if (list2 != null) {
                    List list3 = list2;
                    arrayList2 = new ArrayList(k95.o(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new yda((jz1) it.next()));
                    }
                }
            } else if (list != null) {
                List list4 = list;
                arrayList2 = new ArrayList(k95.o(list4, 10));
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new yda((jz1) it2.next()));
                }
            }
            return arrayList2 == null ? l08.a : arrayList2;
        }
        if (eVar.j != null) {
            if (nativeHistoryEntryArr2 != null) {
                arrayList = new ArrayList();
                int length = nativeHistoryEntryArr2.length;
                while (i < length) {
                    HistoryManager.NativeHistoryEntry nativeHistoryEntry = nativeHistoryEntryArr2[i];
                    c cVar = z5i.a0(nativeHistoryEntry.getUrl()) ? null : new c(nativeHistoryEntry);
                    if (cVar != null) {
                        arrayList.add(cVar);
                    }
                    i++;
                }
                arrayList2 = arrayList;
            }
        } else if (nativeHistoryEntryArr != null) {
            arrayList = new ArrayList();
            int length2 = nativeHistoryEntryArr.length;
            while (i < length2) {
                HistoryManager.NativeHistoryEntry nativeHistoryEntry2 = nativeHistoryEntryArr[i];
                c cVar2 = z5i.a0(nativeHistoryEntry2.getUrl()) ? null : new c(nativeHistoryEntry2);
                if (cVar2 != null) {
                    arrayList.add(cVar2);
                }
                i++;
            }
            arrayList2 = arrayList;
        }
        return arrayList2 == null ? l08.a : arrayList2;
    }
}
