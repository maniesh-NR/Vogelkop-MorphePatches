package defpackage;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;

/* loaded from: classes.dex */
public final class h2c extends PagerAdapter {
    public final PagerAdapter a;
    public boolean b;

    public h2c(PagerAdapter pagerAdapter) {
        this.a = pagerAdapter;
        pagerAdapter.registerDataSetObserver(new l46(this, (byte) 1));
    }

    public final int b(int i) {
        return this.b ? (this.a.getCount() - i) - 1 : i;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(View view, int i, Object obj) {
        this.a.destroyItem(view, b(i), obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        this.a.destroyItem(viewGroup, b(i), obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void finishUpdate(View view) {
        this.a.finishUpdate(view);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void finishUpdate(ViewGroup viewGroup) {
        this.a.finishUpdate(viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.a.getCount();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object obj) {
        int itemPosition = this.a.getItemPosition(obj);
        return itemPosition < 0 ? itemPosition : b(itemPosition);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i) {
        return this.a.getPageTitle(b(i));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final float getPageWidth(int i) {
        return this.a.getPageWidth(b(i));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(View view, int i) {
        return this.a.instantiateItem(view, b(i));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        return this.a.instantiateItem(viewGroup, b(i));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        return this.a.isViewFromObject(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void notifyDataSetChanged() {
        this.a.notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.a.registerDataSetObserver(dataSetObserver);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        this.a.restoreState(parcelable, classLoader);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Parcelable saveState() {
        return this.a.saveState();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void setPrimaryItem(View view, int i, Object obj) {
        this.a.setPrimaryItem(view, b(i), obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        this.a.setPrimaryItem(viewGroup, b(i), obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void startUpdate(View view) {
        this.a.startUpdate(view);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void startUpdate(ViewGroup viewGroup) {
        this.a.startUpdate(viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.a.unregisterDataSetObserver(dataSetObserver);
    }
}
