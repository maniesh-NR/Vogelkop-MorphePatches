package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public abstract class ls2 {
    public static final u9d a;

    static {
        u9d u9dVar = new u9d();
        ArrayList arrayListV = CollectionsKt.V(dtf.d, CollectionsKt.V(rp5.d, CollectionsKt.V(f16.c, CollectionsKt.V(c16.d, iw.c))));
        int size = arrayListV.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListV.get(i);
            i++;
            ks2 ks2Var = (ks2) obj;
            Iterator it = ks2Var.g().iterator();
            while (it.hasNext()) {
            }
        }
        a = u9dVar.g();
    }
}
