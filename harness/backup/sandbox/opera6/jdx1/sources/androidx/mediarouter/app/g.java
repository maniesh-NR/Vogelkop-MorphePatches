package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import defpackage.cod;
import defpackage.nnd;
import defpackage.o0g;
import defpackage.ond;
import defpackage.qnd;
import defpackage.sgb;
import defpackage.ynd;

/* loaded from: classes.dex */
public final class g extends e {
    public final View f;
    public final ImageView g;
    public final ProgressBar h;
    public final TextView i;
    public final RelativeLayout j;
    public final CheckBox k;
    public final float l;
    public final int m;
    public final ic n;
    public final /* synthetic */ nnd o;

    /* JADX WARN: Illegal instructions before constructor call */
    public g(nnd nndVar, View view) throws Resources.NotFoundException {
        this.o = nndVar;
        ond ondVar = nndVar.j;
        super(ondVar, view, (ImageButton) view.findViewById(2131363566), (MediaRouteVolumeSlider) view.findViewById(2131363572));
        this.n = new ic(this, (byte) 9);
        this.f = view;
        this.g = (ImageView) view.findViewById(2131363567);
        ProgressBar progressBar = (ProgressBar) view.findViewById(2131363569);
        this.h = progressBar;
        this.i = (TextView) view.findViewById(2131363568);
        this.j = (RelativeLayout) view.findViewById(2131363571);
        CheckBox checkBox = (CheckBox) view.findViewById(2131363553);
        this.k = checkBox;
        Context context = ondVar.o;
        Drawable drawableF = sgb.F(2131232934, context);
        if (o0g.g0(context)) {
            drawableF.setTint(context.getColor(2131101263));
        }
        checkBox.setButtonDrawable(drawableF);
        o0g.z0(context, progressBar);
        this.l = o0g.S(context);
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        TypedValue typedValue = new TypedValue();
        resources.getValue(2131166741, typedValue, true);
        this.m = (int) typedValue.getDimension(displayMetrics);
    }

    public final boolean X(cod codVar) {
        if (codVar.g()) {
            return true;
        }
        ynd yndVarA = this.o.j.j.a();
        if (yndVarA == null) {
            return false;
        }
        qnd qndVar = (qnd) yndVarA.x.get(codVar.c);
        return (qndVar != null ? qndVar.b : 4) == 3;
    }

    public final void Y(boolean z, boolean z2) {
        CheckBox checkBox = this.k;
        checkBox.setEnabled(false);
        this.f.setEnabled(false);
        checkBox.setChecked(z);
        if (z) {
            this.g.setVisibility(4);
            this.h.setVisibility(0);
        }
        if (z2) {
            this.o.G(z ? this.m : 0, this.j);
        }
    }
}
