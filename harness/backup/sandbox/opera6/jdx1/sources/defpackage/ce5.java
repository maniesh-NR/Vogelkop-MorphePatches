package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public class ce5 extends Dialog implements ndc, lcf, yje, rki {
    public qdc a;
    public final qki b;
    public final zyk c;
    public final zyk d;

    public ce5(Context context, int i) {
        super(context, i);
        this.b = new qki(new ijd(this, new j3i(this, (byte) 8)));
        final byte b = 0;
        this.c = z4c.b(new Function0(this) { // from class: be5
            public final /* synthetic */ ce5 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b2 = b;
                ce5 ce5Var = this.b;
                switch (b2) {
                    case 0:
                        o97 o97Var = new o97();
                        ce5Var.getNavigationEventDispatcher().b(o97Var);
                        return o97Var;
                    default:
                        return new kcf(new lb4(ce5Var, (byte) 22), null);
                }
            }
        });
        final byte b2 = 1;
        this.d = z4c.b(new Function0(this) { // from class: be5
            public final /* synthetic */ ce5 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b2;
                ce5 ce5Var = this.b;
                switch (b22) {
                    case 0:
                        o97 o97Var = new o97();
                        ce5Var.getNavigationEventDispatcher().b(o97Var);
                        return o97Var;
                    default:
                        return new kcf(new lb4(ce5Var, (byte) 22), null);
                }
            }
        });
    }

    public static final void c(ce5 ce5Var) {
        super.onBackPressed();
    }

    public final qdc a() {
        qdc qdcVar = this.a;
        if (qdcVar != null) {
            return qdcVar;
        }
        qdc qdcVar2 = new qdc(this, true);
        this.a = qdcVar2;
        return qdcVar2;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addContentView(view, layoutParams);
    }

    public final void b() {
        z7h.v(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(2131365019, this);
        getWindow().getDecorView().setTag(2131365020, this);
        getWindow().getDecorView().setTag(2131365018, this);
    }

    @Override // defpackage.ndc
    public final tcc getLifecycle() {
        return a();
    }

    public final xje getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().c().c;
    }

    @Override // defpackage.lcf
    public final kcf getOnBackPressedDispatcher() {
        return (kcf) this.d.getValue();
    }

    @Override // defpackage.rki
    public final pki getSavedStateRegistry() {
        return this.b.b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((o97) this.c.getValue()).b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackPressedDispatcher().e(getOnBackInvokedDispatcher());
        }
        this.b.a(bundle);
        a().e(occ.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        this.b.b(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        a().e(occ.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        a().e(occ.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        b();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.setContentView(view, layoutParams);
    }
}
