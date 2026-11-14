package ads_mobile_sdk;

import defpackage.bhj;
import defpackage.cek;
import defpackage.fsg;
import defpackage.sgb;
import defpackage.sto;
import defpackage.xe6;
import defpackage.xp9;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class z2 extends k8 implements rko, dfp {
    public final a2 c;
    public final AtomicBoolean d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;

    public z2(nx5 nx5Var, Map map, a2 a2Var) {
        super(nx5Var, map);
        this.c = a2Var;
        this.d = new AtomicBoolean(false);
        this.e = new AtomicBoolean(false);
        this.f = new AtomicBoolean(false);
        new AtomicBoolean(false);
    }

    public final Object a(mt5 mt5Var) {
        if (!this.f.getAndSet(true)) {
            for (Map.Entry entry : ((Map) ((k8) this).b).entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                mt5 mt5Var2 = null;
                defpackage.na2.B((nx5) ((k8) this).a, h.a, null, new fsg(new xe6(str, value, mt5Var2, (byte) 11), mt5Var2, (byte) 3), 2);
            }
        }
        return Unit.a;
    }

    public final Object a(xp9 xp9Var, mt5 mt5Var) {
        for (Map.Entry entry : ((Map) ((k8) this).b).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            mt5 mt5Var2 = null;
            xp9 xp9Var2 = xp9Var;
            defpackage.na2.B((nx5) ((k8) this).a, h.a, null, new fsg(new cek(str, value, mt5Var2, (Object) xp9Var2, (byte) 20), mt5Var2, (byte) 3), 2);
            xp9Var = xp9Var2;
        }
        return Unit.a;
    }

    public final Unit a(String str, String str2, mt5 mt5Var) {
        for (Map.Entry entry : ((Map) ((k8) this).b).entrySet()) {
            String str3 = (String) entry.getKey();
            Object value = entry.getValue();
            String str4 = str;
            String str5 = str2;
            defpackage.na2.B((nx5) ((k8) this).a, h.a, null, new fsg(new bhj(str3, value, (mt5) null, (Object) str4, (Object) str5, (byte) 11), null, (byte) 3), 2);
            str = str4;
            str2 = str5;
        }
        return Unit.a;
    }

    public final Unit a(String str, mt5 mt5Var) {
        for (Map.Entry entry : ((Map) ((k8) this).b).entrySet()) {
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            mt5 mt5Var2 = null;
            String str3 = str;
            defpackage.na2.B((nx5) ((k8) this).a, h.a, null, new fsg(new sto(str2, value, mt5Var2, (Object) str3, (byte) 11), mt5Var2, (byte) 3), 2);
            str = str3;
        }
        return Unit.a;
    }

    public final Unit a(defpackage.qq qqVar, mt5 mt5Var) {
        for (Map.Entry entry : ((Map) ((k8) this).b).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            mt5 mt5Var2 = null;
            defpackage.qq qqVar2 = qqVar;
            defpackage.na2.B((nx5) ((k8) this).a, h.a, null, new fsg(new cek(str, value, mt5Var2, (Object) qqVar2, (byte) 23), mt5Var2, (byte) 3), 2);
            qqVar = qqVar2;
        }
        return Unit.a;
    }

    public final Unit d(mt5 mt5Var) {
        px5 px5VarO = o(mt5Var);
        return px5VarO == px5.a ? px5VarO : Unit.a;
    }

    public final Unit e() {
        for (Map.Entry entry : ((Map) ((k8) this).b).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            mt5 mt5Var = null;
            defpackage.na2.B((nx5) ((k8) this).a, h.a, null, new fsg(new xe6(str, value, mt5Var, (byte) 20), mt5Var, (byte) 3), 2);
        }
        return Unit.a;
    }

    public final Unit e(mt5 mt5Var) {
        for (Map.Entry entry : ((Map) ((k8) this).b).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            mt5 mt5Var2 = null;
            defpackage.na2.B((nx5) ((k8) this).a, h.a, null, new fsg(new xe6(str, value, mt5Var2, (byte) 26), mt5Var2, (byte) 3), 2);
        }
        return Unit.a;
    }

    public final Object g(mt5 mt5Var) {
        for (Map.Entry entry : ((Map) ((k8) this).b).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            mt5 mt5Var2 = null;
            defpackage.na2.B((nx5) ((k8) this).a, h.a, null, new fsg(new xe6(str, value, mt5Var2, (byte) 14), mt5Var2, (byte) 3), 2);
        }
        return Unit.a;
    }

    public final Unit h(mt5 mt5Var) {
        Object objG = g(mt5Var);
        if (objG != px5.a) {
            objG = Unit.a;
        }
        return (Unit) objG;
    }

    public final Object i(mt5 mt5Var) {
        Object objQ = sgb.q(new v2(this, null, (byte) 0), mt5Var);
        return objQ == px5.a ? objQ : Unit.a;
    }

    public final Object j(mt5 mt5Var) {
        for (Map.Entry entry : ((Map) ((k8) this).b).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            mt5 mt5Var2 = null;
            defpackage.na2.B((nx5) ((k8) this).a, h.a, null, new fsg(new xe6(str, value, mt5Var2, (byte) 22), mt5Var2, (byte) 3), 2);
        }
        return Unit.a;
    }

    public final Object n(mt5 mt5Var) {
        for (Map.Entry entry : ((Map) ((k8) this).b).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            mt5 mt5Var2 = null;
            defpackage.na2.B((nx5) ((k8) this).a, h.a, null, new fsg(new xe6(str, value, mt5Var2, (byte) 10), mt5Var2, (byte) 3), 2);
        }
        return Unit.a;
    }

    public final Unit o(mt5 mt5Var) {
        for (Map.Entry entry : ((Map) ((k8) this).b).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            mt5 mt5Var2 = null;
            defpackage.na2.B((nx5) ((k8) this).a, h.a, null, new fsg(new xe6(str, value, mt5Var2, (byte) 24), mt5Var2, (byte) 3), 2);
        }
        return Unit.a;
    }

    public final Object q(mt5 mt5Var) {
        px5 px5VarA;
        if (this.d.getAndSet(true)) {
            return Unit.a;
        }
        for (Map.Entry entry : ((Map) ((k8) this).b).entrySet()) {
            mt5 mt5Var2 = null;
            defpackage.na2.B((nx5) ((k8) this).a, h.a, null, new fsg(new xe6((String) entry.getKey(), entry.getValue(), mt5Var2, (byte) 17), mt5Var2, (byte) 3), 2);
        }
        o9 o9Var = this.c.m;
        return o9Var == null ? Unit.a : (o9Var.a == q9.g && !this.e.getAndSet(true) && (px5VarA = a(new defpackage.qq(o9Var.c, o9Var.b, o9Var.d), mt5Var)) == px5.a) ? px5VarA : Unit.a;
    }
}
