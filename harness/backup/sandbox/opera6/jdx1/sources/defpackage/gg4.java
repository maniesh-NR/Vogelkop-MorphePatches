package defpackage;

import android.view.Surface;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class gg4 {
    public static final bf2 d = c26.j(0);
    public final Object a = new Object();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashSet c = new LinkedHashSet();

    public final fg4 a(Surface surface) {
        fg4 fg4Var;
        List listK0;
        if (!surface.isValid()) {
            surface.toString();
        }
        synchronized (this.a) {
            fg4Var = new fg4(this, surface);
            Integer num = (Integer) this.b.get(surface);
            int iIntValue = (num != null ? num.intValue() : 0) + 1;
            this.b.put(surface, Integer.valueOf(iIntValue));
            listK0 = iIntValue == 1 ? CollectionsKt.k0(this.c) : null;
        }
        if (listK0 != null) {
            Iterator it = listK0.iterator();
            while (it.hasNext()) {
                ((btm) it.next()).c(surface);
            }
        }
        return fg4Var;
    }
}
