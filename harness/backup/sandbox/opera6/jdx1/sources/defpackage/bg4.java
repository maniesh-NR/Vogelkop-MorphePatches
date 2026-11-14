package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class bg4 {
    public final List a;

    public bg4(List list) {
        this.a = list;
        ruf rufVar = (ruf) CollectionsKt.K(list);
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((ruf) it.next()).b != rufVar.b) {
                qp2.n("All outputs must have the same format!");
                throw null;
            }
        }
    }

    public final String toString() {
        return "CameraStream.Config(outputs=" + this.a + ", imageSourceConfig=null)";
    }
}
