package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.leanplum.utils.SizeUtil;
import com.opera.android.custom_views.FadingNestedScrollView;
import com.opera.android.custom_views.MakeOperaDefaultBanner;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.android.widget.MenuSettingsListItem;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lk6j;", "Li93;", "<init>", "()V", "j6j", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k6j extends i93 {
    public static final /* synthetic */ xtb[] x = {new d6h(k6j.class, "binding", "getBinding()Lcom/opera/android/databinding/FragmentSettingsBinding;", 0), new d6h(k6j.class, "searchScrollListener", "getSearchScrollListener()Lcom/opera/android/settings/SettingsFragment$SearchScrollListener;", 0)};
    public final ktl t;
    public final zyk u;
    public final jp3 v;
    public MenuItem w;

    public k6j() {
        super(2132021061, 0, 14);
        this.t = F0(new a3j((byte) 1));
        this.u = z4c.b(new yse(this, (byte) 13));
        this.v = new jp3(new j3i(this, (byte) 18));
    }

    @Override // defpackage.i93
    public final h93 G0() {
        return I0();
    }

    public final pm9 H0() {
        xtb xtbVar = x[0];
        a5n a5nVar = this.t.b;
        Objects.requireNonNull(a5nVar);
        return (pm9) a5nVar;
    }

    public final daj I0() {
        return (daj) this.u.getValue();
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        super.onDestroyView();
        this.w = null;
    }

    @Override // defpackage.i93, defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        MenuSettingsListItem menuSettingsListItem = H0().d;
        ((StylingTextView) menuSettingsListItem.b.f).setText(getString(2132021063, new Object[]{getString(2132017591)}));
        final byte b = 15;
        H0().c.setOnClickListener(new View.OnClickListener(this) { // from class: h6j
            public final /* synthetic */ k6j b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b2 = b;
                k6j k6jVar = this.b;
                switch (b2) {
                    case 0:
                        xtb[] xtbVarArr = k6j.x;
                        ((g8j) k6jVar.I0().c).f(new int[0]);
                        break;
                    case 1:
                        xtb[] xtbVarArr2 = k6j.x;
                        g8j g8jVar = (g8j) k6jVar.I0().c;
                        g8jVar.getClass();
                        g8jVar.b.e(new xyg(new oba(2, 0, new int[0])), false);
                        break;
                    case 2:
                        xtb[] xtbVarArr3 = k6j.x;
                        ((g8j) k6jVar.I0().c).g(new int[0]);
                        break;
                    case 3:
                        xtb[] xtbVarArr4 = k6j.x;
                        g8j g8jVar2 = (g8j) k6jVar.I0().c;
                        g8jVar2.getClass();
                        g8jVar2.b.e(new x2f(new oba(2, 0, new int[0])), false);
                        break;
                    case 4:
                        xtb[] xtbVarArr5 = k6j.x;
                        ((g8j) k6jVar.I0().c).c(new int[0]);
                        break;
                    case 5:
                        xtb[] xtbVarArr6 = k6j.x;
                        g8j g8jVar3 = (g8j) k6jVar.I0().c;
                        g8jVar3.getClass();
                        g8jVar3.b.e(new brd(new oba(2, 0, new int[0])), false);
                        break;
                    case 6:
                        xtb[] xtbVarArr7 = k6j.x;
                        ((g8j) k6jVar.I0().c).e(new int[0]);
                        break;
                    case 7:
                        xtb[] xtbVarArr8 = k6j.x;
                        g8j g8jVar4 = (g8j) k6jVar.I0().c;
                        g8jVar4.getClass();
                        g8jVar4.b.e(new baa(new oba(2, 0, new int[0])), false);
                        break;
                    case 8:
                        xtb[] xtbVarArr9 = k6j.x;
                        g8j g8jVar5 = (g8j) k6jVar.I0().c;
                        g8jVar5.getClass();
                        g8jVar5.b.e(new o2(new oba(2, 0, new int[0])), false);
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        xtb[] xtbVarArr10 = k6j.x;
                        daj dajVarI0 = k6jVar.I0();
                        nv6 nv6VarB = dajVarI0.i.b();
                        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("make_default_banner.dismissed", true);
                        nv6VarB.w();
                        dajVarI0.g();
                        break;
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        xtb[] xtbVarArr11 = k6j.x;
                        mm6 mm6Var = k6jVar.I0().p;
                        ((SharedPreferences) mm6Var.a().c.get()).edit().putInt("resume_type", 6).putString("resume_deep_link", null).apply();
                        mm6Var.a().e(mm6Var.f, null);
                        break;
                    case 11:
                        xtb[] xtbVarArr12 = k6j.x;
                        k6jVar.I0().d.a(new int[0]);
                        break;
                    case 12:
                        xtb[] xtbVarArr13 = k6j.x;
                        k6jVar.I0().e.a(new int[0]);
                        break;
                    case 13:
                        xtb[] xtbVarArr14 = k6j.x;
                        k6jVar.I0().f.a(new int[0]);
                        break;
                    case 14:
                        xtb[] xtbVarArr15 = k6j.x;
                        k6jVar.I0().g.a();
                        break;
                    case 15:
                        xtb[] xtbVarArr16 = k6j.x;
                        k6jVar.I0().s();
                        break;
                    case 16:
                        xtb[] xtbVarArr17 = k6j.x;
                        k6jVar.I0().h.a(new int[0]);
                        break;
                    case 17:
                        xtb[] xtbVarArr18 = k6j.x;
                        ((g8j) k6jVar.I0().c).d(new int[0]);
                        break;
                    case SizeUtil.textSize0_1 /* 18 */:
                        xtb[] xtbVarArr19 = k6j.x;
                        ((g8j) k6jVar.I0().c).b(new int[0]);
                        break;
                    default:
                        xtb[] xtbVarArr20 = k6j.x;
                        ((g8j) k6jVar.I0().c).j(c8j.a, new int[0]);
                        break;
                }
            }
        });
        final byte b2 = 4;
        H0().g.setOnClickListener(new View.OnClickListener(this) { // from class: h6j
            public final /* synthetic */ k6j b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b2;
                k6j k6jVar = this.b;
                switch (b22) {
                    case 0:
                        xtb[] xtbVarArr = k6j.x;
                        ((g8j) k6jVar.I0().c).f(new int[0]);
                        break;
                    case 1:
                        xtb[] xtbVarArr2 = k6j.x;
                        g8j g8jVar = (g8j) k6jVar.I0().c;
                        g8jVar.getClass();
                        g8jVar.b.e(new xyg(new oba(2, 0, new int[0])), false);
                        break;
                    case 2:
                        xtb[] xtbVarArr3 = k6j.x;
                        ((g8j) k6jVar.I0().c).g(new int[0]);
                        break;
                    case 3:
                        xtb[] xtbVarArr4 = k6j.x;
                        g8j g8jVar2 = (g8j) k6jVar.I0().c;
                        g8jVar2.getClass();
                        g8jVar2.b.e(new x2f(new oba(2, 0, new int[0])), false);
                        break;
                    case 4:
                        xtb[] xtbVarArr5 = k6j.x;
                        ((g8j) k6jVar.I0().c).c(new int[0]);
                        break;
                    case 5:
                        xtb[] xtbVarArr6 = k6j.x;
                        g8j g8jVar3 = (g8j) k6jVar.I0().c;
                        g8jVar3.getClass();
                        g8jVar3.b.e(new brd(new oba(2, 0, new int[0])), false);
                        break;
                    case 6:
                        xtb[] xtbVarArr7 = k6j.x;
                        ((g8j) k6jVar.I0().c).e(new int[0]);
                        break;
                    case 7:
                        xtb[] xtbVarArr8 = k6j.x;
                        g8j g8jVar4 = (g8j) k6jVar.I0().c;
                        g8jVar4.getClass();
                        g8jVar4.b.e(new baa(new oba(2, 0, new int[0])), false);
                        break;
                    case 8:
                        xtb[] xtbVarArr9 = k6j.x;
                        g8j g8jVar5 = (g8j) k6jVar.I0().c;
                        g8jVar5.getClass();
                        g8jVar5.b.e(new o2(new oba(2, 0, new int[0])), false);
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        xtb[] xtbVarArr10 = k6j.x;
                        daj dajVarI0 = k6jVar.I0();
                        nv6 nv6VarB = dajVarI0.i.b();
                        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("make_default_banner.dismissed", true);
                        nv6VarB.w();
                        dajVarI0.g();
                        break;
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        xtb[] xtbVarArr11 = k6j.x;
                        mm6 mm6Var = k6jVar.I0().p;
                        ((SharedPreferences) mm6Var.a().c.get()).edit().putInt("resume_type", 6).putString("resume_deep_link", null).apply();
                        mm6Var.a().e(mm6Var.f, null);
                        break;
                    case 11:
                        xtb[] xtbVarArr12 = k6j.x;
                        k6jVar.I0().d.a(new int[0]);
                        break;
                    case 12:
                        xtb[] xtbVarArr13 = k6j.x;
                        k6jVar.I0().e.a(new int[0]);
                        break;
                    case 13:
                        xtb[] xtbVarArr14 = k6j.x;
                        k6jVar.I0().f.a(new int[0]);
                        break;
                    case 14:
                        xtb[] xtbVarArr15 = k6j.x;
                        k6jVar.I0().g.a();
                        break;
                    case 15:
                        xtb[] xtbVarArr16 = k6j.x;
                        k6jVar.I0().s();
                        break;
                    case 16:
                        xtb[] xtbVarArr17 = k6j.x;
                        k6jVar.I0().h.a(new int[0]);
                        break;
                    case 17:
                        xtb[] xtbVarArr18 = k6j.x;
                        ((g8j) k6jVar.I0().c).d(new int[0]);
                        break;
                    case SizeUtil.textSize0_1 /* 18 */:
                        xtb[] xtbVarArr19 = k6j.x;
                        ((g8j) k6jVar.I0().c).b(new int[0]);
                        break;
                    default:
                        xtb[] xtbVarArr20 = k6j.x;
                        ((g8j) k6jVar.I0().c).j(c8j.a, new int[0]);
                        break;
                }
            }
        });
        final byte b3 = 0;
        H0().g.u = new vlf(this) { // from class: i6j
            public final /* synthetic */ k6j b;

            {
                this.b = this;
            }

            @Override // defpackage.vlf
            public final void u(OperaListItem operaListItem, boolean z) {
                byte b4 = b3;
                final byte b5 = 0;
                final byte b6 = 1;
                k6j k6jVar = this.b;
                switch (b4) {
                    case 0:
                        xtb[] xtbVarArr = k6j.x;
                        k6jVar.I0().b.V(z ? 1 : 0, "ai_assistant_menu_shortcut");
                        break;
                    case 1:
                        xtb[] xtbVarArr2 = k6j.x;
                        k6jVar.I0().j.C(z);
                        break;
                    case 2:
                        xtb[] xtbVarArr3 = k6j.x;
                        k6jVar.I0().b.V(z ? 1 : 0, "compression");
                        break;
                    case 3:
                        xtb[] xtbVarArr4 = k6j.x;
                        final daj dajVarI0 = k6jVar.I0();
                        dajVarI0.l.getClass();
                        if (!Boolean.TRUE.booleanValue()) {
                            xf8.s0(dajVarI0.f.a, new qj(new Runnable() { // from class: baj
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b7 = b6;
                                    daj dajVar = dajVarI0;
                                    switch (b7) {
                                        case 0:
                                            dajVar.g();
                                            break;
                                        default:
                                            dajVar.g();
                                            break;
                                    }
                                }
                            }, (byte) 0), 2132017291, 2132017290);
                            break;
                        } else {
                            dajVarI0.b.V(z ? 1 : 0, "ad_blocking");
                            break;
                        }
                    case 4:
                        xtb[] xtbVarArr5 = k6j.x;
                        final daj dajVarI02 = k6jVar.I0();
                        dajVarI02.m.getClass();
                        if (!Boolean.TRUE.booleanValue()) {
                            xf8.s0(dajVarI02.g.a, new qj(new Runnable() { // from class: baj
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b7 = b5;
                                    daj dajVar = dajVarI02;
                                    switch (b7) {
                                        case 0:
                                            dajVar.g();
                                            break;
                                        default:
                                            dajVar.g();
                                            break;
                                    }
                                }
                            }, (byte) 8), 2132021971, 2132021970);
                            break;
                        } else {
                            dajVarI02.b.V(z ? 1 : 0, "tracker_blocker");
                            break;
                        }
                    default:
                        xtb[] xtbVarArr6 = k6j.x;
                        dxe dxeVar = k6jVar.I0().n;
                        if (dxeVar != null) {
                            dxeVar.T(z, true);
                            break;
                        }
                        break;
                }
            }
        };
        final byte b4 = 11;
        H0().t.setOnClickListener(new View.OnClickListener(this) { // from class: h6j
            public final /* synthetic */ k6j b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b4;
                k6j k6jVar = this.b;
                switch (b22) {
                    case 0:
                        xtb[] xtbVarArr = k6j.x;
                        ((g8j) k6jVar.I0().c).f(new int[0]);
                        break;
                    case 1:
                        xtb[] xtbVarArr2 = k6j.x;
                        g8j g8jVar = (g8j) k6jVar.I0().c;
                        g8jVar.getClass();
                        g8jVar.b.e(new xyg(new oba(2, 0, new int[0])), false);
                        break;
                    case 2:
                        xtb[] xtbVarArr3 = k6j.x;
                        ((g8j) k6jVar.I0().c).g(new int[0]);
                        break;
                    case 3:
                        xtb[] xtbVarArr4 = k6j.x;
                        g8j g8jVar2 = (g8j) k6jVar.I0().c;
                        g8jVar2.getClass();
                        g8jVar2.b.e(new x2f(new oba(2, 0, new int[0])), false);
                        break;
                    case 4:
                        xtb[] xtbVarArr5 = k6j.x;
                        ((g8j) k6jVar.I0().c).c(new int[0]);
                        break;
                    case 5:
                        xtb[] xtbVarArr6 = k6j.x;
                        g8j g8jVar3 = (g8j) k6jVar.I0().c;
                        g8jVar3.getClass();
                        g8jVar3.b.e(new brd(new oba(2, 0, new int[0])), false);
                        break;
                    case 6:
                        xtb[] xtbVarArr7 = k6j.x;
                        ((g8j) k6jVar.I0().c).e(new int[0]);
                        break;
                    case 7:
                        xtb[] xtbVarArr8 = k6j.x;
                        g8j g8jVar4 = (g8j) k6jVar.I0().c;
                        g8jVar4.getClass();
                        g8jVar4.b.e(new baa(new oba(2, 0, new int[0])), false);
                        break;
                    case 8:
                        xtb[] xtbVarArr9 = k6j.x;
                        g8j g8jVar5 = (g8j) k6jVar.I0().c;
                        g8jVar5.getClass();
                        g8jVar5.b.e(new o2(new oba(2, 0, new int[0])), false);
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        xtb[] xtbVarArr10 = k6j.x;
                        daj dajVarI0 = k6jVar.I0();
                        nv6 nv6VarB = dajVarI0.i.b();
                        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("make_default_banner.dismissed", true);
                        nv6VarB.w();
                        dajVarI0.g();
                        break;
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        xtb[] xtbVarArr11 = k6j.x;
                        mm6 mm6Var = k6jVar.I0().p;
                        ((SharedPreferences) mm6Var.a().c.get()).edit().putInt("resume_type", 6).putString("resume_deep_link", null).apply();
                        mm6Var.a().e(mm6Var.f, null);
                        break;
                    case 11:
                        xtb[] xtbVarArr12 = k6j.x;
                        k6jVar.I0().d.a(new int[0]);
                        break;
                    case 12:
                        xtb[] xtbVarArr13 = k6j.x;
                        k6jVar.I0().e.a(new int[0]);
                        break;
                    case 13:
                        xtb[] xtbVarArr14 = k6j.x;
                        k6jVar.I0().f.a(new int[0]);
                        break;
                    case 14:
                        xtb[] xtbVarArr15 = k6j.x;
                        k6jVar.I0().g.a();
                        break;
                    case 15:
                        xtb[] xtbVarArr16 = k6j.x;
                        k6jVar.I0().s();
                        break;
                    case 16:
                        xtb[] xtbVarArr17 = k6j.x;
                        k6jVar.I0().h.a(new int[0]);
                        break;
                    case 17:
                        xtb[] xtbVarArr18 = k6j.x;
                        ((g8j) k6jVar.I0().c).d(new int[0]);
                        break;
                    case SizeUtil.textSize0_1 /* 18 */:
                        xtb[] xtbVarArr19 = k6j.x;
                        ((g8j) k6jVar.I0().c).b(new int[0]);
                        break;
                    default:
                        xtb[] xtbVarArr20 = k6j.x;
                        ((g8j) k6jVar.I0().c).j(c8j.a, new int[0]);
                        break;
                }
            }
        });
        final byte b5 = 1;
        H0().t.u = new vlf(this) { // from class: i6j
            public final /* synthetic */ k6j b;

            {
                this.b = this;
            }

            @Override // defpackage.vlf
            public final void u(OperaListItem operaListItem, boolean z) {
                byte b42 = b5;
                final byte b52 = 0;
                final byte b6 = 1;
                k6j k6jVar = this.b;
                switch (b42) {
                    case 0:
                        xtb[] xtbVarArr = k6j.x;
                        k6jVar.I0().b.V(z ? 1 : 0, "ai_assistant_menu_shortcut");
                        break;
                    case 1:
                        xtb[] xtbVarArr2 = k6j.x;
                        k6jVar.I0().j.C(z);
                        break;
                    case 2:
                        xtb[] xtbVarArr3 = k6j.x;
                        k6jVar.I0().b.V(z ? 1 : 0, "compression");
                        break;
                    case 3:
                        xtb[] xtbVarArr4 = k6j.x;
                        final daj dajVarI0 = k6jVar.I0();
                        dajVarI0.l.getClass();
                        if (!Boolean.TRUE.booleanValue()) {
                            xf8.s0(dajVarI0.f.a, new qj(new Runnable() { // from class: baj
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b7 = b6;
                                    daj dajVar = dajVarI0;
                                    switch (b7) {
                                        case 0:
                                            dajVar.g();
                                            break;
                                        default:
                                            dajVar.g();
                                            break;
                                    }
                                }
                            }, (byte) 0), 2132017291, 2132017290);
                            break;
                        } else {
                            dajVarI0.b.V(z ? 1 : 0, "ad_blocking");
                            break;
                        }
                    case 4:
                        xtb[] xtbVarArr5 = k6j.x;
                        final daj dajVarI02 = k6jVar.I0();
                        dajVarI02.m.getClass();
                        if (!Boolean.TRUE.booleanValue()) {
                            xf8.s0(dajVarI02.g.a, new qj(new Runnable() { // from class: baj
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b7 = b52;
                                    daj dajVar = dajVarI02;
                                    switch (b7) {
                                        case 0:
                                            dajVar.g();
                                            break;
                                        default:
                                            dajVar.g();
                                            break;
                                    }
                                }
                            }, (byte) 8), 2132021971, 2132021970);
                            break;
                        } else {
                            dajVarI02.b.V(z ? 1 : 0, "tracker_blocker");
                            break;
                        }
                    default:
                        xtb[] xtbVarArr6 = k6j.x;
                        dxe dxeVar = k6jVar.I0().n;
                        if (dxeVar != null) {
                            dxeVar.T(z, true);
                            break;
                        }
                        break;
                }
            }
        };
        final byte b6 = 12;
        H0().i.setOnClickListener(new View.OnClickListener(this) { // from class: h6j
            public final /* synthetic */ k6j b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b6;
                k6j k6jVar = this.b;
                switch (b22) {
                    case 0:
                        xtb[] xtbVarArr = k6j.x;
                        ((g8j) k6jVar.I0().c).f(new int[0]);
                        break;
                    case 1:
                        xtb[] xtbVarArr2 = k6j.x;
                        g8j g8jVar = (g8j) k6jVar.I0().c;
                        g8jVar.getClass();
                        g8jVar.b.e(new xyg(new oba(2, 0, new int[0])), false);
                        break;
                    case 2:
                        xtb[] xtbVarArr3 = k6j.x;
                        ((g8j) k6jVar.I0().c).g(new int[0]);
                        break;
                    case 3:
                        xtb[] xtbVarArr4 = k6j.x;
                        g8j g8jVar2 = (g8j) k6jVar.I0().c;
                        g8jVar2.getClass();
                        g8jVar2.b.e(new x2f(new oba(2, 0, new int[0])), false);
                        break;
                    case 4:
                        xtb[] xtbVarArr5 = k6j.x;
                        ((g8j) k6jVar.I0().c).c(new int[0]);
                        break;
                    case 5:
                        xtb[] xtbVarArr6 = k6j.x;
                        g8j g8jVar3 = (g8j) k6jVar.I0().c;
                        g8jVar3.getClass();
                        g8jVar3.b.e(new brd(new oba(2, 0, new int[0])), false);
                        break;
                    case 6:
                        xtb[] xtbVarArr7 = k6j.x;
                        ((g8j) k6jVar.I0().c).e(new int[0]);
                        break;
                    case 7:
                        xtb[] xtbVarArr8 = k6j.x;
                        g8j g8jVar4 = (g8j) k6jVar.I0().c;
                        g8jVar4.getClass();
                        g8jVar4.b.e(new baa(new oba(2, 0, new int[0])), false);
                        break;
                    case 8:
                        xtb[] xtbVarArr9 = k6j.x;
                        g8j g8jVar5 = (g8j) k6jVar.I0().c;
                        g8jVar5.getClass();
                        g8jVar5.b.e(new o2(new oba(2, 0, new int[0])), false);
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        xtb[] xtbVarArr10 = k6j.x;
                        daj dajVarI0 = k6jVar.I0();
                        nv6 nv6VarB = dajVarI0.i.b();
                        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("make_default_banner.dismissed", true);
                        nv6VarB.w();
                        dajVarI0.g();
                        break;
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        xtb[] xtbVarArr11 = k6j.x;
                        mm6 mm6Var = k6jVar.I0().p;
                        ((SharedPreferences) mm6Var.a().c.get()).edit().putInt("resume_type", 6).putString("resume_deep_link", null).apply();
                        mm6Var.a().e(mm6Var.f, null);
                        break;
                    case 11:
                        xtb[] xtbVarArr12 = k6j.x;
                        k6jVar.I0().d.a(new int[0]);
                        break;
                    case 12:
                        xtb[] xtbVarArr13 = k6j.x;
                        k6jVar.I0().e.a(new int[0]);
                        break;
                    case 13:
                        xtb[] xtbVarArr14 = k6j.x;
                        k6jVar.I0().f.a(new int[0]);
                        break;
                    case 14:
                        xtb[] xtbVarArr15 = k6j.x;
                        k6jVar.I0().g.a();
                        break;
                    case 15:
                        xtb[] xtbVarArr16 = k6j.x;
                        k6jVar.I0().s();
                        break;
                    case 16:
                        xtb[] xtbVarArr17 = k6j.x;
                        k6jVar.I0().h.a(new int[0]);
                        break;
                    case 17:
                        xtb[] xtbVarArr18 = k6j.x;
                        ((g8j) k6jVar.I0().c).d(new int[0]);
                        break;
                    case SizeUtil.textSize0_1 /* 18 */:
                        xtb[] xtbVarArr19 = k6j.x;
                        ((g8j) k6jVar.I0().c).b(new int[0]);
                        break;
                    default:
                        xtb[] xtbVarArr20 = k6j.x;
                        ((g8j) k6jVar.I0().c).j(c8j.a, new int[0]);
                        break;
                }
            }
        });
        final byte b7 = 2;
        H0().i.u = new vlf(this) { // from class: i6j
            public final /* synthetic */ k6j b;

            {
                this.b = this;
            }

            @Override // defpackage.vlf
            public final void u(OperaListItem operaListItem, boolean z) {
                byte b42 = b7;
                final byte b52 = 0;
                final byte b62 = 1;
                k6j k6jVar = this.b;
                switch (b42) {
                    case 0:
                        xtb[] xtbVarArr = k6j.x;
                        k6jVar.I0().b.V(z ? 1 : 0, "ai_assistant_menu_shortcut");
                        break;
                    case 1:
                        xtb[] xtbVarArr2 = k6j.x;
                        k6jVar.I0().j.C(z);
                        break;
                    case 2:
                        xtb[] xtbVarArr3 = k6j.x;
                        k6jVar.I0().b.V(z ? 1 : 0, "compression");
                        break;
                    case 3:
                        xtb[] xtbVarArr4 = k6j.x;
                        final daj dajVarI0 = k6jVar.I0();
                        dajVarI0.l.getClass();
                        if (!Boolean.TRUE.booleanValue()) {
                            xf8.s0(dajVarI0.f.a, new qj(new Runnable() { // from class: baj
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b72 = b62;
                                    daj dajVar = dajVarI0;
                                    switch (b72) {
                                        case 0:
                                            dajVar.g();
                                            break;
                                        default:
                                            dajVar.g();
                                            break;
                                    }
                                }
                            }, (byte) 0), 2132017291, 2132017290);
                            break;
                        } else {
                            dajVarI0.b.V(z ? 1 : 0, "ad_blocking");
                            break;
                        }
                    case 4:
                        xtb[] xtbVarArr5 = k6j.x;
                        final daj dajVarI02 = k6jVar.I0();
                        dajVarI02.m.getClass();
                        if (!Boolean.TRUE.booleanValue()) {
                            xf8.s0(dajVarI02.g.a, new qj(new Runnable() { // from class: baj
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b72 = b52;
                                    daj dajVar = dajVarI02;
                                    switch (b72) {
                                        case 0:
                                            dajVar.g();
                                            break;
                                        default:
                                            dajVar.g();
                                            break;
                                    }
                                }
                            }, (byte) 8), 2132021971, 2132021970);
                            break;
                        } else {
                            dajVarI02.b.V(z ? 1 : 0, "tracker_blocker");
                            break;
                        }
                    default:
                        xtb[] xtbVarArr6 = k6j.x;
                        dxe dxeVar = k6jVar.I0().n;
                        if (dxeVar != null) {
                            dxeVar.T(z, true);
                            break;
                        }
                        break;
                }
            }
        };
        final byte b8 = 13;
        H0().e.setOnClickListener(new View.OnClickListener(this) { // from class: h6j
            public final /* synthetic */ k6j b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b8;
                k6j k6jVar = this.b;
                switch (b22) {
                    case 0:
                        xtb[] xtbVarArr = k6j.x;
                        ((g8j) k6jVar.I0().c).f(new int[0]);
                        break;
                    case 1:
                        xtb[] xtbVarArr2 = k6j.x;
                        g8j g8jVar = (g8j) k6jVar.I0().c;
                        g8jVar.getClass();
                        g8jVar.b.e(new xyg(new oba(2, 0, new int[0])), false);
                        break;
                    case 2:
                        xtb[] xtbVarArr3 = k6j.x;
                        ((g8j) k6jVar.I0().c).g(new int[0]);
                        break;
                    case 3:
                        xtb[] xtbVarArr4 = k6j.x;
                        g8j g8jVar2 = (g8j) k6jVar.I0().c;
                        g8jVar2.getClass();
                        g8jVar2.b.e(new x2f(new oba(2, 0, new int[0])), false);
                        break;
                    case 4:
                        xtb[] xtbVarArr5 = k6j.x;
                        ((g8j) k6jVar.I0().c).c(new int[0]);
                        break;
                    case 5:
                        xtb[] xtbVarArr6 = k6j.x;
                        g8j g8jVar3 = (g8j) k6jVar.I0().c;
                        g8jVar3.getClass();
                        g8jVar3.b.e(new brd(new oba(2, 0, new int[0])), false);
                        break;
                    case 6:
                        xtb[] xtbVarArr7 = k6j.x;
                        ((g8j) k6jVar.I0().c).e(new int[0]);
                        break;
                    case 7:
                        xtb[] xtbVarArr8 = k6j.x;
                        g8j g8jVar4 = (g8j) k6jVar.I0().c;
                        g8jVar4.getClass();
                        g8jVar4.b.e(new baa(new oba(2, 0, new int[0])), false);
                        break;
                    case 8:
                        xtb[] xtbVarArr9 = k6j.x;
                        g8j g8jVar5 = (g8j) k6jVar.I0().c;
                        g8jVar5.getClass();
                        g8jVar5.b.e(new o2(new oba(2, 0, new int[0])), false);
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        xtb[] xtbVarArr10 = k6j.x;
                        daj dajVarI0 = k6jVar.I0();
                        nv6 nv6VarB = dajVarI0.i.b();
                        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("make_default_banner.dismissed", true);
                        nv6VarB.w();
                        dajVarI0.g();
                        break;
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        xtb[] xtbVarArr11 = k6j.x;
                        mm6 mm6Var = k6jVar.I0().p;
                        ((SharedPreferences) mm6Var.a().c.get()).edit().putInt("resume_type", 6).putString("resume_deep_link", null).apply();
                        mm6Var.a().e(mm6Var.f, null);
                        break;
                    case 11:
                        xtb[] xtbVarArr12 = k6j.x;
                        k6jVar.I0().d.a(new int[0]);
                        break;
                    case 12:
                        xtb[] xtbVarArr13 = k6j.x;
                        k6jVar.I0().e.a(new int[0]);
                        break;
                    case 13:
                        xtb[] xtbVarArr14 = k6j.x;
                        k6jVar.I0().f.a(new int[0]);
                        break;
                    case 14:
                        xtb[] xtbVarArr15 = k6j.x;
                        k6jVar.I0().g.a();
                        break;
                    case 15:
                        xtb[] xtbVarArr16 = k6j.x;
                        k6jVar.I0().s();
                        break;
                    case 16:
                        xtb[] xtbVarArr17 = k6j.x;
                        k6jVar.I0().h.a(new int[0]);
                        break;
                    case 17:
                        xtb[] xtbVarArr18 = k6j.x;
                        ((g8j) k6jVar.I0().c).d(new int[0]);
                        break;
                    case SizeUtil.textSize0_1 /* 18 */:
                        xtb[] xtbVarArr19 = k6j.x;
                        ((g8j) k6jVar.I0().c).b(new int[0]);
                        break;
                    default:
                        xtb[] xtbVarArr20 = k6j.x;
                        ((g8j) k6jVar.I0().c).j(c8j.a, new int[0]);
                        break;
                }
            }
        });
        final byte b9 = 3;
        H0().e.u = new vlf(this) { // from class: i6j
            public final /* synthetic */ k6j b;

            {
                this.b = this;
            }

            @Override // defpackage.vlf
            public final void u(OperaListItem operaListItem, boolean z) {
                byte b42 = b9;
                final byte b52 = 0;
                final byte b62 = 1;
                k6j k6jVar = this.b;
                switch (b42) {
                    case 0:
                        xtb[] xtbVarArr = k6j.x;
                        k6jVar.I0().b.V(z ? 1 : 0, "ai_assistant_menu_shortcut");
                        break;
                    case 1:
                        xtb[] xtbVarArr2 = k6j.x;
                        k6jVar.I0().j.C(z);
                        break;
                    case 2:
                        xtb[] xtbVarArr3 = k6j.x;
                        k6jVar.I0().b.V(z ? 1 : 0, "compression");
                        break;
                    case 3:
                        xtb[] xtbVarArr4 = k6j.x;
                        final daj dajVarI0 = k6jVar.I0();
                        dajVarI0.l.getClass();
                        if (!Boolean.TRUE.booleanValue()) {
                            xf8.s0(dajVarI0.f.a, new qj(new Runnable() { // from class: baj
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b72 = b62;
                                    daj dajVar = dajVarI0;
                                    switch (b72) {
                                        case 0:
                                            dajVar.g();
                                            break;
                                        default:
                                            dajVar.g();
                                            break;
                                    }
                                }
                            }, (byte) 0), 2132017291, 2132017290);
                            break;
                        } else {
                            dajVarI0.b.V(z ? 1 : 0, "ad_blocking");
                            break;
                        }
                    case 4:
                        xtb[] xtbVarArr5 = k6j.x;
                        final daj dajVarI02 = k6jVar.I0();
                        dajVarI02.m.getClass();
                        if (!Boolean.TRUE.booleanValue()) {
                            xf8.s0(dajVarI02.g.a, new qj(new Runnable() { // from class: baj
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b72 = b52;
                                    daj dajVar = dajVarI02;
                                    switch (b72) {
                                        case 0:
                                            dajVar.g();
                                            break;
                                        default:
                                            dajVar.g();
                                            break;
                                    }
                                }
                            }, (byte) 8), 2132021971, 2132021970);
                            break;
                        } else {
                            dajVarI02.b.V(z ? 1 : 0, "tracker_blocker");
                            break;
                        }
                    default:
                        xtb[] xtbVarArr6 = k6j.x;
                        dxe dxeVar = k6jVar.I0().n;
                        if (dxeVar != null) {
                            dxeVar.T(z, true);
                            break;
                        }
                        break;
                }
            }
        };
        final byte b10 = 14;
        H0().s.setOnClickListener(new View.OnClickListener(this) { // from class: h6j
            public final /* synthetic */ k6j b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b10;
                k6j k6jVar = this.b;
                switch (b22) {
                    case 0:
                        xtb[] xtbVarArr = k6j.x;
                        ((g8j) k6jVar.I0().c).f(new int[0]);
                        break;
                    case 1:
                        xtb[] xtbVarArr2 = k6j.x;
                        g8j g8jVar = (g8j) k6jVar.I0().c;
                        g8jVar.getClass();
                        g8jVar.b.e(new xyg(new oba(2, 0, new int[0])), false);
                        break;
                    case 2:
                        xtb[] xtbVarArr3 = k6j.x;
                        ((g8j) k6jVar.I0().c).g(new int[0]);
                        break;
                    case 3:
                        xtb[] xtbVarArr4 = k6j.x;
                        g8j g8jVar2 = (g8j) k6jVar.I0().c;
                        g8jVar2.getClass();
                        g8jVar2.b.e(new x2f(new oba(2, 0, new int[0])), false);
                        break;
                    case 4:
                        xtb[] xtbVarArr5 = k6j.x;
                        ((g8j) k6jVar.I0().c).c(new int[0]);
                        break;
                    case 5:
                        xtb[] xtbVarArr6 = k6j.x;
                        g8j g8jVar3 = (g8j) k6jVar.I0().c;
                        g8jVar3.getClass();
                        g8jVar3.b.e(new brd(new oba(2, 0, new int[0])), false);
                        break;
                    case 6:
                        xtb[] xtbVarArr7 = k6j.x;
                        ((g8j) k6jVar.I0().c).e(new int[0]);
                        break;
                    case 7:
                        xtb[] xtbVarArr8 = k6j.x;
                        g8j g8jVar4 = (g8j) k6jVar.I0().c;
                        g8jVar4.getClass();
                        g8jVar4.b.e(new baa(new oba(2, 0, new int[0])), false);
                        break;
                    case 8:
                        xtb[] xtbVarArr9 = k6j.x;
                        g8j g8jVar5 = (g8j) k6jVar.I0().c;
                        g8jVar5.getClass();
                        g8jVar5.b.e(new o2(new oba(2, 0, new int[0])), false);
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        xtb[] xtbVarArr10 = k6j.x;
                        daj dajVarI0 = k6jVar.I0();
                        nv6 nv6VarB = dajVarI0.i.b();
                        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("make_default_banner.dismissed", true);
                        nv6VarB.w();
                        dajVarI0.g();
                        break;
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        xtb[] xtbVarArr11 = k6j.x;
                        mm6 mm6Var = k6jVar.I0().p;
                        ((SharedPreferences) mm6Var.a().c.get()).edit().putInt("resume_type", 6).putString("resume_deep_link", null).apply();
                        mm6Var.a().e(mm6Var.f, null);
                        break;
                    case 11:
                        xtb[] xtbVarArr12 = k6j.x;
                        k6jVar.I0().d.a(new int[0]);
                        break;
                    case 12:
                        xtb[] xtbVarArr13 = k6j.x;
                        k6jVar.I0().e.a(new int[0]);
                        break;
                    case 13:
                        xtb[] xtbVarArr14 = k6j.x;
                        k6jVar.I0().f.a(new int[0]);
                        break;
                    case 14:
                        xtb[] xtbVarArr15 = k6j.x;
                        k6jVar.I0().g.a();
                        break;
                    case 15:
                        xtb[] xtbVarArr16 = k6j.x;
                        k6jVar.I0().s();
                        break;
                    case 16:
                        xtb[] xtbVarArr17 = k6j.x;
                        k6jVar.I0().h.a(new int[0]);
                        break;
                    case 17:
                        xtb[] xtbVarArr18 = k6j.x;
                        ((g8j) k6jVar.I0().c).d(new int[0]);
                        break;
                    case SizeUtil.textSize0_1 /* 18 */:
                        xtb[] xtbVarArr19 = k6j.x;
                        ((g8j) k6jVar.I0().c).b(new int[0]);
                        break;
                    default:
                        xtb[] xtbVarArr20 = k6j.x;
                        ((g8j) k6jVar.I0().c).j(c8j.a, new int[0]);
                        break;
                }
            }
        });
        H0().s.u = new vlf(this) { // from class: i6j
            public final /* synthetic */ k6j b;

            {
                this.b = this;
            }

            @Override // defpackage.vlf
            public final void u(OperaListItem operaListItem, boolean z) {
                byte b42 = b2;
                final byte b52 = 0;
                final byte b62 = 1;
                k6j k6jVar = this.b;
                switch (b42) {
                    case 0:
                        xtb[] xtbVarArr = k6j.x;
                        k6jVar.I0().b.V(z ? 1 : 0, "ai_assistant_menu_shortcut");
                        break;
                    case 1:
                        xtb[] xtbVarArr2 = k6j.x;
                        k6jVar.I0().j.C(z);
                        break;
                    case 2:
                        xtb[] xtbVarArr3 = k6j.x;
                        k6jVar.I0().b.V(z ? 1 : 0, "compression");
                        break;
                    case 3:
                        xtb[] xtbVarArr4 = k6j.x;
                        final daj dajVarI0 = k6jVar.I0();
                        dajVarI0.l.getClass();
                        if (!Boolean.TRUE.booleanValue()) {
                            xf8.s0(dajVarI0.f.a, new qj(new Runnable() { // from class: baj
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b72 = b62;
                                    daj dajVar = dajVarI0;
                                    switch (b72) {
                                        case 0:
                                            dajVar.g();
                                            break;
                                        default:
                                            dajVar.g();
                                            break;
                                    }
                                }
                            }, (byte) 0), 2132017291, 2132017290);
                            break;
                        } else {
                            dajVarI0.b.V(z ? 1 : 0, "ad_blocking");
                            break;
                        }
                    case 4:
                        xtb[] xtbVarArr5 = k6j.x;
                        final daj dajVarI02 = k6jVar.I0();
                        dajVarI02.m.getClass();
                        if (!Boolean.TRUE.booleanValue()) {
                            xf8.s0(dajVarI02.g.a, new qj(new Runnable() { // from class: baj
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b72 = b52;
                                    daj dajVar = dajVarI02;
                                    switch (b72) {
                                        case 0:
                                            dajVar.g();
                                            break;
                                        default:
                                            dajVar.g();
                                            break;
                                    }
                                }
                            }, (byte) 8), 2132021971, 2132021970);
                            break;
                        } else {
                            dajVarI02.b.V(z ? 1 : 0, "tracker_blocker");
                            break;
                        }
                    default:
                        xtb[] xtbVarArr6 = k6j.x;
                        dxe dxeVar = k6jVar.I0().n;
                        if (dxeVar != null) {
                            dxeVar.T(z, true);
                            break;
                        }
                        break;
                }
            }
        };
        final byte b11 = 16;
        H0().m.setOnClickListener(new View.OnClickListener(this) { // from class: h6j
            public final /* synthetic */ k6j b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b11;
                k6j k6jVar = this.b;
                switch (b22) {
                    case 0:
                        xtb[] xtbVarArr = k6j.x;
                        ((g8j) k6jVar.I0().c).f(new int[0]);
                        break;
                    case 1:
                        xtb[] xtbVarArr2 = k6j.x;
                        g8j g8jVar = (g8j) k6jVar.I0().c;
                        g8jVar.getClass();
                        g8jVar.b.e(new xyg(new oba(2, 0, new int[0])), false);
                        break;
                    case 2:
                        xtb[] xtbVarArr3 = k6j.x;
                        ((g8j) k6jVar.I0().c).g(new int[0]);
                        break;
                    case 3:
                        xtb[] xtbVarArr4 = k6j.x;
                        g8j g8jVar2 = (g8j) k6jVar.I0().c;
                        g8jVar2.getClass();
                        g8jVar2.b.e(new x2f(new oba(2, 0, new int[0])), false);
                        break;
                    case 4:
                        xtb[] xtbVarArr5 = k6j.x;
                        ((g8j) k6jVar.I0().c).c(new int[0]);
                        break;
                    case 5:
                        xtb[] xtbVarArr6 = k6j.x;
                        g8j g8jVar3 = (g8j) k6jVar.I0().c;
                        g8jVar3.getClass();
                        g8jVar3.b.e(new brd(new oba(2, 0, new int[0])), false);
                        break;
                    case 6:
                        xtb[] xtbVarArr7 = k6j.x;
                        ((g8j) k6jVar.I0().c).e(new int[0]);
                        break;
                    case 7:
                        xtb[] xtbVarArr8 = k6j.x;
                        g8j g8jVar4 = (g8j) k6jVar.I0().c;
                        g8jVar4.getClass();
                        g8jVar4.b.e(new baa(new oba(2, 0, new int[0])), false);
                        break;
                    case 8:
                        xtb[] xtbVarArr9 = k6j.x;
                        g8j g8jVar5 = (g8j) k6jVar.I0().c;
                        g8jVar5.getClass();
                        g8jVar5.b.e(new o2(new oba(2, 0, new int[0])), false);
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        xtb[] xtbVarArr10 = k6j.x;
                        daj dajVarI0 = k6jVar.I0();
                        nv6 nv6VarB = dajVarI0.i.b();
                        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("make_default_banner.dismissed", true);
                        nv6VarB.w();
                        dajVarI0.g();
                        break;
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        xtb[] xtbVarArr11 = k6j.x;
                        mm6 mm6Var = k6jVar.I0().p;
                        ((SharedPreferences) mm6Var.a().c.get()).edit().putInt("resume_type", 6).putString("resume_deep_link", null).apply();
                        mm6Var.a().e(mm6Var.f, null);
                        break;
                    case 11:
                        xtb[] xtbVarArr12 = k6j.x;
                        k6jVar.I0().d.a(new int[0]);
                        break;
                    case 12:
                        xtb[] xtbVarArr13 = k6j.x;
                        k6jVar.I0().e.a(new int[0]);
                        break;
                    case 13:
                        xtb[] xtbVarArr14 = k6j.x;
                        k6jVar.I0().f.a(new int[0]);
                        break;
                    case 14:
                        xtb[] xtbVarArr15 = k6j.x;
                        k6jVar.I0().g.a();
                        break;
                    case 15:
                        xtb[] xtbVarArr16 = k6j.x;
                        k6jVar.I0().s();
                        break;
                    case 16:
                        xtb[] xtbVarArr17 = k6j.x;
                        k6jVar.I0().h.a(new int[0]);
                        break;
                    case 17:
                        xtb[] xtbVarArr18 = k6j.x;
                        ((g8j) k6jVar.I0().c).d(new int[0]);
                        break;
                    case SizeUtil.textSize0_1 /* 18 */:
                        xtb[] xtbVarArr19 = k6j.x;
                        ((g8j) k6jVar.I0().c).b(new int[0]);
                        break;
                    default:
                        xtb[] xtbVarArr20 = k6j.x;
                        ((g8j) k6jVar.I0().c).j(c8j.a, new int[0]);
                        break;
                }
            }
        });
        final byte b12 = 5;
        H0().m.u = new vlf(this) { // from class: i6j
            public final /* synthetic */ k6j b;

            {
                this.b = this;
            }

            @Override // defpackage.vlf
            public final void u(OperaListItem operaListItem, boolean z) {
                byte b42 = b12;
                final byte b52 = 0;
                final byte b62 = 1;
                k6j k6jVar = this.b;
                switch (b42) {
                    case 0:
                        xtb[] xtbVarArr = k6j.x;
                        k6jVar.I0().b.V(z ? 1 : 0, "ai_assistant_menu_shortcut");
                        break;
                    case 1:
                        xtb[] xtbVarArr2 = k6j.x;
                        k6jVar.I0().j.C(z);
                        break;
                    case 2:
                        xtb[] xtbVarArr3 = k6j.x;
                        k6jVar.I0().b.V(z ? 1 : 0, "compression");
                        break;
                    case 3:
                        xtb[] xtbVarArr4 = k6j.x;
                        final daj dajVarI0 = k6jVar.I0();
                        dajVarI0.l.getClass();
                        if (!Boolean.TRUE.booleanValue()) {
                            xf8.s0(dajVarI0.f.a, new qj(new Runnable() { // from class: baj
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b72 = b62;
                                    daj dajVar = dajVarI0;
                                    switch (b72) {
                                        case 0:
                                            dajVar.g();
                                            break;
                                        default:
                                            dajVar.g();
                                            break;
                                    }
                                }
                            }, (byte) 0), 2132017291, 2132017290);
                            break;
                        } else {
                            dajVarI0.b.V(z ? 1 : 0, "ad_blocking");
                            break;
                        }
                    case 4:
                        xtb[] xtbVarArr5 = k6j.x;
                        final daj dajVarI02 = k6jVar.I0();
                        dajVarI02.m.getClass();
                        if (!Boolean.TRUE.booleanValue()) {
                            xf8.s0(dajVarI02.g.a, new qj(new Runnable() { // from class: baj
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b72 = b52;
                                    daj dajVar = dajVarI02;
                                    switch (b72) {
                                        case 0:
                                            dajVar.g();
                                            break;
                                        default:
                                            dajVar.g();
                                            break;
                                    }
                                }
                            }, (byte) 8), 2132021971, 2132021970);
                            break;
                        } else {
                            dajVarI02.b.V(z ? 1 : 0, "tracker_blocker");
                            break;
                        }
                    default:
                        xtb[] xtbVarArr6 = k6j.x;
                        dxe dxeVar = k6jVar.I0().n;
                        if (dxeVar != null) {
                            dxeVar.T(z, true);
                            break;
                        }
                        break;
                }
            }
        };
        final byte b13 = 17;
        H0().h.setOnClickListener(new View.OnClickListener(this) { // from class: h6j
            public final /* synthetic */ k6j b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b13;
                k6j k6jVar = this.b;
                switch (b22) {
                    case 0:
                        xtb[] xtbVarArr = k6j.x;
                        ((g8j) k6jVar.I0().c).f(new int[0]);
                        break;
                    case 1:
                        xtb[] xtbVarArr2 = k6j.x;
                        g8j g8jVar = (g8j) k6jVar.I0().c;
                        g8jVar.getClass();
                        g8jVar.b.e(new xyg(new oba(2, 0, new int[0])), false);
                        break;
                    case 2:
                        xtb[] xtbVarArr3 = k6j.x;
                        ((g8j) k6jVar.I0().c).g(new int[0]);
                        break;
                    case 3:
                        xtb[] xtbVarArr4 = k6j.x;
                        g8j g8jVar2 = (g8j) k6jVar.I0().c;
                        g8jVar2.getClass();
                        g8jVar2.b.e(new x2f(new oba(2, 0, new int[0])), false);
                        break;
                    case 4:
                        xtb[] xtbVarArr5 = k6j.x;
                        ((g8j) k6jVar.I0().c).c(new int[0]);
                        break;
                    case 5:
                        xtb[] xtbVarArr6 = k6j.x;
                        g8j g8jVar3 = (g8j) k6jVar.I0().c;
                        g8jVar3.getClass();
                        g8jVar3.b.e(new brd(new oba(2, 0, new int[0])), false);
                        break;
                    case 6:
                        xtb[] xtbVarArr7 = k6j.x;
                        ((g8j) k6jVar.I0().c).e(new int[0]);
                        break;
                    case 7:
                        xtb[] xtbVarArr8 = k6j.x;
                        g8j g8jVar4 = (g8j) k6jVar.I0().c;
                        g8jVar4.getClass();
                        g8jVar4.b.e(new baa(new oba(2, 0, new int[0])), false);
                        break;
                    case 8:
                        xtb[] xtbVarArr9 = k6j.x;
                        g8j g8jVar5 = (g8j) k6jVar.I0().c;
                        g8jVar5.getClass();
                        g8jVar5.b.e(new o2(new oba(2, 0, new int[0])), false);
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        xtb[] xtbVarArr10 = k6j.x;
                        daj dajVarI0 = k6jVar.I0();
                        nv6 nv6VarB = dajVarI0.i.b();
                        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("make_default_banner.dismissed", true);
                        nv6VarB.w();
                        dajVarI0.g();
                        break;
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        xtb[] xtbVarArr11 = k6j.x;
                        mm6 mm6Var = k6jVar.I0().p;
                        ((SharedPreferences) mm6Var.a().c.get()).edit().putInt("resume_type", 6).putString("resume_deep_link", null).apply();
                        mm6Var.a().e(mm6Var.f, null);
                        break;
                    case 11:
                        xtb[] xtbVarArr12 = k6j.x;
                        k6jVar.I0().d.a(new int[0]);
                        break;
                    case 12:
                        xtb[] xtbVarArr13 = k6j.x;
                        k6jVar.I0().e.a(new int[0]);
                        break;
                    case 13:
                        xtb[] xtbVarArr14 = k6j.x;
                        k6jVar.I0().f.a(new int[0]);
                        break;
                    case 14:
                        xtb[] xtbVarArr15 = k6j.x;
                        k6jVar.I0().g.a();
                        break;
                    case 15:
                        xtb[] xtbVarArr16 = k6j.x;
                        k6jVar.I0().s();
                        break;
                    case 16:
                        xtb[] xtbVarArr17 = k6j.x;
                        k6jVar.I0().h.a(new int[0]);
                        break;
                    case 17:
                        xtb[] xtbVarArr18 = k6j.x;
                        ((g8j) k6jVar.I0().c).d(new int[0]);
                        break;
                    case SizeUtil.textSize0_1 /* 18 */:
                        xtb[] xtbVarArr19 = k6j.x;
                        ((g8j) k6jVar.I0().c).b(new int[0]);
                        break;
                    default:
                        xtb[] xtbVarArr20 = k6j.x;
                        ((g8j) k6jVar.I0().c).j(c8j.a, new int[0]);
                        break;
                }
            }
        });
        final byte b14 = 18;
        H0().f.setOnClickListener(new View.OnClickListener(this) { // from class: h6j
            public final /* synthetic */ k6j b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b14;
                k6j k6jVar = this.b;
                switch (b22) {
                    case 0:
                        xtb[] xtbVarArr = k6j.x;
                        ((g8j) k6jVar.I0().c).f(new int[0]);
                        break;
                    case 1:
                        xtb[] xtbVarArr2 = k6j.x;
                        g8j g8jVar = (g8j) k6jVar.I0().c;
                        g8jVar.getClass();
                        g8jVar.b.e(new xyg(new oba(2, 0, new int[0])), false);
                        break;
                    case 2:
                        xtb[] xtbVarArr3 = k6j.x;
                        ((g8j) k6jVar.I0().c).g(new int[0]);
                        break;
                    case 3:
                        xtb[] xtbVarArr4 = k6j.x;
                        g8j g8jVar2 = (g8j) k6jVar.I0().c;
                        g8jVar2.getClass();
                        g8jVar2.b.e(new x2f(new oba(2, 0, new int[0])), false);
                        break;
                    case 4:
                        xtb[] xtbVarArr5 = k6j.x;
                        ((g8j) k6jVar.I0().c).c(new int[0]);
                        break;
                    case 5:
                        xtb[] xtbVarArr6 = k6j.x;
                        g8j g8jVar3 = (g8j) k6jVar.I0().c;
                        g8jVar3.getClass();
                        g8jVar3.b.e(new brd(new oba(2, 0, new int[0])), false);
                        break;
                    case 6:
                        xtb[] xtbVarArr7 = k6j.x;
                        ((g8j) k6jVar.I0().c).e(new int[0]);
                        break;
                    case 7:
                        xtb[] xtbVarArr8 = k6j.x;
                        g8j g8jVar4 = (g8j) k6jVar.I0().c;
                        g8jVar4.getClass();
                        g8jVar4.b.e(new baa(new oba(2, 0, new int[0])), false);
                        break;
                    case 8:
                        xtb[] xtbVarArr9 = k6j.x;
                        g8j g8jVar5 = (g8j) k6jVar.I0().c;
                        g8jVar5.getClass();
                        g8jVar5.b.e(new o2(new oba(2, 0, new int[0])), false);
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        xtb[] xtbVarArr10 = k6j.x;
                        daj dajVarI0 = k6jVar.I0();
                        nv6 nv6VarB = dajVarI0.i.b();
                        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("make_default_banner.dismissed", true);
                        nv6VarB.w();
                        dajVarI0.g();
                        break;
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        xtb[] xtbVarArr11 = k6j.x;
                        mm6 mm6Var = k6jVar.I0().p;
                        ((SharedPreferences) mm6Var.a().c.get()).edit().putInt("resume_type", 6).putString("resume_deep_link", null).apply();
                        mm6Var.a().e(mm6Var.f, null);
                        break;
                    case 11:
                        xtb[] xtbVarArr12 = k6j.x;
                        k6jVar.I0().d.a(new int[0]);
                        break;
                    case 12:
                        xtb[] xtbVarArr13 = k6j.x;
                        k6jVar.I0().e.a(new int[0]);
                        break;
                    case 13:
                        xtb[] xtbVarArr14 = k6j.x;
                        k6jVar.I0().f.a(new int[0]);
                        break;
                    case 14:
                        xtb[] xtbVarArr15 = k6j.x;
                        k6jVar.I0().g.a();
                        break;
                    case 15:
                        xtb[] xtbVarArr16 = k6j.x;
                        k6jVar.I0().s();
                        break;
                    case 16:
                        xtb[] xtbVarArr17 = k6j.x;
                        k6jVar.I0().h.a(new int[0]);
                        break;
                    case 17:
                        xtb[] xtbVarArr18 = k6j.x;
                        ((g8j) k6jVar.I0().c).d(new int[0]);
                        break;
                    case SizeUtil.textSize0_1 /* 18 */:
                        xtb[] xtbVarArr19 = k6j.x;
                        ((g8j) k6jVar.I0().c).b(new int[0]);
                        break;
                    default:
                        xtb[] xtbVarArr20 = k6j.x;
                        ((g8j) k6jVar.I0().c).j(c8j.a, new int[0]);
                        break;
                }
            }
        });
        final byte b15 = 19;
        H0().r.setOnClickListener(new View.OnClickListener(this) { // from class: h6j
            public final /* synthetic */ k6j b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b15;
                k6j k6jVar = this.b;
                switch (b22) {
                    case 0:
                        xtb[] xtbVarArr = k6j.x;
                        ((g8j) k6jVar.I0().c).f(new int[0]);
                        break;
                    case 1:
                        xtb[] xtbVarArr2 = k6j.x;
                        g8j g8jVar = (g8j) k6jVar.I0().c;
                        g8jVar.getClass();
                        g8jVar.b.e(new xyg(new oba(2, 0, new int[0])), false);
                        break;
                    case 2:
                        xtb[] xtbVarArr3 = k6j.x;
                        ((g8j) k6jVar.I0().c).g(new int[0]);
                        break;
                    case 3:
                        xtb[] xtbVarArr4 = k6j.x;
                        g8j g8jVar2 = (g8j) k6jVar.I0().c;
                        g8jVar2.getClass();
                        g8jVar2.b.e(new x2f(new oba(2, 0, new int[0])), false);
                        break;
                    case 4:
                        xtb[] xtbVarArr5 = k6j.x;
                        ((g8j) k6jVar.I0().c).c(new int[0]);
                        break;
                    case 5:
                        xtb[] xtbVarArr6 = k6j.x;
                        g8j g8jVar3 = (g8j) k6jVar.I0().c;
                        g8jVar3.getClass();
                        g8jVar3.b.e(new brd(new oba(2, 0, new int[0])), false);
                        break;
                    case 6:
                        xtb[] xtbVarArr7 = k6j.x;
                        ((g8j) k6jVar.I0().c).e(new int[0]);
                        break;
                    case 7:
                        xtb[] xtbVarArr8 = k6j.x;
                        g8j g8jVar4 = (g8j) k6jVar.I0().c;
                        g8jVar4.getClass();
                        g8jVar4.b.e(new baa(new oba(2, 0, new int[0])), false);
                        break;
                    case 8:
                        xtb[] xtbVarArr9 = k6j.x;
                        g8j g8jVar5 = (g8j) k6jVar.I0().c;
                        g8jVar5.getClass();
                        g8jVar5.b.e(new o2(new oba(2, 0, new int[0])), false);
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        xtb[] xtbVarArr10 = k6j.x;
                        daj dajVarI0 = k6jVar.I0();
                        nv6 nv6VarB = dajVarI0.i.b();
                        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("make_default_banner.dismissed", true);
                        nv6VarB.w();
                        dajVarI0.g();
                        break;
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        xtb[] xtbVarArr11 = k6j.x;
                        mm6 mm6Var = k6jVar.I0().p;
                        ((SharedPreferences) mm6Var.a().c.get()).edit().putInt("resume_type", 6).putString("resume_deep_link", null).apply();
                        mm6Var.a().e(mm6Var.f, null);
                        break;
                    case 11:
                        xtb[] xtbVarArr12 = k6j.x;
                        k6jVar.I0().d.a(new int[0]);
                        break;
                    case 12:
                        xtb[] xtbVarArr13 = k6j.x;
                        k6jVar.I0().e.a(new int[0]);
                        break;
                    case 13:
                        xtb[] xtbVarArr14 = k6j.x;
                        k6jVar.I0().f.a(new int[0]);
                        break;
                    case 14:
                        xtb[] xtbVarArr15 = k6j.x;
                        k6jVar.I0().g.a();
                        break;
                    case 15:
                        xtb[] xtbVarArr16 = k6j.x;
                        k6jVar.I0().s();
                        break;
                    case 16:
                        xtb[] xtbVarArr17 = k6j.x;
                        k6jVar.I0().h.a(new int[0]);
                        break;
                    case 17:
                        xtb[] xtbVarArr18 = k6j.x;
                        ((g8j) k6jVar.I0().c).d(new int[0]);
                        break;
                    case SizeUtil.textSize0_1 /* 18 */:
                        xtb[] xtbVarArr19 = k6j.x;
                        ((g8j) k6jVar.I0().c).b(new int[0]);
                        break;
                    default:
                        xtb[] xtbVarArr20 = k6j.x;
                        ((g8j) k6jVar.I0().c).j(c8j.a, new int[0]);
                        break;
                }
            }
        });
        H0().o.setOnClickListener(new View.OnClickListener(this) { // from class: h6j
            public final /* synthetic */ k6j b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b3;
                k6j k6jVar = this.b;
                switch (b22) {
                    case 0:
                        xtb[] xtbVarArr = k6j.x;
                        ((g8j) k6jVar.I0().c).f(new int[0]);
                        break;
                    case 1:
                        xtb[] xtbVarArr2 = k6j.x;
                        g8j g8jVar = (g8j) k6jVar.I0().c;
                        g8jVar.getClass();
                        g8jVar.b.e(new xyg(new oba(2, 0, new int[0])), false);
                        break;
                    case 2:
                        xtb[] xtbVarArr3 = k6j.x;
                        ((g8j) k6jVar.I0().c).g(new int[0]);
                        break;
                    case 3:
                        xtb[] xtbVarArr4 = k6j.x;
                        g8j g8jVar2 = (g8j) k6jVar.I0().c;
                        g8jVar2.getClass();
                        g8jVar2.b.e(new x2f(new oba(2, 0, new int[0])), false);
                        break;
                    case 4:
                        xtb[] xtbVarArr5 = k6j.x;
                        ((g8j) k6jVar.I0().c).c(new int[0]);
                        break;
                    case 5:
                        xtb[] xtbVarArr6 = k6j.x;
                        g8j g8jVar3 = (g8j) k6jVar.I0().c;
                        g8jVar3.getClass();
                        g8jVar3.b.e(new brd(new oba(2, 0, new int[0])), false);
                        break;
                    case 6:
                        xtb[] xtbVarArr7 = k6j.x;
                        ((g8j) k6jVar.I0().c).e(new int[0]);
                        break;
                    case 7:
                        xtb[] xtbVarArr8 = k6j.x;
                        g8j g8jVar4 = (g8j) k6jVar.I0().c;
                        g8jVar4.getClass();
                        g8jVar4.b.e(new baa(new oba(2, 0, new int[0])), false);
                        break;
                    case 8:
                        xtb[] xtbVarArr9 = k6j.x;
                        g8j g8jVar5 = (g8j) k6jVar.I0().c;
                        g8jVar5.getClass();
                        g8jVar5.b.e(new o2(new oba(2, 0, new int[0])), false);
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        xtb[] xtbVarArr10 = k6j.x;
                        daj dajVarI0 = k6jVar.I0();
                        nv6 nv6VarB = dajVarI0.i.b();
                        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("make_default_banner.dismissed", true);
                        nv6VarB.w();
                        dajVarI0.g();
                        break;
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        xtb[] xtbVarArr11 = k6j.x;
                        mm6 mm6Var = k6jVar.I0().p;
                        ((SharedPreferences) mm6Var.a().c.get()).edit().putInt("resume_type", 6).putString("resume_deep_link", null).apply();
                        mm6Var.a().e(mm6Var.f, null);
                        break;
                    case 11:
                        xtb[] xtbVarArr12 = k6j.x;
                        k6jVar.I0().d.a(new int[0]);
                        break;
                    case 12:
                        xtb[] xtbVarArr13 = k6j.x;
                        k6jVar.I0().e.a(new int[0]);
                        break;
                    case 13:
                        xtb[] xtbVarArr14 = k6j.x;
                        k6jVar.I0().f.a(new int[0]);
                        break;
                    case 14:
                        xtb[] xtbVarArr15 = k6j.x;
                        k6jVar.I0().g.a();
                        break;
                    case 15:
                        xtb[] xtbVarArr16 = k6j.x;
                        k6jVar.I0().s();
                        break;
                    case 16:
                        xtb[] xtbVarArr17 = k6j.x;
                        k6jVar.I0().h.a(new int[0]);
                        break;
                    case 17:
                        xtb[] xtbVarArr18 = k6j.x;
                        ((g8j) k6jVar.I0().c).d(new int[0]);
                        break;
                    case SizeUtil.textSize0_1 /* 18 */:
                        xtb[] xtbVarArr19 = k6j.x;
                        ((g8j) k6jVar.I0().c).b(new int[0]);
                        break;
                    default:
                        xtb[] xtbVarArr20 = k6j.x;
                        ((g8j) k6jVar.I0().c).j(c8j.a, new int[0]);
                        break;
                }
            }
        });
        H0().p.setOnClickListener(new View.OnClickListener(this) { // from class: h6j
            public final /* synthetic */ k6j b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b5;
                k6j k6jVar = this.b;
                switch (b22) {
                    case 0:
                        xtb[] xtbVarArr = k6j.x;
                        ((g8j) k6jVar.I0().c).f(new int[0]);
                        break;
                    case 1:
                        xtb[] xtbVarArr2 = k6j.x;
                        g8j g8jVar = (g8j) k6jVar.I0().c;
                        g8jVar.getClass();
                        g8jVar.b.e(new xyg(new oba(2, 0, new int[0])), false);
                        break;
                    case 2:
                        xtb[] xtbVarArr3 = k6j.x;
                        ((g8j) k6jVar.I0().c).g(new int[0]);
                        break;
                    case 3:
                        xtb[] xtbVarArr4 = k6j.x;
                        g8j g8jVar2 = (g8j) k6jVar.I0().c;
                        g8jVar2.getClass();
                        g8jVar2.b.e(new x2f(new oba(2, 0, new int[0])), false);
                        break;
                    case 4:
                        xtb[] xtbVarArr5 = k6j.x;
                        ((g8j) k6jVar.I0().c).c(new int[0]);
                        break;
                    case 5:
                        xtb[] xtbVarArr6 = k6j.x;
                        g8j g8jVar3 = (g8j) k6jVar.I0().c;
                        g8jVar3.getClass();
                        g8jVar3.b.e(new brd(new oba(2, 0, new int[0])), false);
                        break;
                    case 6:
                        xtb[] xtbVarArr7 = k6j.x;
                        ((g8j) k6jVar.I0().c).e(new int[0]);
                        break;
                    case 7:
                        xtb[] xtbVarArr8 = k6j.x;
                        g8j g8jVar4 = (g8j) k6jVar.I0().c;
                        g8jVar4.getClass();
                        g8jVar4.b.e(new baa(new oba(2, 0, new int[0])), false);
                        break;
                    case 8:
                        xtb[] xtbVarArr9 = k6j.x;
                        g8j g8jVar5 = (g8j) k6jVar.I0().c;
                        g8jVar5.getClass();
                        g8jVar5.b.e(new o2(new oba(2, 0, new int[0])), false);
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        xtb[] xtbVarArr10 = k6j.x;
                        daj dajVarI0 = k6jVar.I0();
                        nv6 nv6VarB = dajVarI0.i.b();
                        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("make_default_banner.dismissed", true);
                        nv6VarB.w();
                        dajVarI0.g();
                        break;
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        xtb[] xtbVarArr11 = k6j.x;
                        mm6 mm6Var = k6jVar.I0().p;
                        ((SharedPreferences) mm6Var.a().c.get()).edit().putInt("resume_type", 6).putString("resume_deep_link", null).apply();
                        mm6Var.a().e(mm6Var.f, null);
                        break;
                    case 11:
                        xtb[] xtbVarArr12 = k6j.x;
                        k6jVar.I0().d.a(new int[0]);
                        break;
                    case 12:
                        xtb[] xtbVarArr13 = k6j.x;
                        k6jVar.I0().e.a(new int[0]);
                        break;
                    case 13:
                        xtb[] xtbVarArr14 = k6j.x;
                        k6jVar.I0().f.a(new int[0]);
                        break;
                    case 14:
                        xtb[] xtbVarArr15 = k6j.x;
                        k6jVar.I0().g.a();
                        break;
                    case 15:
                        xtb[] xtbVarArr16 = k6j.x;
                        k6jVar.I0().s();
                        break;
                    case 16:
                        xtb[] xtbVarArr17 = k6j.x;
                        k6jVar.I0().h.a(new int[0]);
                        break;
                    case 17:
                        xtb[] xtbVarArr18 = k6j.x;
                        ((g8j) k6jVar.I0().c).d(new int[0]);
                        break;
                    case SizeUtil.textSize0_1 /* 18 */:
                        xtb[] xtbVarArr19 = k6j.x;
                        ((g8j) k6jVar.I0().c).b(new int[0]);
                        break;
                    default:
                        xtb[] xtbVarArr20 = k6j.x;
                        ((g8j) k6jVar.I0().c).j(c8j.a, new int[0]);
                        break;
                }
            }
        });
        H0().q.setOnClickListener(new View.OnClickListener(this) { // from class: h6j
            public final /* synthetic */ k6j b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b7;
                k6j k6jVar = this.b;
                switch (b22) {
                    case 0:
                        xtb[] xtbVarArr = k6j.x;
                        ((g8j) k6jVar.I0().c).f(new int[0]);
                        break;
                    case 1:
                        xtb[] xtbVarArr2 = k6j.x;
                        g8j g8jVar = (g8j) k6jVar.I0().c;
                        g8jVar.getClass();
                        g8jVar.b.e(new xyg(new oba(2, 0, new int[0])), false);
                        break;
                    case 2:
                        xtb[] xtbVarArr3 = k6j.x;
                        ((g8j) k6jVar.I0().c).g(new int[0]);
                        break;
                    case 3:
                        xtb[] xtbVarArr4 = k6j.x;
                        g8j g8jVar2 = (g8j) k6jVar.I0().c;
                        g8jVar2.getClass();
                        g8jVar2.b.e(new x2f(new oba(2, 0, new int[0])), false);
                        break;
                    case 4:
                        xtb[] xtbVarArr5 = k6j.x;
                        ((g8j) k6jVar.I0().c).c(new int[0]);
                        break;
                    case 5:
                        xtb[] xtbVarArr6 = k6j.x;
                        g8j g8jVar3 = (g8j) k6jVar.I0().c;
                        g8jVar3.getClass();
                        g8jVar3.b.e(new brd(new oba(2, 0, new int[0])), false);
                        break;
                    case 6:
                        xtb[] xtbVarArr7 = k6j.x;
                        ((g8j) k6jVar.I0().c).e(new int[0]);
                        break;
                    case 7:
                        xtb[] xtbVarArr8 = k6j.x;
                        g8j g8jVar4 = (g8j) k6jVar.I0().c;
                        g8jVar4.getClass();
                        g8jVar4.b.e(new baa(new oba(2, 0, new int[0])), false);
                        break;
                    case 8:
                        xtb[] xtbVarArr9 = k6j.x;
                        g8j g8jVar5 = (g8j) k6jVar.I0().c;
                        g8jVar5.getClass();
                        g8jVar5.b.e(new o2(new oba(2, 0, new int[0])), false);
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        xtb[] xtbVarArr10 = k6j.x;
                        daj dajVarI0 = k6jVar.I0();
                        nv6 nv6VarB = dajVarI0.i.b();
                        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("make_default_banner.dismissed", true);
                        nv6VarB.w();
                        dajVarI0.g();
                        break;
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        xtb[] xtbVarArr11 = k6j.x;
                        mm6 mm6Var = k6jVar.I0().p;
                        ((SharedPreferences) mm6Var.a().c.get()).edit().putInt("resume_type", 6).putString("resume_deep_link", null).apply();
                        mm6Var.a().e(mm6Var.f, null);
                        break;
                    case 11:
                        xtb[] xtbVarArr12 = k6j.x;
                        k6jVar.I0().d.a(new int[0]);
                        break;
                    case 12:
                        xtb[] xtbVarArr13 = k6j.x;
                        k6jVar.I0().e.a(new int[0]);
                        break;
                    case 13:
                        xtb[] xtbVarArr14 = k6j.x;
                        k6jVar.I0().f.a(new int[0]);
                        break;
                    case 14:
                        xtb[] xtbVarArr15 = k6j.x;
                        k6jVar.I0().g.a();
                        break;
                    case 15:
                        xtb[] xtbVarArr16 = k6j.x;
                        k6jVar.I0().s();
                        break;
                    case 16:
                        xtb[] xtbVarArr17 = k6j.x;
                        k6jVar.I0().h.a(new int[0]);
                        break;
                    case 17:
                        xtb[] xtbVarArr18 = k6j.x;
                        ((g8j) k6jVar.I0().c).d(new int[0]);
                        break;
                    case SizeUtil.textSize0_1 /* 18 */:
                        xtb[] xtbVarArr19 = k6j.x;
                        ((g8j) k6jVar.I0().c).b(new int[0]);
                        break;
                    default:
                        xtb[] xtbVarArr20 = k6j.x;
                        ((g8j) k6jVar.I0().c).j(c8j.a, new int[0]);
                        break;
                }
            }
        });
        H0().n.setOnClickListener(new View.OnClickListener(this) { // from class: h6j
            public final /* synthetic */ k6j b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b9;
                k6j k6jVar = this.b;
                switch (b22) {
                    case 0:
                        xtb[] xtbVarArr = k6j.x;
                        ((g8j) k6jVar.I0().c).f(new int[0]);
                        break;
                    case 1:
                        xtb[] xtbVarArr2 = k6j.x;
                        g8j g8jVar = (g8j) k6jVar.I0().c;
                        g8jVar.getClass();
                        g8jVar.b.e(new xyg(new oba(2, 0, new int[0])), false);
                        break;
                    case 2:
                        xtb[] xtbVarArr3 = k6j.x;
                        ((g8j) k6jVar.I0().c).g(new int[0]);
                        break;
                    case 3:
                        xtb[] xtbVarArr4 = k6j.x;
                        g8j g8jVar2 = (g8j) k6jVar.I0().c;
                        g8jVar2.getClass();
                        g8jVar2.b.e(new x2f(new oba(2, 0, new int[0])), false);
                        break;
                    case 4:
                        xtb[] xtbVarArr5 = k6j.x;
                        ((g8j) k6jVar.I0().c).c(new int[0]);
                        break;
                    case 5:
                        xtb[] xtbVarArr6 = k6j.x;
                        g8j g8jVar3 = (g8j) k6jVar.I0().c;
                        g8jVar3.getClass();
                        g8jVar3.b.e(new brd(new oba(2, 0, new int[0])), false);
                        break;
                    case 6:
                        xtb[] xtbVarArr7 = k6j.x;
                        ((g8j) k6jVar.I0().c).e(new int[0]);
                        break;
                    case 7:
                        xtb[] xtbVarArr8 = k6j.x;
                        g8j g8jVar4 = (g8j) k6jVar.I0().c;
                        g8jVar4.getClass();
                        g8jVar4.b.e(new baa(new oba(2, 0, new int[0])), false);
                        break;
                    case 8:
                        xtb[] xtbVarArr9 = k6j.x;
                        g8j g8jVar5 = (g8j) k6jVar.I0().c;
                        g8jVar5.getClass();
                        g8jVar5.b.e(new o2(new oba(2, 0, new int[0])), false);
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        xtb[] xtbVarArr10 = k6j.x;
                        daj dajVarI0 = k6jVar.I0();
                        nv6 nv6VarB = dajVarI0.i.b();
                        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("make_default_banner.dismissed", true);
                        nv6VarB.w();
                        dajVarI0.g();
                        break;
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        xtb[] xtbVarArr11 = k6j.x;
                        mm6 mm6Var = k6jVar.I0().p;
                        ((SharedPreferences) mm6Var.a().c.get()).edit().putInt("resume_type", 6).putString("resume_deep_link", null).apply();
                        mm6Var.a().e(mm6Var.f, null);
                        break;
                    case 11:
                        xtb[] xtbVarArr12 = k6j.x;
                        k6jVar.I0().d.a(new int[0]);
                        break;
                    case 12:
                        xtb[] xtbVarArr13 = k6j.x;
                        k6jVar.I0().e.a(new int[0]);
                        break;
                    case 13:
                        xtb[] xtbVarArr14 = k6j.x;
                        k6jVar.I0().f.a(new int[0]);
                        break;
                    case 14:
                        xtb[] xtbVarArr15 = k6j.x;
                        k6jVar.I0().g.a();
                        break;
                    case 15:
                        xtb[] xtbVarArr16 = k6j.x;
                        k6jVar.I0().s();
                        break;
                    case 16:
                        xtb[] xtbVarArr17 = k6j.x;
                        k6jVar.I0().h.a(new int[0]);
                        break;
                    case 17:
                        xtb[] xtbVarArr18 = k6j.x;
                        ((g8j) k6jVar.I0().c).d(new int[0]);
                        break;
                    case SizeUtil.textSize0_1 /* 18 */:
                        xtb[] xtbVarArr19 = k6j.x;
                        ((g8j) k6jVar.I0().c).b(new int[0]);
                        break;
                    default:
                        xtb[] xtbVarArr20 = k6j.x;
                        ((g8j) k6jVar.I0().c).j(c8j.a, new int[0]);
                        break;
                }
            }
        });
        H0().l.setOnClickListener(new View.OnClickListener(this) { // from class: h6j
            public final /* synthetic */ k6j b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b12;
                k6j k6jVar = this.b;
                switch (b22) {
                    case 0:
                        xtb[] xtbVarArr = k6j.x;
                        ((g8j) k6jVar.I0().c).f(new int[0]);
                        break;
                    case 1:
                        xtb[] xtbVarArr2 = k6j.x;
                        g8j g8jVar = (g8j) k6jVar.I0().c;
                        g8jVar.getClass();
                        g8jVar.b.e(new xyg(new oba(2, 0, new int[0])), false);
                        break;
                    case 2:
                        xtb[] xtbVarArr3 = k6j.x;
                        ((g8j) k6jVar.I0().c).g(new int[0]);
                        break;
                    case 3:
                        xtb[] xtbVarArr4 = k6j.x;
                        g8j g8jVar2 = (g8j) k6jVar.I0().c;
                        g8jVar2.getClass();
                        g8jVar2.b.e(new x2f(new oba(2, 0, new int[0])), false);
                        break;
                    case 4:
                        xtb[] xtbVarArr5 = k6j.x;
                        ((g8j) k6jVar.I0().c).c(new int[0]);
                        break;
                    case 5:
                        xtb[] xtbVarArr6 = k6j.x;
                        g8j g8jVar3 = (g8j) k6jVar.I0().c;
                        g8jVar3.getClass();
                        g8jVar3.b.e(new brd(new oba(2, 0, new int[0])), false);
                        break;
                    case 6:
                        xtb[] xtbVarArr7 = k6j.x;
                        ((g8j) k6jVar.I0().c).e(new int[0]);
                        break;
                    case 7:
                        xtb[] xtbVarArr8 = k6j.x;
                        g8j g8jVar4 = (g8j) k6jVar.I0().c;
                        g8jVar4.getClass();
                        g8jVar4.b.e(new baa(new oba(2, 0, new int[0])), false);
                        break;
                    case 8:
                        xtb[] xtbVarArr9 = k6j.x;
                        g8j g8jVar5 = (g8j) k6jVar.I0().c;
                        g8jVar5.getClass();
                        g8jVar5.b.e(new o2(new oba(2, 0, new int[0])), false);
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        xtb[] xtbVarArr10 = k6j.x;
                        daj dajVarI0 = k6jVar.I0();
                        nv6 nv6VarB = dajVarI0.i.b();
                        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("make_default_banner.dismissed", true);
                        nv6VarB.w();
                        dajVarI0.g();
                        break;
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        xtb[] xtbVarArr11 = k6j.x;
                        mm6 mm6Var = k6jVar.I0().p;
                        ((SharedPreferences) mm6Var.a().c.get()).edit().putInt("resume_type", 6).putString("resume_deep_link", null).apply();
                        mm6Var.a().e(mm6Var.f, null);
                        break;
                    case 11:
                        xtb[] xtbVarArr12 = k6j.x;
                        k6jVar.I0().d.a(new int[0]);
                        break;
                    case 12:
                        xtb[] xtbVarArr13 = k6j.x;
                        k6jVar.I0().e.a(new int[0]);
                        break;
                    case 13:
                        xtb[] xtbVarArr14 = k6j.x;
                        k6jVar.I0().f.a(new int[0]);
                        break;
                    case 14:
                        xtb[] xtbVarArr15 = k6j.x;
                        k6jVar.I0().g.a();
                        break;
                    case 15:
                        xtb[] xtbVarArr16 = k6j.x;
                        k6jVar.I0().s();
                        break;
                    case 16:
                        xtb[] xtbVarArr17 = k6j.x;
                        k6jVar.I0().h.a(new int[0]);
                        break;
                    case 17:
                        xtb[] xtbVarArr18 = k6j.x;
                        ((g8j) k6jVar.I0().c).d(new int[0]);
                        break;
                    case SizeUtil.textSize0_1 /* 18 */:
                        xtb[] xtbVarArr19 = k6j.x;
                        ((g8j) k6jVar.I0().c).b(new int[0]);
                        break;
                    default:
                        xtb[] xtbVarArr20 = k6j.x;
                        ((g8j) k6jVar.I0().c).j(c8j.a, new int[0]);
                        break;
                }
            }
        });
        final byte b16 = 6;
        H0().j.setOnClickListener(new View.OnClickListener(this) { // from class: h6j
            public final /* synthetic */ k6j b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b16;
                k6j k6jVar = this.b;
                switch (b22) {
                    case 0:
                        xtb[] xtbVarArr = k6j.x;
                        ((g8j) k6jVar.I0().c).f(new int[0]);
                        break;
                    case 1:
                        xtb[] xtbVarArr2 = k6j.x;
                        g8j g8jVar = (g8j) k6jVar.I0().c;
                        g8jVar.getClass();
                        g8jVar.b.e(new xyg(new oba(2, 0, new int[0])), false);
                        break;
                    case 2:
                        xtb[] xtbVarArr3 = k6j.x;
                        ((g8j) k6jVar.I0().c).g(new int[0]);
                        break;
                    case 3:
                        xtb[] xtbVarArr4 = k6j.x;
                        g8j g8jVar2 = (g8j) k6jVar.I0().c;
                        g8jVar2.getClass();
                        g8jVar2.b.e(new x2f(new oba(2, 0, new int[0])), false);
                        break;
                    case 4:
                        xtb[] xtbVarArr5 = k6j.x;
                        ((g8j) k6jVar.I0().c).c(new int[0]);
                        break;
                    case 5:
                        xtb[] xtbVarArr6 = k6j.x;
                        g8j g8jVar3 = (g8j) k6jVar.I0().c;
                        g8jVar3.getClass();
                        g8jVar3.b.e(new brd(new oba(2, 0, new int[0])), false);
                        break;
                    case 6:
                        xtb[] xtbVarArr7 = k6j.x;
                        ((g8j) k6jVar.I0().c).e(new int[0]);
                        break;
                    case 7:
                        xtb[] xtbVarArr8 = k6j.x;
                        g8j g8jVar4 = (g8j) k6jVar.I0().c;
                        g8jVar4.getClass();
                        g8jVar4.b.e(new baa(new oba(2, 0, new int[0])), false);
                        break;
                    case 8:
                        xtb[] xtbVarArr9 = k6j.x;
                        g8j g8jVar5 = (g8j) k6jVar.I0().c;
                        g8jVar5.getClass();
                        g8jVar5.b.e(new o2(new oba(2, 0, new int[0])), false);
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        xtb[] xtbVarArr10 = k6j.x;
                        daj dajVarI0 = k6jVar.I0();
                        nv6 nv6VarB = dajVarI0.i.b();
                        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("make_default_banner.dismissed", true);
                        nv6VarB.w();
                        dajVarI0.g();
                        break;
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        xtb[] xtbVarArr11 = k6j.x;
                        mm6 mm6Var = k6jVar.I0().p;
                        ((SharedPreferences) mm6Var.a().c.get()).edit().putInt("resume_type", 6).putString("resume_deep_link", null).apply();
                        mm6Var.a().e(mm6Var.f, null);
                        break;
                    case 11:
                        xtb[] xtbVarArr12 = k6j.x;
                        k6jVar.I0().d.a(new int[0]);
                        break;
                    case 12:
                        xtb[] xtbVarArr13 = k6j.x;
                        k6jVar.I0().e.a(new int[0]);
                        break;
                    case 13:
                        xtb[] xtbVarArr14 = k6j.x;
                        k6jVar.I0().f.a(new int[0]);
                        break;
                    case 14:
                        xtb[] xtbVarArr15 = k6j.x;
                        k6jVar.I0().g.a();
                        break;
                    case 15:
                        xtb[] xtbVarArr16 = k6j.x;
                        k6jVar.I0().s();
                        break;
                    case 16:
                        xtb[] xtbVarArr17 = k6j.x;
                        k6jVar.I0().h.a(new int[0]);
                        break;
                    case 17:
                        xtb[] xtbVarArr18 = k6j.x;
                        ((g8j) k6jVar.I0().c).d(new int[0]);
                        break;
                    case SizeUtil.textSize0_1 /* 18 */:
                        xtb[] xtbVarArr19 = k6j.x;
                        ((g8j) k6jVar.I0().c).b(new int[0]);
                        break;
                    default:
                        xtb[] xtbVarArr20 = k6j.x;
                        ((g8j) k6jVar.I0().c).j(c8j.a, new int[0]);
                        break;
                }
            }
        });
        final byte b17 = 7;
        H0().k.setOnClickListener(new View.OnClickListener(this) { // from class: h6j
            public final /* synthetic */ k6j b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b17;
                k6j k6jVar = this.b;
                switch (b22) {
                    case 0:
                        xtb[] xtbVarArr = k6j.x;
                        ((g8j) k6jVar.I0().c).f(new int[0]);
                        break;
                    case 1:
                        xtb[] xtbVarArr2 = k6j.x;
                        g8j g8jVar = (g8j) k6jVar.I0().c;
                        g8jVar.getClass();
                        g8jVar.b.e(new xyg(new oba(2, 0, new int[0])), false);
                        break;
                    case 2:
                        xtb[] xtbVarArr3 = k6j.x;
                        ((g8j) k6jVar.I0().c).g(new int[0]);
                        break;
                    case 3:
                        xtb[] xtbVarArr4 = k6j.x;
                        g8j g8jVar2 = (g8j) k6jVar.I0().c;
                        g8jVar2.getClass();
                        g8jVar2.b.e(new x2f(new oba(2, 0, new int[0])), false);
                        break;
                    case 4:
                        xtb[] xtbVarArr5 = k6j.x;
                        ((g8j) k6jVar.I0().c).c(new int[0]);
                        break;
                    case 5:
                        xtb[] xtbVarArr6 = k6j.x;
                        g8j g8jVar3 = (g8j) k6jVar.I0().c;
                        g8jVar3.getClass();
                        g8jVar3.b.e(new brd(new oba(2, 0, new int[0])), false);
                        break;
                    case 6:
                        xtb[] xtbVarArr7 = k6j.x;
                        ((g8j) k6jVar.I0().c).e(new int[0]);
                        break;
                    case 7:
                        xtb[] xtbVarArr8 = k6j.x;
                        g8j g8jVar4 = (g8j) k6jVar.I0().c;
                        g8jVar4.getClass();
                        g8jVar4.b.e(new baa(new oba(2, 0, new int[0])), false);
                        break;
                    case 8:
                        xtb[] xtbVarArr9 = k6j.x;
                        g8j g8jVar5 = (g8j) k6jVar.I0().c;
                        g8jVar5.getClass();
                        g8jVar5.b.e(new o2(new oba(2, 0, new int[0])), false);
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        xtb[] xtbVarArr10 = k6j.x;
                        daj dajVarI0 = k6jVar.I0();
                        nv6 nv6VarB = dajVarI0.i.b();
                        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("make_default_banner.dismissed", true);
                        nv6VarB.w();
                        dajVarI0.g();
                        break;
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        xtb[] xtbVarArr11 = k6j.x;
                        mm6 mm6Var = k6jVar.I0().p;
                        ((SharedPreferences) mm6Var.a().c.get()).edit().putInt("resume_type", 6).putString("resume_deep_link", null).apply();
                        mm6Var.a().e(mm6Var.f, null);
                        break;
                    case 11:
                        xtb[] xtbVarArr12 = k6j.x;
                        k6jVar.I0().d.a(new int[0]);
                        break;
                    case 12:
                        xtb[] xtbVarArr13 = k6j.x;
                        k6jVar.I0().e.a(new int[0]);
                        break;
                    case 13:
                        xtb[] xtbVarArr14 = k6j.x;
                        k6jVar.I0().f.a(new int[0]);
                        break;
                    case 14:
                        xtb[] xtbVarArr15 = k6j.x;
                        k6jVar.I0().g.a();
                        break;
                    case 15:
                        xtb[] xtbVarArr16 = k6j.x;
                        k6jVar.I0().s();
                        break;
                    case 16:
                        xtb[] xtbVarArr17 = k6j.x;
                        k6jVar.I0().h.a(new int[0]);
                        break;
                    case 17:
                        xtb[] xtbVarArr18 = k6j.x;
                        ((g8j) k6jVar.I0().c).d(new int[0]);
                        break;
                    case SizeUtil.textSize0_1 /* 18 */:
                        xtb[] xtbVarArr19 = k6j.x;
                        ((g8j) k6jVar.I0().c).b(new int[0]);
                        break;
                    default:
                        xtb[] xtbVarArr20 = k6j.x;
                        ((g8j) k6jVar.I0().c).j(c8j.a, new int[0]);
                        break;
                }
            }
        });
        final byte b18 = 8;
        H0().d.setOnClickListener(new View.OnClickListener(this) { // from class: h6j
            public final /* synthetic */ k6j b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b18;
                k6j k6jVar = this.b;
                switch (b22) {
                    case 0:
                        xtb[] xtbVarArr = k6j.x;
                        ((g8j) k6jVar.I0().c).f(new int[0]);
                        break;
                    case 1:
                        xtb[] xtbVarArr2 = k6j.x;
                        g8j g8jVar = (g8j) k6jVar.I0().c;
                        g8jVar.getClass();
                        g8jVar.b.e(new xyg(new oba(2, 0, new int[0])), false);
                        break;
                    case 2:
                        xtb[] xtbVarArr3 = k6j.x;
                        ((g8j) k6jVar.I0().c).g(new int[0]);
                        break;
                    case 3:
                        xtb[] xtbVarArr4 = k6j.x;
                        g8j g8jVar2 = (g8j) k6jVar.I0().c;
                        g8jVar2.getClass();
                        g8jVar2.b.e(new x2f(new oba(2, 0, new int[0])), false);
                        break;
                    case 4:
                        xtb[] xtbVarArr5 = k6j.x;
                        ((g8j) k6jVar.I0().c).c(new int[0]);
                        break;
                    case 5:
                        xtb[] xtbVarArr6 = k6j.x;
                        g8j g8jVar3 = (g8j) k6jVar.I0().c;
                        g8jVar3.getClass();
                        g8jVar3.b.e(new brd(new oba(2, 0, new int[0])), false);
                        break;
                    case 6:
                        xtb[] xtbVarArr7 = k6j.x;
                        ((g8j) k6jVar.I0().c).e(new int[0]);
                        break;
                    case 7:
                        xtb[] xtbVarArr8 = k6j.x;
                        g8j g8jVar4 = (g8j) k6jVar.I0().c;
                        g8jVar4.getClass();
                        g8jVar4.b.e(new baa(new oba(2, 0, new int[0])), false);
                        break;
                    case 8:
                        xtb[] xtbVarArr9 = k6j.x;
                        g8j g8jVar5 = (g8j) k6jVar.I0().c;
                        g8jVar5.getClass();
                        g8jVar5.b.e(new o2(new oba(2, 0, new int[0])), false);
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        xtb[] xtbVarArr10 = k6j.x;
                        daj dajVarI0 = k6jVar.I0();
                        nv6 nv6VarB = dajVarI0.i.b();
                        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("make_default_banner.dismissed", true);
                        nv6VarB.w();
                        dajVarI0.g();
                        break;
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        xtb[] xtbVarArr11 = k6j.x;
                        mm6 mm6Var = k6jVar.I0().p;
                        ((SharedPreferences) mm6Var.a().c.get()).edit().putInt("resume_type", 6).putString("resume_deep_link", null).apply();
                        mm6Var.a().e(mm6Var.f, null);
                        break;
                    case 11:
                        xtb[] xtbVarArr12 = k6j.x;
                        k6jVar.I0().d.a(new int[0]);
                        break;
                    case 12:
                        xtb[] xtbVarArr13 = k6j.x;
                        k6jVar.I0().e.a(new int[0]);
                        break;
                    case 13:
                        xtb[] xtbVarArr14 = k6j.x;
                        k6jVar.I0().f.a(new int[0]);
                        break;
                    case 14:
                        xtb[] xtbVarArr15 = k6j.x;
                        k6jVar.I0().g.a();
                        break;
                    case 15:
                        xtb[] xtbVarArr16 = k6j.x;
                        k6jVar.I0().s();
                        break;
                    case 16:
                        xtb[] xtbVarArr17 = k6j.x;
                        k6jVar.I0().h.a(new int[0]);
                        break;
                    case 17:
                        xtb[] xtbVarArr18 = k6j.x;
                        ((g8j) k6jVar.I0().c).d(new int[0]);
                        break;
                    case SizeUtil.textSize0_1 /* 18 */:
                        xtb[] xtbVarArr19 = k6j.x;
                        ((g8j) k6jVar.I0().c).b(new int[0]);
                        break;
                    default:
                        xtb[] xtbVarArr20 = k6j.x;
                        ((g8j) k6jVar.I0().c).j(c8j.a, new int[0]);
                        break;
                }
            }
        });
        MakeOperaDefaultBanner makeOperaDefaultBanner = H0().b;
        final byte b19 = 9;
        ((StylingImageButton) makeOperaDefaultBanner.g.c).setOnClickListener(new View.OnClickListener(this) { // from class: h6j
            public final /* synthetic */ k6j b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b19;
                k6j k6jVar = this.b;
                switch (b22) {
                    case 0:
                        xtb[] xtbVarArr = k6j.x;
                        ((g8j) k6jVar.I0().c).f(new int[0]);
                        break;
                    case 1:
                        xtb[] xtbVarArr2 = k6j.x;
                        g8j g8jVar = (g8j) k6jVar.I0().c;
                        g8jVar.getClass();
                        g8jVar.b.e(new xyg(new oba(2, 0, new int[0])), false);
                        break;
                    case 2:
                        xtb[] xtbVarArr3 = k6j.x;
                        ((g8j) k6jVar.I0().c).g(new int[0]);
                        break;
                    case 3:
                        xtb[] xtbVarArr4 = k6j.x;
                        g8j g8jVar2 = (g8j) k6jVar.I0().c;
                        g8jVar2.getClass();
                        g8jVar2.b.e(new x2f(new oba(2, 0, new int[0])), false);
                        break;
                    case 4:
                        xtb[] xtbVarArr5 = k6j.x;
                        ((g8j) k6jVar.I0().c).c(new int[0]);
                        break;
                    case 5:
                        xtb[] xtbVarArr6 = k6j.x;
                        g8j g8jVar3 = (g8j) k6jVar.I0().c;
                        g8jVar3.getClass();
                        g8jVar3.b.e(new brd(new oba(2, 0, new int[0])), false);
                        break;
                    case 6:
                        xtb[] xtbVarArr7 = k6j.x;
                        ((g8j) k6jVar.I0().c).e(new int[0]);
                        break;
                    case 7:
                        xtb[] xtbVarArr8 = k6j.x;
                        g8j g8jVar4 = (g8j) k6jVar.I0().c;
                        g8jVar4.getClass();
                        g8jVar4.b.e(new baa(new oba(2, 0, new int[0])), false);
                        break;
                    case 8:
                        xtb[] xtbVarArr9 = k6j.x;
                        g8j g8jVar5 = (g8j) k6jVar.I0().c;
                        g8jVar5.getClass();
                        g8jVar5.b.e(new o2(new oba(2, 0, new int[0])), false);
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        xtb[] xtbVarArr10 = k6j.x;
                        daj dajVarI0 = k6jVar.I0();
                        nv6 nv6VarB = dajVarI0.i.b();
                        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("make_default_banner.dismissed", true);
                        nv6VarB.w();
                        dajVarI0.g();
                        break;
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        xtb[] xtbVarArr11 = k6j.x;
                        mm6 mm6Var = k6jVar.I0().p;
                        ((SharedPreferences) mm6Var.a().c.get()).edit().putInt("resume_type", 6).putString("resume_deep_link", null).apply();
                        mm6Var.a().e(mm6Var.f, null);
                        break;
                    case 11:
                        xtb[] xtbVarArr12 = k6j.x;
                        k6jVar.I0().d.a(new int[0]);
                        break;
                    case 12:
                        xtb[] xtbVarArr13 = k6j.x;
                        k6jVar.I0().e.a(new int[0]);
                        break;
                    case 13:
                        xtb[] xtbVarArr14 = k6j.x;
                        k6jVar.I0().f.a(new int[0]);
                        break;
                    case 14:
                        xtb[] xtbVarArr15 = k6j.x;
                        k6jVar.I0().g.a();
                        break;
                    case 15:
                        xtb[] xtbVarArr16 = k6j.x;
                        k6jVar.I0().s();
                        break;
                    case 16:
                        xtb[] xtbVarArr17 = k6j.x;
                        k6jVar.I0().h.a(new int[0]);
                        break;
                    case 17:
                        xtb[] xtbVarArr18 = k6j.x;
                        ((g8j) k6jVar.I0().c).d(new int[0]);
                        break;
                    case SizeUtil.textSize0_1 /* 18 */:
                        xtb[] xtbVarArr19 = k6j.x;
                        ((g8j) k6jVar.I0().c).b(new int[0]);
                        break;
                    default:
                        xtb[] xtbVarArr20 = k6j.x;
                        ((g8j) k6jVar.I0().c).j(c8j.a, new int[0]);
                        break;
                }
            }
        });
        MakeOperaDefaultBanner makeOperaDefaultBanner2 = H0().b;
        final byte b20 = 10;
        makeOperaDefaultBanner2.g.d.setOnClickListener(new View.OnClickListener(this) { // from class: h6j
            public final /* synthetic */ k6j b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b20;
                k6j k6jVar = this.b;
                switch (b22) {
                    case 0:
                        xtb[] xtbVarArr = k6j.x;
                        ((g8j) k6jVar.I0().c).f(new int[0]);
                        break;
                    case 1:
                        xtb[] xtbVarArr2 = k6j.x;
                        g8j g8jVar = (g8j) k6jVar.I0().c;
                        g8jVar.getClass();
                        g8jVar.b.e(new xyg(new oba(2, 0, new int[0])), false);
                        break;
                    case 2:
                        xtb[] xtbVarArr3 = k6j.x;
                        ((g8j) k6jVar.I0().c).g(new int[0]);
                        break;
                    case 3:
                        xtb[] xtbVarArr4 = k6j.x;
                        g8j g8jVar2 = (g8j) k6jVar.I0().c;
                        g8jVar2.getClass();
                        g8jVar2.b.e(new x2f(new oba(2, 0, new int[0])), false);
                        break;
                    case 4:
                        xtb[] xtbVarArr5 = k6j.x;
                        ((g8j) k6jVar.I0().c).c(new int[0]);
                        break;
                    case 5:
                        xtb[] xtbVarArr6 = k6j.x;
                        g8j g8jVar3 = (g8j) k6jVar.I0().c;
                        g8jVar3.getClass();
                        g8jVar3.b.e(new brd(new oba(2, 0, new int[0])), false);
                        break;
                    case 6:
                        xtb[] xtbVarArr7 = k6j.x;
                        ((g8j) k6jVar.I0().c).e(new int[0]);
                        break;
                    case 7:
                        xtb[] xtbVarArr8 = k6j.x;
                        g8j g8jVar4 = (g8j) k6jVar.I0().c;
                        g8jVar4.getClass();
                        g8jVar4.b.e(new baa(new oba(2, 0, new int[0])), false);
                        break;
                    case 8:
                        xtb[] xtbVarArr9 = k6j.x;
                        g8j g8jVar5 = (g8j) k6jVar.I0().c;
                        g8jVar5.getClass();
                        g8jVar5.b.e(new o2(new oba(2, 0, new int[0])), false);
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        xtb[] xtbVarArr10 = k6j.x;
                        daj dajVarI0 = k6jVar.I0();
                        nv6 nv6VarB = dajVarI0.i.b();
                        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("make_default_banner.dismissed", true);
                        nv6VarB.w();
                        dajVarI0.g();
                        break;
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        xtb[] xtbVarArr11 = k6j.x;
                        mm6 mm6Var = k6jVar.I0().p;
                        ((SharedPreferences) mm6Var.a().c.get()).edit().putInt("resume_type", 6).putString("resume_deep_link", null).apply();
                        mm6Var.a().e(mm6Var.f, null);
                        break;
                    case 11:
                        xtb[] xtbVarArr12 = k6j.x;
                        k6jVar.I0().d.a(new int[0]);
                        break;
                    case 12:
                        xtb[] xtbVarArr13 = k6j.x;
                        k6jVar.I0().e.a(new int[0]);
                        break;
                    case 13:
                        xtb[] xtbVarArr14 = k6j.x;
                        k6jVar.I0().f.a(new int[0]);
                        break;
                    case 14:
                        xtb[] xtbVarArr15 = k6j.x;
                        k6jVar.I0().g.a();
                        break;
                    case 15:
                        xtb[] xtbVarArr16 = k6j.x;
                        k6jVar.I0().s();
                        break;
                    case 16:
                        xtb[] xtbVarArr17 = k6j.x;
                        k6jVar.I0().h.a(new int[0]);
                        break;
                    case 17:
                        xtb[] xtbVarArr18 = k6j.x;
                        ((g8j) k6jVar.I0().c).d(new int[0]);
                        break;
                    case SizeUtil.textSize0_1 /* 18 */:
                        xtb[] xtbVarArr19 = k6j.x;
                        ((g8j) k6jVar.I0().c).b(new int[0]);
                        break;
                    default:
                        xtb[] xtbVarArr20 = k6j.x;
                        ((g8j) k6jVar.I0().c).j(c8j.a, new int[0]);
                        break;
                }
            }
        });
        FadingNestedScrollView fadingNestedScrollView = (FadingNestedScrollView) view.findViewById(2131362409);
        if (fadingNestedScrollView != null) {
            fadingNestedScrollView.F = (j6j) this.v.a(this, x[1]);
        }
        xf8.i0(I0().s, getViewLifecycleOwner(), H0().a, (List) null, new qzg(this, b18));
    }

    @Override // defpackage.ltl
    public final void x0(itd itdVar) {
        this.w = itdVar.findItem(2131364146);
    }
}
