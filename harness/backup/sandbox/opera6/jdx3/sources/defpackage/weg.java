package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.opera.android.BrowserActivity;
import java.util.List;

/* loaded from: classes.dex */
public final class weg extends LayerDrawable {
    public static final ixh d = new ixh(50.0f);
    public static final ixh e = new ixh(40.0f);
    public static final ixh f = new ixh(6.0f);
    public static final ixh g = new ixh(8.0f);
    public static final ixh h = new ixh(1.0f);
    public static final ixh i = new ixh(24.0f);
    public final int a;
    public final int b;
    public final int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public weg(BrowserActivity browserActivity, List list, zw0 zw0Var) {
        super(list.isEmpty() ? new Drawable[]{new f08(0)} : list.size() == 1 ? new Drawable[]{nb6.o(browserActivity, z7h.h(browserActivity, 32.0f), (qw0) list.get(0), zw0Var)} : list.size() == 2 ? new Drawable[]{new y1m(nb6.o(browserActivity, z7h.h(browserActivity, 32.0f), (qw0) list.get(0), zw0Var), z7h.i(browserActivity, 1.86f), 0.0f, 30.0f), new y1m(nb6.o(browserActivity, z7h.h(browserActivity, 30.0f), (qw0) list.get(1), zw0Var), z7h.i(browserActivity, -3.0f), z7h.i(browserActivity, 2.0f), -15.0f)} : new Drawable[]{new y1m(nb6.o(browserActivity, z7h.h(browserActivity, 32.0f), (qw0) list.get(0), zw0Var), z7h.i(browserActivity, 3.0f), 0.0f, 20.0f), new y1m(nb6.o(browserActivity, z7h.h(browserActivity, 30.0f), (qw0) list.get(1), zw0Var), z7h.i(browserActivity, -2.0f), z7h.i(browserActivity, 1.0f), -40.0f), nb6.o(browserActivity, z7h.h(browserActivity, 32.0f), (qw0) list.get(2), zw0Var)});
        this.a = d.k(browserActivity);
        this.b = e.k(browserActivity);
        this.c = f.k(browserActivity);
        int numberOfLayers = getNumberOfLayers();
        for (int i2 = 0; i2 < numberOfLayers; i2++) {
            setLayerGravity(i2, 8388627);
            setLayerInsetStart(i2, this.c);
        }
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.b;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a;
    }
}
