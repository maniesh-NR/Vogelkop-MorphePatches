package defpackage;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class v3a extends Drawable.ConstantState {
    public final Drawable a;
    public ColorFilter b;
    public final int c;
    public final boolean d;
    public final Rect e;

    public v3a(Drawable drawable) {
        this.a = drawable;
    }

    public v3a(Drawable drawable, int i, boolean z) {
        this(drawable);
        this.e = new Rect();
        this.c = i;
        this.d = z;
    }

    public v3a(v3a v3aVar) {
        this(v3aVar.a.mutate());
        this.b = v3aVar.b;
        Rect rect = new Rect();
        this.e = rect;
        this.c = v3aVar.c;
        this.d = v3aVar.d;
        rect.set(v3aVar.e);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new w3a(this);
    }
}
