package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class xjn extends n1 {
    public final boolean c;
    public boolean d;

    public xjn(Context context, boolean z) {
        super(context, (byte) 26);
        this.c = z;
    }

    @Override // defpackage.n1
    public final void G0(boolean z) {
        this.d = z;
    }

    @Override // defpackage.n1
    public final List P(List list) {
        ArrayList arrayList = new ArrayList();
        if (this.d) {
            arrayList.addAll(n1.r0(list, false, false));
            return arrayList;
        }
        arrayList.add(new ekb());
        if (list.size() == 1) {
            arrayList.add(new dkb());
            return arrayList;
        }
        arrayList.addAll(n1.r0(list, true, false));
        if (this.c) {
            arrayList.add(new lkb());
        }
        return arrayList;
    }
}
