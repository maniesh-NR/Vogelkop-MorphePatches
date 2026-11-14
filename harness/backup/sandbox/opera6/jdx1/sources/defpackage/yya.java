package defpackage;

import android.content.Context;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.h;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class yya {
    public final Context a;
    public zya b;
    public Object c;
    public yqa d;
    public final Map e;
    public h f;
    public h g;
    public h h;
    public opj i;
    public lli j;
    public wog k;
    public Object l;

    public yya(Context context) {
        this.a = context;
        this.b = zya.e;
        this.c = null;
        this.d = null;
        this.e = n08.a;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = hn8.b;
    }

    public yya(bza bzaVar, Context context) {
        this.a = context;
        this.b = bzaVar.q;
        this.c = bzaVar.b;
        this.d = bzaVar.c;
        this.e = bzaVar.d;
        aza azaVar = bzaVar.p;
        this.f = azaVar.a;
        this.g = azaVar.b;
        this.h = azaVar.c;
        this.i = azaVar.d;
        this.j = azaVar.e;
        this.k = azaVar.f;
        this.l = bzaVar.o;
    }

    public final bza a() {
        Map mapD0;
        hn8 hn8Var;
        Object obj = this.c;
        if (obj == null) {
            obj = f4f.a;
        }
        Object obj2 = obj;
        yqa yqaVar = this.d;
        Boolean bool = Boolean.FALSE;
        Map map = this.e;
        if (Intrinsics.a(map, bool)) {
            mapD0 = zi4.d0(y9m.r(map));
        } else {
            if (!(map instanceof Map)) {
                t40.h();
                return null;
            }
            mapD0 = map;
        }
        Map map2 = mapD0;
        zya zyaVar = this.b;
        g29 g29Var = zyaVar.a;
        zyaVar.getClass();
        j74 j74Var = j74.c;
        this.b.getClass();
        this.b.getClass();
        CoroutineContext coroutineContext = this.f;
        if (coroutineContext == null) {
            coroutineContext = this.b.b;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        mr6 mr6Var = this.g;
        if (mr6Var == null) {
            this.b.getClass();
            mr6Var = mr6.b;
        }
        mr6 mr6Var2 = mr6Var;
        mr6 mr6Var3 = this.h;
        if (mr6Var3 == null) {
            this.b.getClass();
            mr6Var3 = mr6.b;
        }
        mr6 mr6Var4 = mr6Var3;
        opj opjVar = this.i;
        if (opjVar == null) {
            opjVar = this.b.c;
        }
        opj opjVar2 = opjVar;
        lli lliVar = this.j;
        if (lliVar == null) {
            this.b.getClass();
            lliVar = lli.b;
        }
        lli lliVar2 = lliVar;
        wog wogVar = this.k;
        if (wogVar == null) {
            this.b.getClass();
            wogVar = wog.a;
        }
        wog wogVar2 = wogVar;
        Object obj3 = this.l;
        if (obj3 instanceof gn8) {
            hn8Var = new hn8(zi4.d0(((gn8) obj3).a));
        } else {
            if (!(obj3 instanceof hn8)) {
                t40.h();
                return null;
            }
            hn8Var = (hn8) obj3;
        }
        return new bza(this.a, obj2, yqaVar, map2, g29Var, coroutineContext2, mr6Var2, mr6Var4, j74Var, j74Var, j74Var, opjVar2, lliVar2, wogVar2, hn8Var, new aza(this.f, this.g, this.h, this.i, this.j, this.k), this.b);
    }
}
