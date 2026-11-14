package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class xae extends e04 {
    public final long c;
    public final ArrayList d;
    public final ArrayList e;

    public xae(int i, long j) {
        super((byte) 1, i);
        this.c = j;
        this.d = new ArrayList();
        this.e = new ArrayList();
    }

    public final xae i(int i) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            xae xaeVar = (xae) arrayList.get(i2);
            if (xaeVar.b == i) {
                return xaeVar;
            }
        }
        return null;
    }

    public final yae j(int i) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            yae yaeVar = (yae) arrayList.get(i2);
            if (yaeVar.b == i) {
                return yaeVar;
            }
        }
        return null;
    }

    @Override // defpackage.e04
    public final String toString() {
        return e04.c(this.b) + " leaves: " + Arrays.toString(this.d.toArray()) + " containers: " + Arrays.toString(this.e.toArray());
    }
}
