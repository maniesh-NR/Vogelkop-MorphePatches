package com.opera.android.ui.catalog.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.button.MaterialButton;
import com.opera.android.graphics.OperaGradientDrawable;
import defpackage.o8f;
import defpackage.ohh;
import defpackage.qp2;
import java.util.Objects;

/* loaded from: classes.dex */
public class OperaMaterialButton extends MaterialButton {
    public x05 R;
    public CharSequence S;
    public Drawable T;
    public int U;
    public int V;
    public int W;
    public int a0;
    public int b0;
    public int c0;
    public int d0;
    public boolean e0;
    public final boolean f0;

    public OperaMaterialButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ohh.c, 0, 0);
        this.f0 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        P();
    }

    public final void D(Drawable drawable) {
        if (this.e0) {
            this.T = drawable;
        } else {
            super.D(drawable);
        }
    }

    public final void E(int i) {
        if (this.e0) {
            this.U = i;
        } else {
            super.E(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P() {
        o8f o8fVar;
        if (this.f0) {
            Drawable background = getBackground();
            if (background instanceof LayerDrawable) {
                Drawable drawableFindDrawableByLayerId = ((LayerDrawable) background).findDrawableByLayerId(2131362461);
                if (drawableFindDrawableByLayerId instanceof OperaGradientDrawable) {
                    OperaGradientDrawable operaGradientDrawable = (OperaGradientDrawable) drawableFindDrawableByLayerId;
                    TextPaint paint = getPaint();
                    Objects.requireNonNull(paint);
                    operaGradientDrawable.c = new o8f(paint, (byte) 4);
                    Shader shader = operaGradientDrawable.b.getShader();
                    if (shader == null || (o8fVar = operaGradientDrawable.c) == null) {
                        return;
                    }
                    o8fVar.run(shader);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final x05 Q() {
        if (this.R == null) {
            x05 x05Var = new x05(getContext());
            this.R = x05Var;
            x05Var.d(1);
        }
        this.R.b(new int[]{getCurrentTextColor()});
        return this.R;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void R(boolean z) {
        if (this.e0 != z) {
            if (z) {
                if (getLayoutParams().width == -2) {
                    this.W = getMinWidth();
                }
                if (getLayoutParams().height == -2) {
                    this.a0 = getMinHeight();
                }
                this.S = getText();
                Drawable drawable = ((MaterialButton) this).j;
                this.T = drawable;
                int intrinsicHeight = ((MaterialButton) this).p;
                if (intrinsicHeight == 0) {
                    if (intrinsicHeight == 0 && drawable != null) {
                        intrinsicHeight = drawable.getIntrinsicHeight();
                    }
                    this.U = intrinsicHeight;
                }
                this.V = ((MaterialButton) this).x;
                this.d0 = ((MaterialButton) this).s;
                this.b0 = getPaddingLeft();
                this.c0 = getPaddingRight();
                if (getLayoutParams().width == -2) {
                    setMinWidth(getMeasuredWidth());
                }
                if (getLayoutParams().height == -2) {
                    setMinHeight(getMeasuredHeight());
                }
                setText("");
                D(Q());
                if (((MaterialButton) this).p == 0) {
                    E(Math.round(TypedValue.applyDimension(1, 24.0f, getResources().getDisplayMetrics())));
                }
                if (this.e0) {
                    this.V = 2;
                } else if (((MaterialButton) this).x != 2) {
                    if (((MaterialButton) this).j != null && ((MaterialButton) this).m != null && g()) {
                        qp2.o("iconGravity cannot have the same alignment as secondaryIconGravity");
                        return;
                    } else {
                        ((MaterialButton) this).x = 2;
                        L(getMeasuredWidth(), getMeasuredHeight());
                    }
                }
                if (this.e0) {
                    this.d0 = 0;
                } else if (((MaterialButton) this).s != 0) {
                    ((MaterialButton) this).s = 0;
                    setCompoundDrawablePadding(0);
                }
                setPadding(0, getPaddingTop(), 0, getPaddingBottom());
                this.e0 = true;
            } else {
                this.e0 = false;
                if (getLayoutParams().width == -2) {
                    setMinWidth(this.W);
                }
                if (getLayoutParams().height == -2) {
                    setMinHeight(this.a0);
                }
                setText(this.S);
                D(this.T);
                if (((MaterialButton) this).p == 0) {
                    E(this.U);
                }
                int i = this.V;
                if (this.e0) {
                    this.V = i;
                } else if (((MaterialButton) this).x != i) {
                    if (((MaterialButton) this).j != null && ((MaterialButton) this).m != null && g()) {
                        qp2.o("iconGravity cannot have the same alignment as secondaryIconGravity");
                        return;
                    } else {
                        ((MaterialButton) this).x = i;
                        L(getMeasuredWidth(), getMeasuredHeight());
                    }
                }
                setPadding(this.b0, getPaddingTop(), this.c0, getPaddingBottom());
                int i2 = this.d0;
                if (this.e0) {
                    this.d0 = i2;
                } else if (((MaterialButton) this).s != i2) {
                    ((MaterialButton) this).s = i2;
                    setCompoundDrawablePadding(i2);
                }
                this.S = null;
                this.T = null;
            }
            if (isAttachedToWindow() && this.e0) {
                Q().start();
                return;
            }
            x05 x05Var = this.R;
            if (x05Var == null || !x05Var.d.isRunning()) {
                return;
            }
            this.R.stop();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isAttachedToWindow() && this.e0) {
            Q().start();
            return;
        }
        x05 x05Var = this.R;
        if (x05Var == null || !x05Var.d.isRunning()) {
            return;
        }
        this.R.stop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        x05 x05Var = this.R;
        if (x05Var == null || !x05Var.d.isRunning()) {
            return;
        }
        this.R.stop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        measure(View.MeasureSpec.makeMeasureSpec(i3 - i, 1073741824), View.MeasureSpec.makeMeasureSpec(i4 - i2, 1073741824));
        super.onLayout(z, i, i2, i3, i4);
    }

    public final boolean performClick() {
        if (this.e0) {
            return false;
        }
        return super.performClick();
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        P();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setMinHeight(int i) {
        if (this.e0) {
            this.a0 = i;
        } else {
            super/*android.widget.TextView*/.setMinHeight(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setMinWidth(int i) {
        if (this.e0) {
            this.W = i;
        } else {
            super/*android.widget.TextView*/.setMinWidth(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setPadding(int i, int i2, int i3, int i4) {
        if (!this.e0) {
            super/*android.view.View*/.setPadding(i, i2, i3, i4);
            return;
        }
        this.b0 = i;
        this.c0 = i3;
        super/*android.view.View*/.setPadding(0, i2, 0, i4);
    }

    public final void setPressed(boolean z) {
        if (this.e0) {
            z = false;
        }
        super.setPressed(z);
    }

    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (this.e0) {
            this.S = charSequence;
        } else {
            super.setText(charSequence, bufferType);
        }
    }
}
