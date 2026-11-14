package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final class yy0 extends ArrayAdapter {
    public final /* synthetic */ byte a = 0;

    public /* synthetic */ yy0(Context context, int i, int i2, Object[] objArr) {
        super(context, i, i2, objArr);
    }

    public /* synthetic */ yy0(Context context, int i, Object[] objArr) {
        super(context, i, objArr);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final long getItemId(int i) {
        switch (this.a) {
            case 0:
                return i;
            default:
                return super.getItemId(i);
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        switch (this.a) {
            case 1:
                if (view == null) {
                    view = LayoutInflater.from(getContext()).inflate(2131559191, viewGroup, false);
                }
                view.setTag(Integer.valueOf(i));
                iy4 iy4Var = (iy4) getItem(i);
                ?? r3 = (OperaListItem) view;
                r3.E(new qxh(iy4Var.a));
                String str = iy4Var.b;
                r3.C(str != null ? new qxh(str) : null);
                r3.setFocusable(false);
                return view;
            default:
                return super.getView(i, view, viewGroup);
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.hasStableIds();
        }
    }
}
