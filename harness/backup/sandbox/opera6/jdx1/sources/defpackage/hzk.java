package defpackage;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class hzk extends s75 {
    public final HashMap d;
    public final /* synthetic */ izk e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hzk(izk izkVar) {
        super(0);
        this.e = izkVar;
        this.d = new HashMap();
    }

    @Override // defpackage.s75
    public final void h(n2o n2oVar) {
        ArrayList arrayList = this.e.b;
        if ((n2oVar.a.d() & 519) != 0) {
            this.d.remove(n2oVar);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                l6h l6hVar = (l6h) arrayList.get(size);
                int i = l6hVar.c;
                boolean z = i > 0;
                int i2 = i - 1;
                l6hVar.c = i2;
                if (z && i2 == 0) {
                    ArrayList arrayList2 = l6hVar.a;
                    int size2 = arrayList2.size() - 1;
                    if (size2 >= 0) {
                        throw fki.n(size2, arrayList2);
                    }
                }
            }
        }
    }

    @Override // defpackage.s75
    public final void i(n2o n2oVar) {
        ArrayList arrayList = this.e.b;
        if ((n2oVar.a.d() & 519) != 0) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((l6h) arrayList.get(size)).c++;
            }
        }
    }

    @Override // defpackage.s75
    public final g3o j(g3o g3oVar, List list) {
        ArrayList arrayList = this.e.b;
        RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        for (int size = list.size() - 1; size >= 0; size--) {
            n2o n2oVar = (n2o) list.get(size);
            Integer num = (Integer) this.d.get(n2oVar);
            if (num != null) {
                int iIntValue = num.intValue();
                float fA = n2oVar.a.a();
                if ((iIntValue & 1) != 0) {
                    rectF.left = fA;
                }
                if ((iIntValue & 2) != 0) {
                    rectF.top = fA;
                }
                if ((iIntValue & 4) != 0) {
                    rectF.right = fA;
                }
                if ((iIntValue & 8) != 0) {
                    rectF.bottom = fA;
                }
            }
        }
        r9b.b(g3oVar.a.i(519), g3oVar.a.i(64));
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList2 = ((l6h) arrayList.get(size2)).a;
            int size3 = arrayList2.size() - 1;
            if (size3 >= 0) {
                throw fki.n(size3, arrayList2);
            }
        }
        return g3oVar;
    }

    @Override // defpackage.s75
    public final mgh k(n2o n2oVar, mgh mghVar) {
        if ((n2oVar.a.d() & 519) != 0) {
            r9b r9bVar = (r9b) mghVar.c;
            r9b r9bVar2 = (r9b) mghVar.b;
            int i = r9bVar.a != r9bVar2.a ? 1 : 0;
            if (r9bVar.b != r9bVar2.b) {
                i |= 2;
            }
            if (r9bVar.c != r9bVar2.c) {
                i |= 4;
            }
            if (r9bVar.d != r9bVar2.d) {
                i |= 8;
            }
            this.d.put(n2oVar, Integer.valueOf(i));
        }
        return mghVar;
    }
}
