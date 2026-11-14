package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.LayerDrawable;

/* loaded from: classes.dex */
public final class c7o extends LayerDrawable {
    public final void a(int i) {
        getDrawable(1).setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
    }
}
