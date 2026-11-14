package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.LayoutDirectionLinearLayout;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.android.undo.UndoBar;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class d83 extends d implements Filterable {
    public final /* synthetic */ byte a = 1;
    public Object b;
    public List c;
    public Object d;
    public Object e;
    public Object f;

    public d83(ArrayList arrayList, UndoBar undoBar) {
        this.b = undoBar;
        ArrayList arrayList2 = new ArrayList(arrayList);
        n95.q(arrayList2);
        this.c = arrayList2;
        this.d = new ArrayList(arrayList2);
        this.e = new TreeSet();
    }

    public d83(jh3 jh3Var) {
        this.f = jh3Var;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        switch (this.a) {
            case 0:
                c83 c83Var = (c83) this.e;
                if (c83Var != null) {
                    return c83Var;
                }
                c83 c83Var2 = new c83(this, (byte) 0);
                this.e = c83Var2;
                return c83Var2;
            default:
                return new c83(this, (byte) 4);
        }
    }

    public final int getItemCount() {
        switch (this.a) {
            case 0:
                List list = this.c;
                if (list == null) {
                    return 0;
                }
                return list.size();
            default:
                return ((ArrayList) this.d).size();
        }
    }

    public final void onBindViewHolder(i iVar, int i) {
        switch (this.a) {
            case 0:
                e83 e83Var = (e83) iVar;
                List list = this.c;
                if (list != null) {
                    w3g w3gVar = (w3g) list.get(i);
                    boolean z = ((jh3) this.f).u;
                    nf nfVar = new nf(this, w3gVar, (byte) 14);
                    e83Var.b = w3gVar;
                    OperaListItem operaListItem = (OperaListItem) ((i) e83Var).itemView;
                    operaListItem.E(new qxh(w3gVar.c));
                    operaListItem.C(!z ? new qxh(w3gVar.f) : null);
                    operaListItem.setOnClickListener(nfVar);
                    break;
                }
                break;
            default:
                mdo mdoVar = (mdo) iVar;
                ldo ldoVar = (ldo) ((ArrayList) this.d).get(i);
                q5g q5gVar = mdoVar.b;
                ((StylingTextView) q5gVar.d).setText(ldoVar.b);
                ((StylingTextView) q5gVar.c).setText(ldoVar.d);
                mdoVar.c = ldoVar.a;
                break;
        }
    }

    public final i onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (this.a) {
            case 0:
                return new e83(j7c.n(viewGroup, 2131558542, viewGroup, false));
            default:
                View viewN = j7c.n(viewGroup, 2131559583, viewGroup, false);
                int i2 = 2131365119;
                StylingTextView stylingTextView = (StylingTextView) w1h.j(2131365119, viewN);
                if (stylingTextView != null) {
                    i2 = 2131365120;
                    StylingTextView stylingTextView2 = (StylingTextView) w1h.j(2131365120, viewN);
                    if (stylingTextView2 != null) {
                        return new mdo(new q5g((LayoutDirectionLinearLayout) viewN, stylingTextView, stylingTextView2, (byte) 18));
                    }
                }
                t3p.q("Missing required view with ID: ".concat(viewN.getResources().getResourceName(i2)));
                return null;
        }
    }
}
