package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.opera.android.BrowserActivity;
import com.opera.android.bar.OmniBoxRoot;
import com.opera.android.bar.OmniButtonView;
import com.opera.android.custom_views.ToolbarProgressBar;
import com.opera.android.osp.OspCollectorService;
import com.opera.android.settings.SettingsManager;
import com.opera.api.Callback;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public abstract class z43 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public final Object f;
    public Object g;
    public Object h;
    public final Object i;

    public z43(BrowserActivity browserActivity, pt3 pt3Var, k6l k6lVar, esk eskVar, ViewGroup viewGroup, ysl yslVar, pde pdeVar) {
        gbf gbfVarR0;
        this.h = new i7f();
        this.b = viewGroup;
        this.c = k6lVar;
        this.d = eskVar;
        byte b = pt3Var.a;
        BrowserActivity browserActivity2 = pt3Var.b;
        switch (b) {
            case 5:
                int i = BrowserActivity.E1;
                gbfVarR0 = browserActivity2.r0(this);
                break;
            case 6:
                int i2 = BrowserActivity.E1;
                gbfVarR0 = browserActivity2.r0(this);
                break;
            case 7:
                int i3 = BrowserActivity.E1;
                gbfVarR0 = browserActivity2.r0(this);
                break;
            case 8:
                int i4 = BrowserActivity.E1;
                gbfVarR0 = browserActivity2.r0(this);
                break;
            default:
                int i5 = BrowserActivity.E1;
                gbfVarR0 = browserActivity2.r0(this);
                break;
        }
        this.i = gbfVarR0;
        this.e = yslVar;
        ToolbarProgressBar toolbarProgressBar = (ToolbarProgressBar) viewGroup.findViewById(2131363061);
        v43 v43Var = new v43(this);
        this.f = v43Var;
        aib.A(toolbarProgressBar, browserActivity.getLifecycle(), v43Var, new oc2(this, (byte) 7));
        this.g = new w43(browserActivity, k6lVar, pdeVar);
        byte b2 = 1;
        p37.A(viewGroup, this, new ll2(this, b2), new ol2(this, b2));
    }

    public z43(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.f = new ReentrantLock();
        this.i = new xbk(this);
    }

    public void A(x43 x43Var) {
    }

    public void B(boolean z) {
    }

    public final void C(String str, String str2) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f;
        reentrantLock.lock();
        try {
            if (!this.a) {
                this.g = (str == null || str.length() == 0) ? null : Uri.parse((String) this.c).buildUpon().authority(str).build().toString();
                if (str2 == null || str2.length() == 0) {
                    str2 = null;
                }
                this.h = str2;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean D(Context context, boolean z) {
        ab9 ab9Var;
        ReentrantLock reentrantLock = (ReentrantLock) this.f;
        reentrantLock.lock();
        try {
            String str = (String) this.g;
            if (str == null) {
                str = (String) this.c;
            }
            String str2 = (String) this.h;
            if (str2 == null) {
                str2 = (String) this.d;
            }
            reentrantLock.unlock();
            zsf zsfVar = (zsf) ((xbk) this.i).d(context);
            String str3 = (String) this.b;
            boolean z2 = false;
            ab9 ab9Var2 = null;
            if (zsfVar.g.compareAndSet(false, true)) {
                try {
                    synchronized (zsfVar.i) {
                        if (!((SharedPreferences) zsfVar.f.b).contains("AvroOspPending")) {
                            if (!zsfVar.h.isEmpty()) {
                                rsf rsfVarB = zsfVar.e.b();
                                vg vgVarY = zsfVar.d.y();
                                rsfVarB.i(vgVarY.b, vgVarY.a);
                                synchronized (zsfVar.i) {
                                    rsf rsfVar = zsfVar.h;
                                    zsfVar.b();
                                    if (rsfVar.f() == null) {
                                        UUID uuidRandomUUID = UUID.randomUUID();
                                        rsfVar.j(Base64.encodeToString(ByteBuffer.allocate(16).putLong(uuidRandomUUID.getMostSignificantBits()).putLong(uuidRandomUUID.getLeastSignificantBits()).array(), 2));
                                    }
                                    rsf rsfVarE = rsfVarB.e(rsfVar);
                                    rsfVarE.d(zsfVar.h);
                                    zsfVar.d(true);
                                    zsfVar.f.z("AvroOspPending", rsfVarE);
                                    b59 b59Var = zsfVar.c;
                                    if (((SharedPreferences) b59Var.get()).contains("StatsFiltered")) {
                                        zsfVar.f(1L, !((SharedPreferences) b59Var.get()).getBoolean("StatsFiltered", false));
                                    }
                                    ab9Var = new ab9(((SharedPreferences) b59Var.get()).getLong("Consents", 0L), rsfVarE);
                                }
                                zsfVar.g.set(false);
                                ab9Var2 = ab9Var;
                            }
                        }
                    }
                } finally {
                    zsfVar.g.set(false);
                }
            }
            if (ab9Var2 == null) {
                return false;
            }
            ((rsf) ab9Var2.d).b(ab9Var2.a, z);
            try {
                try {
                    ctf ctfVar = new ctf(context, str3, str, str2);
                    int iA = ctfVar.a(ab9Var2);
                    ab9Var2.c = iA;
                    ab9Var2.b = ctfVar.d;
                    if (iA == 1) {
                        z2 = true;
                    }
                } catch (Exception unused) {
                    ab9Var2.c = 4;
                }
                return z2;
            } finally {
                zsfVar.c(ab9Var2);
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public jm7 a() {
        return new jm7(true, 0);
    }

    public v73 b(OmniBoxRoot omniBoxRoot, ydn ydnVar, BrowserActivity browserActivity, lg lgVar, SettingsManager settingsManager, wth wthVar, in3 in3Var, k5o k5oVar, ikc ikcVar, u0a u0aVar) {
        return new fq3(omniBoxRoot, ydnVar, browserActivity, lgVar, settingsManager, wthVar, in3Var, k5oVar, ikcVar, u0aVar, (byte) 0);
    }

    public dbl c(Context context, wv1 wv1Var, du3 du3Var, nue nueVar, du3 du3Var2, nwf nwfVar) {
        return null;
    }

    public final void d() {
        ((gbf) this.i).n();
        ViewGroup viewGroup = (ViewGroup) this.b;
        if (viewGroup.isLaidOut()) {
            v();
        } else {
            q9n.d(new va2(this, (byte) 11), viewGroup);
        }
    }

    public abstract int e();

    public ImageView f() {
        return null;
    }

    public View g(nje njeVar) {
        return null;
    }

    public View h() {
        return null;
    }

    public bp i() {
        OmniButtonView omniButtonViewQ = ((gbf) this.i).q();
        if (omniButtonViewQ == null || omniButtonViewQ.getResources().getConfiguration().smallestScreenWidthDp < 600) {
            return null;
        }
        return new bp(omniButtonViewQ, -fan.a(5.0f, omniButtonViewQ.getResources()));
    }

    public long j() {
        return 0L;
    }

    public abstract x43 k();

    public View l() {
        return null;
    }

    public final void m(lkk lkkVar, Callback callback, umi umiVar) {
        this.e = umiVar;
        OspCollectorService.g.put(lkkVar, new wbk(this));
        OspCollectorService.h.put(lkkVar, callback);
    }

    public boolean n() {
        return false;
    }

    public boolean o() {
        return this instanceof mp3;
    }

    public boolean p() {
        return this instanceof hvl;
    }

    public abstract boolean q();

    public abstract zsf r(Context context);

    public void s() {
        esk eskVar = (esk) this.d;
        b2l b2lVar = ((k6l) this.c).o;
        if (b2lVar == null || !((d7l) b2lVar).n0() || ((ru9) eskVar.get()).a.getBoolean("startpage.omnibar_activated", false)) {
            return;
        }
        nv6 nv6VarB = ((ru9) eskVar.get()).b();
        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("startpage.omnibar_activated", true);
        nv6VarB.w();
    }

    public void t(boolean z) {
    }

    public void u() {
    }

    public void v() {
    }

    public abstract void w(boolean z);

    public void x() {
    }

    public void y() {
    }

    public abstract void z(b2l b2lVar);
}
