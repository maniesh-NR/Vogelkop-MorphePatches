package androidx.mediarouter.app;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import defpackage.cod;
import defpackage.xuf;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes.dex */
public final class a implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ HashMap a;
    public final /* synthetic */ HashMap b;
    public final /* synthetic */ d c;

    public a(d dVar, HashMap map, HashMap map2) {
        this.c = dVar;
        this.a = map;
        this.b = map2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        HashMap map;
        HashMap map2;
        xuf xufVar;
        cod codVar;
        d dVar = this.c;
        dVar.F.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        HashSet hashSet = dVar.I;
        if (hashSet == null || dVar.J == null) {
            return;
        }
        int size = hashSet.size() - dVar.J.size();
        b bVar = new b(dVar);
        int firstVisiblePosition = dVar.F.getFirstVisiblePosition();
        int i = 0;
        boolean z = false;
        while (true) {
            int childCount = dVar.F.getChildCount();
            map = this.a;
            map2 = this.b;
            if (i >= childCount) {
                break;
            }
            View childAt = dVar.F.getChildAt(i);
            cod codVar2 = (cod) dVar.G.getItem(firstVisiblePosition + i);
            Rect rect = (Rect) map.get(codVar2);
            int top = childAt.getTop();
            int i2 = rect != null ? rect.top : (dVar.P * size) + top;
            AnimationSet animationSet = new AnimationSet(true);
            HashSet hashSet2 = dVar.I;
            if (hashSet2 == null || !hashSet2.contains(codVar2)) {
                codVar = codVar2;
            } else {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                codVar = codVar2;
                alphaAnimation.setDuration(dVar.j0);
                animationSet.addAnimation(alphaAnimation);
                i2 = top;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, i2 - top, 0.0f);
            translateAnimation.setDuration(dVar.i0);
            animationSet.addAnimation(translateAnimation);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setInterpolator(dVar.l0);
            if (!z) {
                animationSet.setAnimationListener(bVar);
                z = true;
            }
            childAt.clearAnimation();
            childAt.startAnimation(animationSet);
            cod codVar3 = codVar;
            map.remove(codVar3);
            map2.remove(codVar3);
            i++;
        }
        for (Map.Entry entry : map2.entrySet()) {
            cod codVar4 = (cod) entry.getKey();
            BitmapDrawable bitmapDrawable = (BitmapDrawable) entry.getValue();
            Rect rect2 = (Rect) map.get(codVar4);
            if (dVar.J.contains(codVar4)) {
                xufVar = new xuf(bitmapDrawable, rect2);
                xufVar.h = 0.0f;
                xufVar.e = dVar.k0;
                xufVar.d = dVar.l0;
            } else {
                int i3 = dVar.P * size;
                xuf xufVar2 = new xuf(bitmapDrawable, rect2);
                xufVar2.g = i3;
                xufVar2.e = dVar.i0;
                xufVar2.d = dVar.l0;
                xufVar2.l = new c5o(dVar, codVar4, false);
                dVar.K.add(codVar4);
                xufVar = xufVar2;
            }
            dVar.F.a.add(xufVar);
        }
    }
}
