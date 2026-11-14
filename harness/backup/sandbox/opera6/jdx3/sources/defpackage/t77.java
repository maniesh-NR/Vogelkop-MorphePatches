package defpackage;

import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.fragment.app.i;
import androidx.fragment.app.w;
import com.appsflyer.internal.j;
import com.google.firebase.messaging.FirebaseMessaging;
import com.opera.android.custom_views.StylingImageButton;
import java.io.File;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.ToLongFunction;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t77 implements f7f {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ t77(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public t77(ndc ndcVar, bk5 bk5Var, x79 x79Var) {
        this.a = (byte) 2;
        this.b = x79Var;
        b8h.j(bk5Var.f, new d58((byte) 18)).j(ndcVar, this);
    }

    public t77(slk slkVar, m9c m9cVar) {
        this.a = (byte) 9;
        this.b = m9cVar;
        slkVar.c.g.k(this);
    }

    public t77(slk slkVar, ndc ndcVar, ode odeVar) {
        this.a = (byte) 10;
        this.b = slkVar;
        odeVar.j(ndcVar, this);
    }

    public final void a(int i) {
        t6g t6gVar = (t6g) this.b;
        byte b = 2;
        if (i == 2) {
            ((x5f) t6gVar.k).l0(gm0.m);
            t6gVar.r.r(Boolean.FALSE);
            if (t6gVar.q) {
                return;
            }
            t6gVar.q = true;
            hxk hxkVar = t6gVar.j;
            kxk kxkVar = (kxk) hxkVar;
            xih.y(kxkVar.e, (zwk) kxkVar.d.b.get(), new l31(new s6g(t6gVar, b), (byte) 3), new l31(new s6g(t6gVar, (byte) 3), (byte) 4));
        }
    }

    public final void d0(Object obj) {
        String strReplaceAll;
        byte b = this.a;
        byte b2 = 17;
        char c = 1;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                i iVar = (i) obj2;
                if (((ndc) obj) != null && i.access$200(iVar)) {
                    View viewRequireView = iVar.requireView();
                    if (viewRequireView.getParent() == null) {
                        if (i.access$000(iVar) != null) {
                            if (w.N(3)) {
                                Objects.toString(i.access$000(iVar));
                            }
                            i.access$000(iVar).setContentView(viewRequireView);
                            break;
                        }
                    } else {
                        qp2.n("DialogFragment can not be attached to a container view");
                        break;
                    }
                }
                break;
            case 1:
                Set<String> set = (Set) obj;
                c59 c59Var = (c59) obj2;
                if (c59Var.d) {
                    FirebaseMessaging firebaseMessaging = (FirebaseMessaging) r49.f((String) c59Var.h.get()).b(FirebaseMessaging.class);
                    Pattern pattern = n59.a;
                    HashSet hashSet = new HashSet(set.size());
                    for (String str : set) {
                        if (str.isEmpty()) {
                            strReplaceAll = null;
                        } else {
                            strReplaceAll = n59.a.matcher(str).replaceAll("_");
                            if (strReplaceAll.length() > 900) {
                                strReplaceAll = strReplaceAll.substring(0, 900);
                            }
                        }
                        if (strReplaceAll != null) {
                            hashSet.add(strReplaceAll);
                        }
                    }
                    Set setC = c59Var.c();
                    HashSet hashSet2 = new HashSet(setC);
                    hashSet2.removeAll(hashSet);
                    Iterator it = hashSet2.iterator();
                    while (it.hasNext()) {
                        firebaseMessaging.i.onSuccessTask(new jp5((String) it.next(), (byte) 5));
                    }
                    HashSet hashSet3 = new HashSet(hashSet);
                    hashSet3.removeAll(setC);
                    Iterator it2 = hashSet3.iterator();
                    while (it2.hasNext()) {
                        String str2 = (String) it2.next();
                        Set setC2 = c59Var.c();
                        firebaseMessaging.i.onSuccessTask(new jp5(str2, (byte) 4));
                        ((HashSet) setC2).add(str2);
                        c59Var.b().edit().putStringSet("subscribed_topics", setC2).apply();
                    }
                    if (!hashSet3.isEmpty() || !hashSet2.isEmpty()) {
                        c59Var.f = hashSet;
                        if (hashSet.isEmpty()) {
                            c59Var.b().edit().remove("subscribed_topics").apply();
                            break;
                        } else {
                            c59Var.b().edit().putStringSet("subscribed_topics", c59Var.f).apply();
                            break;
                        }
                    }
                }
                break;
            case 2:
                final x79 x79Var = (x79) obj2;
                if (((Boolean) obj).booleanValue()) {
                    View view = (View) x79Var.a;
                    if (((PopupWindow) x79Var.e) == null) {
                        PopupWindow popupWindow = new PopupWindow(LayoutInflater.from(view.getContext()).inflate(2131558982, (ViewGroup) null), -1, -1);
                        popupWindow.setClippingEnabled(false);
                        popupWindow.setOutsideTouchable(false);
                        final eq6 eq6VarF = ((qim) x79Var.b).f(null);
                        ((m24) x79Var.c).a((he) x79Var.d);
                        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: gsc
                            @Override // android.widget.PopupWindow.OnDismissListener
                            public final void onDismiss() {
                                x79 x79Var2 = x79Var;
                                ((m24) x79Var2.c).c((he) x79Var2.d);
                                eq6VarF.K();
                                x79Var2.e = null;
                            }
                        });
                        popupWindow.showAtLocation(view, 17, 0, 0);
                        x79Var.e = popupWindow;
                        break;
                    }
                } else {
                    PopupWindow popupWindow2 = (PopupWindow) x79Var.e;
                    if (popupWindow2 != null) {
                        popupWindow2.dismiss();
                        break;
                    }
                }
                break;
            case 3:
                jd7 jd7Var = (jd7) obj;
                i9c i9cVar = (i9c) obj2;
                kdb kdbVar = (kdb) i9cVar.f;
                if (kdbVar != null) {
                    i9cVar.b(jd7Var, kdbVar.a);
                    break;
                }
                break;
            case 4:
                ((StylingImageButton) ((pt1) ((igi) obj2).c).f).setEnabled(((Boolean) obj).booleanValue());
                break;
            case 5:
                u1f u1fVar = (u1f) obj2;
                if (((m18) obj) != m18.a) {
                    ((ikc) u1fVar.g).p(this);
                    u1fVar.b.K();
                    break;
                }
                break;
            case 6:
                ((dpf) obj).a((hpf) obj2);
                break;
            case 7:
                ((k6g) obj2).a();
                break;
            case 8:
                ipf ipfVar = (ipf) obj;
                if (!Intrinsics.a(ipfVar, epf.a)) {
                    if (Intrinsics.a(ipfVar, gpf.a)) {
                        ((t6g) obj2).r.r(Boolean.FALSE);
                        break;
                    } else if (ipfVar instanceof cpf) {
                        a(((cpf) ipfVar).b);
                        break;
                    } else if (ipfVar instanceof fpf) {
                        a(((fpf) ipfVar).e);
                        break;
                    } else {
                        h9o.p();
                        break;
                    }
                }
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                int i = ((qtg) obj).a;
                if (i != -1) {
                    j.d((SharedPreferences) ((m9c) obj2).b.get(), "premium_giveaway_available", i == 1);
                    break;
                }
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                h1b h1bVar = (h1b) obj;
                slk slkVar = (slk) obj2;
                a1b a1bVarU = h1bVar.u(0);
                while (a1bVarU.hasNext()) {
                    uah uahVar = (uah) a1bVarU.next();
                    a1b a1bVarU2 = uahVar.e.u(0);
                    while (true) {
                        if (a1bVarU2.hasNext()) {
                            if (zsk.f.containsKey((String) a1bVarU2.next())) {
                                new r62(slkVar.h, new qe9(slkVar, uahVar.a, uahVar.b, uahVar.c, uahVar.d, uahVar.e, (byte) 4), (byte) 1);
                            }
                        }
                    }
                }
                Stream streamFilter = h1bVar.stream().filter(new nn((byte) 10));
                final char c2 = c == true ? 1 : 0;
                Iterable iterable = (Iterable) streamFilter.sorted(Comparator.comparingLong(new ToLongFunction() { // from class: ag1
                    @Override // java.util.function.ToLongFunction
                    public final long applyAsLong(Object obj3) {
                        switch (c2) {
                            case 0:
                                return ((File) obj3).lastModified();
                            default:
                                return ((uah) obj3).g;
                        }
                    }
                }).reversed()).map(new mn(b2)).collect(Collectors.toList());
                tmk tmkVar = slkVar.b;
                Iterable iterable2 = tmkVar.k;
                if (iterable2 == null || !sfe.N(iterable, iterable2)) {
                    tmkVar.k = iterable;
                    m59 m59Var = slkVar.a;
                    oml omlVar = (oml) m59Var.e;
                    if (omlVar != null) {
                        omlVar.cancel(false);
                        m59Var.e = null;
                    }
                    m59Var.i();
                    break;
                }
                break;
            case 11:
                m9k m9kVar = (m9k) obj2;
                if (((Boolean) obj).booleanValue()) {
                    m9kVar.e.p(this);
                    oml omlVar2 = m9kVar.h;
                    if (omlVar2 != null) {
                        omlVar2.cancel(false);
                    }
                    m9kVar.h = null;
                    m9kVar.b.V(1, "has_waited_for_startup_dependencies");
                    break;
                }
                break;
            default:
                Set setKeySet = ((Map) obj).keySet();
                ujn ujnVar = ((qkn) obj2).j;
                Objects.requireNonNull(ujnVar);
                setKeySet.forEach(new pv1(ujnVar, (byte) 8));
                break;
        }
    }
}
