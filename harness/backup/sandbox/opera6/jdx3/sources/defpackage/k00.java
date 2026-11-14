package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.i;
import com.opera.android.widget.RoundedImageView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class k00 extends f00 {
    public final RoundedImageView F;
    public final RoundedImageView G;
    public final RoundedImageView H;
    public final int I;
    public boolean J;

    /* JADX WARN: Type inference failed for: r2v5, types: [android.view.View, com.opera.android.widget.RoundedImageView] */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.view.View, com.opera.android.widget.RoundedImageView] */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.view.View, com.opera.android.widget.RoundedImageView] */
    public k00(View view, boolean z, kze kzeVar) {
        super(view, kzeVar);
        this.J = true;
        Resources resources = view.getResources();
        View viewInflate = LayoutInflater.from(view.getContext()).inflate(2131558748, (ViewGroup) null);
        WeakHashMap weakHashMap = r5n.a;
        ?? r2 = (RoundedImageView) ((View) m5n.f(viewInflate, 2131362934));
        this.F = r2;
        ?? r3 = (RoundedImageView) ((View) m5n.f(viewInflate, 2131362935));
        this.G = r3;
        ?? r4 = (RoundedImageView) ((View) m5n.f(viewInflate, 2131362936));
        this.H = r4;
        this.I = f03.w(2130970846, view.getContext(), 0);
        if (!z) {
            int iA = fan.a(158.0f, resources);
            int iApplyDimension = (int) TypedValue.applyDimension(1, 118.0f, resources.getDisplayMetrics());
            ViewGroup.LayoutParams layoutParams = r2.getLayoutParams();
            layoutParams.width = iA;
            layoutParams.height = iApplyDimension;
            r2.setLayoutParams(layoutParams);
            ViewGroup.LayoutParams layoutParams2 = r3.getLayoutParams();
            layoutParams2.width = iA;
            layoutParams2.height = iApplyDimension;
            r3.setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = r4.getLayoutParams();
            layoutParams3.width = iA;
            layoutParams3.height = iApplyDimension;
            r4.setLayoutParams(layoutParams3);
        }
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams4.height = -2;
        viewInflate.setLayoutParams(layoutParams4);
        h0(viewInflate);
    }

    @Override // defpackage.bu8, defpackage.xa2
    public final void J(wa2 wa2Var) {
        super.J(wa2Var);
        boolean z = this.g == 0;
        if (this.J == z) {
            return;
        }
        this.J = z;
        int i = this.I;
        this.F.f(z ? 0 : i, i);
        this.H.f(i, this.J ? 0 : i);
    }

    @Override // defpackage.xv8, defpackage.o43, defpackage.ab2
    public final void V(ja2 ja2Var, boolean z) {
        super.V(ja2Var, z);
        if (z) {
            return;
        }
        View view = ((i) this).itemView;
        AppCompatImageView appCompatImageView = this.F;
        ga6 ga6VarI0 = gu8.i0(appCompatImageView, view);
        String str = f0().u.w;
        if (!TextUtils.isEmpty(str)) {
            gu8.g0(str, appCompatImageView, ga6VarI0);
        }
        String str2 = f0().u.x;
        if (!TextUtils.isEmpty(str2)) {
            gu8.g0(str2, this.G, ga6VarI0);
        }
        String str3 = f0().u.y;
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        gu8.g0(str3, this.H, ga6VarI0);
    }
}
