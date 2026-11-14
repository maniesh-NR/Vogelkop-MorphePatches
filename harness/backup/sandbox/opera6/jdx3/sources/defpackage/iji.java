package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.custom_views.LayoutDirectionLinearLayout;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.downloads.SaveSheet;
import com.opera.android.downloads.SaveSheet$OptionTextAreaLayout;
import com.opera.android.ui.catalog.widget.OperaChip;
import com.opera.android.ui.catalog.widget.OperaIconedMessage;
import com.opera.android.widget.SideActionsLayout;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class iji extends dej {
    public final dx3 c;
    public final eji d;
    public fji e;
    public wjh f;
    public fji g;
    public FrameLayout h;
    public View i;
    public View j;
    public View k;
    public View l;
    public View m;
    public String n;
    public rf2 o;
    public Uri p;
    public int q;
    public boolean r;
    public String s;
    public ValueAnimator t;
    public kg7 u;
    public boolean v;

    public iji(mej mejVar, dx3 dx3Var) {
        super(mejVar);
        this.d = new eji(this);
        this.c = dx3Var;
    }

    public static void J(View view, String str) {
        SaveSheet$OptionTextAreaLayout saveSheet$OptionTextAreaLayout = (SaveSheet$OptionTextAreaLayout) view.findViewById(2131364718);
        saveSheet$OptionTextAreaLayout.d(saveSheet$OptionTextAreaLayout.e, str, null);
    }

    public void A() {
    }

    public void B() {
    }

    public void C() {
    }

    public void D() {
    }

    public void E() {
    }

    public void F() {
    }

    public void G() {
    }

    public void H() {
    }

    public void I() {
    }

    public boolean K() {
        return false;
    }

    public boolean L(kg7 kg7Var) {
        return false;
    }

    public boolean M() {
        return false;
    }

    public final void N(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.h.getChildAt(0);
        viewGroup.getChildAt(0).setVisibility(0);
        int i = 1;
        if (z) {
            viewGroup.getChildAt(1).setVisibility(0);
            i = 2;
        } else {
            viewGroup.getChildAt(1).setVisibility(8);
        }
        this.q = this.b.getContext().getResources().getDimensionPixelSize(2131165615) * i;
        ViewGroup.LayoutParams layoutParams = this.h.getLayoutParams();
        layoutParams.height = this.q;
        this.h.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
        layoutParams2.height = this.q;
        viewGroup.setLayoutParams(layoutParams2);
    }

    public final void O(String str) {
        int i;
        boolean z = str != null;
        String str2 = this.s;
        boolean z2 = str2 != null;
        if (str2 == null && str == null) {
            return;
        }
        this.s = str;
        mej mejVar = this.b;
        ColorStateList colorStateListY = z ? f03.y(mejVar.getContext()) : f03.F(mejVar.getContext());
        SaveSheet$OptionTextAreaLayout saveSheet$OptionTextAreaLayout = (SaveSheet$OptionTextAreaLayout) this.i.findViewById(2131364718);
        saveSheet$OptionTextAreaLayout.d(saveSheet$OptionTextAreaLayout.f, str, colorStateListY);
        SaveSheet$OptionTextAreaLayout saveSheet$OptionTextAreaLayout2 = (SaveSheet$OptionTextAreaLayout) this.l.findViewById(2131364718);
        saveSheet$OptionTextAreaLayout2.d(saveSheet$OptionTextAreaLayout2.f, str, colorStateListY);
        if (!z2 || this.s == null) {
            S();
            int i2 = this.q;
            if (z) {
                i = 0;
            } else {
                i = i2;
                i2 = 0;
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
            this.t = valueAnimatorOfInt;
            valueAnimatorOfInt.setDuration(300L);
            this.t.addUpdateListener(new cji(this, z));
            this.t.addListener(new in8((byte) 6, this, z));
            this.h.setVisibility(0);
            this.t.start();
        }
    }

    public final void P() {
        String string = this.c.getString(2132018644);
        qxh qxhVar = string != null ? new qxh(string) : null;
        wii wiiVar = new wii(this, (byte) 2);
        gkj gkjVar = new gkj(false, false);
        gkjVar.a = null;
        gkjVar.b = null;
        gkjVar.c = null;
        gkjVar.d = null;
        gkjVar.e = null;
        gkjVar.f = null;
        gkjVar.g = null;
        gkjVar.h = wiiVar;
        gkjVar.i = null;
        gkjVar.j = null;
        gkjVar.k = 2132020155;
        gkjVar.l = 2132018111;
        gkjVar.m = 2132018645;
        gkjVar.n = true;
        gkjVar.o = qxhVar;
        z77 z77VarU = sfe.U(this.b.getContext());
        z77VarU.getClass();
        z77VarU.b(gkjVar, ijm.b);
    }

    public void R(o93 o93Var) {
        qim qimVar = this.c.o;
        Objects.requireNonNull(qimVar);
        ysj ysjVar = qimVar.e;
        ysjVar.getClass();
        ysjVar.b(o93Var, ijm.b);
    }

    public final void S() {
        boolean z = this.s == null && (!this.v || this.o.f.getText().length() > 0);
        this.i.setEnabled(z);
        this.m.setEnabled(z);
        this.l.setEnabled(z);
    }

    public final void T(boolean z) {
        Drawable drawableF;
        mej mejVar = this.b;
        if (z) {
            drawableF = sgb.F(2131232039, mejVar.getContext());
            j14.o0(drawableF, f03.W(2130969288, mejVar.getContext()));
        } else {
            drawableF = sgb.F(2131232072, mejVar.getContext());
            j14.o0(drawableF, f03.W(2130969288, mejVar.getContext()));
        }
        zg zgVar = this.o.f.i;
        zgVar.c = null;
        zgVar.d = drawableF;
        drawableF.setBounds(0, 0, drawableF.getIntrinsicWidth(), drawableF.getIntrinsicHeight());
        zgVar.L(cs5.L((TextView) zgVar.b), true);
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [android.view.View, com.opera.android.custom_views.StylingImageView] */
    public final void V() {
        mej mejVar = this.b;
        int iT = f03.t(2130969328, mejVar.getContext(), 2131101243);
        ((SideActionsLayout) this.o.g).setBackgroundColor(iT);
        ColorStateList colorStateListW = f03.W(2130969284, mejVar.getContext());
        ColorStateList colorStateListW2 = f03.W(2130969288, mejVar.getContext());
        ColorStateList colorStateListW3 = f03.W(2130969299, mejVar.getContext());
        this.o.f.setTextColor(colorStateListW);
        this.o.f.setHintTextColor(colorStateListW);
        this.o.f.setBackgroundTintList(nb6.v(2131103630, mejVar.getContext()));
        this.o.f.setHighlightColor(p37.j0(0.28f, colorStateListW.getDefaultColor()));
        OperaChip operaChip = (OperaChip) this.o.h;
        tx4 tx4Var = ((Chip) operaChip).e;
        if (tx4Var != null && tx4Var.N != colorStateListW3) {
            tx4Var.N = colorStateListW3;
            tx4Var.G0 = null;
            tx4Var.onStateChange(tx4Var.getState());
        }
        ((Chip) operaChip).e.getClass();
        operaChip.l();
        tx4 tx4Var2 = ((Chip) ((OperaChip) this.o.h)).e;
        if (tx4Var2 != null) {
            tx4Var2.T = true;
            if (tx4Var2.R != colorStateListW2) {
                tx4Var2.R = colorStateListW2;
                if (tx4Var2.V()) {
                    tx4Var2.Q.setTintList(colorStateListW2);
                }
                tx4Var2.onStateChange(tx4Var2.getState());
            }
        }
        tx4 tx4Var3 = ((Chip) ((OperaChip) this.o.h)).e;
        if (tx4Var3 != null && tx4Var3.X != colorStateListW2) {
            tx4Var3.X = colorStateListW2;
            if (tx4Var3.W()) {
                tx4Var3.V.setTintList(colorStateListW2);
            }
            tx4Var3.onStateChange(tx4Var3.getState());
        }
        ((OperaChip) this.o.h).setTextColor(colorStateListW2);
        tx4 tx4Var4 = ((Chip) ((OperaChip) this.o.h)).e;
        if (tx4Var4 != null && tx4Var4.L != colorStateListW3) {
            tx4Var4.L = colorStateListW3;
            if (tx4Var4.L0) {
                tx4Var4.y(colorStateListW3);
            }
            tx4Var4.onStateChange(tx4Var4.getState());
        }
        OperaChip operaChip2 = (OperaChip) this.o.h;
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iT);
        tx4 tx4Var5 = ((Chip) operaChip2).e;
        if (tx4Var5 != null && tx4Var5.I != colorStateListValueOf) {
            tx4Var5.I = colorStateListValueOf;
            tx4Var5.onStateChange(tx4Var5.getState());
        }
        ((StylingTextView) this.o.i).setTextColor(colorStateListW);
        MaterialButton materialButton = this.o.k;
        int defaultColor = colorStateListW.getDefaultColor();
        materialButton.setTextColor(new ColorStateList(new int[][]{f03.i, f03.j}, new int[]{f03.t(2130969263, mejVar.getContext(), 2131101243), defaultColor}));
        this.o.k.F(colorStateListW);
        ?? r1 = (StylingImageView) this.o.c;
        Context context = mejVar.getContext();
        int i = this.u.i(mejVar.getContext());
        int[][] iArr = lg7.a;
        Drawable drawableF = sgb.F(2131231297, context);
        drawableF.mutate().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
        r1.setBackground(drawableF);
        r1.setImageDrawable(this.u.h(2, mejVar.getContext()));
        T(this.o.f.isFocused());
    }

    public final void W() {
        long jB = this.e.b();
        String strH = jB > 0 ? aik.h(jB, this.b.getContext()) : null;
        J(this.i, strH);
        J(this.k, strH);
        J(this.m, strH);
        J(this.l, strH);
    }

    public final void X() {
        fji fjiVar = this.g;
        View view = this.i;
        if (fjiVar == null) {
            view.setVisibility(0);
            this.k.setVisibility(this.r ? 0 : 8);
            this.j.setVisibility(8);
            this.l.setVisibility(8);
            this.m.setVisibility(8);
            return;
        }
        view.setVisibility(8);
        this.k.setVisibility(8);
        this.j.setVisibility(0);
        this.l.setVisibility(0);
        this.m.setVisibility(0);
    }

    public final boolean Z() {
        fp1 fp1Var = this.c;
        if (!r9n.X(fp1Var) && !fr3.Q(fp1Var, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            return true;
        }
        if (!lg7.e(fp1Var, this.p)) {
            N(false);
            O(this.b.getContext().getString(2132019126));
            return false;
        }
        if ("content".equals(this.p.getScheme())) {
            O(null);
            return true;
        }
        long jB = this.e.i() ? this.e.b() : 0L;
        long jN = n(this.p.getPath());
        if (jN < 0) {
            N(true);
            O(fp1Var.getString(2132018595));
            return false;
        }
        if (jB <= jN) {
            O(null);
            return true;
        }
        N(true);
        O(fp1Var.getString(2132020041));
        return false;
    }

    @Override // defpackage.dej
    public View a(Context context) {
        final byte b = 0;
        View viewInflate = LayoutInflater.from(context).inflate(2131558673, (ViewGroup) null, false);
        int i = 2131362414;
        if (((LayoutDirectionLinearLayout) w1h.j(2131362414, viewInflate)) != null) {
            i = 2131362569;
            SaveSheet.FilenameEditText filenameEditTextJ = w1h.j(2131362569, viewInflate);
            if (filenameEditTextJ != null) {
                i = 2131362572;
                SideActionsLayout sideActionsLayout = (SideActionsLayout) w1h.j(2131362572, viewInflate);
                if (sideActionsLayout != null) {
                    i = 2131362573;
                    StylingImageView stylingImageView = (StylingImageView) w1h.j(2131362573, viewInflate);
                    if (stylingImageView != null) {
                        i = 2131362576;
                        OperaChip operaChip = (OperaChip) w1h.j(2131362576, viewInflate);
                        if (operaChip != null) {
                            i = 2131362952;
                            StylingTextView stylingTextView = (StylingTextView) w1h.j(2131362952, viewInflate);
                            if (stylingTextView != null) {
                                i = 2131363100;
                                View viewJ = w1h.j(2131363100, viewInflate);
                                if (viewJ != null) {
                                    i = 2131363217;
                                    if (((OperaIconedMessage) w1h.j(2131363217, viewInflate)) != null) {
                                        i = 2131363782;
                                        LinearLayout linearLayout = (LinearLayout) w1h.j(2131363782, viewInflate);
                                        if (linearLayout != null) {
                                            i = 2131364050;
                                            MaterialButton materialButtonJ = w1h.j(2131364050, viewInflate);
                                            if (materialButtonJ != null) {
                                                i = 2131364107;
                                                if (((LinearLayout) w1h.j(2131364107, viewInflate)) != null) {
                                                    FrameLayout frameLayout = (FrameLayout) viewInflate;
                                                    this.o = new rf2(frameLayout, filenameEditTextJ, sideActionsLayout, stylingImageView, operaChip, stylingTextView, viewJ, linearLayout, materialButtonJ, frameLayout);
                                                    final byte b2 = 1;
                                                    sideActionsLayout.h(true, false);
                                                    SaveSheet.FilenameEditText filenameEditText = this.o.f;
                                                    filenameEditText.setFocusable(false);
                                                    filenameEditText.setCursorVisible(false);
                                                    filenameEditText.setOnClickListener(new View.OnClickListener(this) { // from class: bji
                                                        public final /* synthetic */ iji b;

                                                        {
                                                            this.b = this;
                                                        }

                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view) {
                                                            byte b3 = b;
                                                            iji ijiVar = this.b;
                                                            switch (b3) {
                                                                case 0:
                                                                    ijiVar.f();
                                                                    break;
                                                                default:
                                                                    ijiVar.C();
                                                                    lcp.G(ijiVar.c, ijiVar.p, false, new vii(ijiVar, (byte) 0));
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    filenameEditText.F(new ky4(this, b2));
                                                    filenameEditText.setOnEditorActionListener(new x39(this, (byte) 1));
                                                    filenameEditText.setFilters(new InputFilter[]{new gji()});
                                                    filenameEditText.v = sideActionsLayout;
                                                    mgf mgfVar = new mgf((Object) this, (Object) filenameEditText, (byte) 23);
                                                    uk7 uk7Var = filenameEditText.q;
                                                    if (uk7Var == null) {
                                                        uk7Var = new uk7(filenameEditText);
                                                        filenameEditText.q = uk7Var;
                                                    }
                                                    uk7Var.b = mgfVar;
                                                    this.o.k.setOnClickListener(new dji(this, b));
                                                    ((OperaChip) this.o.h).setOnClickListener(new View.OnClickListener(this) { // from class: bji
                                                        public final /* synthetic */ iji b;

                                                        {
                                                            this.b = this;
                                                        }

                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view) {
                                                            byte b3 = b2;
                                                            iji ijiVar = this.b;
                                                            switch (b3) {
                                                                case 0:
                                                                    ijiVar.f();
                                                                    break;
                                                                default:
                                                                    ijiVar.C();
                                                                    lcp.G(ijiVar.c, ijiVar.p, false, new vii(ijiVar, (byte) 0));
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    return (FrameLayout) this.o.b;
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
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.dej
    public void c(hjm hjmVar) {
        this.c.getApplication().unregisterActivityLifecycleCallbacks(this.d);
        g();
        super.c(hjmVar);
    }

    public final View d(LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2) throws Resources.NotFoundException {
        View viewInflate = layoutInflater.inflate(2131558675, viewGroup, false);
        viewGroup.addView(viewInflate);
        ((ImageView) viewInflate.findViewById(2131362594)).setImageResource(i);
        SaveSheet$OptionTextAreaLayout saveSheet$OptionTextAreaLayout = (SaveSheet$OptionTextAreaLayout) viewInflate.findViewById(2131364718);
        saveSheet$OptionTextAreaLayout.d.setText(this.b.getContext().getResources().getString(i2));
        return viewInflate;
    }

    public void e(boolean z) {
        if (this.f == null) {
            R(new glj(2132018652, 2500));
            b();
            return;
        }
        q9n.I((FrameLayout) this.o.e, new hai((byte) 17));
        AppCompatImageView appCompatImageView = (StylingImageView) this.o.c;
        if (z) {
            appCompatImageView.postDelayed(new aji(this), 200L);
            return;
        }
        wjh wjhVar = this.f;
        v(wjhVar);
        wjh wjhVar2 = this.f;
        fji fjiVar = this.e;
        int i = this.u.i(this.c);
        Drawable drawable = appCompatImageView.getDrawable();
        Rect rectR = q9n.r(appCompatImageView);
        aji ajiVar = new aji(this, wjhVar);
        wjhVar2.getClass();
        BrowserActivity browserActivity = (BrowserActivity) wjhVar2.f;
        PointF pointF = new PointF(rectR.exactCenterX(), rectR.exactCenterY());
        PointF pointF2 = new PointF();
        float fWidth = rectR.width() / 2.0f;
        int i2 = BrowserActivity.E1;
        ImageView imageViewU0 = (ImageView) browserActivity.findViewById(2131362185);
        if (imageViewU0 == null) {
            imageViewU0 = browserActivity.u0();
        }
        Rect rectR2 = q9n.r(imageViewU0);
        Rect rectR3 = q9n.r(imageViewU0.getRootView());
        z43 z43Var = browserActivity.z;
        if (z43Var == null) {
            z43Var = null;
        }
        Rect rectR4 = q9n.r(z43Var.f() != null ? browserActivity.findViewById(2131362057) : browserActivity.findViewById(2131363646));
        int dimensionPixelSize = browserActivity.getResources().getDimensionPixelSize(2131166662);
        if (rectR4.height() > rectR4.width()) {
            pointF2.x = rectR2.centerX() < rectR3.centerX() ? rectR4.right + dimensionPixelSize + fWidth : (rectR4.left - dimensionPixelSize) - fWidth;
            pointF2.y = rectR2.exactCenterY();
        } else {
            boolean z2 = rectR2.centerY() < rectR3.centerY();
            pointF2.x = rectR2.exactCenterX();
            pointF2.y = z2 ? rectR4.bottom + dimensionPixelSize + fWidth : (rectR4.top - dimensionPixelSize) - fWidth;
        }
        BrowserActivity browserActivity2 = (BrowserActivity) wjhVar2.b;
        ImageView imageViewU02 = (ImageView) browserActivity.findViewById(2131362185);
        if (imageViewU02 == null) {
            imageViewU02 = browserActivity.u0();
        }
        ImageView imageView = imageViewU02;
        qim qimVar = (qim) wjhVar2.c;
        b7f b7fVar = (b7f) wjhVar2.d;
        ghf ghfVar = new ghf(wjhVar2, fjiVar, ajiVar);
        int i3 = ota.A;
        Rect rectR5 = q9n.r(imageView);
        ota otaVar = new ota(browserActivity2, drawable, pointF, pointF2, new PointF(rectR5.exactCenterX(), rectR5.exactCenterY()), imageView, fWidth, i, qimVar, b7fVar, ghfVar);
        try {
            otaVar.v.addView(otaVar, otaVar.w);
        } catch (Exception unused) {
        }
        ((HashMap) wjhVar2.e).put(fjiVar, otaVar.c);
        appCompatImageView.post(new vl9(this, appCompatImageView, (byte) 28));
        appCompatImageView.postDelayed(new vl9(this, (byte) 29), 300L);
    }

    public final void f() {
        if (this.v) {
            return;
        }
        B();
        this.v = true;
        SaveSheet.FilenameEditText filenameEditText = this.o.f;
        filenameEditText.setFocusableInTouchMode(true);
        filenameEditText.requestFocus();
        ((SideActionsLayout) this.o.g).h(false, true);
        T(true);
        ((OperaChip) this.o.h).setVisibility(4);
        this.o.k.setVisibility(0);
        ((StylingTextView) this.o.i).setVisibility(0);
        filenameEditText.setCursorVisible(true);
        String strP = p();
        String[] strArr = aik.a;
        filenameEditText.setText(ehi.a(strP));
        filenameEditText.g(null);
        String strP2 = p();
        String strD = s29.d(strP2);
        SaveSheet.FilenameEditText filenameEditText2 = this.o.f;
        filenameEditText2.setSelection(0, Math.min(filenameEditText2.length(), strP2.length() - (strD.isEmpty() ? 0 : strD.length() + 1)));
        vml.d(new q2g(this, filenameEditText, (byte) 28), this.b.getContext().getResources().getInteger(2131492999));
    }

    public void g() {
    }

    public abstract void h(Uri uri, String str);

    public void j(wii wiiVar) {
    }

    public void k(fji fjiVar, vwh vwhVar) {
    }

    public final void l(boolean z) {
        if (this.v) {
            this.v = false;
            T(false);
            ((OperaChip) this.o.h).setVisibility(0);
            this.o.k.setVisibility(4);
            ((StylingTextView) this.o.i).setVisibility(4);
            ((SideActionsLayout) this.o.g).h(true, false);
            SaveSheet.FilenameEditText filenameEditText = this.o.f;
            filenameEditText.setCursorVisible(false);
            filenameEditText.setFocusable(false);
            filenameEditText.clearFocus();
            q9n.u(filenameEditText);
            if (z) {
                this.n = filenameEditText.getText().toString();
                m(true);
            }
            filenameEditText.setText(null);
            t();
        }
    }

    public final void m(boolean z) {
        String strD = this.n;
        if (strD == null) {
            String strD2 = this.e.d();
            fji fjiVar = this.e;
            strD = strD2 != null ? fjiVar.d() : fjiVar.getFileName();
        }
        this.g = o(this.p, strD);
        if (z) {
            X();
        }
    }

    public abstract long n(String str);

    public fji o(Uri uri, String str) {
        return null;
    }

    public final String p() {
        String str = this.n;
        return str != null ? str : this.e.getFileName();
    }

    public fji q(Uri uri) {
        return null;
    }

    public final void r(fji fjiVar, wjh wjhVar) throws Resources.NotFoundException {
        mej mejVar = this.b;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(mejVar.getContext());
        this.e = fjiVar;
        this.f = wjhVar;
        ViewGroup viewGroup = (LinearLayout) this.o.d;
        byte b = 1;
        if (M()) {
            d(layoutInflaterFrom, viewGroup, 2131232184, 2132020519).setOnClickListener(new dji(this, b));
        }
        View viewD = d(layoutInflaterFrom, viewGroup, 2131232167, 2132018716);
        this.k = viewD;
        viewD.setOnClickListener(new dji(this, (byte) 4));
        View viewD2 = d(layoutInflaterFrom, viewGroup, 2131232067, 2132018591);
        Intent intent = null;
        viewD2.setOnClickListener(new lte(this, intent, b));
        this.i = viewD2;
        View viewD3 = d(layoutInflaterFrom, viewGroup, 2131232167, 2132018716);
        this.j = viewD3;
        viewD3.setOnClickListener(new dji(this, (byte) 5));
        byte b2 = 2;
        if (K()) {
            d(layoutInflaterFrom, viewGroup, 2131231724, 2132017628).setOnClickListener(new dji(this, b2));
        }
        byte b3 = 3;
        wii wiiVar = new wii(this, b3);
        View viewD4 = d(layoutInflaterFrom, viewGroup, 2131232212, 2132018607);
        viewD4.setOnClickListener(new lte(this, wiiVar, b));
        this.m = viewD4;
        wii wiiVar2 = new wii(this, (byte) 0);
        View viewD5 = d(layoutInflaterFrom, viewGroup, 2131232067, 2132018614);
        viewD5.setOnClickListener(new lte(this, wiiVar2, b));
        this.l = viewD5;
        LinearLayout linearLayout = new LinearLayout(mejVar.getContext());
        linearLayout.setOrientation(1);
        d(layoutInflaterFrom, linearLayout, 2131232145, 2132018206).setOnClickListener(new dji(this, (byte) 6));
        Context context = mejVar.getContext();
        int[][] iArr = lg7.a;
        Intent intent2 = new Intent("android.settings.INTERNAL_STORAGE_SETTINGS");
        if (context.getApplicationContext().getPackageManager().queryIntentActivities(intent2, 0).size() > 0) {
            intent2.setFlags(268435456);
            intent = intent2;
        }
        if (intent != null) {
            d(layoutInflaterFrom, linearLayout, 2131232064, 2132020898).setOnClickListener(new lte(this, intent, b2));
        }
        FrameLayout frameLayout = new FrameLayout(mejVar.getContext());
        this.h = frameLayout;
        frameLayout.setVisibility(8);
        this.h.addView(linearLayout, new FrameLayout.LayoutParams(-1, 0, 48));
        viewGroup.addView(this.h, new ViewGroup.LayoutParams(-1, 0));
        d(layoutInflaterFrom, viewGroup, 2131232034, 2132018111).setOnClickListener(new dji(this, b3));
        String[] strArr = OperaApplication.K;
        fp1 fp1Var = this.c;
        Uri uriM = ((OperaApplication) fp1Var.getApplicationContext()).J().m();
        if (!lg7.e(fp1Var, uriM)) {
            uriM = Uri.fromFile(s29.c());
        }
        this.p = uriM;
        W();
        m(false);
        if (this.g != null) {
            this.n = this.e.d();
        }
        t();
        ((OperaChip) this.o.h).setText(v61.b(mejVar.getContext(), this.p));
        this.r = L(this.u);
        X();
        fp1Var.getApplication().registerActivityLifecycleCallbacks(this.d);
        SideActionsLayout sideActionsLayout = (SideActionsLayout) this.o.g;
        kkf kkfVar = new kkf(this, (byte) 12);
        dll dllVarS = q9n.s(sideActionsLayout);
        if (dllVarS == null) {
            return;
        }
        u8n.b(dllVarS, sideActionsLayout, kkfVar);
    }

    public void s(gg7 gg7Var) {
        gg7Var.run();
    }

    public final void t() {
        SaveSheet.FilenameEditText filenameEditText = this.o.f;
        String strP = p();
        String[] strArr = aik.a;
        filenameEditText.g(ehi.a(strP));
        String strP2 = p();
        String strC = this.e.c();
        int[][] iArr = lg7.a;
        this.u = lg7.g(c5o.m().o(strP2, strC));
        V();
    }

    public void u() {
    }

    public void v(wjh wjhVar) {
    }

    public void w(Context context, wii wiiVar) {
    }

    public void y() {
    }

    public void z() {
    }
}
