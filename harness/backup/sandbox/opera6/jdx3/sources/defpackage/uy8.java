package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.opera.android.annotations.WeakOwner;
import com.opera.android.settings.SettingsManager;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class uy8 {

    @NonNull
    @WeakOwner
    private final q8j I;
    public final Context J;
    public final y0f K;
    public final SettingsManager L;
    public qtm a;
    public final s9i b;
    public final jec d;
    public final jec e;
    public final jec f;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public Map m;
    public final b59 n;
    public final HashSet c = new HashSet();
    public final ue2 g = new ue2(this, Looper.getMainLooper(), (byte) 4);
    public final Set q = f(500);
    public final Set r = f(200);
    public final Set s = f(500);
    public final Set t = f(500);
    public final Set u = f(500);
    public final Set v = f(200);
    public final Set w = f(3000);
    public final Set x = f(3000);
    public final Set y = f(1000);
    public final Set z = f(500);
    public final Set A = f(500);
    public final Set B = f(500);
    public final Set C = f(500);
    public final Set D = f(500);
    public final Set E = f(500);
    public final Set F = f(500);
    public final Set G = f(500);
    public final k5o H = new k5o((byte) 4);
    public final qy8 o = new qy8(this, "EVENTS", 1, 60000, true);
    public final qy8 p = new qy8(this, "INFO", 2, 3600000, false);

    public uy8(Context context, stm stmVar, s9i s9iVar, SettingsManager settingsManager, y0f y0fVar) {
        this.n = w1h.l(context, vml.d, "newsfeed_feedback_tracker", new bg1[0]);
        this.J = context;
        wx8 wx8Var = new wx8(this, stmVar);
        this.I = wx8Var;
        stmVar.b(wx8Var);
        this.L = settingsManager;
        this.b = s9iVar;
        this.d = new jec(1000);
        this.e = new jec(500);
        this.f = new jec(500);
        this.m = Collections.EMPTY_MAP;
        this.K = y0fVar;
        he2.a(new iy8(this, (byte) 0), new Void[0]);
    }

    public static Set f(int i) {
        return Collections.newSetFromMap(new xx8(i));
    }

    public static void i(jec jecVar, msh mshVar) {
        List<dy8> listUnmodifiableList = Collections.unmodifiableList(jecVar);
        if (listUnmodifiableList.size() > 100) {
            listUnmodifiableList = listUnmodifiableList.subList(listUnmodifiableList.size() - 100, listUnmodifiableList.size());
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (dy8 dy8Var : listUnmodifiableList) {
            if (dy8Var instanceof ey8) {
                ey8 ey8Var = (ey8) dy8Var;
                if (TextUtils.equals((String) mshVar.v.b, ey8Var.d)) {
                    if (ey8Var.n < 0.0d) {
                        if (ey8Var.m >= 0) {
                            ey8Var.n = (jUptimeMillis - r5) / 1000.0d;
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final void b(List list) {
        if (this.j) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                oqe oqeVar = (oqe) it.next();
                boolean z = oqeVar instanceof msh;
                Set set = this.y;
                k5o k5oVar = this.H;
                if (z) {
                    msh mshVar = (msh) oqeVar;
                    if (!set.contains((String) mshVar.v.b)) {
                        k5oVar.d(mshVar);
                    }
                } else if (oqeVar instanceof ere) {
                    ere ereVar = (ere) oqeVar;
                    k5oVar.d(ereVar);
                    for (msh mshVar2 : ereVar.f) {
                        if (!set.contains((String) mshVar2.v.b)) {
                            k5oVar.d(mshVar2);
                        }
                    }
                }
            }
        }
    }

    public final void c(dy8 dy8Var) {
        d(this.d, dy8Var);
    }

    public final void d(jec jecVar, dy8 dy8Var) {
        jecVar.add(dy8Var);
        n();
        if (this.f.a.size() + this.e.a.size() + this.d.a.size() >= (((SharedPreferences) this.n.get()).getInt("FEEDBACK_TRACKER_ARTICLES_CLICKED", 0) < 15 ? 5 : 25)) {
            this.o.c(true);
        }
    }

    public final void e(zx8 zx8Var) {
        d(this.e, zx8Var);
    }

    public final void g(msh mshVar) {
        String str = (String) mshVar.v.b;
        this.v.remove(str);
        this.u.remove(str);
        this.t.remove(str);
        this.q.remove(str);
        this.s.remove(str);
        this.r.remove(str);
        this.z.remove(str);
        this.A.remove(str);
        this.B.remove(str);
        this.C.remove(str);
        this.D.remove(str);
        if (mshVar instanceof fre) {
            jb8 jb8Var = ((fre) mshVar).D;
            this.F.remove(jb8Var.k);
            this.G.remove(jb8Var.k);
        }
        this.E.remove(str);
        Set set = this.x;
        boolean zContains = set.contains(str);
        Set set2 = this.y;
        Set set3 = this.w;
        if (zContains && !set2.contains(str)) {
            set3.add(str);
            return;
        }
        set3.remove(str);
        this.H.r(str, false);
        set.remove(str);
        set2.remove(str);
    }

    public final void h(int i, msh mshVar) {
        p12 p12Var = mshVar.v;
        String str = (String) p12Var.b;
        boolean zAdd = this.q.add((String) p12Var.b);
        y0f y0fVar = this.K;
        if (zAdd) {
            SharedPreferences sharedPreferences = (SharedPreferences) this.n.get();
            sharedPreferences.edit().putInt("FEEDBACK_TRACKER_ARTICLES_CLICKED", sharedPreferences.getInt("FEEDBACK_TRACKER_ARTICLES_CLICKED", 0) + 1).apply();
            y0fVar.a(mshVar);
            if (this.L.M()) {
                c(new by8(mshVar, (byte) 0));
            }
        }
        if (i == 1) {
            if (this.B.add(str)) {
                x5f x5fVar = y0fVar.a;
                if (x5fVar.h) {
                    zpa zpaVar = x5fVar.d;
                    x56 x56VarF = zpa.F();
                    x56VarF.E(zpaVar).z(zpaVar).e(4);
                    x5fVar.U0(x56VarF);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 2 && this.D.add(str)) {
            x5f x5fVar2 = y0fVar.a;
            if (x5fVar2.h) {
                zpa zpaVar2 = x5fVar2.d;
                x56 x56VarF2 = zpa.F();
                x56VarF2.E(zpaVar2).z(zpaVar2).e(11);
                x5fVar2.U0(x56VarF2);
            }
        }
    }

    public final void j(oqe oqeVar, int i) {
        boolean z = oqeVar instanceof msh;
        k5o k5oVar = this.H;
        if (z) {
            h92 h92Var = (h92) ((HashMap) k5oVar.b).get((String) ((msh) oqeVar).v.b);
            if (h92Var != null) {
                h92Var.d.set(true);
            }
        } else if (oqeVar instanceof ere) {
            i92 i92Var = (i92) ((HashMap) k5oVar.c).get(((ere) oqeVar).e);
            if (i92Var != null) {
                i92Var.c.set(true);
            }
        } else {
            k5oVar.getClass();
        }
        if (z) {
            msh mshVar = (msh) oqeVar;
            String str = (String) mshVar.v.b;
            boolean zAdd = this.x.add(str);
            y0f y0fVar = this.K;
            if (zAdd) {
                x5f x5fVar = y0fVar.a;
                zpa zpaVar = x5fVar.d;
                if (x5fVar.h) {
                    x56 x56VarF = zpa.F();
                    x56VarF.E(zpaVar).z(zpaVar).e(1);
                    x5fVar.U0(x56VarF);
                }
                nb8 nb8Var = mshVar.B;
                if (nb8Var != null) {
                    String str2 = nb8Var.i;
                    if (x5fVar.h) {
                        x56 x56VarF2 = zpa.F();
                        new ck0(zpaVar, x56VarF2).j(new j5f(str2, od0.b, 4));
                        x5fVar.U0(x56VarF2);
                    }
                }
                if (oqeVar instanceof dre) {
                    d(this.f, new ey8(mshVar));
                } else if (oqeVar instanceof ure) {
                    e(new ey8(mshVar));
                } else {
                    c(new ey8(mshVar));
                }
            }
            if (i == 1) {
                if (this.C.add(str)) {
                    x5f x5fVar2 = y0fVar.a;
                    if (x5fVar2.h) {
                        zpa zpaVar2 = x5fVar2.d;
                        x56 x56VarF3 = zpa.F();
                        x56VarF3.E(zpaVar2).z(zpaVar2).e(5);
                        x5fVar2.U0(x56VarF3);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == 2 && this.E.add(str)) {
                x5f x5fVar3 = y0fVar.a;
                if (x5fVar3.h) {
                    zpa zpaVar3 = x5fVar3.d;
                    x56 x56VarF4 = zpa.F();
                    x56VarF4.E(zpaVar3).z(zpaVar3).e(12);
                    x5fVar3.U0(x56VarF4);
                }
            }
        }
    }

    public final void k(msh mshVar, List list, boolean z) {
        int i = z ? 11 : 10;
        if (this.A.add((String) mshVar.v.b)) {
            boolean z2 = mshVar instanceof ure;
            String strG = o18.g(i);
            if (z2) {
                e(new fy8(mshVar, list, strG, (byte) 1));
            } else {
                c(new fy8(mshVar, list, strG, (byte) 1));
            }
            this.o.c(true);
        }
    }

    public final void l(int i, String str) {
        c(new sy8("podcast_card", (i != 0 ? i != 1 ? i != 2 ? "" : "audio_slide_roundup:" : "roundup_slide_roundup:" : "roundup:") + str, (byte) 0));
    }

    public final void m(int i, String str) {
        c(new sy8("podcast_card", (i != 0 ? i != 1 ? i != 2 ? "" : "audio_slide_roundup:" : "roundup_slide_roundup:" : "roundup:") + str, (byte) 1));
    }

    public final void n() {
        if (this.j) {
            if (this.l == 0) {
                this.g.sendEmptyMessageDelayed(3, 5000L);
            }
            this.l++;
        }
    }
}
