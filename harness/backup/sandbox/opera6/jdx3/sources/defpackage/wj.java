package defpackage;

import J.N;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.jensdriller.libs.undobar.MaxWidthLinearLayout;
import com.opera.android.OperaApplication;
import com.opera.android.favorites.FavoritesBridge;
import com.opera.android.favorites.e;
import com.opera.android.suggestion.Suggestion;
import com.opera.android.undo.UndoBar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final /* synthetic */ class wj implements f7f {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wj(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final void d0(Object obj) {
        int iOrdinal;
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                wf wfVar = (wf) obj3;
                lk lkVar = (lk) obj2;
                ok okVar = (ok) obj;
                ehc ehcVarB = a.b();
                rxh rxhVar = new rxh(2132017296);
                rxh rxhVar2 = new rxh(2132017295);
                a7j a7jVar = okVar.a;
                ehcVarB.add(new ck(rxhVar, rxhVar2, a7jVar == a7j.a, kk.a));
                ehcVarB.add(new ck(new rxh(2132017300), new rxh(2132017299), a7jVar == a7j.b, kk.b));
                rxh rxhVar3 = new rxh(2132017298);
                rxh rxhVar4 = new rxh(2132017297);
                a7j a7jVar2 = a7j.c;
                ehcVarB.add(new ck(rxhVar3, rxhVar4, a7jVar == a7jVar2, kk.c));
                if (a7jVar == a7jVar2) {
                    ehcVarB.add(new bk(new rxh(2132017302)));
                    Iterator it = CollectionsKt.c0(new jk(lkVar.getResources(), (byte) 0), okVar.b).iterator();
                    while (it.hasNext()) {
                        ehcVarB.add(sgb.d0((mk) it.next()));
                    }
                    ehcVarB.add(new bk(new rxh(2132017301)));
                    Iterator it2 = CollectionsKt.c0(new jk(lkVar.getResources(), (byte) 0), okVar.c).iterator();
                    while (it2.hasNext()) {
                        ehcVarB.add(sgb.d0((mk) it2.next()));
                    }
                    ehcVarB.add(new bk(new rxh(2132017303)));
                    Iterator it3 = CollectionsKt.c0(new jk(lkVar.getResources(), (byte) 0), okVar.d).iterator();
                    while (it3.hasNext()) {
                        ehcVarB.add(sgb.d0((mk) it3.next()));
                    }
                }
                ehc ehcVarA = a.a(ehcVarB);
                eme emeVar = new eme(wfVar);
                ArrayList arrayList = (ArrayList) wfVar.d;
                j87 j87VarK = uup.k(new ik(arrayList, ehcVarA, (byte) 0), true);
                arrayList.clear();
                arrayList.addAll(ehcVarA);
                j87VarK.a(emeVar);
                break;
            case 1:
                RecyclerView recyclerView = (RecyclerView) obj2;
                dt1 dt1Var = (dt1) ((rc5) obj3).c;
                List<jfj> list = (List) obj;
                ArrayList arrayList2 = new ArrayList(k95.o(list, 10));
                for (jfj jfjVar : list) {
                    String str = jfjVar.d;
                    arrayList2.add(new Suggestion(25, str, "", str, null, null, Integer.MAX_VALUE, "", 0, -1, jfjVar));
                }
                dt1Var.K(arrayList2);
                if (!((ArrayList) dt1Var.d).isEmpty()) {
                    recyclerView.x0(0);
                    break;
                }
                break;
            case 2:
                ((FrameLayout) ((kf) obj3).c).setVisibility((((lm6) obj2).c.c() && (((Configuration) obj).screenHeightDp >= 600)) ? 0 : 8);
                break;
            case 3:
                r9i r9iVar = (r9i) obj2;
                m66 m66Var = (m66) r9iVar.c;
                l0a l0aVar = (l0a) ((m0a) ((xw) obj3).k).e.g();
                l08 l08Var = l0aVar.c;
                m66Var.findItem(2131363469).setVisible(r9n.A((dkf) r9iVar.b));
                m66Var.findItem(2131363469).setEnabled(false);
                m66Var.findItem(2131363478).setEnabled(false);
                m66Var.findItem(2131363475).setEnabled(false);
                MenuItem menuItemFindItem = m66Var.findItem(2131363046);
                menuItemFindItem.setEnabled(o0a.a.d(l08Var));
                l0aVar.b.getClass();
                menuItemFindItem.setChecked(false);
                MenuItem menuItemFindItem2 = m66Var.findItem(2131363047);
                menuItemFindItem2.setEnabled(o0a.b.d(l08Var));
                menuItemFindItem2.setChecked(false);
                break;
            case 4:
                nlh nlhVar = (nlh) obj3;
                RecyclerView recyclerView2 = (RecyclerView) obj2;
                UndoBar undoBar = nlhVar.G;
                undoBar.getClass();
                List<ilh> list2 = (List) ((List) obj).stream().filter(new zx1(undoBar, (byte) 18)).collect(Collectors.toList());
                nlhVar.G.a(true);
                boolean zE = nlhVar.z.e();
                blh blhVar = nlhVar.F;
                if (zE) {
                    xvj xvjVar = blhVar.e;
                    HashMap map = blhVar.f;
                    map.clear();
                    for (ilh ilhVar : list2) {
                        wkh wkhVar = new wkh(ilhVar);
                        wkhVar.b = blhVar.h.indexOf(Long.valueOf(ilhVar.a));
                        map.put(Long.valueOf(ilhVar.a), wkhVar);
                    }
                    xvjVar.d();
                    xvjVar.c(map.values());
                    l46 l46Var = blhVar.i;
                    if (l46Var != null) {
                        l46Var.onChanged();
                    }
                } else {
                    xvj xvjVar2 = blhVar.e;
                    HashMap map2 = blhVar.f;
                    map2.clear();
                    ArrayList arrayList3 = blhVar.h;
                    ArrayList arrayList4 = new ArrayList(arrayList3);
                    ArrayList arrayList5 = new ArrayList(list2.size());
                    for (ilh ilhVar2 : list2) {
                        wkh wkhVar2 = new wkh(ilhVar2);
                        wkhVar2.b = map2.size();
                        long j = ilhVar2.a;
                        map2.put(Long.valueOf(j), wkhVar2);
                        if (!arrayList4.remove(Long.valueOf(j))) {
                            arrayList5.add(Long.valueOf(j));
                        }
                    }
                    boolean zRemoveAll = arrayList3.removeAll(arrayList4) | arrayList3.addAll(0, arrayList5);
                    if (map2.size() == arrayList3.size()) {
                        while (i < arrayList3.size()) {
                            ((wkh) map2.get(arrayList3.get(i))).b = i;
                            i++;
                        }
                    } else {
                        zRemoveAll = true;
                    }
                    if (zRemoveAll) {
                        blhVar.j.L0(arrayList3);
                    }
                    xvjVar2.d();
                    xvjVar2.c(map2.values());
                    l46 l46Var2 = blhVar.i;
                    if (l46Var2 != null) {
                        l46Var2.onChanged();
                    }
                }
                if (!nlhVar.A) {
                    nlhVar.A = true;
                    recyclerView2.y0(nlhVar.L.c);
                    nlhVar.L.c();
                    break;
                }
                break;
            case 5:
                MaxWidthLinearLayout maxWidthLinearLayout = (MaxWidthLinearLayout) obj2;
                maxWidthLinearLayout.setBackgroundTintList(ColorStateList.valueOf(((v8k) ((cu5) obj3).f.g()).d(maxWidthLinearLayout.getContext())));
                break;
            case 6:
                ru9 ru9Var = (ru9) obj3;
                h42 h42Var = (h42) obj2;
                lpk lpkVar = (lpk) obj;
                int size = lpkVar.c.size();
                if (size != ru9Var.a.getInt("startpage.last_suggestion_count", 0)) {
                    nv6 nv6VarB = ru9Var.b();
                    ((SharedPreferences.Editor) nv6VarB.a).putInt("startpage.last_suggestion_count", size);
                    nv6VarB.w();
                }
                h42Var.r(new kpk(lpkVar, (npk) lpkVar.b));
                break;
            case 7:
                View view = ((b7k) obj3).b;
                Context context = view.getContext();
                Rect rect = ((kl5) obj).b;
                if (!((t8k) obj2).e || (iOrdinal = ddh.s(rect.height(), context).ordinal()) == 0) {
                    z = false;
                } else if (iOrdinal != 1 && iOrdinal != 2) {
                    h9o.p();
                    break;
                }
                p37.l0(z ? view.getResources().getDimensionPixelSize(2131167605) : view.getResources().getDimensionPixelSize(2131167604), view);
                break;
            case 8:
                syk sykVar = (syk) obj3;
                tq8 tq8Var = (tq8) obj2;
                if (((pkj) obj) == pkj.a) {
                    Context contextRequireContext = sykVar.requireContext();
                    String[] strArr = OperaApplication.K;
                    ((e) ((OperaApplication) contextRequireContext.getApplicationContext()).o()).getClass();
                    long jE = tq8Var.e();
                    i7f i7fVar = FavoritesBridge.a;
                    N.Mw8yLl_M(jE);
                    break;
                }
                break;
            default:
                lqh lqhVar = (lqh) obj3;
                g4l g4lVar = (g4l) obj2;
                boolean zD = ((qcc) obj).d(qcc.e);
                boolean z = lqhVar.a;
                if (zD) {
                    if (z) {
                        g4l.e(g4lVar);
                        lqhVar.a = false;
                        break;
                    }
                } else if (!z) {
                    g4l.a(g4lVar, null, 3);
                    lqhVar.a = true;
                    break;
                }
                break;
        }
    }
}
