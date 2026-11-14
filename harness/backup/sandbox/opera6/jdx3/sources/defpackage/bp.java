package defpackage;

import J.N;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.LightingColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.view.View;
import com.leanplum.internal.ResourceQualifiers;
import com.opera.android.OperaApplication;
import com.opera.android.browser.NavigationEntry;
import com.opera.android.browser.SessionStore;
import com.opera.android.browser.chromium.ChromiumContent;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import kotlin.collections.CollectionsKt;
import org.chromium.mojo.system.impl.CoreImpl;

/* loaded from: classes.dex */
public class bp implements fd2, b36, m82, bag, jke, p9n {
    public int a;
    public Object b;

    public bp(byte b) {
        switch (b) {
            case 21:
                this.a = 0;
                this.b = ColorStateList.valueOf(0);
                break;
            case 23:
                this.b = new LinkedHashMap();
                break;
            case 27:
                this.b = new g1g(8);
                break;
            default:
                this.a = 0;
                this.b = new StringBuilder();
                break;
        }
    }

    public bp(int i) {
        this.a = i;
        this.b = (i & 16777215) == 16777215 ? null : new LightingColorFilter(i, 0);
    }

    public bp(bp bpVar) {
        this.a = bpVar.a;
        this.b = (ColorStateList) bpVar.b;
    }

    public bp(SessionStore sessionStore, int i) {
        this.a = i;
        Objects.requireNonNull(sessionStore);
        this.b = sessionStore;
    }

    public bp(Class cls) {
        this.a = 1;
        this.b = cls;
    }

    public /* synthetic */ bp(Object obj) {
        this.b = obj;
    }

    public /* synthetic */ bp(Object obj, int i) {
        this.b = obj;
        this.a = i;
    }

    public bp(CoreImpl coreImpl, int i) {
        zg zgVar = new zg();
        zgVar.d = new ArrayList();
        zgVar.b = coreImpl;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i <= 0 ? 1024 : i);
        zgVar.c = byteBufferAllocateDirect;
        byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        zgVar.a = 0;
        this(zgVar);
    }

    public bp(zg zgVar) {
        this.b = zgVar;
        this.a = zgVar.a;
    }

    public static boolean R(Context context, Class cls) throws SecurityException {
        Intent intent = new Intent(context, (Class<?>) cls);
        try {
            context.startService(intent);
            return true;
        } catch (IllegalStateException unused) {
            S(context, cls, "launch_fg");
            if (Build.VERSION.SDK_INT >= 31) {
                return m41.M(context, intent);
            }
            context.startForegroundService(intent);
            return true;
        }
    }

    public static void S(Context context, Class cls, String str) throws SecurityException {
        String strValueOf;
        String strValueOf2;
        ActivityManager.RunningServiceInfo runningServiceInfo = null;
        if (context != null) {
            List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) context.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE);
            ComponentName componentName = new ComponentName(context, (Class<?>) cls);
            Iterator<ActivityManager.RunningServiceInfo> it = runningServices.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningServiceInfo next = it.next();
                if (componentName.equals(next.service)) {
                    runningServiceInfo = next;
                    break;
                }
            }
        }
        String simpleName = cls.getSimpleName();
        Locale locale = Locale.US;
        if (runningServiceInfo != null) {
            strValueOf2 = String.valueOf(runningServiceInfo.foreground);
            strValueOf = String.valueOf(runningServiceInfo.flags);
        } else {
            strValueOf = "n/a";
            strValueOf2 = strValueOf;
        }
        String strValueOf3 = context != null ? String.valueOf(((ActivityManager) context.getSystemService("activity")).isBackgroundRestricted()) : "n/a";
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        runningAppProcessInfo.importance = -1;
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        int i = runningAppProcessInfo.importance;
        StringBuilder sbN = z1m.n(str, "[fg=", strValueOf2, ",fl=", strValueOf);
        sbN.append(",bg=");
        sbN.append(strValueOf3);
        sbN.append(",imp=");
        sbN.append(i);
        sbN.append("]");
        String string = sbN.toString();
        ks3.k.J(simpleName + " " + string);
    }

    public final void A(int i, int i2, boolean z) {
        int i3 = this.a;
        zg zgVar = (zg) this.b;
        if (z) {
            int i4 = i3 + i;
            ((ByteBuffer) zgVar.c).put(i4, (byte) (((ByteBuffer) zgVar.c).get(i4) | ((byte) (1 << i2))));
        }
    }

    @Override // defpackage.jke
    public final void B(ChromiumContent chromiumContent, int i, HashMap map) {
        N.MbDDD5E8(((SessionStore) this.b).a, chromiumContent.e(), i, map);
    }

    public final void C(int i, int i2, int[] iArr) throws e22 {
        if (iArr == null) {
            N(i, wyh.E(i2));
        } else {
            ((ByteBuffer) ((zg) P(4, iArr.length, i, -1).b).c).asIntBuffer().put(iArr);
        }
    }

    public final void D(int i, long j) {
        ((ByteBuffer) ((zg) this.b).c).putLong(this.a + i, j);
    }

    public final void E(int i, String str, boolean z) throws e22 {
        if (str == null) {
            N(i, z);
        } else {
            z(i, z ? 1 : 0, -1, str.getBytes(Charset.forName("utf8")));
        }
    }

    public final void F(bc6 bc6Var) {
        zg zgVar = (zg) this.b;
        zgVar.a += (bc6Var.a + 7) & (-8);
        if (((ByteBuffer) zgVar.c).capacity() < zgVar.a) {
            int iCapacity = ((ByteBuffer) zgVar.c).capacity();
            do {
                iCapacity <<= 1;
            } while (iCapacity < zgVar.a);
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(iCapacity);
            byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
            ((ByteBuffer) zgVar.c).position(0);
            ByteBuffer byteBuffer = (ByteBuffer) zgVar.c;
            byteBuffer.limit(byteBuffer.capacity());
            byteBufferAllocateDirect.put((ByteBuffer) zgVar.c);
            zgVar.c = byteBufferAllocateDirect;
        }
        y(bc6Var.a, 0);
        y(bc6Var.b, 4);
    }

    public final void G(w6a w6aVar, int i, boolean z) throws e22 {
        zg zgVar = (zg) this.b;
        if (w6aVar == null || !w6aVar.isValid()) {
            M(i, z);
        } else {
            y(((ArrayList) zgVar.d).size(), i);
            ((ArrayList) zgVar.d).add(w6aVar);
        }
    }

    public final void H(neb nebVar, int i, boolean z, a26 a26Var) throws e22 {
        if (nebVar == null) {
            M(i, z);
            y(0, i + 4);
            return;
        }
        CoreImpl coreImpl = (CoreImpl) ((zg) this.b).b;
        if (coreImpl == null) {
            yt7.k("The encoder has been created without a Core. It can't encode an interface.");
            return;
        }
        if (nebVar instanceof meb) {
            leb lebVarK = ((meb) nebVar).k();
            G(lebVarK.b.R(), i, z);
            y(lebVarK.c, i + 4);
        } else {
            kyf kyfVarB = coreImpl.b((ir5) null);
            a26Var.m(nebVar, (kwd) kyfVarB.a);
            G((w6a) kyfVarB.b, i, z);
            y(0, i + 4);
        }
    }

    public final void I(ueb uebVar, int i) throws e22 {
        if (uebVar == null) {
            M(i, false);
        } else if (((CoreImpl) ((zg) this.b).b) != null) {
            G(uebVar.a.q0(), i, false);
        } else {
            yt7.k("The encoder has been created without a Core. It can't encode an interface.");
        }
    }

    public final void J(uik uikVar, int i, boolean z) throws e22 {
        if (uikVar == null) {
            N(i, z);
        } else {
            D(i, ((zg) this.b).a - (this.a + i));
            uikVar.a(this);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: e22 */
    public final void K(slm slmVar, int i, boolean z) throws e22 {
        if (slmVar != null) {
            slmVar.a(this, i);
        } else {
            if (!z) {
                throw new e22("Trying to encode a null pointer for a non-nullable type.");
            }
            D(i, 0L);
            D(i + 8, 0L);
        }
    }

    public final void L(short s, int i) {
        ((ByteBuffer) ((zg) this.b).c).putShort(this.a + i, s);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: e22 */
    public final void M(int i, boolean z) throws e22 {
        if (!z) {
            throw new e22("Trying to encode an invalid handle for a non-nullable type.");
        }
        ((ByteBuffer) ((zg) this.b).c).putInt(this.a + i, -1);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: e22 */
    public final void N(int i, boolean z) throws e22 {
        if (!z) {
            throw new e22("Trying to encode a null pointer for a non-nullable type.");
        }
        ((ByteBuffer) ((zg) this.b).c).putLong(this.a + i, 0L);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: e22 */
    public final bp O(int i, int i2, int i3, int i4) throws e22 {
        if (i4 != -1 && i4 != i2) {
            throw new e22("Trying to encode a fixed array of incorrect length.");
        }
        D(i3, ((zg) this.b).a - (this.a + i3));
        return Q(new bc6((i * i2) + 8, i2));
    }

    public final bp P(int i, int i2, int i3, int i4) throws e22 {
        bp bpVarO = O(i, i2, i3, i4);
        ((ByteBuffer) ((zg) bpVarO.b).c).position(bpVarO.a + 8);
        return bpVarO;
    }

    public final bp Q(bc6 bc6Var) {
        bp bpVar = new bp((zg) this.b);
        bpVar.F(bc6Var);
        return bpVar;
    }

    public final void T(Context context, String str) throws SecurityException {
        Class cls = (Class) this.b;
        Locale locale = Locale.US;
        S(context, cls, str + "[st=" + vep.A(this.a) + "]");
    }

    public final void U(boolean z) {
        o8f o8fVar = (o8f) this.b;
        int i = this.a;
        if (z) {
            int i2 = i + 1;
            this.a = i2;
            if (i2 == 1) {
                o8fVar.run(Boolean.TRUE);
                return;
            }
            return;
        }
        int i3 = i - 1;
        this.a = i3;
        if (i3 == 0) {
            o8fVar.run(Boolean.FALSE);
        }
    }

    public final void V() {
        tz tzVar;
        aqi aqiVar = (aqi) this.b;
        if (aqiVar == null || (tzVar = aqiVar.q) == null) {
            return;
        }
        tzVar.b(aqiVar);
    }

    public final void W() {
        aqi aqiVar = (aqi) this.b;
        if (aqiVar != null) {
            this.a++;
            tz tzVar = aqiVar.q;
            if (tzVar != null) {
                tzVar.a(aqiVar);
            }
        }
    }

    @Override // defpackage.jke
    public final void X(NavigationEntry navigationEntry, boolean z) {
        SessionStore sessionStore = (SessionStore) this.b;
        HashMap map = sessionStore.b;
        int i = this.a;
        j4j j4jVar = (j4j) map.get(Integer.valueOf(i));
        long j = sessionStore.a;
        int i2 = this.a;
        hlj hljVar = (hlj) navigationEntry;
        String url = hljVar.getUrl();
        lsc lscVar = hljVar.b;
        N.Mt8_ckp0(j, i2, url, lscVar.a, hljVar.getTitle(), hljVar.a(), (Object) null, (Object) null, true);
        if (j4jVar != null) {
            int i3 = j4jVar.a;
            sessionStore.injectNavigationHistory(i, i3 + 1, i3);
            ((SessionStore) this.b).injectNavigationEntry(this.a, j4jVar.a, hljVar.getUrl(), lscVar.a, hljVar.getTitle(), hljVar.a(), null, null);
        }
    }

    @Override // defpackage.fd2
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final void onResult(gom gomVar) {
        Context context = (Context) this.b;
        String[] strArr = OperaApplication.K;
        x5f x5fVar = ((OperaApplication) context.getApplicationContext()).L().c;
        boolean z = gomVar.a != lom.a;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            x56VarF.F(zpaVar).r(28, 1, z);
            x5fVar.U0(x56VarF);
        }
        xf8.n0(context, (lkk) null, this.a == 3);
    }

    public final long Z(lp6 lp6Var) {
        g1g g1gVar = (g1g) this.b;
        int i = 0;
        lp6Var.peekFully(g1gVar.a, 0, 1, false);
        int i2 = g1gVar.a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        lp6Var.peekFully(g1gVar.a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (i5 << 8) + (g1gVar.a[i] & 255);
        }
        this.a = i4 + 1 + this.a;
        return i5;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        String str;
        if (bArr.length != this.a) {
            str = "wrong key length";
        } else {
            if (bArr2.length == 32) {
                return f(3, bArr, bArr2);
            }
            str = "wrong address length";
        }
        qp2.o(str);
        return null;
    }

    public final void a0(wsd wsdVar, jva jvaVar, Map map, long j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        Object arrayList = linkedHashMap.get(wsdVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(wsdVar, arrayList);
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        fmh fmhVar = new fmh(new WeakReference(jvaVar), map, j);
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                fmh fmhVar2 = (fmh) arrayList2.get(i);
                if (j < fmhVar2.c) {
                    i++;
                } else if (fmhVar2.a.get() == jvaVar) {
                    arrayList2.set(i, fmhVar);
                } else {
                    arrayList2.add(i, fmhVar);
                }
            }
        } else {
            arrayList2.add(fmhVar);
        }
        e();
    }

    @Override // defpackage.fd2
    public final Object b(Object obj) {
        return mom.a((Context) this.b);
    }

    public final boolean b0(Context context) {
        int iA = vep.A(this.a);
        if (iA != 1) {
            if (iA != 2) {
                if (!R(context, (Class) this.b)) {
                    return false;
                }
                this.a = 2;
                return true;
            }
            this.a = 2;
        }
        return true;
    }

    @Override // defpackage.jke
    public final void c() {
        NavigationEntry navigationEntryI = i(j());
        N.M8TIgPA6(((SessionStore) this.b).a, this.a, navigationEntryI.getUrl(), navigationEntryI.d(), navigationEntryI.getTitle(), navigationEntryI.a(), navigationEntryI.c(), navigationEntryI.e());
    }

    public final void c0(Context context) {
        int iA = vep.A(this.a);
        if (iA == 1) {
            this.a = 3;
        } else if (iA != 2) {
            context.stopService(new Intent(context, (Class<?>) this.b));
        }
    }

    @Override // com.opera.android.browser.NavigationHistory
    public final int d() {
        return ((SessionStore) this.b).b(this.a).a;
    }

    public final void d0(int i, boolean z, boolean z2, int i2, boolean z3, boolean z4) {
        boolean z5 = z || (z4 && !z2);
        iqh iqhVar = (iqh) this.b;
        if (iqhVar == null || !z5) {
            iqhVar = new iqh(this, !z3, new hqh(z4, z2, (i & 255) == 8, false, (i & 2097152) == 2097152));
            this.b = iqhVar;
            this.a = i2;
        } else {
            iqhVar.b = false;
        }
        if ((i & 16777216) != 0) {
            iqhVar.e = true;
        }
    }

    public final void e() {
        int i = this.a;
        this.a = i + 1;
        if (i >= 10) {
            this.a = 0;
            Iterator it = ((LinkedHashMap) this.b).values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = (ArrayList) it.next();
                if (arrayList.size() <= 1) {
                    fmh fmhVar = (fmh) CollectionsKt.firstOrNull(arrayList);
                    if ((fmhVar != null ? (jva) fmhVar.a.get() : null) == null) {
                        it.remove();
                    }
                } else {
                    int size = arrayList.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size; i3++) {
                        int i4 = i3 - i2;
                        if (((fmh) arrayList.get(i4)).a.get() == null) {
                            arrayList.remove(i4);
                            i2++;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        it.remove();
                    }
                }
            }
        }
    }

    public final byte[] f(int i, byte[] bArr, byte[] bArr2) {
        long j = i;
        int i2 = this.a;
        byte[] bArrI = dbh.I(i2, j);
        vci vciVar = (t87) this.b;
        vciVar.g(0, bArrI.length, bArrI);
        vciVar.g(0, bArr.length, bArr);
        vciVar.g(0, bArr2.length, bArr2);
        byte[] bArr3 = new byte[i2];
        if (vciVar instanceof vci) {
            vciVar.o(0, i2, bArr3);
            return bArr3;
        }
        if (i2 >= vciVar.d()) {
            vciVar.e(0, bArr3);
            return bArr3;
        }
        byte[] bArr4 = new byte[vciVar.d()];
        vciVar.e(0, bArr4);
        System.arraycopy(bArr4, 0, bArr3, 0, i2);
        return bArr3;
    }

    @Override // defpackage.bag
    public final v9g g(Activity activity, List list) {
        return new t9g(activity, 2132020437, activity.getString(2132021287, activity.getString(2132017591)));
    }

    @Override // defpackage.p9n
    public final void h(View view) {
        this.a++;
        c1f c1fVar = (c1f) this.b;
        fck fckVar = (fck) ((HashMap) c1fVar.f).get(view);
        if (fckVar != null) {
            ((ArrayList) c1fVar.a).add(new gck(fckVar, this.a));
        }
    }

    @Override // com.opera.android.browser.NavigationHistory
    public final NavigationEntry i(int i) {
        SessionStore sessionStore = (SessionStore) this.b;
        int i2 = this.a;
        Map map = (Map) sessionStore.c.get(Integer.valueOf(i2));
        NavigationEntry navigationEntry = map == null ? null : (NavigationEntry) map.get(Integer.valueOf(i));
        if (navigationEntry != null) {
            return navigationEntry;
        }
        N.Me4jApA8(sessionStore.a, i2, i);
        Map map2 = (Map) sessionStore.c.get(Integer.valueOf(i2));
        NavigationEntry navigationEntry2 = map2 != null ? (NavigationEntry) map2.get(Integer.valueOf(i)) : null;
        return navigationEntry2 == null ? SessionStore.h : navigationEntry2;
    }

    @Override // defpackage.jke
    public final boolean isDestroyed() {
        int i = this.a;
        SessionStore sessionStore = (SessionStore) this.b;
        boolean z = sessionStore.g;
        HashMap map = sessionStore.b;
        if (z) {
            return true;
        }
        if (map.containsKey(Integer.valueOf(i))) {
            return false;
        }
        N.MAgWVLVE(sessionStore.a, i);
        return !map.containsKey(Integer.valueOf(i));
    }

    @Override // com.opera.android.browser.NavigationHistory
    public final int j() {
        return ((SessionStore) this.b).b(this.a).b;
    }

    @Override // defpackage.m82
    public final void k(n82 n82Var, List list) {
        vz5 vz5Var = (vz5) this.b;
        if (n82Var != ((ash) vz5Var.h) || ((j92) vz5Var.i) == null) {
            return;
        }
        vz5Var.h = null;
        HashSet hashSet = new HashSet(((j92) vz5Var.i).f());
        LinkedHashSet linkedHashSet = new LinkedHashSet(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            oqe oqeVar = (oqe) it.next();
            if (!hashSet.contains(oqeVar) && !linkedHashSet.contains(oqeVar)) {
                linkedHashSet.add(oqeVar);
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashSet);
        if (arrayList.isEmpty()) {
            vz5Var.a++;
        } else {
            int i = this.a;
            j92 j92Var = (j92) vz5Var.i;
            if (i == 2) {
                j92Var.d(arrayList);
            } else {
                j92Var.g(arrayList);
            }
        }
        boolean zIsEmpty = list.isEmpty();
        int i2 = vz5Var.b;
        if (zIsEmpty) {
            if (i2 == -1 && !vz5Var.c) {
                vz5Var.c = true;
                l0c l0cVar = ((z05) vz5Var.e).a.e;
                String string = l0cVar == null ? "fallback" : l0cVar.toString();
                yqe yqeVar = ((qre) vz5Var.f).b;
                String str = yqeVar == null ? "main" : yqeVar.a;
                x5f x5fVar = (x5f) vz5Var.g;
                Locale locale = Locale.ROOT;
                x5fVar.R(6, p3p.w("locale: ", string, " category: ", str));
            }
        } else if (i2 == -1) {
            vz5Var.b = 0;
        } else {
            vz5Var.b = i2 + 1;
        }
        boolean zIsEmpty2 = arrayList.isEmpty();
        boolean z = !zIsEmpty2;
        if (arrayList.isEmpty() && vz5Var.a <= 2) {
            vz5Var.c(EnumSet.of(vc9.a));
            return;
        }
        vz5Var.a = 0;
        ((j92) vz5Var.i).i(z);
        if (zIsEmpty2) {
            return;
        }
        vz5Var.c(null);
    }

    @Override // defpackage.jke
    public final void l(int i) {
        SessionStore sessionStore = (SessionStore) this.b;
        HashMap map = sessionStore.b;
        int i2 = this.a;
        j4j j4jVar = (j4j) map.get(Integer.valueOf(i2));
        if (j4jVar == null || j4jVar.b != i) {
            N.MZaZjyFz(sessionStore.a, i2, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bag
    public final v9g n(dx3 dx3Var, ArrayList arrayList) {
        return new t9g(dx3Var, dx3Var.getString(2132021287, dx3Var.getString(2132017591)));
    }

    public final void q(Canvas canvas, Layout layout, int i, int i2, int i3) {
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int iMin = Math.min(i2, i3);
        int iMax = Math.max(i2, i3);
        Drawable drawable = (Drawable) this.b;
        drawable.setBounds(iMin, lineTop, iMax, lineBottom);
        drawable.draw(canvas);
    }

    @Override // defpackage.b36
    public final byte[] r(byte[] bArr) {
        try {
            Cipher cipher = (Cipher) this.b;
            int i = this.a;
            return cipher.doFinal(bArr, i, bArr.length - i);
        } catch (BadPaddingException | IllegalBlockSizeException unused) {
            return null;
        }
    }

    @Override // defpackage.bag
    public final void s() {
        ((kxe) this.b).y.X(this.a);
    }

    @Override // defpackage.bag
    public final void t() {
    }

    @Override // defpackage.jke
    public final void u() {
        int i;
        SessionStore sessionStore = (SessionStore) this.b;
        HashMap map = sessionStore.b;
        int i2 = this.a;
        j4j j4jVar = (j4j) map.get(Integer.valueOf(i2));
        if (j4jVar == null || !((i = j4jVar.a) == 0 || i == j4jVar.b + 1)) {
            N.MPW$f0YM(sessionStore.a, i2);
        }
    }

    @Override // com.opera.android.browser.NavigationHistory
    public final boolean v(int i) {
        return false;
    }

    @Override // defpackage.m82
    public final void w(n82 n82Var) {
        vz5 vz5Var = (vz5) this.b;
        if (n82Var != ((ash) vz5Var.h) || ((j92) vz5Var.i) == null) {
            return;
        }
        vz5Var.a();
        ((j92) vz5Var.i).onFailure();
    }

    public final void x(float f, int i) {
        ((ByteBuffer) ((zg) this.b).c).putFloat(this.a + i, f);
    }

    public final void y(int i, int i2) {
        ((ByteBuffer) ((zg) this.b).c).putInt(this.a + i2, i);
    }

    public final void z(int i, int i2, int i3, byte[] bArr) throws e22 {
        if (bArr == null) {
            N(i, wyh.E(i2));
        } else {
            ((ByteBuffer) ((zg) P(1, bArr.length, i, i3).b).c).put(bArr);
        }
    }
}
