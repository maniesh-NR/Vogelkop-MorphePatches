package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.opera.android.bar.OmniButtonView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class kce implements Drawable.Callback {
    public final LayerDrawable a;
    public final ArrayList b = new ArrayList();

    public kce(LayerDrawable layerDrawable) {
        this.a = layerDrawable;
        layerDrawable.setCallback(this);
    }

    public final void a() {
        boolean z;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = false;
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            if (((OmniButtonView) obj).k) {
                z = true;
                break;
            }
        }
        this.a.setVisible(z, false);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((OmniButtonView) obj).invalidateDrawable(drawable);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        runnable.run();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }
}
