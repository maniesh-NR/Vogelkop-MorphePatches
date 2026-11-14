package defpackage;

import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k16 extends n1 implements Runnable {
    public final ArrayList c;

    public k16(Context context, umi umiVar, ArrayList arrayList) {
        super(context, umiVar);
        this.c = arrayList;
    }

    @Override // defpackage.n1
    public final void run() {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            h16 h16Var = (h16) obj;
            i16 i16Var = (i16) this.b;
            i16Var.getClass();
            i16Var.e(h16Var.a, h16Var.b);
        }
    }
}
