package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.opera.android.ui.catalog.widget.OperaListItem;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class tab extends BaseAdapter implements Filterable {
    public final Context a;
    public final int b;
    public final HashMap c = new HashMap();
    public List d;
    public List e;
    public final zyk f;

    public tab(Context context, int i) {
        this.a = context;
        this.b = i;
        l08 l08Var = l08.a;
        this.d = l08Var;
        this.e = l08Var;
        this.f = z4c.b(new q4b(this, (byte) 4));
    }

    public final Drawable a(zt1 zt1Var) {
        if (zt1Var != null) {
            boolean z = zt1Var instanceof wt1;
            int i = this.b;
            Context context = this.a;
            if (z) {
                wt1 wt1Var = (wt1) zt1Var;
                String str = wt1Var.c;
                HashMap map = this.c;
                Drawable drawable = (Drawable) map.get(str);
                if (drawable != null) {
                    return drawable;
                }
                Bitmap bitmapL0 = scd.l0(wt1Var.a.loadIcon(context.getPackageManager()), i, i);
                PathInterpolator pathInterpolator = s8i.d;
                p8i p8iVar = new p8i(i, i / 2, context, bitmapL0);
                p8iVar.a(f03.t(2130969115, context, 2131101243));
                map.put(str, p8iVar);
                return p8iVar;
            }
            if (zt1Var instanceof yt1) {
                return ((yt1) zt1Var).a(i, context);
            }
        }
        h9o.p();
        return null;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.e.size();
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return (sab) this.f.getValue();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return (zt1) this.e.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    /* JADX WARN: Type inference failed for: r4v6, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        ?? r4 = view instanceof OperaListItem ? (OperaListItem) view : 0;
        if (r4 == 0) {
            Object objN = j7c.n(viewGroup, 2131558945, viewGroup, false);
            if (objN == null) {
                t3p.q("rootView");
                return null;
            }
            r4 = (OperaListItem) objN;
            r4.setFocusable(16);
        }
        zt1 zt1Var = (zt1) this.e.get(i);
        r4.E(new qxh(zt1Var.getName()));
        r4.z(new mxh(a(zt1Var)));
        return r4;
    }
}
