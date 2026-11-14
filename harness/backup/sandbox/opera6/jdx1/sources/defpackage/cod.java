package defpackage;

import android.content.ComponentName;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Objects;

/* loaded from: classes.dex */
public class cod {
    public final bod a;
    public final String b;
    public final String c;
    public String d;
    public String e;
    public Uri f;
    public boolean g;
    public final boolean h;
    public int i;
    public boolean j;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public Bundle s;
    public IntentSender t;
    public bnd u;
    public final ArrayList k = new ArrayList();
    public int r = -1;
    public ArrayList v = new ArrayList();

    public cod(bod bodVar, String str, String str2, boolean z) {
        this.a = bodVar;
        this.b = str;
        this.c = str2;
        this.h = z;
    }

    public static rnd b() {
        dod.b();
        snd sndVar = dod.c().e;
        if (sndVar instanceof rnd) {
            return (rnd) sndVar;
        }
        return null;
    }

    public final ynd a() {
        if (this instanceof ynd) {
            return (ynd) this;
        }
        return null;
    }

    public final und c() {
        dod.b();
        return this.a.a;
    }

    public final boolean d() {
        dod.b();
        cod codVar = dod.c().w;
        if (codVar == null) {
            qp2.n("There is no default route.  The media router has not yet been fully initialized.");
            return false;
        }
        if (codVar == this || this.n == 3) {
            return true;
        }
        return TextUtils.equals(((ComponentName) c().b.b).getPackageName(), "android") && m("android.media.intent.category.LIVE_AUDIO") && !m("android.media.intent.category.LIVE_VIDEO");
    }

    public final boolean e() {
        return !this.v.isEmpty();
    }

    public final boolean f() {
        return this.u != null && this.g;
    }

    public final boolean g() {
        dod.b();
        return dod.c().h() == this;
    }

    public final boolean h(vnd vndVar) {
        if (vndVar == null) {
            qp2.o("selector must not be null");
            return false;
        }
        dod.b();
        vndVar.a();
        if (!vndVar.b.isEmpty()) {
            ArrayList arrayList = this.k;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                IntentFilter intentFilter = (IntentFilter) obj;
                if (intentFilter != null) {
                    Iterator it = vndVar.b.iterator();
                    while (it.hasNext()) {
                        if (intentFilter.hasCategory((String) it.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int i(bnd bndVar) {
        int i;
        int i2;
        cod codVar;
        int iCountActions;
        int i3 = 0;
        if (this.u != bndVar) {
            this.u = bndVar;
            if (bndVar != null) {
                Bundle bundle = bndVar.a;
                if (Objects.equals(this.d, bundle.getString("name"))) {
                    i = 0;
                } else {
                    this.d = bundle.getString("name");
                    i = 1;
                }
                if (!Objects.equals(this.e, bundle.getString(NotificationCompat.CATEGORY_STATUS))) {
                    this.e = bundle.getString(NotificationCompat.CATEGORY_STATUS);
                    i = 1;
                }
                Uri uri = this.f;
                String string = bundle.getString("iconUri");
                if (!Objects.equals(uri, string == null ? null : Uri.parse(string))) {
                    String string2 = bundle.getString("iconUri");
                    this.f = string2 == null ? null : Uri.parse(string2);
                    i = 1;
                }
                if (this.g != bundle.getBoolean("enabled", true)) {
                    this.g = bundle.getBoolean("enabled", true);
                    i = 1;
                }
                if (this.i != bundle.getInt("connectionState", 0)) {
                    this.i = bundle.getInt("connectionState", 0);
                    i = 1;
                }
                ArrayList arrayListB = bndVar.b();
                ArrayList arrayList = this.k;
                if (arrayList != arrayListB) {
                    ListIterator listIterator = arrayList.listIterator();
                    ListIterator listIterator2 = arrayListB.listIterator();
                    loop0: while (listIterator.hasNext() && listIterator2.hasNext()) {
                        IntentFilter intentFilter = (IntentFilter) listIterator.next();
                        IntentFilter intentFilter2 = (IntentFilter) listIterator2.next();
                        if (intentFilter != intentFilter2) {
                            if (intentFilter == null || intentFilter2 == null || (iCountActions = intentFilter.countActions()) != intentFilter2.countActions()) {
                                break;
                            }
                            int i4 = 0;
                            while (true) {
                                if (i4 < iCountActions) {
                                    if (!intentFilter.getAction(i4).equals(intentFilter2.getAction(i4))) {
                                        break loop0;
                                    }
                                    i4++;
                                } else {
                                    int iCountCategories = intentFilter.countCategories();
                                    if (iCountCategories != intentFilter2.countCategories()) {
                                        break;
                                    }
                                    for (int i5 = 0; i5 < iCountCategories; i5++) {
                                        if (!intentFilter.getCategory(i5).equals(intentFilter2.getCategory(i5))) {
                                            break loop0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (listIterator.hasNext() || listIterator2.hasNext()) {
                        arrayList.clear();
                        arrayList.addAll(bndVar.b());
                        i = 1;
                    }
                }
                if (this.l != bundle.getInt("playbackType", 1)) {
                    this.l = bundle.getInt("playbackType", 1);
                    i = 1;
                }
                if (this.m != bundle.getInt("playbackStream", -1)) {
                    this.m = bundle.getInt("playbackStream", -1);
                    i = 1;
                }
                if (this.n != bundle.getInt("deviceType")) {
                    this.n = bundle.getInt("deviceType");
                    i = 1;
                }
                int i6 = 3;
                if (this.o != bundle.getInt("volumeHandling", 0)) {
                    this.o = bundle.getInt("volumeHandling", 0);
                    i = 3;
                }
                if (this.p != bundle.getInt("volume")) {
                    this.p = bundle.getInt("volume");
                    i = 3;
                }
                if (this.q != bundle.getInt("volumeMax")) {
                    this.q = bundle.getInt("volumeMax");
                } else {
                    i6 = i;
                }
                if (this.r != bundle.getInt("presentationDisplayId", -1)) {
                    this.r = bundle.getInt("presentationDisplayId", -1);
                    i6 |= 5;
                }
                if (!Objects.equals(this.s, bundle.getBundle("extras"))) {
                    this.s = bundle.getBundle("extras");
                    i6 |= 1;
                }
                if (!Objects.equals(this.t, (IntentSender) j14.T(bundle, "settingsIntent", IntentSender.class))) {
                    this.t = (IntentSender) j14.T(bundle, "settingsIntent", IntentSender.class);
                    i6 |= 1;
                }
                if (this.j != bundle.getBoolean("canDisconnect", false)) {
                    this.j = bundle.getBoolean("canDisconnect", false);
                    i6 |= 5;
                }
                ArrayList arrayListC = bndVar.c();
                ArrayList arrayList2 = new ArrayList();
                boolean z = arrayListC.size() != this.v.size();
                if (!arrayListC.isEmpty()) {
                    ez9 ez9VarC = dod.c();
                    int size = arrayListC.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayListC.get(i7);
                        i7++;
                        ez9VarC.getClass();
                        String str = (String) ez9VarC.l.get(new lyf(((ComponentName) this.a.d.b).flattenToShortString(), (String) obj));
                        ArrayList arrayList3 = ez9VarC.j;
                        int size2 = arrayList3.size();
                        int i8 = i3;
                        while (true) {
                            if (i8 >= size2) {
                                i2 = i3;
                                codVar = null;
                                break;
                            }
                            Object obj2 = arrayList3.get(i8);
                            i8++;
                            codVar = (cod) obj2;
                            i2 = i3;
                            if (codVar.c.equals(str)) {
                                break;
                            }
                            i3 = i2;
                        }
                        if (codVar != null) {
                            arrayList2.add(codVar);
                            if (!z && !this.v.contains(codVar)) {
                                z = true;
                            }
                        }
                        i3 = i2;
                    }
                }
                if (!z) {
                    return i6;
                }
                this.v = arrayList2;
                return i6 | 1;
            }
        }
        return 0;
    }

    public final void j(int i) {
        dod.b();
        ez9 ez9VarC = dod.c();
        int iMin = Math.min(this.q, Math.max(0, i));
        snd sndVarG = ez9VarC.g(this);
        if (sndVarG != null) {
            sndVarG.f(iMin);
        }
    }

    public final void k(int i) {
        snd sndVarG;
        dod.b();
        if (i == 0 || (sndVarG = dod.c().g(this)) == null) {
            return;
        }
        sndVarG.i(i);
    }

    public final void l(boolean z) {
        dod.b();
        dod.c().l(this, 3, 1, z);
    }

    public final boolean m(String str) {
        dod.b();
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((IntentFilter) obj).hasCategory(str)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb.append(this.c);
        sb.append(", name=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", iconUri=");
        sb.append(this.f);
        sb.append(", enabled=");
        sb.append(this.g);
        sb.append(", isSystemRoute=");
        sb.append(this.h);
        sb.append(", connectionState=");
        sb.append(this.i);
        sb.append(", canDisconnect=");
        sb.append(this.j);
        sb.append(", playbackType=");
        sb.append(this.l);
        sb.append(", playbackStream=");
        sb.append(this.m);
        sb.append(", deviceType=");
        sb.append(this.n);
        sb.append(", volumeHandling=");
        sb.append(this.o);
        sb.append(", volume=");
        sb.append(this.p);
        sb.append(", volumeMax=");
        sb.append(this.q);
        sb.append(", presentationDisplayId=");
        sb.append(this.r);
        sb.append(", extras=");
        sb.append(this.s);
        sb.append(", settingsIntent=");
        sb.append(this.t);
        sb.append(", providerPackageName=");
        sb.append(((ComponentName) this.a.d.b).getPackageName());
        if (e()) {
            sb.append(", members=[");
            int size = this.v.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                if (this.v.get(i) != this) {
                    sb.append(((cod) this.v.get(i)).c);
                }
            }
            sb.append(']');
        }
        sb.append(" }");
        return sb.toString();
    }
}
