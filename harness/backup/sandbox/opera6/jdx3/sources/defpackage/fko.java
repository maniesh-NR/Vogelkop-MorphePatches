package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class fko {
    public static ejo a;
    public static final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public static boolean c;

    public static void a(Context context) {
        ejo ejoVar = a;
        Activity activity = null;
        bko bkoVar = ejoVar instanceof bko ? (bko) ejoVar : null;
        if (bkoVar != null) {
            List list = r8p.a;
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity != null) {
                bkoVar.h(activity);
            }
        }
    }

    public static void b(ViewGroup viewGroup) {
        Activity activityB;
        ejo ejoVar = a;
        bko bkoVar = ejoVar instanceof bko ? (bko) ejoVar : null;
        if (bkoVar == null || (activityB = xgh.b(viewGroup)) == null) {
            return;
        }
        bkoVar.h(activityB);
    }

    public static final void c(tcc tccVar) {
        qdc qdcVar = (qdc) tccVar;
        qdcVar.i.d(qcc.c);
        if (a instanceof zoo) {
            return;
        }
        if (!c || qdcVar.i.d(qcc.d)) {
            ejo ejoVar = a;
            if (ejoVar != null) {
                ejoVar.b();
            }
            a = new zoo(new h9o((byte) 10));
        }
    }

    public static void d(boolean z) {
        if (c != z) {
            c = z;
            Function1 function1 = z ? pgo.a : hho.a;
            Iterator it = b.iterator();
            while (it.hasNext()) {
                function1.invoke(it.next());
            }
        }
    }
}
