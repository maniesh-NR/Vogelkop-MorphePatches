package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.itd;
import defpackage.ptd;
import defpackage.qud;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements qud, AdapterView.OnItemClickListener {
    public static final int[] b = {R.attr.background, R.attr.divider};
    public itd a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        ghf ghfVarH = ghf.H(R.attr.listViewStyle, 0, context, attributeSet, b);
        TypedArray typedArray = (TypedArray) ghfVarH.c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(ghfVarH.t(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(ghfVarH.t(1));
        }
        ghfVarH.J();
    }

    @Override // defpackage.qud
    public final void b(itd itdVar) {
        this.a = itdVar;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.a.q((ptd) getAdapter().getItem(i), null, 0);
    }
}
