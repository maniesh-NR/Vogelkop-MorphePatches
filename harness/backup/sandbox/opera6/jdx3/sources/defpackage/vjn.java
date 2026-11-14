package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class vjn extends n1 {
    public final boolean c;
    public final boolean d;

    public vjn(Context context, boolean z, boolean z2) {
        super(context, (byte) 26);
        this.c = z;
        this.d = z2;
    }

    @Override // defpackage.n1
    public final List P(List list) {
        ArrayList arrayList = new ArrayList();
        if (this.c) {
            arrayList.add(new gkb());
        }
        arrayList.addAll(n1.r0(list, false, true));
        if (this.d) {
            arrayList.add(new ikb());
        }
        return arrayList;
    }
}
