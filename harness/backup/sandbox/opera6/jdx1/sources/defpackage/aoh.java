package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class aoh {
    public static final void a(nsj nsjVar, c8e c8eVar, ue5 ue5Var, ih5 ih5Var, int i) {
        boolean z;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-977568115);
        int i2 = (i & 6) == 0 ? (vt9Var.f(nsjVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= vt9Var.f(c8eVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= vt9Var.h(ue5Var) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        boolean z2 = true;
        if (vt9Var.N(i2 & 1, (i2 & 147) != 146)) {
            String strG = a4h.g(vt9Var, 2132019632);
            Object objK = vt9Var.K();
            Object obj = objK;
            if (objK == hh5.a) {
                eo8 eo8Var = new eo8();
                eo8Var.a = new Object();
                eo8Var.b = new ArrayList();
                vt9Var.g0(eo8Var);
                obj = eo8Var;
            }
            eo8 eo8Var2 = (eo8) obj;
            Object obj2 = eo8Var2.a;
            ArrayList arrayList = eo8Var2.b;
            if (Intrinsics.a(nsjVar, obj2)) {
                z = true;
                vt9Var.W(1443908949);
                vt9Var.p(false);
            } else {
                vt9Var.W(1154891761);
                eo8Var2.a = nsjVar;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList2.add(((do8) arrayList.get(i3)).a);
                }
                ArrayList arrayList3 = new ArrayList(arrayList2);
                if (!arrayList3.contains(nsjVar)) {
                    arrayList3.add(nsjVar);
                }
                arrayList.clear();
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    Object obj3 = arrayList3.get(i4);
                    if (obj3 != null) {
                        arrayList4.add(obj3);
                    }
                }
                int size3 = arrayList4.size();
                int i5 = 0;
                while (i5 < size3) {
                    nsj nsjVar2 = (nsj) arrayList4.get(i5);
                    arrayList.add(new do8(nsjVar2, gyg.P(-1952400805, new msj(nsjVar2, nsjVar, eo8Var2, strG), vt9Var)));
                    i5++;
                    z2 = z2;
                }
                z = z2;
                vt9Var.p(false);
            }
            tfd tfdVarC = nr3.c(rbe.b, false);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVar);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, tfdVarC, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            ah5 ah5Var = ujp.g;
            if (vt9Var.S || !Intrinsics.a(vt9Var.K(), Integer.valueOf(iHashCode))) {
                vep.x(iHashCode, vt9Var, iHashCode, ah5Var);
            }
            y4h.o(vt9Var, c8eVarP, ujp.d);
            znh znhVarW = vt9Var.w();
            if (znhVarW == null) {
                qp2.n("no recompose scope found");
                return;
            }
            znhVarW.b |= 1;
            eo8Var2.c = znhVarW;
            vt9Var.W(-1888182177);
            int size4 = arrayList.size();
            for (int i6 = 0; i6 < size4; i6++) {
                do8 do8Var = (do8) arrayList.get(i6);
                nsj nsjVar3 = do8Var.a;
                ue5 ue5Var2 = do8Var.b;
                vt9Var.U(1325010085, nsjVar3);
                ue5Var2.invoke(gyg.P(-1893791890, new ub3(ue5Var, (Object) nsjVar3, (byte) 6), vt9Var), vt9Var, 6);
                vt9Var.p(false);
            }
            vt9Var.p(false);
            vt9Var.p(z);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new ga1((Object) nsjVar, (Object) c8eVar, (Object) ue5Var, i, (byte) 15);
        }
    }

    public static final void b(qsj qsjVar, c8e c8eVar, ue5 ue5Var, ih5 ih5Var, int i) {
        int i2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1077081618);
        if ((i & 6) == 0) {
            i2 = (vt9Var.f(qsjVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 432;
        if (vt9Var.N(i3 & 1, (i3 & 147) != 146)) {
            ue5Var = kf5.a;
            nsj nsjVar = (nsj) qsjVar.b.getValue();
            o21 o21Var = (o21) vt9Var.j(mi5.a);
            boolean zF = vt9Var.f(nsjVar) | vt9Var.h(o21Var);
            Object objK = vt9Var.K();
            if (zF || objK == hh5.a) {
                objK = new r8h((Object) nsjVar, (Object) o21Var, (mt5) null, (byte) 14);
                vt9Var.g0(objK);
            }
            rm5.e(vt9Var, nsjVar, (Function2) objK);
            nsj nsjVar2 = (nsj) qsjVar.b.getValue();
            z7e z7eVar = z7e.b;
            a(nsjVar2, z7eVar, ue5Var, vt9Var, 432);
            c8eVar = z7eVar;
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new ct5(qsjVar, c8eVar, ue5Var, i);
        }
    }

    public static View c(Context context, View view) {
        View viewFindViewById = null;
        View viewFindViewById2 = !(context instanceof Activity) ? null : ((Activity) context).getWindow().getDecorView().findViewById(R.id.content);
        if (view != null) {
            view.isAttachedToWindow();
            View rootView = view.getRootView();
            if (rootView != null && (viewFindViewById = rootView.findViewById(R.id.content)) == null) {
                viewFindViewById = rootView;
            }
        }
        return viewFindViewById2 != null ? viewFindViewById2 : viewFindViewById;
    }

    public static boolean d(String str) {
        if (str == null || !str.startsWith("omid-native")) {
            return false;
        }
        try {
            Uri uri = Uri.parse(str);
            if (!"omid-native".equals(uri.getScheme())) {
                return false;
            }
            g(uri);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e6i e(int i, String str) {
        TreeMap treeMap = e6i.i;
        synchronized (treeMap) {
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (entryCeilingEntry == null) {
                e6i e6iVar = new e6i(i);
                e6iVar.b = str;
                e6iVar.h = i;
                return e6iVar;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            e6i e6iVar2 = (e6i) entryCeilingEntry.getValue();
            e6iVar2.b = str;
            e6iVar2.h = i;
            return e6iVar2;
        }
    }

    public static void f(Menu menu, int i, osn osnVar) {
        MenuItem menuItemFindItem = menu.findItem(i);
        if (menuItemFindItem != null) {
            menuItemFindItem.setEnabled(osnVar == osn.c);
            menuItemFindItem.setVisible(osnVar != osn.a);
        }
    }

    public static void g(Uri uri) {
        try {
            String queryParameter = uri.getQueryParameter("method");
            if (TextUtils.isEmpty(queryParameter)) {
                uri.toString();
                return;
            }
            if (queryParameter.hashCode() == -1407254715 && queryParameter.equals("attest")) {
                HashMap map = new HashMap();
                for (String str : uri.getQueryParameterNames()) {
                    map.put(str, uri.getQueryParameter(str));
                }
                try {
                    n6h.b(q1p.b.a.getApplicationContext(), (String) map.get("mechanism"), new qtk(map));
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            uri.toString();
        }
    }

    public static final ubm h(ccm ccmVar, ufm ufmVar) {
        zbm zbmVar = ufmVar.d;
        int iOrdinal = ccmVar.ordinal();
        if (iOrdinal == 0) {
            return zbmVar.a;
        }
        if (iOrdinal == 1) {
            return zbmVar.b;
        }
        if (iOrdinal == 2) {
            return zbmVar.d;
        }
        if (iOrdinal == 3) {
            return zbmVar.c;
        }
        if (iOrdinal == 4) {
            return zbmVar.e;
        }
        if (iOrdinal == 5) {
            return zbmVar.a;
        }
        h9o.p();
        return null;
    }

    public static final int i(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final void j(i0j i0jVar) {
        ui6.e0(i0jVar).F();
    }

    public static plk k(tcl tclVar, Object obj, Function0 function0) {
        nml nmlVar = (nml) function0.invoke();
        return new plk(tclVar, nmlVar, new eyi(obj, nmlVar), (Object) null);
    }

    public static final boolean l(Context context, String str, boolean z) {
        n9h n9hVar = rmj.a;
        n9hVar.getClass();
        smj smjVarJ = n9hVar.j(System.currentTimeMillis(), z, str);
        if (smjVarJ == null) {
            return false;
        }
        context.startActivity(new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS").putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName()).putExtra("android.provider.extra.CHANNEL_ID", smjVarJ.a));
        return true;
    }

    public static final int m(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }
}
