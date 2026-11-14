package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class ipm {
    public final ArrayList a = new ArrayList();
    public final long b;
    public final long c;
    public boolean d;
    public int e;
    public int f;

    public ipm(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public final ArrayList a() {
        ArrayList arrayList = this.a;
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        long j = 0;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Long l = (Long) obj;
            long jLongValue = l.longValue();
            if (jLongValue - j >= 300000.0d) {
                arrayList2.add(l);
                j = jLongValue;
            }
        }
        return arrayList2;
    }

    public final long b() {
        if (this.d) {
            this.e = a().size();
            this.d = false;
        }
        return this.e;
    }
}
