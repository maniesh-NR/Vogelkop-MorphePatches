package defpackage;

import J.N;
import android.util.SparseArray;
import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class wcd {
    public final SettingsManager a;
    public final ode b;
    public final ew3 c;
    public final d3g d;
    public SparseArray e;
    public final d8d f;
    public final h42 g;

    public wcd(SettingsManager settingsManager, ode odeVar, ode odeVar2, ew3 ew3Var) {
        this.a = settingsManager;
        this.b = odeVar;
        this.c = ew3Var;
        d3g d3gVar = new d3g();
        d3gVar.a = N.MVpA6Bt9();
        this.d = d3gVar;
        this.e = new SparseArray();
        d8d d8dVar = new d8d(this, (byte) 3);
        this.f = d8dVar;
        h42 h42VarJ = b8h.j(odeVar2, new uvc((byte) 6));
        this.g = h42VarJ;
        odeVar.k(d8dVar);
        h42VarJ.k(d3gVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final l2g a(String str, vcd vcdVar) {
        uvc uvcVar;
        l08 arrayList;
        String string = StringsKt.l0(str.toLowerCase(Locale.getDefault())).toString();
        String[] strArr = wqm.a;
        String strS = aik.s(aik.f(string), wqm.e);
        l2g l2gVar = null;
        if (strS.length() < 2) {
            arrayList = l08.a;
        } else {
            d3g d3gVar = this.d;
            long j = d3gVar.a;
            List listI = (j == 0 || !d3gVar.b) ? Collections.EMPTY_LIST : sgb.i((int[]) N.Mq4l5ZJ8(j, strS));
            int iOrdinal = vcdVar.ordinal();
            if (iOrdinal == 0) {
                uvcVar = new uvc((byte) 4);
            } else {
                if (iOrdinal != 1) {
                    h9o.p();
                    return null;
                }
                uvcVar = new uvc((byte) 5);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = listI.iterator();
            while (it.hasNext()) {
                l2g l2gVar2 = (l2g) this.e.get(((Integer) it.next()).intValue());
                if (l2gVar2 != null) {
                    arrayList2.add(l2gVar2);
                }
            }
            arrayList = new ArrayList();
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                if (strS.length() >= ((Number) uvcVar.invoke((l2g) obj)).intValue()) {
                    arrayList.add(obj);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        Iterator it2 = ((Iterable) arrayList).iterator();
        if (it2.hasNext()) {
            ?? next = it2.next();
            loop0: while (true) {
                l2gVar = next;
                while (it2.hasNext()) {
                    next = it2.next();
                    if (Double.valueOf(l2gVar.i).compareTo(Double.valueOf(((l2g) next).i)) < 0) {
                        break;
                    }
                }
            }
        }
        return l2gVar;
    }
}
