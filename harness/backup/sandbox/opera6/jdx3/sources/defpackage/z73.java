package defpackage;

import android.view.MenuItem;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.opera.android.StatusBarDrawerAppBarLayout;
import com.opera.android.custom_views.ActionBarSearchView;
import com.opera.android.custom_views.FadingRecyclerView;

/* loaded from: classes.dex */
public final class z73 implements MenuItem.OnActionExpandListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public z73(im3 im3Var, itd itdVar) {
        this.a = (byte) 1;
        this.b = im3Var;
    }

    public /* synthetic */ z73(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((jh3) obj).I0(false);
                break;
            case 1:
                im3 im3Var = (im3) obj;
                gn3 gn3Var = im3Var.x;
                if (gn3Var.I) {
                    gn3Var.I = false;
                    ((FadingRecyclerView) gn3Var.q.f).B0(gn3Var.E);
                    ((View) gn3Var.q.g).setVisibility(4);
                    StatusBarDrawerAppBarLayout statusBarDrawerAppBarLayout = (StatusBarDrawerAppBarLayout) gn3Var.q.c;
                    ((AppBarLayout) statusBarDrawerAppBarLayout).l = true;
                    ((AppBarLayout) statusBarDrawerAppBarLayout).i = false;
                    gn3Var.u();
                    gn3Var.g();
                }
                im3Var.O0(2131362163, true);
                im3Var.O0(2131362152, true);
                gm3 gm3Var = im3Var.A;
                im3 im3Var2 = gm3Var.a;
                im3Var2.J.getClass();
                if (!zwk.e()) {
                    im3Var2.J.F(gm3Var);
                    break;
                } else {
                    im3Var2.O0(2131362169, false);
                    break;
                }
            case 2:
                zse zseVar = (zse) obj;
                zseVar.J0(false);
                bte bteVarF = zseVar.G0().f();
                bteVarF.getClass();
                bteVarF.c.r(Boolean.FALSE);
                break;
            case 3:
                oy oyVar = (oy) obj;
                oyVar.f();
                ActionBarSearchView actionBarSearchView = (ActionBarSearchView) oyVar.i;
                if (actionBarSearchView != null) {
                    actionBarSearchView.setOnQueryTextListener((hti) null);
                    break;
                }
                break;
            default:
                ((ndn) obj).d(false);
                break;
        }
        return true;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((jh3) obj).I0(true);
                break;
            case 1:
                im3 im3Var = (im3) obj;
                gn3 gn3Var = im3Var.x;
                gn3Var.I = true;
                gn3Var.K = false;
                FadingRecyclerView fadingRecyclerView = (FadingRecyclerView) gn3Var.q.f;
                gn3Var.E = ((RecyclerView) fadingRecyclerView).M;
                fadingRecyclerView.B0(null);
                ((View) gn3Var.q.g).setVisibility(0);
                StatusBarDrawerAppBarLayout statusBarDrawerAppBarLayout = (StatusBarDrawerAppBarLayout) gn3Var.q.c;
                ((AppBarLayout) statusBarDrawerAppBarLayout).l = false;
                ((AppBarLayout) statusBarDrawerAppBarLayout).i = true;
                statusBarDrawerAppBarLayout.l(false, true);
                gn3Var.u();
                im3Var.O0(2131362163, false);
                im3Var.O0(2131362152, false);
                break;
            case 2:
                zse zseVar = (zse) obj;
                zseVar.J0(true);
                bte bteVarF = zseVar.G0().f();
                bteVarF.getClass();
                bteVarF.c.r(Boolean.TRUE);
                break;
            case 3:
                oy oyVar = (oy) obj;
                if (!oyVar.e()) {
                    ((kze) oyVar.e).r(Boolean.TRUE);
                    oyVar.a = false;
                    j1c j1cVar = (j1c) oyVar.j;
                    if (j1cVar != null) {
                        j1cVar.h(oyVar.e());
                    }
                    oyVar.l();
                    break;
                }
                break;
            default:
                ((ndn) obj).d(true);
                break;
        }
        return true;
    }
}
