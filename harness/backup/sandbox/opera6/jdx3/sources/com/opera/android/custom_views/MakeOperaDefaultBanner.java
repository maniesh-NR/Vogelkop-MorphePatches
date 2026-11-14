package com.opera.android.custom_views;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import defpackage.dnb;
import defpackage.ei;
import defpackage.fan;
import defpackage.khh;
import defpackage.q9n;
import defpackage.sko;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/opera/android/custom_views/MakeOperaDefaultBanner;", "Landroidx/cardview/widget/CardView;", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MakeOperaDefaultBanner extends androidx.cardview.widget.CardView {
    public static final /* synthetic */ int h = 0;
    public final ei g;

    /* JADX WARN: Multi-variable type inference failed */
    public MakeOperaDefaultBanner(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968933);
        LayoutInflater.from(context).inflate(2131559015, (ViewGroup) this);
        int i = 2131362353;
        StylingImageButton stylingImageButton = (StylingImageButton) w1h.j(2131362353, this);
        if (stylingImageButton != null) {
            i = 2131363183;
            StylingImageView stylingImageView = (StylingImageView) w1h.j(2131363183, this);
            if (stylingImageView != null) {
                i = 2131364222;
                MaterialButton materialButtonJ = w1h.j(2131364222, this);
                if (materialButtonJ != null) {
                    i = 2131364710;
                    if (w1h.j(2131364710, this) != null) {
                        i = 2131363525;
                        TextView textView = (TextView) w1h.j(2131363525, this);
                        if (textView != null) {
                            i = 2131364762;
                            TextView textView2 = (TextView) w1h.j(2131364762, this);
                            if (textView2 != null) {
                                i = 2131364763;
                                TextView textView3 = (TextView) w1h.j(2131364763, this);
                                if (textView3 != null) {
                                    i = 2131364764;
                                    TextView textView4 = (TextView) w1h.j(2131364764, this);
                                    if (textView4 != null) {
                                        i = 2131364766;
                                        if (w1h.j(2131364766, this) != null) {
                                            this.g = new ei(this, stylingImageButton, stylingImageView, materialButtonJ, textView, textView2, textView3, textView4);
                                            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.s, 2130968933, 0);
                                            b(typedArrayObtainStyledAttributes.getColor(3, 0));
                                            float dimension = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
                                            i8i i8iVar = (i8i) ((androidx.cardview.widget.CardView) this).e.b;
                                            if (dimension != i8iVar.a) {
                                                i8iVar.a = dimension;
                                                i8iVar.b((Rect) null);
                                                i8iVar.invalidateSelf();
                                            }
                                            String string = typedArrayObtainStyledAttributes.getString(0);
                                            string = string == null ? "" : string;
                                            String string2 = typedArrayObtainStyledAttributes.getString(1);
                                            string2 = string2 == null ? "" : string2;
                                            String string3 = typedArrayObtainStyledAttributes.getString(2);
                                            String str = string3 != null ? string3 : "";
                                            textView2.setText(string);
                                            textView3.setText(string2);
                                            textView4.setText(str);
                                            textView.setText(sko.n(new StringBuilder(string), " ", string2, " ", str));
                                            typedArrayObtainStyledAttributes.recycle();
                                            if (!isLaidOut() || isLayoutRequested()) {
                                                addOnLayoutChangeListener(new ho3(this, (byte) 5));
                                                return;
                                            } else {
                                                d();
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
        t3p.q("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    public static boolean e(TextView textView, int i) {
        return textView.getPaint().measureText(textView.getText().toString()) > ((float) i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        int iComplexToDimensionPixelSize;
        int width = (getWidth() - getPaddingStart()) - getPaddingEnd();
        int iA = fan.a(125.0f, getResources());
        ei eiVar = this.g;
        MaterialButton materialButton = eiVar.d;
        TextView textView = (TextView) eiVar.e;
        boolean z = true;
        boolean z2 = materialButton.getMeasuredWidth() + iA <= width;
        ((StylingImageView) eiVar.f).setVisibility(z2 ? 0 : 8);
        MaterialButton materialButton2 = eiVar.d;
        if (z2) {
            iComplexToDimensionPixelSize = 0;
        } else {
            Context context = getContext();
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(2130970341, typedValue, true);
            iComplexToDimensionPixelSize = TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }
        l5b l5bVar = q9n.c;
        ViewGroup.LayoutParams layoutParams = materialButton2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams.getMarginEnd() != iComplexToDimensionPixelSize) {
                marginLayoutParams.setMarginEnd(iComplexToDimensionPixelSize);
                materialButton2.setLayoutParams(layoutParams);
            }
        }
        if (!z2) {
            iA = ((StylingImageButton) eiVar.c).getMeasuredWidth();
        }
        int i = width - iA;
        TextView textView2 = (TextView) eiVar.h;
        TextView textView3 = (TextView) eiVar.g;
        if (!e(textView, i) && !e(textView3, i) && !e(textView2, i)) {
            z = false;
        }
        ((TextView) eiVar.i).setVisibility(z ? 0 : 8);
        textView.setVisibility(!z ? 0 : 8);
        textView3.setVisibility(!z ? 0 : 8);
        textView2.setVisibility(z ? 8 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onConfigurationChanged(Configuration configuration) {
        super/*android.view.View*/.onConfigurationChanged(configuration);
        ((MakeOperaDefaultBanner) this.g.b).post(new dnb(this, (byte) 20));
    }
}
