package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class wjn extends n1 {
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wjn(Context context, byte b) {
        super((Object) context, (byte) 26);
        this.c = b;
    }

    @Override // defpackage.n1
    public final List P(List list) {
        switch (this.c) {
            case 0:
                ArrayList arrayList = new ArrayList();
                if (list.isEmpty()) {
                    arrayList.add(new ckb());
                } else {
                    arrayList.addAll(n1.r0(list, false, true));
                }
                return arrayList;
            default:
                return l08.a;
        }
    }

    @Override // defpackage.n1
    public final List Q(ArrayList arrayList) {
        switch (this.c) {
            case 1:
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    bkn bknVar = (bkn) obj;
                    arrayList3.add(new kkb(bknVar.a, bknVar.b));
                }
                arrayList2.addAll(arrayList3);
                return arrayList2;
            default:
                return super.Q(arrayList);
        }
    }
}
