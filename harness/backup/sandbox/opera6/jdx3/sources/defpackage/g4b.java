package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class g4b extends px8 {
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g4b(msh mshVar, int i, pxh pxhVar, int i2, ox8 ox8Var, byte b) {
        super(mshVar, i, pxhVar, i2, ox8Var);
        this.f = b;
    }

    @Override // defpackage.px8
    public final List a(Context context, msh mshVar) {
        Map map;
        Map map2;
        List list = null;
        switch (this.f) {
            case 0:
                List list2 = mshVar.x;
                if (list2 != null && !list2.isEmpty()) {
                    return list2;
                }
                aum aumVar = aum.d;
                if (aumVar == null) {
                    aumVar = new aum(context);
                    aum.d = aumVar;
                }
                pu8 pu8Var = aumVar.b;
                if (pu8Var == null || (map = pu8Var.d) == null) {
                    return null;
                }
                List list3 = (List) map.get(mshVar.c);
                return list3 == null ? (List) map.get("fallback") : list3;
            default:
                List<tx8> list4 = mshVar.w;
                if (list4 == null || list4.isEmpty()) {
                    aum aumVar2 = aum.d;
                    if (aumVar2 == null) {
                        aumVar2 = new aum(context);
                        aum.d = aumVar2;
                    }
                    pu8 pu8Var2 = aumVar2.b;
                    if (pu8Var2 != null && (map2 = pu8Var2.c) != null && (list = (List) map2.get(mshVar.c)) == null) {
                        list = (List) map2.get("fallback");
                    }
                    list4 = list;
                }
                if (list4 == null || list4.isEmpty()) {
                    return list4;
                }
                ArrayList arrayList = new ArrayList();
                for (tx8 tx8Var : list4) {
                    if (!"domain".equals(tx8Var.a)) {
                        arrayList.add(tx8Var);
                    }
                }
                return arrayList;
        }
    }

    @Override // defpackage.px8
    public final int b() {
        switch (this.f) {
            case 0:
                return 2132020011;
            default:
                return super.b();
        }
    }

    @Override // defpackage.px8
    public final void c(View view) {
        switch (this.f) {
            case 1:
                this.e.f(a(view.getContext(), this.d));
                break;
            default:
                super.c(view);
                break;
        }
    }
}
