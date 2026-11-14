package defpackage;

import com.opera.android.settings.SettingsManager;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class onn {
    public final ni6 a;
    public final b59 b;
    public final mgh c;
    public final x5f d;
    public final x5f e;
    public final SettingsManager f;
    public mnn g;
    public nnn h;

    public onn(b59 b59Var, ni6 ni6Var, b59 b59Var2, mgh mghVar, x5f x5fVar, x5f x5fVar2, SettingsManager settingsManager) {
        this.a = ni6Var;
        this.b = b59Var2;
        this.c = mghVar;
        this.d = x5fVar;
        this.e = x5fVar2;
        this.f = settingsManager;
        b59Var.a(new a00(this, (byte) 10));
        d(settingsManager.i("wallpaper_rotation_enabled"), settingsManager.a.contains("wallpaper_rotation_enabled"));
    }

    public final void a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ni6 ni6Var = this.a;
        ni6Var.b(jCurrentTimeMillis);
        long jA = ni6Var.a(jCurrentTimeMillis);
        x5f x5fVar = this.e;
        zpa zpaVar = x5fVar.d;
        x56 x56VarF = zpa.F();
        x56VarF.N(zpaVar).p(3, 1, jA);
        x5fVar.U0(x56VarF);
    }

    public final void b(String str) {
        wln wlnVar;
        mu0 mu0Var;
        nnn nnnVar = this.h;
        if (nnnVar != null) {
            switch (nnnVar.a.ordinal()) {
                case 0:
                    mu0Var = mu0.b;
                    break;
                case 1:
                    mu0Var = mu0.c;
                    break;
                case 2:
                    mu0Var = mu0.d;
                    break;
                case 3:
                    mu0Var = mu0.e;
                    break;
                case 4:
                    mu0Var = mu0.f;
                    break;
                case 5:
                    mu0Var = mu0.g;
                    break;
                case 6:
                    mu0Var = mu0.h;
                    break;
                case 7:
                    mu0Var = mu0.i;
                    break;
                default:
                    h9o.p();
                    return;
            }
            vb0 vb0Var = nnnVar.c != null ? vb0.b : vb0.c;
            boolean z = nnnVar.b;
            if (str.startsWith("FILE_storefront_wallpaper_")) {
                str = "store-wallpaper";
            } else if (str.startsWith("FILE_user_wallpaper_")) {
                str = "user-wallpaper";
            }
            x5f x5fVar = this.d;
            if (x5fVar.h) {
                zpa zpaVar = x5fVar.d;
                lu0 lu0Var = new lu0(2443, -1, 4);
                lu0Var.q(1, 1, mu0Var);
                lu0Var.q(0, 1, vb0Var);
                lu0Var.q(3, 1, str);
                lu0Var.r(2, 1, z);
                x56 x56VarF = zpa.F();
                xb0 xb0VarX = x56VarF.B(zpaVar).x(zpaVar);
                List list = (List) xb0VarX.n(42);
                ((list == null || list.isEmpty()) ? new hf0(xb0VarX, 42, am2.q(xb0VarX, 42, 1)) : new hf0(xb0VarX, 42, list)).add(lu0Var);
                x5fVar.U0(x56VarF);
            }
        }
        nnn nnnVar2 = this.h;
        if (nnnVar2 == null || (wlnVar = nnnVar2.a) == null || !(wlnVar == wln.a || wlnVar == wln.e || wlnVar == wln.f)) {
            this.h = null;
        }
    }

    public final void c(aln alnVar, int i, iu0 iu0Var) {
        if (alnVar == null || iu0Var == null) {
            return;
        }
        int type = alnVar.getType();
        pu0 pu0Var = null;
        uu0 uu0Var = type != 0 ? type != 1 ? type != 2 ? null : uu0.d : uu0.c : uu0.b;
        switch (i) {
            case 0:
                pu0Var = pu0.b;
                break;
            case 1:
                pu0Var = pu0.c;
                break;
            case 2:
                pu0Var = pu0.d;
                break;
            case 3:
                pu0Var = pu0.e;
                break;
            case 4:
                pu0Var = pu0.f;
                break;
            case 5:
                pu0Var = pu0.g;
                break;
            case 6:
                pu0Var = pu0.h;
                break;
            case 7:
                pu0Var = pu0.i;
                break;
            case 8:
                pu0Var = pu0.j;
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                pu0Var = pu0.k;
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                pu0Var = pu0.l;
                break;
            case 11:
                pu0Var = pu0.m;
                break;
            case 12:
                pu0Var = pu0.n;
                break;
            case 13:
                pu0Var = pu0.o;
                break;
            case 14:
                pu0Var = pu0.p;
                break;
            case 15:
                pu0Var = pu0.q;
                break;
        }
        if (uu0Var == null || pu0Var == null) {
            return;
        }
        String id = alnVar.getId();
        if (id.startsWith("FILE_storefront_wallpaper_")) {
            id = "store-wallpaper";
        } else if (id.startsWith("FILE_user_wallpaper_")) {
            id = "user-wallpaper";
        }
        String strC = am2.c(alnVar.f());
        x5f x5fVar = this.d;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            b66 b66VarF = x56VarF.F(zpaVar);
            if (iu0Var == iu0.b) {
                qu0 qu0Var = (qu0) b66VarF.n(64);
                if (qu0Var == null) {
                    b66VarF.q(64, 1, zpa.N());
                    qu0Var = (qu0) b66VarF.n(64);
                }
                x5f.W0(qu0Var, uu0Var, id, strC, pu0Var);
            } else if (iu0Var == iu0.d) {
                x5f.W0(b66VarF.z(), uu0Var, id, strC, pu0Var);
            } else if (iu0Var == iu0.c) {
                x5f.W0(b66VarF.A(), uu0Var, id, strC, pu0Var);
            } else if (iu0Var == iu0.e) {
                x5f.W0(b66VarF.z(), uu0Var, id, strC, pu0Var);
                x5f.W0(b66VarF.A(), uu0Var, id, strC, pu0Var);
            }
            np0 np0Var = new np0(2443, -1, 4);
            np0Var.q(0, 1, id);
            np0Var.q(1, 1, strC);
            np0Var.q(2, 1, pu0Var);
            np0Var.q(3, 1, iu0Var);
            qd0 qd0VarB = x56VarF.B(zpaVar);
            List list = (List) qd0VarB.n(51);
            ((list == null || list.isEmpty()) ? new hf0(qd0VarB, 51, vep.t(qd0VarB, 51, 1)) : new hf0(qd0VarB, 51, list)).add(np0Var);
            x5fVar.U0(x56VarF);
        }
    }

    public final void d(boolean z, boolean z2) {
        Pair pair = new Pair(Boolean.valueOf(z), Boolean.valueOf(z2));
        Boolean bool = Boolean.TRUE;
        boolean zEquals = pair.equals(new Pair(bool, bool));
        x5f x5fVar = this.d;
        if (zEquals) {
            x5fVar.R0(ou0.b);
            return;
        }
        Boolean bool2 = Boolean.FALSE;
        if (pair.equals(new Pair(bool2, bool))) {
            x5fVar.R0(ou0.c);
        } else if (pair.equals(new Pair(bool, bool2))) {
            x5fVar.R0(ou0.e);
        } else if (pair.equals(new Pair(bool2, bool2))) {
            x5fVar.R0(ou0.d);
        }
    }
}
