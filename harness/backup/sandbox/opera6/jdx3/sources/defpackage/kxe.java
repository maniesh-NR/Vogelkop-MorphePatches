package defpackage;

import android.app.ActivityManager;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.provider.Settings;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TimePicker;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.custom_views.FadingScrollView;
import com.opera.android.custom_views.LayoutDirectionLinearLayout;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.settings.SettingsManager;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.android.ui.catalog.widget.OperaTextView;
import com.opera.android.utilities.DisplayUtil;
import com.opera.android.widget.GradientSlider;
import com.opera.android.widget.ScheduleRangeSlider;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class kxe extends i93 implements o37 {
    public final xt8 A;
    public final z77 B;
    public final gjm C;
    public final ua7 D;
    public dmd E;
    public b98 F;
    public cr2 G;
    public vs H;
    public ov0 I;
    public dxe J;
    public z61 K;
    public boolean L;
    public int M;
    public int N;
    public MaterialCardView O;
    public int P;
    public ViewGroup Q;
    public TimePickerDialog R;
    public boolean S;
    public final ixe t;
    public final ixe u;
    public final fxe v;
    public final jxe w;
    public final xu1 x;
    public final SettingsManager y;
    public final qwe z;

    public kxe(SettingsManager settingsManager, qwe qweVar, xt8 xt8Var, z77 z77Var, orm ormVar, gjm gjmVar) {
        super(2132021306);
        this.t = new ixe(this, (byte) 0);
        this.u = new ixe(this, (byte) 1);
        this.v = new fxe(this, (byte) 4);
        this.x = new xu1(this, (byte) 1);
        this.P = 2132019566;
        this.y = settingsManager;
        this.w = new jxe(this, settingsManager);
        this.z = qweVar;
        this.A = xt8Var;
        this.B = z77Var;
        this.C = gjmVar;
        this.D = new ua7((Fragment) this, gjmVar);
        x5f x5fVar = (x5f) ormVar;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            am2.f(zpaVar, x56VarF).b.p(4, 1, 1L);
            x5fVar.U0(x56VarF);
        }
    }

    @Override // defpackage.ltl
    public final itl C0(itl itlVar) {
        u7k u7kVarF;
        if (getResources().getBoolean(2131034131)) {
            u7kVarF = u7k.j(2131559460);
            ((itl) u7kVarF.a).b = 2131755042;
        } else {
            u7kVarF = u7k.f(2);
            ((itl) u7kVarF.a).b = 2131755042;
        }
        itl itlVar2 = (itl) u7kVarF.a;
        itlVar2.f = true;
        return itlVar2;
    }

    @Override // defpackage.i93
    public final h93 G0() {
        return this.v;
    }

    public final void H0(vs vsVar) {
        Context context = ((RelativeLayout) vsVar.b).getContext();
        dx3 dx3VarP = q9n.p(context);
        boolean zD = x1p.D(context, dx3VarP != null ? dx3VarP.u() : null);
        dkf dkfVar = new dkf(context, f03.E(zD ? 2130969480 : 2130970154, context, 2132082772));
        int iT = f03.t(2130969332, dkfVar, 2131101243);
        ((OperaTextView) vsVar.c).setTextColor(f03.t(2130969284, dkfVar, 2131101243));
        ((OperaTextView) vsVar.e).setTextColor(f03.t(2130969288, dkfVar, 2131101243));
        MaterialCardView materialCardView = this.O;
        if (materialCardView != null) {
            materialCardView.b(iT);
            MaterialCardView materialCardView2 = this.O;
            int iT2 = f03.t(zD ? 2130969301 : 2130969302, dkfVar, 2131101243);
            materialCardView2.getClass();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(iT2);
            ndd nddVar = materialCardView2.g;
            if (nddVar.o != colorStateListValueOf) {
                nddVar.o = colorStateListValueOf;
                zdd zddVar = nddVar.d;
                zddVar.A(nddVar.i);
                zddVar.y(colorStateListValueOf);
            }
            materialCardView2.invalidate();
        } else {
            ((RelativeLayout) vsVar.b).setBackgroundColor(iT);
        }
        K0();
    }

    public final void I0(final boolean z) {
        SettingsManager settingsManager = this.y;
        long jQ = z ? settingsManager.q("night_mode_schedule_start") : settingsManager.q("night_mode_schedule_end");
        TimePickerDialog timePickerDialog = new TimePickerDialog(getContext(), 2132083351, new TimePickerDialog.OnTimeSetListener() { // from class: gxe
            @Override // android.app.TimePickerDialog.OnTimeSetListener
            public final void onTimeSet(TimePicker timePicker, int i, int i2) {
                long millis = TimeUnit.MINUTES.toMillis(i2) + TimeUnit.HOURS.toMillis(i);
                kxe kxeVar = this.a;
                SettingsManager settingsManager2 = kxeVar.y;
                if (z) {
                    settingsManager2.W(millis, "night_mode_schedule_start");
                } else {
                    settingsManager2.W(millis, "night_mode_schedule_end");
                }
                kxeVar.M0();
                kxeVar.R = null;
            }
        }, (int) (jQ / 3600000), ((int) (jQ / 60000)) % 60, DateFormat.is24HourFormat(getContext()));
        this.R = timePickerDialog;
        timePickerDialog.show();
        this.z.a(this.R);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J0() {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kxe.J0():void");
    }

    public final void K0() {
        vs vsVar = this.H;
        if (vsVar != null) {
            ((OperaTextView) vsVar.e).setText(getString(this.P));
            if (((OperaTextView) this.H.e).getLayout() == null) {
                return;
            }
            vs vsVar2 = this.H;
            AppCompatImageView appCompatImageView = (StylingImageView) vsVar2.d;
            OperaTextView operaTextView = (OperaTextView) vsVar2.e;
            String string = getString(this.P);
            int width = appCompatImageView.getWidth();
            int right = operaTextView.getRight() - appCompatImageView.getRight();
            Layout layout = operaTextView.getLayout();
            DynamicLayout dynamicLayout = new DynamicLayout(layout.getText(), operaTextView.getPaint(), right - (operaTextView.getMeasuredWidth() - layout.getWidth()), layout.getAlignment(), layout.getSpacingMultiplier(), layout.getSpacingAdd(), true);
            int iMax = Math.max(1, dynamicLayout.getLineForVertical(appCompatImageView.getBottom()) - 1);
            int lineEnd = dynamicLayout.getLineEnd(iMax - 1);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string, 0, lineEnd);
            spannableStringBuilder.setSpan(new uwj(iMax, width), 0, spannableStringBuilder.length(), 0);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(System.getProperty("line.separator"));
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(string, lineEnd, string.length());
            spannableStringBuilder3.setSpan(new uwj(0, 0), 0, spannableStringBuilder3.length(), 0);
            SpannableString spannableString = new SpannableString(TextUtils.concat(spannableStringBuilder, spannableStringBuilder2, spannableStringBuilder3));
            Context context = ((OperaTextView) this.H.e).getContext();
            dx3 dx3VarP = q9n.p(context);
            spannableString.setSpan(new ForegroundColorSpan(x1p.D(context, dx3VarP != null ? dx3VarP.u() : null) ? -8806913 : -13408513), 12, 17, 33);
            spannableString.setSpan(new UnderlineSpan(), 12, 17, 33);
            ((OperaTextView) this.H.e).setText(spannableString);
        }
    }

    public final void L0() {
        if (getResources().getBoolean(2131034132)) {
            return;
        }
        Context contextRequireContext = requireContext();
        ((RelativeLayout) this.H.b).setLayoutParams(new LinearLayout.LayoutParams(-2, -2, DisplayUtil.c(contextRequireContext) < DisplayUtil.b(contextRequireContext) ? 2 : 1));
    }

    public final void M0() {
        SettingsManager settingsManager = this.y;
        int iQ = ((int) (settingsManager.q("night_mode_schedule_start") / 60000)) / 30;
        float f = iQ > 24 ? iQ - 24 : iQ + 24;
        int iQ2 = ((int) (settingsManager.q("night_mode_schedule_end") / 60000)) / 30;
        float f2 = iQ2 > 24 ? iQ2 - 24 : iQ2 + 24;
        if (Math.abs(f - f2) < 0.001f && Math.abs(f2 - ((ScheduleRangeSlider) this.G.c).x()) < 0.001f) {
            f = 0.0f;
        }
        ((ScheduleRangeSlider) this.G.c).a0(Float.valueOf(f), Float.valueOf(f2));
    }

    @Override // defpackage.ltl, defpackage.ryl
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b59 b59Var = (b59) new bpd(getContext()).b;
        ((SharedPreferences) b59Var.get()).edit().putBoolean("show_main_menu_toggle", true).apply();
        ((SharedPreferences) b59Var.get()).edit().putBoolean("onboarding_show", false).apply();
        this.J = q9n.p(getContext()).s;
    }

    @Override // defpackage.ryl
    public final void onDestroy() {
        super.onDestroy();
        this.J = null;
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        super.onDestroyView();
        this.y.H(this.w);
        owe oweVar = owe.c;
        xu1 xu1Var = this.x;
        oweVar.H(xu1Var);
        this.J.h.c(xu1Var);
        z61 z61Var = this.K;
        ViewGroup viewGroup = this.Q;
        z61Var.getClass();
        viewGroup.removeOnAttachStateChangeListener(z61Var);
        if (viewGroup.isAttachedToWindow()) {
            viewGroup.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) z61Var.b);
        }
        ((ScheduleRangeSlider) this.G.c).B0(this.u);
        GradientSlider gradientSlider = (GradientSlider) this.G.d;
        ixe ixeVar = this.t;
        gradientSlider.A0(ixeVar);
        ((GradientSlider) this.G.m).A0(ixeVar);
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.O = null;
        this.Q = null;
        TimePickerDialog timePickerDialog = this.R;
        if (timePickerDialog != null) {
            if (timePickerDialog.isShowing()) {
                this.R.dismiss();
            }
            this.R = null;
        }
    }

    @Override // defpackage.i93, defpackage.ltl
    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131363315) {
            return super.onMenuItemClick(menuItem);
        }
        this.C.e(new swe(), false);
        return true;
    }

    @Override // defpackage.ltl
    public final void onResume() {
        super.onResume();
        if (this.L && Settings.canDrawOverlays(getContext())) {
            this.y.V(1, "night_mode_overlay_keyboard");
        }
        K0();
    }

    public final void onStart() {
        super.onStart();
        if (!this.S && ((exe) this.D.p()).a) {
            this.S = true;
            vp9 vp9Var = new vp9(2131232154, 2130969244, 2132020026, 2132020024, 2132020025, 2130969270);
            z77 z77Var = this.B;
            z77Var.getClass();
            z77Var.b(vp9Var, ijm.b);
        }
        this.A.S(1);
    }

    @Override // defpackage.i93, defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        GradientSlider gradientSlider = (GradientSlider) this.G.d;
        ixe ixeVar = this.t;
        gradientSlider.t0(ixeVar);
        ((GradientSlider) this.G.m).t0(ixeVar);
        ((ScheduleRangeSlider) this.G.c).t0(this.u);
        ((ScheduleRangeSlider) this.G.c).C0();
        final byte b = 0;
        ((OperaListItem) this.I.d).u = new fxe(this, b);
        cr2 cr2Var = this.G;
        final byte b2 = 1;
        ((OperaListItem) cr2Var.l).u = new fxe(this, b2);
        final byte b3 = 2;
        ((OperaListItem) cr2Var.h).u = new fxe(this, b3);
        ((OperaListItem) cr2Var.j).u = new fxe(this, (byte) 3);
        ((OperaListItem) cr2Var.k).setOnClickListener(new View.OnClickListener(this) { // from class: hxe
            public final /* synthetic */ kxe b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x002d A[PHI: r2
              0x002d: PHI (r2v1 int) = (r2v0 int), (r2v3 int) binds: [B:9:0x0028, B:11:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onClick(android.view.View r4) {
                /*
                    r3 = this;
                    byte r4 = r2
                    r0 = 1
                    kxe r3 = r3.b
                    switch(r4) {
                        case 0: goto L11;
                        case 1: goto Ld;
                        default: goto L8;
                    }
                L8:
                    r4 = 0
                    r3.I0(r4)
                    return
                Ld:
                    r3.I0(r0)
                    return
                L11:
                    com.opera.android.settings.SettingsManager r4 = r3.y
                    int r4 = r4.s()
                    cr2 r1 = r3.G
                    android.view.View r1 = r1.k
                    com.opera.android.ui.catalog.widget.OperaListItem r1 = (com.opera.android.ui.catalog.widget.OperaListItem) r1
                    bpd r1 = r1.A
                    java.lang.String r1 = r1.D()
                    int r4 = vep.A(r4)
                    r2 = 2
                    if (r4 == r2) goto L2d
                    r2 = 3
                    if (r4 != r2) goto L2e
                L2d:
                    r0 = r2
                L2e:
                    android.os.Bundle r4 = new android.os.Bundle
                    r4.<init>()
                    java.lang.String r2 = "option"
                    int r0 = vep.A(r0)
                    r4.putInt(r2, r0)
                    java.lang.String r0 = "title"
                    r4.putString(r0, r1)
                    bxe r0 = new bxe
                    r0.<init>()
                    r0.setArguments(r4)
                    tim r4 = new tim
                    r4.<init>(r0)
                    z77 r3 = r3.B
                    r3.getClass()
                    ijm r0 = defpackage.ijm.b
                    r3.b(r4, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.hxe.onClick(android.view.View):void");
            }
        });
        ((OperaListItem) this.G.e).setOnClickListener(new View.OnClickListener(this) { // from class: hxe
            public final /* synthetic */ kxe b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View v) {
                /*
                    this = this;
                    byte r4 = r2
                    r0 = 1
                    kxe r3 = r3.b
                    switch(r4) {
                        case 0: goto L11;
                        case 1: goto Ld;
                        default: goto L8;
                    }
                L8:
                    r4 = 0
                    r3.I0(r4)
                    return
                Ld:
                    r3.I0(r0)
                    return
                L11:
                    com.opera.android.settings.SettingsManager r4 = r3.y
                    int r4 = r4.s()
                    cr2 r1 = r3.G
                    android.view.View r1 = r1.k
                    com.opera.android.ui.catalog.widget.OperaListItem r1 = (com.opera.android.ui.catalog.widget.OperaListItem) r1
                    bpd r1 = r1.A
                    java.lang.String r1 = r1.D()
                    int r4 = vep.A(r4)
                    r2 = 2
                    if (r4 == r2) goto L2d
                    r2 = 3
                    if (r4 != r2) goto L2e
                L2d:
                    r0 = r2
                L2e:
                    android.os.Bundle r4 = new android.os.Bundle
                    r4.<init>()
                    java.lang.String r2 = "option"
                    int r0 = vep.A(r0)
                    r4.putInt(r2, r0)
                    java.lang.String r0 = "title"
                    r4.putString(r0, r1)
                    bxe r0 = new bxe
                    r0.<init>()
                    r0.setArguments(r4)
                    tim r4 = new tim
                    r4.<init>(r0)
                    z77 r3 = r3.B
                    r3.getClass()
                    ijm r0 = defpackage.ijm.b
                    r3.b(r4, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.hxe.onClick(android.view.View):void");
            }
        });
        ((OperaListItem) this.G.f).setOnClickListener(new View.OnClickListener(this) { // from class: hxe
            public final /* synthetic */ kxe b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View v) {
                /*
                    this = this;
                    byte r4 = r2
                    r0 = 1
                    kxe r3 = r3.b
                    switch(r4) {
                        case 0: goto L11;
                        case 1: goto Ld;
                        default: goto L8;
                    }
                L8:
                    r4 = 0
                    r3.I0(r4)
                    return
                Ld:
                    r3.I0(r0)
                    return
                L11:
                    com.opera.android.settings.SettingsManager r4 = r3.y
                    int r4 = r4.s()
                    cr2 r1 = r3.G
                    android.view.View r1 = r1.k
                    com.opera.android.ui.catalog.widget.OperaListItem r1 = (com.opera.android.ui.catalog.widget.OperaListItem) r1
                    bpd r1 = r1.A
                    java.lang.String r1 = r1.D()
                    int r4 = vep.A(r4)
                    r2 = 2
                    if (r4 == r2) goto L2d
                    r2 = 3
                    if (r4 != r2) goto L2e
                L2d:
                    r0 = r2
                L2e:
                    android.os.Bundle r4 = new android.os.Bundle
                    r4.<init>()
                    java.lang.String r2 = "option"
                    int r0 = vep.A(r0)
                    r4.putInt(r2, r0)
                    java.lang.String r0 = "title"
                    r4.putString(r0, r1)
                    bxe r0 = new bxe
                    r0.<init>()
                    r0.setArguments(r4)
                    tim r4 = new tim
                    r4.<init>(r0)
                    z77 r3 = r3.B
                    r3.getClass()
                    ijm r0 = defpackage.ijm.b
                    r3.b(r4, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.hxe.onClick(android.view.View):void");
            }
        });
        M0();
        j21 j21Var = new j21(this, (byte) 2);
        z61 z61Var = new z61(j21Var, (byte) 11);
        this.K = z61Var;
        ViewGroup viewGroup = this.Q;
        viewGroup.addOnAttachStateChangeListener(z61Var);
        if (viewGroup.isAttachedToWindow()) {
            viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(j21Var);
        }
        if (this.F != null) {
            L0();
        }
    }

    @Override // defpackage.o37
    public final ua7 r() {
        return this.D;
    }

    @Override // defpackage.ltl
    public final void v0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.Q = viewGroup;
        int i = 2131364298;
        if (!getResources().getBoolean(2131034131)) {
            q9n.f(this.k, new lzb(this, (byte) 23));
            ViewGroup viewGroup2 = this.Q;
            View viewInflate = layoutInflater.inflate(2131559135, viewGroup2, false);
            viewGroup2.addView(viewInflate);
            View viewJ = w1h.j(2131363780, viewInflate);
            if (viewJ != null) {
                cr2 cr2VarA = cr2.a(viewJ);
                MaterialCardView materialCardViewJ = w1h.j(2131363934, viewInflate);
                if (materialCardViewJ != null) {
                    View viewJ2 = w1h.j(2131363935, viewInflate);
                    if (viewJ2 != null) {
                        vs vsVarB = vs.b(viewJ2);
                        View viewJ3 = w1h.j(2131364298, viewInflate);
                        if (viewJ3 != null) {
                            ov0 ov0VarF = ov0.f(viewJ3);
                            this.E = new dmd((LinearLayout) viewInflate, cr2VarA, materialCardViewJ, vsVarB, ov0VarF);
                            this.G = cr2VarA;
                            this.H = vsVarB;
                            this.I = ov0VarF;
                            this.O = materialCardViewJ;
                            ((View) ov0VarF.c).setVisibility(8);
                            this.P = 2132019567;
                            ((OperaTextView) this.H.e).setMaxLines(8);
                        }
                    } else {
                        i = 2131363935;
                    }
                } else {
                    i = 2131363934;
                }
            } else {
                i = 2131363780;
            }
            t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
            return;
        }
        ViewGroup viewGroup3 = this.Q;
        View viewInflate2 = layoutInflater.inflate(2131559136, viewGroup3, false);
        viewGroup3.addView(viewInflate2);
        MaterialButton materialButtonJ = w1h.j(2131363315, viewInflate2);
        if (materialButtonJ != null) {
            View viewJ4 = w1h.j(2131363780, viewInflate2);
            if (viewJ4 != null) {
                cr2 cr2VarA2 = cr2.a(viewJ4);
                View viewJ5 = w1h.j(2131363935, viewInflate2);
                if (viewJ5 != null) {
                    vs vsVarB2 = vs.b(viewJ5);
                    View viewJ6 = w1h.j(2131364298, viewInflate2);
                    if (viewJ6 != null) {
                        ov0 ov0VarF2 = ov0.f(viewJ6);
                        i = 2131364319;
                        if (((FadingScrollView) w1h.j(2131364319, viewInflate2)) != null) {
                            this.F = new b98((FrameLayout) viewInflate2, materialButtonJ, cr2VarA2, vsVarB2, ov0VarF2);
                            this.G = cr2VarA2;
                            this.H = vsVarB2;
                            this.I = ov0VarF2;
                            materialButtonJ.setVisibility(8);
                            ((LayoutDirectionLinearLayout) this.I.b).setVisibility(0);
                            OperaTextView operaTextView = (OperaTextView) this.H.e;
                            operaTextView.setPadding(operaTextView.getPaddingLeft(), ((OperaTextView) this.H.e).getPaddingTop(), ((OperaTextView) this.H.e).getPaddingRight(), 0);
                            this.P = 2132019566;
                            ((OperaTextView) this.H.e).setMaxLines(Integer.MAX_VALUE);
                            if (this.F != null) {
                                ViewGroup viewGroup4 = this.Q;
                                q0(viewGroup4, 2131364319, (AppBarLayout) viewGroup4.findViewById(2131362059));
                            }
                        }
                    }
                } else {
                    i = 2131363935;
                }
            } else {
                i = 2131363780;
            }
        } else {
            i = 2131363315;
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i)));
        return;
        super.v0(layoutInflater, viewGroup);
        vs vsVar = this.H;
        RelativeLayout relativeLayout = (RelativeLayout) vsVar.b;
        e73 e73Var = new e73(this, vsVar, (byte) 10);
        dll dllVarS = q9n.s(relativeLayout);
        if (dllVarS != null) {
            u8n.b(dllVarS, relativeLayout, e73Var);
        }
        if (((ActivityManager) getContext().getSystemService("activity")).isLowRamDevice()) {
            ((OperaListItem) this.G.j).setVisibility(8);
            ((LayoutDirectionLinearLayout) this.G.i).setVisibility(8);
        }
        this.y.F(this.w);
        owe oweVar = owe.c;
        xu1 xu1Var = this.x;
        oweVar.F(xu1Var);
        this.J.h.b(xu1Var);
        J0();
    }

    @Override // defpackage.ltl
    public final void y0(LayoutInflater layoutInflater, StatusBarDrawingFrameLayout statusBarDrawingFrameLayout) {
        WeakHashMap weakHashMap = r5n.a;
        v0(layoutInflater, (ViewGroup) ((View) m5n.f(statusBarDrawingFrameLayout, 2131362409)));
    }
}
