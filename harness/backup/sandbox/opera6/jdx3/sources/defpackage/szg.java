package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public final class szg extends z46 {
    public final /* synthetic */ xzg u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public szg(xzg xzgVar, s8n s8nVar) {
        super(s8nVar, 0);
        this.u = xzgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.view.ViewParent, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.app.Dialog, szg, tq3, z46] */
    @Override // defpackage.tq3
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View view = null;
        View viewInflate = getLayoutInflater().inflate(2131559241, (ViewGroup) null, false);
        int i = 2131362193;
        if (((FrameLayout) w1h.j(2131362193, viewInflate)) != null) {
            i = 2131362409;
            View viewJ = w1h.j(2131362409, viewInflate);
            if (viewJ != null) {
                ei eiVarA = ei.a(viewJ);
                FrameLayout frameLayout = (FrameLayout) viewInflate;
                xzg xzgVar = this.u;
                xzgVar.h = eiVarA;
                setContentView(frameLayout);
                l5b l5bVar = q9n.c;
                View parent = frameLayout.getParent();
                while (true) {
                    if (parent == 0) {
                        break;
                    }
                    if (CoordinatorLayout.class.isAssignableFrom(parent.getClass())) {
                        view = parent;
                        break;
                    }
                    parent = parent.getParent();
                }
                ViewGroup viewGroup = (ViewGroup) view;
                xzgVar.g = viewGroup;
                if (viewGroup == null) {
                    xzgVar.g = frameLayout;
                }
                if (this.g == null) {
                    f();
                }
                this.g.M(3);
                Window window = getWindow();
                if (window != null) {
                    p8f.w(window);
                }
                xzgVar.i0();
                return;
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
