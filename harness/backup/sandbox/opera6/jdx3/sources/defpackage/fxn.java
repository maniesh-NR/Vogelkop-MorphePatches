package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.history.g;
import com.opera.android.widget.SelectableRelativeLayout;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fxn extends exn {
    public final or2 g;
    public final ztn h;
    public final HashSet i;
    public boolean j;

    public fxn(or2 or2Var, tzi tziVar, ztn ztnVar) {
        super((SelectableRelativeLayout) or2Var.c, tziVar);
        this.g = or2Var;
        this.h = ztnVar;
        this.i = new HashSet();
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setOnClickListener(t0h.i(new pkm(this, (byte) 16)));
        }
    }

    @Override // defpackage.yzi
    public final void G(long j, boolean z) {
        g gVar;
        super.G(j, z);
        if (this.f == null || (gVar = (g) ((LinkedHashMap) this.h.g.b).get(Long.valueOf(j))) == null || !Intrinsics.a(this.f, gVar.f)) {
            return;
        }
        HashSet hashSet = this.i;
        if (z) {
            hashSet.add(Long.valueOf(j));
        } else {
            hashSet.remove(Long.valueOf(j));
        }
        o0(true);
    }

    @Override // defpackage.yzi
    public final boolean Y() {
        return false;
    }

    @Override // defpackage.yzi
    public final boolean Z() {
        return this.j;
    }

    @Override // defpackage.yzi
    public final void a0() {
        wtn wtnVar;
        super.a0();
        if (!this.e || (wtnVar = (wtn) this.f) == null) {
            return;
        }
        b0(m0(wtnVar));
    }

    @Override // defpackage.yzi
    public final void h0() {
        wtn wtnVar;
        s8 s8Var;
        ImageView imageView = this.d;
        if (imageView == null || (wtnVar = (wtn) this.f) == null) {
            return;
        }
        Resources resources = ((i) this).itemView.getResources();
        if (this.j) {
            imageView.setImportantForAccessibility(2);
        } else {
            imageView.setImportantForAccessibility(1);
        }
        boolean z = this.b.g;
        or2 or2Var = this.g;
        if (z) {
            StylingTextView stylingTextView = (StylingTextView) or2Var.f;
            StylingTextView stylingTextView2 = (StylingTextView) or2Var.f;
            imageView.setContentDescription(stylingTextView.getText());
            s8Var = s8.g;
            r5n.k(imageView, s8Var, resources.getString(2132021921, stylingTextView2.getText()), (la) null);
            r5n.k(((i) this).itemView, s8.h, resources.getString(2132021921, stylingTextView2.getText()), (la) null);
        } else {
            StylingTextView stylingTextView3 = (StylingTextView) or2Var.b;
            StylingTextView stylingTextView4 = (StylingTextView) or2Var.f;
            imageView.setContentDescription(stylingTextView3.getText());
            s8Var = s8.g;
            r5n.k(imageView, s8Var, resources.getString(2132021923, stylingTextView4.getText()), (la) null);
            r5n.k(((i) this).itemView, s8.h, resources.getString(2132021923, stylingTextView4.getText()), (la) null);
        }
        boolean z2 = wtnVar.e;
        View view = ((i) this).itemView;
        if (z2) {
            r5n.k(view, s8Var, resources.getString(2132021920), (la) null);
        } else {
            r5n.k(view, s8Var, resources.getString(2132021922), (la) null);
        }
    }

    @Override // defpackage.jxn
    public final void j0(vtn vtnVar) {
        wtn wtnVar = (wtn) vtnVar;
        U();
        this.f = wtnVar;
        Drawable drawableM0 = m0(wtnVar);
        ArrayList arrayList = wtnVar.f;
        b0(drawableM0);
        wtn wtnVar2 = (wtn) this.f;
        or2 or2Var = this.g;
        if (wtnVar2 != null) {
            ((StylingImageView) or2Var.d).setImageResource(wtnVar2.e ? 2131232032 : 2131232026);
        }
        ((StylingTextView) or2Var.f).setText(wtnVar.a);
        Resources resources = ((i) this).itemView.getResources();
        DateFormat dateFormat = ztn.m;
        long j = wtnVar.d;
        long j2 = wtnVar.c;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(14, 0);
        calendar.set(13, 0);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j2);
        calendar2.set(14, 0);
        calendar2.set(13, 0);
        boolean zEquals = calendar.equals(calendar2);
        ztn ztnVar = this.h;
        ((StylingTextView) or2Var.e).setText(zEquals ? resources.getString(2132019246, ztnVar.i.format(new Date(wtnVar.c))) : resources.getString(2132019248, ztnVar.i.format(new Date(wtnVar.d)), ztnVar.i.format(new Date(wtnVar.c))));
        ((StylingTextView) or2Var.b).setText(resources.getQuantityString(2131886140, arrayList.size(), Integer.valueOf(arrayList.size())));
        wtn wtnVar3 = (wtn) this.f;
        if (wtnVar3 != null) {
            HashSet hashSet = this.i;
            hashSet.clear();
            ArrayList arrayList2 = wtnVar3.f;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                vtn vtnVar2 = (vtn) obj;
                if (((LinkedHashSet) this.b.a.c).contains(Long.valueOf(vtnVar2.c()))) {
                    hashSet.add(Long.valueOf(vtnVar2.c()));
                }
            }
            o0(false);
        }
        ((SelectableRelativeLayout) ((i) this).itemView).d(true);
        h0();
    }

    @Override // defpackage.exn
    public final void k0() {
        vtn vtnVar = this.f;
        wtn wtnVar = (wtn) vtnVar;
        if (wtnVar != null) {
            tzi tziVar = this.b;
            if (tziVar.g) {
                if (wtnVar.e) {
                    wtn wtnVar2 = (wtn) vtnVar;
                    if (wtnVar2 == null || this.i.size() != wtnVar2.f.size()) {
                        n0();
                        return;
                    }
                    wtn wtnVar3 = (wtn) this.f;
                    if (wtnVar3 != null) {
                        ArrayList arrayList = wtnVar3.f;
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            e5d e5dVar = tziVar.a;
                            long jC = ((vtn) obj).c();
                            if (((LinkedHashSet) e5dVar.c).remove(Long.valueOf(jC))) {
                                e5dVar.c(jC, false);
                            }
                        }
                        o0(true);
                    }
                } else {
                    n0();
                }
            }
            wtn wtnVar4 = (wtn) this.f;
            if (wtnVar4 != null) {
                int adapterPosition = getAdapterPosition();
                ztn ztnVar = this.h;
                ztnVar.getClass();
                boolean z = wtnVar4.e;
                ArrayList arrayList2 = wtnVar4.f;
                HashSet hashSet = ztnVar.h;
                if (z) {
                    hashSet.remove(Long.valueOf(wtnVar4.c()));
                    wtnVar4.e = false;
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((ArrayList) ztnVar.g.d).remove(adapterPosition + 1);
                    }
                    ztnVar.notifyItemRangeRemoved(adapterPosition + 1, arrayList2.size());
                } else {
                    hashSet.add(Long.valueOf(wtnVar4.c()));
                    wtnVar4.e = true;
                    int i3 = adapterPosition + 1;
                    ((ArrayList) ztnVar.g.d).addAll(i3, arrayList2);
                    ztnVar.notifyItemRangeInserted(i3, arrayList2.size());
                }
                wtn wtnVar5 = (wtn) this.f;
                if (wtnVar5 == null) {
                    return;
                }
                ((StylingImageView) this.g.d).setImageResource(wtnVar5.e ? 2131232032 : 2131232026);
            }
        }
    }

    @Override // defpackage.exn
    public final void l0() {
        if (((wtn) this.f) == null) {
            return;
        }
        this.b.c();
        k0();
    }

    public final Drawable m0(wtn wtnVar) {
        String strValueOf = String.valueOf(wtnVar.f.size());
        Context context = ((i) this).itemView.getContext();
        g8i g8iVar = new g8i(context);
        g8iVar.c = f03.t(2130969343, context, 2131101243);
        g8iVar.e = strValueOf;
        g8iVar.g = 2131165784;
        g8iVar.f = f03.t(2130969288, context, 2131101243);
        if (wtnVar.f.size() > 99) {
            g8iVar.e = "99+";
            g8iVar.g = 2131165785;
        }
        return g8iVar.a();
    }

    public final void n0() {
        wtn wtnVar = (wtn) this.f;
        if (wtnVar == null) {
            return;
        }
        ArrayList arrayList = wtnVar.f;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            e5d e5dVar = this.b.a;
            long jC = ((vtn) obj).c();
            if (((LinkedHashSet) e5dVar.c).add(Long.valueOf(jC))) {
                e5dVar.c(jC, true);
            }
        }
        o0(true);
    }

    public final void o0(boolean z) {
        wtn wtnVar = (wtn) this.f;
        boolean z2 = wtnVar != null && this.i.size() == wtnVar.f.size();
        if (this.j == z2 && z) {
            return;
        }
        this.j = z2;
        i0(z2, z);
    }
}
