package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class nqj implements jxd {
    public final ArrayList a;

    public nqj(ArrayList arrayList) {
        this.a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((mqj) arrayList.get(0)).b;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                if (((mqj) arrayList.get(i)).a < j) {
                    z = true;
                    break;
                } else {
                    j = ((mqj) arrayList.get(i)).b;
                    i++;
                }
            }
        }
        z4o.w(!z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nqj.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((nqj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.a;
    }
}
