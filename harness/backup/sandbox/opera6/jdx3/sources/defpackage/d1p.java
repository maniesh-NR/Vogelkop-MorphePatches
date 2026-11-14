package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.telephony.TelephonyManager;
import com.leanplum.utils.SizeUtil;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class d1p {
    public static boolean c;
    public static final t5p a = new t5p(-1, Boolean.FALSE, false);
    public static final t5p b = new t5p(0, null, false);
    public static final LinkedHashSet d = new LinkedHashSet();
    public static final AtomicReference e = new AtomicReference(null);

    public static t5p a(Context context, NetworkCapabilities networkCapabilities) {
        int i;
        int i2 = 3;
        boolean z = false;
        if (networkCapabilities.hasTransport(3)) {
            i = 1;
        } else if (networkCapabilities.hasTransport(1)) {
            i = 2;
        } else if (networkCapabilities.hasTransport(0)) {
            try {
                List list = r8p.a;
                switch (((TelephonyManager) context.getSystemService("phone")).getDataNetworkType()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        i2 = 4;
                        break;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        i2 = 5;
                        break;
                    case 13:
                    case SizeUtil.textSize0_1 /* 18 */:
                        i2 = 6;
                        break;
                    case SizeUtil.textSize0 /* 20 */:
                        i2 = 7;
                        break;
                }
            } catch (Exception unused) {
            }
            i = i2;
        } else {
            i = 0;
        }
        if (networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16)) {
            z = true;
        }
        return new t5p(i, Boolean.valueOf(z), networkCapabilities.hasTransport(4));
    }

    public static void b(Context context, n1p n1pVar) {
        if (d.add(n1pVar)) {
            t5p t5pVar = (t5p) e.get();
            mt5 mt5Var = null;
            if (t5pVar != null) {
                na2.B(w2p.a, (CoroutineContext) null, (rx5) null, new eno(n1pVar, t5pVar, (mt5) null, (byte) 8), 3);
            } else {
                na2.B(w2p.b, (CoroutineContext) null, (rx5) null, new wr(context, mt5Var, (byte) 10), 3);
            }
            if (c) {
                return;
            }
            b1p b1pVar = new b1p(context);
            try {
                List list = r8p.a;
                ((ConnectivityManager) context.getSystemService("connectivity")).registerDefaultNetworkCallback(b1pVar);
                c = true;
            } catch (RuntimeException unused) {
            }
        }
    }

    public static void c(t5p t5pVar) {
        if (Intrinsics.a((t5p) e.getAndSet(t5pVar), t5pVar)) {
            return;
        }
        na2.B(w2p.a, (CoroutineContext) null, (rx5) null, new hmo((byte) 7, (mt5) null, t5pVar), 3);
    }

    public static t5p d(Context context) {
        NetworkCapabilities q0iVar;
        Network activeNetwork;
        t5p t5pVar = (t5p) e.get();
        if (t5pVar != null) {
            return t5pVar;
        }
        List list = r8p.a;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        try {
            p0i p0iVar = t0i.b;
            activeNetwork = connectivityManager.getActiveNetwork();
        } catch (Throwable th) {
            p0i p0iVar2 = t0i.b;
            q0iVar = new q0i(th);
        }
        if (activeNetwork == null) {
            return a;
        }
        q0iVar = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (q0iVar instanceof q0i) {
            q0iVar = null;
        }
        NetworkCapabilities networkCapabilities = q0iVar;
        if (networkCapabilities == null) {
            return b;
        }
        t5p t5pVarA = a(context, networkCapabilities);
        c(t5pVarA);
        return t5pVarA;
    }

    public static t5p e() {
        t5p t5pVar = (t5p) e.get();
        return t5pVar == null ? b : t5pVar;
    }
}
