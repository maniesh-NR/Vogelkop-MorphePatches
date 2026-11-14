package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.opera.android.custom_views.StylingImageView;

/* loaded from: classes.dex */
public final class eu9 extends xv8 {
    public static final /* synthetic */ int E = 0;
    public final StylingImageView D;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, android.widget.ImageView, com.opera.android.custom_views.StylingImageView] */
    public eu9(View view, kze kzeVar) {
        super(view, new fu9(), kzeVar);
        ?? stylingImageView = new StylingImageView(view.getContext(), null);
        this.D = stylingImageView;
        stylingImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        h0(stylingImageView);
    }

    @Override // defpackage.xv8, defpackage.o43, defpackage.ab2
    public final void V(ja2 ja2Var, boolean z) {
        super.V(ja2Var, z);
        if (z) {
            return;
        }
        String str = ((gu9) Z().d).d;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        gu8.g0(str, this.D, this.k);
    }

    @Override // defpackage.bu8
    public final yz f0() {
        return (gu9) Z().d;
    }
}
