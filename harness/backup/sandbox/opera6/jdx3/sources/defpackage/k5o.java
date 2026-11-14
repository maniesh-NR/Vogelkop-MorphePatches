package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.work.impl.WorkDatabase_Impl;
import com.leanplum.LeanplumPushNotificationCustomizer;
import com.leanplum.LeanplumPushReceiver;
import com.leanplum.LeanplumPushService;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.api.Callback;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlin.ranges.a;
import kotlinx.serialization.KSerializer;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k5o implements wv9, jv0, n0g, ih4, hbb, LeanplumPushNotificationCustomizer, ph4, drf {
    public static final hv5 d = new hv5();
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public k5o(byte b) {
        this.a = b;
        switch (b) {
            case SizeUtil.textSize2 /* 24 */:
                this.b = new see();
                this.c = new see();
                break;
            default:
                this.b = new HashMap();
                this.c = new HashMap();
                break;
        }
    }

    public /* synthetic */ k5o(byte b, boolean z) {
        this.a = b;
    }

    public k5o(Context context) {
        this.a = (byte) 1;
        this.b = context.getApplicationContext();
        this.c = z4c.b(new al7((Object) this, (byte) 14));
    }

    public k5o(Context context, jg8 jg8Var) {
        this.a = (byte) 15;
        this.b = jg8Var;
        this.c = context.getApplicationContext();
    }

    public k5o(ImageView imageView, v1f v1fVar, tcc tccVar, View.OnClickListener onClickListener) throws Resources.NotFoundException {
        this.a = (byte) 21;
        this.b = imageView;
        Resources resources = imageView.getResources();
        String string = resources.getString(2132019665, resources.getString(2132017591));
        imageView.setContentDescription(string);
        n1h.o(imageView, string, 2131363276);
        int iA = fan.a(26.0f, imageView.getResources());
        h13 h13Var = new h13(sgb.F(2131232597, imageView.getContext()), iA, iA);
        this.c = h13Var;
        imageView.setForeground(h13Var);
        if (v1fVar != null && tccVar != null) {
            r1f r1fVar = v1fVar.c;
            j7d j7dVar = new j7d(this, (byte) 0);
            if (r1fVar.a.b(j7dVar)) {
                r1fVar.c.run();
            }
            tccVar.a(new d62(r1fVar, j7dVar));
            boolean zA = r1fVar.a();
            if (zA != h13Var.d) {
                h13Var.d = zA;
                h13Var.invalidateSelf();
            }
        }
        imageView.setOnClickListener(onClickListener);
    }

    public k5o(WorkDatabase_Impl workDatabase_Impl) {
        this.a = (byte) 0;
        this.b = workDatabase_Impl;
        this.c = new b37(workDatabase_Impl, (byte) 6);
        new uzk(workDatabase_Impl, (byte) 20);
    }

    public k5o(bd6 bd6Var) {
        this.a = (byte) 11;
        rq6 rq6Var = new rq6();
        rq6Var.a = new r16();
        this.c = rq6Var;
        this.b = bd6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k5o(BrowserActivity browserActivity) {
        this.a = (byte) 6;
        this.c = browserActivity;
        String[] strArr = OperaApplication.K;
        this.b = (yk6) ((OperaApplication) browserActivity.getApplication()).e().get();
    }

    public k5o(OperaApplication operaApplication, w9c[] w9cVarArr) {
        this.a = (byte) 20;
        this.b = operaApplication.getApplicationContext();
        this.c = w9cVarArr;
    }

    public k5o(csh cshVar, csh cshVar2) {
        this.a = (byte) 29;
        this.b = new t9h(cshVar);
        this.c = new t9h(cshVar2);
    }

    public k5o(e3j e3jVar, jv1 jv1Var) {
        this.a = (byte) 16;
        this.b = jv1Var;
        this.c = new lld((Object) e3jVar, (byte) 7);
    }

    public k5o(hv hvVar) {
        this.a = (byte) 26;
        this.b = hvVar;
        this.c = new cf2(0);
    }

    public /* synthetic */ k5o(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public k5o(Function2 function2) {
        this.a = (byte) 9;
        this.b = function2;
        this.c = new ConcurrentHashMap();
    }

    public k5o(kze kzeVar, or2 or2Var, tsd tsdVar) {
        this.a = (byte) 25;
        this.b = or2Var;
        this.c = tsdVar;
        int i = d03.e;
        View view = (ConstraintLayout) or2Var.e;
        ydp.q(view, j14.i0(2131231307, view.getContext()));
        a26.T(tsdVar, kzeVar, new d8d(this, (byte) 12));
        lzb lzbVar = new lzb(this, (byte) 24);
        q9n.e(view, lzbVar);
        lzbVar.a(view);
    }

    public k5o(mxb mxbVar) {
        this.a = (byte) 10;
        this.b = mxbVar;
        this.c = new ArrayList();
    }

    public k5o(qg7 qg7Var) {
        this.a = (byte) 13;
        this.c = qg7Var;
        this.b = new bl6(this, (byte) 26);
    }

    public k5o(ua7 ua7Var) {
        this.a = (byte) 23;
        d5o d5oVar = new d5o();
        d5oVar.a = new ArrayList();
        d5oVar.b = new HashSet();
        d5oVar.c = ua7Var;
        this.c = new jc9((byte) 2);
        this.b = d5oVar;
    }

    public k5o(uv4 uv4Var, ole oleVar) {
        this.a = (byte) 8;
        this.b = oleVar;
        Objects.requireNonNull(uv4Var);
        this.c = uv4Var;
    }

    public k5o(w69 w69Var, SparseArray sparseArray) {
        this.a = (byte) 3;
        this.b = w69Var;
        SparseBooleanArray sparseBooleanArray = w69Var.a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            int iB = w69Var.b(i);
            d11 d11Var = (d11) sparseArray.get(iB);
            d11Var.getClass();
            sparseArray2.append(iB, d11Var);
        }
        this.c = sparseArray2;
    }

    public k5o(yp7 yp7Var, f1p f1pVar) {
        this.a = (byte) 18;
        this.b = f1pVar;
        this.c = new isd((Object) yp7Var.j((BigInteger) f1pVar.a), (byte) 21);
    }

    public static void e(JSONObject jSONObject, String str, String str2, String str3) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str3);
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
            jSONObject.put(str3, jSONObjectOptJSONObject);
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(str2);
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
            jSONObjectOptJSONObject.put(str2, jSONArrayOptJSONArray);
        }
        jSONArrayOptJSONArray.put(str);
    }

    public static HashMap q(ObjectInputStream objectInputStream) throws IOException {
        if (objectInputStream.readInt() != 1) {
            return null;
        }
        int i = objectInputStream.readInt();
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            String str = (String) objectInputStream.readObject();
            if (!TextUtils.isEmpty(str)) {
                if (objectInputStream.readInt() != 1) {
                    h9o.r("Unknown version");
                    return null;
                }
                EnumMap enumMap = new EnumMap(lag.class);
                int i3 = objectInputStream.readInt();
                for (int i4 = 0; i4 < i3; i4++) {
                    try {
                        enumMap.put((EnumMap) lag.valueOf((String) objectInputStream.readObject()), (lag) new iag(kag.valueOf((String) objectInputStream.readObject()), true));
                    } catch (IllegalArgumentException unused) {
                    }
                }
                jag jagVar = new jag();
                jagVar.a = enumMap;
                map.put(str, jagVar);
            }
        }
        return map;
    }

    @Override // defpackage.drf
    public final List a(Integer num) {
        List listA = ((drf) this.b).a(null);
        lqj lqjVar = (lqj) this.c;
        int i = lqjVar.v;
        if (i < 0) {
            return listA;
        }
        return CollectionsKt.V(listA, z5i.p(lqjVar, num, i, Integer.valueOf(lqjVar.D(i, lqjVar.b))));
    }

    public final Object b(itb itbVar, ArrayList arrayList) {
        KSerializer q0iVar;
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.c;
        Class clsA = ((n15) itbVar).a();
        Object m0gVar = concurrentHashMap.get(clsA);
        if (m0gVar == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsA, (m0gVar = new m0g()))) != null) {
            m0gVar = objPutIfAbsent;
        }
        m0g m0gVar2 = (m0g) m0gVar;
        ArrayList arrayList2 = new ArrayList(k95.o(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(new bub((ytb) obj));
        }
        ConcurrentHashMap concurrentHashMap2 = m0gVar2.a;
        Object obj2 = concurrentHashMap2.get(arrayList2);
        if (obj2 == null) {
            try {
                p0i p0iVar = t0i.b;
                q0iVar = (KSerializer) ((Function2) this.b).invoke(itbVar, arrayList);
            } catch (Throwable th) {
                p0i p0iVar2 = t0i.b;
                q0iVar = new q0i(th);
            }
            t0i t0iVar = new t0i(q0iVar);
            Object objPutIfAbsent2 = concurrentHashMap2.putIfAbsent(arrayList2, t0iVar);
            obj2 = objPutIfAbsent2 == null ? t0iVar : objPutIfAbsent2;
        }
        return ((t0i) obj2).a;
    }

    @Override // defpackage.drf
    public final boolean c() {
        return ((drf) this.b).c();
    }

    @Override // defpackage.ih4
    public final void cancel() {
        switch (this.a) {
            case 17:
                ih4 ih4Var = (ih4) this.b;
                if (ih4Var != null) {
                    ih4Var.cancel();
                    this.b = null;
                }
                this.c = null;
                break;
            default:
                if (!((cf2) this.c).compareAndSet(1, 1)) {
                    ((hv) this.b).invoke();
                    break;
                }
                break;
        }
    }

    @Override // com.leanplum.LeanplumPushNotificationCustomizer
    public final void customize(Notification.Builder builder, Bundle bundle, Notification.Style style) {
    }

    @Override // com.leanplum.LeanplumPushNotificationCustomizer
    public final void customize(l1f l1fVar, Bundle bundle) {
        boolean z = false;
        for (w9c w9cVar : (w9c[]) this.c) {
            if (w9cVar.h(bundle)) {
                z = true;
            }
        }
        if (z) {
            l1fVar.g = LeanplumPushService.createContentIntent((Context) this.b, bundle, LeanplumPushReceiver.class);
        }
    }

    public final void d(oqe oqeVar) {
        HashMap map = (HashMap) this.b;
        if (!(oqeVar instanceof msh)) {
            if (oqeVar instanceof ere) {
                ((HashMap) this.c).put(((ere) oqeVar).e, new i92(oqeVar.c, oqeVar.d));
            }
        } else {
            msh mshVar = (msh) oqeVar;
            p12 p12Var = mshVar.v;
            String str = (String) p12Var.b;
            if (map.containsKey(str)) {
                return;
            }
            map.put(str, new h92(oqeVar.c, (String) p12Var.a, mshVar.d));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.wv9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(nt5 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof vz9
            if (r0 == 0) goto L13
            r0 = r6
            vz9 r0 = (vz9) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            vz9 r0 = new vz9
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            ybh.y(r6)
            t0i r6 = (t0i) r6
            java.lang.Object r5 = r6.a
            return r5
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r5)
            return r3
        L32:
            ybh.y(r6)
            wz9 r6 = new wz9
            r6.<init>(r5, r3)
            r0.v = r4
            java.lang.Object r5 = zch.A(r6, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k5o.f(nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (r8 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.wv9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.opera.android.weather.ui.WeatherWidgetActivity r7, mt5 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof tz9
            if (r0 == 0) goto L13
            r0 = r8
            tz9 r0 = (tz9) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L1a
        L13:
            tz9 r0 = new tz9
            nt5 r8 = (nt5) r8
            r0.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2d
            ybh.y(r8)
            goto L6d
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r6)
            return r5
        L33:
            com.opera.android.weather.ui.WeatherWidgetActivity r7 = r0.t
            ybh.y(r8)
            t0i r8 = (t0i) r8
            java.lang.Object r6 = r8.a
            goto L4f
        L3d:
            ybh.y(r8)
            uz9 r8 = new uz9
            r8.<init>(r6, r5)
            r0.t = r7
            r0.w = r4
            java.lang.Object r6 = zch.A(r8, r0)
            if (r6 == r1) goto L6c
        L4f:
            java.lang.Throwable r8 = t0i.d(r6)
            if (r8 != 0) goto L5a
            com.google.android.gms.location.LocationSettingsResponse r6 = (com.google.android.gms.location.LocationSettingsResponse) r6
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L5a:
            boolean r6 = r8 instanceof com.google.android.gms.common.api.ResolvableApiException
            if (r6 == 0) goto L74
            com.google.android.gms.common.api.ResolvableApiException r8 = (com.google.android.gms.common.api.ResolvableApiException) r8
            r0.t = r5
            r0.w = r3
            hv5 r6 = defpackage.k5o.d
            java.lang.Object r8 = r6.K(r8, r7, r0)
            if (r8 != r1) goto L6d
        L6c:
            return r1
        L6d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r6 = r8.booleanValue()
            goto L75
        L74:
            r6 = 0
        L75:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k5o.g(com.opera.android.weather.ui.WeatherWidgetActivity, mt5):java.lang.Object");
    }

    public final boolean h(int i) {
        return ((w69) this.b).a.get(i);
    }

    public final BigInteger[] i(BigInteger bigInteger) {
        kli kliVar = (kli) ((f1p) this.b).b;
        short s = kliVar.g;
        BigInteger bigIntegerA = phj.A(bigInteger, kliVar.e, s);
        BigInteger bigIntegerA2 = phj.A(bigInteger, kliVar.f, s);
        return new BigInteger[]{bigInteger.subtract(bigIntegerA.multiply(kliVar.a).add(bigIntegerA2.multiply(kliVar.c))), bigIntegerA.multiply(kliVar.b).add(bigIntegerA2.multiply(kliVar.d)).negate()};
    }

    @Override // defpackage.jv0
    public final void j(List list, x92 x92Var) {
        BrowserActivity browserActivity = (BrowserActivity) this.c;
        int i = BrowserActivity.E1;
        browserActivity.i1(list, x92Var);
    }

    public final void k(Callback callback) {
        ((lld) this.c).e0(new hu5((Object) callback, (Object) this, (byte) 9));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [android.app.Activity, com.opera.android.BrowserActivity] */
    @Override // defpackage.jv0
    public final void l(String str) {
        String[] strArr = OperaApplication.K;
        ?? r2 = (BrowserActivity) this.c;
        ((OperaApplication) r2.getApplication()).L().c.S(14);
        List listSingletonList = Collections.singletonList(new v92(str));
        x92 x92Var = x92.g;
        int i = BrowserActivity.E1;
        r2.i1(listSingletonList, x92Var);
    }

    public final ArrayList m(String str) {
        TreeMap treeMap = e6i.i;
        e6i e6iVarE = aoh.e(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        e6iVarE.w(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.b;
        workDatabase_Impl.b();
        Cursor cursorS = workDatabase_Impl.s(e6iVarE);
        try {
            ArrayList arrayList = new ArrayList(cursorS.getCount());
            while (cursorS.moveToNext()) {
                arrayList.add(cursorS.getString(0));
            }
            return arrayList;
        } finally {
            cursorS.close();
            e6iVarE.release();
        }
    }

    public final boolean n(dqd dqdVar, String str) {
        int i = dqdVar.b;
        Context context = (Context) this.b;
        return i < 0 ? context.getPackageManager().checkPermission(str, dqdVar.a) == 0 : context.checkPermission(str, i, dqdVar.c) == 0;
    }

    public final boolean o() {
        return ((Boolean) ((yk6) this.b).m.g()).booleanValue();
    }

    public final void p(iw4 iw4Var) {
        ole oleVar = (ole) this.b;
        uv4 uv4Var = (uv4) this.c;
        uv4Var.c.post(new vr9(this, oleVar, iw4Var, (byte) 5));
        uv4Var.c.postDelayed(new wr9((byte) 5, this, iw4Var, false), 1L);
    }

    public final void r(String str, boolean z) {
        HashMap map = (HashMap) this.b;
        if (z) {
            map.remove(str);
            return;
        }
        h92 h92Var = (h92) map.get(str);
        if (h92Var == null || h92Var.d.get()) {
            return;
        }
        map.remove(str);
    }

    public final hyl s(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = (int[]) this.b;
            if (i2 >= iArr.length) {
                w7d.q("Unmatched track of type: " + i);
                return new s97();
            }
            if (i == iArr[i2]) {
                return ((uhi[]) this.c)[i2];
            }
            i2++;
        }
    }

    public final void t(uae uaeVar) {
        see seeVar = (see) this.b;
        Object objG = ((see) this.c).g(uaeVar);
        if (objG != null) {
            if (!(objG instanceof dee)) {
                h9o.t();
                return;
            }
            dee deeVar = (dee) objG;
            Object[] objArr = deeVar.a;
            int i = deeVar.b;
            for (int i2 = 0; i2 < i; i2++) {
                if (objArr[i2] != null) {
                    h9o.t();
                    return;
                }
                zbe zbeVar = new zbe(uaeVar, (byte) 2);
                Object objG2 = seeVar.g((Object) null);
                if (objG2 != null) {
                    if (objG2 instanceof dee) {
                        dee deeVar2 = (dee) objG2;
                        int i3 = deeVar2.b;
                        Object[] objArr2 = deeVar2.a;
                        IntRange intRangeJ = djh.j(0, i3);
                        int i4 = ((a) intRangeJ).a;
                        int i5 = ((a) intRangeJ).b;
                        int i6 = 0;
                        if (i4 <= i5) {
                            while (true) {
                                objArr2[i4 - i6] = objArr2[i4];
                                if (((Boolean) zbeVar.invoke(objArr2[i4])).booleanValue()) {
                                    i6++;
                                }
                                if (i4 == i5) {
                                    break;
                                } else {
                                    i4++;
                                }
                            }
                        }
                        Arrays.fill(objArr2, i3 - i6, i3, (Object) null);
                        deeVar2.b -= i6;
                        if (deeVar2.i()) {
                            seeVar.k((Object) null);
                        }
                        if (deeVar2.b == 1) {
                            seeVar.m((Object) null, deeVar2.f());
                        }
                    } else if (((Boolean) zbeVar.invoke(objG2)).booleanValue()) {
                        seeVar.k((Object) null);
                    }
                }
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rh6 */
    public final ebb toInstant() throws rh6 {
        throw new rh6(((String) this.b) + " when parsing an Instant from \"" + i41.q0(64, (CharSequence) this.c) + '\"');
    }

    @Override // defpackage.jv0
    public final boolean u() {
        return ((Boolean) ((yk6) this.b).r.g()).booleanValue();
    }

    @Override // defpackage.jv0
    public final boolean v() {
        return ((Boolean) ((yk6) this.b).s.g()).booleanValue();
    }
}
