package defpackage;

import android.graphics.drawable.Drawable;
import com.opera.android.graphics.OperaGradientDrawable;

/* loaded from: classes.dex */
public final class wkf extends Drawable.ConstantState {
    public int a;
    public int b;
    public int c;
    public final bp d;
    public final bp e;

    public wkf() {
        this.d = new bp((byte) 21);
        this.e = new bp((byte) 21);
    }

    public wkf(wkf wkfVar) {
        this.a = wkfVar.a;
        this.b = wkfVar.b;
        this.c = wkfVar.c;
        this.d = new bp(wkfVar.d);
        this.e = new bp(wkfVar.e);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new OperaGradientDrawable(this, null);
    }
}
