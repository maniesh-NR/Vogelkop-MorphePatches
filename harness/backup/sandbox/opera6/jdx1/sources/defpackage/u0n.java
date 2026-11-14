package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class u0n {
    public static final l08 a = l08.a;

    static {
        int i = u95.h;
    }

    public static final List a(String str) {
        if (str == null) {
            return a;
        }
        bpd bpdVar = new bpd((byte) 29);
        ArrayList arrayList = (ArrayList) bpdVar.b;
        if (arrayList == null) {
            arrayList = new ArrayList();
            bpdVar.b = arrayList;
        } else {
            arrayList.clear();
        }
        bpdVar.L(str, arrayList);
        ArrayList arrayList2 = (ArrayList) bpdVar.b;
        return arrayList2 != null ? arrayList2 : l08.a;
    }
}
