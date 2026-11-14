package defpackage;

import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class fmk {
    public final af3 a;
    public final Map b;
    public final ode c;
    public final HashSet d;
    public final jvg e;
    public zzh f;

    public fmk(af3 af3Var, Map map, jvg jvgVar, auj aujVar) {
        emk emkVar = emk.a;
        this.c = new ode(new ylk(new cmk(emkVar, (byte) 19), emkVar));
        this.d = new HashSet();
        this.a = af3Var;
        this.b = map;
        this.e = jvgVar;
    }

    public final void a() {
        ylk ylkVar = (ylk) this.c.g();
        HashSet hashSet = this.d;
        HashSet hashSet2 = new HashSet(hashSet);
        hashSet.clear();
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            ((Callback) it.next()).run(ylkVar);
        }
    }

    public final void b() {
        if (this.f != null) {
            return;
        }
        this.f = new zzh(this, (byte) 10);
        Set setKeySet = this.b.keySet();
        zzh zzhVar = this.f;
        af3 af3Var = this.a;
        if (af3Var.h) {
            af3Var.e(new cz8(new ArrayList(setKeySet), new b94(af3Var.b, zzhVar, (byte) 0)));
        } else {
            zzhVar.run(new v3h(new w3h(), y3h.b));
        }
    }
}
