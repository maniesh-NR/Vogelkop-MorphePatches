package defpackage;

import com.opera.android.custom_views.LayoutDirectionViewPager;
import java.util.Objects;

/* loaded from: classes.dex */
public final class r2c implements e8n {
    public final e8n a;
    public final /* synthetic */ LayoutDirectionViewPager b;

    public r2c(LayoutDirectionViewPager layoutDirectionViewPager, e8n e8nVar) {
        Objects.requireNonNull(layoutDirectionViewPager);
        this.b = layoutDirectionViewPager;
        this.a = e8nVar;
    }

    public final void onPageScrollStateChanged(int i) {
        this.a.onPageScrollStateChanged(i);
    }

    public final void onPageScrolled(int i, float f, int i2) {
        this.a.onPageScrolled(this.b.r(i), f, i2);
    }

    public final void onPageSelected(int i) {
        this.a.onPageSelected(this.b.r(i));
    }
}
