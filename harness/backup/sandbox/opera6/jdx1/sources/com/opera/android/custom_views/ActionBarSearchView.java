package com.opera.android.custom_views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.CollapsibleActionView;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public class ActionBarSearchView extends SearchView {
    public static final /* synthetic */ int j0 = 0;
    public CollapsibleActionView i0;

    public ActionBarSearchView(Context context) {
        super(context, null);
        v();
    }

    public ActionBarSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        v();
    }

    public ActionBarSearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        v();
    }

    @Override // androidx.appcompat.widget.SearchView, defpackage.j85
    public void onActionViewCollapsed() {
        super.onActionViewCollapsed();
        CollapsibleActionView collapsibleActionView = this.i0;
        if (collapsibleActionView != null) {
            collapsibleActionView.onActionViewCollapsed();
        }
    }

    @Override // androidx.appcompat.widget.SearchView, defpackage.j85
    public void onActionViewExpanded() {
        super.onActionViewExpanded();
        CollapsibleActionView collapsibleActionView = this.i0;
        if (collapsibleActionView != null) {
            collapsibleActionView.onActionViewExpanded();
        }
    }

    public void setActionViewObserver(@Nullable CollapsibleActionView collapsibleActionView) {
        this.i0 = collapsibleActionView;
    }

    public final void v() {
        u7 u7Var = new u7(this, (byte) 1);
        dll dllVarS = q9n.s(this);
        if (dllVarS != null) {
            u8n.b(dllVarS, this, u7Var);
        }
        u7Var.a(this);
        setMaxWidth(Integer.MAX_VALUE);
    }
}
