package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.LayoutDirectionLinearLayout;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.undo.UndoBar;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class qmj extends d implements Filterable {
    public final Context a;
    public final UndoBar b;
    public final Callback c;
    public ArrayList d;
    public List e;
    public final TreeSet f;
    public CharSequence g;

    public qmj(Context context, Collection collection, UndoBar undoBar, Callback callback) {
        this.a = context;
        ArrayList arrayList = new ArrayList(collection);
        this.d = arrayList;
        Collections.sort(arrayList);
        this.e = this.d;
        this.f = new TreeSet(new omj((byte) 0));
        this.b = undoBar;
        this.c = callback;
    }

    public final void G() {
        int size = this.e.size();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        UndoBar undoBar = this.b;
        mhk mhkVar = (mhk) undoBar.c.b;
        mhkVar.b = 0;
        ((LinkedList) mhkVar.c).clear();
        undoBar.a(false);
        notifyItemRangeRemoved(0, size);
    }

    public final void H(List list) {
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            ArrayList arrayList2 = this.d;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    break;
                }
                Object obj2 = arrayList2.get(i2);
                i2++;
                String str2 = (String) obj2;
                if (str2.equals(str)) {
                    arrayList2.remove(str2);
                    break;
                }
            }
            List list2 = this.e;
            Iterator it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    String str3 = (String) it.next();
                    if (str3.equals(str)) {
                        list2.remove(str3);
                        break;
                    }
                }
            }
            this.f.remove(str);
        }
    }

    public final boolean I() {
        return this.d.size() == this.f.size();
    }

    public final void J(String str) {
        this.b.c(Collections.singletonList(str));
        this.f.add(str);
        new c83(this).filter(this.g);
    }

    public final void K(e5d e5dVar) {
        Iterator it = e5dVar.iterator();
        while (it.hasNext()) {
            this.f.remove(((guh) it.next()).a);
        }
        new c83(this).filter(this.g);
    }

    public final void L(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        this.d = arrayList;
        Collections.sort(arrayList);
        new c83(this).filter(this.g);
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return new c83(this);
    }

    public final int getItemCount() {
        return this.e.size();
    }

    public final void onBindViewHolder(i iVar, int i) {
        pmj pmjVar = (pmj) iVar;
        String str = (String) this.e.get(i);
        String strG = wqm.G(str);
        if (strG.endsWith("/")) {
            strG = p3p.h(1, 0, strG);
        }
        pmjVar.b.setText(strG);
        pmjVar.c = str;
    }

    public final i onCreateViewHolder(ViewGroup viewGroup, int i) {
        kf kfVarJ = kf.j(LayoutInflater.from(viewGroup.getContext()), viewGroup);
        pmj pmjVar = new pmj((LayoutDirectionLinearLayout) kfVarJ.b, (StylingTextView) kfVarJ.c);
        if (this.c != null) {
            ((i) pmjVar).itemView.setOnClickListener(new ohi(new j5g(this, pmjVar, (byte) 15), (byte) 0));
        }
        return pmjVar;
    }
}
