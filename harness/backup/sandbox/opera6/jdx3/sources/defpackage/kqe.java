package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import com.opera.android.OverlaidStatusBarDrawingView;
import com.opera.android.StatusBarDrawerAppBarLayout;

/* loaded from: classes.dex */
public final class kqe implements fck {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kqe(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.fck
    public final int b() {
        int i;
        ColorStateList colorStateList;
        byte b = this.a;
        int defaultColor = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                lqe lqeVar = (lqe) obj;
                if (((Boolean) lqeVar.g.g()).booleanValue()) {
                    return p37.a0(lqeVar.n / 255.0f, lqeVar.u);
                }
                return 0;
            case 1:
                OverlaidStatusBarDrawingView overlaidStatusBarDrawingView = (OverlaidStatusBarDrawingView) obj;
                int iOrdinal = overlaidStatusBarDrawingView.f.ordinal();
                if (iOrdinal == 0) {
                    i = overlaidStatusBarDrawingView.e;
                } else {
                    if (iOrdinal != 1) {
                        h9o.p();
                        return 0;
                    }
                    i = -16777216;
                }
                return p37.a0(overlaidStatusBarDrawingView.getAlpha(), i);
            default:
                AppBarLayout appBarLayout = (StatusBarDrawerAppBarLayout) obj;
                Drawable background = appBarLayout.getBackground();
                if (background instanceof ColorDrawable) {
                    defaultColor = ((ColorDrawable) background).getColor();
                } else if ((background instanceof zdd) && (colorStateList = ((zdd) background).b.c) != null) {
                    defaultColor = colorStateList.getDefaultColor();
                }
                return p37.a0(appBarLayout.getAlpha(), defaultColor);
        }
    }

    @Override // defpackage.fck
    public final View getView() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((lqe) obj).a;
            case 1:
                return (OverlaidStatusBarDrawingView) obj;
            default:
                return (StatusBarDrawerAppBarLayout) obj;
        }
    }
}
