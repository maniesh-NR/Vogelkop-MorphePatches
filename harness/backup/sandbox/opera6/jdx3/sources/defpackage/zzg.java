package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.leanplum.internal.RequestBuilder;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzg extends y2m {
    public static final String[] F = {"com.opera.android:PrivacyMonitorFragmentTransition:value_type", "com.opera.android:PrivacyMonitorFragmentTransition:height", "com.opera.android:PrivacyMonitorFragmentTransition:layout_params_height"};

    public final void f(k3m k3mVar) {
        HashMap map = k3mVar.a;
        map.put("com.opera.android:PrivacyMonitorFragmentTransition:value_type", "end");
        View view = k3mVar.b;
        view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), 0);
        map.put("com.opera.android:PrivacyMonitorFragmentTransition:height", Integer.valueOf(view.getMeasuredHeight()));
    }

    public final void j(k3m k3mVar) {
        HashMap map = k3mVar.a;
        map.put("com.opera.android:PrivacyMonitorFragmentTransition:value_type", RequestBuilder.ACTION_START);
        View view = k3mVar.b;
        int height = view.getHeight();
        map.put("com.opera.android:PrivacyMonitorFragmentTransition:height", Integer.valueOf(height));
        if (view.getParent() instanceof View) {
            View view2 = (View) view.getParent();
            map.put("com.opera.android:PrivacyMonitorFragmentTransition:layout_params_height", Integer.valueOf(view2.getLayoutParams().height));
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = height;
                view2.setLayoutParams(layoutParams);
            }
        }
    }

    public final Animator n(ViewGroup viewGroup, k3m k3mVar, k3m k3mVar2) {
        if (k3mVar == null) {
            return null;
        }
        HashMap map = k3mVar.a;
        if (k3mVar2 == null) {
            return null;
        }
        View view = k3mVar2.b;
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f));
        if (view.getParent() instanceof View) {
            View view2 = (View) view.getParent();
            Object obj = map.get("com.opera.android:PrivacyMonitorFragmentTransition:height");
            int iIntValue = obj != null ? ((Integer) obj).intValue() : 0;
            Object obj2 = k3mVar2.a.get("com.opera.android:PrivacyMonitorFragmentTransition:height");
            int iIntValue2 = obj2 != null ? ((Integer) obj2).intValue() : 0;
            Integer num = (Integer) map.get("com.opera.android:PrivacyMonitorFragmentTransition:layout_params_height");
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iIntValue, iIntValue2);
            valueAnimatorOfInt.addUpdateListener(new lt7(this, view2));
            if (num != null) {
                valueAnimatorOfInt.addListener(new yzg(this, view2, num));
            }
            arrayList.add(valueAnimatorOfInt);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new zp8());
        animatorSet.playTogether(arrayList);
        return animatorSet;
    }

    public final String[] t() {
        return F;
    }
}
