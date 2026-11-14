package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/* loaded from: classes.dex */
public final class x8a {
    public final String a;
    public final List b;
    public final double c;

    public x8a(String str, List list) {
        Double d;
        Object next;
        String str2;
        Double dF;
        this.a = str;
        this.b = list;
        Iterator it = list.iterator();
        while (true) {
            d = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.a(((y8a) next).a, "q")) {
                    break;
                }
            }
        }
        y8a y8aVar = (y8a) next;
        double dDoubleValue = 1.0d;
        if (y8aVar != null && (str2 = y8aVar.b) != null && (dF = b.f(str2)) != null) {
            double dDoubleValue2 = dF.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                d = dF;
            }
            if (d != null) {
                dDoubleValue = d.doubleValue();
            }
        }
        this.c = dDoubleValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8a)) {
            return false;
        }
        x8a x8aVar = (x8a) obj;
        return Intrinsics.a(this.a, x8aVar.a) && Intrinsics.a(this.b, x8aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HeaderValue(value=" + this.a + ", params=" + this.b + ')';
    }
}
