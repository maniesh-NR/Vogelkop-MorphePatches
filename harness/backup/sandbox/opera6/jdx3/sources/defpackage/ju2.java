package defpackage;

import J.N;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.opera.android.Lazy;
import com.opera.android.OperaApplication;
import com.opera.android.autofill.PasswordManager;
import com.opera.android.settings.SettingsManager;
import com.opera.android.utilities.DisplayUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ju2 extends lim {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public Object d;

    public ju2(SettingsManager settingsManager, x5f x5fVar, x5f x5fVar2, Lazy lazy, y7f y7fVar, r1 r1Var, tzn tznVar) {
        this.a = (byte) 1;
        zpa zpaVar = x5fVar.d;
        this.b = settingsManager;
        this.c = x5fVar;
        this.d = x5fVar2;
        if (!(y7fVar instanceof v7f)) {
            if (!(y7fVar instanceof w7f) && !Intrinsics.a(y7fVar, x7f.a)) {
                h9o.p();
                throw null;
            }
            String strZ = settingsManager.z("wallpaper_current");
            if (x5fVar.h) {
                x56 x56VarF = zpa.F();
                x56VarF.F(zpaVar).D(75, strZ);
                x5fVar.U0(x56VarF);
            }
            tznVar.invoke();
            return;
        }
        v7f v7fVar = (v7f) y7fVar;
        f7j f7jVar = v7fVar.a;
        settingsManager.getClass();
        settingsManager.V(f7jVar.ordinal(), "app_theme");
        g7j g7jVar = v7fVar.c;
        if (g7jVar != null) {
            settingsManager.R(g7jVar.ordinal(), "app_theme_accent");
        }
        String str = (r1Var == null || (str = r1Var.a) == null) ? v7fVar.b : str;
        String strZ2 = settingsManager.z("wallpaper_current");
        if (x5fVar.h) {
            x56 x56VarF2 = zpa.F();
            x56VarF2.F(zpaVar).D(75, strZ2);
            x5fVar.U0(x56VarF2);
        }
        if (str == null || str.length() == 0) {
            tznVar.invoke();
        } else {
            ((qln) lazy.get()).l(str, 0, new su((Object) this, (Object) str, (Object) tznVar, (byte) 19));
        }
        qln qlnVar = (qln) lazy.get();
        boolean z = v7fVar.d;
        agm agmVar = qlnVar.o;
        SettingsManager settingsManager2 = (SettingsManager) agmVar.b;
        ru9 ru9Var = (ru9) agmVar.c;
        settingsManager2.R(z ? 1 : 0, "wallpaper_rotation_enabled");
        if (!settingsManager2.a.contains("wallpaper_rotation_enabled")) {
            if (z) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                nv6 nv6VarB = ru9Var.b();
                ((SharedPreferences.Editor) nv6VarB.a).putLong("wallpaper.rotation.timestamp", jCurrentTimeMillis);
                nv6VarB.w();
            } else {
                nv6 nv6VarB2 = ru9Var.b();
                ((SharedPreferences.Editor) nv6VarB2.a).putLong("wallpaper.rotation.timestamp", Long.MAX_VALUE);
                nv6VarB2.w();
            }
        }
        onn onnVar = (onn) agmVar.d;
        SettingsManager settingsManager3 = onnVar.f;
        onnVar.d(settingsManager3.i("wallpaper_rotation_enabled"), settingsManager3.a.contains("wallpaper_rotation_enabled"));
    }

    public ju2(dyf dyfVar) {
        this.a = (byte) 4;
        this.d = dyfVar;
        this.c = new j25(dyfVar, (byte) 3);
        this.b = new ayf(dyfVar);
    }

    public /* synthetic */ ju2(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ ju2(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    public ju2(t5d t5dVar, x5f x5fVar) {
        this.a = (byte) 6;
        this.b = t5dVar;
        this.d = (WindowManager) t5dVar.getSystemService("window");
        this.c = x5fVar;
        t5dVar.getLifecycle().a(this);
    }

    private final void S(ndc ndcVar) {
    }

    public final void R(mp0 mp0Var, String str) {
        hf0 hf0Var;
        x5f x5fVar = (x5f) this.d;
        zpa zpaVar = x5fVar.d;
        x56 x56VarF = zpa.F();
        mb0 mb0Var = new mb0(2443, -1, 2);
        mb0Var.q(1, 1, mp0Var);
        mb0Var.q(0, 1, str);
        q56 q56VarZ = x56VarF.z(zpaVar);
        List list = (List) q56VarZ.n(20);
        if (list == null || list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            q56VarZ.q(20, 1, arrayList);
            hf0Var = new hf0(q56VarZ, 20, arrayList);
        } else {
            hf0Var = new hf0(q56VarZ, 20, list);
        }
        hf0Var.add(mb0Var);
        x5fVar.U0(x56VarF);
    }

    @Override // defpackage.as6
    public final void W(ndc ndcVar) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 3:
                ((w6f) obj).F(obj2);
                ((Function0) this.d).invoke();
                break;
            case 4:
                dyf dyfVar = (dyf) this.d;
                Context context = dyfVar.a;
                String[] strArr = OperaApplication.K;
                ((OperaApplication) context.getApplicationContext()).z().b((ayf) obj2);
                ((OperaApplication) context.getApplicationContext()).J().F((j25) obj);
                ite iteVar = hte.k;
                hte hteVarW = na2.w(context);
                ud7 ud7Var = dyfVar.c;
                hteVarW.F(ud7Var);
                cqe cqeVar = bqe.k;
                uup.r(context).F(ud7Var);
                dyfVar.d();
                break;
            case 5:
                s2i s2iVar = new s2i((y3i) obj, cqp.V(ndcVar.getLifecycle()));
                this.d = s2iVar;
                ((q82) obj2).a.b(s2iVar);
                break;
            case 6:
                Point point = new Point();
                WindowManager windowManager = (WindowManager) this.d;
                windowManager.getDefaultDisplay().getSize(point);
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                oe0 oe0Var = i0l.g() ? oe0.d : DisplayUtil.e((t5d) obj2) ? oe0.c : oe0.b;
                x5f x5fVar = (x5f) obj;
                int i = point.x;
                int i2 = point.y;
                float f = displayMetrics.density;
                zpa zpaVar = x5fVar.d;
                x56 x56VarF = zpa.F();
                ra0 ra0VarY = x56VarF.y(zpaVar);
                gp0 gp0Var = (gp0) ra0VarY.n(12);
                if (gp0Var == null) {
                    ra0VarY.q(12, 1, new gp0(2443, 1, 4));
                    gp0Var = (gp0) ra0VarY.n(12);
                }
                gp0Var.o(2, -1, i);
                gp0Var.o(1, -1, i2);
                gp0Var.d[0] = new df0(-1, Float.valueOf(f), (byte) 4);
                gp0Var.q(3, 1, oe0Var);
                x5fVar.U0(x56VarF);
                break;
        }
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        c6j c6jVar;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 3:
                ((w6f) obj).H(obj2);
                ndcVar.getLifecycle().b(this);
                break;
            case 4:
                ndcVar.getLifecycle().b(this);
                dyf dyfVar = (dyf) this.d;
                Context context = dyfVar.a;
                String[] strArr = OperaApplication.K;
                ((OperaApplication) context.getApplicationContext()).z().e((ayf) obj2);
                ((OperaApplication) context.getApplicationContext()).J().H((j25) obj);
                ite iteVar = hte.k;
                hte hteVarW = na2.w(context);
                ud7 ud7Var = dyfVar.c;
                hteVarW.H(ud7Var);
                cqe cqeVar = bqe.k;
                uup.r(context).H(ud7Var);
                if (dyfVar.f.ordinal() == 1 && (c6jVar = dyfVar.h) != null) {
                    c6jVar.c.remove(dyfVar.d);
                    dyfVar.h = null;
                }
                dyfVar.f = cue.None;
                Object objF = dyfVar.b.f();
                if (objF != null) {
                    p0c p0cVar = (p0c) objF;
                    p0cVar.a.H(p0cVar.e);
                    p0cVar.b.H(p0cVar.f);
                    break;
                }
                break;
            case 5:
                ndcVar.getLifecycle().b(this);
                q82 q82Var = (q82) obj2;
                s2i s2iVar = (s2i) this.d;
                q82Var.a.c(s2iVar != null ? s2iVar : null);
                break;
            default:
                super.onDestroy(ndcVar);
                break;
        }
    }

    @Override // defpackage.as6
    public final void onPause(ndc ndcVar) {
        byte b = this.a;
    }

    @Override // defpackage.as6
    public final void onResume(ndc ndcVar) {
        switch (this.a) {
            case 0:
                if (((PasswordManager) this.d) == null) {
                    this.d = new PasswordManager();
                }
                byte b = 0;
                if (!N.MaxktGXn()) {
                    this.d = null;
                    ((x5f) this.c).C(false, false, false);
                    break;
                } else {
                    PasswordManager passwordManager = (PasswordManager) this.d;
                    iu2 iu2Var = new iu2(this, b);
                    passwordManager.getClass();
                    N.MNdH5xQ5(iu2Var);
                    break;
                }
            case 2:
                ((v1a) this.d).a(new y0a(this, (byte) 2));
                break;
        }
    }
}
