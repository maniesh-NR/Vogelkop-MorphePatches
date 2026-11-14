package defpackage;

import android.view.LayoutInflater;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.opera.android.custom_views.FadingRecyclerView;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lqon;", "Lltl;", "<init>", "()V", "non", "pon", "x93", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class qon extends ltl {
    public qon() {
        u7k u7kVarE = u7k.e();
        qxh qxhVar = new qxh("Weather icon preview");
        itl itlVar = (itl) u7kVarE.a;
        itlVar.a = qxhVar;
        super(itlVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ltl
    public final void B0(LayoutInflater layoutInflater, FadingRecyclerView fadingRecyclerView) {
        fadingRecyclerView.getContext();
        fadingRecyclerView.C0(new LinearLayoutManager());
        List listC0 = CollectionsKt.c0(new w8l((byte) 10), lon.e);
        ArrayList arrayList = new ArrayList(k95.o(listC0, 10));
        Iterator it = listC0.iterator();
        while (it.hasNext()) {
            arrayList.add(new non((lon) it.next()));
        }
        fadingRecyclerView.y0(new x93((AbstractList) arrayList, (byte) 6));
    }
}
