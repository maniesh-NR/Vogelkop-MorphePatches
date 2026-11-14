package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ere extends oqe {
    public final String e;
    public final List f;
    public final String g;
    public final String h;
    public final nb8 i;

    public ere(String str, String str2, String str3, String str4, String str5, qre qreVar, ArrayList arrayList, nb8 nb8Var) {
        super(str, str5, qreVar);
        this.e = str2;
        this.f = Collections.unmodifiableList(arrayList);
        if (str3 == null) {
            int size = arrayList.size();
            int iHashCode = 17;
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                iHashCode = (iHashCode * 31) + ((String) ((msh) obj).v.b).hashCode();
            }
            str3 = String.valueOf(str.hashCode() + (iHashCode * 31));
        }
        this.g = str3;
        this.h = str4;
        this.i = nb8Var;
    }

    @Override // defpackage.oqe
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != ere.class) {
            return false;
        }
        return this.g.equals(((ere) obj).g);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }
}
