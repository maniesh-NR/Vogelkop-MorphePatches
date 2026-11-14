package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.AutoResizeTextView;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.history.g;
import com.opera.android.history.h;
import com.opera.android.widget.SelectableRelativeLayout;
import java.util.Date;

/* loaded from: classes.dex */
public final class hxn extends exn {
    public final pt1 g;
    public final ztn h;

    public hxn(pt1 pt1Var, tzi tziVar, ztn ztnVar) {
        super((SelectableRelativeLayout) pt1Var.d, tziVar);
        this.g = pt1Var;
        this.h = ztnVar;
        final byte b = 0;
        ((StylingImageButton) pt1Var.e).setOnClickListener(t0h.i(new View.OnClickListener(this) { // from class: gxn
            public final /* synthetic */ hxn b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                byte b2 = b;
                hxn hxnVar = this.b;
                switch (b2) {
                    case 0:
                        g gVar = (g) hxnVar.f;
                        if (gVar != null) {
                            ztn ztnVar2 = hxnVar.h;
                            ztnVar2.getClass();
                            new h(ztnVar2, gVar).p(view);
                            break;
                        }
                        break;
                    default:
                        g gVar2 = (g) hxnVar.f;
                        if (gVar2 != null) {
                            hxnVar.b.a.d(gVar2.b.getId());
                            hxnVar.h0();
                            break;
                        }
                        break;
                }
            }
        }));
        final byte b2 = 1;
        ((FrameLayout) pt1Var.b).setOnClickListener(t0h.i(new View.OnClickListener(this) { // from class: gxn
            public final /* synthetic */ hxn b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                byte b22 = b2;
                hxn hxnVar = this.b;
                switch (b22) {
                    case 0:
                        g gVar = (g) hxnVar.f;
                        if (gVar != null) {
                            ztn ztnVar2 = hxnVar.h;
                            ztnVar2.getClass();
                            new h(ztnVar2, gVar).p(view);
                            break;
                        }
                        break;
                    default:
                        g gVar2 = (g) hxnVar.f;
                        if (gVar2 != null) {
                            hxnVar.b.a.d(gVar2.b.getId());
                            hxnVar.h0();
                            break;
                        }
                        break;
                }
            }
        }));
    }

    @Override // defpackage.yzi, defpackage.qzi
    public final void W(boolean z) throws Resources.NotFoundException {
        f0();
        h0();
    }

    @Override // defpackage.yzi
    public final void g0(boolean z) {
        View viewFindViewById = ((i) this).itemView.findViewById(2131363128);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(z ? 0 : 4);
        }
    }

    @Override // defpackage.yzi
    public final void h0() throws Resources.NotFoundException {
        Resources resources = ((i) this).itemView.getResources();
        resources.getString(2132021920);
        pt1 pt1Var = this.g;
        AppCompatImageView appCompatImageView = (StylingImageButton) pt1Var.e;
        AutoResizeTextView autoResizeTextView = (AutoResizeTextView) pt1Var.f;
        StylingTextView stylingTextView = (StylingTextView) pt1Var.g;
        appCompatImageView.setContentDescription(resources.getString(2132021926, stylingTextView.getText()));
        boolean Z = Z();
        FrameLayout frameLayout = (FrameLayout) pt1Var.b;
        if (Z) {
            frameLayout.setImportantForAccessibility(2);
        } else {
            frameLayout.setImportantForAccessibility(1);
        }
        if (!this.b.g) {
            View view = ((i) this).itemView;
            s8 s8Var = s8.g;
            r5n.k(view, s8Var, resources.getString(2132021919, stylingTextView.getText()), (la) null);
            r5n.k(((i) this).itemView, s8.h, resources.getString(2132021948), (la) null);
            frameLayout.setContentDescription(autoResizeTextView.getText());
            r5n.k(frameLayout, s8Var, resources.getString(2132021948), (la) null);
            return;
        }
        if (Z()) {
            r5n.k(((i) this).itemView, s8.g, resources.getString(2132021909), (la) null);
            r5n.k(((i) this).itemView, s8.h, resources.getString(2132021909), (la) null);
            return;
        }
        frameLayout.setContentDescription(autoResizeTextView.getText());
        s8 s8Var2 = s8.g;
        r5n.k(frameLayout, s8Var2, resources.getString(2132021948), (la) null);
        r5n.k(((i) this).itemView, s8.h, resources.getString(2132021948), (la) null);
        r5n.k(((i) this).itemView, s8Var2, resources.getString(2132021948), (la) null);
    }

    @Override // defpackage.yzi
    public final void i0(boolean z, boolean z2) {
        super.i0(z, z2);
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
        ((AutoResizeTextView) this.g.f).setVisibility(z ? 4 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jxn
    public final void j0(vtn vtnVar) throws Resources.NotFoundException, NumberFormatException {
        g gVar = (g) vtnVar;
        U();
        this.f = gVar;
        pt1 pt1Var = this.g;
        ((AutoResizeTextView) pt1Var.f).setText(this.h.i.format(new Date(gVar.b.b())));
        CharSequence charSequenceG = (String) gVar.e.get();
        String strE = wqm.e((String) gVar.d.get());
        if (TextUtils.isEmpty(charSequenceG)) {
            charSequenceG = aik.g(strE);
        }
        ((StylingTextView) pt1Var.c).setText(charSequenceG);
        String strP = aik.p(strE);
        if (strP.length() > 1024) {
            strP = strP.substring(Character.isLowSurrogate(strP.charAt(0)) ? 1 : 0, Character.isHighSurrogate(strP.charAt(1023)) ? 1023 : 1024).concat("…");
        }
        ((StylingTextView) pt1Var.g).setText(strP);
        h0();
    }

    @Override // defpackage.exn
    public final void k0() {
        g gVar = (g) this.f;
        if (gVar != null) {
            tzi tziVar = this.b;
            if (tziVar.g) {
                tziVar.a.d(gVar.b.getId());
                return;
            }
            ga6 ga6Var = this.h.c;
            String strG = ((dda) ga6Var.b).L0().g(gVar.a);
            if (strG == null) {
                return;
            }
            vx3 vx3VarA = ay3.a(strG, lqm.c, true);
            vx3VarA.q = false;
            am2.v(vx3VarA);
        }
    }
}
