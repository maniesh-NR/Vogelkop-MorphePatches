package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.browser.WebContentsWrapper;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class n12 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ n12(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public final Object invoke() {
        byte b = this.a;
        boolean z = false;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                p12 p12Var = (p12) obj5;
                return new o12(new m12(p12Var, (k73) obj3, (u59) obj, (qs5) obj4, ((WebContentsWrapper) obj2).e()), (g7m) p12Var.e);
            case 1:
                return ((bea) obj5).j(((ekc) obj4).g(), ((ode) obj3).g(), ((qde) obj2).g(), ((ode) obj).g());
            case 2:
                ikc ikcVar = (ikc) obj4;
                ekc ekcVar = (ekc) obj3;
                ekc ekcVar2 = (ekc) obj2;
                ekc ekcVar3 = (ekc) obj;
                if (((ekc) obj5).i() && ikcVar.i() && ekcVar.i() && ekcVar2.i() && ekcVar3.i()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                return ((cq9) obj5).j(((tsd) obj4).g(), ((tsd) obj3).g(), ((tsd) obj2).g(), ((kze) obj).g());
            default:
                cok cokVar = (cok) obj4;
                p6l p6lVar = (p6l) obj;
                return new bok(ha2.M((RecyclerView) obj5, cokVar.c, 0), cokVar.i, cokVar.e, cokVar.f, cokVar.g, cokVar.j, cokVar.k, cokVar.l, cokVar.m, cokVar.n, cokVar.o, cokVar.p, (bvl) obj3, (pde) obj2, p6lVar);
        }
    }
}
