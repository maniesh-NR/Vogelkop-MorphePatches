package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class gud extends im7 {
    public final byte m;
    public final byte n;
    public hud o;
    public ptd p;

    public gud(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.m = (byte) 21;
            this.n = (byte) 22;
        } else {
            this.m = (byte) 22;
            this.n = (byte) 21;
        }
    }

    @Override // defpackage.im7, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        etd etdVar;
        int headersCount;
        eme emeVar;
        eme emeVar2;
        int iPointToPosition;
        int i;
        if (this.o != null) {
            ListAdapter adapter = getAdapter();
            int i2 = 0;
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                etdVar = (etd) headerViewListAdapter.getWrappedAdapter();
            } else {
                etdVar = (etd) adapter;
                headersCount = 0;
            }
            ptd ptdVarB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= etdVar.getCount()) ? null : etdVar.getItem(i);
            ptd ptdVar = this.p;
            if (ptdVar != ptdVarB) {
                itd itdVar = etdVar.a;
                if (ptdVar != null && (emeVar2 = this.o.C) != null) {
                    ((nl4) emeVar2.a).g.removeCallbacksAndMessages(itdVar);
                }
                this.p = ptdVarB;
                if (ptdVarB != null && (emeVar = this.o.C) != null) {
                    nl4 nl4Var = (nl4) emeVar.a;
                    Handler handler = nl4Var.g;
                    handler.removeCallbacksAndMessages(null);
                    ArrayList arrayList = nl4Var.i;
                    int size = arrayList.size();
                    while (true) {
                        if (i2 >= size) {
                            i2 = -1;
                            break;
                        }
                        if (itdVar == ((ml4) arrayList.get(i2)).b) {
                            break;
                        }
                        i2++;
                    }
                    if (i2 != -1) {
                        int i3 = i2 + 1;
                        handler.postAtTime(new ll4(emeVar, i3 < arrayList.size() ? (ml4) arrayList.get(i3) : null, ptdVarB, itdVar, (byte) 0), itdVar, SystemClock.uptimeMillis() + 200);
                    }
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null) {
            if (i == this.m) {
                if (listMenuItemView.isEnabled() && listMenuItemView.a.hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (i == this.n) {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                (adapter instanceof HeaderViewListAdapter ? (etd) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (etd) adapter).a.c(false);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }
}
