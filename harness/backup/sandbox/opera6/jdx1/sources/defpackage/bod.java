package defpackage;

import android.content.ComponentName;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class bod {
    public final und a;
    public final ArrayList b = new ArrayList();
    public final boolean c;
    public final lld d;
    public mi9 e;

    public bod(und undVar, boolean z) {
        this.a = undVar;
        this.d = undVar.b;
        this.c = z;
    }

    public final cod a(String str) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            cod codVar = (cod) obj;
            if (codVar.b.equals(str)) {
                return codVar;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.b).getPackageName() + " }";
    }
}
