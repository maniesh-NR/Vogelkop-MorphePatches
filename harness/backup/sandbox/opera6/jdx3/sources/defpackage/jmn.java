package defpackage;

import android.animation.TimeAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Size;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.google.android.material.button.MaterialButton;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.custom_views.LayoutDirectionToolbar;
import com.opera.android.settings.SettingsManager;
import com.opera.android.ui.catalog.widget.OperaSwitch;
import com.opera.android.widget.AspectRatioLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class jmn extends lj {
    public w6j A;
    public exd B;
    public l45 C;
    public boolean D;
    public boolean E;
    public final SettingsManager F;
    public final ysj G;
    public final x4i H;
    public final e4i I;
    public final g7j J;
    public boolean K;
    public final umi L;
    public final ua7 M;
    public boolean N;
    public boolean O;
    public int P;
    public final qln r;
    public final onn s;
    public final pde t;
    public s14 u;
    public Bitmap v;
    public lkn w;
    public aln x;
    public h06 y;
    public kmn z;

    /* JADX WARN: Illegal instructions before constructor call */
    public jmn(gjm gjmVar, qln qlnVar, onn onnVar, pde pdeVar, SettingsManager settingsManager, ysj ysjVar, umi umiVar, x4i x4iVar, e4i e4iVar) {
        itl itlVar = (itl) u7k.j(2131559550).a;
        itlVar.b = 2131755071;
        super(itlVar);
        this.r = qlnVar;
        this.s = onnVar;
        this.t = pdeVar;
        this.F = settingsManager;
        this.G = ysjVar;
        this.H = x4iVar;
        this.I = e4iVar;
        this.J = settingsManager.g();
        this.L = umiVar;
        this.M = new ua7((Fragment) this, gjmVar);
    }

    public final void G0(int i, int i2) {
        if (this.D) {
            return;
        }
        this.z.i.animate().alpha(0.0f).setStartDelay(i).setDuration(i2).withStartAction(new emn(this, (byte) 3)).withEndAction(new emn(this, (byte) 1));
    }

    public final int H0() {
        switch (((dmn) this.M.p()).a.ordinal()) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 5;
            case 3:
                return 8;
            case 4:
                return 9;
            case 5:
                return 10;
            case 6:
                return 11;
            case 7:
                return 14;
            default:
                throw new RuntimeException(null, null);
        }
    }

    public final void I0(final View view) {
        l45 l45Var = this.C;
        if (l45Var != null) {
            ((lmn) l45Var.c).b();
            l45Var.c = l45.g;
        }
        Resources resources = getResources();
        int iA = fan.a(8.0f, resources);
        int iApplyDimension = (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
        view.setBackground(j14.E(-1, iA, f03.q(view.getContext())));
        view.setElevation(0.0f);
        view.setAlpha(0.12f);
        TimeAnimator timeAnimator = new TimeAnimator();
        timeAnimator.setTimeListener(new TimeAnimator.TimeListener() { // from class: imn
            @Override // android.animation.TimeAnimator.TimeListener
            public final void onTimeUpdate(TimeAnimator timeAnimator2, long j, long j2) {
                view.setAlpha((((float) Math.abs(Math.sin((j / 1000.0d) * 3.141592653589793d))) * 0.12f) + 0.12f);
            }
        });
        timeAnimator.start();
        Size size = (Size) this.t.g();
        o2c o2cVar = new o2c(false, size.getWidth(), size.getHeight(), false);
        Context context = view.getContext();
        s14 s14Var = this.u;
        jl6 jl6Var = new jl6(this, view, o2cVar, iA, iApplyDimension, timeAnimator);
        l45 l45Var2 = new l45();
        l45Var2.a = this.r;
        l45Var2.b = o2cVar;
        l45Var2.c = jl6Var;
        jmn jmnVar = (jmn) jl6Var.g;
        jmnVar.K0(false);
        exd exdVar = jmnVar.B;
        if (exdVar != null) {
            exdVar.b(hjm.a);
        }
        jmnVar.y = null;
        jmnVar.O0();
        s2g s2gVar = new s2g((Object) l45Var2, (Object) context, (Object) new ilm(l45Var2, (byte) 12), (byte) 15);
        qmn qmnVar = (qmn) s14Var.f;
        if (qmnVar instanceof omn) {
            s2gVar.run(qmnVar);
        } else {
            ((ArrayList) s14Var.e).add(s2gVar);
            if (!s14Var.b) {
                s14Var.b = true;
                ((mmn) s14Var.d).d(new ilm(s14Var, (byte) 13));
            }
        }
        this.C = l45Var2;
    }

    public final void J0(kkn kknVar) {
        byte b = 0;
        if (this.v == null) {
            if (this.w == null) {
                L0();
                return;
            }
            int iO = r9n.o(requireActivity());
            int iM = r9n.m(requireActivity());
            Bitmap bitmapU = z5i.u(iO, iM, Bitmap.Config.ARGB_8888);
            this.v = bitmapU;
            if (bitmapU == null) {
                L0();
                return;
            }
            Canvas canvas = new Canvas(this.v);
            Rect rectCopyBounds = this.w.copyBounds();
            this.w.setBounds(0, 0, iO, iM);
            this.w.draw(canvas);
            this.w.setBounds(rectCopyBounds);
        }
        this.N = true;
        w0a w0aVar = new w0a((byte) 6);
        ysj ysjVar = this.G;
        ysjVar.getClass();
        ysjVar.b(w0aVar, ijm.b);
        fmn fmnVar = new fmn(this, kknVar, b);
        umi umiVar = this.L;
        nml nmlVarC = umiVar.c(fmnVar);
        nmlVarC.b(umiVar.d(new fmn((Object) this, (Object) w0aVar, (byte) 1)));
        nmlVarC.a(null);
    }

    public final void K0(boolean z) {
        this.z.g.setVisibility(z ? 8 : 0);
        this.z.l.setVisibility(z ? 8 : 0);
        this.z.h.setVisibility(z ? 0 : 8);
        this.z.o.setVisibility(z ? 0 : 8);
    }

    public final void L0() {
        ysj ysjVar = this.G;
        ysjVar.b(am2.i(2132021055, 2500, ysjVar), ijm.b);
    }

    public final void M0() {
        aln alnVar = this.x;
        boolean z = (alnVar == null || alnVar.b() == this.J) ? false : true;
        boolean z2 = this.z.a.getResources().getConfiguration().orientation == 2;
        kmn kmnVar = this.z;
        if (!z) {
            kmnVar.e.setVisibility(8);
            this.z.d.setVisibility(8);
        } else if (z2) {
            kmnVar.e.setVisibility(8);
            this.z.d.setVisibility(0);
        } else {
            kmnVar.e.setVisibility(0);
            this.z.d.setVisibility(8);
        }
    }

    public final void N0(aln alnVar) {
        if (((ArrayList) this.r.j.d).contains(alnVar.getId())) {
            r0(2131365066).setIcon(2131232082).setIconTintList(ColorStateList.valueOf(f03.C(requireContext())));
        } else {
            r0(2131365066).setIcon(2131232081).setIconTintList(f03.v(requireContext()));
        }
    }

    public final void O0() {
        if (this.l.isInLayout()) {
            this.l.post(new emn(this, (byte) 2));
            return;
        }
        MenuItem menuItemR0 = r0(2131365070);
        h06 h06Var = this.y;
        menuItemR0.setVisible((h06Var == null || (h06Var.e == null && h06Var.c == null)) ? false : true);
    }

    public final void P0(Configuration configuration) {
        int i = configuration.orientation;
        if (i == 2) {
            this.z.c.setOrientation(0);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.z.q.getLayoutParams();
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.z.l.getLayoutParams();
            layoutParams2.width = 0;
            layoutParams2.weight = 1.0f;
        } else if (i == 1) {
            this.z.c.setOrientation(1);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.z.q.getLayoutParams();
            layoutParams3.width = -1;
            layoutParams3.weight = -1.0f;
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) this.z.l.getLayoutParams();
            layoutParams4.width = -1;
            layoutParams4.weight = -1.0f;
        }
        M0();
    }

    public final void Q0() {
        MaterialButton materialButton = this.z.k;
        if (materialButton.z()) {
            int dimensionPixelSize = materialButton.getResources().getDimensionPixelSize(2131165498);
            if (materialButton.z()) {
                hdd hddVar = materialButton.e;
                if (!hddVar.r || hddVar.i != dimensionPixelSize) {
                    hddVar.i = dimensionPixelSize;
                    hddVar.r = true;
                    hddVar.b(hddVar.b.a(dimensionPixelSize));
                }
            }
        }
        if (this.P == 0 && r9n.H(requireContext())) {
            this.z.k.k(saj.g(2132083237, requireContext(), 0).i());
            this.z.m.setVisibility(0);
        } else {
            this.z.k.k(saj.g(2132083463, requireContext(), 0).i());
            this.z.m.setVisibility(8);
        }
    }

    @Override // defpackage.ryl
    public final void g0() {
        if (this.N) {
            return;
        }
        SettingsManager settingsManager = this.F;
        g7j g7jVarG = settingsManager.g();
        g7j g7jVar = this.J;
        if (g7jVarG != g7jVar) {
            settingsManager.U(g7jVar, false);
        }
        super.g0();
    }

    @Override // defpackage.k24
    public final void l0(boolean z) {
        exd exdVar = this.B;
        if (exdVar != null) {
            exdVar.b(hjm.a);
        } else {
            super.l0(z);
        }
    }

    @Override // defpackage.ltl
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        P0(configuration);
    }

    @Override // defpackage.ltl, defpackage.ryl
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        wln wlnVar = ((dmn) this.M.p()).a;
        onn onnVar = this.s;
        onnVar.getClass();
        onnVar.h = new nnn(wlnVar);
    }

    @Override // defpackage.k24
    public final void onDetach() {
        super.onDetach();
        aln alnVar = this.x;
        onn onnVar = this.s;
        if (alnVar != null) {
            onnVar.b(alnVar.getId());
        } else {
            onnVar.b("failed_to_load");
        }
        boolean z = this.E;
        ua7 ua7Var = this.M;
        qln qlnVar = this.r;
        if (!z && this.x != null && !((dmn) ua7Var.p()).b.d) {
            if (!((ArrayList) qlnVar.j.d).contains(this.x.getId())) {
                qlnVar.f.f(this.x.getId(), new rl((byte) 4));
            }
        }
        if (!this.E) {
            SettingsManager settingsManager = this.F;
            g7j g7jVarG = settingsManager.g();
            g7j g7jVar = this.J;
            if (g7jVarG != g7jVar) {
                settingsManager.U(g7jVar, false);
            }
        }
        boolean z2 = this.x != null && this.E && qlnVar.g() && !am2.c(this.x.f()).equals(qlnVar.f());
        if (z2) {
            qlnVar.o(false);
        }
        ijm ijmVar = ijm.b;
        ysj ysjVar = this.G;
        if (z2) {
            glj gljVar = new glj(2132022338, 2500);
            ysjVar.getClass();
            ysjVar.b(gljVar, ijmVar);
        }
        if (this.E) {
            switch (((dmn) ua7Var.p()).a.ordinal()) {
                case 0:
                case 1:
                case 2:
                case 4:
                case 5:
                    return;
                case 3:
                case 6:
                case 7:
                    glj gljVar2 = new glj(2132022355, 2500);
                    ysjVar.getClass();
                    ysjVar.b(gljVar2, ijmVar);
                    return;
                default:
                    throw new RuntimeException(null, null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d8  */
    @Override // defpackage.ltl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onMenuItemClick(android.view.MenuItem r12) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jmn.onMenuItemClick(android.view.MenuItem):boolean");
    }

    @Override // defpackage.ltl
    public final void x0(itd itdVar) {
        O0();
    }

    @Override // defpackage.ltl
    public final void y0(LayoutInflater layoutInflater, StatusBarDrawingFrameLayout statusBarDrawingFrameLayout) {
        atj atjVarK;
        View viewFindViewById = statusBarDrawingFrameLayout.findViewById(2131362214);
        int i = 2131362068;
        AspectRatioLayout aspectRatioLayout = (AspectRatioLayout) w1h.j(2131362068, viewFindViewById);
        if (aspectRatioLayout != null) {
            i = 2131362178;
            LinearLayout linearLayout = (LinearLayout) w1h.j(2131362178, viewFindViewById);
            if (linearLayout != null) {
                i = 2131362179;
                Space space = (Space) w1h.j(2131362179, viewFindViewById);
                if (space != null) {
                    i = 2131362181;
                    Space space2 = (Space) w1h.j(2131362181, viewFindViewById);
                    if (space2 != null) {
                        FrameLayout frameLayout = (FrameLayout) viewFindViewById;
                        i = 2131362409;
                        FrameLayout frameLayout2 = (FrameLayout) w1h.j(2131362409, viewFindViewById);
                        if (frameLayout2 != null) {
                            i = 2131362730;
                            ConstraintLayout constraintLayoutJ = w1h.j(2131362730, viewFindViewById);
                            if (constraintLayoutJ != null) {
                                i = 2131362732;
                                if (((ImageView) w1h.j(2131362732, viewFindViewById)) != null) {
                                    i = 2131362733;
                                    if (((TextView) w1h.j(2131362733, viewFindViewById)) != null) {
                                        i = 2131362743;
                                        if (((TextView) w1h.j(2131362743, viewFindViewById)) != null) {
                                            i = 2131363893;
                                            TextView textView = (TextView) w1h.j(2131363893, viewFindViewById);
                                            if (textView != null) {
                                                i = 2131363933;
                                                View viewJ = w1h.j(2131363933, viewFindViewById);
                                                if (viewJ != null) {
                                                    i = 2131364223;
                                                    MaterialButton materialButtonJ = w1h.j(2131364223, viewFindViewById);
                                                    if (materialButtonJ != null) {
                                                        i = 2131364224;
                                                        LinearLayout linearLayout2 = (LinearLayout) w1h.j(2131364224, viewFindViewById);
                                                        if (linearLayout2 != null) {
                                                            i = 2131364225;
                                                            MaterialButton materialButtonJ2 = w1h.j(2131364225, viewFindViewById);
                                                            if (materialButtonJ2 != null) {
                                                                i = 2131364794;
                                                                LayoutDirectionToolbar layoutDirectionToolbarJ = w1h.j(2131364794, viewFindViewById);
                                                                if (layoutDirectionToolbarJ != null) {
                                                                    i = 2131364859;
                                                                    MaterialButton materialButtonJ3 = w1h.j(2131364859, viewFindViewById);
                                                                    if (materialButtonJ3 != null) {
                                                                        i = 2131364950;
                                                                        MaterialButton materialButtonJ4 = w1h.j(2131364950, viewFindViewById);
                                                                        if (materialButtonJ4 != null) {
                                                                            i = 2131365072;
                                                                            ConstraintLayout constraintLayoutJ2 = w1h.j(2131365072, viewFindViewById);
                                                                            if (constraintLayoutJ2 != null) {
                                                                                i = 2131365073;
                                                                                if (((TextView) w1h.j(2131365073, viewFindViewById)) != null) {
                                                                                    i = 2131365074;
                                                                                    OperaSwitch operaSwitch = (OperaSwitch) w1h.j(2131365074, viewFindViewById);
                                                                                    if (operaSwitch != null) {
                                                                                        this.z = new kmn(frameLayout, aspectRatioLayout, linearLayout, space, space2, frameLayout, frameLayout2, constraintLayoutJ, textView, viewJ, materialButtonJ, linearLayout2, materialButtonJ2, layoutDirectionToolbarJ, materialButtonJ3, materialButtonJ4, constraintLayoutJ2, operaSwitch);
                                                                                        Object tag = frameLayout.getTag(2131364495);
                                                                                        if (tag != null) {
                                                                                            atjVarK = (atj) tag;
                                                                                        } else {
                                                                                            Object parent = frameLayout.getParent();
                                                                                            View view = parent instanceof View ? (View) parent : null;
                                                                                            atjVarK = view != null ? xug.k(view) : null;
                                                                                        }
                                                                                        if (atjVarK == null) {
                                                                                            atjVarK = new atj(frameLayout);
                                                                                            frameLayout.setTag(2131364495, atjVarK);
                                                                                        }
                                                                                        if (atjVarK.c.add(this.z.k)) {
                                                                                            atjVarK.b();
                                                                                        }
                                                                                        ua7 ua7Var = this.M;
                                                                                        cmn cmnVar = ((dmn) ua7Var.p()).b;
                                                                                        this.P = cmnVar.c;
                                                                                        final byte b = 1;
                                                                                        final byte b2 = 0;
                                                                                        this.u = new s14(this.r, requireContext().getContentResolver(), cmnVar.a, cmnVar.b, ((dmn) ua7Var.p()).a == wln.g);
                                                                                        this.A = new w6j(this.z.j, new emn(this, (byte) 0));
                                                                                        View view2 = this.z.j;
                                                                                        r8n r8nVar = new r8n(this) { // from class: gmn
                                                                                            public final /* synthetic */ jmn b;

                                                                                            {
                                                                                                this.b = this;
                                                                                            }

                                                                                            @Override // defpackage.r8n
                                                                                            public final void a(View view3) {
                                                                                                byte b3 = b2;
                                                                                                jmn jmnVar = this.b;
                                                                                                switch (b3) {
                                                                                                    case 0:
                                                                                                        jmnVar.I0(view3);
                                                                                                        break;
                                                                                                    default:
                                                                                                        aln alnVar = jmnVar.x;
                                                                                                        if (alnVar != null) {
                                                                                                            jmnVar.N0(alnVar);
                                                                                                            break;
                                                                                                        }
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                        };
                                                                                        dll dllVarS = q9n.s(view2);
                                                                                        if (dllVarS != null) {
                                                                                            u8n.b(dllVarS, view2, r8nVar);
                                                                                        }
                                                                                        this.z.o.setOnClickListener(new View.OnClickListener(this) { // from class: hmn
                                                                                            public final /* synthetic */ jmn b;

                                                                                            {
                                                                                                this.b = this;
                                                                                            }

                                                                                            @Override // android.view.View.OnClickListener
                                                                                            public final void onClick(View view3) {
                                                                                                byte b3 = b2;
                                                                                                jmn jmnVar = this.b;
                                                                                                switch (b3) {
                                                                                                    case 0:
                                                                                                        jmnVar.I0(jmnVar.z.j);
                                                                                                        break;
                                                                                                    case 1:
                                                                                                        SettingsManager settingsManager = jmnVar.F;
                                                                                                        Context context = view3.getContext();
                                                                                                        if (jmnVar.x != null) {
                                                                                                            int i2 = jmnVar.P;
                                                                                                            if (i2 == 0 || (i2 & 1) != 0) {
                                                                                                                jmnVar.E = true;
                                                                                                                w6j w6jVar = jmnVar.A;
                                                                                                                if (w6jVar.k()) {
                                                                                                                    lkn lknVar = (lkn) w6jVar.e;
                                                                                                                    zjn zjnVar = lknVar.i;
                                                                                                                    String str = lknVar.a.a;
                                                                                                                    zjnVar.getClass();
                                                                                                                    nv6 nv6VarB = ru9.c(context).b();
                                                                                                                    SharedPreferences.Editor editor = (SharedPreferences.Editor) nv6VarB.a;
                                                                                                                    editor.putString("wallpaper.adjust.id", str);
                                                                                                                    editor.putFloat("wallpaper.adjust.scale", zjnVar.a);
                                                                                                                    editor.putFloat("wallpaper.adjust.pivotx", zjnVar.b);
                                                                                                                    editor.putFloat("wallpaper.adjust.pivoty", zjnVar.c);
                                                                                                                    nv6VarB.w();
                                                                                                                }
                                                                                                                jmnVar.r.p(jmnVar.H0(), jmnVar.x.getId());
                                                                                                                onn onnVar = jmnVar.s;
                                                                                                                aln alnVar = jmnVar.x;
                                                                                                                nnn nnnVar = onnVar.h;
                                                                                                                if (nnnVar != null) {
                                                                                                                    nnnVar.c = alnVar;
                                                                                                                }
                                                                                                                if (settingsManager.g() != jmnVar.J) {
                                                                                                                    settingsManager.V(1, "app_theme_accent_changed_by_user");
                                                                                                                }
                                                                                                            }
                                                                                                            int i3 = jmnVar.P & 6;
                                                                                                            if (i3 != 0) {
                                                                                                                kkn kknVar = i3 == 2 ? kkn.a : i3 == 4 ? kkn.b : kkn.c;
                                                                                                                jmnVar.O = true;
                                                                                                                jmnVar.J0(kknVar);
                                                                                                            }
                                                                                                            if (jmnVar.P != 0) {
                                                                                                                if (!jmnVar.N) {
                                                                                                                    jmnVar.g0();
                                                                                                                    break;
                                                                                                                }
                                                                                                            } else {
                                                                                                                jmnVar.getParentFragmentManager().Y(-1, 1, (String) null);
                                                                                                                break;
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    default:
                                                                                                        nej nejVarF = a4h.f(jmnVar.requireContext());
                                                                                                        og5 og5Var = new og5(jmnVar, (byte) 7);
                                                                                                        nejVarF.getClass();
                                                                                                        nejVarF.b(og5Var, ijm.b);
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                        });
                                                                                        this.z.k.setEnabled(false);
                                                                                        this.z.k.setOnClickListener(new View.OnClickListener(this) { // from class: hmn
                                                                                            public final /* synthetic */ jmn b;

                                                                                            {
                                                                                                this.b = this;
                                                                                            }

                                                                                            @Override // android.view.View.OnClickListener
                                                                                            public final void onClick(View view3) {
                                                                                                byte b3 = b;
                                                                                                jmn jmnVar = this.b;
                                                                                                switch (b3) {
                                                                                                    case 0:
                                                                                                        jmnVar.I0(jmnVar.z.j);
                                                                                                        break;
                                                                                                    case 1:
                                                                                                        SettingsManager settingsManager = jmnVar.F;
                                                                                                        Context context = view3.getContext();
                                                                                                        if (jmnVar.x != null) {
                                                                                                            int i2 = jmnVar.P;
                                                                                                            if (i2 == 0 || (i2 & 1) != 0) {
                                                                                                                jmnVar.E = true;
                                                                                                                w6j w6jVar = jmnVar.A;
                                                                                                                if (w6jVar.k()) {
                                                                                                                    lkn lknVar = (lkn) w6jVar.e;
                                                                                                                    zjn zjnVar = lknVar.i;
                                                                                                                    String str = lknVar.a.a;
                                                                                                                    zjnVar.getClass();
                                                                                                                    nv6 nv6VarB = ru9.c(context).b();
                                                                                                                    SharedPreferences.Editor editor = (SharedPreferences.Editor) nv6VarB.a;
                                                                                                                    editor.putString("wallpaper.adjust.id", str);
                                                                                                                    editor.putFloat("wallpaper.adjust.scale", zjnVar.a);
                                                                                                                    editor.putFloat("wallpaper.adjust.pivotx", zjnVar.b);
                                                                                                                    editor.putFloat("wallpaper.adjust.pivoty", zjnVar.c);
                                                                                                                    nv6VarB.w();
                                                                                                                }
                                                                                                                jmnVar.r.p(jmnVar.H0(), jmnVar.x.getId());
                                                                                                                onn onnVar = jmnVar.s;
                                                                                                                aln alnVar = jmnVar.x;
                                                                                                                nnn nnnVar = onnVar.h;
                                                                                                                if (nnnVar != null) {
                                                                                                                    nnnVar.c = alnVar;
                                                                                                                }
                                                                                                                if (settingsManager.g() != jmnVar.J) {
                                                                                                                    settingsManager.V(1, "app_theme_accent_changed_by_user");
                                                                                                                }
                                                                                                            }
                                                                                                            int i3 = jmnVar.P & 6;
                                                                                                            if (i3 != 0) {
                                                                                                                kkn kknVar = i3 == 2 ? kkn.a : i3 == 4 ? kkn.b : kkn.c;
                                                                                                                jmnVar.O = true;
                                                                                                                jmnVar.J0(kknVar);
                                                                                                            }
                                                                                                            if (jmnVar.P != 0) {
                                                                                                                if (!jmnVar.N) {
                                                                                                                    jmnVar.g0();
                                                                                                                    break;
                                                                                                                }
                                                                                                            } else {
                                                                                                                jmnVar.getParentFragmentManager().Y(-1, 1, (String) null);
                                                                                                                break;
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    default:
                                                                                                        nej nejVarF = a4h.f(jmnVar.requireContext());
                                                                                                        og5 og5Var = new og5(jmnVar, (byte) 7);
                                                                                                        nejVarF.getClass();
                                                                                                        nejVarF.b(og5Var, ijm.b);
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                        });
                                                                                        this.z.m.setEnabled(false);
                                                                                        final byte b3 = 2;
                                                                                        this.z.m.setOnClickListener(new View.OnClickListener(this) { // from class: hmn
                                                                                            public final /* synthetic */ jmn b;

                                                                                            {
                                                                                                this.b = this;
                                                                                            }

                                                                                            @Override // android.view.View.OnClickListener
                                                                                            public final void onClick(View view3) {
                                                                                                byte b32 = b3;
                                                                                                jmn jmnVar = this.b;
                                                                                                switch (b32) {
                                                                                                    case 0:
                                                                                                        jmnVar.I0(jmnVar.z.j);
                                                                                                        break;
                                                                                                    case 1:
                                                                                                        SettingsManager settingsManager = jmnVar.F;
                                                                                                        Context context = view3.getContext();
                                                                                                        if (jmnVar.x != null) {
                                                                                                            int i2 = jmnVar.P;
                                                                                                            if (i2 == 0 || (i2 & 1) != 0) {
                                                                                                                jmnVar.E = true;
                                                                                                                w6j w6jVar = jmnVar.A;
                                                                                                                if (w6jVar.k()) {
                                                                                                                    lkn lknVar = (lkn) w6jVar.e;
                                                                                                                    zjn zjnVar = lknVar.i;
                                                                                                                    String str = lknVar.a.a;
                                                                                                                    zjnVar.getClass();
                                                                                                                    nv6 nv6VarB = ru9.c(context).b();
                                                                                                                    SharedPreferences.Editor editor = (SharedPreferences.Editor) nv6VarB.a;
                                                                                                                    editor.putString("wallpaper.adjust.id", str);
                                                                                                                    editor.putFloat("wallpaper.adjust.scale", zjnVar.a);
                                                                                                                    editor.putFloat("wallpaper.adjust.pivotx", zjnVar.b);
                                                                                                                    editor.putFloat("wallpaper.adjust.pivoty", zjnVar.c);
                                                                                                                    nv6VarB.w();
                                                                                                                }
                                                                                                                jmnVar.r.p(jmnVar.H0(), jmnVar.x.getId());
                                                                                                                onn onnVar = jmnVar.s;
                                                                                                                aln alnVar = jmnVar.x;
                                                                                                                nnn nnnVar = onnVar.h;
                                                                                                                if (nnnVar != null) {
                                                                                                                    nnnVar.c = alnVar;
                                                                                                                }
                                                                                                                if (settingsManager.g() != jmnVar.J) {
                                                                                                                    settingsManager.V(1, "app_theme_accent_changed_by_user");
                                                                                                                }
                                                                                                            }
                                                                                                            int i3 = jmnVar.P & 6;
                                                                                                            if (i3 != 0) {
                                                                                                                kkn kknVar = i3 == 2 ? kkn.a : i3 == 4 ? kkn.b : kkn.c;
                                                                                                                jmnVar.O = true;
                                                                                                                jmnVar.J0(kknVar);
                                                                                                            }
                                                                                                            if (jmnVar.P != 0) {
                                                                                                                if (!jmnVar.N) {
                                                                                                                    jmnVar.g0();
                                                                                                                    break;
                                                                                                                }
                                                                                                            } else {
                                                                                                                jmnVar.getParentFragmentManager().Y(-1, 1, (String) null);
                                                                                                                break;
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    default:
                                                                                                        nej nejVarF = a4h.f(jmnVar.requireContext());
                                                                                                        og5 og5Var = new og5(jmnVar, (byte) 7);
                                                                                                        nejVarF.getClass();
                                                                                                        nejVarF.b(og5Var, ijm.b);
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                        });
                                                                                        Q0();
                                                                                        this.t.j(getViewLifecycleOwner(), new g9l(this, (byte) 15));
                                                                                        P0(this.z.a.getResources().getConfiguration());
                                                                                        LayoutDirectionToolbar layoutDirectionToolbar = this.z.n;
                                                                                        r8n r8nVar2 = new r8n(this) { // from class: gmn
                                                                                            public final /* synthetic */ jmn b;

                                                                                            {
                                                                                                this.b = this;
                                                                                            }

                                                                                            @Override // defpackage.r8n
                                                                                            public final void a(View view3) {
                                                                                                byte b32 = b;
                                                                                                jmn jmnVar = this.b;
                                                                                                switch (b32) {
                                                                                                    case 0:
                                                                                                        jmnVar.I0(view3);
                                                                                                        break;
                                                                                                    default:
                                                                                                        aln alnVar = jmnVar.x;
                                                                                                        if (alnVar != null) {
                                                                                                            jmnVar.N0(alnVar);
                                                                                                            break;
                                                                                                        }
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                        };
                                                                                        dll dllVarS2 = q9n.s(layoutDirectionToolbar);
                                                                                        if (dllVarS2 == null) {
                                                                                            return;
                                                                                        }
                                                                                        u8n.b(dllVarS2, layoutDirectionToolbar, r8nVar2);
                                                                                        return;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewFindViewById.getResources().getResourceName(i)));
    }
}
