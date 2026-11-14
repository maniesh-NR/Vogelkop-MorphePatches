package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ukb {
    public final int a;
    public final rp4 b;
    public final ArrayList c;
    public final Integer d;
    public final ofg e;

    public ukb(int i, rp4 rp4Var, ArrayList arrayList, Integer num, ofg ofgVar) {
        this.a = i;
        this.b = rp4Var;
        this.c = arrayList;
        this.d = num;
        this.e = ofgVar;
    }

    public final olb a(int i) {
        ofg ofgVar;
        if (i == 0) {
            return this.b;
        }
        int i2 = i - 1;
        ArrayList arrayList = this.c;
        if (i2 < arrayList.size()) {
            return (olb) arrayList.get(i2);
        }
        if (i2 == 0 && (ofgVar = this.e) != null) {
            return ofgVar;
        }
        t3p.t();
        return null;
    }

    public final int b() {
        int size;
        ArrayList arrayList = this.c;
        if (arrayList.isEmpty()) {
            size = this.e != null ? 1 : 0;
        } else {
            Integer num = this.d;
            size = (num == null || arrayList.size() <= num.intValue()) ? arrayList.size() : num.intValue();
        }
        return 1 + size;
    }
}
