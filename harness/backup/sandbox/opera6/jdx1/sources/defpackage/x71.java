package defpackage;

import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class x71 implements xj4 {
    public final xfk a;

    public x71(xfk xfkVar) {
        this.a = xfkVar;
    }

    @Override // defpackage.xj4
    public final wj4 a(wc4 wc4Var, Map map, dk4 dk4Var) throws Exception {
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((Surface) ((Map.Entry) it.next()).getValue());
        }
        if (wc4Var.W(arrayList, dk4Var)) {
            return new vj4(n08.a, uup.j(map, this.a));
        }
        wc4Var.toString();
        Objects.toString(dk4Var);
        dk4Var.a();
        return qii.b;
    }
}
