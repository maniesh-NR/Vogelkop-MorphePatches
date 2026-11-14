package androidx.mediarouter.app;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import defpackage.nnd;
import defpackage.ond;

/* loaded from: classes.dex */
public final class f extends e {
    public final TextView f;
    public final int g;
    public final /* synthetic */ nnd h;

    /* JADX WARN: Illegal instructions before constructor call */
    public f(nnd nndVar, View view) throws Resources.NotFoundException {
        this.h = nndVar;
        ond ondVar = nndVar.j;
        super(ondVar, view, (ImageButton) view.findViewById(2131363566), (MediaRouteVolumeSlider) view.findViewById(2131363572));
        this.f = (TextView) view.findViewById(2131363599);
        Resources resources = ondVar.o.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        TypedValue typedValue = new TypedValue();
        resources.getValue(2131166742, typedValue, true);
        this.g = (int) typedValue.getDimension(displayMetrics);
    }
}
