package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.opera.android.BrowserActivity;
import com.opera.android.bar.OmniButtonView;
import com.opera.android.custom_views.BottomIndicatorButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class kt3 extends l53 {
    public final /* synthetic */ byte c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kt3(Object obj, byte b) {
        this.c = b;
        this.d = obj;
    }

    @Override // defpackage.pz3
    public final lz3 c(ViewGroup viewGroup) {
        v08 v08Var;
        View view;
        xc xcVar;
        View viewFindViewById;
        byte b = this.c;
        byte b2 = 1;
        Object obj = this.d;
        switch (b) {
            case 0:
                igi igiVar = (igi) obj;
                Rect rect = new Rect();
                qb7 qb7Var = (qb7) igiVar.c;
                List listP = qb7Var.p();
                if (listP.size() < 7) {
                    v08Var = v08.a;
                } else {
                    h58 h58Var = pc.C;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = h58Var.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (((pc) next).b) {
                            arrayList.add(next);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj2 = arrayList.get(i);
                        i++;
                        if (!dq3.b.contains((pc) obj2)) {
                            arrayList2.add(obj2);
                        }
                    }
                    v08 v08VarM0 = CollectionsKt.m0(arrayList2);
                    Map map = (Map) ((zyk) qb7Var.b).getValue();
                    for (int i2 = 0; i2 < 7; i2++) {
                        ot3 ot3Var = (ot3) map.get((nt3) listP.get((listP.size() - 1) - i2));
                        if (ot3Var != null) {
                            Iterator it2 = ot3Var.b.iterator();
                            while (it2.hasNext()) {
                                v08VarM0.remove((pc) it2.next());
                            }
                        }
                    }
                    v08Var = v08VarM0;
                }
                Iterator it3 = ((Iterable) v08Var).iterator();
                while (true) {
                    if (it3.hasNext()) {
                        pc pcVar = (pc) it3.next();
                        jf jfVarE = ((fd) igiVar.d).e(pcVar);
                        if (jfVarE == null || (xcVar = jfVarE.c) == null) {
                            xcVar = pcVar.a;
                        }
                        int i3 = xcVar.d;
                        if (i3 != 0 && jfVarE != null && jfVarE.d && (viewFindViewById = ((View) igiVar.b).findViewById(i3)) != null && viewFindViewById.getGlobalVisibleRect(rect)) {
                            view = viewFindViewById;
                        }
                    } else {
                        view = null;
                    }
                }
                if (view != null) {
                    ru9 ru9Var = (ru9) igiVar.e;
                    if (!ru9Var.a.getBoolean("browser_actions_unused_button_hint_shown", false) && !ru9Var.a.getBoolean("customize_toolbar_ui_shown", false)) {
                        sxh sxhVar = new sxh(2132018466, new Object[0]);
                        int iA = fan.a(8.0f, view.getResources());
                        s6h s6hVar = new s6h();
                        s6hVar.b = igiVar;
                        s6hVar.a = new rn9(igiVar.g, (Object) mf0.k, (byte) 18);
                        return new sba(new qba(viewGroup, view, iA, 3, sxhVar, s6hVar, 2131558914, null, false));
                    }
                }
                finish(hjm.b);
                return null;
            case 1:
                int i4 = BrowserActivity.E1;
                ImageView imageViewU0 = ((BrowserActivity) obj).u0();
                lz3 lz3Var = new lz3(viewGroup, 2131558574, new l11(imageViewU0, 3, fan.a(8.0f, imageViewU0.getResources())));
                lz3Var.a(new nz3(imageViewU0));
                lz3Var.a(new q22(imageViewU0, b2));
                return lz3Var;
            case 2:
                l0h l0hVar = (l0h) obj;
                gbf gbfVar = l0hVar.e;
                OmniButtonView omniButtonViewQ = gbfVar.q();
                if (l0hVar.h < 2 || !l0h.a(l0hVar.a, l0hVar.i) || !l0hVar.c.k0() || !gbfVar.b.q() || omniButtonViewQ == null) {
                    return null;
                }
                lz3 lz3Var2 = new lz3(viewGroup, 2131559246, new l11(omniButtonViewQ, 1, fan.a(8.0f, omniButtonViewQ.getResources())));
                lz3Var2.a(new k0h(l0hVar, lz3Var2));
                return lz3Var2;
            default:
                BottomIndicatorButton bottomIndicatorButton = (BottomIndicatorButton) ((pt1) ((ala) obj).a).c;
                return new sba(new qba(viewGroup, bottomIndicatorButton, fan.a(8.0f, bottomIndicatorButton.getResources()), 3, new sxh(2132021865, new Object[0]), new z4k(this, (byte) 8), 2131558914, null, false));
        }
    }
}
