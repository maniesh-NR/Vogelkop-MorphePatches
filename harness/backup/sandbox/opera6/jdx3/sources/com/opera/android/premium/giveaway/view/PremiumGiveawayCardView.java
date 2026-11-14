package com.opera.android.premium.giveaway.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import com.opera.android.ui.catalog.widget.OperaTextView;
import defpackage.khh;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/opera/android/premium/giveaway/view/PremiumGiveawayCardView;", "Landroidx/cardview/widget/CardView;", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PremiumGiveawayCardView extends CardView {
    /* JADX WARN: Multi-variable type inference failed */
    public PremiumGiveawayCardView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(2131559231, (ViewGroup) this);
        int i = 2131362250;
        ImageView imageView = (ImageView) w1h.j(2131362250, this);
        if (imageView != null) {
            i = 2131362251;
            OperaTextView operaTextViewJ = w1h.j(2131362251, this);
            if (operaTextViewJ != null) {
                i = 2131362252;
                OperaTextView operaTextViewJ2 = w1h.j(2131362252, this);
                if (operaTextViewJ2 != null) {
                    ((CardView) ((CardView) this).e.c).setElevation(0.0f);
                    if (attributeSet != null) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.A, 0, 0);
                        if (typedArrayObtainStyledAttributes.hasValue(1)) {
                            imageView.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(1));
                        }
                        if (typedArrayObtainStyledAttributes.hasValue(0)) {
                            imageView.setBackground(typedArrayObtainStyledAttributes.getDrawable(0));
                        }
                        operaTextViewJ2.setText(typedArrayObtainStyledAttributes.getString(3));
                        operaTextViewJ.setText(typedArrayObtainStyledAttributes.getString(2));
                        typedArrayObtainStyledAttributes.recycle();
                        return;
                    }
                    return;
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }
}
