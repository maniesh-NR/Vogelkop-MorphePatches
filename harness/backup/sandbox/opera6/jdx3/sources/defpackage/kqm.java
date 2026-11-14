package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class kqm implements Iterable {
    public final String a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c;
    public final ipm d;
    public kqm e;
    public boolean f;
    public double g;
    public double h;

    public kqm(String str, long j, long j2) {
        this.a = str;
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        while (str.charAt(length - 1) == '/') {
            length--;
        }
        long jCharAt = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == '/') {
                arrayList.add(Long.valueOf(jCharAt));
            }
            jCharAt = ((jCharAt << 8) + str.charAt(i)) % 2305843009213693951L;
        }
        arrayList.add(Long.valueOf(jCharAt));
        this.c = arrayList;
        this.d = new ipm(j, j2);
    }

    public final void b(kqm kqmVar) {
        if (kqmVar == this) {
            return;
        }
        kqmVar.e = this;
        this.b.add(kqmVar);
    }

    public final boolean c(kqm kqmVar) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        ArrayList arrayList2 = kqmVar.c;
        String str = kqmVar.a;
        if (size >= arrayList2.size()) {
            return false;
        }
        int i = size - 1;
        if (!((Long) kqmVar.c.get(i)).equals((Long) arrayList.get(i))) {
            return false;
        }
        String str2 = this.a;
        return str2.length() < str.length() && str.startsWith(str2);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.b.listIterator();
    }
}
