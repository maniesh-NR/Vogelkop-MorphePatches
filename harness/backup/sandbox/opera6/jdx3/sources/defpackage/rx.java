package defpackage;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class rx implements dy {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rx(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.dy
    public final void s(ml mlVar) {
        int iIndexOf;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((ux) obj).d = mlVar.h;
                return;
            case 1:
                vzk vzkVar = (vzk) obj;
                Iterator it = new HashSet((Set) vzkVar.c).iterator();
                while (it.hasNext()) {
                    ((dy) it.next()).s(mlVar);
                }
                ami amiVar = (ami) vzkVar.b;
                HashMap map = (HashMap) amiVar.b;
                vzk vzkVar2 = (vzk) amiVar.e;
                Iterator it2 = map.keySet().iterator();
                while (it2.hasNext()) {
                    if (!((cy) vzkVar2.a).c().j.contains((String) ((lyf) ((xx) it2.next())).a)) {
                        it2.remove();
                    }
                }
                SharedPreferences sharedPreferences = (SharedPreferences) ((b59) amiVar.f).get();
                Set<String> setKeySet = sharedPreferences.getAll().keySet();
                long jCurrentTimeMillis = System.currentTimeMillis() - 1296000000;
                for (String str : setKeySet) {
                    if (str.startsWith("providers_config_") && str.endsWith("_timestamp") && (iIndexOf = str.indexOf(95, 17)) != -1) {
                        if (!((cy) vzkVar2.a).c().j.contains(str.substring(17, iIndexOf)) || sharedPreferences.getLong(str, 0L) <= jCurrentTimeMillis) {
                            ami.s(sharedPreferences, str.substring(0, str.length() - 10));
                        }
                    }
                }
                return;
            case 2:
                ((nn7) obj).q = mlVar.h;
                return;
            case 3:
                Iterator it3 = new HashSet(((wy8) obj).a).iterator();
                if (it3.hasNext()) {
                    throw p3p.g(it3);
                }
                return;
            case 4:
                ((nhb) obj).b = mlVar.f;
                return;
            default:
                ((s9i) obj).e = mlVar.h;
                return;
        }
    }
}
