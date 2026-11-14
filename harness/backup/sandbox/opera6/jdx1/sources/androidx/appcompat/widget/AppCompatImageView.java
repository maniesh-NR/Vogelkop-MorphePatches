package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import defpackage.cq1;
import defpackage.gll;
import defpackage.hp1;

/* loaded from: classes.dex */
public class AppCompatImageView extends ImageView {
    private final hp1 mBackgroundTintHelper;
    private boolean mHasLevel;
    private final cq1 mImageHelper;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHasLevel = false;
        gll.a(getContext(), this);
        hp1 hp1Var = new hp1(this);
        this.mBackgroundTintHelper = hp1Var;
        hp1Var.b(attributeSet, i);
        cq1 cq1Var = new cq1(this);
        this.mImageHelper = cq1Var;
        cq1Var.b(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        hp1 hp1Var = this.mBackgroundTintHelper;
        if (hp1Var != null) {
            hp1Var.a();
        }
        cq1 cq1Var = this.mImageHelper;
        if (cq1Var != null) {
            cq1Var.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        km5 km5Var;
        hp1 hp1Var = this.mBackgroundTintHelper;
        if (hp1Var == null || (km5Var = hp1Var.e) == null) {
            return null;
        }
        return (ColorStateList) km5Var.c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        km5 km5Var;
        hp1 hp1Var = this.mBackgroundTintHelper;
        if (hp1Var == null || (km5Var = hp1Var.e) == null) {
            return null;
        }
        return (PorterDuff.Mode) km5Var.d;
    }

    public ColorStateList getSupportImageTintList() {
        km5 km5Var;
        cq1 cq1Var = this.mImageHelper;
        if (cq1Var == null || (km5Var = cq1Var.b) == null) {
            return null;
        }
        return (ColorStateList) km5Var.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        km5 km5Var;
        cq1 cq1Var = this.mImageHelper;
        if (cq1Var == null || (km5Var = cq1Var.b) == null) {
            return null;
        }
        return (PorterDuff.Mode) km5Var.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return !(this.mImageHelper.a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        hp1 hp1Var = this.mBackgroundTintHelper;
        if (hp1Var != null) {
            hp1Var.c();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        hp1 hp1Var = this.mBackgroundTintHelper;
        if (hp1Var != null) {
            hp1Var.d(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        cq1 cq1Var = this.mImageHelper;
        if (cq1Var != null) {
            cq1Var.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        cq1 cq1Var = this.mImageHelper;
        if (cq1Var != null && drawable != null && !this.mHasLevel) {
            cq1Var.c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        cq1 cq1Var2 = this.mImageHelper;
        if (cq1Var2 != null) {
            cq1Var2.a();
            if (this.mHasLevel) {
                return;
            }
            cq1 cq1Var3 = this.mImageHelper;
            ImageView imageView = cq1Var3.a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(cq1Var3.c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.mHasLevel = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        cq1 cq1Var = this.mImageHelper;
        if (cq1Var != null) {
            cq1Var.c(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        cq1 cq1Var = this.mImageHelper;
        if (cq1Var != null) {
            cq1Var.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        hp1 hp1Var = this.mBackgroundTintHelper;
        if (hp1Var != null) {
            km5 km5Var = hp1Var.e;
            if (km5Var == null) {
                km5Var = new km5();
                hp1Var.e = km5Var;
            }
            km5Var.c = colorStateList;
            km5Var.b = true;
            hp1Var.a();
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        hp1 hp1Var = this.mBackgroundTintHelper;
        if (hp1Var != null) {
            km5 km5Var = hp1Var.e;
            if (km5Var == null) {
                km5Var = new km5();
                hp1Var.e = km5Var;
            }
            km5Var.d = mode;
            km5Var.a = true;
            hp1Var.a();
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        cq1 cq1Var = this.mImageHelper;
        if (cq1Var != null) {
            km5 km5Var = cq1Var.b;
            if (km5Var == null) {
                km5Var = new km5();
                cq1Var.b = km5Var;
            }
            km5Var.c = colorStateList;
            km5Var.b = true;
            cq1Var.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        cq1 cq1Var = this.mImageHelper;
        if (cq1Var != null) {
            km5 km5Var = cq1Var.b;
            if (km5Var == null) {
                km5Var = new km5();
                cq1Var.b = km5Var;
            }
            km5Var.d = mode;
            km5Var.a = true;
            cq1Var.a();
        }
    }
}
