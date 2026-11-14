package defpackage;

import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class r92 {
    public final char a;
    public final List b;
    public final ArrayList c;

    public r92(char c, List list, ArrayList arrayList) {
        this.a = c;
        this.b = list;
        this.c = arrayList;
        r92[] r92VarArr = new r92[NotificationCompat.FLAG_LOCAL_ONLY];
        for (int i = 0; i < 256; i++) {
            ArrayList arrayList2 = this.c;
            int size = arrayList2.size();
            Object obj = null;
            boolean z = false;
            int i2 = 0;
            Object obj2 = null;
            while (true) {
                if (i2 < size) {
                    Object obj3 = arrayList2.get(i2);
                    i2++;
                    if (((r92) obj3).a == i) {
                        if (!z) {
                            z = true;
                            obj2 = obj3;
                        }
                    }
                } else if (z) {
                    obj = obj2;
                }
            }
            r92VarArr[i] = obj;
        }
    }
}
