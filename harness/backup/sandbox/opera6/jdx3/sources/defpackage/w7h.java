package defpackage;

import android.app.Activity;
import com.opera.android.Lazy;
import com.opera.android.settings.SettingsManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class w7h {
    public final Activity a;
    public final umi b;
    public final SettingsManager c;
    public final Lazy d;
    public final xnh e;
    public final pyl f;
    public final uwh j;
    public final nn7 k;
    public final zy9 l;
    public final i5o m;
    public final i3j n;
    public final wy o;
    public final zv9 p;
    public final gy q;
    public final Lazy t;
    public final Lazy u;
    public final esk v;
    public final HashMap g = new HashMap();
    public final HashMap h = new HashMap();
    public final HashMap i = new HashMap();
    public final HashSet r = new HashSet();
    public final qfb w = new qfb((Object) this, (byte) 25);
    public final r9g s = new r9g((Object) this, (byte) 12);

    public w7h(Activity activity, umi umiVar, SettingsManager settingsManager, Lazy lazy, xnh xnhVar, uwh uwhVar, nn7 nn7Var, zy9 zy9Var, i5o i5oVar, wy wyVar, wjh wjhVar, zv9 zv9Var, x5f x5fVar, gy gyVar, Lazy lazy2, Lazy lazy3, esk eskVar) {
        this.a = activity;
        this.b = umiVar;
        this.c = settingsManager;
        this.d = lazy;
        this.e = xnhVar;
        this.u = lazy3;
        this.v = eskVar;
        this.f = new pyl(wjhVar, x5fVar);
        this.j = uwhVar;
        this.k = nn7Var;
        this.l = zy9Var;
        this.m = i5oVar;
        this.n = wyVar.h;
        this.o = wyVar;
        this.p = zv9Var;
        this.q = gyVar;
        this.t = lazy2;
    }

    public final bz a(dl dlVar) {
        Object obj;
        cz czVar = new cz(dl.class, dlVar.c + "," + String.valueOf(dlVar.d) + "," + String.valueOf(dlVar.e));
        HashMap map = this.g;
        WeakReference weakReference = (WeakReference) map.get(czVar);
        if (weakReference == null) {
            obj = null;
        } else {
            obj = weakReference.get();
            if (obj == null) {
                map.remove(czVar);
                obj = null;
            }
        }
        bz bzVar = (bz) obj;
        if (bzVar != null) {
            return bzVar;
        }
        aye ayeVar = new aye(new yxe(new xd3(new ueg(dlVar, this.o, this.s)), this.k));
        map.put(czVar, new WeakReference(ayeVar));
        return ayeVar;
    }

    public final r68 b(cz czVar) {
        HashMap map = this.i;
        r68 r68Var = (r68) map.get(czVar);
        if (r68Var != null) {
            return r68Var;
        }
        r68 r68Var2 = new r68(this.e);
        map.put(czVar, r68Var2);
        return r68Var2;
    }
}
