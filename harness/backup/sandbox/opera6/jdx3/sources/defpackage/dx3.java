package defpackage;

import J.N;
import android.R;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.PointF;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import androidx.fragment.app.w;
import com.opera.android.OperaApplication;
import com.opera.android.browser.BrowserFragment;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.browser.external.ExternalAppService;
import com.opera.android.settings.SettingsManager;
import com.opera.android.wallpaper.WallpaperStorefrontExtension;
import com.opera.api.Callback;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.Clipboard;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public abstract class dx3 extends hjf implements kl9 {
    public qi j;
    public zg k;
    public qim o;
    public eej p;
    public dxe s;
    public koi t;
    public final tni l = new tni();
    public final i7f m = new i7f();
    public final hx3 n = new hx3(this, vml.d, this.e);
    public final zw3 q = new zw3(this);
    public final ax3 r = new ax3(this);

    public static dx3 L(WebContents webContents) {
        WindowAndroid windowAndroidK0;
        if (webContents.isDestroyed() || (windowAndroidK0 = webContents.k0()) == null) {
            return null;
        }
        Object obj = (Activity) windowAndroidK0.m().get();
        if (obj instanceof dx3) {
            return (dx3) obj;
        }
        return null;
    }

    @Override // defpackage.hjf
    public final boolean E() {
        b2l b2lVar;
        k6l k6lVarW = W();
        return (k6lVarW == null || (b2lVar = k6lVarW.o) == null || !((d7l) b2lVar).j.m()) ? false : true;
    }

    public jv0 F() {
        return new qii();
    }

    public List G(ChromiumContent chromiumContent) {
        return Collections.EMPTY_LIST;
    }

    public g1j H() {
        return new rbe((byte) 25);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public List I(ChromiumContent chromiumContent) {
        String[] strArr = OperaApplication.K;
        OperaApplication operaApplication = (OperaApplication) getApplication();
        z0b z0bVar = new z0b(4);
        byte b = 0;
        z0bVar.c(new kk5(chromiumContent, b));
        Objects.requireNonNull(operaApplication);
        z0bVar.c(new qqe(chromiumContent, new nw3(operaApplication, (byte) 22)));
        byte b2 = 1;
        z0bVar.c(new kk5(chromiumContent, b2));
        z0bVar.c(new p0a(new oc2(this, (byte) 25), b2));
        z0bVar.c(new p0a(operaApplication.L().d, b));
        return z0bVar.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d7h J() {
        String[] strArr = OperaApplication.K;
        OperaApplication operaApplication = (OperaApplication) getApplication();
        return new d7h(operaApplication.L().c, operaApplication.O(), (byte) 10);
    }

    public ivn K() {
        return new yw3(this);
    }

    public final lg M() {
        return (lg) this.n.d.get();
    }

    @Override // defpackage.hjf
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public ex3 s() {
        return this.n;
    }

    public eej O() {
        eej eejVar = this.p;
        if (eejVar != null) {
            return eejVar;
        }
        qim qimVar = this.o;
        Objects.requireNonNull(qimVar);
        eej eejVar2 = new eej(qimVar.d, this.o.f, null);
        this.p = eejVar2;
        return eejVar2;
    }

    public final BrowserFragment P() {
        return (BrowserFragment) getSupportFragmentManager().E(2131362211);
    }

    public final tz8 R() {
        return (tz8) this.n.h.get();
    }

    public final eq9 S() {
        return (eq9) this.n.i.get();
    }

    public pt3 T() {
        return null;
    }

    public final b2l V(WebContents webContents) {
        k6l k6lVarW = W();
        if (k6lVarW == null) {
            return null;
        }
        GURL gurl = ChromiumContent.V;
        ChromiumContent chromiumContent = (ChromiumContent) N.Mo8CJari(webContents);
        if (chromiumContent != null) {
            return k6lVarW.r(chromiumContent.i);
        }
        return null;
    }

    public final k6l W() {
        BrowserFragment browserFragmentP = P();
        if (browserFragmentP != null) {
            return browserFragmentP.g;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void X(zhj zhjVar, int i) {
        w supportFragmentManager = getSupportFragmentManager();
        a aVarF = u35.f(supportFragmentManager, supportFragmentManager);
        int i2 = zhjVar.e;
        Bundle bundle = zhjVar.b;
        wzg wzgVar = zhjVar.a;
        if (i2 == -1) {
            i2 = 4097;
        }
        ((ym9) aVarF).h = i2;
        Iterator it = zhjVar.g.iterator();
        if (it.hasNext()) {
            throw p3p.g(it);
        }
        Fragment fragmentA = (ryl) wzgVar.b;
        if (fragmentA == null) {
            fragmentA = getSupportFragmentManager().L().a(getClassLoader(), ((Class) wzgVar.c).getName());
        }
        if (bundle != null) {
            Bundle arguments = fragmentA.getArguments();
            if (arguments != null) {
                arguments.putAll(bundle);
                bundle = arguments;
            }
            fragmentA.setArguments(bundle);
        }
        String strY = zhjVar.d;
        if (strY == null) {
            strY = fragmentA instanceof jbl ? ((jbl) fragmentA).y() : null;
        }
        aVarF.c(strY);
        int iA = vep.A(zhjVar.c);
        if (iA != 0) {
            if (iA == 1) {
                aVarF.e(i, fragmentA, strY, 1);
            }
        } else {
            if (i == 0) {
                qp2.o("Must use non-zero containerViewId");
                return;
            }
            aVarF.e(i, fragmentA, strY, 2);
        }
        aVarF.h();
        if (zhjVar.f) {
            supportFragmentManager.D();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Y(cv3 cv3Var) {
        String[] strArr = OperaApplication.K;
        ((OperaApplication) getApplication()).n().a.add(cv3Var);
    }

    public boolean Z() {
        return false;
    }

    public void a0(yul yulVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b0(cv3 cv3Var) {
        String[] strArr = OperaApplication.K;
        Object objF = ((OperaApplication) getApplication()).r.D.f();
        if (objF != null) {
            ((ag7) objF).a.remove(cv3Var);
        }
    }

    public cjm c0(Class cls) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        i7f i7fVar = this.m;
        if (i7fVar.c != 0) {
            PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
            g7f g7fVar = new g7f(i7fVar);
            while (g7fVar.hasNext()) {
                ((Callback) g7fVar.next()).run(pointF);
            }
        }
        return super/*android.app.Activity*/.dispatchTouchEvent(motionEvent);
    }

    @Override // defpackage.hjf
    public Object getSystemService(String str) {
        if ("com.opera.android.FRAGMENT_MANAGER_SERVICE".equals(str)) {
            return getSupportFragmentManager();
        }
        if ("com.opera.android.ui.SHEET_QUEUE_SERVICE".equals(str)) {
            qim qimVar = this.o;
            Objects.requireNonNull(qimVar);
            return qimVar.d;
        }
        if ("com.opera.android.ui.DIALOG_QUEUE_SERVICE".equals(str)) {
            qim qimVar2 = this.o;
            Objects.requireNonNull(qimVar2);
            return qimVar2.c;
        }
        if (!"com.opera.android.ui.FRAGMENT_CONTROLLER_SERVICE".equals(str)) {
            return super.getSystemService(str);
        }
        qim qimVar3 = this.o;
        Objects.requireNonNull(qimVar3);
        return qimVar3.b;
    }

    public void h(zhj zhjVar) {
    }

    @Override // defpackage.hjf
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        zg zgVar = this.k;
        SparseArray sparseArray = (SparseArray) zgVar.c;
        r1o r1oVar = (r1o) sparseArray.get(i);
        sparseArray.delete(i);
        String str = (String) ((HashMap) zgVar.d).remove(Integer.valueOf(i));
        if (r1oVar != null) {
            r1oVar.a(i2, intent);
        } else if (str != null) {
            b2b b2bVar = WindowAndroid.B;
            arl.a(t8.a, 0, str).b();
        }
    }

    @Override // defpackage.hjf
    public void onConfigurationChanged(Configuration configuration) {
        hsj hsjVar;
        super.onConfigurationChanged(configuration);
        this.l.b(configuration);
        qim qimVar = this.o;
        if (qimVar == null || (hsjVar = qimVar.j.d) == null) {
            return;
        }
        hsjVar.a.k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hjf
    public void onCreate(Bundle bundle) {
        if (sfe.g0(this)) {
            super.onCreate(bundle);
            return;
        }
        String[] strArr = OperaApplication.K;
        OperaApplication operaApplication = (OperaApplication) getApplication();
        SettingsManager settingsManagerJ = operaApplication.J();
        xv1 xv1Var = operaApplication.r;
        this.s = new dxe(this, settingsManagerJ, new nw3(operaApplication, (byte) 21), operaApplication.L().c);
        getLifecycle().a(this.s);
        super.onCreate(bundle);
        owe.c.F(this.r);
        if (!operaApplication.U()) {
            ej9.b.get();
        }
        this.k = new zg(new pjn(this));
        qi qiVar = new qi(this, this.k, false);
        this.j = qiVar;
        this.h = new sz4(qiVar);
        this.l.b(getResources().getConfiguration());
        SettingsManager settingsManagerJ2 = operaApplication.J();
        if (settingsManagerJ2.i("eula_accepted.gdpr")) {
            getLifecycle().a(new sxe(operaApplication.L().c, settingsManagerJ2));
        }
        djg djgVar = (djg) xv1Var.Y.get();
        djgVar.a.b(this.q);
        getLifecycle().a((zkd) xv1Var.Z.get());
        dx3 dx3Var = WallpaperStorefrontExtension.a;
        if (dx3Var != null && WallpaperStorefrontExtension.b != null) {
            dx3Var.getLifecycle().b(WallpaperStorefrontExtension.b);
        }
        WallpaperStorefrontExtension.b = new lnn();
        WallpaperStorefrontExtension.a = this;
        getLifecycle().a(WallpaperStorefrontExtension.b);
        this.n.t.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hjf
    public void onDestroy() {
        super.onDestroy();
        String[] strArr = OperaApplication.K;
        djg djgVar = (djg) ((OperaApplication) getApplication()).r.Y.get();
        djgVar.a.c(this.q);
        owe.c.H(this.r);
        this.s = null;
        Object objF = this.n.d.f();
        if (objF != null) {
            lg lgVar = (lg) objF;
            lgVar.b.H(lgVar);
        }
        this.h = null;
        this.j.destroy();
        this.j = null;
        koi koiVar = this.t;
        if (koiVar != null) {
            koiVar.a.a(koiVar);
            ViewGroup viewGroup = koiVar.d;
            if (viewGroup != null) {
                koiVar.b.getClass();
                foi.b(viewGroup, (ioi) null);
            }
            koiVar.g = true;
            this.t = null;
        }
    }

    public void onStop() {
        S().b();
        super.onStop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onWindowFocusChanged(boolean z) {
        super/*android.app.Activity*/.onWindowFocusChanged(z);
        qim qimVar = this.o;
        if (qimVar != null) {
            qimVar.t = z;
            if (z) {
                qimVar.a();
            } else {
                btj btjVarC = qimVar.c();
                if (btjVarC != null) {
                    btjVarC.I();
                }
            }
        }
        Clipboard.getInstance().c(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setContentView(int i) {
        super.setContentView(i);
        qim qimVar = new qim(this, this, this, (ViewGroup) findViewById(R.id.content), hasWindowFocus());
        this.o = qimVar;
        ((gjm) s().b().get()).F(new nim(qimVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (intent.getStringArrayListExtra("org.chromium.chrome.browser.eenp") != null) {
            boolean z = ExternalAppService.b;
            if (getLifecycle().i.d(qcc.e) && !ExternalAppService.b) {
                tcc lifecycle = getLifecycle();
                Intent intent2 = new Intent(getIntent());
                intent2.setFlags(268435456);
                wl8 wl8Var = new wl8(this, PendingIntent.getActivity(this, 0, intent2, 201326592));
                wl8Var.d = true;
                wl8Var.a(new sxh(2132020067, new Object[]{getString(2132017591)}));
                lifecycle.a(wl8Var);
            }
        }
        super/*xd5*/.startActivityForResult(intent, i, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hjf
    public final int w() {
        if (!E()) {
            return super.w();
        }
        String[] strArr = OperaApplication.K;
        return qbe.A(((OperaApplication) getApplication()).J().g(), z(), 8);
    }
}
