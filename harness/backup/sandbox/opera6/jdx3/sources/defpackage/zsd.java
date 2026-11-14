package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zsd {
    public static final zsd b = new zsd();
    public final ArrayList a = new ArrayList();

    public final void a(int i) {
        if (i != 20) {
            if (i >= 80) {
                b(3);
            } else if (i >= 15) {
                b(2);
            } else if (i >= 10) {
                b(1);
            }
        }
    }

    public final void b(int i) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((ysd) obj).l(i);
        }
    }
}
