package com.opera.android.ui.catalog.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import defpackage.ei;
import defpackage.ixh;
import defpackage.ohh;
import defpackage.xkf;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/opera/android/ui/catalog/widget/OperaIconedMessage;", "Landroid/widget/LinearLayout;", "xkf", "catalog"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OperaIconedMessage extends LinearLayout {
    public final ei a;
    public int b;
    public int c;

    public OperaIconedMessage(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130970477);
        LayoutInflater.from(context).inflate(2131559181, this);
        int i = 2131362222;
        LinearLayout linearLayout = (LinearLayout) w1h.j(2131362222, this);
        if (linearLayout != null) {
            i = 2131362414;
            LinearLayout linearLayout2 = (LinearLayout) w1h.j(2131362414, this);
            if (linearLayout2 != null) {
                i = 2131362594;
                ImageView imageView = (ImageView) w1h.j(2131362594, this);
                if (imageView != null) {
                    i = 2131363509;
                    TextView textView = (TextView) w1h.j(2131363509, this);
                    if (textView != null) {
                        i = 2131363659;
                        MaterialButton materialButtonJ = w1h.j(2131363659, this);
                        if (materialButtonJ != null) {
                            i = 2131363917;
                            MaterialButton materialButtonJ2 = w1h.j(2131363917, this);
                            if (materialButtonJ2 != null) {
                                i = 2131363525;
                                TextView textView2 = (TextView) w1h.j(2131363525, this);
                                if (textView2 != null) {
                                    this.a = new ei(this, linearLayout, linearLayout2, imageView, textView, materialButtonJ, materialButtonJ2, textView2);
                                    setOrientation(0);
                                    setBackgroundResource(2131233190);
                                    int iK = new ixh(16.0f).k(context);
                                    setPadding(iK, iK, iK, iK);
                                    j06 j06Var = xkf.b;
                                    TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ohh.a, 2130970477, 0);
                                    j06Var.getClass();
                                    j06.h(this, typedArrayObtainStyledAttributes);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    public final void a(String str) {
        ((TextView) this.a.i).setText(str);
    }

    public final void b(View.OnClickListener onClickListener) {
        this.a.g.setOnClickListener(onClickListener);
    }

    public final void c() {
        ei eiVar = this.a;
        MaterialButton materialButton = (MaterialButton) eiVar.f;
        MaterialButton materialButton2 = eiVar.g;
        boolean zIsEmpty = TextUtils.isEmpty(materialButton.getText());
        ((MaterialButton) eiVar.f).setVisibility(!zIsEmpty ? 0 : 8);
        boolean zIsEmpty2 = TextUtils.isEmpty(materialButton2.getText());
        materialButton2.setVisibility(!zIsEmpty2 ? 0 : 8);
        ((LinearLayout) eiVar.c).setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ei eiVar = this.a;
        if (((ImageView) eiVar.e).getVisibility() == 0) {
            ImageView imageView = (ImageView) eiVar.e;
            imageView.offsetTopAndBottom((getPaddingTop() + this.b) - imageView.getTop());
            LinearLayout linearLayout = (LinearLayout) eiVar.d;
            linearLayout.offsetTopAndBottom((getPaddingTop() + this.c) - linearLayout.getTop());
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.b = 0;
        this.c = 0;
        ei eiVar = this.a;
        ImageView imageView = (ImageView) eiVar.e;
        ImageView imageView2 = (ImageView) eiVar.e;
        TextView textView = (TextView) eiVar.h;
        if (imageView.getVisibility() == 0) {
            if (textView.getVisibility() != 0) {
                textView = (TextView) eiVar.i;
            }
            Layout layout = textView.getLayout();
            if (layout != null) {
                int lineBottom = (layout.getLineBottom(0) + layout.getLineTop(0)) / 2;
                int measuredHeight = imageView2.getMeasuredHeight() / 2;
                this.b = Math.max(0, lineBottom - measuredHeight);
                this.c = Math.max(0, measuredHeight - lineBottom);
                setMeasuredDimension(getMeasuredWidth(), View.resolveSize(Math.max(getPaddingBottom() + getPaddingTop() + Math.max(imageView2.getMeasuredHeight() + this.b, ((LinearLayout) eiVar.d).getMeasuredHeight() + this.c), getSuggestedMinimumHeight()), i2));
            }
        }
    }
}
