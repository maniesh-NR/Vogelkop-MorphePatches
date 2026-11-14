package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class kr4 extends y2m {
    public static final String[] F = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final s73 G = new s73(PointF.class, "topLeft", (byte) 1);
    public static final s73 H = new s73(PointF.class, "bottomRight", (byte) 2);
    public static final s73 I = new s73(PointF.class, "bottomRight", (byte) 3);
    public static final s73 J = new s73(PointF.class, "topLeft", (byte) 4);
    public static final s73 K = new s73(PointF.class, "position", (byte) 5);

    public static void P(k3m k3mVar) {
        View view = k3mVar.b;
        HashMap map = k3mVar.a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.y2m
    public final Animator n(ViewGroup viewGroup, k3m k3mVar, k3m k3mVar2) {
        int i;
        kr4 kr4Var;
        ObjectAnimator objectAnimatorOfObject;
        if (k3mVar == null) {
            return null;
        }
        HashMap map = k3mVar.a;
        if (k3mVar2 == null) {
            return null;
        }
        HashMap map2 = k3mVar2.a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = k3mVar2.b;
        Rect rect = (Rect) map.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
        int i2 = rect.left;
        int i3 = rect2.left;
        int i4 = rect.top;
        int i5 = rect2.top;
        int i6 = rect.right;
        int i7 = rect2.right;
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        int i10 = i6 - i2;
        int i11 = i8 - i4;
        int i12 = i7 - i3;
        int i13 = i9 - i5;
        Rect rect3 = (Rect) map.get("android:changeBounds:clip");
        Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
        if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
            i = 0;
        } else {
            i = (i2 == i3 && i4 == i5) ? 0 : 1;
            if (i6 != i7 || i8 != i9) {
                i++;
            }
        }
        if (rect3 == null ? rect4 != null : !rect3.equals(rect4)) {
            i++;
        }
        int i14 = i;
        if (i14 <= 0) {
            return null;
        }
        s73 s73Var = s9n.a;
        view.setLeftTopRightBottom(i2, i4, i6, i8);
        if (i14 != 2) {
            kr4Var = this;
            if (i2 == i3 && i4 == i5) {
                kr4Var.x.getClass();
                objectAnimatorOfObject = ObjectAnimator.ofObject(view, (Property<View, V>) I, (TypeConverter) null, cpj.f(i6, i8, i7, i9));
            } else {
                kr4Var.x.getClass();
                objectAnimatorOfObject = ObjectAnimator.ofObject(view, (Property<View, V>) J, (TypeConverter) null, cpj.f(i2, i4, i3, i5));
            }
        } else if (i10 == i12 && i11 == i13) {
            kr4Var = this;
            kr4Var.x.getClass();
            objectAnimatorOfObject = ObjectAnimator.ofObject(view, (Property<View, V>) K, (TypeConverter) null, cpj.f(i2, i4, i3, i5));
        } else {
            kr4Var = this;
            jr4 jr4Var = new jr4(view);
            kr4Var.x.getClass();
            ObjectAnimator objectAnimatorOfObject2 = ObjectAnimator.ofObject(jr4Var, (Property<jr4, V>) G, (TypeConverter) null, cpj.f(i2, i4, i3, i5));
            kr4Var.x.getClass();
            ObjectAnimator objectAnimatorOfObject3 = ObjectAnimator.ofObject(jr4Var, (Property<jr4, V>) H, (TypeConverter) null, cpj.f(i6, i8, i7, i9));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfObject2, objectAnimatorOfObject3);
            animatorSet.addListener(new hr4(jr4Var));
            objectAnimatorOfObject = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            viewGroup4.suppressLayout(true);
            kr4Var.r().b(new ir4(viewGroup4));
        }
        return objectAnimatorOfObject;
    }

    @Override // defpackage.y2m
    public final String[] t() {
        return F;
    }
}
