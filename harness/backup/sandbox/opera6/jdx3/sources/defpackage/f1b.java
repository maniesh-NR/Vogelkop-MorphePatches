package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class f1b extends z4 implements RandomAccess, Serializable {
    public final ArrayList b;

    public f1b(List list) {
        this.b = new ArrayList(list);
    }

    public final int d() {
        return this.b.size();
    }

    public final Object get(int i) {
        return this.b.get(i);
    }

    public final Object[] toArray() {
        return this.b.toArray(new Object[0]);
    }
}
