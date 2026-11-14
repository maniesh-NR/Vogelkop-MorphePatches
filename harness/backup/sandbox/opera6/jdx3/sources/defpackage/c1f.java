package defpackage;

import android.app.PendingIntent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.drawable.IconCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.RootView;
import com.opera.android.suggestion.Suggestion;
import com.opera.android.suggestion.SuggestionManagerBridge;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class c1f {
    public Object a;
    public boolean b;
    public boolean c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public c1f(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this(i != 0 ? IconCompat.d((Resources) null, "", i) : null, charSequence, pendingIntent, new Bundle());
    }

    public c1f(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
        this(iconCompat, charSequence, pendingIntent, new Bundle());
    }

    public c1f(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        this.b = true;
        this.c = true;
        this.d = iconCompat;
        this.e = l1f.c(charSequence);
        this.f = pendingIntent;
        this.g = bundle;
        this.a = null;
        this.b = true;
        this.c = true;
    }

    public c1f(RootView rootView, x7i x7iVar) {
        this.f = new HashMap();
        this.a = new ArrayList();
        this.g = new ode();
        this.b = true;
        this.d = rootView;
        this.e = x7iVar;
        txi txiVar = new txi(this, (byte) 17);
        WeakHashMap weakHashMap = r5n.a;
        h5n.c(rootView, txiVar);
    }

    public c1f(ndc ndcVar, x5f x5fVar, eyi eyiVar, ViewGroup viewGroup, RecyclerView recyclerView, SuggestionManagerBridge suggestionManagerBridge, umi umiVar, boolean z, h42 h42Var) {
        this.d = eyiVar;
        this.e = recyclerView;
        jqk jqkVar = new jqk(umiVar, suggestionManagerBridge, x5fVar);
        jqkVar.d = eyiVar;
        this.f = jqkVar;
        vqk vqkVar = new vqk(recyclerView, z);
        recyclerView.B0(vqkVar);
        this.g = vqkVar;
        this.a = new nga(viewGroup, z);
        h42Var.j(ndcVar, new w4i(new n6k((Object) this, (byte) 12), (byte) 16));
    }

    public static c1f c(View view) {
        while (!(view instanceof RootView)) {
            if (!(view.getParent() instanceof View)) {
                return null;
            }
            view = (View) view.getParent();
        }
        return ((RootView) view).x;
    }

    public final d1f a() {
        CharSequence[] charSequenceArr;
        HashSet hashSet;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = (ArrayList) this.a;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList3.get(i);
                i++;
                ith ithVar = (ith) obj;
                if (ithVar.d || (!((charSequenceArr = ithVar.c) == null || charSequenceArr.length == 0) || (hashSet = ithVar.g) == null || hashSet.isEmpty())) {
                    arrayList2.add(ithVar);
                } else {
                    arrayList.add(ithVar);
                }
            }
        }
        if (!arrayList.isEmpty()) {
        }
        return new d1f((IconCompat) this.d, (CharSequence) this.e, (PendingIntent) this.f, (Bundle) this.g, arrayList2.isEmpty() ? null : (ith[]) arrayList2.toArray(new ith[arrayList2.size()]), this.b, 0, this.c, false, 0, 0, false);
    }

    public final void b() {
        if (this.c) {
            return;
        }
        this.c = true;
        f(false);
        eyi eyiVar = (eyi) this.d;
        oqk oqkVar = (oqk) ((mrk) eyiVar.d).N.getValue();
        oqkVar.a((Suggestion) eyiVar.c, oqkVar.d);
        oqkVar.d = cl0.b;
        ((jqk) this.f).a();
        eyiVar.j();
    }

    public final void d(fck fckVar) {
        ((HashMap) this.f).put(fckVar.getView(), fckVar);
        this.c = true;
        e();
    }

    public final void e() {
        ((x7i) this.e).run();
    }

    public final void f(boolean z) {
        if (this.b != z) {
            this.b = z;
            ((mrk) ((eyi) this.d).d).c.a.b.getClass();
        }
    }

    public final void g(fck fckVar) {
        ((HashMap) this.f).remove(fckVar.getView());
        this.c = true;
        e();
    }

    public final void h() {
        ArrayList arrayList = (ArrayList) this.a;
        if (this.c) {
            this.c = false;
            arrayList.clear();
            if (((HashMap) this.f).isEmpty()) {
                return;
            }
            q9n.I((RootView) this.d, new bp(this));
            Collections.sort(arrayList, new omj((byte) 8));
        }
    }
}
