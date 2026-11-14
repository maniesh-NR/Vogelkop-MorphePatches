package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.custom_views.DropShadowFrameLayout;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.weather.view.WeatherWidgetView;
import com.opera.android.widget.LottieAnimationView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r6k extends ab2 implements ev8, rjm {
    public final pt1 d;
    public final ne5 e;
    public final e7k f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;

    /* JADX WARN: Illegal instructions before constructor call */
    public r6k(fwf fwfVar, pt1 pt1Var, ne5 ne5Var, e7k e7kVar) {
        ConstraintLayout constraintLayout = (ConstraintLayout) pt1Var.d;
        super(constraintLayout);
        this.d = pt1Var;
        this.e = ne5Var;
        this.f = e7kVar;
        final byte b = 1;
        ((pde) ne5Var.g).j(fwfVar, new t7d(new n6k(this, b), (byte) 15));
        DropShadowFrameLayout dropShadowFrameLayout = (DropShadowFrameLayout) pt1Var.g;
        final byte b2 = 0;
        dropShadowFrameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: p6k
            public final /* synthetic */ r6k b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r6v16, types: [android.app.Activity, com.opera.android.BrowserActivity] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                r6k r6kVar = this.b;
                switch (b3) {
                    case 0:
                        mu5 mu5Var = r6kVar.f.g;
                        if (mu5Var != null) {
                            mu5Var.a(true);
                        }
                        f1p f1pVar = (f1p) r6kVar.e.f;
                        ((OperaApplication) f1pVar.a).L().c.f0(ph0.H);
                        fp1 fp1Var = (BrowserActivity) f1pVar.b;
                        int i = BrowserActivity.E1;
                        ru9 ru9VarC = ru9.c(fp1Var);
                        boolean z = ru9VarC.a.getBoolean("jump_minigame.intro_shown", false);
                        boolean z2 = !z;
                        if (!z) {
                            nv6 nv6VarB = ru9VarC.b();
                            ((SharedPreferences.Editor) nv6VarB.a).putBoolean("jump_minigame.intro_shown", true);
                            nv6VarB.w();
                        }
                        am2.v(ay3.a(btb.d(null, "start_page_icon", null, z2), lqm.I, true));
                        break;
                    case 1:
                        ?? r6 = (BrowserActivity) ((f1p) r6kVar.e.f).b;
                        int i2 = BrowserActivity.E1;
                        String[] strArr = OperaApplication.K;
                        ((OperaApplication) r6.getApplication()).L().c.f0(ph0.s);
                        r6.d1();
                        break;
                    default:
                        ne5 ne5Var2 = r6kVar.e;
                        xz6 xz6Var = ((pz6) ne5Var2.e).e;
                        x5f x5fVar = xz6Var.a;
                        if (!xz6Var.c) {
                            xz6Var.c = true;
                            if (!xz6Var.b) {
                                xz6Var.b = true;
                                if (x5fVar.h) {
                                    zpa zpaVar = x5fVar.d;
                                    x56 x56VarF = zpa.F();
                                    ((wu0) am2.f(zpaVar, x56VarF).e.getValue()).b.p(0, 1, 1L);
                                    x5fVar.U0(x56VarF);
                                }
                            }
                            if (x5fVar.h) {
                                zpa zpaVar2 = x5fVar.d;
                                x56 x56VarF2 = zpa.F();
                                ((wu0) am2.f(zpaVar2, x56VarF2).e.getValue()).b.p(1, 1, 1L);
                                x5fVar.U0(x56VarF2);
                            }
                        }
                        ((BrowserActivity) ((f1p) ne5Var2.f).b).P0().e(new spn(), false);
                        break;
                }
            }
        });
        new w9n(dropShadowFrameLayout, new x9n(this) { // from class: q6k
            public final /* synthetic */ r6k b;

            {
                this.b = this;
            }

            @Override // defpackage.x9n
            public final void a(int i) {
                byte b3 = b2;
                r6k r6kVar = this.b;
                switch (b3) {
                    case 0:
                        boolean z = i == 100;
                        if (z != r6kVar.i) {
                            r6kVar.i = z;
                            r6kVar.c0();
                            break;
                        }
                        break;
                    default:
                        boolean z2 = i == 100;
                        if (z2 != r6kVar.h) {
                            r6kVar.h = z2;
                            if (r6kVar.g && z2) {
                                xz6 xz6Var = ((pz6) r6kVar.e.e).e;
                                if (!xz6Var.b) {
                                    xz6Var.b = true;
                                    x5f x5fVar = xz6Var.a;
                                    if (x5fVar.h) {
                                        zpa zpaVar = x5fVar.d;
                                        x56 x56VarF = zpa.F();
                                        ((wu0) am2.f(zpaVar, x56VarF).e.getValue()).b.p(0, 1, 1L);
                                        x5fVar.U0(x56VarF);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                }
            }
        });
        ((DropShadowFrameLayout) pt1Var.f).setOnClickListener(new View.OnClickListener(this) { // from class: p6k
            public final /* synthetic */ r6k b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r6v16, types: [android.app.Activity, com.opera.android.BrowserActivity] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                r6k r6kVar = this.b;
                switch (b3) {
                    case 0:
                        mu5 mu5Var = r6kVar.f.g;
                        if (mu5Var != null) {
                            mu5Var.a(true);
                        }
                        f1p f1pVar = (f1p) r6kVar.e.f;
                        ((OperaApplication) f1pVar.a).L().c.f0(ph0.H);
                        fp1 fp1Var = (BrowserActivity) f1pVar.b;
                        int i = BrowserActivity.E1;
                        ru9 ru9VarC = ru9.c(fp1Var);
                        boolean z = ru9VarC.a.getBoolean("jump_minigame.intro_shown", false);
                        boolean z2 = !z;
                        if (!z) {
                            nv6 nv6VarB = ru9VarC.b();
                            ((SharedPreferences.Editor) nv6VarB.a).putBoolean("jump_minigame.intro_shown", true);
                            nv6VarB.w();
                        }
                        am2.v(ay3.a(btb.d(null, "start_page_icon", null, z2), lqm.I, true));
                        break;
                    case 1:
                        ?? r6 = (BrowserActivity) ((f1p) r6kVar.e.f).b;
                        int i2 = BrowserActivity.E1;
                        String[] strArr = OperaApplication.K;
                        ((OperaApplication) r6.getApplication()).L().c.f0(ph0.s);
                        r6.d1();
                        break;
                    default:
                        ne5 ne5Var2 = r6kVar.e;
                        xz6 xz6Var = ((pz6) ne5Var2.e).e;
                        x5f x5fVar = xz6Var.a;
                        if (!xz6Var.c) {
                            xz6Var.c = true;
                            if (!xz6Var.b) {
                                xz6Var.b = true;
                                if (x5fVar.h) {
                                    zpa zpaVar = x5fVar.d;
                                    x56 x56VarF = zpa.F();
                                    ((wu0) am2.f(zpaVar, x56VarF).e.getValue()).b.p(0, 1, 1L);
                                    x5fVar.U0(x56VarF);
                                }
                            }
                            if (x5fVar.h) {
                                zpa zpaVar2 = x5fVar.d;
                                x56 x56VarF2 = zpa.F();
                                ((wu0) am2.f(zpaVar2, x56VarF2).e.getValue()).b.p(1, 1, 1L);
                                x5fVar.U0(x56VarF2);
                            }
                        }
                        ((BrowserActivity) ((f1p) ne5Var2.f).b).P0().e(new spn(), false);
                        break;
                }
            }
        });
        WeatherWidgetView weatherWidgetView = (WeatherWidgetView) pt1Var.b;
        final byte b3 = 2;
        weatherWidgetView.setOnClickListener(new View.OnClickListener(this) { // from class: p6k
            public final /* synthetic */ r6k b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r6v16, types: [android.app.Activity, com.opera.android.BrowserActivity] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b3;
                r6k r6kVar = this.b;
                switch (b32) {
                    case 0:
                        mu5 mu5Var = r6kVar.f.g;
                        if (mu5Var != null) {
                            mu5Var.a(true);
                        }
                        f1p f1pVar = (f1p) r6kVar.e.f;
                        ((OperaApplication) f1pVar.a).L().c.f0(ph0.H);
                        fp1 fp1Var = (BrowserActivity) f1pVar.b;
                        int i = BrowserActivity.E1;
                        ru9 ru9VarC = ru9.c(fp1Var);
                        boolean z = ru9VarC.a.getBoolean("jump_minigame.intro_shown", false);
                        boolean z2 = !z;
                        if (!z) {
                            nv6 nv6VarB = ru9VarC.b();
                            ((SharedPreferences.Editor) nv6VarB.a).putBoolean("jump_minigame.intro_shown", true);
                            nv6VarB.w();
                        }
                        am2.v(ay3.a(btb.d(null, "start_page_icon", null, z2), lqm.I, true));
                        break;
                    case 1:
                        ?? r6 = (BrowserActivity) ((f1p) r6kVar.e.f).b;
                        int i2 = BrowserActivity.E1;
                        String[] strArr = OperaApplication.K;
                        ((OperaApplication) r6.getApplication()).L().c.f0(ph0.s);
                        r6.d1();
                        break;
                    default:
                        ne5 ne5Var2 = r6kVar.e;
                        xz6 xz6Var = ((pz6) ne5Var2.e).e;
                        x5f x5fVar = xz6Var.a;
                        if (!xz6Var.c) {
                            xz6Var.c = true;
                            if (!xz6Var.b) {
                                xz6Var.b = true;
                                if (x5fVar.h) {
                                    zpa zpaVar = x5fVar.d;
                                    x56 x56VarF = zpa.F();
                                    ((wu0) am2.f(zpaVar, x56VarF).e.getValue()).b.p(0, 1, 1L);
                                    x5fVar.U0(x56VarF);
                                }
                            }
                            if (x5fVar.h) {
                                zpa zpaVar2 = x5fVar.d;
                                x56 x56VarF2 = zpa.F();
                                ((wu0) am2.f(zpaVar2, x56VarF2).e.getValue()).b.p(1, 1, 1L);
                                x5fVar.U0(x56VarF2);
                            }
                        }
                        ((BrowserActivity) ((f1p) ne5Var2.f).b).P0().e(new spn(), false);
                        break;
                }
            }
        });
        new w9n(weatherWidgetView, new x9n(this) { // from class: q6k
            public final /* synthetic */ r6k b;

            {
                this.b = this;
            }

            @Override // defpackage.x9n
            public final void a(int i) {
                byte b32 = b;
                r6k r6kVar = this.b;
                switch (b32) {
                    case 0:
                        boolean z = i == 100;
                        if (z != r6kVar.i) {
                            r6kVar.i = z;
                            r6kVar.c0();
                            break;
                        }
                        break;
                    default:
                        boolean z2 = i == 100;
                        if (z2 != r6kVar.h) {
                            r6kVar.h = z2;
                            if (r6kVar.g && z2) {
                                xz6 xz6Var = ((pz6) r6kVar.e.e).e;
                                if (!xz6Var.b) {
                                    xz6Var.b = true;
                                    x5f x5fVar = xz6Var.a;
                                    if (x5fVar.h) {
                                        zpa zpaVar = x5fVar.d;
                                        x56 x56VarF = zpa.F();
                                        ((wu0) am2.f(zpaVar, x56VarF).e.getValue()).b.p(0, 1, 1L);
                                        x5fVar.U0(x56VarF);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                }
            }
        });
        q9n.e(constraintLayout, new kkf(this, (byte) 22));
    }

    @Override // defpackage.rjm
    public final void b(sjm sjmVar) {
        boolean z = this.g;
        boolean z2 = sjmVar.a;
        if (z == z2) {
            return;
        }
        this.g = z2;
        if (z2 && z2 && this.h) {
            xz6 xz6Var = ((pz6) this.e.e).e;
            if (!xz6Var.b) {
                xz6Var.b = true;
                x5f x5fVar = xz6Var.a;
                if (x5fVar.h) {
                    zpa zpaVar = x5fVar.d;
                    x56 x56VarF = zpa.F();
                    ((wu0) am2.f(zpaVar, x56VarF).e.getValue()).b.p(0, 1, 1L);
                    x5fVar.U0(x56VarF);
                }
            }
        }
        c0();
    }

    public final void b0(v6k v6kVar) {
        int color;
        pt1 pt1Var = this.d;
        DropShadowFrameLayout dropShadowFrameLayout = (DropShadowFrameLayout) pt1Var.g;
        DropShadowFrameLayout dropShadowFrameLayout2 = (DropShadowFrameLayout) pt1Var.f;
        WeatherWidgetView weatherWidgetView = (WeatherWidgetView) pt1Var.b;
        boolean z = v6kVar.b;
        laj lajVar = v6kVar.d;
        w6k w6kVar = v6kVar.e;
        dropShadowFrameLayout.setVisibility(z ? 0 : 8);
        w6kVar.d((StylingImageButton) pt1Var.c);
        ((DropShadowFrameLayout) pt1Var.g).b(lajVar);
        dropShadowFrameLayout2.setVisibility(v6kVar.c ? 0 : 8);
        w6kVar.d((StylingImageButton) pt1Var.e);
        dropShadowFrameLayout2.b(lajVar);
        zpn zpnVar = v6kVar.f;
        if (Intrinsics.a(zpnVar, wpn.a) || Intrinsics.a(zpnVar, xpn.a)) {
            weatherWidgetView.setVisibility(4);
            return;
        }
        if (Intrinsics.a(zpnVar, vpn.a)) {
            weatherWidgetView.setVisibility(8);
            return;
        }
        if (!(zpnVar instanceof ypn)) {
            h9o.p();
            return;
        }
        vs vsVar = weatherWidgetView.a;
        ypn ypnVar = (ypn) zpnVar;
        Integer numZ = xih.z(ypnVar.a);
        if (numZ == null) {
            ((LottieAnimationView) vsVar.d).setImageDrawable((Drawable) null);
        } else {
            ((LottieAnimationView) vsVar.d).j(numZ.intValue());
        }
        ((StylingTextView) vsVar.e).setText(weatherWidgetView.getContext().getString(2132018227, String.valueOf(zed.a(ypnVar.c)), ypnVar.b));
        ((StylingTextView) vsVar.e).setTextColor(w6kVar.ordinal() != 0 ? -1 : weatherWidgetView.getContext().getColor(2131099830));
        Context context = weatherWidgetView.getContext();
        int iOrdinal = w6kVar.ordinal();
        if (iOrdinal == 0) {
            color = context.getColor(2131103629);
        } else {
            if (iOrdinal != 1) {
                throw new RuntimeException(null, null);
            }
            color = context.getColor(2131103628);
        }
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(color);
        weatherWidgetView.getContext();
        Drawable background = ((LinearLayout) vsVar.c).getBackground();
        if (background instanceof RippleDrawable) {
            ((RippleDrawable) background).setColor(colorStateListValueOf);
        }
        if (lajVar == null) {
            lajVar = laj.e;
        }
        lajVar.a((StylingTextView) vsVar.e);
        weatherWidgetView.setVisibility(0);
    }

    public final void c0() {
        byte b = 0;
        boolean z = this.g && this.i;
        if (z != this.j) {
            this.j = z;
            DropShadowFrameLayout dropShadowFrameLayout = (DropShadowFrameLayout) this.d.g;
            e7k e7kVar = this.f;
            ru9 ru9Var = (ru9) e7kVar.a.invoke();
            SharedPreferences sharedPreferences = ru9Var.a;
            za9 za9Var = e7kVar.e;
            if (za9Var.b != z) {
                za9Var.b = z;
                za9Var.d(ru9Var);
            }
            if (z && e7kVar.g == null && ((Boolean) e7kVar.d.get()).booleanValue() && !sharedPreferences.getBoolean("jump_minigame.visited", false) && !sharedPreferences.getBoolean("startpage.minigame_button_hint_shown", false)) {
                if (sharedPreferences.getInt("startpage.minigame_entry_point_impressions", 0) >= (sharedPreferences.getBoolean("startpage.installed_with_minigame", false) ? 3 : 2)) {
                    mu5 mu5Var = new mu5(dropShadowFrameLayout, new lr2((byte) 3), new d7k(e7kVar, dropShadowFrameLayout, b), (byte) 1);
                    e7kVar.g = mu5Var;
                    oz3 oz3Var = (oz3) e7kVar.c.invoke();
                    oz3Var.getClass();
                    oz3Var.b(mu5Var, ijm.b);
                }
            }
        }
    }
}
