package defpackage;

import J.N;
import ads_mobile_sdk.gv2;
import ads_mobile_sdk.j21;
import ads_mobile_sdk.lw0;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import com.opera.android.BrowserActivity;
import com.opera.android.bar.TopToolbarContainer;
import com.opera.android.browser.BrowserFragment;
import com.opera.android.browser.chromium.ChromiumContainerView;
import com.opera.api.Callback;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.RealWebSocket;
import org.chromium.components.embedder_support.view.ContentViewRenderView;
import org.chromium.ui.resources.ResourceManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class pr implements wdp {
    public int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public pr(byte b) {
        switch (b) {
            case 9:
                this.a = -1;
                this.c = new LinkedHashMap();
                break;
            default:
                this.b = new pga[32];
                this.c = new float[32];
                this.d = new byte[32];
                tee teeVar = jmi.a;
                this.e = new tee();
                this.f = new tee();
                break;
        }
    }

    public pr(BrowserActivity browserActivity, mt3 mt3Var, bvl bvlVar, BrowserFragment browserFragment) {
        this.b = mt3Var;
        this.c = bvlVar;
        this.d = browserFragment;
        this.a = browserFragment.getResources().getDimensionPixelSize(2131167744);
        this.f = new g9l(this, (byte) 6);
        oup.l0(browserActivity.getLifecycle(), new gil(this, browserActivity, (byte) 5), new cvl(this, (byte) 0), (Function1) null, (Function1) null, 12);
    }

    public pr(ouh ouhVar) {
        this.b = ouhVar;
        this.c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.e = new PriorityQueue();
        this.a = -1;
    }

    public static HashMap n(orb orbVar) {
        JSONObject jSONObject = orbVar.a;
        HashMap map = new HashMap(jSONObject.length());
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, orbVar.a(next));
        }
        return map;
    }

    public final void A(Runnable runnable) {
        szk szkVar = (szk) this.b;
        if (szkVar.a.getLooper().getThread().isAlive()) {
            szkVar.c(runnable);
        }
    }

    public final void B(long j, boolean z, Map map, Object obj, boolean z2) {
        if (((r72) this.f) == null) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(j);
            jSONArray.put(z);
            orb orbVar = new orb();
            for (Map.Entry entry : map.entrySet()) {
                orbVar.p(entry.getValue(), (String) entry.getKey());
            }
            jSONArray.put(orb.t(orbVar));
            if (z2) {
                jSONArray.put(orb.t(obj));
            }
            ewn ewnVar = (ewn) this.b;
            String str = jSONArray.toString() + "\n";
            RealWebSocket realWebSocket = ewnVar.c;
            if (realWebSocket == null) {
                return;
            }
            realWebSocket.send(str);
        }
    }

    public final void C(dvl dvlVar) {
        if (Intrinsics.a(dvlVar, (dvl) this.e)) {
            return;
        }
        dvl dvlVar2 = (dvl) this.e;
        if (dvlVar2 != null) {
            BrowserFragment browserFragment = (BrowserFragment) this.d;
            TopToolbarContainer topToolbarContainer = dvlVar2.a;
            topToolbarContainer.g = null;
            topToolbarContainer.h = null;
            ckf ckfVar = browserFragment.p.a;
            N.M2kLPVIp(((ContentViewRenderView) ckfVar).a);
            qp7 qp7Var = (qp7) ((ResourceManager) N.MCvGcnn7(((ContentViewRenderView) ckfVar).a)).a.get(1);
            SparseArray sparseArray = qp7Var.c;
            pp7 pp7Var = (pp7) sparseArray.get(2131364811);
            if (pp7Var != null) {
                sparseArray.remove(2131364811);
                vvl vvlVar = pp7Var.a;
                vvlVar.i.c(pp7Var.b);
                ResourceManager resourceManager = ((czh) qp7Var).b;
                byte b = ((czh) qp7Var).a;
                if (b == 2 || b == 1) {
                    long j = resourceManager.b;
                    if (j != 0) {
                        N.MxwZmAzJ(j, b, 2131364811);
                    }
                }
            }
            this.e = null;
        }
        ((bvl) this.c).getOffset().p((g9l) this.f);
        this.e = dvlVar;
        y();
    }

    public final void D(int i) {
        z4o.H(i >= 0);
        this.a = i;
        m(i);
    }

    public final void E() {
        int iC;
        int i = this.a;
        if (i == 0) {
            return;
        }
        ode odeVar = (ode) this.d;
        tta ttaVar = (tta) ((pde) this.b).g();
        int iIntValue = ((Number) ((pde) this.c).g()).intValue();
        sta staVar = ttaVar.h;
        int i2 = staVar.a;
        int i3 = i - (iIntValue << 1);
        int i4 = ttaVar.c;
        int i5 = i4;
        int i6 = 1;
        while (i6 < 16 && i5 + i2 + i4 <= i3) {
            i5 += i2 + i4;
            i6++;
        }
        if (i6 > 1) {
            iC = djh.c((i3 - (i4 * i6)) / (i6 - 1), i2, staVar.b);
        } else {
            iC = 0;
        }
        xf8.E0(odeVar, new gr8(i6, i4, iC, ttaVar.a));
    }

    public final int F(int i, int i2) {
        int i3;
        int i4;
        vng vngVar = (vng) this.b;
        ArrayList arrayList = (ArrayList) this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            or orVar = (or) arrayList.get(size);
            byte b = orVar.a;
            int i5 = orVar.b;
            if (b == 8) {
                int i6 = orVar.d;
                if (i5 < i6) {
                    i4 = i6;
                    i3 = i5;
                } else {
                    i3 = i6;
                    i4 = i5;
                }
                if (i < i3 || i > i4) {
                    if (i < i5) {
                        if (i2 == 1) {
                            orVar.b = i5 + 1;
                            orVar.d = i6 + 1;
                        } else if (i2 == 2) {
                            orVar.b = i5 - 1;
                            orVar.d = i6 - 1;
                        }
                    }
                } else if (i3 == i5) {
                    if (i2 == 1) {
                        orVar.d = i6 + 1;
                    } else if (i2 == 2) {
                        orVar.d = i6 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        orVar.b = i5 + 1;
                    } else if (i2 == 2) {
                        orVar.b = i5 - 1;
                    }
                    i--;
                }
            } else if (i5 <= i) {
                if (b == 1) {
                    i -= orVar.d;
                } else if (b == 2) {
                    i += orVar.d;
                }
            } else if (i2 == 1) {
                orVar.b = i5 + 1;
            } else if (i2 == 2) {
                orVar.b = i5 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            or orVar2 = (or) arrayList.get(size2);
            byte b2 = orVar2.a;
            int i7 = orVar2.d;
            if (b2 == 8) {
                if (i7 == orVar2.b || i7 < 0) {
                    arrayList.remove(size2);
                    orVar2.c = null;
                    vngVar.c(orVar2);
                }
            } else if (i7 <= 0) {
                arrayList.remove(size2);
                orVar2.c = null;
                vngVar.c(orVar2);
            }
        }
        return i;
    }

    public final void G(Object obj) {
        Object obj2 = this.e;
        this.e = obj;
        if (obj2.equals(obj)) {
            return;
        }
        qi8 qi8Var = ((fi8) this.d).b;
        ((Integer) obj2).getClass();
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        qi8Var.Y0();
        qi8Var.O0(1, 10, num);
        qi8Var.O0(2, 10, num);
        qi8Var.n.i(21, new gz3((byte) 5, iIntValue));
    }

    public final j21 a() {
        int i = this.a;
        if (i >= 0) {
            return new j21(i, (String) this.b, (LinkedHashMap) this.c, (gv2) this.d, (cd5) this.e, (String) this.f);
        }
        t14.c(sko.i(i, "Invalid status code: "));
        return null;
    }

    @Override // defpackage.wdp
    /* renamed from: a, reason: collision with other method in class */
    public final lw0 mo15a() {
        return lw0.NATIVE_AD;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(mt5 r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof ads_mobile_sdk.qv1
            if (r0 == 0) goto L13
            r0 = r14
            ads_mobile_sdk.qv1 r0 = (ads_mobile_sdk.qv1) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L1a
        L13:
            ads_mobile_sdk.qv1 r0 = new ads_mobile_sdk.qv1
            nt5 r14 = (nt5) r14
            r0.<init>(r13, r14)
        L1a:
            java.lang.Object r14 = r0.e
            px5 r1 = px5.a
            int r2 = r0.g
            r3 = 2
            r4 = 1
            r9 = 0
            if (r2 == 0) goto L42
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2d
            defpackage.ybh.y(r14)
            return r14
        L2d:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r13)
            r13 = 0
            return r13
        L34:
            long r4 = r0.d
            long r6 = r0.c
            java.lang.String r13 = r0.b
            pr r2 = r0.a
            defpackage.ybh.y(r14)
            r10 = r2
            r7 = r6
            goto L71
        L42:
            defpackage.ybh.y(r14)
            java.lang.Object r14 = r13.e
            r83 r14 = (defpackage.r83) r14
            java.lang.String r14 = r14.m()
            if (r14 != 0) goto L50
            return r9
        L50:
            java.lang.Object r2 = r13.f
            ads_mobile_sdk.ax0 r2 = (ads_mobile_sdk.ax0) r2
            long r5 = r2.a()
            java.lang.Object r2 = r13.d
            ads_mobile_sdk.iv1 r2 = (ads_mobile_sdk.iv1) r2
            r0.a = r13
            r0.b = r14
            r0.c = r5
            r0.d = r5
            r0.g = r4
            java.lang.Object r2 = r2.k(r0)
            if (r2 == r1) goto La1
            r10 = r13
            r13 = r14
            r14 = r2
            r7 = r5
            r4 = r7
        L71:
            java.lang.Number r14 = (java.lang.Number) r14
            long r11 = r14.longValue()
            int r14 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r14 == 0) goto L91
            java.lang.Object r13 = r10.b
            nx5 r13 = (nx5) r13
            ic1 r5 = new ic1
            r6 = 5
            r5.<init>(r6, r7, r9, r10)
            kotlin.coroutines.h r14 = kotlin.coroutines.h.a
            fsg r0 = new fsg
            r1 = 3
            r0.<init>(r5, r9, r1)
            defpackage.na2.B(r13, r14, r9, r0, r3)
            return r9
        L91:
            java.lang.Object r14 = r10.d
            ads_mobile_sdk.iv1 r14 = (ads_mobile_sdk.iv1) r14
            r0.a = r9
            r0.b = r9
            r0.g = r3
            java.lang.Object r13 = r14.b(r13, r0)
            if (r13 != r1) goto La2
        La1:
            return r1
        La2:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pr.a(mt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.util.Map r11) {
        /*
            r10 = this;
            if (r11 == 0) goto L49
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        Lf:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r11.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            r3 = r1
            java.util.List r3 = (java.util.List) r3
            r8 = 0
            r9 = 62
            java.lang.String r4 = ", "
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r1 = kotlin.collections.CollectionsKt.P(r3, r4, r5, r6, r7, r8, r9)
            kotlin.Pair r3 = new kotlin.Pair
            r3.<init>(r2, r1)
            r0.add(r3)
            goto Lf
        L3d:
            java.util.Map r11 = rbd.h(r0)
            if (r11 == 0) goto L49
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r11)
            goto L4e
        L49:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
        L4e:
            r10.c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pr.a(java.util.Map):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (r10 >= r3.b) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(long r10, defpackage.g1g r12) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.d
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            java.lang.Object r1 = r9.e
            java.util.PriorityQueue r1 = (java.util.PriorityQueue) r1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 == 0) goto L9e
            int r3 = r9.a
            if (r3 == 0) goto L9e
            r4 = -1
            if (r3 == r4) goto L2e
            int r3 = r1.size()
            int r5 = r9.a
            if (r3 < r5) goto L2e
            java.lang.Object r3 = r1.peek()
            nuh r3 = (defpackage.nuh) r3
            java.lang.String r5 = defpackage.tym.a
            long r5 = r3.b
            int r3 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r3 < 0) goto L9e
        L2e:
            java.lang.Object r3 = r9.c
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L3e
            g1g r3 = new g1g
            r3.<init>()
            goto L44
        L3e:
            java.lang.Object r3 = r3.pop()
            g1g r3 = (defpackage.g1g) r3
        L44:
            int r5 = r12.a()
            r3.K(r5)
            byte[] r5 = r12.a
            int r12 = r12.b
            byte[] r6 = r3.a
            int r7 = r3.a()
            r8 = 0
            java.lang.System.arraycopy(r5, r12, r6, r8, r7)
            java.lang.Object r12 = r9.f
            nuh r12 = (defpackage.nuh) r12
            if (r12 == 0) goto L6b
            long r5 = r12.b
            int r5 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r5 != 0) goto L6b
            java.util.ArrayList r9 = r12.a
            r9.add(r3)
            return
        L6b:
            boolean r12 = r0.isEmpty()
            if (r12 == 0) goto L77
            nuh r12 = new nuh
            r12.<init>()
            goto L7d
        L77:
            java.lang.Object r12 = r0.pop()
            nuh r12 = (defpackage.nuh) r12
        L7d:
            java.util.ArrayList r0 = r12.a
            if (r2 == 0) goto L82
            r8 = 1
        L82:
            defpackage.z4o.w(r8)
            boolean r2 = r0.isEmpty()
            defpackage.z4o.H(r2)
            r12.b = r10
            r0.add(r3)
            r1.add(r12)
            r9.f = r12
            int r10 = r9.a
            if (r10 == r4) goto L9d
            r9.m(r10)
        L9d:
            return
        L9e:
            java.lang.Object r9 = r9.b
            ouh r9 = (defpackage.ouh) r9
            r9.h(r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pr.b(long, g1g):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // defpackage.wdp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(mt5 r21) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pr.d(mt5):java.lang.Object");
    }

    public final void e(String str, List list, v9i v9iVar) {
        int i;
        r72 r72Var = (r72) this.f;
        if (r72Var != null) {
            if (v9iVar != null) {
                v9iVar.b(r72Var, Collections.EMPTY_MAP);
                return;
            }
            return;
        }
        if (v9iVar == null) {
            i = 0;
        } else {
            int i2 = this.a;
            this.a = i2 + 1;
            ((SparseArray) this.d).put(i2, v9iVar);
            i = i2;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(i);
        jSONArray.put(orb.t(str));
        jSONArray.put(orb.t(new orb()));
        if (list != null) {
            vpb vpbVar = new vpb();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                vpbVar.a(it.next());
            }
            jSONArray.put(orb.t(vpbVar));
        }
        ewn ewnVar = (ewn) this.b;
        String str2 = jSONArray.toString() + "\n";
        RealWebSocket realWebSocket = ewnVar.c;
        if (realWebSocket == null) {
            return;
        }
        realWebSocket.send(str2);
    }

    public final boolean f(int i) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            or orVar = (or) arrayList.get(i2);
            byte b = orVar.a;
            if (b != 8) {
                if (b == 1) {
                    int i3 = orVar.b;
                    int i4 = orVar.d + i3;
                    while (i3 < i4) {
                        if (l(i3, i2 + 1) == i) {
                            return true;
                        }
                        i3++;
                    }
                } else {
                    continue;
                }
            } else {
                if (l(orVar.d, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void g() {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((c) this.e).a((or) arrayList.get(i));
        }
        x(arrayList);
        this.a = 0;
    }

    public final void h() {
        c cVar = (c) this.e;
        g();
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            or orVar = (or) arrayList.get(i);
            byte b = orVar.a;
            if (b == 1) {
                cVar.a(orVar);
                cVar.c(orVar.b, orVar.d);
            } else if (b == 2) {
                cVar.a(orVar);
                int i2 = orVar.b;
                int i3 = orVar.d;
                RecyclerView recyclerView = cVar.a;
                recyclerView.f0(i2, i3, true);
                recyclerView.j0 = true;
                recyclerView.h0.c += i3;
            } else if (b == 4) {
                cVar.a(orVar);
                cVar.b(orVar.b, orVar.d, orVar.c);
            } else if (b == 8) {
                cVar.a(orVar);
                cVar.d(orVar.b, orVar.d);
            }
        }
        x(arrayList);
        this.a = 0;
    }

    public final void i(int i, String str) {
        SparseArray sparseArray = (SparseArray) this.d;
        this.f = new r72(i, str, (String) null, (String) null);
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((v9i) sparseArray.valueAt(i2)).b((r72) this.f, Collections.EMPTY_MAP);
        }
        ((hnc) ((ga6) this.c).b).a(true);
    }

    public final void j(or orVar) {
        int i;
        vng vngVar = (vng) this.b;
        byte b = orVar.a;
        if (b == 1 || b == 8) {
            qp2.o("should not dispatch add or move for pre layout");
            return;
        }
        int iF = F(orVar.b, b);
        int i2 = orVar.b;
        byte b2 = orVar.a;
        if (b2 == 2) {
            i = 0;
        } else {
            if (b2 != 4) {
                s49.l(orVar, "op should be remove or update.");
                return;
            }
            i = 1;
        }
        int i3 = 1;
        for (int i4 = 1; i4 < orVar.d; i4++) {
            int iF2 = F((i * i4) + orVar.b, orVar.a);
            byte b3 = orVar.a;
            if (b3 == 2 ? iF2 != iF : !(b3 == 4 && iF2 == iF + 1)) {
                or orVarT = t(b3, iF, i3, orVar.c);
                k(orVarT, i2);
                orVarT.c = null;
                vngVar.c(orVarT);
                if (orVar.a == 4) {
                    i2 += i3;
                }
                i3 = 1;
                iF = iF2;
            } else {
                i3++;
            }
        }
        Object obj = orVar.c;
        orVar.c = null;
        vngVar.c(orVar);
        if (i3 > 0) {
            or orVarT2 = t(orVar.a, iF, i3, obj);
            k(orVarT2, i2);
            orVarT2.c = null;
            vngVar.c(orVarT2);
        }
    }

    public final void k(or orVar, int i) {
        c cVar = (c) this.e;
        cVar.a(orVar);
        byte b = orVar.a;
        if (b != 2) {
            if (b == 4) {
                cVar.b(i, orVar.d, orVar.c);
                return;
            } else {
                qp2.o("only remove and update ops can be dispatched in first pass");
                return;
            }
        }
        int i2 = orVar.d;
        RecyclerView recyclerView = cVar.a;
        recyclerView.f0(i, i2, true);
        recyclerView.j0 = true;
        recyclerView.h0.c += i2;
    }

    public final int l(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (i2 < size) {
            or orVar = (or) arrayList.get(i2);
            byte b = orVar.a;
            int i3 = orVar.b;
            if (b == 8) {
                if (i3 == i) {
                    i = orVar.d;
                } else {
                    if (i3 < i) {
                        i--;
                    }
                    if (orVar.d <= i) {
                        i++;
                    }
                }
            } else if (i3 > i) {
                continue;
            } else if (b == 2) {
                int i4 = orVar.d;
                if (i < i3 + i4) {
                    return -1;
                }
                i -= i4;
            } else if (b == 1) {
                i += orVar.d;
            }
            i2++;
        }
        return i;
    }

    public final void m(int i) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.e;
        while (priorityQueue.size() > i) {
            nuh nuhVar = (nuh) priorityQueue.poll();
            String str = tym.a;
            int i2 = 0;
            while (true) {
                arrayList = nuhVar.a;
                if (i2 >= arrayList.size()) {
                    break;
                }
                ((ouh) this.b).h(nuhVar.b, (g1g) arrayList.get(i2));
                ((ArrayDeque) this.c).push((g1g) arrayList.get(i2));
                i2++;
            }
            arrayList.clear();
            nuh nuhVar2 = (nuh) this.f;
            if (nuhVar2 != null && nuhVar2.b == nuhVar.b) {
                this.f = null;
            }
            ((ArrayDeque) this.d).push(nuhVar);
        }
    }

    public final int o(int i, int i2, int i3) {
        return ((int[][][]) this.e)[i][i2][i3] & 7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    public final void q(vpb vpbVar) throws JSONException {
        ?? arrayList;
        JSONArray jSONArray = vpbVar.a;
        long j = jSONArray.getLong(0);
        String strD = vpbVar.d(1);
        HashMap mapN = n(vpbVar.c(2));
        if (jSONArray.length() > 3) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(3);
            arrayList = new ArrayList(jSONArray2.length());
            for (int i = 0; i < jSONArray2.length(); i++) {
                arrayList.add(orb.u(jSONArray2.get(i)));
            }
        } else {
            arrayList = Collections.EMPTY_LIST;
        }
        u9i u9iVar = j == 0 ? null : new u9i(this, j);
        ga6 ga6Var = (ga6) this.c;
        ga6Var.getClass();
        if (!strD.equals("update_envelope")) {
            if (!strD.equals("ping")) {
                if (u9iVar != null) {
                    pr prVar = u9iVar.b;
                    long j2 = u9iVar.a;
                    orb orbVarJ = o18.j("layer", "remote-rpc", "message", "no such method");
                    orbVarJ.p("async-rpc", "domain");
                    orbVarJ.p("invalid-method-error", "code");
                    prVar.B(j2, false, mapN, orbVarJ, true);
                    return;
                }
                return;
            }
            if (arrayList.isEmpty()) {
                if (u9iVar != null) {
                    u9iVar.a("pong", mapN);
                    return;
                }
                return;
            } else {
                if (u9iVar != null) {
                    pr prVar2 = u9iVar.b;
                    long j3 = u9iVar.a;
                    orb orbVarJ2 = o18.j("layer", "remote-rpc", "message", "invalid parameters");
                    orbVarJ2.p("async-rpc", "domain");
                    orbVarJ2.p("invalid-argument-error", "code");
                    prVar2.B(j3, false, mapN, orbVarJ2, true);
                    return;
                }
                return;
            }
        }
        try {
            if (arrayList.size() == 1 && (arrayList.get(0) instanceof orb)) {
                orb orbVar = (orb) arrayList.get(0);
                orb orbVarI = orbVar.i("params");
                dnc dncVar = new dnc(orbVar.e("envelope_type"), (orbVarI != null ? orbVarI.a : orbVar.a).getLong("id"));
                orb orbVarI2 = orbVar.i("envelope");
                orb orbVarI3 = orbVar.i("patch");
                if ((orbVarI2 != null) != (orbVarI3 != null)) {
                    enc encVar = (enc) ((hnc) ga6Var.b).g.get(dncVar);
                    if (encVar != null) {
                        if (orbVarI2 != null) {
                            encVar.a = orbVarI2;
                            encVar.a(orbVarI2);
                        } else {
                            try {
                                orb orbVar2 = (orb) k1g.Q(encVar.a, orbVarI3);
                                encVar.a = orbVar2;
                                encVar.a(orbVar2);
                            } catch (IllegalArgumentException e) {
                                encVar.b(e, orbVarI3);
                            } catch (IndexOutOfBoundsException e2) {
                                encVar.b(e2, orbVarI3);
                            } catch (JSONException unused) {
                            }
                        }
                    }
                    if (u9iVar != null) {
                        u9iVar.c(mapN);
                        return;
                    }
                    return;
                }
            }
        } catch (JSONException unused2) {
        }
        if (u9iVar != null) {
            pr prVar3 = u9iVar.b;
            long j4 = u9iVar.a;
            orb orbVarJ3 = o18.j("layer", "remote-rpc", "message", "invalid parameters");
            orbVarJ3.p("async-rpc", "domain");
            orbVarJ3.p("invalid-argument-error", "code");
            prVar3.B(j4, false, mapN, orbVarJ3, true);
        }
    }

    public final boolean r(vpb vpbVar) throws JSONException {
        JSONArray jSONArray = vpbVar.a;
        int i = 0;
        int i2 = jSONArray.getInt(0);
        boolean z = jSONArray.getBoolean(1);
        HashMap mapN = n(vpbVar.c(2));
        SparseArray sparseArray = (SparseArray) this.d;
        v9i v9iVar = (v9i) sparseArray.get(i2);
        if (v9iVar == null) {
            return false;
        }
        if (z) {
            if (jSONArray.length() <= 3) {
                sparseArray.delete(i2);
                v9iVar.c(mapN);
                return true;
            }
            Object objB = vpbVar.b(3);
            sparseArray.delete(i2);
            v9iVar.a(objB, mapN);
            return true;
        }
        orb orbVarC = vpbVar.c(3);
        switch (orbVarC.e("layer")) {
            case "local-rpc":
                i = 3;
                break;
            case "method":
                i = 1;
                break;
            case "remote-rpc":
                i = 2;
                break;
        }
        r72 r72Var = new r72(i, orbVarC.e("message"), orbVarC.m("domain", ""), orbVarC.m("code", ""));
        sparseArray.delete(i2);
        v9iVar.b(r72Var, mapN);
        return true;
    }

    public final boolean s() {
        return ((ArrayList) this.c).size() > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final or t(int i, int i2, int i3, Object obj) {
        or orVar = (or) ((vng) this.b).a();
        if (orVar != null) {
            orVar.a = i;
            orVar.b = i2;
            orVar.d = i3;
            orVar.c = obj;
            return orVar;
        }
        or orVar2 = new or();
        orVar2.a = i;
        orVar2.b = i2;
        orVar2.d = i3;
        orVar2.c = obj;
        return orVar2;
    }

    public final void u(or orVar) {
        c cVar = (c) this.e;
        ((ArrayList) this.d).add(orVar);
        byte b = orVar.a;
        if (b == 1) {
            cVar.c(orVar.b, orVar.d);
            return;
        }
        if (b == 2) {
            int i = orVar.b;
            int i2 = orVar.d;
            RecyclerView recyclerView = cVar.a;
            recyclerView.f0(i, i2, false);
            recyclerView.j0 = true;
            return;
        }
        if (b == 4) {
            cVar.b(orVar.b, orVar.d, orVar.c);
        } else if (b == 8) {
            cVar.d(orVar.b, orVar.d);
        } else {
            s49.l(orVar, "Unknown update op type for ");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:193:0x00af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v() {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pr.v():void");
    }

    public final void w(String str) {
        int iIndexOf;
        boolean zR;
        if (str == null) {
            i(4, "Network error");
            return;
        }
        String str2 = (String) this.e;
        if (str2 == null) {
            this.e = str;
            iIndexOf = str.indexOf(10);
        } else {
            int length = str2.length();
            String strL = z1m.l(new StringBuilder(), (String) this.e, str);
            this.e = strL;
            iIndexOf = strL.indexOf(10, length);
        }
        final byte b = 1;
        if (iIndexOf > -1) {
            int i = 0;
            do {
                try {
                    vpb vpbVar = new vpb(((String) this.e).substring(i, iIndexOf));
                    if (vpbVar.b(1) instanceof String) {
                        q(vpbVar);
                        zR = true;
                    } else {
                        zR = r(vpbVar);
                    }
                } catch (JSONException unused) {
                    zR = false;
                }
                if (!zR) {
                    i(2, "Invalid data");
                    return;
                } else {
                    i = iIndexOf + 1;
                    iIndexOf = ((String) this.e).indexOf(10, i);
                }
            } while (iIndexOf != -1);
            if (i == ((String) this.e).length()) {
                this.e = null;
            } else {
                this.e = ((String) this.e).substring(i);
            }
        }
        ((ewn) this.b).h(new Callback(this) { // from class: t9i
            public final /* synthetic */ pr b;

            {
                this.b = this;
            }

            public final void run(Object obj) {
                byte b2 = b;
                this.b.w((String) obj);
            }
        });
    }

    public final void x(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            or orVar = (or) arrayList.get(i);
            orVar.c = null;
            ((vng) this.b).c(orVar);
        }
        arrayList.clear();
    }

    public final void y() {
        dvl dvlVar = (dvl) this.e;
        if (dvlVar == null) {
            ((bvl) this.c).getOffset().k((g9l) this.f);
            return;
        }
        BrowserFragment browserFragment = (BrowserFragment) this.d;
        TopToolbarContainer topToolbarContainer = dvlVar.a;
        int i = dvlVar.b;
        int i2 = this.a;
        ChromiumContainerView chromiumContainerView = browserFragment.p;
        ckf ckfVar = chromiumContainerView.a;
        xy4 xy4Var = new xy4(chromiumContainerView, ckfVar, i2);
        topToolbarContainer.getClass();
        vvl vvlVar = new vvl(topToolbarContainer, i + i2);
        topToolbarContainer.g = vvlVar;
        topToolbarContainer.h = xy4Var;
        qp7 qp7Var = (qp7) ((ResourceManager) N.MCvGcnn7(((ContentViewRenderView) ckfVar).a)).a.get(1);
        qp7Var.getClass();
        qp7Var.c.put(2131364811, new pp7(vvlVar, new wa(qp7Var, (byte) 10)));
    }

    public final void z(pga pgaVar) {
        int iU = e82.u(pgaVar, (pga[]) this.b);
        if (iU >= 0) {
            pga[] pgaVarArr = (pga[]) this.b;
            int i = iU + 1;
            System.arraycopy(pgaVarArr, i, pgaVarArr, iU, this.a - i);
            pga[] pgaVarArr2 = (pga[]) this.b;
            int i2 = this.a;
            pgaVarArr2[i2 - 1] = null;
            float[] fArr = (float[]) this.c;
            System.arraycopy(fArr, i, fArr, iU, i2 - i);
            byte[] bArr = (byte[]) this.d;
            System.arraycopy(bArr, i, bArr, iU, this.a - i);
            this.a--;
        }
    }
}
