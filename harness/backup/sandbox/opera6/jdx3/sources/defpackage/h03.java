package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.browser.OperaPageRootView;

/* loaded from: classes.dex */
public final class h03 implements fck {
    public final /* synthetic */ byte a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ h03(FrameLayout frameLayout, byte b) {
        this.a = b;
        this.b = frameLayout;
    }

    @Override // defpackage.fck
    public final int a() {
        byte b = this.a;
        FrameLayout frameLayout = this.b;
        switch (b) {
            case 0:
                i03 i03Var = (i03) frameLayout;
                return p37.a0(i03Var.getAlpha(), i03Var.f);
            case 1:
                return ((OperaPageRootView) frameLayout).g;
            default:
                StatusBarDrawingFrameLayout statusBarDrawingFrameLayout = (StatusBarDrawingFrameLayout) frameLayout;
                int i = StatusBarDrawingFrameLayout.l;
                return p37.a0(statusBarDrawingFrameLayout.getAlpha(), statusBarDrawingFrameLayout.k);
        }
    }

    @Override // defpackage.fck
    public final int b() {
        byte b = this.a;
        FrameLayout frameLayout = this.b;
        switch (b) {
            case 0:
                i03 i03Var = (i03) frameLayout;
                return p37.a0(i03Var.getAlpha(), i03Var.e);
            case 1:
                return ((OperaPageRootView) frameLayout).f;
            default:
                StatusBarDrawingFrameLayout statusBarDrawingFrameLayout = (StatusBarDrawingFrameLayout) frameLayout;
                int i = StatusBarDrawingFrameLayout.l;
                return p37.a0(statusBarDrawingFrameLayout.getAlpha(), statusBarDrawingFrameLayout.e ? statusBarDrawingFrameLayout.j : 0);
        }
    }

    @Override // defpackage.fck
    public final View getView() {
        byte b = this.a;
        FrameLayout frameLayout = this.b;
        switch (b) {
            case 0:
                return (i03) frameLayout;
            case 1:
                return (OperaPageRootView) frameLayout;
            default:
                return (StatusBarDrawingFrameLayout) frameLayout;
        }
    }
}
