package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.view.MenuItem;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.leanplum.utils.SizeUtil;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.downloads.DownloadFilterChip;
import com.opera.android.tabui2.recently_closed_tabs.RecentlyClosedTabsSheetLayoutSwitcher;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.android.widget.ThemeableLottieAnimationView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class iwa implements f7f, kr9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iwa(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final br9 a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (nna) obj;
            case 1:
                return new nr9(1, (o2b) obj, o2b.class, "onImportUIStateUpdated", "onImportUIStateUpdated(Lcom/opera/android/import_data/ImportUIState;)V", 0);
            case 2:
                return (rkc) obj;
            case 3:
                return (rkc) obj;
            case 4:
                return (rkc) obj;
            case 5:
                return (rkc) obj;
            case 6:
                return (ci7) obj;
            case 7:
                return (rkc) obj;
            case 8:
                return (rkc) obj;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return (rkc) obj;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return (g0e) obj;
            case 11:
                return (x9e) obj;
            case 12:
                return (mwc) obj;
            case 13:
                return (zbe) obj;
            case 14:
                return new nr9(1, (t5g) obj, t5g.class, "onStateUpdated", "onStateUpdated(Lcom/opera/android/autofill/passwords/PasswordsState;)V", 0);
            case 15:
                return new nr9(1, (f6g) obj, f6g.class, "updateState", "updateState(Lcom/opera/android/autofill/passwords/settings/PasswordsSettingsState;)V", 0);
            case 16:
                return (o5f) obj;
            case 17:
                return (o5f) obj;
            case SizeUtil.textSize0_1 /* 18 */:
                return (rmg) obj;
            case 19:
                return (veh) obj;
            case SizeUtil.textSize0 /* 20 */:
                return (nfh) obj;
            case 21:
                return (jjh) obj;
            case SizeUtil.textSize1 /* 22 */:
                return (rmg) obj;
            case 23:
                return (ldh) obj;
            case SizeUtil.textSize2 /* 24 */:
                return new nr9(1, (knh) obj, knh.class, "onRecentlyClosedTabsItemsChanged", "onRecentlyClosedTabsItemsChanged(Ljava/util/List;)V", 0);
            case 25:
                return (rmg) obj;
            case 26:
                return (rmg) obj;
            case 27:
                return (rmg) obj;
            case 28:
                return (wtd) obj;
            default:
                return (rmg) obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v20, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    public final void d0(Object obj) {
        byte b = this.a;
        final byte b2 = 1;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((nna) obj2).invoke(obj);
                break;
            case 1:
                n3b n3bVar = (n3b) obj;
                s9i s9iVar = ((o2b) obj2).s;
                ((MaterialButton) (s9iVar != null ? s9iVar : null).d).setEnabled(n3bVar.c);
                break;
            case 2:
                ((rkc) obj2).invoke(obj);
                break;
            case 3:
                ((rkc) obj2).invoke(obj);
                break;
            case 4:
                ((rkc) obj2).invoke(obj);
                break;
            case 5:
                ((rkc) obj2).invoke(obj);
                break;
            case 6:
                ((ci7) obj2).invoke(obj);
                break;
            case 7:
                ((rkc) obj2).invoke(obj);
                break;
            case 8:
                ((rkc) obj2).invoke(obj);
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((rkc) obj2).invoke(obj);
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((g0e) obj2).invoke(obj);
                break;
            case 11:
                ((x9e) obj2).invoke(obj);
                break;
            case 12:
                ((mwc) obj2).invoke(obj);
                break;
            case 13:
                break;
            case 14:
                q6g q6gVar = (q6g) obj;
                t5g t5gVar = (t5g) obj2;
                if (!Intrinsics.a(q6gVar, o6g.h)) {
                    if (!(q6gVar instanceof p6g)) {
                        h9o.p();
                        break;
                    } else {
                        n5g n5gVarH0 = t5gVar.H0();
                        p6g p6gVar = (p6g) q6gVar;
                        d5g d5gVar = n5gVarH0.f;
                        List list = p6gVar.h;
                        d5g d5gVar2 = new d5g(list, p6gVar.i, true, p6gVar.a, p6gVar.b, p6gVar.f, p6gVar.g);
                        pad padVar = n5gVarH0.e;
                        padVar.c = d5gVar;
                        padVar.b = d5gVar2;
                        j87 j87VarR = padVar.r(d5gVar.a, list);
                        n5gVarH0.f = d5gVar2;
                        j87VarR.b(n5gVarH0);
                        rf2 rf2Var = t5gVar.v;
                        FloatingActionButton floatingActionButton = rf2Var.f;
                        Chip chip = (DownloadFilterChip) rf2Var.g;
                        Chip chip2 = (DownloadFilterChip) rf2Var.k;
                        Chip chip3 = (DownloadFilterChip) rf2Var.e;
                        floatingActionButton.a(q6gVar.c ? 0 : 8, true);
                        chip3.setVisibility(!chip3.isChecked() ? 8 : 0);
                        chip2.setVisibility(!chip2.isChecked() ? 8 : 0);
                        chip.setVisibility(!chip.isChecked() ? 8 : 0);
                        ((LinearLayout) rf2Var.d).setVisibility((chip3.getVisibility() == 0 || chip2.getVisibility() == 0 || chip.getVisibility() == 0) ? 0 : 8);
                        MenuItem menuItemR0 = t5gVar.r0(2131361942);
                        if (menuItemR0 != null) {
                            menuItemR0.setVisible(q6gVar.d);
                        }
                        MenuItem menuItemR02 = t5gVar.r0(2131364146);
                        if (menuItemR02 != null) {
                            menuItemR02.setVisible(q6gVar.e);
                        }
                        MenuItem menuItemR03 = t5gVar.r0(2131363865);
                        if (menuItemR03 != null) {
                            menuItemR03.setVisible(true);
                            break;
                        }
                    }
                } else {
                    rf2 rf2Var2 = t5gVar.v;
                    rf2Var2.f.a(q6gVar.c ? (byte) 0 : (byte) 8, true);
                    ((LinearLayout) rf2Var2.d).setVisibility(8);
                    MenuItem menuItemR04 = t5gVar.r0(2131361942);
                    if (menuItemR04 != null) {
                        menuItemR04.setVisible(q6gVar.d);
                    }
                    MenuItem menuItemR05 = t5gVar.r0(2131364146);
                    if (menuItemR05 != null) {
                        menuItemR05.setVisible(q6gVar.e);
                    }
                    MenuItem menuItemR06 = t5gVar.r0(2131363865);
                    if (menuItemR06 != null) {
                        menuItemR06.setVisible(true);
                        break;
                    }
                }
                break;
            case 15:
                h6g h6gVar = (h6g) obj;
                f6g f6gVar = (f6g) obj2;
                OperaListItem operaListItem = f6gVar.I0().j;
                jji jjiVar = h6gVar.a;
                ryc rycVar = h6gVar.d;
                operaListItem.C(new rxh(jjiVar.a));
                f6gVar.I0().d.t(h6gVar.b);
                ?? r2 = f6gVar.I0().c;
                ns2 ns2Var = h6gVar.c;
                r2.setVisibility(ns2Var.a ? 0 : 8);
                r2.t(ns2Var.b);
                f6gVar.I0().h.setVisibility(rycVar.a ? 0 : 8);
                v0g.m(f6gVar.I0().h, rycVar.b.d(f6gVar.getResources()));
                f6gVar.I0().k.C(new rxh(h6gVar.e.c ? 2132021764 : 2132021134));
                OperaListItem operaListItem2 = f6gVar.I0().i;
                Resources resources = f6gVar.getResources();
                int i = h6gVar.f;
                operaListItem2.C(new qxh(resources.getQuantityString(2131886177, i, Integer.valueOf(i))));
                f6gVar.I0().b.setVisibility(h6gVar.g ? 0 : 8);
                f6gVar.I0().g.setVisibility(h6gVar.h ? 8 : 0);
                break;
            case 16:
                ((o5f) obj2).invoke(obj);
                break;
            case 17:
                ((o5f) obj2).invoke(obj);
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                ((rmg) obj2).invoke(obj);
                break;
            case 19:
                ((veh) obj2).invoke(obj);
                break;
            case SizeUtil.textSize0 /* 20 */:
                ((nfh) obj2).invoke(obj);
                break;
            case 21:
                ((jjh) obj2).invoke(obj);
                break;
            case SizeUtil.textSize1 /* 22 */:
                ((rmg) obj2).invoke(obj);
                break;
            case 23:
                ((ldh) obj2).invoke(obj);
                break;
            case SizeUtil.textSize2 /* 24 */:
                List list2 = (List) obj;
                knh knhVar = (knh) obj2;
                umh umhVar = knhVar.F;
                if (umhVar == null) {
                    umhVar = null;
                }
                List list3 = list2;
                umhVar.K(list3);
                boolean zIsEmpty = list3.isEmpty();
                y83 y83Var = knhVar.A;
                if (y83Var == null) {
                    y83Var = null;
                }
                ((StylingImageButton) ((kf) y83Var.d).c).setVisibility(!zIsEmpty ? 0 : 8);
                y83 y83Var2 = knhVar.A;
                final RecentlyClosedTabsSheetLayoutSwitcher recentlyClosedTabsSheetLayoutSwitcher = (RecentlyClosedTabsSheetLayoutSwitcher) (y83Var2 != null ? y83Var2 : null).e;
                mnh mnhVar = !zIsEmpty ? mnh.a : mnh.b;
                if (recentlyClosedTabsSheetLayoutSwitcher.a != mnhVar) {
                    recentlyClosedTabsSheetLayoutSwitcher.a = mnhVar;
                    recentlyClosedTabsSheetLayoutSwitcher.getChildAt(0).setVisibility(8);
                    ((LinearLayout) recentlyClosedTabsSheetLayoutSwitcher.a().b).setVisibility(8);
                    int iOrdinal = mnhVar.ordinal();
                    if (iOrdinal == 0) {
                        recentlyClosedTabsSheetLayoutSwitcher.getChildAt(0).setVisibility(0);
                        ((ThemeableLottieAnimationView) recentlyClosedTabsSheetLayoutSwitcher.a().c).q();
                        break;
                    } else if (iOrdinal != 1) {
                        h9o.p();
                        break;
                    } else {
                        ((LinearLayout) recentlyClosedTabsSheetLayoutSwitcher.a().b).setVisibility(0);
                        Context context = ((LinearLayout) recentlyClosedTabsSheetLayoutSwitcher.a().b).getContext();
                        recentlyClosedTabsSheetLayoutSwitcher.b = p37.r(f03.t(2130969325, context, 2131101243), f03.t(2130969263, context, 2131101243));
                        ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) recentlyClosedTabsSheetLayoutSwitcher.a().c;
                        dvb dvbVar = new dvb(new String[]{"**", "IconTheme", "**"});
                        PointF pointF = k3d.a;
                        themeableLottieAnimationView.v(dvbVar, 1, new ykj() { // from class: lnh
                            public final Object k(g3d g3dVar) {
                                byte b3 = b;
                                RecentlyClosedTabsSheetLayoutSwitcher recentlyClosedTabsSheetLayoutSwitcher2 = recentlyClosedTabsSheetLayoutSwitcher;
                                switch (b3) {
                                }
                                return Integer.valueOf(recentlyClosedTabsSheetLayoutSwitcher2.b);
                            }
                        });
                        ((ThemeableLottieAnimationView) recentlyClosedTabsSheetLayoutSwitcher.a().c).v(new dvb(new String[]{"**", "IconThemeStroke", "**"}), 2, new ykj() { // from class: lnh
                            public final Object k(g3d g3dVar) {
                                byte b3 = b2;
                                RecentlyClosedTabsSheetLayoutSwitcher recentlyClosedTabsSheetLayoutSwitcher2 = recentlyClosedTabsSheetLayoutSwitcher;
                                switch (b3) {
                                }
                                return Integer.valueOf(recentlyClosedTabsSheetLayoutSwitcher2.b);
                            }
                        });
                        ThemeableLottieAnimationView themeableLottieAnimationView2 = (ThemeableLottieAnimationView) recentlyClosedTabsSheetLayoutSwitcher.a().c;
                        themeableLottieAnimationView2.q();
                        f3d f3dVar = ((n2d) themeableLottieAnimationView2).d;
                        if (f3dVar.a == null) {
                            f3dVar.e.add(new c3d(f3dVar, 0, (byte) 0));
                        } else {
                            f3dVar.b.l(0.0f, (int) r1.k);
                        }
                        themeableLottieAnimationView2.h();
                        break;
                    }
                }
                break;
            case 25:
                ((rmg) obj2).invoke(obj);
                break;
            case 26:
                ((rmg) obj2).invoke(obj);
                break;
            case 27:
                ((rmg) obj2).invoke(obj);
                break;
            case 28:
                ((wtd) obj2).invoke(obj);
                break;
            default:
                ((rmg) obj2).invoke(obj);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 2:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 3:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 4:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 5:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 6:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 7:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 8:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 11:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 12:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 13:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 14:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 15:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 16:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 17:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 19:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case SizeUtil.textSize0 /* 20 */:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 21:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case SizeUtil.textSize1 /* 22 */:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 23:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case SizeUtil.textSize2 /* 24 */:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 25:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 26:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 27:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            case 28:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
        }
        return Intrinsics.a(a(), ((kr9) obj).a());
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return a().hashCode();
    }
}
