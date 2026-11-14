package defpackage;

import ads_mobile_sdk.ew1;
import ads_mobile_sdk.l31;
import ads_mobile_sdk.xu0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.i;
import com.google.android.libraries.ads.mobile.sdk.iconad.IconAdView;
import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import com.opera.android.favorites.FavoriteGridLinearLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class lx extends bu8 {
    public static final /* synthetic */ int n = 0;
    public final kze i;
    public final View j;
    public final FavoriteGridLinearLayout k;
    public final izj l;
    public final ArrayList m;

    public lx(View view, kze kzeVar, izj izjVar) {
        super(view);
        this.i = kzeVar;
        this.j = view;
        WeakHashMap weakHashMap = r5n.a;
        this.k = (FavoriteGridLinearLayout) ((View) m5n.f(view, 2131362867));
        xf8.j0(kzeVar, view, new cl4(this, (byte) 19));
        pc5 pc5Var = new pc5(this, (byte) 17);
        q9n.e(view, pc5Var);
        pc5Var.a(view);
        this.l = izjVar;
        this.m = new ArrayList();
        xf8.j0(izjVar.d, view, new k9(this, (byte) 6));
    }

    @Override // defpackage.o43, defpackage.ab2
    public final void V(ja2 ja2Var, boolean z) {
        super.V(ja2Var, z);
        if (z) {
            return;
        }
        Y();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(((i) this).itemView.getContext());
        tta ttaVar = (tta) this.l.d.g();
        ArrayList arrayList = ((eo) ((mq) a0()).d).w;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            l31 l31Var = (l31) obj;
            ViewGroup viewGroup = this.k;
            View viewInflate = layoutInflaterFrom.inflate(2131558729, viewGroup, false);
            if (viewInflate == null) {
                t3p.q("rootView");
                return;
            }
            IconAdView iconAdView = (IconAdView) viewInflate;
            ew1 ew1Var = ((f43) iconAdView).a;
            Context context = ((i) this).itemView.getContext();
            Drawable drawable = (Drawable) l31Var.c.b;
            String str = l31Var.d;
            vr8 vr8Var = vr8.l;
            jx jxVar = new jx(context, drawable, str, ttaVar);
            int i2 = ttaVar.c;
            ViewGroup.LayoutParams layoutParams = iconAdView.getLayoutParams();
            if (layoutParams != null && layoutParams.width != i2) {
                layoutParams.width = i2;
                iconAdView.setLayoutParams(layoutParams);
            }
            iconAdView.addView(jxVar);
            ew1Var.a(jxVar, "3003");
            ew1Var.a(jxVar, "3001");
            if (l31Var instanceof l31) {
                ew1Var.a(l31Var.b.b);
            } else {
                xu0.c("Internal Error: Cannot display Icon Ad", (Exception) null);
            }
            this.m.add(iconAdView);
            viewGroup.addView(iconAdView);
        }
    }

    @Override // defpackage.o43, defpackage.ab2
    public final void Y() {
        this.k.removeAllViews();
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ew1 ew1Var = ((f43) ((IconAdView) obj)).a;
            synchronized (ew1Var) {
                if (!ew1Var.d.get()) {
                    InternalNativeAd internalNativeAd = ew1Var.i;
                    if (internalNativeAd != null) {
                        ew1Var.c(internalNativeAd);
                    }
                    ew1Var.i = null;
                    f43 f43Var = ew1Var.b;
                    if (f43Var != null) {
                        f43Var.setOnClickListener(null);
                    }
                    f43 f43Var2 = ew1Var.b;
                    if (f43Var2 != null) {
                        f43Var2.setOnTouchListener(null);
                    }
                    ew1Var.h.clear();
                    f43 f43Var3 = ew1Var.b;
                    if (f43Var3 != null) {
                        f43Var3.removeAllViews();
                    }
                    FrameLayout frameLayout = ew1Var.c;
                    if (frameLayout != null) {
                        frameLayout.removeAllViews();
                    }
                    ew1Var.e = null;
                    ew1Var.b = null;
                    ew1Var.c = null;
                    ew1Var.d.set(true);
                    ew1Var.g = null;
                }
            }
        }
        this.m.clear();
    }
}
