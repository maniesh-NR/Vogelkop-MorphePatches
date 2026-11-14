package defpackage;

import ads_mobile_sdk.ew1;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class mx extends xv8 {
    public static final /* synthetic */ int G = 0;
    public static final /* synthetic */ int H = 0;
    public final /* synthetic */ byte D;
    public final FrameLayout E;
    public final ViewGroup F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx(View view, kze kzeVar, byte b) {
        super(view, new nx(view.getContext()), kzeVar);
        this.D = b;
        switch (b) {
            case 1:
                super(view, new vv8((byte) 1), kzeVar);
                WeakHashMap weakHashMap = r5n.a;
                this.E = (FrameLayout) ((View) m5n.f(view, 2131362872));
                ksd ksdVar = new ksd(view.getContext());
                this.F = ksdVar;
                h0(ksdVar);
                break;
            default:
                WeakHashMap weakHashMap2 = r5n.a;
                NativeAdView nativeAdView = (View) m5n.f(view, 2131362859);
                this.E = nativeAdView;
                ((f43) nativeAdView).a.a(this.n, "3001");
                TextView textView = this.o;
                ew1 ew1Var = ((f43) nativeAdView).a;
                ew1Var.a(textView, "3004");
                ew1Var.a(this.u, "3009");
                ew1Var.a(this.t, "3006");
                ew1Var.a(this.x, "3002");
                ew1Var.a(this.r, "3003");
                msd msdVar = new msd(view.getContext());
                this.F = msdVar;
                h0(msdVar);
                break;
        }
    }

    @Override // defpackage.xv8, defpackage.o43, defpackage.ab2
    public final void V(ja2 ja2Var, boolean z) {
        byte b = this.D;
        FrameLayout frameLayout = this.E;
        msd msdVar = this.F;
        switch (b) {
            case 0:
                super.V(ja2Var, z);
                if (!z) {
                    ((NativeAdView) frameLayout).a(((io) Z().d).w, msdVar);
                    break;
                }
                break;
            default:
                super.V(ja2Var, z);
                if (!z) {
                    ((gnf) Z().d).u.e(frameLayout, new igi((ksd) msdVar, this.n, this.o, this.x, this.r, (Object) null, (byte) 29));
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ab2
    public final void X(boolean z) {
        switch (this.D) {
            case 0:
                q9n.J(this.E, RelativeLayout.class, new bi(this, (byte) 12));
                break;
        }
    }

    @Override // defpackage.o43, defpackage.ab2
    public final void Y() {
        switch (this.D) {
            case 1:
                super.Y();
                ((gnf) Z().d).u.g();
                break;
            default:
                super.Y();
                break;
        }
    }

    @Override // defpackage.bu8
    public final yz f0() {
        switch (this.D) {
            case 0:
                return (io) Z().d;
            default:
                return (gnf) Z().d;
        }
    }

    @Override // defpackage.xv8, defpackage.bu8
    public final boolean g0(View view) {
        switch (this.D) {
            case 0:
                if (super.g0(view)) {
                    return true;
                }
                return true ^ q9n.w(this.d, view);
            default:
                return super.g0(view);
        }
    }
}
