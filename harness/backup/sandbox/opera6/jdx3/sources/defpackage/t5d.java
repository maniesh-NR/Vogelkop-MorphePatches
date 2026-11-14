package defpackage;

import android.os.Bundle;
import android.view.KeyEvent;
import com.opera.android.OperaApplication;
import com.opera.android.browser.chromium.ChromiumContainerView;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class t5d extends dx3 implements m24 {
    public final pad u = new pad((byte) 7);
    public final b7f v = uup.m(new dtl());
    public gwi w;

    @Override // defpackage.m24
    public final void a(l24 l24Var) {
        this.u.t(l24Var);
    }

    @Override // defpackage.m24
    public final void c(l24 l24Var) {
        this.u.A(l24Var);
    }

    public boolean d0() {
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (c37.r().l(0, keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChromiumContainerView e0() {
        l5b l5bVar = q9n.c;
        return (ChromiumContainerView) q9n.y(2131362328, getWindow().getDecorView());
    }

    @Override // defpackage.dx3, defpackage.hjf
    public final Object getSystemService(String str) {
        str.getClass();
        if (!str.equals("com.opera.android.ui.SECURE_WINDOW_SERVICE")) {
            return !str.equals("com.opera.android.BPR_SERVICE") ? super.getSystemService(str) : this;
        }
        gwi gwiVar = this.w;
        Objects.requireNonNull(gwiVar);
        return gwiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dx3, defpackage.hjf
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (sfe.g0(this)) {
            return;
        }
        this.w = new gwi(getWindow());
        String[] strArr = OperaApplication.K;
        new ju2(this, ((OperaApplication) getApplication()).L().d);
        getOnBackPressedDispatcher().a(this, new xt2(this, (byte) 6));
    }

    public void onSaveInstanceState(Bundle bundle) {
        qdc lifecycle = getLifecycle();
        qcc qccVar = qcc.c;
        lifecycle.d("markState");
        lifecycle.g(qccVar);
    }
}
