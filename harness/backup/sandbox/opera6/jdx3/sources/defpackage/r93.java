package defpackage;

import androidx.fragment.app.i;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.opera.android.custom_views.FadingRecyclerView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class r93 extends h8n {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r93(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, com.opera.android.custom_views.FadingRecyclerView] */
    @Override // defpackage.h8n
    public final void onPageScrolled(int i, float f, int i2) {
        switch (this.a) {
            case 0:
                ?? r0 = ((y93) this.b).w;
                if (r0 != 0) {
                    r0.K0 = i;
                    r0.L0 = f;
                    r0.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.h8n
    public final void onPageSelected(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                y93 y93Var = (y93) obj;
                i iVarF = y93Var.getFragmentManager().F("dialog");
                if (iVarF != null) {
                    iVarF.dismiss();
                }
                t93 t93Var = y93Var.y;
                if (t93Var != null && y93Var.x != null && y93Var.w != null) {
                    Object[] objArr = t93Var.a;
                    u93 u93Var = (objArr == null || i < 0 || i >= objArr.length) ? null : (u93) t93Var.c.get(objArr[i]);
                    if (u93Var != null) {
                        RecyclerView recyclerView = u93Var.b;
                        AppBarLayout appBarLayout = y93Var.x;
                        appBarLayout.n = recyclerView.getId();
                        WeakReference weakReference = appBarLayout.o;
                        if (weakReference != null) {
                            weakReference.clear();
                        }
                        appBarLayout.o = null;
                        y93Var.x.l(recyclerView.canScrollVertically(-1) || recyclerView.getScrollY() > 0, true);
                    }
                    boolean z = y93Var.s;
                    FadingRecyclerView fadingRecyclerView = y93Var.w;
                    if (!z) {
                        fadingRecyclerView.H0(i);
                        break;
                    } else {
                        fadingRecyclerView.x0(i);
                        y93Var.s = false;
                        break;
                    }
                }
                break;
            case 1:
                ((sue) obj).x0(i);
                break;
            case 2:
                ((l8i) obj).a();
                break;
            default:
                y9k y9kVar = (y9k) obj;
                z65 z65Var = (z65) y9kVar.g.get(i);
                y9kVar.a.r(z65Var.f);
                pn pnVar = z65Var.g;
                if (pnVar != null) {
                    pnVar.run();
                    break;
                }
                break;
        }
    }
}
