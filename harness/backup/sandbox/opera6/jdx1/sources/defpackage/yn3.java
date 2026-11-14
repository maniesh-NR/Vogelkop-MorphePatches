package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class yn3 extends Drawable.ConstantState {
    public final /* synthetic */ byte a = 1;
    public final Object b;

    public yn3(rx9 rx9Var) {
        this.b = rx9Var;
    }

    public yn3(zn3 zn3Var) {
        this.b = zn3Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        byte b = this.a;
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.a) {
            case 0:
                return (zn3) this.b;
            default:
                return new kx9(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        switch (this.a) {
            case 1:
                return new kx9(this);
            default:
                return super.newDrawable(resources);
        }
    }
}
