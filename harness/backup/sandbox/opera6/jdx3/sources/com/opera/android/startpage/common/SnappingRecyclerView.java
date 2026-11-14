package com.opera.android.startpage.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.i;
import com.opera.android.theme.ThemeableRecyclerView;

/* loaded from: classes.dex */
public class SnappingRecyclerView extends ThemeableRecyclerView {
    public SnappingRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean O(int i, int i2) {
        View viewFindViewByPosition;
        if (((RecyclerView) this).n != null && !isLayoutSuppressed()) {
            boolean zCanScrollHorizontally = ((RecyclerView) this).n.canScrollHorizontally();
            if (!(((RecyclerView) this).n instanceof LinearLayoutManager) || !zCanScrollHorizontally) {
                return super.O(i, i2);
            }
            if (Math.abs(i) < ((RecyclerView) this).W) {
                i = 0;
            }
            if (i != 0) {
                float f = i;
                float f2 = i2;
                if (!dispatchNestedPreFling(f, f2)) {
                    dispatchNestedFling(f, f2, true);
                    LinearLayoutManager linearLayoutManager = ((RecyclerView) this).n;
                    int iFindFirstVisibleItemPosition = (getLayoutDirection() != 0 ? i >= 0 : i <= 0) ? linearLayoutManager.findFirstVisibleItemPosition() : linearLayoutManager.findLastVisibleItemPosition();
                    if (((RecyclerView) this).m.getItemCount() > 1) {
                        i iVarN = N(iFindFirstVisibleItemPosition, false);
                        if (iVarN != null && iVarN.itemView.getWidth() < getWidth() / 2) {
                            return super.O(i, i2);
                        }
                        int iT = cs5.t(iFindFirstVisibleItemPosition, 0, ((RecyclerView) this).m.getItemCount() - 1);
                        f fVar = ((RecyclerView) this).n;
                        if (fVar != null && (fVar instanceof LinearLayoutManager) && fVar.canScrollHorizontally() && (viewFindViewByPosition = fVar.findViewByPosition(iT)) != null) {
                            G0(viewFindViewByPosition.getLeft() - ((getWidth() - viewFindViewByPosition.getWidth()) / 2), 0, false);
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean canScrollHorizontally(int i) {
        return ((RecyclerView) this).n.canScrollHorizontally() || super/*android.view.View*/.canScrollHorizontally(i);
    }
}
