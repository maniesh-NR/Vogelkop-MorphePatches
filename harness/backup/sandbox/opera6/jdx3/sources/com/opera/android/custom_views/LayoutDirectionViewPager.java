package com.opera.android.custom_views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import defpackage.k2c;
import defpackage.l2c;

/* loaded from: classes.dex */
public class LayoutDirectionViewPager extends ViewPager implements k2c {
    public h2c a;
    public final l2c b;

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutDirectionViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new l2c(this, this, attributeSet);
    }

    @Override // defpackage.k2c
    public final l2c b() {
        return this.b;
    }

    @Override // defpackage.k2c
    public final void i(int i) {
        h2c h2cVar = this.a;
        if (h2cVar != null) {
            boolean z = i == 1;
            if (h2cVar.b != z) {
                h2cVar.b = z;
            }
        }
    }

    public final int q() {
        return r(super.getCurrentItem());
    }

    public final int r(int i) {
        return !this.b.b() ? i : (this.a.a.getCount() - 1) - i;
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        h2c h2cVar;
        boolean zB;
        if (pagerAdapter instanceof h2c) {
            h2cVar = (h2c) pagerAdapter;
            this.a = h2cVar;
        } else if (pagerAdapter != null) {
            h2cVar = new h2c(pagerAdapter);
            this.a = h2cVar;
        } else {
            h2cVar = null;
            this.a = null;
        }
        if (h2cVar != null && h2cVar.b != (zB = this.b.b())) {
            h2cVar.b = zB;
        }
        super.setAdapter(this.a);
        if (pagerAdapter != null) {
            setCurrentItem(q());
        }
    }
}
