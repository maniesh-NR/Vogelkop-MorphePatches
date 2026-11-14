package com.opera.android.custom_views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.opera.android.custom_views.BottomIndicatorButton;
import defpackage.ov0;
import defpackage.q9n;
import defpackage.r8n;

/* loaded from: classes.dex */
public class BottomIndicatorButton extends FrameLayout {
    public static final /* synthetic */ int c = 0;
    public final ov0 a;
    public String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomIndicatorButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        final byte b = 0;
        this.b = "";
        View viewInflate = LayoutInflater.from(context).inflate(2131558556, (ViewGroup) this, false);
        addView(viewInflate);
        int i = 2131364525;
        View view = (CircularProgressIndicator) w1h.j(2131364525, viewInflate);
        if (view != null) {
            i = 2131363485;
            TextView textView = (TextView) w1h.j(2131363485, viewInflate);
            if (textView != null) {
                this.a = new ov0((FrameLayout) viewInflate, view, textView, (byte) 5);
                r8n r8nVar = new r8n(this) { // from class: tp3
                    public final /* synthetic */ BottomIndicatorButton b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.r8n
                    public final void a(View view2) {
                        byte b2 = b;
                        BottomIndicatorButton bottomIndicatorButton = this.b;
                        switch (b2) {
                            case 0:
                                int i2 = BottomIndicatorButton.c;
                                bottomIndicatorButton.c();
                                break;
                            default:
                                int i3 = BottomIndicatorButton.c;
                                bottomIndicatorButton.b();
                                break;
                        }
                    }
                };
                q9n.e(textView, r8nVar);
                r8nVar.a(textView);
                final byte b2 = 1;
                r8n r8nVar2 = new r8n(this) { // from class: tp3
                    public final /* synthetic */ BottomIndicatorButton b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.r8n
                    public final void a(View view2) {
                        byte b22 = b2;
                        BottomIndicatorButton bottomIndicatorButton = this.b;
                        switch (b22) {
                            case 0:
                                int i2 = BottomIndicatorButton.c;
                                bottomIndicatorButton.c();
                                break;
                            default:
                                int i3 = BottomIndicatorButton.c;
                                bottomIndicatorButton.b();
                                break;
                        }
                    }
                };
                q9n.e(view, r8nVar2);
                r8nVar2.a(view);
                return;
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final boolean a() {
        return ((CircularProgressIndicator) this.a.c).getVisibility() == 0;
    }

    public final void b() {
        Context context = getContext();
        ((CircularProgressIndicator) this.a.c).f(new int[]{(!isEnabled() ? ColorStateList.valueOf(f03.t(2130971070, context, 2131100067)) : isSelected() ? ColorStateList.valueOf(f03.C(context)) : f03.F(context)).getDefaultColor()});
    }

    public final void c() {
        boolean zA = a();
        ov0 ov0Var = this.a;
        if (zA) {
            ((TextView) ov0Var.d).setText("");
            return;
        }
        Context context = getContext();
        ((TextView) ov0Var.d).setTextColor(!isEnabled() ? f03.t(2130971070, context, 2131100067) : isSelected() ? f03.C(context) : f03.F(context).getDefaultColor());
        ((TextView) ov0Var.d).setText(this.b);
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean zPerformClick = super.performClick();
        ((BottomIndicatorButtonGroup) getParent()).a(this);
        return zPerformClick;
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        c();
        b();
    }

    @Override // android.view.View
    public final void setSelected(boolean z) {
        super.setSelected(z);
        c();
        b();
    }
}
