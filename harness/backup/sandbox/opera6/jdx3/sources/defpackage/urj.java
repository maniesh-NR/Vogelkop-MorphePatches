package defpackage;

import android.app.Application;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.gms.internal.play_billing.zzkr;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.material.tabs.TabLayout;
import com.leanplum.internal.Constants;
import java.math.BigInteger;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes.dex */
public class urj implements OnFailureListener, m2k, f06, ylo, k2m, ee5 {
    public static urj b;
    public static urj c;
    public final /* synthetic */ byte a;

    public /* synthetic */ urj(byte b2) {
        this.a = b2;
    }

    public urj(qro qroVar) {
        this.a = (byte) 11;
    }

    public static RectF b(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.C || !(view instanceof o5l)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        o5l o5lVar = (o5l) view;
        View[] viewArr = {o5lVar.b, o5lVar.c, o5lVar.d};
        int right = 0;
        int left = 0;
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            View view2 = viewArr[i];
            if (view2 != null && view2.getVisibility() == 0) {
                if (z) {
                    left = Math.min(left, view2.getLeft());
                    right = Math.max(right, view2.getRight());
                } else {
                    left = view2.getLeft();
                    right = view2.getRight();
                }
                z = true;
            }
        }
        int i2 = right - left;
        View[] viewArr2 = {o5lVar.b, o5lVar.c, o5lVar.d};
        int bottom = 0;
        int top = 0;
        boolean z2 = false;
        for (int i3 = 0; i3 < 3; i3++) {
            View view3 = viewArr2[i3];
            if (view3 != null && view3.getVisibility() == 0) {
                if (z2) {
                    top = Math.min(top, view3.getTop());
                    bottom = Math.max(bottom, view3.getBottom());
                } else {
                    top = view3.getTop();
                    bottom = view3.getBottom();
                }
                z2 = true;
            }
        }
        int i4 = bottom - top;
        int i5 = (int) hn9.i(24, o5lVar.getContext());
        if (i2 < i5) {
            i2 = i5;
        }
        int right2 = (o5lVar.getRight() + o5lVar.getLeft()) / 2;
        int bottom2 = (o5lVar.getBottom() + o5lVar.getTop()) / 2;
        int i6 = i2 / 2;
        return new RectF(right2 - i6, bottom2 - (i4 / 2), i6 + right2, (right2 / 2) + bottom2);
    }

    public static Set g(String str, Map map) {
        int iK = StringsKt.K(str, '[', 0, 6);
        if (iK >= 0) {
            return g(str.substring(0, iK), map);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List list = (List) map.get(str);
        if (list != null) {
            linkedHashSet.add(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                o95.t(g(((ajk) it.next()).b, map), linkedHashSet);
            }
        }
        return linkedHashSet;
    }

    public static dtm h(qrm qrmVar) {
        return qrmVar instanceof swg ? dtm.c : qrmVar instanceof ewa ? dtm.d : qrmVar instanceof qva ? dtm.e : z7h.t(qrmVar) ? dtm.f : qrmVar instanceof fgk ? dtm.g : dtm.h;
    }

    public static urj i() {
        urj urjVar = b;
        if (urjVar != null) {
            return urjVar;
        }
        urj urjVar2 = new urj((byte) 5);
        b = urjVar2;
        return urjVar2;
    }

    public static boolean j(long j) {
        return LocalDateTime.ofEpochSecond(j, 0, ZoneOffset.UTC).isBefore(LocalDate.now(Clock.systemUTC()).atStartOfDay());
    }

    public final /* synthetic */ Object a() {
        return new igp("StandardIntegrity");
    }

    public final Object apply(Object obj) {
        return ((zzkr) obj).zzQ();
    }

    public final String c(String str, Map map, c cVar) {
        ejk ejkVar;
        Set setG = g(str, map);
        ArrayList arrayListV = CollectionsKt.V(CollectionsKt.b0(CollectionsKt.k0(b5j.c(setG, str))), Collections.singletonList(str));
        StringBuilder sb = new StringBuilder();
        int size = arrayListV.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListV.get(i);
            i++;
            String str2 = (String) obj;
            sb.append(str2);
            sb.append('(');
            Object obj2 = map.get(str2);
            if (obj2 == null) {
                qp2.o("Required value was null.");
                return null;
            }
            sb.append(CollectionsKt.P((List) obj2, ",", (CharSequence) null, (String) null, 0, new r4k((byte) 7), 30));
            sb.append(')');
        }
        y1 y1Var = new y1(new e2(32), aib.J(sb.toString().getBytes(Charsets.UTF_8)));
        ArrayList arrayList = new ArrayList();
        tvk tvkVar = new tvk(new oji(map));
        l08<ajk> l08Var = (List) map.get(str);
        if (l08Var == null) {
            l08Var = l08.a;
        }
        for (ajk ajkVar : l08Var) {
            String str3 = ajkVar.a;
            String str4 = ajkVar.b;
            b bVar = (b) cVar.get(str3);
            if (bVar != null) {
                try {
                    l2.a.getClass();
                    ejkVar = new ejk((l2) f2.c.p(str4));
                } catch (IllegalArgumentException unused) {
                    ejkVar = (hjk) tvkVar.p(str4);
                }
                arrayList.add(f(ejkVar, map, bVar));
            }
        }
        return y4h.f(CollectionsKt.V(arrayList, Collections.singletonList(y1Var)));
    }

    public final y1 d(fjk fjkVar, Map map, b bVar) {
        hjk hjkVar = fjkVar.a;
        Integer num = fjkVar.b;
        List list = qqb.g(bVar).a;
        if (num != null) {
            if (num.intValue() != list.size()) {
                qp2.o("Failed requirement.");
                return null;
            }
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(f(hjkVar, map, (b) list.get(i)));
        }
        return new y1(new e2(32), aib.J(naa.c(y4h.f(arrayList))));
    }

    @Override // defpackage.m2k
    public final long e(long j) {
        return j;
    }

    public final y1 f(hjk hjkVar, Map map, b bVar) {
        if (!(hjkVar instanceof ejk)) {
            if (hjkVar instanceof fjk) {
                return d((fjk) hjkVar, map, bVar);
            }
            if (hjkVar instanceof gjk) {
                return new y1(new e2(32), aib.J(naa.c(c(((gjk) hjkVar).a, map, qqb.h(bVar)))));
            }
            h9o.p();
            return null;
        }
        l2 l2Var = ((ejk) hjkVar).a;
        if (l2Var instanceof a2) {
            uv uvVar = wv.Companion;
            String strL = z5i.L(qqb.i(bVar));
            uvVar.getClass();
            return new y1(a2.b, uv.b(strL));
        }
        if (l2Var instanceof b2) {
            b2 b2Var = (b2) l2Var;
            return d(new fjk(new ejk(b2Var.b), b2Var.c), map, bVar);
        }
        if (l2Var instanceof d2) {
            return new y1(d2.b, Boolean.valueOf(new BigInteger(z5i.L(qqb.i(bVar))).equals(pe3.b)));
        }
        if (l2Var instanceof e2) {
            byte[] bArrI = y4h.i(k1g.N(z5i.L(qqb.i(bVar))));
            Integer num = ((e2) l2Var).b;
            if (num == null) {
                return new y1(new e2(32), aib.J(bArrI));
            }
            return new y1(new e2(num), bArrI);
        }
        if (l2Var instanceof h2) {
            return new y1(new e2(32), aib.J(w1h.z(z5i.L(qqb.i(bVar)), Charsets.UTF_8)));
        }
        if (l2Var instanceof j2) {
            qp2.o("Tuples are not supported in EIP-712");
            return null;
        }
        boolean z = l2Var instanceof k2;
        int iIntValue = Constants.Crypt.KEY_LENGTH;
        if (z) {
            String strB = qqb.i(bVar).b();
            BigInteger bigInteger = kotlin.text.c.q(strB, "0x", true) ? new BigInteger(strB.substring(2), 16) : new BigInteger(strB);
            Integer num2 = ((k2) l2Var).d;
            if (num2 != null) {
                iIntValue = num2.intValue();
            }
            return new y1(new k2(Integer.valueOf(iIntValue)), bigInteger);
        }
        if (!(l2Var instanceof g2)) {
            h9o.p();
            return null;
        }
        String strB2 = qqb.i(bVar).b();
        BigInteger bigInteger2 = kotlin.text.c.q(strB2, "0x", true) ? new BigInteger(strB2.substring(2), 16) : new BigInteger(strB2);
        Integer num3 = ((g2) l2Var).d;
        if (num3 != null) {
            iIntValue = num3.intValue();
        }
        return new y1(new g2(Integer.valueOf(iIntValue)), bigInteger2);
    }

    public void k(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF rectFB = b(tabLayout, view);
        RectF rectFB2 = b(tabLayout, view2);
        drawable.setBounds(ze1.c(f, (int) rectFB.left, (int) rectFB2.left), drawable.getBounds().top, ze1.c(f, (int) rectFB.right, (int) rectFB2.right), drawable.getBounds().bottom);
    }

    public final void onFailure(Exception exc) {
    }

    public final Object r(x79 x79Var) {
        return new qdj((Context) x79Var.a(Context.class));
    }

    public final String toString() {
        switch (this.a) {
            case 8:
                return sko.l("CreationExtras.Key@", Integer.toString(hashCode(), CharsKt.checkRadix(16)), "<", uqh.a(Application.class).c(), ">");
            default:
                return super.toString();
        }
    }
}
