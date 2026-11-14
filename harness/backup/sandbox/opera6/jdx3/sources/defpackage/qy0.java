package defpackage;

import android.content.res.Resources;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.widget.SelectableRelativeLayout;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class qy0 extends sy0 {
    public final ov0 g;
    public final jy0 h;

    public qy0(ov0 ov0Var, tzi tziVar, jy0 jy0Var) {
        super((SelectableRelativeLayout) ov0Var.b, tziVar);
        this.g = ov0Var;
        this.h = jy0Var;
        final byte b = 0;
        ((i) this).itemView.setOnClickListener(t0h.i(new View.OnClickListener(this) { // from class: py0
            public final /* synthetic */ qy0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                byte b2 = b;
                qy0 qy0Var = this.b;
                switch (b2) {
                    case 0:
                        gy0 gy0Var = (gy0) qy0Var.f;
                        if (gy0Var != null) {
                            tzi tziVar2 = qy0Var.b;
                            if (tziVar2.g) {
                                tziVar2.a.d(gy0Var.b());
                            } else {
                                nv6 nv6Var = qy0Var.h.b;
                                String strG = ((dda) nv6Var.a).L0().g(gy0Var.a);
                                if (strG != null) {
                                    vx3 vx3VarA = ay3.a(strG, lqm.c, true);
                                    vx3VarA.q = true;
                                    am2.v(vx3VarA);
                                }
                            }
                        }
                        qy0Var.h0();
                        break;
                    default:
                        gy0 gy0Var2 = (gy0) qy0Var.f;
                        if (gy0Var2 != null) {
                            qy0Var.b.a.d(gy0Var2.b());
                            qy0Var.h0();
                            break;
                        }
                        break;
                }
            }
        }));
        ((i) this).itemView.setOnLongClickListener(new zt(this, (byte) 2));
        final byte b2 = 1;
        ((StylingImageView) ov0Var.c).setOnClickListener(t0h.i(new View.OnClickListener(this) { // from class: py0
            public final /* synthetic */ qy0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                byte b22 = b2;
                qy0 qy0Var = this.b;
                switch (b22) {
                    case 0:
                        gy0 gy0Var = (gy0) qy0Var.f;
                        if (gy0Var != null) {
                            tzi tziVar2 = qy0Var.b;
                            if (tziVar2.g) {
                                tziVar2.a.d(gy0Var.b());
                            } else {
                                nv6 nv6Var = qy0Var.h.b;
                                String strG = ((dda) nv6Var.a).L0().g(gy0Var.a);
                                if (strG != null) {
                                    vx3 vx3VarA = ay3.a(strG, lqm.c, true);
                                    vx3VarA.q = true;
                                    am2.v(vx3VarA);
                                }
                            }
                        }
                        qy0Var.h0();
                        break;
                    default:
                        gy0 gy0Var2 = (gy0) qy0Var.f;
                        if (gy0Var2 != null) {
                            qy0Var.b.a.d(gy0Var2.b());
                            qy0Var.h0();
                            break;
                        }
                        break;
                }
            }
        }));
        b0(new lxh(2131232135).f(((i) this).itemView.getContext()));
    }

    @Override // defpackage.yzi, defpackage.qzi
    public final void W(boolean z) throws Resources.NotFoundException {
        f0();
        h0();
    }

    @Override // defpackage.yzi
    public final void h0() throws Resources.NotFoundException {
        Resources resources = ((i) this).itemView.getResources();
        resources.getString(2132021920);
        boolean Z = Z();
        ov0 ov0Var = this.g;
        if (Z) {
            ((StylingImageView) ov0Var.c).setImportantForAccessibility(2);
        } else {
            ((StylingImageView) ov0Var.c).setImportantForAccessibility(1);
        }
        if (!this.b.g) {
            View view = ((i) this).itemView;
            s8 s8Var = s8.g;
            r5n.k(view, s8Var, resources.getString(2132021919, ((StylingTextView) ov0Var.d).getText()), (la) null);
            r5n.k(((i) this).itemView, s8.h, resources.getString(2132021948), (la) null);
            r5n.k((StylingImageView) ov0Var.c, s8Var, resources.getString(2132021948), (la) null);
            return;
        }
        if (Z()) {
            AppCompatImageView appCompatImageView = (StylingImageView) ov0Var.c;
            s8 s8Var2 = s8.g;
            r5n.k(appCompatImageView, s8Var2, resources.getString(2132021909), (la) null);
            r5n.k(((i) this).itemView, s8Var2, resources.getString(2132021909), (la) null);
            r5n.k(((i) this).itemView, s8.h, resources.getString(2132021909), (la) null);
            return;
        }
        AppCompatImageView appCompatImageView2 = (StylingImageView) ov0Var.c;
        s8 s8Var3 = s8.g;
        r5n.k(appCompatImageView2, s8Var3, resources.getString(2132021948), (la) null);
        r5n.k(((i) this).itemView, s8.h, resources.getString(2132021948), (la) null);
        r5n.k(((i) this).itemView, s8Var3, resources.getString(2132021948), (la) null);
    }

    @Override // defpackage.sy0
    public final void j0(fy0 fy0Var) throws Resources.NotFoundException {
        gy0 gy0Var = (gy0) fy0Var;
        U();
        this.f = gy0Var;
        ((StylingTextView) this.g.d).setText(StringsKt.l0(gy0Var.c).toString());
        h0();
    }
}
