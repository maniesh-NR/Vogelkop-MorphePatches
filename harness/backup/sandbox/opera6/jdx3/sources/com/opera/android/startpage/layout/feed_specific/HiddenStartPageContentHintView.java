package com.opera.android.startpage.layout.feed_specific;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.res.ResourcesCompat;
import com.opera.android.custom_views.DropShadowFrameLayout;
import defpackage.bba;
import defpackage.dll;
import defpackage.f8k;
import defpackage.hg2;
import defpackage.hjf;
import defpackage.laj;
import defpackage.maj;
import defpackage.pc5;
import defpackage.q9n;
import defpackage.rmn;
import defpackage.rxh;
import defpackage.u8n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/opera/android/startpage/layout/feed_specific/HiddenStartPageContentHintView;", "Landroid/view/View;", "bba", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HiddenStartPageContentHintView extends View {
    public static final rxh p = new rxh(2132021712);
    public final int a;
    public final int b;
    public final TextPaint c;
    public final laj d;
    public int e;
    public boolean f;
    public bba g;
    public StaticLayout h;
    public Drawable i;
    public f3d j;
    public int k;
    public int l;
    public boolean m;
    public boolean n;
    public f8k o;

    public HiddenStartPageContentHintView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.a = getResources().getDimensionPixelSize(2131165771);
        this.b = getResources().getDimensionPixelSize(2131165772);
        this.c = new TextPaint();
        this.d = u0h.g(context, maj.b);
        this.g = bba.MORE;
        setVisibility(8);
    }

    public final void a(boolean z) {
        f8k f8kVar = this.o;
        if (f8kVar != null) {
            rmn rmnVar = f8kVar.g;
            int i = rmnVar != null ? rmnVar.l : false ? -1 : -16777216;
            this.c.setColor(i);
            ((DropShadowFrameLayout) getParent()).b(i != -16777216 ? this.d : null);
            Drawable drawable = this.i;
            if (drawable != null) {
                drawable.setTint(i);
            }
            f3d f3dVar = this.j;
            if (f3dVar != null) {
                dvb dvbVar = new dvb(new String[]{"**", "icon_fill", "**"});
                PointF pointF = k3d.a;
                f3dVar.a(dvbVar, 1, new gz3((byte) 6, i));
            }
            if (z) {
                invalidate();
            }
        }
    }

    public final void b() {
        int width = ((getWidth() - (getPaddingRight() + getPaddingLeft())) - this.k) - this.b;
        if (width < 0) {
            width = 0;
        }
        String string = this.g.a.a(getResources()).toString();
        int length = string.length();
        TextPaint textPaint = this.c;
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(string, 0, length, textPaint, width).build();
        if (staticLayoutBuild.getLineCount() > 1) {
            staticLayoutBuild = null;
        }
        if (staticLayoutBuild == null) {
            CharSequence charSequenceA = p.a(getResources());
            staticLayoutBuild = StaticLayout.Builder.obtain(charSequenceA, 0, charSequenceA.length(), textPaint, width).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(width).setMaxLines(1).build();
        }
        this.h = staticLayoutBuild;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f || j14.x == canvas) {
            return;
        }
        Drawable drawable = this.i;
        StaticLayout staticLayout = this.h;
        if (drawable == null || staticLayout == null) {
            return;
        }
        int i = this.k;
        int i2 = this.l;
        int height = staticLayout.getHeight();
        if (height < i2) {
            height = i2;
        }
        int height2 = getHeight() - this.e;
        int iCeil = staticLayout.getLineCount() > 0 ? (int) Math.ceil(staticLayout.getLineRight(0) - staticLayout.getLineLeft(0)) : 0;
        int iB = staticLayout.getLineCount() > 0 ? zed.b((float) Math.floor(staticLayout.getLineLeft(0))) : 0;
        int width = (getWidth() - iCeil) / 2;
        int i3 = this.b;
        int i4 = i / 2;
        int i5 = (i3 / 2) + width + i4;
        int i6 = height2 - this.a;
        float f = i5 - iB;
        float height3 = i6 - ((staticLayout.getHeight() + height) / 2);
        int iSave = canvas.save();
        canvas.translate(f, height3);
        try {
            staticLayout.draw(canvas);
            canvas.restoreToCount(iSave);
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i7 = ((i5 - i3) - i4) - (intrinsicWidth / 2);
            int i8 = ((i2 / 2) + ((int) ((i6 - (height / 2.0f)) - (i2 / 2.0f)))) - (intrinsicHeight / 2);
            drawable.setBounds(i7, i8, intrinsicWidth + i7, intrinsicHeight + i8);
            drawable.draw(canvas);
        } catch (Throwable th) {
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            b();
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) throws Resources.NotFoundException {
        rmn rmnVar;
        if (Intrinsics.a(view, this) && !this.f && i == 0) {
            Drawable drawableI0 = j14.i0(2131232032, getContext());
            this.k = drawableI0.getIntrinsicWidth();
            this.l = drawableI0.getIntrinsicHeight();
            this.i = drawableI0;
            if (this.m) {
                f8k f8kVar = this.o;
                int i2 = (f8kVar == null || (rmnVar = f8kVar.g) == null || !rmnVar.l) ? 2131951701 : 2131951700;
                Context context = getContext();
                u2d.e(context, i2, u2d.j(i2, context)).b(new hg2(this, (byte) 1));
            }
            TextPaint textPaint = this.c;
            textPaint.setAntiAlias(true);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.getTheme().obtainStyledAttributes(f03.E(2130971032, getContext(), 2132083323), zhh.y);
            try {
                textPaint.setTextSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, (int) textPaint.getTextSize()));
                if (typedArrayObtainStyledAttributes.hasValue(12)) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(12, -1);
                    textPaint.setTypeface(resourceId != -1 ? ResourcesCompat.b(resourceId, context2) : Typeface.create(typedArrayObtainStyledAttributes.getString(10), 0));
                }
                if (textPaint.getTypeface().getWeight() != 500 || textPaint.getTypeface().isItalic()) {
                    textPaint.setTypeface(Typeface.create(textPaint.getTypeface(), 500, false));
                }
                typedArrayObtainStyledAttributes.recycle();
                b();
                pc5 pc5Var = new pc5((Object) this, (byte) 27);
                l5b l5bVar = q9n.c;
                dll dllVarV = hjf.v(getContext());
                if (dllVarV != null) {
                    u8n.b(dllVarV, this, pc5Var);
                }
                a(false);
                this.f = true;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        super.onVisibilityChanged(view, i);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return Intrinsics.a(drawable, this.i) || super.verifyDrawable(drawable);
    }
}
