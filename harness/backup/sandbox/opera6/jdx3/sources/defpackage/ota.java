package defpackage;

import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import java.util.HashMap;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class ota extends View implements wim {
    public static final /* synthetic */ int A = 0;
    public final qim a;
    public final LinkedList b;
    public final mta c;
    public final b7f d;
    public final ghf e;
    public final BitmapDrawable f;
    public final float g;
    public final Drawable h;
    public final RectF i;
    public final float j;
    public final int k;
    public final Paint l;
    public ValueAnimator m;
    public int n;
    public final PointF o;
    public final PointF p;
    public final PointF q;
    public final ImageView r;
    public float s;
    public final PointF t;
    public z9h u;
    public final WindowManager v;
    public final WindowManager.LayoutParams w;
    public final z22 x;
    public final GestureDetector y;
    public final wa z;

    /* JADX WARN: Multi-variable type inference failed */
    public ota(BrowserActivity browserActivity, Drawable drawable, PointF pointF, PointF pointF2, PointF pointF3, ImageView imageView, float f, int i, qim qimVar, b7f b7fVar, ghf ghfVar) throws Resources.NotFoundException {
        float f2;
        z22 z22Var;
        BitmapDrawable bitmapDrawable;
        super(browserActivity);
        z22 z22Var2 = new z22(this, (byte) 8);
        this.x = z22Var2;
        wa waVar = new wa(this, (byte) 15);
        this.z = waVar;
        this.c = new mta(this);
        this.a = qimVar;
        this.d = b7fVar;
        this.e = ghfVar;
        this.v = (WindowManager) getContext().getSystemService("window");
        this.y = new GestureDetector(getContext(), new v35(this, (byte) 1));
        LinkedList linkedList = new LinkedList();
        this.b = linkedList;
        linkedList.addLast(nta.a);
        linkedList.addLast(nta.b);
        linkedList.addLast(nta.c);
        linkedList.addLast(nta.e);
        linkedList.addLast(nta.f);
        int color = getContext().getColor(2131099816);
        float dimension = getResources().getDimension(2131165821);
        Resources resources = getResources();
        float f3 = f + dimension;
        int iCeil = (int) Math.ceil(f3 * 2.0d);
        Bitmap bitmapU = z5i.u(iCeil, iCeil, Bitmap.Config.ALPHA_8);
        if (bitmapU == null) {
            bitmapDrawable = null;
            f2 = f3;
            z22Var = z22Var2;
        } else {
            Canvas canvas = new Canvas(bitmapU);
            f2 = f3;
            Paint paint = new Paint();
            z22Var = z22Var2;
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            paint.setColor(color);
            paint.setMaskFilter(new BlurMaskFilter(dimension, BlurMaskFilter.Blur.NORMAL));
            float f4 = iCeil / 2.0f;
            canvas.drawCircle(f4, f4, f, paint);
            BitmapDrawable bitmapDrawable2 = new BitmapDrawable(resources, bitmapU);
            int i2 = -(iCeil / 2);
            int i3 = iCeil + i2;
            bitmapDrawable2.setBounds(i2, i2, i3, i3);
            bitmapDrawable = bitmapDrawable2;
        }
        this.f = bitmapDrawable;
        float dimension2 = getResources().getDimension(2131165822);
        this.g = dimension2;
        this.h = drawable.mutate();
        this.i = new RectF(drawable.getBounds());
        float f5 = f2 * 1.5f;
        PointF pointF4 = new PointF(f5, f5);
        this.t = pointF4;
        PointF pointF5 = new PointF(pointF.x, pointF.y);
        this.o = pointF5;
        PointF pointF6 = new PointF(pointF2.x, pointF2.y);
        this.p = pointF6;
        PointF pointF7 = new PointF(pointF3.x, pointF3.y);
        this.q = pointF7;
        this.r = imageView;
        this.j = f;
        this.k = i;
        Paint paint2 = new Paint();
        this.l = paint2;
        paint2.setAntiAlias(true);
        int[] iArr = {i, i};
        imageView.getRootView().getLocationOnScreen(iArr);
        int i4 = iArr[0] + ((int) pointF4.x);
        int i5 = iArr[1] + ((int) pointF4.y);
        pointF5.offset(-i4, -i5);
        pointF6.offset(-iArr[0], -iArr[1]);
        pointF7.offset(-iArr[0], -iArr[1]);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams((int) (f2 * 3.0f), (int) (((f2 * 2.0f) + dimension2) * 1.5f), (int) pointF5.x, (int) pointF5.y, 2, 264, -3);
        this.w = layoutParams;
        layoutParams.gravity = 8388659;
        qimVar.r.b(this);
        b7fVar.getClass();
        b7fVar.c(waVar);
        imageView.addOnLayoutChangeListener(z22Var);
        setOnTouchListener(new hs8(this, (byte) 1));
        String[] strArr = OperaApplication.K;
        ((OperaApplication) browserActivity.getApplicationContext()).B().b(this);
        a();
    }

    public final void a() throws Resources.NotFoundException {
        byte b;
        ValueAnimator valueAnimatorOfPropertyValuesHolder;
        LinkedList linkedList = this.b;
        nta ntaVar = (nta) linkedList.removeFirst();
        if (ntaVar == nta.c) {
            this.u = null;
        }
        int iOrdinal = ((nta) linkedList.getFirst()).ordinal();
        if (iOrdinal == 0) {
            qp2.n("should never happen");
            return;
        }
        ImageView imageView = this.r;
        PointF pointF = this.o;
        if (iOrdinal == 1) {
            b = 1;
            PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe("scale", Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.25f, 1.5f), Keyframe.ofFloat(0.6f, 1.0f));
            propertyValuesHolderOfKeyframe.setEvaluator(new jf1(lf1.g));
            PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt("alpha", 255, 255);
            Keyframe keyframeOfFloat = Keyframe.ofFloat(0.0f, pointF.x);
            Keyframe keyframeOfFloat2 = Keyframe.ofFloat(0.6f, pointF.x);
            PointF pointF2 = this.p;
            PropertyValuesHolder propertyValuesHolderOfKeyframe2 = PropertyValuesHolder.ofKeyframe("x", keyframeOfFloat, keyframeOfFloat2, Keyframe.ofFloat(1.0f, pointF2.x));
            propertyValuesHolderOfKeyframe2.setEvaluator(new jf1(lf1.l));
            PropertyValuesHolder propertyValuesHolderOfKeyframe3 = PropertyValuesHolder.ofKeyframe("y", Keyframe.ofFloat(0.0f, pointF.y), Keyframe.ofFloat(0.6f, pointF.y), Keyframe.ofFloat(1.0f, pointF2.y));
            propertyValuesHolderOfKeyframe3.setEvaluator(new jf1(lf1.i));
            valueAnimatorOfPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(propertyValuesHolderOfInt, propertyValuesHolderOfKeyframe, propertyValuesHolderOfKeyframe2, propertyValuesHolderOfKeyframe3);
            valueAnimatorOfPropertyValuesHolder.setDuration(1000L);
            valueAnimatorOfPropertyValuesHolder.setInterpolator(lf1.f);
        } else if (iOrdinal != 2) {
            b = 1;
            if (iOrdinal == 3) {
                PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat("scale", 1.0f, 0.0f);
                PathInterpolator pathInterpolator = lf1.i;
                propertyValuesHolderOfFloat.setEvaluator(new jf1(pathInterpolator));
                PropertyValuesHolder propertyValuesHolderOfInt2 = PropertyValuesHolder.ofInt("alpha", 255, 0);
                propertyValuesHolderOfInt2.setEvaluator(new kf1(pathInterpolator));
                float f = pointF.x;
                PropertyValuesHolder propertyValuesHolderOfFloat2 = PropertyValuesHolder.ofFloat("x", f, f);
                propertyValuesHolderOfFloat2.setEvaluator(new jf1(pathInterpolator));
                float f2 = pointF.y;
                PropertyValuesHolder propertyValuesHolderOfFloat3 = PropertyValuesHolder.ofFloat("y", f2, f2);
                propertyValuesHolderOfFloat3.setEvaluator(new jf1(pathInterpolator));
                valueAnimatorOfPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(propertyValuesHolderOfInt2, propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2, propertyValuesHolderOfFloat3);
                valueAnimatorOfPropertyValuesHolder.setDuration(250L);
                valueAnimatorOfPropertyValuesHolder.setInterpolator(lf1.f);
            } else if (iOrdinal == 4) {
                PropertyValuesHolder propertyValuesHolderOfFloat4 = PropertyValuesHolder.ofFloat("scale", 1.0f, 0.0f);
                PathInterpolator pathInterpolator2 = lf1.i;
                propertyValuesHolderOfFloat4.setEvaluator(new jf1(pathInterpolator2));
                PropertyValuesHolder propertyValuesHolderOfInt3 = PropertyValuesHolder.ofInt("alpha", 255, 0);
                propertyValuesHolderOfInt3.setEvaluator(new kf1(pathInterpolator2));
                float f3 = pointF.x;
                PointF pointF3 = this.q;
                PropertyValuesHolder propertyValuesHolderOfFloat5 = PropertyValuesHolder.ofFloat("x", f3, pointF3.x);
                propertyValuesHolderOfFloat5.setEvaluator(new jf1(pathInterpolator2));
                PropertyValuesHolder propertyValuesHolderOfFloat6 = PropertyValuesHolder.ofFloat("y", pointF.y, pointF3.y);
                propertyValuesHolderOfFloat6.setEvaluator(new jf1(pathInterpolator2));
                valueAnimatorOfPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(propertyValuesHolderOfInt3, propertyValuesHolderOfFloat4, propertyValuesHolderOfFloat5, propertyValuesHolderOfFloat6);
                valueAnimatorOfPropertyValuesHolder.setDuration(250L);
                valueAnimatorOfPropertyValuesHolder.setInterpolator(lf1.f);
            } else if (iOrdinal != 5) {
                qp2.n("should never happen");
                return;
            } else {
                if (ntaVar == nta.e) {
                    imageView.animate().scaleX(1.25f).scaleY(1.25f).setDuration(200L).setInterpolator(lf1.g).withEndAction(new lta(this, (byte) 0)).start();
                }
                valueAnimatorOfPropertyValuesHolder = null;
            }
        } else {
            b = 1;
            this.u = new z9h();
            float f4 = this.j;
            float dimension = getResources().getDimension(2131165823);
            z9h z9hVar = this.u;
            z9hVar.b = this.k;
            z9hVar.c = -1;
            float f5 = this.j;
            float f6 = -f5;
            z9hVar.e(f6, f6, f5, f5, f4 * 2.0f, dimension * 2.0f, 1.0f);
            float f7 = (dimension + f4) / f4;
            PropertyValuesHolder propertyValuesHolderOfFloat7 = PropertyValuesHolder.ofFloat("scale", 1.0f, 1.0f);
            PropertyValuesHolder propertyValuesHolderOfInt4 = PropertyValuesHolder.ofInt("alpha", 255, 255);
            float f8 = pointF.x;
            PropertyValuesHolder propertyValuesHolderOfFloat8 = PropertyValuesHolder.ofFloat("x", f8, f8);
            float f9 = pointF.y;
            valueAnimatorOfPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(propertyValuesHolderOfInt4, propertyValuesHolderOfFloat7, propertyValuesHolderOfFloat8, PropertyValuesHolder.ofFloat("y", f9, f9), PropertyValuesHolder.ofFloat("angle", 0.0f, 226.80002f), PropertyValuesHolder.ofFloat("progress", 0.0f, 2.52f), PropertyValuesHolder.ofFloat("shadow_scale", f7, f7));
            valueAnimatorOfPropertyValuesHolder.setDuration(3500L);
            valueAnimatorOfPropertyValuesHolder.setInterpolator(lf1.f);
        }
        this.m = valueAnimatorOfPropertyValuesHolder;
        if (valueAnimatorOfPropertyValuesHolder != null) {
            valueAnimatorOfPropertyValuesHolder.start();
            invalidate();
            return;
        }
        this.a.r.c(this);
        this.d.a(this.z);
        imageView.removeOnLayoutChangeListener(this.x);
        setOnTouchListener(null);
        this.c.a.clear();
        post(new lta(this, b));
        ghf ghfVar = this.e;
        if (ghfVar != null) {
            ((HashMap) ((wjh) ghfVar.d).e).remove((fji) ghfVar.b);
            ((aji) ghfVar.c).run();
        }
    }

    public final void b() {
        LinkedList linkedList = this.b;
        Object first = linkedList.getFirst();
        nta ntaVar = nta.c;
        if (first == ntaVar) {
            this.m.cancel();
            a();
        }
        linkedList.remove(ntaVar);
    }

    @Override // defpackage.wim
    public final void c(boolean z) {
        if (z) {
            b();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) throws Resources.NotFoundException {
        ValueAnimator valueAnimator = this.m;
        if (valueAnimator != null) {
            this.n = ((Integer) valueAnimator.getAnimatedValue("alpha")).intValue();
            this.s = ((Float) this.m.getAnimatedValue("scale")).floatValue();
            float fFloatValue = ((Float) this.m.getAnimatedValue("x")).floatValue();
            PointF pointF = this.o;
            pointF.x = fFloatValue;
            float fFloatValue2 = ((Float) this.m.getAnimatedValue("y")).floatValue();
            pointF.y = fFloatValue2;
            WindowManager.LayoutParams layoutParams = this.w;
            int i = layoutParams.x;
            int i2 = (int) pointF.x;
            if (i != i2 || layoutParams.y != ((int) fFloatValue2)) {
                layoutParams.x = i2;
                layoutParams.y = (int) fFloatValue2;
                this.v.updateViewLayout(this, layoutParams);
            }
            if (this.m.isRunning()) {
                invalidate();
            } else {
                a();
            }
            if (this.n <= 0) {
                return;
            }
            int iSave = canvas.save();
            PointF pointF2 = this.t;
            canvas.translate(pointF2.x, pointF2.y);
            float f = this.s;
            canvas.scale(f, f);
            BitmapDrawable bitmapDrawable = this.f;
            if (bitmapDrawable != null) {
                int iSave2 = canvas.save();
                canvas.translate(0.0f, this.g);
                Object animatedValue = this.m.getAnimatedValue("shadow_scale");
                if (animatedValue != null) {
                    Float f2 = (Float) animatedValue;
                    canvas.scale(f2.floatValue(), f2.floatValue());
                }
                bitmapDrawable.setAlpha(this.n);
                bitmapDrawable.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
            if (this.u != null) {
                this.u.c(canvas, (float) (((Float) this.m.getAnimatedValue("angle")).floatValue() % 360.0d), ((Float) this.m.getAnimatedValue("progress")).floatValue() % 1.0f);
            }
            float f3 = this.j;
            if (f3 > 0.0f) {
                int i3 = this.k;
                Paint paint = this.l;
                paint.setColor(i3);
                paint.setAlpha(this.n);
                canvas.drawCircle(0.0f, 0.0f, f3, paint);
            }
            RectF rectF = this.i;
            canvas.translate((-rectF.width()) / 2.0f, (-rectF.height()) / 2.0f);
            int i4 = this.n;
            if (i4 < 255) {
                canvas.saveLayerAlpha(rectF, i4, 31);
            }
            this.h.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }
}
