package defpackage;

import android.graphics.drawable.DrawableWrapper;
import android.util.Size;

/* loaded from: classes.dex */
public final class c7p extends DrawableWrapper {
    public final zyk a;

    public c7p(zyk zykVar) {
        super(null);
        this.a = zykVar;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Size size = (Size) this.a.getValue();
        if (size != null) {
            int height = size.getHeight();
            Integer numValueOf = Integer.valueOf(height);
            if (height <= 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
        }
        return super.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Size size = (Size) this.a.getValue();
        if (size != null) {
            int width = size.getWidth();
            Integer numValueOf = Integer.valueOf(width);
            if (width <= 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
        }
        return super.getIntrinsicWidth();
    }
}
