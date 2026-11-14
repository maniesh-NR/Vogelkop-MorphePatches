package defpackage;

import android.database.DataSetObserver;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes.dex */
public final class g8n extends DataSetObserver {
    public final /* synthetic */ ViewPager a;

    public g8n(ViewPager viewPager) {
        this.a = viewPager;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.a.dataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.dataSetChanged();
    }
}
