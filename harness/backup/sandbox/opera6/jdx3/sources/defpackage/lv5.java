package defpackage;

import J.N;
import com.opera.android.browser.chromium.OperaBrowserContext;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class lv5 {
    public final hra a;
    public final List b;

    public lv5(hra hraVar, List list) {
        this.a = hraVar;
        this.b = list;
    }

    public final void a(qlk qlkVar) {
        OperaBrowserContext operaBrowserContext = new OperaBrowserContext(false);
        String str = this.a.h;
        z zVar = new z(qlkVar);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            N.MtwtLBqE(operaBrowserContext.a, str, (String) it.next(), zVar.b());
        }
        zVar.e();
    }
}
