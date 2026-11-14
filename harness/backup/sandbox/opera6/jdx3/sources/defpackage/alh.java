package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.widget.SelectableRelativeLayout;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class alh extends ak7 {
    public static final /* synthetic */ int m = 0;
    public final pt1 i;
    public wkh j;
    public p8i k;
    public final /* synthetic */ blh l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alh(final blh blhVar, pt1 pt1Var, tzi tziVar) {
        super((SelectableRelativeLayout) pt1Var.d, tziVar);
        this.l = blhVar;
        this.i = pt1Var;
        final byte b = 1;
        ((i) this).itemView.setLongClickable(true);
        final byte b2 = 0;
        ((i) this).itemView.setOnClickListener(t0h.i(new View.OnClickListener(this) { // from class: ykh
            public final /* synthetic */ alh b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                blh blhVar2 = blhVar;
                alh alhVar = this.b;
                switch (b3) {
                    case 0:
                        wkh wkhVar = alhVar.j;
                        if (wkhVar != null) {
                            ilh ilhVar = wkhVar.a;
                            if (!alhVar.b.g) {
                                blhVar2.j.K0(Collections.singletonList(ilhVar), false, false, true);
                                break;
                            } else {
                                blhVar2.d.d(ilhVar.a);
                                alhVar.h0();
                                break;
                            }
                        }
                        break;
                    default:
                        wkh wkhVar2 = alhVar.j;
                        if (wkhVar2 != null) {
                            new h0h(blhVar2, view, wkhVar2.a).p(view);
                            break;
                        }
                        break;
                }
            }
        }));
        ((i) this).itemView.setOnLongClickListener(new zkh(this, b2));
        ((StylingImageButton) pt1Var.g).setOnClickListener(new ohi(new View.OnClickListener(this) { // from class: ykh
            public final /* synthetic */ alh b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                blh blhVar2 = blhVar;
                alh alhVar = this.b;
                switch (b3) {
                    case 0:
                        wkh wkhVar = alhVar.j;
                        if (wkhVar != null) {
                            ilh ilhVar = wkhVar.a;
                            if (!alhVar.b.g) {
                                blhVar2.j.K0(Collections.singletonList(ilhVar), false, false, true);
                                break;
                            } else {
                                blhVar2.d.d(ilhVar.a);
                                alhVar.h0();
                                break;
                            }
                        }
                        break;
                    default:
                        wkh wkhVar2 = alhVar.j;
                        if (wkhVar2 != null) {
                            new h0h(blhVar2, view, wkhVar2.a).p(view);
                            break;
                        }
                        break;
                }
            }
        }, (byte) 0));
        q9n.e(((i) this).itemView, new kkf(this, (byte) 8));
    }

    @Override // defpackage.ak7, defpackage.th7
    public final void K(i iVar) {
        wkh wkhVar = this.j;
        if (wkhVar != null) {
            int i = wkhVar.b;
            int i2 = ((alh) iVar).j.b;
            blh blhVar = this.l;
            ArrayList arrayList = blhVar.h;
            ArrayList arrayList2 = blhVar.h;
            arrayList.remove(i);
            arrayList2.add(i2, Long.valueOf(this.j.a.a));
            blhVar.j.L0(arrayList2);
            int iMax = Math.max(i, i2);
            for (int iMin = Math.min(i, i2); iMin <= iMax; iMin++) {
                ((wkh) blhVar.f.get(arrayList2.get(iMin))).b = iMin;
            }
            xvj xvjVar = blhVar.e;
            int adapterPosition = getAdapterPosition();
            xvjVar.i();
            Object objF = xvjVar.f(adapterPosition);
            xvjVar.h(adapterPosition, false);
            int iB = xvjVar.b(objF, false);
            if (adapterPosition != iB) {
                xvjVar.f.S(adapterPosition, iB);
            }
        }
    }

    @Override // defpackage.yzi, defpackage.qzi
    public final void W(boolean z) {
        f0();
        h0();
    }

    @Override // defpackage.yzi
    public final void e0() {
        this.j = null;
        this.k = null;
        super.e0();
    }

    @Override // defpackage.yzi
    public final void g0(boolean z) {
        ((StylingImageButton) this.i.g).setVisibility(z ? 0 : 4);
    }

    @Override // defpackage.yzi
    public final void h0() {
        Resources resources = ((i) this).itemView.getResources();
        pt1 pt1Var = this.i;
        CharSequence text = ((StylingTextView) pt1Var.c).getText();
        ImageView imageView = this.d;
        imageView.setContentDescription(text);
        ((StylingImageButton) pt1Var.g).setContentDescription(resources.getString(2132021926, ((StylingTextView) pt1Var.b).getText()));
        if (Z()) {
            imageView.setImportantForAccessibility(2);
        } else {
            imageView.setImportantForAccessibility(1);
        }
        if (!this.b.g) {
            View view = ((i) this).itemView;
            s8 s8Var = s8.g;
            r5n.k(view, s8Var, resources.getString(2132021919, ((StylingTextView) pt1Var.c).getText()), (la) null);
            r5n.k(((i) this).itemView, s8.h, resources.getString(2132021948), (la) null);
            r5n.k(imageView, s8Var, resources.getString(2132021948), (la) null);
            return;
        }
        if (Z()) {
            s8 s8Var2 = s8.g;
            r5n.k(imageView, s8Var2, resources.getString(2132021909), (la) null);
            r5n.k(((i) this).itemView, s8Var2, resources.getString(2132021909), (la) null);
            r5n.k(((i) this).itemView, s8.h, resources.getString(2132021909), (la) null);
            return;
        }
        s8 s8Var3 = s8.g;
        r5n.k(imageView, s8Var3, resources.getString(2132021948), (la) null);
        r5n.k(((i) this).itemView, s8.h, resources.getString(2132021948), (la) null);
        r5n.k(((i) this).itemView, s8Var3, resources.getString(2132021948), (la) null);
    }
}
