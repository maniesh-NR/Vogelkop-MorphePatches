package defpackage;

import android.content.Context;
import com.opera.android.ui.catalog.widget.OperaListItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class pk5 extends bmn {
    public static xq3 m;
    public static xq3 n;
    public final /* synthetic */ byte j = 0;
    public final qln k;
    public final Object l;

    public pk5(qln qlnVar, nk5 nk5Var, orm ormVar, eej eejVar, gjm gjmVar) {
        super(3, qlnVar, ormVar, eejVar, gjmVar);
        this.k = qlnVar;
        this.l = nk5Var;
    }

    public pk5(qln qlnVar, x5f x5fVar, d8j d8jVar, eej eejVar, gjm gjmVar) {
        super(2, qlnVar, x5fVar, eejVar, gjmVar);
        this.k = qlnVar;
        this.l = d8jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a3 A[PHI: r5
      0x00a3: PHI (r5v4 int) = (r5v0 int), (r5v5 int), (r5v6 int) binds: [B:9:0x003c, B:11:0x0047, B:13:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016e A[PHI: r10
      0x016e: PHI (r10v2 int) = (r10v1 int), (r10v3 int), (r10v4 int), (r10v5 int) binds: [B:25:0x00d1, B:27:0x00de, B:29:0x00e7, B:31:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.bmn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.widget.FrameLayout b(android.content.Context r21, defpackage.qf r22, defpackage.jvg r23) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pk5.b(android.content.Context, qf, jvg):android.widget.FrameLayout");
    }

    @Override // defpackage.bmn
    public final vjn c(Context context) {
        switch (this.j) {
            case 0:
                return new vjn(context, false, false);
            default:
                return new vjn(context, true, false);
        }
    }

    @Override // defpackage.bmn
    public final List d() {
        switch (this.j) {
            case 0:
                List list = ((nk5) this.l).e;
                if (list.isEmpty()) {
                    return l08.a;
                }
                List list2 = list;
                ArrayList arrayList = new ArrayList(k95.o(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(vq8.m((String) it.next()));
                }
                return this.k.k(CollectionsKt.n0(arrayList));
            default:
                return (List) ((ize) this.b.n.get()).g();
        }
    }

    public final void i(OperaListItem operaListItem, boolean z) {
        if (z) {
            u35.k(am2.b(am2.a(this.k.f())), operaListItem);
        } else {
            u35.k(2132022339, operaListItem);
        }
    }
}
