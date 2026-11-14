package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ej {
    public final LinkedHashSet a = new LinkedHashSet();

    public final void a(ArrayList arrayList, boolean z, Function2 function2) {
        cj cjVar = new cj(arrayList, z, new aj(this, z, arrayList, function2));
        this.a.add(cjVar);
        if (cjVar.a) {
            return;
        }
        cjVar.a = true;
        int i = 0;
        int i2 = z ? 16384 : 0;
        int size = arrayList.size();
        while (true) {
            z zVar = cjVar.d;
            if (i >= size) {
                zVar.e();
                return;
            } else {
                Object obj = arrayList.get(i);
                i++;
                oya.b((String) obj, 0, 0, i2, 0, new bj(cjVar, zVar.b()));
            }
        }
    }
}
