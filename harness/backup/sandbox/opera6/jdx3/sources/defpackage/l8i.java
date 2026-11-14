package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.opera.android.view.TouchIgnoringViewPager;
import com.opera.android.widget.RoundedImageView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l8i extends PagerAdapter {
    public final umi a;
    public final TouchIgnoringViewPager b;
    public final uqe c;
    public final ghf d;
    public final q65 e;
    public final ArrayList f;
    public boolean g;

    /* JADX WARN: Multi-variable type inference failed */
    public l8i(umi umiVar, TouchIgnoringViewPager touchIgnoringViewPager, uqe uqeVar) {
        this.a = umiVar;
        this.b = touchIgnoringViewPager;
        this.c = uqeVar;
        ir5 ir5Var = new ir5();
        this.d = new ghf(touchIgnoringViewPager, ye1.a);
        this.e = new q65(new pjg(this, (byte) 26), (byte) 4);
        this.f = new ArrayList();
        touchIgnoringViewPager.setOffscreenPageLimit(5);
        touchIgnoringViewPager.setPageTransformer(false, ir5Var);
        touchIgnoringViewPager.addOnPageChangeListener(new r93(this, (byte) 2));
        touchIgnoringViewPager.addOnAttachStateChangeListener(new z61(this, (byte) 19));
    }

    public final void a() {
        if (this.g) {
            ViewPager viewPager = this.b;
            if (viewPager.isAttachedToWindow()) {
                q65 q65Var = this.e;
                if (((oml) q65Var.b) == null) {
                    int currentItem = viewPager.getCurrentItem();
                    boolean zW = cs5.W(viewPager);
                    ArrayList arrayList = this.f;
                    int size = zW ? arrayList.size() - 2 : 1;
                    int i = (currentItem == -1 || currentItem == (cs5.W(viewPager) ? 1 : arrayList.size() + (-2))) ? size : currentItem + 1;
                    q65Var.B0(this.a, 2L, TimeUnit.SECONDS);
                    if (i == size) {
                        viewPager.setCurrentItem(size, false);
                    }
                }
            }
        }
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        ImageView imageView;
        k8i k8iVar = obj instanceof k8i ? (k8i) obj : null;
        if (k8iVar == null || (imageView = (ImageView) viewGroup.findViewWithTag(Integer.valueOf(k8iVar.hashCode()))) == null) {
            return;
        }
        yne.b.c(imageView);
        viewGroup.removeView(imageView);
    }

    public final void finishUpdate(ViewGroup viewGroup) {
        super.finishUpdate(viewGroup);
        a();
    }

    public final int getCount() {
        return this.f.size();
    }

    public final int getItemPosition(Object obj) {
        int iIndexOf;
        if (!(obj instanceof k8i) || (iIndexOf = this.f.indexOf(obj)) == -1) {
            return -2;
        }
        return iIndexOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, android.widget.ImageView, com.opera.android.widget.RoundedImageView, java.lang.Object] */
    public final Object instantiateItem(ViewGroup viewGroup, int i) throws Resources.NotFoundException {
        k8i k8iVar = (k8i) this.f.get(i);
        Context context = this.b.getContext();
        ?? roundedImageView = new RoundedImageView(context, null);
        int iW = f03.w(2130970847, context, 0);
        roundedImageView.f(iW, iW);
        String str = k8iVar.b;
        String[] strArr = wqm.a;
        Uri uriD0 = a26.d0(str);
        if (uriD0 != null) {
            int dimensionPixelSize = roundedImageView.getResources().getDimensionPixelSize(2131165732);
            Point point = new Point(dimensionPixelSize, dimensionPixelSize);
            gu8.h0(this.c.m(uriD0, point.x, point.y), roundedImageView, new ga6((Object) point, (byte) 11), true, new lld((Object) roundedImageView, (byte) 21));
        }
        roundedImageView.setTag(Integer.valueOf(k8iVar.hashCode()));
        viewGroup.addView(roundedImageView);
        return k8iVar;
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return (obj instanceof k8i) && Intrinsics.a(view.getTag(), Integer.valueOf(((k8i) obj).hashCode()));
    }
}
