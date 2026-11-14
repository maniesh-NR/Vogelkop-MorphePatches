package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r2k {
    public final List a;
    public final ArrayList b;

    public r2k(List list) {
        this.a = list;
        if (list.isEmpty()) {
            qp2.o("Configuration stack must not be empty");
            throw null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(k95.o(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                j95.n();
                throw null;
            }
            arrayList.add(new mkj(obj, i == j95.h(this.a) ? ew4.b : ew4.a));
            i = i2;
        }
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r2k) && Intrinsics.a(this.a, ((r2k) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StackNavState(configurations=" + this.a + ')';
    }
}
