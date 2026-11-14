package defpackage;

import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class s9g implements w6f {
    public static s9g h;
    public static int i;
    public final umi a;
    public final SettingsManager b;
    public final vzk c;
    public final vzk d;
    public final k5o e;
    public final i7f f = new i7f();
    public final HashMap g = new HashMap();

    public s9g(umi umiVar, SettingsManager settingsManager, k5o k5oVar) {
        this.a = umiVar;
        this.b = settingsManager;
        r9g r9gVar = new r9g((Object) this, (byte) 0);
        this.c = new vzk(r9gVar);
        this.d = new vzk(r9gVar);
        this.e = k5oVar;
    }

    public static boolean k(lag lagVar, String str, String str2, boolean z) {
        int iOrdinal;
        if (!z && ((iOrdinal = lagVar.ordinal()) == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5 || iOrdinal == 8)) {
            return false;
        }
        if (lagVar == lag.b) {
            return str.equals(str2);
        }
        return true;
    }

    @Override // defpackage.w6f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void F(q9g q9gVar) {
        this.f.b(q9gVar);
    }

    public final void b(lag lagVar, String str, boolean z) {
        if (lagVar == lag.a) {
            return;
        }
        vzk vzkVarJ = j(z);
        synchronized (vzkVarJ.a) {
            jag jagVar = (jag) ((HashMap) vzkVarJ.b).get(str);
            if (jagVar == null) {
                return;
            }
            if (jagVar.a(lagVar, (kag) null) == null) {
                return;
            }
            vzkVarJ.g0(str, lagVar, ((s9g) ((r9g) vzkVarJ.d).b).b.k(lagVar));
            jagVar.a.remove(lagVar);
            if (jagVar.a.isEmpty()) {
                ((HashMap) vzkVarJ.b).remove(str);
            }
            if (!z) {
                n();
            }
            Object[] objArr = {new loj(str, lagVar)};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            l(Collections.unmodifiableList(arrayList));
        }
    }

    public final void c(String str) {
        vzk vzkVar = this.c;
        synchronized (vzkVar.a) {
            jag jagVar = (jag) ((HashMap) vzkVar.b).get(str);
            if (jagVar == null) {
                return;
            }
            for (lag lagVar : jagVar.a.keySet()) {
                vzkVar.g0(str, lagVar, ((s9g) ((r9g) vzkVar.d).b).b.k(lagVar));
            }
            ((HashMap) vzkVar.b).remove(str);
            n();
            Object[] objArr = {new loj(str, null)};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            l(Collections.unmodifiableList(arrayList));
        }
    }

    public final void e(boolean z) {
        vzk vzkVarJ = j(z);
        synchronized (vzkVarJ.a) {
            if (((HashMap) vzkVarJ.b).isEmpty()) {
                return;
            }
            for (Map.Entry entry : ((HashMap) vzkVarJ.b).entrySet()) {
                String str = (String) entry.getKey();
                for (lag lagVar : ((jag) entry.getValue()).a.keySet()) {
                    vzkVarJ.g0(str, lagVar, ((s9g) ((r9g) vzkVarJ.d).b).b.k(lagVar));
                }
            }
            ((HashMap) vzkVarJ.b).clear();
            if (!z) {
                n();
            }
            this.a.d(new vdf(this, (byte) 19)).a(null);
        }
    }

    public final jag f(String str, boolean z) {
        jag jagVar;
        vzk vzkVar = this.c;
        if (!z) {
            return vzkVar.C(str);
        }
        jag jagVarC = this.d.C(str);
        jag jagVarC2 = vzkVar.C(str);
        if (jagVarC != null) {
            jagVar = new jag(jagVarC);
        } else {
            if (jagVarC2 == null) {
                return null;
            }
            jagVar = new jag();
        }
        if (jagVarC2 != null) {
            EnumMap enumMap = jagVar.a;
            for (Map.Entry entry : jagVarC2.a.entrySet()) {
                if (!enumMap.containsKey(entry.getKey()) && ((iag) entry.getValue()).a == kag.DENIED) {
                    enumMap.put((EnumMap) entry.getKey(), (lag) entry.getValue());
                }
            }
        }
        return jagVar;
    }

    public final kag g(lag lagVar, String str, boolean z) {
        jag jagVarF = f(str, z);
        kag kagVarK = this.b.k(lagVar);
        if (z && lagVar == lag.c && kagVarK == kag.GRANTED) {
            kagVarK = kag.ASK;
        }
        return jagVarF != null ? jagVarF.a(lagVar, kagVarK) : kagVarK;
    }

    public final kag h(lag lagVar, String str, boolean z) {
        kag kagVarG = g(lagVar, str, z);
        return (kagVarG == kag.GRANTED && f03.z(lagVar) == 3) ? kag.ASK : kagVarG;
    }

    public final Set i(boolean z) {
        Set setUnmodifiableSet;
        vzk vzkVarJ = j(z);
        synchronized (vzkVarJ.a) {
            setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(((HashMap) vzkVarJ.b).keySet()));
        }
        return setUnmodifiableSet;
    }

    public final vzk j(boolean z) {
        return z ? this.d : this.c;
    }

    public final void l(List list) {
        this.a.d(new q2g(this, list, (byte) 2)).a(null);
    }

    @Override // defpackage.w6f
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void H(q9g q9gVar) {
        this.f.c(q9gVar);
    }

    public final void n() {
        HashMap mapD = this.c.D();
        k5o k5oVar = this.e;
        k5oVar.getClass();
        ((umi) k5oVar.c).c(new fh4(k5oVar, new HashMap(mapD), (byte) 20)).a(null);
    }

    public final void o(boolean z, String str, lag lagVar, kag kagVar, boolean z2) {
        boolean zF0;
        if (z) {
            vzk vzkVar = this.d;
            synchronized (vzkVar.a) {
                zF0 = vzkVar.f0(str, lagVar, kagVar, false);
            }
        } else {
            vzk vzkVar2 = this.c;
            synchronized (vzkVar2.a) {
                zF0 = vzkVar2.f0(str, lagVar, kagVar, z2);
            }
        }
        if (zF0) {
            if (z2 && !z) {
                n();
            }
            Object[] objArr = {new loj(str, lagVar)};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            l(Collections.unmodifiableList(arrayList));
        }
    }

    public final void p(lag lagVar, kag kagVar) {
        SettingsManager settingsManager = this.b;
        settingsManager.getClass();
        if (kagVar == kag.GRANTED && !SettingsManager.K(lagVar)) {
            kagVar = kag.ASK;
        }
        switch (lagVar.ordinal()) {
            case 1:
                settingsManager.V(kagVar.ordinal(), "notifications_permission_defualt");
                break;
            case 2:
                settingsManager.V(kagVar.ordinal(), "location_permission_defualt");
                break;
            case 3:
                settingsManager.V(kagVar.ordinal(), "protected_media_identifier_permission_default");
                break;
            case 4:
                settingsManager.V(kagVar.ordinal(), "permission_permission_defualt");
                break;
            case 5:
                settingsManager.V(kagVar.ordinal(), "camera_permission_defualt");
                break;
            case 6:
                settingsManager.V(kagVar.ordinal(), "external_apps_permission_default");
                break;
            case 7:
                settingsManager.V(kagVar.ordinal(), "automatic_downloads_permission_default");
                break;
            case 8:
                settingsManager.V(kagVar.ordinal(), "local_network_permission_default");
                break;
        }
    }
}
