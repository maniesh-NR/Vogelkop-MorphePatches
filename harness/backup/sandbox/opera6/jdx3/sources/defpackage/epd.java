package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.chromium.content_public.browser.MediaSession;

/* loaded from: classes.dex */
public final class epd {
    public final x5f a;
    public final WeakHashMap b = new WeakHashMap();

    public epd(x5f x5fVar) {
        this.a = x5fVar;
    }

    public final void a(MediaSession mediaSession, boolean z, boolean z2) {
        WeakHashMap weakHashMap = this.b;
        if (!z) {
            dpd dpdVar = (dpd) weakHashMap.remove(mediaSession);
            if (dpdVar != null) {
                b(dpdVar);
                return;
            }
            return;
        }
        dpd dpdVar2 = (dpd) weakHashMap.get(mediaSession);
        if (dpdVar2 == null) {
            weakHashMap.put(mediaSession, new dpd(z2));
        } else if (dpdVar2.a != z2) {
            b(dpdVar2);
            weakHashMap.put(mediaSession, new dpd(z2));
        }
    }

    public final void b(dpd dpdVar) {
        hf0 hf0Var;
        long jUptimeMillis = SystemClock.uptimeMillis() - dpdVar.b;
        boolean z = dpdVar.a;
        x5f x5fVar = this.a;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            xu0 xu0Var = new xu0(2443, -1, 2);
            xu0Var.p(0, 1, jUptimeMillis);
            xu0Var.r(1, 1, z);
            x56 x56VarF = zpa.F();
            uc0 uc0VarA = x56VarF.A(zpaVar);
            List list = (List) uc0VarA.n(6);
            if (list == null || list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                uc0VarA.q(6, 1, arrayList);
                hf0Var = new hf0(uc0VarA, 6, arrayList);
            } else {
                hf0Var = new hf0(uc0VarA, 6, list);
            }
            hf0Var.add(xu0Var);
            x5fVar.U0(x56VarF);
        }
    }
}
