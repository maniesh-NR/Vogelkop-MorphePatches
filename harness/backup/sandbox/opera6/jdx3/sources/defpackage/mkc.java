package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.opera.android.BrowserActivity;

/* loaded from: classes.dex */
public final class mkc extends LayerDrawable {
    public final BrowserActivity a;
    public final ikc b;
    public boolean c;
    public final ks6 d;

    public mkc(BrowserActivity browserActivity, ikc ikcVar) {
        super(new Drawable[]{new ColorDrawable(0)});
        this.a = browserActivity;
        this.b = ikcVar;
        this.d = new ks6(this, (byte) 25);
        setVisible(false, false);
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean z3 = this.c;
        ks6 ks6Var = this.d;
        ikc ikcVar = this.b;
        if (z) {
            if (!z3) {
                this.c = true;
                ikcVar.j(this.a, ks6Var);
            }
        } else if (z3) {
            this.c = false;
            ikcVar.p(ks6Var);
        }
        return super.setVisible(z, z2);
    }
}
