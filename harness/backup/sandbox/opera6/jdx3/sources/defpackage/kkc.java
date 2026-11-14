package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class kkc implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ kkc(er9 er9Var, ekc ekcVar, ikc ikcVar, ekc ekcVar2, ekc ekcVar3, ekc ekcVar4) {
        this.a = (byte) 1;
        this.c = er9Var;
        this.b = ekcVar;
        this.d = ikcVar;
        this.e = ekcVar2;
        this.f = ekcVar3;
        this.g = ekcVar4;
    }

    public /* synthetic */ kkc(i7k i7kVar, pde pdeVar, lg lgVar, fd fdVar, hv3 hv3Var, tsd tsdVar) {
        this.a = (byte) 3;
        this.b = i7kVar;
        this.d = pdeVar;
        this.e = lgVar;
        this.f = fdVar;
        this.g = hv3Var;
        this.c = tsdVar;
    }

    public /* synthetic */ kkc(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    public final Object invoke() {
        byte b = this.a;
        byte b2 = 1;
        byte b3 = 0;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(((ekc) obj6).i() && ((tsd) obj5).i() && ((tsd) obj4).i() && ((tsd) obj3).i() && ((tsd) obj2).i() && ((tsd) obj).i());
            case 1:
                return ((er9) obj5).m(((ekc) obj6).g(), ((ikc) obj4).g(), ((ekc) obj3).g(), ((ekc) obj2).g(), ((ekc) obj).g());
            case 2:
                rji rjiVar = (rji) obj6;
                c67 c67Var = (c67) obj5;
                vji vjiVar = (vji) obj4;
                String str = (String) obj3;
                Object[] objArr = (Object[]) obj;
                if (rjiVar.b != vjiVar) {
                    rjiVar.b = vjiVar;
                    b3 = 1;
                }
                if (Intrinsics.a(rjiVar.c, str)) {
                    b2 = b3;
                } else {
                    rjiVar.c = str;
                }
                rjiVar.a = c67Var;
                rjiVar.d = obj2;
                rjiVar.e = objArr;
                p8f p8fVar = rjiVar.f;
                if (p8fVar != null && b2 != 0) {
                    p8fVar.K();
                    rjiVar.f = null;
                    rjiVar.d();
                }
                return Unit.a;
            case 3:
                pde pdeVar = (pde) obj4;
                lg lgVar = (lg) obj3;
                fd fdVar = (fd) obj2;
                hv3 hv3Var = (hv3) obj;
                tsd tsdVar = (tsd) obj5;
                ViewGroup viewGroup = ((i7k) obj6).d;
                View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131559361, viewGroup, false);
                int i = 2131362981;
                ImageView imageView = (ImageView) w1h.j(2131362981, viewInflate);
                if (imageView != null) {
                    i = 2131363072;
                    if (w1h.j(2131363072, viewInflate) != null) {
                        i = 2131363073;
                        if (w1h.j(2131363073, viewInflate) != null) {
                            i = 2131363119;
                            if (w1h.j(2131363119, viewInflate) != null) {
                                i = 2131363120;
                                if (((TextView) w1h.j(2131363120, viewInflate)) != null) {
                                    i = 2131363729;
                                    ConstraintLayout constraintLayoutJ = w1h.j(2131363729, viewInflate);
                                    if (constraintLayoutJ != null) {
                                        i = 2131364155;
                                        ImageView imageView2 = (ImageView) w1h.j(2131364155, viewInflate);
                                        if (imageView2 != null) {
                                            i = 2131364173;
                                            ImageView imageView3 = (ImageView) w1h.j(2131364173, viewInflate);
                                            if (imageView3 != null) {
                                                or2 or2Var = new or2((FrameLayout) viewInflate, imageView, constraintLayoutJ, imageView2, imageView3, (byte) 25);
                                                FrameLayout frameLayout = (FrameLayout) or2Var.c;
                                                h7k h7kVar = new h7k(frameLayout);
                                                kze kzeVarZ = p37.z(frameLayout);
                                                f1p f1pVar = new f1p();
                                                f1pVar.a = or2Var;
                                                f1pVar.b = pdeVar;
                                                a26.T(pdeVar, kzeVarZ, new d8d(f1pVar, (byte) 13));
                                                new k5o(kzeVarZ, or2Var, tsdVar);
                                                ImageView imageView4 = (ImageView) or2Var.f;
                                                new zg(kzeVarZ, imageView4, lgVar);
                                                new qb7(kzeVarZ, (ImageView) or2Var.d, (ImageView) or2Var.b, fdVar);
                                                ((ConstraintLayout) or2Var.e).setOnClickListener(new mze(hv3Var, b3));
                                                imageView4.setOnClickListener(new mze(hv3Var, z ? (byte) 1 : (byte) 0));
                                                return h7kVar;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
                return null;
            default:
                return Boolean.valueOf(((dtk) obj6).a((ctk) obj5, (ArrayList) obj4, (LinkedHashMap) obj3, (List) obj2, (ArrayList) obj));
        }
    }
}
