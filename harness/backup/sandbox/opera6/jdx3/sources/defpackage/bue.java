package defpackage;

import android.content.Context;
import android.net.Uri;
import com.opera.android.OperaApplication;
import com.opera.android.annotations.WeakOwner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class bue {
    public final String a;
    public final s5j b;
    public final iu2 c;

    @WeakOwner
    private zte d;

    @WeakOwner
    private aue e;
    public final /* synthetic */ vzk f;

    public bue(vzk vzkVar, String str, s5j s5jVar, iu2 iu2Var) {
        this.f = vzkVar;
        this.a = str;
        this.b = s5jVar;
        this.c = iu2Var;
        if (s5jVar.b.isEmpty()) {
            a();
        } else {
            ((LinkedHashSet) vzkVar.d).add(this);
            this.d = new zte(this, (fqe) ((wv1) vzkVar.a).get());
        }
    }

    public final void a() {
        vzk vzkVar = this.f;
        if (((esk) vzkVar.b).get() != cue.NewsFeed) {
            this.c.run(new rw7(new hjb(this.b.a)));
        } else {
            uqe uqeVarC = ((fqe) ((wv1) vzkVar.a).get()).c();
            ((LinkedHashSet) vzkVar.d).add(this);
            this.e = new aue(this, uqeVarC);
        }
    }

    public final void b(final l0c l0cVar, boolean z) {
        vzk vzkVar = this.f;
        wv1 wv1Var = (wv1) vzkVar.a;
        ((fqe) wv1Var.get()).getClass();
        g77 g77VarD = uqe.d(new rqd((byte) 16), null);
        fqe fqeVar = (fqe) wv1Var.get();
        final yte yteVar = new yte(vzkVar, g77VarD, this, z, l0cVar);
        final Context context = fqeVar.a;
        String[] strArr = OperaApplication.K;
        final jtg jtgVarD = ((OperaApplication) context.getApplicationContext()).D();
        final boolean z2 = fqeVar.k;
        c3j c3jVarD = ((d3j) e3j.t(fqeVar.a).i()).d(4, false);
        Uri uriBuild = new Uri.Builder().scheme("https").authority(c3jVarD != null ? (String) c3jVarD.d : "news.opera-api.com").build();
        ga6 ga6Var = new ga6(g77VarD, (byte) 5);
        final String str = this.a;
        new x79(context, ga6Var, l0cVar, uriBuild, str).U(new xla() { // from class: rqe
            @Override // defpackage.xla
            public final void f(yla ylaVar) {
                if (ylaVar == null) {
                    ylaVar = aib.H(context, l0cVar);
                }
                yteVar.run(new d93(ylaVar, (jtgVarD.b() && z2) ? 162411061564277257L : 162129586587566601L, str));
            }
        });
    }

    public final void c(l0c l0cVar, List list) {
        List list2 = this.b.c;
        List list3 = list;
        ArrayList arrayList = new ArrayList(k95.o(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((yqe) it.next()).a);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            String str = (String) it2.next();
            String str2 = (Intrinsics.a(str, "<existing>") || arrayList.contains(str)) ? str : null;
            if (str2 != null) {
                arrayList2.add(str2);
            }
        }
        boolean zIsEmpty = list2.isEmpty();
        iu2 iu2Var = this.c;
        if (zIsEmpty || !arrayList2.isEmpty()) {
            iu2Var.run(new sw7(new t5j(l0cVar != null ? l0cVar.toString() : null, arrayList2)));
        } else {
            iu2Var.run(new rw7(kye.b));
        }
    }
}
