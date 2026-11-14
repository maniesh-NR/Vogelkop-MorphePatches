package defpackage;

import android.app.Application;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.File;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.c;

/* loaded from: classes.dex */
public final class jno {
    public static Boolean d;
    public static int e;
    public static d3k f;
    public static d3k i;
    public static final jno a = new jno();
    public static final mhk b = new mhk((byte) 6);
    public static final zyk c = z4c.b(a43.H);
    public static volatile int g = LinearLayoutManager.INVALID_OFFSET;
    public static final zyk h = z4c.b(a43.I);

    static {
        Application application = cbp.b;
        na2.B(w2p.a, null, null, new vf6(Boolean.TRUE, null, null), 3);
    }

    public static void a(Application application, boolean z) {
        StringBuilder sb = new StringBuilder("events isEmpty: ");
        mhk mhkVar = b;
        sb.append(((i72) mhkVar.c).isEmpty());
        sb.append(", sendJob: ");
        sb.append(i);
        nxg.g("scheduleSend", sb.toString());
        pfp.b();
        d3k d3kVar = i;
        if (d3kVar != null) {
            d3kVar.k((CancellationException) null);
        } else {
            if (!Intrinsics.a(d, Boolean.TRUE) || ((i72) mhkVar.c).isEmpty()) {
                return;
            }
            d3k d3kVarB = na2.B(w2p.b, (CoroutineContext) h.getValue(), null, new ui4(z, application, null), 2);
            d3kVarB.s(new of3(d3kVarB, application, (byte) 18));
            i = d3kVarB;
        }
    }

    public static oio b(Context context) {
        return new oio((CoroutineContext) c.getValue(), new File(context.getNoBackupFilesDir(), "opera_ads/opera_analytics_events.dat"), fcp.d(), new k72(c.Companion.serializer(), (byte) 0));
    }

    public static final void c(Application application) {
        byte b2 = 0;
        e = 0;
        d3k d3kVar = f;
        mt5 mt5Var = null;
        if (d3kVar != null) {
            d3kVar.k((CancellationException) null);
        }
        f = na2.B(w2p.a, null, null, new ino(application, mt5Var, b2), 3);
    }

    public static void d(Application application, boolean z) {
        nxg.g("scheduleSave", "force: " + z + ", undispatched: " + e + ", saveJob: " + f);
        pfp.b();
        int i2 = e + 1;
        e = i2;
        if (z || i2 >= 5) {
            nxg.g("scheduleSave", "saveImmediately()");
            c(application);
        } else {
            d3k d3kVar = f;
            if (d3kVar != null) {
                d3kVar.k((CancellationException) null);
            }
            f = na2.B(w2p.a, null, null, new fno(application, (mt5) null, (byte) 1), 3);
        }
    }
}
