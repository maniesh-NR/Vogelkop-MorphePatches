package com.opera.android.premium.ui.view;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.rvg;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/opera/android/premium/ui/view/PremiumPricingCard;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/widget/Checkable;", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PremiumPricingCard extends ConstraintLayout implements Checkable {
    public static final int[] r = {R.attr.state_checked};
    public boolean p;
    public final rvg q;

    /* JADX WARN: Multi-variable type inference failed */
    public PremiumPricingCard(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(2131559239, (ViewGroup) this);
        int i = 2131362112;
        View viewJ = w1h.j(2131362112, this);
        if (viewJ != null) {
            i = 2131362121;
            TextView textView = (TextView) w1h.j(2131362121, this);
            if (textView != null) {
                i = 2131362463;
                TextView textView2 = (TextView) w1h.j(2131362463, this);
                if (textView2 != null) {
                    i = 2131362464;
                    TextView textView3 = (TextView) w1h.j(2131362464, this);
                    if (textView3 != null) {
                        i = 2131362465;
                        TextView textView4 = (TextView) w1h.j(2131362465, this);
                        if (textView4 != null) {
                            i = 2131362466;
                            if (w1h.j(2131362466, this) != null) {
                                i = 2131362701;
                                if (w1h.j(2131362701, this) != null) {
                                    i = 2131363296;
                                    TextView textView5 = (TextView) w1h.j(2131363296, this);
                                    if (textView5 != null) {
                                        i = 2131363297;
                                        TextView textView6 = (TextView) w1h.j(2131363297, this);
                                        if (textView6 != null) {
                                            i = 2131363298;
                                            if (w1h.j(2131363298, this) != null) {
                                                i = 2131363299;
                                                if (((TextView) w1h.j(2131363299, this)) != null) {
                                                    i = 2131363306;
                                                    TextView textView7 = (TextView) w1h.j(2131363306, this);
                                                    if (textView7 != null) {
                                                        i = 2131363307;
                                                        TextView textView8 = (TextView) w1h.j(2131363307, this);
                                                        if (textView8 != null) {
                                                            i = 2131363308;
                                                            TextView textView9 = (TextView) w1h.j(2131363308, this);
                                                            if (textView9 != null) {
                                                                i = 2131363309;
                                                                Flow flowJ = w1h.j(2131363309, this);
                                                                if (flowJ != null) {
                                                                    i = 2131363705;
                                                                    TextView textView10 = (TextView) w1h.j(2131363705, this);
                                                                    if (textView10 != null) {
                                                                        i = 2131363944;
                                                                        if (w1h.j(2131363944, this) != null) {
                                                                            i = 2131363945;
                                                                            if (((Space) w1h.j(2131363945, this)) != null) {
                                                                                i = 2131363995;
                                                                                ImageView imageView = (ImageView) w1h.j(2131363995, this);
                                                                                if (imageView != null) {
                                                                                    i = 2131364852;
                                                                                    TextView textView11 = (TextView) w1h.j(2131364852, this);
                                                                                    if (textView11 != null) {
                                                                                        this.q = new rvg(this, viewJ, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, flowJ, textView10, imageView, textView11);
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
        t3p.q("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int[] onCreateDrawableState(int i) {
        return this.p ? View.mergeDrawableStates(super/*android.view.View*/.onCreateDrawableState(i + 1), r) : super/*android.view.View*/.onCreateDrawableState(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (z == this.p) {
            return;
        }
        this.p = z;
        refreshDrawableState();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.p);
    }
}
