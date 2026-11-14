package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class nvk extends blb {
    public final int e;
    public final int f;
    public final int g;
    public final Path h;
    public Drawable i;
    public final Rect j = new Rect();
    public final Rect k = new Rect();
    public final Rect l = new Rect();
    public final Rect m = new Rect();
    public final Paint n = new Paint();
    public final Paint o;
    public final TextPaint p;
    public final jvk q;
    public final HashMap r;
    public final hvk[] s;
    public boolean t;

    public nvk(Context context, jvk jvkVar) throws Resources.NotFoundException {
        Typeface typefaceB;
        Paint paint = new Paint();
        this.o = paint;
        this.r = new HashMap();
        this.s = new hvk[2];
        this.e = fan.a(12.0f, context.getResources());
        this.f = fan.a(1.0f, context.getResources());
        this.g = fan.a(4.0f, context.getResources());
        this.h = new Path();
        this.q = jvkVar;
        paint.setColor(context.getColor(2131099816));
        TextPaint textPaint = new TextPaint(1);
        this.p = textPaint;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(f03.E(2130971056, context, 2132083328), zhh.y);
        try {
            textPaint.setTextSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, (int) textPaint.getTextSize()));
            if (typedArrayObtainStyledAttributes.hasValue(12)) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(12, -1);
                typefaceB = resourceId != -1 ? ResourcesCompat.b(resourceId, context) : Typeface.create(typedArrayObtainStyledAttributes.getString(10), 0);
            } else {
                typefaceB = null;
            }
            textPaint.setTypeface(typefaceB == null ? textPaint.getTypeface() : typefaceB);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static mvk v(int i) {
        return new mvk(2130970914, i, 2130970915, 2131951677, new i3d("states/on error", 2130969266));
    }

    @Override // defpackage.blb, defpackage.r8n
    public final void a(View view) {
        Iterator it = this.r.values().iterator();
        while (it.hasNext()) {
            ((ivk) it.next()).a(view);
        }
    }

    @Override // defpackage.blb
    public final void d(RecyclerView recyclerView, i iVar) {
        super.d(recyclerView, iVar);
        for (ivk ivkVar : this.r.values()) {
            f3d f3dVar = ivkVar.e;
            if (f3dVar instanceof f3d) {
                f3d f3dVar2 = f3dVar;
                f3dVar2.e.clear();
                p3d p3dVar = f3dVar2.b;
                p3dVar.j(true);
                p3dVar.g(p3dVar.f());
                if (!f3dVar2.isVisible()) {
                    f3dVar2.E = 1;
                }
                ivkVar.j = false;
            }
        }
        iVar.itemView.animate().translationZ(0.0f).start();
        if (this.q.C()) {
            iVar.itemView.setClipBounds(null);
        }
    }

    @Override // defpackage.blb
    public final int h(RecyclerView recyclerView, i iVar) {
        if (this.t) {
            return 196611;
        }
        return !this.q.n(iVar) ? 0 : 3084;
    }

    @Override // defpackage.blb
    public final float i(i iVar) {
        return (iVar.itemView.getWidth() / ((View) iVar.itemView.getParent()).getWidth()) * 0.2f;
    }

    @Override // defpackage.blb
    public final float j(i iVar) {
        return (iVar.itemView.getWidth() / ((View) iVar.itemView.getParent()).getWidth()) * 0.5f;
    }

    @Override // defpackage.blb
    public final boolean n(int i) {
        return x(i) == null;
    }

    @Override // defpackage.blb
    public final void o(Canvas canvas, RecyclerView recyclerView, i iVar, float f, float f2, int i, boolean z) {
        super.o(canvas, recyclerView, iVar, f, f2, i, z);
        int i2 = (int) f;
        if (i2 != 0 && this.q.C()) {
            View view = iVar.itemView;
            view.setClipBounds(new Rect(-i2, 0, view.getWidth() - i2, view.getHeight()));
        }
        if (this.i != null) {
            w(canvas, recyclerView, iVar, f, z);
        }
    }

    @Override // defpackage.blb
    public final void p(Canvas canvas, RecyclerView recyclerView, i iVar, float f, float f2, int i, boolean z) {
        if (this.i == null) {
            w(canvas, recyclerView, iVar, f, z);
        }
    }

    @Override // defpackage.blb
    public final boolean r(RecyclerView recyclerView, i iVar, i iVar2) {
        this.q.F(iVar, iVar2);
        return false;
    }

    @Override // defpackage.blb
    public final void t(i iVar, int i) {
        Drawable.ConstantState constantState;
        if (iVar != null && i == 2) {
            iVar.itemView.animate().translationZ(Math.round(TypedValue.applyDimension(1, 4.0f, iVar.itemView.getContext().getResources().getDisplayMetrics()))).start();
        }
        if (iVar == null) {
            this.t = false;
            return;
        }
        hvk[] hvkVarArr = this.s;
        Drawable drawableMutate = null;
        hvkVarArr[1] = null;
        hvkVarArr[0] = null;
        jvk jvkVar = this.q;
        jvkVar.h(iVar, hvkVarArr);
        if (jvkVar.a0() && (constantState = iVar.itemView.getBackground().getConstantState()) != null) {
            drawableMutate = constantState.newDrawable().mutate();
        }
        this.i = drawableMutate;
    }

    @Override // defpackage.blb
    public final void u(i iVar, int i) {
        this.q.k(iVar, x(i));
    }

    public final void w(Canvas canvas, RecyclerView recyclerView, i iVar, float f, boolean z) {
        RecyclerView recyclerView2;
        ivk ivkVar;
        float f2;
        boolean z2;
        View view;
        boolean z3;
        int color;
        Path path;
        if (this.t) {
            return;
        }
        if (f != 0.0f) {
            View view2 = iVar.itemView;
            int i = f > 0.0f ? 8 : 4;
            hvk hvkVarX = x(i);
            if (hvkVarX == null) {
                ivkVar = null;
                recyclerView2 = recyclerView;
            } else {
                HashMap map = this.r;
                ivk ivkVar2 = (ivk) map.get(hvkVarX);
                if (ivkVar2 == null) {
                    recyclerView2 = recyclerView;
                    ivkVar2 = new ivk(this, recyclerView2, hvkVarX);
                    map.put(hvkVarX, ivkVar2);
                } else {
                    recyclerView2 = recyclerView;
                }
                ivkVar = ivkVar2;
            }
            Float f3 = this.b;
            float fFloatValue = f3 != null ? f3.floatValue() : iVar.itemView.getAlpha();
            int left = view2.getLeft();
            int top = view2.getTop();
            int right = view2.getRight();
            int bottom = view2.getBottom();
            Rect rect = this.j;
            rect.set(left, top, right, bottom);
            rect.offset(0, (int) view2.getTranslationY());
            TextPaint textPaint = this.p;
            if (ivkVar == null) {
                color = recyclerView2.getContext().getColor(2131099816);
                view = view2;
                z3 = false;
                f2 = 255.0f;
                z2 = true;
            } else {
                Drawable drawable = ivkVar.e;
                f2 = 255.0f;
                Rect rect2 = ivkVar.c;
                z2 = true;
                int iA0 = p37.a0(fFloatValue, ivkVar.f);
                int i2 = f > 0.0f ? 8388611 : 8388613;
                Gravity.apply(i2, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), this.j, this.e, 0, this.m, 0);
                Rect rect3 = this.m;
                drawable.setBounds(rect3);
                int iWidth = rect3.width() + (this.e << 1);
                int iWidth2 = rect.width() - iWidth;
                nvk nvkVar = ivkVar.k;
                if (ivkVar.i == iWidth2) {
                    view = view2;
                    z3 = false;
                } else {
                    ivkVar.i = iWidth2;
                    view = view2;
                    String string = TextUtils.ellipsize(ivkVar.b, nvkVar.p, iWidth2, TextUtils.TruncateAt.END).toString();
                    ivkVar.h = string;
                    z3 = false;
                    nvkVar.p.getTextBounds(string, 0, string.length(), rect2);
                }
                Gravity.apply(i2, rect2.width(), rect2.height(), this.j, iWidth, rect2.height() / 2, this.l, 0);
                textPaint.setColor(ivkVar.g);
                textPaint.setAlpha((int) (fFloatValue * 255.0f));
                color = iA0;
            }
            Rect rect4 = this.k;
            rect4.set(rect);
            if (i == 8) {
                rect.right = Math.min(rect.left + ((int) f), view.getRight());
            } else {
                rect.left = Math.max(rect.right + ((int) f), view.getLeft());
            }
            canvas.save();
            Drawable drawable2 = this.i;
            if (drawable2 != null) {
                drawable2.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                this.i.setBounds(rect4);
                this.i.draw(canvas);
            } else {
                boolean z4 = i == 8 ? z2 : z3;
                float fAbs = Math.abs(f);
                float f4 = this.g;
                float fS = cs5.s(fAbs / f4, 0.0f, 1.0f) * f4;
                float f5 = rect.left;
                float f6 = rect.right;
                if (z4) {
                    f6 += fS;
                } else {
                    f5 -= fS;
                }
                Path path2 = this.h;
                path2.rewind();
                path2.moveTo(f5, rect.top);
                path2.lineTo(f6, rect.top);
                if (z4) {
                    float f7 = f6 - fS;
                    float f8 = rect.top;
                    float f9 = f6 + fS;
                    float f10 = fS * 2.0f;
                    path2.arcTo(f7, f8, f9, f8 + f10, 270.0f, -90.0f, false);
                    path = path2;
                    path.lineTo(f7, rect.bottom - fS);
                    float f11 = rect.bottom;
                    path2.arcTo(f7, f11 - f10, f9, f11, 180.0f, -90.0f, false);
                } else {
                    path = path2;
                    path.lineTo(f6, rect.bottom);
                }
                path.lineTo(f5, rect.bottom);
                if (z4) {
                    path.lineTo(f5, rect.top);
                } else {
                    float f12 = f5 - fS;
                    float f13 = rect.bottom;
                    float f14 = 2.0f * fS;
                    float f15 = f5 + fS;
                    Path path3 = path;
                    path3.arcTo(f12, f13 - f14, f15, f13, 90.0f, -90.0f, false);
                    path.lineTo(f15, rect.top + fS);
                    float f16 = rect.top;
                    path3.arcTo(f12, f16, f15, f16 + f14, 0.0f, -90.0f, false);
                }
                path.close();
                canvas.clipPath(path);
                Paint paint = this.n;
                paint.setColor(color);
                canvas.drawPath(path, paint);
            }
            if (ivkVar != null) {
                f3d f3dVar = ivkVar.e;
                if (f3dVar instanceof f3d) {
                    f3d f3dVar2 = f3dVar;
                    if (!ivkVar.j && z) {
                        f3dVar2.k();
                        ivkVar.j = z2;
                    }
                }
                f3dVar.setAlpha((int) (fFloatValue * f2));
                f3dVar.draw(canvas);
                canvas.drawText(ivkVar.h, r4.left, this.l.exactCenterY(), textPaint);
            }
            canvas.restore();
        }
        View view3 = iVar.itemView;
        if (z && this.q.f()) {
            canvas.save();
            float left2 = view3.getLeft();
            float top2 = view3.getTop();
            float right2 = view3.getRight();
            int top3 = view3.getTop();
            int i3 = this.f;
            Paint paint2 = this.o;
            canvas.drawRect(left2, top2, right2, top3 + i3, paint2);
            canvas.drawRect(view3.getLeft(), view3.getBottom() - i3, view3.getRight(), view3.getBottom(), paint2);
            canvas.restore();
        }
    }

    public final hvk x(int i) {
        hvk[] hvkVarArr = this.s;
        if (i == 4) {
            return hvkVarArr[0];
        }
        if (i != 8) {
            return null;
        }
        return hvkVarArr[1];
    }
}
