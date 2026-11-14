package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import androidx.fragment.app.w;
import com.opera.android.FullscreenWebActivity;
import com.opera.android.autofill.passwords.picker.AutofillPasswordPickerActivity;
import com.opera.android.browser.WebContentsWrapper;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.uninstall.UninstallActivity;
import com.opera.android.webapps.WebappActivity;
import java.util.ArrayDeque;
import org.chromium.content_public.browser.NavigationController;

/* loaded from: classes.dex */
public final class xt2 extends gcf {
    public final /* synthetic */ byte Y;
    public final Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xt2(Object obj, byte b) {
        super(true);
        this.Y = b;
        this.Z = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt2(kcf kcfVar) {
        super(kcfVar.c);
        this.Y = (byte) 3;
        this.Z = kcfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt2(ml6 ml6Var) {
        super(ml6Var.e());
        this.Y = (byte) 7;
        this.Z = ml6Var;
        ml6Var.c = b5j.f(ml6Var.c, new o5f((Object) this, (byte) 9));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt2(qf5 qf5Var) {
        super(false);
        this.Y = (byte) 1;
        this.Z = qf5Var;
    }

    private final void m() {
    }

    private final void q(jz2 jz2Var) {
    }

    private final void r(jz2 jz2Var) {
    }

    public final void handleOnBackCancelled() {
        gz2 gz2Var;
        q2 q2Var;
        byte b = this.Y;
        Object obj = this.Z;
        switch (b) {
            case 1:
                break;
            case 3:
                ((kcf) obj).c().a();
                break;
            case 7:
                ml6 ml6Var = (ml6) obj;
                z8b z8bVar = ml6Var.b;
                if (z8bVar != null && (gz2Var = (gz2) z8bVar.b) != null && (q2Var = gz2Var.f) != null) {
                    q2Var.invoke();
                }
                ml6Var.b = null;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [android.app.Activity, com.opera.android.autofill.passwords.picker.AutofillPasswordPickerActivity] */
    /* JADX WARN: Type inference failed for: r4v12, types: [android.app.Activity, com.opera.android.webapps.WebappActivity, dx3] */
    /* JADX WARN: Type inference failed for: r4v6, types: [android.app.Activity, com.opera.android.FullscreenWebActivity] */
    /* JADX WARN: Type inference failed for: r4v8, types: [android.app.Activity, t5d] */
    public final void handleOnBackPressed() {
        b2l b2lVar;
        byte b = this.Y;
        Object obj = this.Z;
        switch (b) {
            case 0:
                ?? r4 = (AutofillPasswordPickerActivity) obj;
                l24 l24Var = (l24) r4.m.c;
                if (!(l24Var != null ? l24Var.u() : false)) {
                    r4.finish();
                    break;
                }
                break;
            case 1:
                ((qf5) obj).c.invoke();
                break;
            case 2:
                bl9 bl9Var = ((c76) obj).requireActivity().n;
                if (bl9Var != null) {
                    ArrayDeque arrayDeque = (ArrayDeque) bl9Var.d;
                    if (((zm9) bl9Var.g) == null && arrayDeque.size() > 1) {
                        mn9 mn9Var = new mn9(null, true, null);
                        zm9 zm9Var = (zm9) bl9Var.g;
                        if (zm9Var != null) {
                            zm9Var.b(true);
                        }
                        bl9Var.b = true;
                        bl9Var.g = mn9Var;
                        Fragment fragment = (Fragment) arrayDeque.pop();
                        Fragment fragment2 = (Fragment) arrayDeque.peek();
                        w wVar = (w) bl9Var.c;
                        wVar.getClass();
                        a aVar = new a(wVar);
                        aVar.o(fragment2);
                        bl9Var.a(aVar);
                        iv ivVar = new iv(bl9Var, mn9Var, fragment);
                        mn9Var.c = fragment2;
                        mn9Var.b = fragment;
                        mn9Var.d = ivVar;
                        break;
                    }
                }
                break;
            case 3:
                ((kcf) obj).d();
                break;
            case 4:
                ?? r42 = (FullscreenWebActivity) obj;
                WebContentsWrapper webContentsWrapper = r42.v;
                if (!r42.o0(webContentsWrapper != null ? webContentsWrapper.d() : null)) {
                    r42.finish();
                    break;
                }
                break;
            case 5:
                ((ywa) obj).g0().g();
                break;
            case 6:
                ?? r43 = (t5d) obj;
                l24 l24Var2 = (l24) r43.u.c;
                if (!(l24Var2 != null ? l24Var2.u() : false)) {
                    r43.moveTaskToBack(true);
                    break;
                }
                break;
            case 7:
                ((ml6) obj).d();
                break;
            case 8:
                ((h51) obj).invoke(this);
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                l24 l24Var3 = (l24) ((UninstallActivity) obj).c.c;
                if (l24Var3 != null) {
                    l24Var3.u();
                    break;
                }
                break;
            default:
                ?? r44 = (WebappActivity) obj;
                if (r44.S().a.p() && r44.y.l != 4) {
                    r44.S().b();
                    break;
                } else {
                    ChromiumContent chromiumContentF0 = r44.f0();
                    if (chromiumContentF0 != null) {
                        if (!chromiumContentF0.H.a) {
                            if (!chromiumContentF0.h() && chromiumContentF0.d().f()) {
                                if (!chromiumContentF0.h()) {
                                    NavigationController navigationControllerD = chromiumContentF0.d();
                                    if (navigationControllerD.f()) {
                                        navigationControllerD.e();
                                        break;
                                    }
                                }
                            } else {
                                k6l k6lVarW = r44.W();
                                if (k6lVarW != null && k6lVarW.b.size() > 1 && (b2lVar = k6lVarW.o) != null) {
                                    k6lVarW.k(b2lVar);
                                    break;
                                } else {
                                    r44.moveTaskToBack(true);
                                    break;
                                }
                            }
                        } else {
                            chromiumContentF0.e().stop();
                            break;
                        }
                    }
                }
                break;
        }
    }

    public final void handleOnBackProgressed(jz2 jz2Var) {
        byte b = this.Y;
        Object obj = this.Z;
        switch (b) {
            case 1:
                break;
            case 3:
                ((kcf) obj).c().c(new wje(jz2Var.c, jz2Var.a, jz2Var.b, jz2Var.d, jz2Var.e));
                break;
            case 7:
                ml6 ml6Var = (ml6) obj;
                float f = jz2Var.c;
                int i = jz2Var.d;
                ml6Var.g(new iz2(f, i != 0 ? i != 1 ? hz2.a : hz2.c : hz2.b, jz2Var.a, jz2Var.b));
                break;
        }
    }

    public final void handleOnBackStarted(jz2 jz2Var) {
        byte b = this.Y;
        Object obj = this.Z;
        switch (b) {
            case 1:
                break;
            case 3:
                icf icfVarC = ((kcf) obj).c();
                wje wjeVar = new wje(jz2Var.c, jz2Var.a, jz2Var.b, jz2Var.d, jz2Var.e);
                xje xjeVar = ((bke) icfVarC).a;
                if (xjeVar == null) {
                    qp2.n("This input is not added to any dispatcher.");
                    break;
                } else if (!((bke) icfVarC).b) {
                    xjeVar.d(icfVarC, wjeVar);
                    ((bke) icfVarC).b = true;
                    break;
                }
                break;
            case 7:
                ml6 ml6Var = (ml6) obj;
                float f = jz2Var.c;
                int i = jz2Var.d;
                iz2 iz2Var = new iz2(f, i != 0 ? i != 1 ? hz2.a : hz2.c : hz2.b, jz2Var.a, jz2Var.b);
                gz2 gz2VarO = xvg.o(ml6Var.a);
                if (gz2VarO != null) {
                    ml6Var.b = new z8b(iz2Var, gz2VarO);
                    xm6 xm6Var = gz2VarO.d;
                    if (xm6Var != null) {
                        xm6Var.invoke(iz2Var);
                        break;
                    }
                }
                break;
        }
    }
}
