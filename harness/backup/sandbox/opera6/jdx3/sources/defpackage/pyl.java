package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.hardware.camera2.CameraAccessException;
import android.opengl.GLES20;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.google.ads.interactivemedia.v3.impl.data.zzc;
import com.google.ads.interactivemedia.v3.internal.zzafo;
import com.google.ads.interactivemedia.v3.internal.zzafq;
import com.opera.android.LoadingView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class pyl implements f94, qvi {
    public final /* synthetic */ byte a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public pyl(byte b) {
        this.a = b;
        switch (b) {
            case 7:
                break;
            case 8:
            default:
                this.c = new HashSet();
                this.d = fee.k();
                this.b = -1;
                this.e = new ArrayList();
                this.f = bfe.a();
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                this.e = new ArrayList();
                this.f = new sa2((byte) 18, ((Number) uyj.k.getValue()).intValue());
                break;
        }
    }

    public pyl(int i, zzc zzcVar) {
        this.a = (byte) 15;
        this.e = new ArrayList();
        this.b = i;
        this.c = zzcVar;
    }

    public pyl(View view, agm agmVar, int i, tjn tjnVar) {
        this.a = (byte) 12;
        this.c = null;
        this.d = view;
        this.e = agmVar;
        this.b = i;
        this.f = tjnVar;
        q9n.e(view, new svk(this, (byte) 18));
    }

    public pyl(b94 b94Var, String str, int i, shf shfVar, fvh fvhVar) {
        this.a = (byte) 10;
        this.c = b94Var;
        this.d = str;
        this.b = i;
        this.e = shfVar;
        this.f = fvhVar;
    }

    public pyl(fqe fqeVar, x77 x77Var) {
        this.a = (byte) 8;
        this.e = new au9((byte) 7);
        this.c = x77Var;
        g77 g77Var = (g77) x77Var.b;
        this.d = g77Var != null ? new s14((ga6) fqeVar.c().g.c, g77Var) : null;
    }

    public pyl(String str, String str2) {
        this.a = (byte) 4;
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.b = iGlCreateProgram;
        fr3.p();
        g(iGlCreateProgram, 35633, str);
        g(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        fr3.q("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(iGlCreateProgram);
        this.e = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.c = new hr5[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            int i2 = this.b;
            int[] iArr3 = new int[1];
            GLES20.glGetProgramiv(i2, 35722, iArr3, 0);
            int i3 = iArr3[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveAttrib(i2, i, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    break;
                }
                if (bArr[i4] == 0) {
                    i3 = i4;
                    break;
                }
                i4++;
            }
            String str3 = new String(bArr, 0, i3);
            GLES20.glGetAttribLocation(i2, str3);
            hr5 hr5Var = new hr5();
            ((hr5[]) this.c)[i] = hr5Var;
            ((HashMap) this.e).put(str3, hr5Var);
        }
        this.f = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.b, 35718, iArr4, 0);
        this.d = new ir5[iArr4[0]];
        for (int i5 = 0; i5 < iArr4[0]; i5++) {
            int i6 = this.b;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i6, 35719, iArr5, 0);
            int i7 = iArr5[0];
            byte[] bArr2 = new byte[i7];
            GLES20.glGetActiveUniform(i6, i5, i7, new int[1], 0, new int[1], 0, new int[1], 0, bArr2, 0);
            int i8 = 0;
            while (true) {
                if (i8 >= i7) {
                    break;
                }
                if (bArr2[i8] == 0) {
                    i7 = i8;
                    break;
                }
                i8++;
            }
            String str4 = new String(bArr2, 0, i7);
            GLES20.glGetUniformLocation(i6, str4);
            ir5 ir5Var = new ir5();
            ((ir5[]) this.d)[i5] = ir5Var;
            ((HashMap) this.f).put(str4, ir5Var);
        }
        fr3.p();
    }

    public pyl(List list, Bundle bundle) {
        boolean zA;
        Object obj;
        this.a = (byte) 14;
        this.c = list;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o0o o0oVar = (o0o) it.next();
            o95.t(CollectionsKt.V(o0oVar.c, Collections.singletonList(o0oVar)), arrayList);
        }
        String[] stringArray = bundle != null ? bundle.getStringArray("key.welcome_onboarding_flow.shown_leaves") : null;
        if (stringArray == null) {
            ArrayList arrayList2 = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (o0o o0oVar2 : (List) this.c) {
                List<o0o> list2 = o0oVar2.c;
                m0o m0oVar = o0oVar2.a;
                for (o0o o0oVar3 : list2) {
                    linkedHashMap2.put(o0oVar3.a, Boolean.valueOf(o0oVar3.a()));
                }
                if (list2.isEmpty()) {
                    zA = o0oVar2.a();
                } else {
                    List list3 = list2;
                    if ((list3 instanceof Collection) && list3.isEmpty()) {
                        zA = false;
                    } else {
                        Iterator it2 = list3.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            } else if (Intrinsics.a(linkedHashMap2.get(((o0o) it2.next()).a), Boolean.TRUE)) {
                                if (o0oVar2.a()) {
                                    zA = true;
                                }
                            }
                        }
                        zA = false;
                    }
                }
                linkedHashMap2.put(m0oVar, Boolean.valueOf(zA));
                if (zA) {
                    arrayList2.add(m0oVar);
                    if (!list2.isEmpty()) {
                        List list4 = list2;
                        ArrayList arrayList3 = new ArrayList(k95.o(list4, 10));
                        Iterator it3 = list4.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(((o0o) it3.next()).a);
                        }
                        ArrayList arrayList4 = new ArrayList();
                        int size = arrayList3.size();
                        int i = 0;
                        while (i < size) {
                            Object obj2 = arrayList3.get(i);
                            i++;
                            if (Intrinsics.a(linkedHashMap2.get((m0o) obj2), Boolean.TRUE)) {
                                arrayList4.add(obj2);
                            }
                        }
                        linkedHashMap.put(m0oVar, arrayList4);
                    }
                }
            }
            this.e = linkedHashMap2;
            this.f = linkedHashMap;
            this.d = arrayList2;
            return;
        }
        ArrayList arrayList5 = new ArrayList();
        for (String str : stringArray) {
            int size2 = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    obj = null;
                    break;
                }
                obj = arrayList.get(i2);
                i2++;
                if (Intrinsics.a(((o0o) obj).a.name(), str)) {
                    break;
                }
            }
            o0o o0oVar4 = (o0o) obj;
            m0o m0oVar2 = o0oVar4 != null ? o0oVar4.a : null;
            if (m0oVar2 != null) {
                arrayList5.add(m0oVar2);
            }
        }
        int iA = qbd.a(k95.o(arrayList5, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iA < 16 ? 16 : iA);
        int size3 = arrayList5.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList5.get(i3);
            i3++;
            linkedHashMap3.put(obj3, Boolean.TRUE);
        }
        this.e = linkedHashMap3;
        List<o0o> list5 = (List) this.c;
        int iA2 = qbd.a(k95.o(list5, 10));
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(iA2 >= 16 ? iA2 : 16);
        for (o0o o0oVar5 : list5) {
            m0o m0oVar3 = o0oVar5.a;
            List list6 = o0oVar5.c;
            ArrayList arrayList6 = new ArrayList(k95.o(list6, 10));
            Iterator it4 = list6.iterator();
            while (it4.hasNext()) {
                arrayList6.add(((o0o) it4.next()).a);
            }
            ArrayList arrayList7 = new ArrayList();
            int size4 = arrayList6.size();
            int i4 = 0;
            while (i4 < size4) {
                Object obj4 = arrayList6.get(i4);
                i4++;
                if (arrayList5.contains((m0o) obj4)) {
                    arrayList7.add(obj4);
                }
            }
            linkedHashMap4.put(m0oVar3, arrayList7);
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap4.entrySet()) {
            if (!((List) entry.getValue()).isEmpty()) {
                linkedHashMap5.put(entry.getKey(), entry.getValue());
            }
        }
        this.f = linkedHashMap5;
        List list7 = (List) this.c;
        ArrayList arrayList8 = new ArrayList();
        for (Object obj5 : list7) {
            o0o o0oVar6 = (o0o) obj5;
            List list8 = o0oVar6.c;
            m0o m0oVar4 = o0oVar6.a;
            if (list8.isEmpty() ? arrayList5.contains(m0oVar4) : ((LinkedHashMap) this.f).containsKey(m0oVar4)) {
                arrayList8.add(obj5);
            }
        }
        ArrayList arrayList9 = new ArrayList(k95.o(arrayList8, 10));
        int size5 = arrayList8.size();
        int i5 = 0;
        while (i5 < size5) {
            Object obj6 = arrayList8.get(i5);
            i5++;
            arrayList9.add(((o0o) obj6).a);
        }
        this.d = arrayList9;
        this.b = bundle.getInt("key.welcome_onboarding_flow.current_index", 0);
    }

    public pyl(jcn jcnVar, oji ojiVar, byte[] bArr, l5b[] l5bVarArr, int i) {
        this.a = (byte) 13;
        this.c = jcnVar;
        this.d = ojiVar;
        this.e = bArr;
        this.f = l5bVarArr;
        this.b = i;
    }

    public pyl(p7m p7mVar, int i) {
        this.a = (byte) 11;
        this.f = p7mVar;
        this.c = new bq4(new byte[5], 5);
        this.d = new SparseArray();
        this.e = new SparseIntArray();
        this.b = i;
    }

    public pyl(q4a q4aVar, o4a[] o4aVarArr) {
        this.a = (byte) 6;
        this.f = q4aVar;
        int length = o4aVarArr.length;
        this.c = new o4a[length];
        this.b = length - 1;
        int iF = q4aVar.f() + 1;
        o4a[][] o4aVarArr2 = new o4a[iF][];
        int[] iArr = new int[iF];
        for (o4a o4aVar : o4aVarArr) {
            int i = o4aVar.a.a;
            iArr[i] = iArr[i] + 1;
        }
        for (int i2 = 0; i2 < iF; i2++) {
            o4aVarArr2[i2] = new o4a[iArr[i2]];
        }
        Arrays.fill(iArr, 0);
        for (o4a o4aVar2 : o4aVarArr) {
            int i3 = o4aVar2.a.a;
            o4a[] o4aVarArr3 = o4aVarArr2[i3];
            int i4 = iArr[i3];
            iArr[i3] = i4 + 1;
            o4aVarArr3[i4] = o4aVar2;
        }
        this.d = o4aVarArr2;
        this.e = new int[((q4a) this.f).f() + 1];
    }

    public pyl(sa4 sa4Var) {
        this.a = (byte) 5;
        this.c = sa4Var;
        bf2 bf2Var = f3a.a;
        bf2Var.getClass();
        this.b = bf2.b.incrementAndGet(bf2Var);
        this.d = c26.i(false);
        this.e = new ArrayList();
        this.f = new xm5(this);
    }

    public pyl(un unVar, int i, String str) {
        this.a = (byte) 1;
        this.b = i;
        this.e = str;
        Objects.requireNonNull(unVar);
        this.f = unVar;
        this.c = new ArrayList(i);
    }

    public pyl(wjh wjhVar, x5f x5fVar) {
        this.a = (byte) 2;
        this.e = new SparseArray();
        this.f = new jec(100);
        this.c = wjhVar;
        this.d = x5fVar;
    }

    public pyl(luh[] luhVarArr, bj8[] bj8VarArr, fzl fzlVar, pr prVar) {
        this.a = (byte) 0;
        z4o.w(luhVarArr.length == bj8VarArr.length);
        this.c = luhVarArr;
        this.d = (bj8[]) bj8VarArr.clone();
        this.e = fzlVar;
        this.f = prVar;
        this.b = luhVarArr.length;
    }

    public static void g(int i, int i2, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        fr3.q(GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str, iArr[0] == 1);
        GLES20.glAttachShader(i, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        fr3.p();
    }

    public static void i(Context context, aln alnVar, View view, agm agmVar, int i, int i2) {
        o2c o2cVar = new o2c(true, i2, i2, false);
        byte b = 25;
        qjn qjnVar = new qjn(agmVar, alnVar.c(context, o2cVar), new vk2(b), o2cVar);
        lkn lknVarA = qjnVar.a(i, context);
        if (alnVar.a()) {
            o2c o2cVar2 = new o2c(true, i2, i2, true);
            ClipDrawable clipDrawable = new ClipDrawable(new qjn(agmVar, alnVar.c(context, o2cVar2), new vk2(b), o2cVar2).a(i, context), 8388613, 1);
            clipDrawable.setLevel(5000);
            view.setBackground(new l92(new Drawable[]{lknVarA, clipDrawable}, (byte) 1));
        } else {
            view.setBackground(lknVarA);
        }
        h06 h06VarG = alnVar.g(context, o2cVar);
        view.setContentDescription(h06VarG != null ? h06VarG.a : null);
        view.setForeground(xgh.i((ShapeDrawable) null, ColorStateList.valueOf(context.getColor(qjnVar.a.g ? 2131103628 : 2131103629)), i));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(g1g r38) {
        /*
            Method dump skipped, instructions count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pyl.a(g1g):void");
    }

    public final void b() {
        List<ra4> listK0;
        synchronized (((ArrayList) this.e)) {
            listK0 = CollectionsKt.k0((ArrayList) this.e);
            ((ArrayList) this.e).clear();
        }
        for (ra4 ra4Var : listK0) {
            Trace.beginSection("InvokeInternalListeners");
            int size = ra4Var.d.size();
            for (int i = 0; i < size; i++) {
                owh owhVar = (owh) ra4Var.d.get(i);
                int size2 = ra4Var.e.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((ivh) ra4Var.e.get(i2)).E(owhVar.getRequest());
                }
            }
            Trace.endSection();
            Trace.beginSection("InvokeRequestListeners");
            int size3 = ra4Var.d.size();
            for (int i3 = 0; i3 < size3; i3++) {
                owh owhVar2 = (owh) ra4Var.d.get(i3);
                int size4 = owhVar2.getRequest().d.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ((ivh) owhVar2.getRequest().d.get(i4)).E(owhVar2.getRequest());
                }
            }
            Trace.endSection();
        }
        sa4 sa4Var = (sa4) this.c;
        synchronized (sa4Var.k) {
            sa4Var.toString();
            ((ac4) sa4Var.e).O();
        }
    }

    public final void c(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            d((rb4) it.next());
        }
    }

    public final void d(rb4 rb4Var) {
        ArrayList arrayList = (ArrayList) this.e;
        if (arrayList.contains(rb4Var)) {
            return;
        }
        arrayList.add(rb4Var);
    }

    public final void e(pql pqlVar, en8 en8Var, s7m s7mVar) {
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 15:
                if (obj != null) {
                    return zzafo.b(this, obj, new String[0]);
                }
                return false;
            default:
                return super.equals(obj);
        }
    }

    public final void f(tj5 tj5Var) {
        for (an2 an2Var : tj5Var.d()) {
            ((fee) this.d).b(an2Var, (Object) null);
            ((fee) this.d).q(an2Var, tj5Var.h(an2Var), tj5Var.i(an2Var));
        }
    }

    public final tyj h(int i, String str) {
        String str2 = (String) this.c;
        tyj tyjVar = new tyj(str2, str2 + "#" + this.b, str, i);
        this.b = this.b + 1;
        ((ArrayList) this.e).add(tyjVar);
        return tyjVar;
    }

    public final int hashCode() {
        switch (this.a) {
            case 15:
                return zzafq.a(this, new String[0]);
            default:
                return super.hashCode();
        }
    }

    public final ai4 j() {
        ArrayList arrayList = new ArrayList((HashSet) this.c);
        wrf wrfVarF = wrf.f((fee) this.d);
        int i = this.b;
        ArrayList arrayList2 = new ArrayList((ArrayList) this.e);
        bfe bfeVar = (bfe) this.f;
        hbl hblVar = hbl.b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = ((hbl) bfeVar).a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        return new ai4(arrayList, wrfVarF, i, arrayList2, new hbl(arrayMap));
    }

    public final int k(String str) {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.b, str);
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        fr3.p();
        return iGlGetAttribLocation;
    }

    public final tyj l() {
        return (tyj) CollectionsKt.firstOrNull((ArrayList) this.e);
    }

    public final void m() {
        if (((d7l) this.e) == null) {
            return;
        }
        ((LoadingView) this.c).a(true);
        this.e = null;
    }

    public final void n(k6l k6lVar, LoadingView loadingView, i16 i16Var) {
        this.d = k6lVar;
        this.f = k6lVar.a(new qz(this, (byte) 11));
        this.c = loadingView;
        loadingView.b(new tah(i16Var));
    }

    public final boolean o(pyl pylVar, int i) {
        return Objects.equals(((luh[]) this.c)[i], ((luh[]) pylVar.c)[i]) && Objects.equals(((bj8[]) this.d)[i], ((bj8[]) pylVar.d)[i]);
    }

    public final void onFailure(v84 v84Var, IOException iOException) {
        String message = iOException.getMessage();
        if (message == null) {
            message = "Unknown failure";
        }
        t(message);
    }

    public final void onResponse(v84 v84Var, pzh pzhVar) {
        try {
            if (pzhVar.q) {
                ((b94) this.c).run(new orh((String) this.d));
            } else if (pzhVar.d == 409) {
                q(pzhVar);
            } else {
                t("Bad response: " + pzhVar.c);
            }
        } finally {
            pzhVar.close();
        }
    }

    public final boolean p(int i) {
        return ((luh[]) this.c)[i] != null;
    }

    public final void q(pzh pzhVar) throws JSONException {
        Object objU;
        try {
            objU = orb.u(new JSONObject(pzhVar.g.string()).get("code"));
        } catch (JSONException unused) {
        }
        if (objU == null) {
            throw new JSONException("code is null");
        }
        if ("token_registered".equals(String.valueOf(objU))) {
            ((b94) this.c).run(new orh((String) this.d));
            return;
        }
        t("Bad response: " + pzhVar.c);
    }

    public final void r(f65 f65Var) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.e;
        for (o0o o0oVar : (List) this.c) {
            if (((ArrayList) this.d).indexOf(o0oVar.a) >= this.b && Intrinsics.a(linkedHashMap.get(o0oVar.a), Boolean.TRUE)) {
                if (o0oVar.f == null) {
                    o0oVar.f = na2.g(f65Var, (CoroutineContext) null, (rx5) null, new n0o(o0oVar, (mt5) null, (byte) 0), 3);
                }
                List list = o0oVar.c;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (Intrinsics.a(linkedHashMap.get(((o0o) obj).a), Boolean.TRUE)) {
                        arrayList.add(obj);
                    }
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    o0o o0oVar2 = (o0o) obj2;
                    if (o0oVar2.f == null) {
                        o0oVar2.f = na2.g(f65Var, (CoroutineContext) null, (rx5) null, new n0o(o0oVar2, (mt5) null, (byte) 0), 3);
                    }
                }
            }
        }
    }

    public final void s(int i, boolean z, boolean z2, String str, v50 v50Var, long j, Long l) {
        long j2;
        SparseArray sparseArray = (SparseArray) this.e;
        wjh wjhVar = (wjh) this.c;
        o59 o59Var = (o59) wjhVar.f;
        if (z) {
            if (o59Var != null && o59Var.g <= -1) {
                o59Var.g = SystemClock.uptimeMillis() - ((o59) wjhVar.f).b;
                wjhVar.p();
            }
        } else if (o59Var != null && o59Var.o == null) {
            o59Var.o = z2 ? ie0.e : ie0.f;
            wjhVar.p();
        }
        int iIndexOfKey = sparseArray.indexOfKey(i);
        if (iIndexOfKey >= 0) {
            jp jpVar = (jp) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
            yo yoVar = jpVar.b;
            String str2 = jpVar.d;
            q50 q50Var = jpVar.c;
            long j3 = jpVar.f;
            if (yoVar == yo.FAKE_AD) {
                return;
            }
            x5f x5fVar = (x5f) this.d;
            String str3 = jpVar.a;
            if (z) {
                u50 u50VarH = yo.h(yoVar);
                long jElapsedRealtime = SystemClock.elapsedRealtime() - j3;
                if (x5fVar.h) {
                    j2 = j3;
                    x5fVar.t(g60.b, str3, u50VarH, q50Var, str2, jElapsedRealtime, v50Var, j, l);
                } else {
                    j2 = j3;
                }
            } else {
                j2 = j3;
                x5fVar.p(str3, yo.h(yoVar), q50Var, str2, SystemClock.elapsedRealtime() - j2, z2, v50Var, l);
            }
            String strJ = z ? "fill" : z2 ? "no-fill" : !TextUtils.isEmpty(str) ? sko.j("error: ", str) : "error";
            jec jecVar = (jec) this.f;
            String str4 = jpVar.a;
            long j4 = jpVar.e;
            jecVar.add(new ip(j4, (SystemClock.elapsedRealtime() - j2) + j4, str4, strJ));
        }
    }

    public final void t(String str) {
        b94 b94Var = (b94) this.c;
        int i = this.b;
        if (i >= 4) {
            b94Var.run(new nrh((String) this.d));
            return;
        }
        shf shfVar = (shf) this.e;
        new oml(((umi) shfVar.b).d(new vn(shfVar, (fvh) this.f, (String) this.d, b94Var, i, (byte) 2))).b(null, 5 * (1 << (i + 1)), TimeUnit.SECONDS, null);
    }

    public final String toString() {
        switch (this.a) {
            case 5:
                return "GraphRequestProcessor-" + this.b;
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x028a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(defpackage.b2l r18) {
        /*
            Method dump skipped, instructions count: 1062
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pyl.u(b2l):void");
    }

    public final Unit v() {
        toString();
        if (!((af2) this.d).a()) {
            return Unit.a;
        }
        ((sa4) this.c).e();
        Unit unit = Unit.a;
        px5 px5Var = px5.a;
        return unit;
    }

    public final boolean w(boolean z, List list, u9d u9dVar, Map map, Map map2, List list2) throws Throwable {
        Throwable th;
        boolean z2;
        boolean zIsTerminated;
        if (((af2) this.d).b()) {
            Objects.toString(list);
            toString();
            return false;
        }
        try {
            Trace.beginSection("CXCP#buildCaptureSequence");
            ra4 ra4VarA = ((sa4) this.c).a(z, list, u9dVar, map, map2, (xm5) this.f, list2);
            Trace.endSection();
            boolean z3 = true;
            if (ra4VarA == null) {
                List list3 = list;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        if (((lvh) it.next()).f != null) {
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                lvh lvhVar = (lvh) it2.next();
                                f9b f9bVar = lvhVar.f;
                                if (f9bVar != null) {
                                    ExecutorService executorService = f9bVar.a;
                                    if (executorService instanceof AutoCloseable) {
                                        executorService.close();
                                    } else {
                                        if (!(executorService instanceof ExecutorService)) {
                                            hai.d();
                                            return false;
                                        }
                                        ExecutorService executorService2 = executorService;
                                        if (executorService2 != ForkJoinPool.commonPool() && !(zIsTerminated = executorService2.isTerminated())) {
                                            executorService2.shutdown();
                                            boolean z4 = false;
                                            while (!zIsTerminated) {
                                                try {
                                                    zIsTerminated = executorService2.awaitTermination(1L, TimeUnit.DAYS);
                                                } catch (InterruptedException unused) {
                                                    if (!z4) {
                                                        executorService2.shutdownNow();
                                                        z4 = true;
                                                    }
                                                }
                                            }
                                            if (z4) {
                                                Thread.currentThread().interrupt();
                                            }
                                        }
                                    }
                                }
                                Iterator it3 = lvhVar.d.iterator();
                                while (it3.hasNext()) {
                                    ((ivh) it3.next()).E(lvhVar);
                                }
                            }
                            return true;
                        }
                    }
                }
                list.toString();
                toString();
                return false;
            }
            if (((af2) this.d).b()) {
                list.toString();
                toString();
                return false;
            }
            if (!ra4VarA.b) {
                synchronized (((ArrayList) this.e)) {
                    ((ArrayList) this.e).add(ra4VarA);
                }
            }
            try {
                toString();
                ra4VarA.toString();
                Trace.beginSection("InvokeInternalListeners");
                int size = ra4VarA.d.size();
                for (int i = 0; i < size; i++) {
                    owh owhVar = (owh) ra4VarA.d.get(i);
                    int size2 = ra4VarA.e.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((ivh) ra4VarA.e.get(i2)).o(owhVar);
                    }
                }
                Trace.endSection();
                Trace.beginSection("InvokeRequestListeners");
                int size3 = ra4VarA.d.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    owh owhVar2 = (owh) ra4VarA.d.get(i3);
                    int size4 = owhVar2.getRequest().d.size();
                    for (int i4 = 0; i4 < size4; i4++) {
                        ((ivh) owhVar2.getRequest().d.get(i4)).o(owhVar2);
                    }
                }
            } catch (CameraAccessException unused2) {
                if (!ra4VarA.b) {
                    synchronized (((ArrayList) this.e)) {
                        ((ArrayList) this.e).remove(ra4VarA);
                        Trace.beginSection("InvokeInternalListeners");
                        int size5 = ra4VarA.d.size();
                        for (int i5 = 0; i5 < size5; i5++) {
                            owh owhVar3 = (owh) ra4VarA.d.get(i5);
                            int size6 = ra4VarA.e.size();
                            for (int i6 = 0; i6 < size6; i6++) {
                                ((ivh) ra4VarA.e.get(i6)).E(owhVar3.getRequest());
                            }
                        }
                        Trace.endSection();
                        Trace.beginSection("InvokeRequestListeners");
                        int size7 = ra4VarA.d.size();
                        for (int i7 = 0; i7 < size7; i7++) {
                            owh owhVar4 = (owh) ra4VarA.d.get(i7);
                            int size8 = owhVar4.getRequest().d.size();
                            for (int i8 = 0; i8 < size8; i8++) {
                                ((ivh) owhVar4.getRequest().d.get(i8)).E(owhVar4.getRequest());
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                z3 = false;
            }
            synchronized (ra4VarA) {
                if (!((af2) this.d).b()) {
                    try {
                        Trace.beginSection("CXCP#submit(CaptureSequence)");
                        Integer numH = ((sa4) this.c).h(ra4VarA);
                        int iIntValue = numH != null ? numH.intValue() : -1;
                        ra4VarA.m = Integer.valueOf(iIntValue);
                        if (iIntValue != -1) {
                            Trace.beginSection("InvokeInternalListeners");
                            int size9 = ra4VarA.d.size();
                            for (int i9 = 0; i9 < size9; i9++) {
                                owh owhVar5 = (owh) ra4VarA.d.get(i9);
                                int size10 = ra4VarA.e.size();
                                for (int i10 = 0; i10 < size10; i10++) {
                                    ((ivh) ra4VarA.e.get(i10)).m(owhVar5);
                                }
                            }
                            Trace.endSection();
                            Trace.beginSection("InvokeRequestListeners");
                            int size11 = ra4VarA.d.size();
                            for (int i11 = 0; i11 < size11; i11++) {
                                owh owhVar6 = (owh) ra4VarA.d.get(i11);
                                int size12 = owhVar6.getRequest().d.size();
                                for (int i12 = 0; i12 < size12; i12++) {
                                    ((ivh) owhVar6.getRequest().d.get(i12)).m(owhVar6);
                                }
                            }
                            try {
                                toString();
                                ra4VarA.toString();
                                z2 = true;
                            } catch (CameraAccessException unused3) {
                            } catch (Throwable th3) {
                                th = th3;
                                if (z3 || ra4VarA.b) {
                                    throw th;
                                }
                                synchronized (((ArrayList) this.e)) {
                                    ((ArrayList) this.e).remove(ra4VarA);
                                }
                                Trace.beginSection("InvokeInternalListeners");
                                int size13 = ra4VarA.d.size();
                                for (int i13 = 0; i13 < size13; i13++) {
                                    owh owhVar7 = (owh) ra4VarA.d.get(i13);
                                    int size14 = ra4VarA.e.size();
                                    for (int i14 = 0; i14 < size14; i14++) {
                                        ((ivh) ra4VarA.e.get(i14)).E(owhVar7.getRequest());
                                    }
                                }
                                Trace.endSection();
                                Trace.beginSection("InvokeRequestListeners");
                                int size15 = ra4VarA.d.size();
                                for (int i15 = 0; i15 < size15; i15++) {
                                    owh owhVar8 = (owh) ra4VarA.d.get(i15);
                                    int size16 = owhVar8.getRequest().d.size();
                                    for (int i16 = 0; i16 < size16; i16++) {
                                        ((ivh) owhVar8.getRequest().d.get(i16)).E(owhVar8.getRequest());
                                    }
                                }
                                throw th;
                            }
                        } else {
                            ra4VarA.toString();
                            toString();
                            z2 = false;
                            z3 = false;
                        }
                        if (!z2 && !ra4VarA.b) {
                            synchronized (((ArrayList) this.e)) {
                                ((ArrayList) this.e).remove(ra4VarA);
                            }
                            Trace.beginSection("InvokeInternalListeners");
                            int size17 = ra4VarA.d.size();
                            for (int i17 = 0; i17 < size17; i17++) {
                                owh owhVar9 = (owh) ra4VarA.d.get(i17);
                                int size18 = ra4VarA.e.size();
                                for (int i18 = 0; i18 < size18; i18++) {
                                    ((ivh) ra4VarA.e.get(i18)).E(owhVar9.getRequest());
                                }
                            }
                            Trace.endSection();
                            Trace.beginSection("InvokeRequestListeners");
                            int size19 = ra4VarA.d.size();
                            for (int i19 = 0; i19 < size19; i19++) {
                                owh owhVar10 = (owh) ra4VarA.d.get(i19);
                                int size20 = owhVar10.getRequest().d.size();
                                for (int i20 = 0; i20 < size20; i20++) {
                                    ((ivh) owhVar10.getRequest().d.get(i20)).E(owhVar10.getRequest());
                                }
                            }
                        }
                        return z3;
                    } finally {
                    }
                }
                ra4VarA.toString();
                toString();
                if (!ra4VarA.b) {
                    synchronized (((ArrayList) this.e)) {
                        ((ArrayList) this.e).remove(ra4VarA);
                    }
                    Trace.beginSection("InvokeInternalListeners");
                    int size21 = ra4VarA.d.size();
                    for (int i21 = 0; i21 < size21; i21++) {
                        owh owhVar11 = (owh) ra4VarA.d.get(i21);
                        int size22 = ra4VarA.e.size();
                        for (int i22 = 0; i22 < size22; i22++) {
                            ((ivh) ra4VarA.e.get(i22)).E(owhVar11.getRequest());
                        }
                    }
                    Trace.endSection();
                    Trace.beginSection("InvokeRequestListeners");
                    int size23 = ra4VarA.d.size();
                    for (int i23 = 0; i23 < size23; i23++) {
                        owh owhVar12 = (owh) ra4VarA.d.get(i23);
                        int size24 = owhVar12.getRequest().d.size();
                        for (int i24 = 0; i24 < size24; i24++) {
                            ((ivh) owhVar12.getRequest().d.get(i24)).E(owhVar12.getRequest());
                        }
                    }
                    return false;
                }
                return false;
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void x(int i) {
        int[] iArr = (int[]) this.e;
        if (iArr[i] != 0) {
            return;
        }
        iArr[i] = 1;
        for (o4a o4aVar : ((o4a[][]) this.d)[i]) {
            x(o4aVar.a.b);
            o4a[] o4aVarArr = (o4a[]) this.c;
            int i2 = this.b;
            this.b = i2 - 1;
            o4aVarArr[i2] = o4aVar;
        }
        iArr[i] = 2;
    }
}
