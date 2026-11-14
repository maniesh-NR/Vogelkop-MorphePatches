package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.opera.android.settings.SettingsManager;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public final class v3m {
    public final Context a;
    public final SettingsManager b;
    public final j4c c;
    public final plk d;

    public v3m(Context context, SettingsManager settingsManager, j4c j4cVar, umi umiVar) {
        this.a = context.getApplicationContext();
        this.b = settingsManager;
        this.c = j4cVar;
        this.d = new plk(this, umiVar, new k32(this, context, (byte) 10));
    }

    public static Set c(Context context) {
        return ((avn) ((bvn) no7.n(context, io7.A, bvn.k)).i()).b.keySet();
    }

    public static boolean f(Context context) {
        if (i0l.g()) {
            return false;
        }
        return !c(context).isEmpty();
    }

    public final String a(int i) {
        q6e q6eVar = (q6e) this.c.get();
        Context context = this.a;
        boolean zH = p8f.H(q6eVar, context);
        String string = context.getString(i);
        szb szbVarH = ybh.h(context.getApplicationContext());
        if (zH) {
            Pair pairD = aik.d(string, "Google Translate");
            if (((Integer) pairD.first).intValue() != -1 && ((Integer) pairD.second).intValue() != -1) {
                return string.substring(0, ((Integer) pairD.first).intValue()) + (szbVarH == szb.k ? "Яндекс.Переводчик" : "Yandex Translate") + string.substring(((Integer) pairD.second).intValue());
            }
        }
        return string;
    }

    public final szb b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashMap map = ((avn) ((bvn) no7.n(this.a, io7.A, bvn.k)).i()).b;
        for (szb szbVar : map.keySet()) {
            if (str.equals(map.get(szbVar))) {
                return szbVar;
            }
        }
        return null;
    }

    public final szb d() {
        szb szbVarD = szb.d(0, this.b.z("translate_web_pages_to_language"));
        if (!h(szbVarD)) {
            szbVarD = null;
        }
        if (szbVarD != null) {
            return szbVarD;
        }
        Context context = this.a;
        Set setC = c(context);
        szb szbVarH = ybh.h(context.getApplicationContext());
        if (szbVarH == null || !setC.contains(szbVarH)) {
            Locale locale = wwc.a;
            szbVarH = szb.h(locale.getLanguage(), locale.getCountry());
        }
        return (szbVarH == null || !setC.contains(szbVarH)) ? szb.e : szbVarH;
    }

    public final boolean e(szb szbVar, int i) {
        Set<i0c> set;
        if (szbVar == null || (set = (Set) ((ode) this.d.c).g()) == null) {
            return false;
        }
        for (i0c i0cVar : set) {
            if (i0cVar.a.equals(szbVar)) {
                return i0cVar.b == i;
            }
        }
        return false;
    }

    public final boolean g() {
        return this.b.i("translate_web_pages_enabled");
    }

    public final boolean h(szb szbVar) {
        return szbVar != null && c(this.a).contains(szbVar);
    }

    public final void i(szb szbVar) {
        if (f(this.a) && g()) {
            szb szbVar2 = szb.j;
            szb szbVar3 = szb.i;
            if (szbVar != szbVar3 && szbVar != szbVar2) {
                j(szbVar, 1, true);
            } else {
                j(szbVar3, 1, true);
                j(szbVar2, 1, true);
            }
        }
    }

    public final void j(final szb szbVar, final int i, final boolean z) {
        final plk plkVar = this.d;
        ((xl) plkVar.b).j(new Callback() { // from class: f4m
            @Override // com.opera.api.Callback
            public final void run(Object obj) {
                szb szbVar2;
                ewg ewgVarH;
                plk plkVar2 = plkVar;
                plkVar2.getClass();
                ArrayList arrayList = new ArrayList(((g4m) obj).a);
                Iterator it = arrayList.iterator();
                it.getClass();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    szbVar2 = szbVar;
                    if (!zHasNext) {
                        ewgVarH = h3.a;
                        break;
                    }
                    Object next = it.next();
                    if (((j0c) next).a.equals(szbVar2.toString())) {
                        ewgVarH = orf.h(next);
                        break;
                    }
                }
                j0c j0cVar = (j0c) ewgVarH.j();
                boolean z2 = i;
                if (j0cVar != null) {
                    if (!z || j0cVar.b == z2) {
                        return;
                    } else {
                        arrayList.remove(j0cVar);
                    }
                }
                arrayList.add(new j0c(szbVar2.toString(), z2 ? 1 : 0));
                xl xlVar = (xl) plkVar2.b;
                ((nrl) xlVar.l).d(new h4m((Object) xlVar, (Object) arrayList, (Object) new d4m(plkVar2, (byte) 3), (byte) 0));
            }
        });
    }
}
