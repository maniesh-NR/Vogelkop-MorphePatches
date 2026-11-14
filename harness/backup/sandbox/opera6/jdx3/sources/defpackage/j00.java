package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.StylingImageView;

/* loaded from: classes.dex */
public final class j00 extends f00 {
    public final StylingImageView F;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.view.View, com.opera.android.custom_views.StylingImageView] */
    public j00(View view, boolean z, kze kzeVar) throws Resources.NotFoundException {
        super(view, kzeVar);
        ?? stylingImageView = new StylingImageView(view.getContext(), null);
        this.F = stylingImageView;
        h0(stylingImageView);
        if (z) {
            Resources resources = view.getResources();
            FrameLayout frameLayout = this.j;
            int dimensionPixelSize = resources.getDimensionPixelSize(2131165714);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(2131165713);
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            layoutParams.width = dimensionPixelSize;
            layoutParams.height = dimensionPixelSize2;
            frameLayout.setLayoutParams(layoutParams);
        }
    }

    @Override // defpackage.xv8, defpackage.o43, defpackage.ab2
    public final void V(ja2 ja2Var, boolean z) {
        super.V(ja2Var, z);
        if (z) {
            return;
        }
        String str = f0().u.o;
        ga6 ga6VarI0 = gu8.i0(this.j, ((i) this).itemView);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        gu8.g0(str, this.F, ga6VarI0);
    }
}
