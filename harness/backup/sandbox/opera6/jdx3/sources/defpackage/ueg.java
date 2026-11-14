package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.SystemClock;
import com.opera.android.utilities.DisplayUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.SortedSet;

/* loaded from: classes.dex */
public final class ueg extends gtg {
    public final dl d;
    public final wy e;
    public boolean f;
    public boolean g;
    public final ArrayList h;
    public bz i;
    public bz j;

    public ueg(dl dlVar, wy wyVar, r9g r9gVar) {
        super(r9gVar);
        this.f = true;
        this.h = new ArrayList(1);
        this.d = dlVar;
        this.e = wyVar;
    }

    @Override // defpackage.bz
    public final boolean a() {
        return true;
    }

    @Override // defpackage.bz
    public final s50 b() {
        s50 s50VarB;
        s50 s50VarB2;
        bz bzVar = this.i;
        s50 s50Var = s50.f;
        if (bzVar != null && (s50VarB2 = bzVar.b()) != s50Var) {
            return s50VarB2;
        }
        bz bzVar2 = this.j;
        return (bzVar2 == null || (s50VarB = bzVar2.b()) == s50Var) ? this.g ? s50.e : s50Var : s50VarB;
    }

    @Override // defpackage.bz
    public final int c() {
        bz bzVar = this.i;
        if (bzVar != null) {
            return bzVar.c();
        }
        bz bzVar2 = this.j;
        if (bzVar2 != null) {
            return bzVar2.c();
        }
        return 4;
    }

    @Override // defpackage.bz
    public final yz d(az azVar) {
        yz yzVarD;
        bz bzVar;
        bz bzVar2 = this.i;
        dl dlVar = this.d;
        if (bzVar2 != null) {
            yzVarD = bzVar2.d(new s7o(azVar, dlVar));
            if (yzVarD != null) {
                yzVarD.p = azVar.a();
            }
        } else {
            yzVarD = null;
        }
        if (yzVarD == null && (bzVar = this.j) != null && !bzVar.equals(this.i) && (yzVarD = this.j.d(new s7o(azVar, dlVar))) != null) {
            yzVarD.p = azVar.a();
        }
        return yzVarD == null ? m(azVar) : yzVarD;
    }

    @Override // defpackage.bz
    public final void e(zy zyVar, az azVar) {
        teg tegVar = new teg(this, zyVar, azVar);
        bz bzVar = this.i;
        if (bzVar == null) {
            n(tegVar, azVar);
        } else {
            this.i = null;
            bzVar.e(tegVar, new s7o(azVar, this.d));
        }
    }

    @Override // defpackage.gtg
    public final void j(sx sxVar, dl dlVar) {
        bz bzVar = this.i;
        if (bzVar != null) {
            bzVar.g(this.d);
        } else {
            n(null, new m43(dlVar, null, 1, Collections.EMPTY_LIST));
        }
        sxVar.onFailed(null);
    }

    @Override // defpackage.gtg
    public final boolean k(String str) {
        if (this.g) {
            return true;
        }
        bz bzVar = this.i;
        return (bzVar instanceof gtg) && ((gtg) bzVar).k(str);
    }

    public final List l(az azVar) {
        if (azVar.e()) {
            return Collections.EMPTY_LIST;
        }
        i3j i3jVar = this.e.h;
        dl dlVar = this.d;
        SortedSet sortedSet = dlVar.d;
        SortedSet sortedSet2 = dlVar.e;
        boolean z = this.f;
        i3jVar.getClass();
        ArrayList arrayList = new ArrayList();
        if (i3jVar.v(sortedSet, sortedSet2, azVar, z, arrayList)) {
            i3jVar.u();
        }
        Collections.sort(arrayList, new c9((byte) 2));
        return arrayList;
    }

    public final yz m(az azVar) {
        yz yzVar = null;
        if (azVar.e()) {
            return null;
        }
        i3j i3jVar = this.e.h;
        dl dlVar = this.d;
        SortedSet sortedSet = dlVar.d;
        SortedSet sortedSet2 = dlVar.e;
        boolean z = this.f;
        HashMap map = (HashMap) i3jVar.b;
        ArrayList arrayList = new ArrayList();
        boolean zV = i3jVar.v(sortedSet, sortedSet2, azVar, z, arrayList);
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList, new c9((byte) 2));
            yzVar = (yz) arrayList.get(0);
            px pxVar = new px(yzVar);
            List list = (List) map.get(pxVar);
            list.remove(yzVar);
            if (list.isEmpty()) {
                map.remove(pxVar);
            }
            i3jVar.u();
        } else if (zV) {
            i3jVar.u();
        }
        if (yzVar != null) {
            yzVar.p = azVar.a();
        }
        return yzVar;
    }

    public final void n(teg tegVar, az azVar) {
        boolean z;
        if (tegVar != null) {
            this.h.add(new lyf(tegVar, azVar));
        }
        if (this.g) {
            return;
        }
        this.g = true;
        vzk vzkVar = this.e.e;
        o8f o8fVar = new o8f(this, (byte) 22);
        ami amiVar = (ami) vzkVar.b;
        sy syVar = (sy) amiVar.g;
        vzk vzkVar2 = (vzk) amiVar.e;
        xx xxVar = new xx(this.d.c, "null,null");
        HashMap map = (HashMap) amiVar.b;
        zo zoVarA = (zo) map.get(xxVar);
        if (zoVarA == null) {
            SharedPreferences sharedPreferences = (SharedPreferences) ((b59) amiVar.f).get();
            String strG = ami.g(xxVar);
            long j = sharedPreferences.getLong(strG.concat("_timestamp"), 0L);
            if (j == 0) {
                zoVarA = null;
            } else {
                if (System.currentTimeMillis() > j + 1296000000) {
                    ami.s(sharedPreferences, strG);
                } else {
                    String string = sharedPreferences.getString(strG.concat("_url"), null);
                    if (string == null || string.equals(((Uri) ((r9i) syVar.get()).c).toString())) {
                        zoVarA = zo.a(sharedPreferences.getString(strG.concat("_data"), ""), (String) ((lyf) xxVar).a, new ix5((byte) 21), true);
                        if (zoVarA != null) {
                            if (((cy) vzkVar2.a).c().j.contains((String) ((lyf) xxVar).a)) {
                                map.put(xxVar, zoVarA);
                            }
                        }
                    } else {
                        ami.s(sharedPreferences, strG);
                    }
                }
                zoVarA = null;
            }
        }
        wjh wjhVar = (wjh) amiVar.h;
        boolean z2 = zoVarA != null;
        o59 o59Var = (o59) wjhVar.f;
        if (o59Var != null && o59Var.e <= -1) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            o59 o59Var2 = (o59) wjhVar.f;
            o59Var.e = jUptimeMillis - o59Var2.b;
            o59Var2.n = z2;
            wjhVar.p();
        }
        if (zoVarA != null) {
            o8fVar.run(zoVarA);
            if (SystemClock.elapsedRealtime() < zoVarA.c) {
                return;
            } else {
                o8fVar = null;
            }
        }
        HashMap map2 = (HashMap) amiVar.c;
        List arrayList = (List) map2.get(xxVar);
        if (arrayList != null) {
            z = true;
        } else {
            arrayList = new ArrayList(1);
            map2.put(xxVar, arrayList);
            z = false;
        }
        if (o8fVar != null) {
            arrayList.add(o8fVar);
        }
        if (z) {
            return;
        }
        r9i r9iVar = (r9i) syVar.get();
        long jCurrentTimeMillis = System.currentTimeMillis();
        i5o i5oVar = (i5o) vzkVar2.d;
        Context context = (Context) amiVar.d;
        String str = (String) ((lyf) xxVar).a;
        yx yxVar = new yx(amiVar, xxVar, r9iVar, jCurrentTimeMillis);
        i5oVar.getClass();
        Uri.Builder builderBuildUpon = ((Uri) r9iVar.c).buildUpon();
        builderBuildUpon.appendQueryParameter("pid", str);
        builderBuildUpon.appendQueryParameter("w", String.valueOf(DisplayUtil.c(context)));
        builderBuildUpon.appendQueryParameter("h", String.valueOf(DisplayUtil.b(context)));
        ((iy) i5oVar.a).d(new py(i5oVar, builderBuildUpon, new qy(i5oVar, 1, (Uri) r9iVar.d, str), new bi(yxVar, (byte) 13)));
    }
}
