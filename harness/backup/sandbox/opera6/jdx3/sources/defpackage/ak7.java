package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.i;

/* loaded from: classes.dex */
public abstract class ak7 extends yzi implements th7 {
    public boolean f;
    public final Drawable g;
    public final ColorDrawable h;

    public ak7(View view, tzi tziVar) {
        super(view, tziVar);
        this.g = view.getBackground();
        ColorDrawable colorDrawable = new ColorDrawable();
        this.h = colorDrawable;
        colorDrawable.setColor(f03.G(((i) this).itemView.getContext()).getDefaultColor());
    }

    @Override // defpackage.th7
    public final void B() {
        this.f = true;
        f0();
        ((i) this).itemView.setBackground(this.h);
        ((i) this).itemView.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.7f).start();
    }

    @Override // defpackage.th7
    public final boolean C() {
        return this instanceof b7n;
    }

    @Override // defpackage.th7
    public final void E() {
        this.f = false;
        if (this.e) {
            f0();
            ((i) this).itemView.setBackground(this.g);
            ((i) this).itemView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).start();
        }
    }

    @Override // defpackage.th7
    public boolean I(i iVar) {
        return this instanceof alh;
    }

    @Override // defpackage.th7
    public void K(i iVar) {
    }

    @Override // defpackage.yzi
    public final void U() {
        if (!this.e) {
            ((i) this).itemView.animate().cancel();
            ((i) this).itemView.setBackground(this.g);
            ((i) this).itemView.setScaleX(1.0f);
            ((i) this).itemView.setScaleY(1.0f);
            ((i) this).itemView.setTranslationX(0.0f);
            ((i) this).itemView.setTranslationY(0.0f);
        }
        super.U();
    }

    @Override // defpackage.th7
    public void a(i iVar) {
    }

    @Override // defpackage.yzi
    public void a0() {
        super.a0();
        this.h.setColor(f03.G(((i) this).itemView.getContext()).getDefaultColor());
    }

    @Override // defpackage.yzi
    public final boolean c0() {
        return super.c0() && !this.f;
    }

    @Override // defpackage.th7
    public View e() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.th7
    public Object f() {
        return null;
    }

    @Override // defpackage.th7
    public void x(boolean z) {
    }
}
