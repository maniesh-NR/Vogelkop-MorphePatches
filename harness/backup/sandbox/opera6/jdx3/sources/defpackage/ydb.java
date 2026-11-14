package defpackage;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import com.opera.hype.image.editor.EditImage;

/* loaded from: classes.dex */
public final class ydb extends ImageView {
    public static final /* synthetic */ int H = 0;
    public GestureDetector A;
    public v35 B;
    public d0b C;
    public boolean D;
    public boolean E;
    public boolean F;
    public long G;
    public final Matrix a;
    public final Matrix b;
    public Matrix c;
    public vr9 d;
    public boolean e;
    public float f;
    public float g;
    public boolean h;
    public boolean i;
    public final Matrix j;
    public final float[] k;
    public boolean l;
    public final int m;
    public final int n;
    public final int o;
    public final PointF p;
    public final RectF q;
    public final RectF r;
    public final RectF s;
    public final PointF t;
    public final RectF u;
    public final RectF v;
    public AnimatorSet w;
    public final int x;
    public float y;
    public ScaleGestureDetector z;

    public ydb(Context context) {
        super(context, null, 0);
        this.a = new Matrix();
        this.b = new Matrix();
        this.d = null;
        this.e = false;
        this.f = -1.0f;
        this.g = -1.0f;
        this.j = new Matrix();
        this.k = new float[9];
        this.x = 3;
        this.p = new PointF();
        this.q = new RectF();
        this.r = new RectF();
        this.s = new RectF();
        this.t = new PointF();
        this.u = new RectF();
        this.v = new RectF();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.o = viewConfiguration.getScaledMaximumFlingVelocity();
        this.m = getResources().getInteger(R.integer.config_shortAnimTime);
        setScaleType(ImageView.ScaleType.MATRIX);
        ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.B = new v35(this, (byte) 2);
        this.C = new d0b(this);
        this.z = new ScaleGestureDetector(getContext(), this.C);
        this.A = new GestureDetector(getContext(), this.B, null, true);
        this.z.setQuickScaleEnabled(false);
    }

    public final void a() {
        if (getDrawable() != null) {
            RectF rectFC = c(this.b);
            float f = rectFC.left;
            if (f == 0.0f && rectFC.top == 0.0f) {
                return;
            }
            l(f, rectFC.top);
        }
    }

    public final RectF b(Matrix matrix) {
        Matrix matrixE = e(matrix);
        RectF rectF = this.q;
        RectF rectF2 = this.r;
        matrixE.mapRect(rectF2, rectF);
        return rectF2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.RectF c(android.graphics.Matrix r8) {
        /*
            r7 = this;
            android.graphics.drawable.Drawable r0 = r7.getDrawable()
            r1 = 0
            if (r0 != 0) goto Ld
            android.graphics.RectF r7 = new android.graphics.RectF
            r7.<init>(r1, r1, r1, r1)
            return r7
        Ld:
            android.graphics.RectF r0 = r7.s
            r0.set(r1, r1, r1, r1)
            android.graphics.RectF r8 = r7.b(r8)
            float r2 = r8.height()
            float r3 = r8.width()
            android.graphics.RectF r7 = r7.u
            float r4 = r7.height()
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r5 = 1073741824(0x40000000, float:2.0)
            if (r4 >= 0) goto L37
            float r4 = r7.height()
            float r4 = r4 - r2
            float r4 = r4 / r5
            float r2 = r8.top
            float r6 = r7.top
            float r2 = r2 - r6
        L35:
            float r4 = r4 - r2
            goto L4b
        L37:
            float r2 = r8.top
            float r4 = r7.top
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L42
            float r2 = r2 - r4
            float r4 = -r2
            goto L4b
        L42:
            float r2 = r8.bottom
            float r4 = r7.bottom
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L35
            r4 = r1
        L4b:
            float r2 = r7.width()
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 >= 0) goto L60
            float r2 = r7.width()
            float r2 = r2 - r3
            float r2 = r2 / r5
            float r8 = r8.left
            float r7 = r7.left
            float r8 = r8 - r7
            float r2 = r2 - r8
            goto L77
        L60:
            float r2 = r8.left
            float r3 = r7.left
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 <= 0) goto L6b
            float r2 = r2 - r3
            float r2 = -r2
            goto L77
        L6b:
            float r8 = r8.right
            float r7 = r7.right
            int r2 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r2 >= 0) goto L76
            float r2 = r7 - r8
            goto L77
        L76:
            r2 = r1
        L77:
            r0.set(r2, r4, r1, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ydb.c(android.graphics.Matrix):android.graphics.RectF");
    }

    public final float d(int i) {
        float width;
        float fI;
        float fWidth;
        if (i == 2) {
            return 1.0f;
        }
        Matrix matrix = this.a;
        if (i == 3) {
            return Math.min(1.0f, 1.0f / i(matrix, 0));
        }
        RectF rectF = this.q;
        if (i == 4) {
            width = getHeight();
            fI = i(matrix, 4);
            fWidth = rectF.height();
        } else {
            if (i != 5) {
                return 1.0f / i(matrix, 0);
            }
            width = getWidth();
            fI = i(matrix, 0);
            fWidth = rectF.width();
        }
        return width / (fWidth * fI);
    }

    public final Matrix e(Matrix matrix) {
        Matrix matrix2 = this.a;
        Matrix matrix3 = this.j;
        matrix3.set(matrix2);
        matrix3.postConcat(matrix);
        return matrix3;
    }

    public final float f() {
        float fMax = this.f;
        if (fMax == -1.0f) {
            if (getDrawable() == null) {
                fMax = 1.0f;
            } else {
                RectF rectF = this.q;
                float fWidth = rectF.width();
                RectF rectF2 = this.u;
                fMax = Math.max(fWidth / rectF2.width(), rectF.height() / rectF2.height()) * 4.0f;
            }
            this.f = fMax;
        }
        return fMax;
    }

    public final float g() {
        float fMin = this.g;
        if (fMin == -1.0f) {
            fMin = getDrawable() == null ? 1.0f : Math.min(1.0f, 1.0f / i(this.a, 0));
            this.g = fMin;
        }
        return fMin;
    }

    @Override // android.view.View
    public final float getRotation() {
        return 0.0f;
    }

    public final float h() {
        return i(this.b, 0);
    }

    public final float i(Matrix matrix, int i) {
        float[] fArr = this.k;
        matrix.getValues(fArr);
        return fArr[i];
    }

    public final void j() {
        g();
        f();
        f();
        g();
        this.y = ((f() - g()) / 2.0f) + 0.5f;
    }

    public final void k(double d, double d2) {
        b(this.b);
        float f = (float) d2;
        PointF pointF = this.t;
        pointF.set((float) d, f);
        float f2 = pointF.x;
        if (f2 == 0.0f && pointF.y == 0.0f) {
            return;
        }
        l(f2, pointF.y);
        a();
    }

    public final void l(float f, float f2) {
        if (f == 0.0f && f2 == 0.0f) {
            return;
        }
        Matrix matrix = this.b;
        matrix.postTranslate(f, f2);
        setImageMatrix(e(matrix));
    }

    public final void m(Drawable drawable) {
        if (getWidth() <= 0) {
            this.d = new vr9((byte) 13, this, drawable, false);
            return;
        }
        this.a.reset();
        super.setImageDrawable(drawable);
        this.g = -1.0f;
        this.f = -1.0f;
        this.i = false;
        this.h = false;
        byte b = 1;
        this.l = true;
        RectF rectF = this.q;
        if (drawable != null) {
            rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        } else {
            rectF.setEmpty();
        }
        ViewParent parent = getParent();
        if (parent instanceof EditImage) {
            EditImage editImage = (EditImage) parent;
            editImage.g.c0(new ws7(editImage, b));
            editImage.invalidate();
        }
        requestLayout();
    }

    public final void n(float f) {
        if (f > f()) {
            f = f();
        }
        if (f < g()) {
            f = g();
        }
        PointF pointF = this.p;
        o(f, pointF.x, pointF.y);
    }

    public final void o(float f, float f2, float f3) {
        if (f > f()) {
            f = f();
        }
        float fH = f / h();
        Matrix matrix = this.b;
        matrix.postScale(fH, fH, f2, f3);
        setImageMatrix(e(matrix));
        h();
        a();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.e) {
            this.e = Math.abs(h() - g()) > 0.1f;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (getScaleType() != ImageView.ScaleType.FIT_XY) {
            super.onDraw(canvas);
            return;
        }
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float fWidth;
        float fHeight;
        float fD;
        float f;
        RectF rectF = this.u;
        if (z) {
            RectF rectF2 = this.v;
            rectF2.set(rectF);
            rectF.set(i, i2, i3, i4);
            float fCenterX = rectF.centerX();
            PointF pointF = this.p;
            pointF.x = fCenterX;
            pointF.y = rectF.centerY();
            fWidth = rectF.width() - rectF2.width();
            fHeight = rectF.height() - rectF2.height();
        } else {
            fWidth = 0.0f;
            fHeight = 0.0f;
        }
        super.onLayout(z, i, i2, i3, i4);
        vr9 vr9Var = this.d;
        if (vr9Var != null) {
            this.d = null;
            vr9Var.run();
        }
        if (getDrawable() == null) {
            boolean z2 = this.l;
            if (z || z2) {
                j();
            }
            if (this.l) {
                this.l = false;
                return;
            }
            return;
        }
        if (z || this.l) {
            boolean z3 = this.l;
            Matrix matrix = this.a;
            if (z3) {
                this.e = false;
                matrix.reset();
                if (!this.i) {
                    this.g = -1.0f;
                }
                if (!this.h) {
                    this.f = -1.0f;
                }
            }
            int i5 = this.x;
            d(i5);
            float fI = i(matrix, 0);
            float fH = h();
            float fMin = Math.min(1.0f, 1.0f / fI);
            RectF rectF3 = this.q;
            float fWidth2 = rectF3.width();
            float fHeight2 = rectF3.height();
            matrix.reset();
            float fMin2 = Math.min(rectF.width() / fWidth2, rectF.height() / fHeight2);
            matrix.postScale(fMin2, fMin2);
            matrix.postTranslate(rectF.left, rectF.top);
            matrix.postTranslate((rectF.width() - (fWidth2 * fMin2)) / 2.0f, (rectF.height() - (fHeight2 * fMin2)) / 2.0f);
            float[] fArr = this.k;
            matrix.getValues(fArr);
            float f2 = fArr[0];
            matrix.getValues(fArr);
            float f3 = fArr[4];
            matrix.getValues(fArr);
            float f4 = fArr[2];
            matrix.getValues(fArr);
            float f5 = fArr[5];
            matrix.getValues(fArr);
            float f6 = fArr[0];
            boolean z4 = this.l;
            Matrix matrix2 = this.b;
            if (z4) {
                Matrix matrix3 = this.c;
                if (matrix3 != null) {
                    matrix2.set(matrix3);
                    this.c = null;
                    fD = h();
                } else {
                    matrix2.reset();
                    fD = d(i5);
                }
                f = fD;
                setImageMatrix(e(matrix2));
                if (f != h()) {
                    n(f);
                }
            } else if (z) {
                if (!this.i) {
                    this.g = -1.0f;
                }
                if (!this.h) {
                    this.f = -1.0f;
                }
                setImageMatrix(e(matrix2));
                l(-fWidth, -fHeight);
                if (this.e) {
                    f = Math.abs(fH - fMin) > 0.1f ? (fI / f6) * fH : 1.0f;
                    n(f);
                } else {
                    float fD2 = d(i5);
                    n(fD2);
                    f = fD2;
                }
            } else {
                f = 1.0f;
            }
            if (f > f() || f < g()) {
                n(f);
            }
            a();
            boolean z5 = this.l;
            if (z || z5) {
                j();
            }
            if (this.l) {
                this.l = false;
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.l) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 6) {
            this.G = motionEvent.getEventTime();
        }
        this.z.onTouchEvent(motionEvent);
        if (!this.z.isInProgress()) {
            this.A.onTouchEvent(motionEvent);
        }
        if (actionMasked == 1) {
            if (this.l) {
                return false;
            }
            if (h() < g()) {
                float fG = g();
                PointF pointF = this.p;
                p(fG, pointF.x, pointF.y, 50L);
            }
        }
        return true;
    }

    public final void p(float f, float f2, float f3, long j) {
        if (f > f()) {
            f = f();
        }
        float fH = h();
        Matrix matrix = new Matrix(this.b);
        matrix.postScale(f, f, f2, f3);
        RectF rectFC = c(matrix);
        float f4 = (rectFC.left * f) + f2;
        float f5 = (rectFC.top * f) + f3;
        AnimatorSet animatorSet = this.w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.w = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fH, f);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(1.0f));
        valueAnimatorOfFloat.addUpdateListener(new f0b(this, f4, f5));
        valueAnimatorOfFloat.start();
    }

    @Override // android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        if (bitmap == null) {
            m(null);
            return;
        }
        qp8 qp8Var = new qp8();
        qp8Var.a = bitmap;
        qp8Var.c = bitmap.getWidth();
        qp8Var.d = bitmap.getHeight();
        Paint paint = new Paint();
        qp8Var.b = paint;
        paint.setDither(true);
        paint.setFilterBitmap(true);
        m(qp8Var);
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        m(drawable);
    }

    @Override // android.widget.ImageView
    public final void setImageMatrix(Matrix matrix) {
        Matrix imageMatrix = getImageMatrix();
        byte b = 1;
        boolean z = matrix != null ? !imageMatrix.equals(matrix) : !imageMatrix.isIdentity();
        super.setImageMatrix(matrix);
        if (z) {
            ViewParent parent = getParent();
            if (parent instanceof EditImage) {
                EditImage editImage = (EditImage) parent;
                editImage.g.c0(new ws7(editImage, b));
                editImage.invalidate();
            }
        }
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        m(getContext().getResources().getDrawable(i));
    }
}
