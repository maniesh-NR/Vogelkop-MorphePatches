package defpackage;

import android.content.DialogInterface;
import android.content.IntentFilter;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.opera.android.StatusBarDrawerAppBarLayout;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.custom_views.FadingRecyclerView;
import com.opera.android.custom_views.SideMarginContainer;
import com.opera.android.history.d;
import com.opera.android.history.f;
import com.opera.android.ui.catalog.widget.OperaChip;
import com.opera.android.undo.UndoBar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class dda extends yyi implements jvk, o37 {
    public ztn A;
    public UndoBar B;
    public jy0 C;
    public UndoBar D;
    public cda E;
    public qf2 F;
    public final zyk G;
    public final a83 H;
    public final mvk I;
    public boolean J;
    public final ua7 x;
    public ei y;
    public bca z;

    public dda(gjm gjmVar) {
        super(2131558917, 2132020572, 2131755050, 2131755051);
        this.x = new ua7((Fragment) this, gjmVar);
        this.G = z4c.b(new t2(this, (byte) 23));
        this.H = new a83((Object) this, (byte) 8);
        this.I = nvk.v(2132018532);
    }

    @Override // defpackage.yyi
    public final boolean H0(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        tzi tziVar = this.r;
        if (itemId == 2131363132) {
            bca bcaVar = this.z;
            if (bcaVar == null) {
                bcaVar = null;
            }
            bcaVar.L(CollectionsKt.k0(Collections.unmodifiableSet((LinkedHashSet) tziVar.a.c)));
            tziVar.d();
            return true;
        }
        if (itemId == 2131363134) {
            L0().h(K0(), false);
            tziVar.d();
            return true;
        }
        if (itemId != 2131363133) {
            return super.H0(menuItem);
        }
        L0().h(K0(), true);
        tziVar.d();
        return true;
    }

    @Override // defpackage.yyi
    public final void J0(itd itdVar, int i) {
        itdVar.findItem(2131363132).setVisible(i > 0);
        MenuItem menuItemFindItem = itdVar.findItem(2131363134);
        menuItemFindItem.setVisible(i > 0);
        menuItemFindItem.setTitle(i > 1 ? getString(2132020201) : getString(2132018428));
        MenuItem menuItemFindItem2 = itdVar.findItem(2131363133);
        menuItemFindItem2.setVisible(i > 0);
        menuItemFindItem2.setTitle(i > 1 ? getString(2132019767) : getString(2132018430));
    }

    public final ArrayList K0() {
        Set<Long> setUnmodifiableSet = Collections.unmodifiableSet((LinkedHashSet) this.r.a.c);
        ArrayList arrayList = new ArrayList();
        for (Long l : setUnmodifiableSet) {
            bca bcaVar = this.z;
            if (bcaVar == null) {
                bcaVar = null;
            }
            aca acaVarH = bcaVar.H(l.longValue());
            if (acaVarH != null) {
                arrayList.add(acaVarH);
            }
        }
        return arrayList;
    }

    public final f L0() {
        return (f) this.G.getValue();
    }

    public final void M0(bca bcaVar) {
        bca bcaVar2 = this.z;
        tzi tziVar = this.r;
        a83 a83Var = this.H;
        if (bcaVar2 != null) {
            if (bcaVar2 == bcaVar) {
                return;
            }
            bcaVar2.unregisterAdapterDataObserver(a83Var);
            tziVar.d();
        }
        this.z = bcaVar;
        if (bcaVar == null) {
            bcaVar = null;
        }
        this.E = new cda(bcaVar, ((kea) L0().g.g()).a);
        bca bcaVar3 = this.z;
        if (bcaVar3 == null) {
            bcaVar3 = null;
        }
        bcaVar3.registerAdapterDataObserver(a83Var);
        d dVar = L0().f;
        Toolbar toolbar = this.l;
        ei eiVar = this.y;
        StatusBarDrawerAppBarLayout statusBarDrawerAppBarLayout = (StatusBarDrawerAppBarLayout) (eiVar == null ? null : eiVar).c;
        View view = (eiVar == null ? null : eiVar).i;
        if (eiVar == null) {
            eiVar = null;
        }
        FadingRecyclerView fadingRecyclerView = (FadingRecyclerView) eiVar.h;
        cda cdaVar = this.E;
        if (cdaVar == null) {
            cdaVar = null;
        }
        dVar.i(new j1c(toolbar, statusBarDrawerAppBarLayout, null, view, fadingRecyclerView, null, (yz7) cdaVar.d, new bda(this, (byte) 1), 36));
        bca bcaVar4 = this.z;
        if (bcaVar4 == null) {
            bcaVar4 = null;
        }
        tziVar.b((xph) bcaVar4.I().get());
        ei eiVar2 = this.y;
        if (eiVar2 == null) {
            eiVar2 = null;
        }
        FadingRecyclerView fadingRecyclerView2 = (FadingRecyclerView) eiVar2.h;
        cda cdaVar2 = this.E;
        fadingRecyclerView2.y0(((yz7) (cdaVar2 != null ? cdaVar2 : null).d).c);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N0(android.view.MenuItem r6, boolean r7) {
        /*
            r5 = this;
            int r0 = r6.getItemId()
            r1 = 2131364146(0x7f0a0932, float:1.834812E38)
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L19
            bca r5 = r5.z
            if (r5 == 0) goto L10
            r3 = r5
        L10:
            boolean r5 = r3.J()
            r5 = r5 ^ r2
            r6.setVisible(r5)
            return
        L19:
            r1 = 2131363132(0x7f0a053c, float:1.8346064E38)
            r4 = 0
            if (r0 != r1) goto L31
            if (r7 != 0) goto L2c
            bca r5 = r5.z
            if (r5 == 0) goto L26
            r3 = r5
        L26:
            boolean r5 = r3.J()
            if (r5 == 0) goto L2d
        L2c:
            r2 = r4
        L2d:
            r6.setVisible(r2)
            return
        L31:
            r1 = 2131363135(0x7f0a053f, float:1.834607E38)
            if (r0 != r1) goto L47
            if (r7 != 0) goto L43
            bca r5 = r5.z
            if (r5 == 0) goto L3d
            r3 = r5
        L3d:
            boolean r5 = r3.J()
            if (r5 == 0) goto L44
        L43:
            r2 = r4
        L44:
            r6.setVisible(r2)
        L47:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dda.N0(android.view.MenuItem, boolean):void");
    }

    @Override // defpackage.ryl
    public final void g0() {
        super.g0();
        cqp.r0(this.x, Unit.a);
    }

    @Override // defpackage.jvk
    public final void h(i iVar, hvk[] hvkVarArr) {
        mvk mvkVar = this.I;
        hvkVarArr[1] = mvkVar;
        hvkVarArr[0] = mvkVar;
    }

    @Override // defpackage.jvk
    public final void k(i iVar, hvk hvkVar) {
        bca bcaVar = this.z;
        if (bcaVar == null) {
            bcaVar = null;
        }
        bcaVar.K(iVar);
    }

    @Override // defpackage.k24
    public final void l0(boolean z) {
        if (L0().f.c()) {
            return;
        }
        super.l0(z);
    }

    @Override // defpackage.jvk
    public final boolean n(i iVar) {
        cda cdaVar = this.E;
        if (cdaVar == null) {
            cdaVar = null;
        }
        ((yz7) cdaVar.d).getClass();
        if (iVar instanceof xz7) {
            return false;
        }
        bca bcaVar = this.z;
        return (bcaVar != null ? bcaVar : null).n(iVar);
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        r rVarRequireActivity = requireActivity();
        qf2 qf2Var = this.F;
        if (qf2Var == null) {
            qf2Var = null;
        }
        rVarRequireActivity.unregisterReceiver(qf2Var);
        L0().f.i(null);
        UndoBar undoBar = this.B;
        if (undoBar == null) {
            undoBar = null;
        }
        undoBar.a(true);
        UndoBar undoBar2 = this.D;
        if (undoBar2 == null) {
            undoBar2 = null;
        }
        undoBar2.a(true);
        ztn ztnVar = this.A;
        (ztnVar != null ? ztnVar : null).getClass();
        super.onDestroyView();
    }

    @Override // defpackage.yyi, defpackage.ltl
    public final boolean onMenuItemClick(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId != 2131363132) {
            if (itemId != 2131363135) {
                return super.onMenuItemClick(menuItem);
            }
            this.r.c();
            return true;
        }
        int iOrdinal = ((kea) L0().g.g()).b.ordinal();
        final byte b = 0;
        if (iOrdinal == 0) {
            g25.b(requireActivity(), 0, 2132018551, 2132020155, new DialogInterface.OnClickListener() { // from class: ada
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    switch (b) {
                        case 0:
                            ac8.a(new m35(true, new rl((byte) 4)));
                            break;
                        default:
                            System.exit(0);
                            break;
                    }
                }
            });
            return true;
        }
        if (iOrdinal == 1) {
            g25.b(requireActivity(), 0, 2132018533, 2132020155, new sk(this, (byte) 8));
            return true;
        }
        h9o.p();
        return false;
    }

    @Override // defpackage.o37
    public final ua7 r() {
        return this.x;
    }

    @Override // defpackage.ltl
    public final void y0(LayoutInflater layoutInflater, StatusBarDrawingFrameLayout statusBarDrawingFrameLayout) {
        aea aeaVar;
        CoordinatorLayout coordinatorLayoutRequireViewById = statusBarDrawingFrameLayout.requireViewById(2131362473);
        int i = 2131362041;
        AppBarLayout appBarLayout = (StatusBarDrawerAppBarLayout) w1h.j(2131362041, coordinatorLayoutRequireViewById);
        if (appBarLayout != null) {
            i = 2131362314;
            Chip chip = (OperaChip) w1h.j(2131362314, coordinatorLayoutRequireViewById);
            if (chip != null) {
                i = 2131362317;
                ChipGroup chipGroup = (ChipGroup) w1h.j(2131362317, coordinatorLayoutRequireViewById);
                if (chipGroup != null) {
                    i = 2131362318;
                    SideMarginContainer sideMarginContainer = (SideMarginContainer) w1h.j(2131362318, coordinatorLayoutRequireViewById);
                    if (sideMarginContainer != null) {
                        i = 2131362325;
                        Chip chip2 = (OperaChip) w1h.j(2131362325, coordinatorLayoutRequireViewById);
                        if (chip2 != null) {
                            CoordinatorLayout coordinatorLayout = coordinatorLayoutRequireViewById;
                            i = 2131364014;
                            RecyclerView recyclerView = (FadingRecyclerView) w1h.j(2131364014, coordinatorLayoutRequireViewById);
                            if (recyclerView != null) {
                                i = 2131364164;
                                View viewJ = w1h.j(2131364164, coordinatorLayoutRequireViewById);
                                if (viewJ != null) {
                                    i = 2131364794;
                                    if (w1h.j(2131364794, coordinatorLayoutRequireViewById) != null) {
                                        this.y = new ei((ViewGroup) coordinatorLayout, (View) appBarLayout, (View) chip, (View) chipGroup, (View) sideMarginContainer, (View) chip2, (View) recyclerView, viewJ, (byte) 4);
                                        UndoBar undoBar = new UndoBar(requireActivity(), this.n, new bda(this, (byte) 2), new eq6(this), true);
                                        this.B = undoBar;
                                        undoBar.e(2131886162);
                                        UndoBar undoBar2 = new UndoBar(requireActivity(), this.n, new bda(this, (byte) 3), new qq6(this, (byte) 17), true);
                                        this.D = undoBar2;
                                        undoBar2.e(2131886162);
                                        r rVarRequireActivity = requireActivity();
                                        ga6 ga6Var = new ga6(this, (byte) 16);
                                        tzi tziVar = this.r;
                                        ztn ztnVar = new ztn(rVarRequireActivity, tziVar, ga6Var);
                                        this.A = ztnVar;
                                        ztnVar.setHasStableIds(true);
                                        jy0 jy0Var = new jy0(requireActivity(), tziVar, new nv6(this));
                                        this.C = jy0Var;
                                        jy0Var.setHasStableIds(true);
                                        ztn ztnVar2 = this.A;
                                        if (ztnVar2 == null) {
                                            ztnVar2 = null;
                                        }
                                        this.F = new qf2(requireActivity(), ztnVar2, L0());
                                        IntentFilter intentFilter = new IntentFilter();
                                        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
                                        intentFilter.addAction("android.intent.action.TIME_SET");
                                        intentFilter.addAction("android.intent.action.DATE_CHANGED");
                                        r rVarRequireActivity2 = requireActivity();
                                        qf2 qf2Var = this.F;
                                        if (qf2Var == null) {
                                            qf2Var = null;
                                        }
                                        rVarRequireActivity2.registerReceiver(qf2Var, intentFilter);
                                        flb flbVar = new flb(new nvk(requireActivity(), this));
                                        ei eiVar = this.y;
                                        if (eiVar == null) {
                                            eiVar = null;
                                        }
                                        RecyclerView recyclerView2 = (FadingRecyclerView) eiVar.h;
                                        recyclerView2.getContext();
                                        byte b = 0;
                                        recyclerView2.C0(new LinearLayoutManager(1, false));
                                        ((xkj) recyclerView2.M).g = false;
                                        flbVar.e(recyclerView2);
                                        ei eiVar2 = this.y;
                                        if (eiVar2 == null) {
                                            eiVar2 = null;
                                        }
                                        ((ChipGroup) eiVar2.e).g = new bda(this, b);
                                        if (!this.J) {
                                            this.J = true;
                                            f fVarL0 = L0();
                                            int iOrdinal = ((tca) this.x.p()).a.ordinal();
                                            if (iOrdinal == 0) {
                                                aeaVar = aea.a;
                                            } else {
                                                if (iOrdinal != 1) {
                                                    h9o.p();
                                                    return;
                                                }
                                                aeaVar = aea.b;
                                            }
                                            fVarL0.i(aeaVar);
                                        }
                                        d dVar = L0().f;
                                        MenuItem menuItemR0 = r0(2131364146);
                                        ei eiVar3 = this.y;
                                        dVar.j(menuItemR0, (FadingRecyclerView) (eiVar3 != null ? eiVar3 : null).h, 2132017282, 1);
                                        L0().g.j(getViewLifecycleOwner(), new cl4(new tu7((Object) this, (byte) 28), (byte) 28));
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(coordinatorLayoutRequireViewById.getResources().getResourceName(i)));
    }

    @Override // defpackage.ltl
    public final void z0() {
        ei eiVar = this.y;
        if (eiVar == null) {
            eiVar = null;
        }
        z4o.q0((FadingRecyclerView) eiVar.h);
        z4o.r0(this.k, (dxh) null);
    }
}
