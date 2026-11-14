package defpackage;

import android.content.SharedPreferences;
import android.util.SparseBooleanArray;
import com.opera.android.browser.BrowserUtils;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.chromium.content_public.browser.NavigationHandle;

/* loaded from: classes.dex */
public final class b1a extends y08 implements wim, iq9 {
    public final ks3 a;
    public final ea6 b;
    public final x5f c;
    public final z0a d;
    public final SparseBooleanArray e = new SparseBooleanArray();
    public final v1a f;
    public boolean g;
    public final ii h;
    public boolean i;
    public boolean j;

    public b1a(tcc tccVar, ks3 ks3Var, ea6 ea6Var, x5f x5fVar, z0a z0aVar, ii iiVar, v1a v1aVar) {
        this.a = ks3Var;
        this.b = ea6Var;
        this.c = x5fVar;
        this.d = z0aVar;
        this.f = v1aVar;
        this.h = iiVar;
        z5i.e0(iiVar, tccVar, new a1a(this), new fza((byte) 15));
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void E(b2l b2lVar, NavigationHandle navigationHandle) {
        if (navigationHandle.h && !navigationHandle.c && !navigationHandle.b && !navigationHandle.j) {
            int i = navigationHandle.d;
            if (BrowserUtils.d(i) && (i & 255) != 8 && (i & 16777216) == 0 && dti.a(aik.s(BrowserUtils.getRendererUrl(((d7l) b2lVar).j.getUrl()), aik.a))) {
                ea6 ea6Var = this.b;
                ((SharedPreferences) ((b59) ea6Var.c).get()).edit().putLong("visits", ((SharedPreferences) ((b59) ea6Var.c).get()).getLong("visits", 0L) + 1).apply();
            }
        }
        X(false);
    }

    @Override // defpackage.iq9
    public final void F(boolean z, boolean z2) {
        this.j = z;
        X(false);
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void G(b2l b2lVar) {
        x0a x0aVar = (x0a) this.a.f;
        if (x0aVar != null) {
            int i = hi7.u;
            x0aVar.a(ei7.a);
        }
        X(false);
    }

    @Override // defpackage.iq9
    public final void P(boolean z) {
        this.i = z;
        X(false);
    }

    public final ci0 W() {
        ea6 ea6Var = this.b;
        int i = ((k1a) ((l1a) ea6Var.d).i()).a;
        if (i == 0) {
            i = ea6Var.b;
        }
        if (i != 1) {
            if (i == 2) {
                return ci0.c;
            }
            if (i == 4) {
                return ci0.d;
            }
        }
        return ci0.b;
    }

    public final void X(boolean z) {
        boolean z2;
        b2l b2lVar = this.d.b.o;
        if (b2lVar != null) {
            d7l d7lVar = (d7l) b2lVar;
            int id = d7lVar.j.getId();
            boolean zA = dti.a(aik.s(BrowserUtils.getRendererUrl(d7lVar.j.getUrl()), aik.a));
            if (this.g || this.j || this.i || !zA || d7lVar.j.m()) {
                z2 = true;
                break;
            }
            zh7 zh7Var = (zh7) this.h.f();
            if (zh7Var != null) {
                Iterator it = zh7Var.a.iterator();
                while (it.hasNext()) {
                    if (((yh7) it.next()) != yh7.b) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            SparseBooleanArray sparseBooleanArray = this.e;
            if (!zA) {
                sparseBooleanArray.delete(id);
            }
            ks3 ks3Var = this.a;
            if (z2) {
                x0a x0aVar = (x0a) ks3Var.f;
                if (x0aVar != null) {
                    int i = hi7.u;
                    x0aVar.a(ei7.a);
                    return;
                }
                return;
            }
            if (sparseBooleanArray.get(id)) {
                ks3Var.L(null);
                return;
            }
            ea6 ea6Var = this.b;
            b59 b59Var = (b59) ea6Var.c;
            l1a l1aVar = (l1a) ea6Var.d;
            b59 b59Var2 = (b59) ea6Var.c;
            k1a k1aVar = (k1a) l1aVar.i();
            String str = k1aVar.e;
            int i2 = k1aVar.d;
            if (str.isEmpty()) {
                return;
            }
            if (i2 <= 0 || ((SharedPreferences) b59Var2.get()).getLong("show_count", 0L) <= i2) {
                if (TimeUnit.HOURS.toMillis(k1aVar.c) + ((SharedPreferences) b59Var.get()).getLong("previous_show_time", 0L) > System.currentTimeMillis() || ((SharedPreferences) b59Var2.get()).getLong("visits", 0L) < k1aVar.b || ((SharedPreferences) b59Var.get()).getLong("other_close_time", 0L) + 60000 > System.currentTimeMillis()) {
                    return;
                }
                if (!z) {
                    y0a y0aVar = new y0a(this, (byte) 1);
                    v1a v1aVar = this.f;
                    if (v1aVar.c.a) {
                        v1aVar.a(y0aVar);
                        return;
                    } else {
                        y0aVar.run(Boolean.valueOf(v1aVar.a.a.getBoolean("browser.google_sign_in", false)));
                        return;
                    }
                }
                this.c.V(we0.b, W());
                ((SharedPreferences) b59Var2.get()).edit().remove("visits").putLong("show_count", ((SharedPreferences) b59Var2.get()).getLong("show_count", 0L) + 1).putLong("previous_show_time", System.currentTimeMillis()).apply();
                sparseBooleanArray.put(id, true);
                int i3 = ((k1a) l1aVar.i()).a;
                if (i3 == 0) {
                    i3 = ea6Var.b;
                }
                ks3Var.L(i3 != 1 ? i3 != 2 ? i3 != 4 ? new sxh(2132017266, new Object[]{"Google"}) : new sxh(2132017268, new Object[]{"Google"}) : new rxh(2132017267) : new sxh(2132017266, new Object[]{"Google"}));
            }
        }
    }

    @Override // defpackage.wim
    public final void c(boolean z) {
        this.g = z;
        X(false);
    }
}
