package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class k3m {
    public final View b;
    public final HashMap a = new HashMap();
    public final ArrayList c = new ArrayList();

    public k3m(View view) {
        this.b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k3m)) {
            return false;
        }
        k3m k3mVar = (k3m) obj;
        return this.b == k3mVar.b && this.a.equals(k3mVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbR = p3p.r("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbR.append(this.b);
        sbR.append("\n");
        String strConcat = sbR.toString().concat("    values:");
        HashMap map = this.a;
        for (String str : map.keySet()) {
            strConcat = strConcat + "    " + str + ": " + map.get(str) + "\n";
        }
        return strConcat;
    }
}
