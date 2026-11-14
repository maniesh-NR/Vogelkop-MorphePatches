package defpackage;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.opera.android.custom_views.EqualWidthLinearLayout;
import com.opera.android.custom_views.OperaTextInputEditText;
import com.opera.android.custom_views.StylingImageRadio;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class nen extends nz0 implements f7f {
    public final wtm a;
    public final ysj b;
    public final ColorMatrixColorFilter c;
    public final AnimationSet d;
    public zu e;
    public List f;
    public Button g;

    public nen(wtm wtmVar, ysj ysjVar) {
        super(true, false);
        this.a = wtmVar;
        this.b = ysjVar;
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setScale(1.0f, 1.0f, 1.0f, 0.6f);
        ColorMatrix colorMatrix2 = new ColorMatrix();
        colorMatrix2.setSaturation(0.0f);
        colorMatrix.postConcat(colorMatrix2);
        this.c = new ColorMatrixColorFilter(colorMatrix);
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.8f, 1.0f, 0.8f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(100L);
        scaleAnimation.setInterpolator(lf1.k);
        animationSet.addAnimation(scaleAnimation);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, 1.75f, 1.0f, 1.75f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(110L);
        scaleAnimation2.setStartOffset(100L);
        scaleAnimation2.setInterpolator(lf1.m);
        animationSet.addAnimation(scaleAnimation2);
        ScaleAnimation scaleAnimation3 = new ScaleAnimation(1.0f, 0.71428573f, 1.0f, 0.71428573f, 1, 0.5f, 1, 0.5f);
        scaleAnimation3.setDuration(240L);
        scaleAnimation3.setStartOffset(210L);
        scaleAnimation3.setInterpolator(lf1.h);
        animationSet.addAnimation(scaleAnimation3);
        this.d = animationSet;
    }

    public final void d0(Object obj) {
        pen penVar = (pen) obj;
        Integer num = penVar.a;
        CharSequence charSequence = penVar.b;
        List<AppCompatImageView> list = this.f;
        if (num != null) {
            int iIntValue = num.intValue();
            if (list == null) {
                list = null;
            }
            for (AppCompatImageView appCompatImageView : list) {
                if (Intrinsics.a(appCompatImageView.getTag(), Integer.valueOf(iIntValue))) {
                    appCompatImageView.setChecked(true);
                    appCompatImageView.clearColorFilter();
                    appCompatImageView.startAnimation(this.d);
                } else {
                    appCompatImageView.clearAnimation();
                    appCompatImageView.setChecked(false);
                    appCompatImageView.setColorFilter(this.c);
                }
            }
        } else {
            if (list == null) {
                list = null;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((njk) it.next()).clearColorFilter();
            }
        }
        Button button = this.g;
        if (button == null) {
            button = null;
        }
        button.setEnabled(penVar.d);
        zu zuVar = this.e;
        if (zuVar == null) {
            zuVar = null;
        }
        zuVar.d.setVisibility(penVar.c ? 0 : 8);
        zu zuVar2 = this.e;
        TextInputEditText textInputEditText = (zuVar2 != null ? zuVar2 : null).c;
        if (!TextUtils.equals(textInputEditText.getText(), charSequence)) {
            textInputEditText.setText(charSequence);
        }
        eb8 eb8Var = penVar.e;
        if (eb8Var == null || eb8Var.b) {
            return;
        }
        eb8Var.b = true;
        ysj ysjVar = this.b;
        ysjVar.b(am2.i(2132022205, 2500, ysjVar), ijm.b);
    }

    @Override // defpackage.nz0
    public final String getNegativeButtonText(Context context) {
        return context.getString(2132018111);
    }

    @Override // defpackage.nz0
    public final String getPositiveButtonText(Context context) {
        return context.getString(2132021651);
    }

    @Override // defpackage.nz0
    public final int getTheme() {
        return 2132083346;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [android.view.View, com.opera.android.custom_views.StylingImageRadio, njk] */
    @Override // defpackage.nz0
    public final void onCreateDialog(az0 az0Var) {
        int i = 0;
        View viewInflate = LayoutInflater.from(az0Var.getContext()).inflate(2131559530, (ViewGroup) null, false);
        int i2 = 2131363999;
        EqualWidthLinearLayout equalWidthLinearLayout = (EqualWidthLinearLayout) w1h.j(2131363999, viewInflate);
        if (equalWidthLinearLayout != null) {
            i2 = 2131364979;
            OperaTextInputEditText operaTextInputEditText = (OperaTextInputEditText) w1h.j(2131364979, viewInflate);
            if (operaTextInputEditText != null) {
                i2 = 2131364980;
                TextInputLayout textInputLayoutJ = w1h.j(2131364980, viewInflate);
                if (textInputLayoutJ != null) {
                    this.e = new zu((LinearLayout) viewInflate, equalWidthLinearLayout, operaTextInputEditText, textInputLayoutJ);
                    List listG = y1j.g(y1j.c(new g6n(equalWidthLinearLayout), u91.r));
                    for (Object obj : listG) {
                        int i3 = i + 1;
                        if (i < 0) {
                            j95.n();
                            throw null;
                        }
                        ?? r4 = (StylingImageRadio) obj;
                        r4.setTag(Integer.valueOf(i3));
                        r4.l = this;
                        i = i3;
                    }
                    this.f = listG;
                    zu zuVar = this.e;
                    if (zuVar == null) {
                        zuVar = null;
                    }
                    zuVar.c.addTextChangedListener(new h63((Object) this, (byte) 10));
                    az0Var.b(2132022206);
                    az0Var.a(2132022203);
                    zu zuVar2 = this.e;
                    az0Var.setView((zuVar2 != null ? zuVar2 : null).b);
                    return;
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // defpackage.nz0
    public final void onDismissDialog(bz0 bz0Var, hjm hjmVar) {
        ((h42) this.a.b).p(this);
    }

    @Override // defpackage.d63
    public final void onFinished(hjm hjmVar) {
        if (hjmVar == hjm.b) {
            wtm wtmVar = this.a;
            ((kze) wtmVar.c).r(oen.d);
            wtmVar.f(vb0.d);
        }
    }

    @Override // defpackage.nz0
    public final void onNegativeButtonClicked(bz0 bz0Var) {
        wtm wtmVar = this.a;
        ((kze) wtmVar.c).r(oen.d);
        wtmVar.f(vb0.c);
    }

    @Override // defpackage.nz0
    public final void onPositiveButtonClicked(bz0 bz0Var) {
        wtm wtmVar = this.a;
        kze kzeVar = (kze) wtmVar.c;
        kzeVar.r(oen.a((oen) kzeVar.g(), null, null, 3));
        wtmVar.f(vb0.b);
    }

    @Override // defpackage.nz0
    public final void onShowDialog(bz0 bz0Var) {
        this.g = bz0Var.f(-1);
        ((h42) this.a.b).k(this);
    }
}
