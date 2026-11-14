package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ShareActionProvider;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class gh implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
    public final /* synthetic */ hh a;

    public gh(hh hhVar) {
        this.a = hhVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        hh hhVar = this.a;
        if (view != hhVar.g) {
            if (view != hhVar.e) {
                hai.d();
                return;
            } else {
                hhVar.m = false;
                hhVar.d(hhVar.n);
                return;
            }
        }
        hhVar.a();
        this.a.a.a.e();
        bh bhVar = this.a.a.a;
        synchronized (bhVar.a) {
            bhVar.a();
            ArrayList arrayList = bhVar.b;
            if (arrayList.size() > 0) {
                if (arrayList.get(0) != null) {
                    throw new ClassCastException();
                }
                throw null;
            }
        }
        synchronized (this.a.a.a.a) {
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ShareActionProvider shareActionProvider = this.a.i;
        if (shareActionProvider != null) {
            shareActionProvider.j(false);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int itemViewType = ((fh) adapterView.getAdapter()).getItemViewType(i);
        if (itemViewType != 0) {
            if (itemViewType == 1) {
                this.a.d(Integer.MAX_VALUE);
                return;
            } else {
                hai.d();
                return;
            }
        }
        this.a.a();
        hh hhVar = this.a;
        if (!hhVar.m) {
            fh fhVar = hhVar.a;
            boolean z = fhVar.c;
            synchronized (fhVar.a.a) {
            }
            return;
        }
        if (i <= 0) {
            return;
        }
        bh bhVar = hhVar.a.a;
        synchronized (bhVar.a) {
            bhVar.a();
            if (bhVar.b.get(i) != null) {
                throw new ClassCastException();
            }
            if (bhVar.b.get(0) != null) {
                throw new ClassCastException();
            }
            throw null;
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        hh hhVar = this.a;
        if (view != hhVar.g) {
            hai.d();
            return false;
        }
        if (hhVar.a.getCount() > 0) {
            hhVar.m = true;
            hhVar.d(hhVar.n);
        }
        return true;
    }
}
