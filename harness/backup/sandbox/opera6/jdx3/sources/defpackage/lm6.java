package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import com.opera.android.custom_views.DialogTitle;
import com.opera.android.custom_views.OperaButtonBarLayout;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;

/* loaded from: classes.dex */
public final class lm6 extends dej {
    public final yl6 c;
    public final boolean d;
    public final gm6 e;

    public lm6(mej mejVar, yl6 yl6Var, boolean z, gm6 gm6Var) {
        super(mejVar);
        this.c = yl6Var;
        this.d = z;
        this.e = gm6Var;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaMaterialButton] */
    /* JADX WARN: Type inference failed for: r11v1, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaMaterialButton] */
    /* JADX WARN: Type inference failed for: r12v1, types: [android.widget.TextView, com.opera.android.custom_views.DialogTitle] */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.widget.TextView, com.opera.android.custom_views.StylingTextView] */
    @Override // defpackage.dej
    public final View a(Context context) {
        final byte b = 0;
        View viewInflate = LayoutInflater.from(context).inflate(2131558643, (ViewGroup) null, false);
        int i = 2131362124;
        View viewJ = w1h.j(2131362124, viewInflate);
        if (viewJ != null) {
            zt5 zt5VarA = zt5.a(viewJ);
            i = 2131362125;
            FrameLayout frameLayout = (FrameLayout) w1h.j(2131362125, viewInflate);
            if (frameLayout != null) {
                i = 2131362230;
                if (((OperaButtonBarLayout) w1h.j(2131362230, viewInflate)) != null) {
                    i = 2131363509;
                    ?? r9 = (StylingTextView) w1h.j(2131363509, viewInflate);
                    if (r9 != 0) {
                        i = 2131363659;
                        ?? r10 = (OperaMaterialButton) w1h.j(2131363659, viewInflate);
                        if (r10 != 0) {
                            i = 2131363917;
                            ?? r11 = (OperaMaterialButton) w1h.j(2131363917, viewInflate);
                            if (r11 != 0) {
                                i = 2131364511;
                                if (((Space) w1h.j(2131364511, viewInflate)) != null) {
                                    i = 2131363525;
                                    ?? r12 = (DialogTitle) w1h.j(2131363525, viewInflate);
                                    if (r12 != 0) {
                                        LinearLayout linearLayout = (LinearLayout) viewInflate;
                                        kf kfVar = new kf(linearLayout, zt5VarA, frameLayout, (StylingTextView) r9, (OperaMaterialButton) r10, (OperaMaterialButton) r11, (DialogTitle) r12);
                                        String string = context.getString(2132017591);
                                        xf8.j0(fsp.m(linearLayout), linearLayout, new wj(kfVar, this, (byte) 2));
                                        zt5VarA.c.setText(context.getString(2132018516, string));
                                        mej mejVar = this.b;
                                        Context context2 = mejVar.getContext();
                                        r12.setText(this.d ? context2.getString(2132018520, string) : context2.getString(2132018518, string));
                                        Context context3 = mejVar.getContext();
                                        yl6 yl6Var = this.c;
                                        r9.setText(yl6Var.c() ? context3.getString(2132018525, string) : yl6Var.b() ? context3.getString(2132018522, string) : context3.getString(2132018521, string));
                                        final gm6 gm6Var = this.e;
                                        r11.setOnClickListener(new View.OnClickListener() { // from class: fm6
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                byte b2 = b;
                                                lm6 lm6Var = this;
                                                gm6 gm6Var2 = gm6Var;
                                                switch (b2) {
                                                    case 0:
                                                        gm6Var2.q();
                                                        lm6Var.b();
                                                        break;
                                                    default:
                                                        gm6Var2.z();
                                                        lm6Var.b();
                                                        break;
                                                }
                                            }
                                        });
                                        final byte b2 = 1;
                                        r10.setOnClickListener(new View.OnClickListener() { // from class: fm6
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                byte b22 = b2;
                                                lm6 lm6Var = this;
                                                gm6 gm6Var2 = gm6Var;
                                                switch (b22) {
                                                    case 0:
                                                        gm6Var2.q();
                                                        lm6Var.b();
                                                        break;
                                                    default:
                                                        gm6Var2.z();
                                                        lm6Var.b();
                                                        break;
                                                }
                                            }
                                        });
                                        return linearLayout;
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
}
