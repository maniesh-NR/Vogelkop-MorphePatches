package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.opera.android.OperaApplication;

/* loaded from: classes.dex */
public class vq3 implements mej, sni {
    public final z46 a;
    public final h7f b;
    public hjm c;
    public sni d;
    public final boolean e;

    public vq3(Context context) {
        this(context, 0, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.app.Dialog, z46] */
    public vq3(Context context, int i, boolean z) {
        ?? z46Var = new z46(context, i);
        this.b = new h7f();
        this.c = hjm.b;
        this.a = z46Var;
        u8n.e(z46Var);
        Window window = z46Var.getWindow();
        if (window != null) {
            p8f.w(window);
        }
        Context context2 = z46Var.getContext();
        String[] strArr = OperaApplication.K;
        ((OperaApplication) context2.getApplicationContext()).B().a(z46Var);
        z46Var.setOnCancelListener(new jz0(this, (byte) 1));
        z46Var.setOnDismissListener(new k93(this, (byte) 0));
        this.e = z;
        z46Var.t = this;
    }

    @Override // defpackage.mej
    public final void Q(hjm hjmVar) {
        this.c = hjmVar;
        this.a.dismiss();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.app.Dialog, z46, zp1] */
    @Override // defpackage.mej
    public final void U(View view) {
        ?? r0 = this.a;
        r0.setContentView(view);
        ViewGroup viewGroup = (ViewGroup) r0.findViewById(2131362514);
        a(viewGroup);
        boolean z = this.e;
        viewGroup.setClipChildren(z);
        ViewParent parent = viewGroup.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).setClipChildren(z);
        }
        if (z) {
            viewGroup.setOutlineProvider(new zq3((byte) 0));
            viewGroup.setClipToOutline(true);
        }
        r0.show();
    }

    @Override // defpackage.sni
    public final void Y(boolean z) {
        sni sniVar = this.d;
        if (sniVar != null) {
            sniVar.Y(z);
        }
    }

    public void a(ViewGroup viewGroup) {
        BottomSheetBehavior bottomSheetBehaviorD = BottomSheetBehavior.D(viewGroup);
        bottomSheetBehaviorD.K = true;
        bottomSheetBehaviorD.M(3);
    }

    @Override // defpackage.mej
    public final Context getContext() {
        return this.a.getContext();
    }

    public final tcc getLifecycle() {
        return this.a.a();
    }

    @Override // defpackage.mej
    public final void i(y6f y6fVar) {
        this.b.b(y6fVar);
    }

    @Override // defpackage.mej
    public final void x(sni sniVar) {
        this.d = sniVar;
    }
}
