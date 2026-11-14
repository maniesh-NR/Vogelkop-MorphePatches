package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import defpackage.cq1;
import defpackage.gll;
import defpackage.hp1;

/* loaded from: classes.dex */
public class AppCompatImageButton extends ImageButton {
    public final hp1 a;
    public final cq1 b;
    public boolean c;

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969925);
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = false;
        gll.a(getContext(), this);
        hp1 hp1Var = new hp1(this);
        this.a = hp1Var;
        hp1Var.b(attributeSet, i);
        cq1 cq1Var = new cq1(this);
        this.b = cq1Var;
        cq1Var.b(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        hp1 hp1Var = this.a;
        if (hp1Var != null) {
            hp1Var.a();
        }
        cq1 cq1Var = this.b;
        if (cq1Var != null) {
            cq1Var.a();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(this.b.a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        hp1 hp1Var = this.a;
        if (hp1Var != null) {
            hp1Var.c();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        hp1 hp1Var = this.a;
        if (hp1Var != null) {
            hp1Var.d(i);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        cq1 cq1Var = this.b;
        if (cq1Var != null) {
            cq1Var.a();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        cq1 cq1Var = this.b;
        if (cq1Var != null && drawable != null && !this.c) {
            cq1Var.c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (cq1Var != null) {
            cq1Var.a();
            if (this.c) {
                return;
            }
            ImageView imageView = cq1Var.a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(cq1Var.c);
            }
        }
    }

    @Override // android.widget.ImageView
    public final void setImageLevel(int i) {
        super.setImageLevel(i);
        this.c = true;
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        this.b.c(i);
    }

    @Override // android.widget.ImageView
    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        cq1 cq1Var = this.b;
        if (cq1Var != null) {
            cq1Var.a();
        }
    }
}
