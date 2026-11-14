package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public abstract class p6f {
    public static final Object[] a = new Object[0];
    public static final dee b = new dee(0);

    public static final void a(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            zwg.u("Index " + i + " is out of bounds. The list has " + size + " elements.");
            throw null;
        }
    }

    public static final void b(int i, int i2, List list) {
        int size = list.size();
        if (i > i2) {
            zwg.t("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
            throw null;
        }
        if (i < 0) {
            zwg.u("fromIndex (" + i + ") is less than 0.");
            throw null;
        }
        if (i2 <= size) {
            return;
        }
        zwg.u("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
        throw null;
    }
}
