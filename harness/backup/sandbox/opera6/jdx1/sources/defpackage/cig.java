package defpackage;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class cig {
    public static final cig b;
    public static final String c;
    public final w69 a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        z4o.H(!false);
        b = new cig(new w69(sparseBooleanArray));
        String str = tym.a;
        c = "0";
    }

    public cig(w69 w69Var) {
        this.a = w69Var;
    }

    public static cig b(Bundle bundle) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(c);
        if (integerArrayList == null) {
            return b;
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i = 0; i < integerArrayList.size(); i++) {
            int iIntValue = integerArrayList.get(i).intValue();
            z4o.H(!false);
            sparseBooleanArray.append(iIntValue, true);
        }
        z4o.H(!false);
        return new cig(new w69(sparseBooleanArray));
    }

    public final boolean a(int i) {
        return this.a.a.get(i);
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            w69 w69Var = this.a;
            if (i >= w69Var.a.size()) {
                bundle.putIntegerArrayList(c, arrayList);
                return bundle;
            }
            arrayList.add(Integer.valueOf(w69Var.b(i)));
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cig) {
            return this.a.equals(((cig) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
