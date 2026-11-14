package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class wf extends dt1 {
    public final /* synthetic */ byte e;

    public /* synthetic */ wf(byte b) {
        this.e = b;
    }

    public final void P(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(k95.o(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new vf((pc) it.next()));
        }
        eme emeVar = new eme(this);
        ArrayList arrayList2 = (ArrayList) this.d;
        j87 j87VarK = uup.k(new ik(arrayList2, arrayList, (byte) 1), true);
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        j87VarK.a(emeVar);
    }

    @Override // defpackage.dt1
    public final long getItemId(int i) {
        switch (this.e) {
            case 0:
                return ((vf) ((ArrayList) this.d).get(i)).a.ordinal();
            case 2:
                return ((kv2) ((ArrayList) this.d).get(i)).a.ordinal();
            case 5:
                return ((smh) ((ArrayList) this.d).get(i)).getId();
            default:
                return super.getItemId(i);
        }
    }
}
