package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class jvg implements hpf, fji, icj, u9j, o7l, ylo, fm {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public /* synthetic */ jvg(byte b) {
        this.a = b;
    }

    public /* synthetic */ jvg(byte b, Object obj, Object obj2, boolean z) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public jvg(Intent intent, ArrayList arrayList, b2l b2lVar, qn qnVar, dcj dcjVar) {
        this.a = (byte) 4;
        this.b = b2lVar;
        this.c = new cq(intent, arrayList, qnVar, dcjVar);
    }

    public jvg(hjf hjfVar, umi umiVar) {
        this.a = (byte) 7;
        ni6 ni6Var = new ni6(hjfVar, umiVar);
        r4k r4kVar = new r4k((byte) 8);
        this.b = ni6Var;
        this.c = r4kVar;
    }

    public jvg(ClassLoader classLoader, ujp ujpVar) {
        this.a = (byte) 3;
        this.b = classLoader;
        this.c = new yhe((Object) classLoader, (byte) 17);
    }

    public /* synthetic */ jvg(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ jvg(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj2;
        this.c = obj;
    }

    public jvg(l7n l7nVar, gjm gjmVar) {
        this.a = (byte) 12;
        this.b = gjmVar;
        this.c = new atl(l7nVar);
    }

    public jvg(umi umiVar) {
        this.a = (byte) 9;
        this.b = umiVar;
        this.c = new LinkedHashMap();
    }

    public jvg(v3m v3mVar) {
        this.a = (byte) 5;
        this.b = v3mVar;
        this.c = new v9j(this);
    }

    public jvg(x5i x5iVar) {
        this.a = (byte) 8;
        this.b = x5iVar;
        this.c = new Object();
    }

    public static void o(ViewGroup viewGroup, ArrayList arrayList, roj rojVar) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            rmo rmoVar = (rmo) obj;
            TextView textView = new TextView(viewGroup.getContext(), null, 0, 2132082707);
            textView.setText(rmoVar.a);
            textView.setOnClickListener(new obn(rojVar, rmoVar, (byte) 13));
            viewGroup.addView(textView);
        }
    }

    public final void A(int i, int i2) {
        int[] iArr = (int[]) this.b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        t(i3);
        int[] iArr2 = (int[]) this.b;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.b;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.c;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                z2k z2kVar = (z2k) ((ArrayList) this.c).get(size);
                int i4 = z2kVar.a;
                if (i4 >= i) {
                    if (i4 < i3) {
                        ((ArrayList) this.c).remove(size);
                    } else {
                        z2kVar.a = i4 - i2;
                    }
                }
            }
        }
    }

    public final w8k B(w4o w4oVar) {
        w8k w8kVarB;
        synchronized (this.c) {
            w8kVarB = ((x5i) this.b).b(w4oVar);
        }
        return w8kVarB;
    }

    public final List C(String str) {
        List listC;
        synchronized (this.c) {
            listC = ((x5i) this.b).c(str);
        }
        return listC;
    }

    public final w8k D(w4o w4oVar) {
        w8k w8kVarD;
        synchronized (this.c) {
            w8kVarD = ((x5i) this.b).d(w4oVar);
        }
        return w8kVarD;
    }

    public final void E(boolean z, boolean z2) {
        Context context = (Context) this.b;
        boolean z3 = false;
        if (z && ((WifiManager.WifiLock) this.c) == null) {
            if (context.checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                w7d.K("WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                return;
            }
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            if (wifiManager == null) {
                w7d.K("WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.c = wifiLockCreateWifiLock;
                wifiLockCreateWifiLock.setReferenceCounted(false);
            }
        }
        WifiManager.WifiLock wifiLock = (WifiManager.WifiLock) this.c;
        if (wifiLock == null) {
            return;
        }
        if (z && z2) {
            z3 = true;
        }
        if (z3) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }

    @Override // defpackage.hpf
    public final void I(fpf fpfVar) {
        tah tahVar = (tah) this.c;
        if (tahVar.N()) {
            tahVar.z(f8a.h.a(fpfVar.b), (amk) this.b);
        }
    }

    public final /* bridge */ /* synthetic */ Object a() {
        vlo vloVar = (vlo) this.c;
        return new kpo((ypo) ((vlo) this.b).a(), (eqo) vloVar.a());
    }

    @Override // defpackage.fji
    public final long b() {
        return ((ueh) this.c).F;
    }

    @Override // defpackage.fji
    public final String c() {
        return ((ueh) this.c).D;
    }

    @Override // defpackage.fji
    public final String d() {
        return getFileName();
    }

    @Override // defpackage.o7l
    public final void e(Set set, tmi tmiVar) {
        ArrayList arrayList = new ArrayList();
        synchronized (((LinkedHashMap) this.c)) {
            Collection collectionValues = ((LinkedHashMap) this.c).values();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : collectionValues) {
                if (!set.contains(Integer.valueOf(((m7l) obj).a))) {
                    arrayList2.add(obj);
                }
            }
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                ((LinkedHashMap) this.c).remove(Integer.valueOf(((m7l) obj2).a));
            }
            arrayList.addAll(((LinkedHashMap) this.c).values());
        }
        new rml(Unit.a, (umi) this.b).c(new d7k((Object) tmiVar, (Object) arrayList, (byte) 20)).l();
    }

    @Override // defpackage.icj
    public final jjm f(Context context) {
        cq cqVar = (cq) this.c;
        b2l b2lVar = (b2l) this.b;
        if (b2lVar != null) {
            qim qimVar = q9n.o(context).o;
            Objects.requireNonNull(qimVar);
            qimVar.f.R(cqVar, b2lVar);
            return cqVar;
        }
        nej nejVarF = a4h.f(context);
        nejVarF.getClass();
        nejVarF.b(cqVar, ijm.b);
        return cqVar;
    }

    @Override // defpackage.o7l
    public final void g(m7l m7lVar, q7l q7lVar) {
        synchronized (((LinkedHashMap) this.c)) {
            ((LinkedHashMap) this.c).put(Integer.valueOf(m7lVar.a), m7lVar);
        }
        new rml(Unit.a, (umi) this.b).c(new i7l(q7lVar, m7lVar, (byte) 1)).l();
    }

    @Override // defpackage.fji
    public final String getFileName() {
        SpannableStringBuilder spannableStringBuilderF = lg7.f((String) this.b);
        return ((Object) spannableStringBuilderF) + "." + ((ueh) this.c).C;
    }

    @Override // defpackage.hpf
    public final void h(cpf cpfVar) {
    }

    @Override // defpackage.fji
    public final boolean i() {
        return ((ueh) this.c).F > 0;
    }

    @Override // defpackage.u9j
    public final void j() {
        ((v9j) this.c).r(new yoj(v3m.f(((v3m) this.b).a)));
    }

    @Override // defpackage.o7l
    public final void k(int i, d7k d7kVar) {
        m7l m7lVar;
        synchronized (((LinkedHashMap) this.c)) {
            m7lVar = (m7l) ((LinkedHashMap) this.c).remove(Integer.valueOf(i));
        }
        new rml(Unit.a, (umi) this.b).c(new d7k((Object) d7kVar, (Object) m7lVar, (byte) 19)).l();
    }

    @Override // defpackage.o7l
    public final oml l(int i, d7k d7kVar) {
        m7l m7lVar;
        synchronized (((LinkedHashMap) this.c)) {
            m7lVar = (m7l) ((LinkedHashMap) this.c).get(Integer.valueOf(i));
        }
        return new rml(Unit.a, (umi) this.b).c(new d7k((Object) d7kVar, (Object) m7lVar, (byte) 18)).l();
    }

    @Override // defpackage.hpf
    public final void n(epf epfVar) {
    }

    @Override // defpackage.u9j
    public final void onStopped() {
    }

    public final void p(z2k z2kVar) {
        ArrayList arrayList = (ArrayList) this.c;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.c = arrayList;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) this.c;
            if (i >= size) {
                arrayList2.add(z2kVar);
                return;
            }
            z2k z2kVar2 = (z2k) arrayList2.get(i);
            if (z2kVar2.a == z2kVar.a) {
                ((ArrayList) this.c).remove(i);
            }
            if (z2kVar2.a >= z2kVar.a) {
                ((ArrayList) this.c).add(i, z2kVar);
                return;
            }
            i++;
        }
    }

    public final void q() {
        int[] iArr = (int[]) this.b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.c = null;
    }

    @Override // defpackage.hpf
    public final void r(gpf gpfVar) {
        tah tahVar = (tah) this.c;
        if (tahVar.N()) {
            tahVar.z(null, (amk) this.b);
        }
    }

    public final boolean s(w4o w4oVar) {
        boolean zContainsKey;
        synchronized (this.c) {
            zContainsKey = ((x5i) this.b).a.containsKey(w4oVar);
        }
        return zContainsKey;
    }

    public final void t(int i) {
        int[] iArr = (int[]) this.b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length <<= 1;
            }
            int[] iArr3 = new int[length];
            this.b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public final String toString() {
        switch (this.a) {
            case 17:
                return "AdErrorEvent: [error=" + ((dm) this.b) + "]";
            default:
                return super.toString();
        }
    }

    public final void u(int i) {
        ArrayList arrayList = (ArrayList) this.c;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((z2k) ((ArrayList) this.c).get(size)).a >= i) {
                    ((ArrayList) this.c).remove(size);
                }
            }
        }
        y(i);
    }

    public final z2k v(int i, int i2, int i3) {
        ArrayList arrayList = (ArrayList) this.c;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            z2k z2kVar = (z2k) ((ArrayList) this.c).get(i4);
            int i5 = z2kVar.a;
            if (i5 >= i2) {
                return null;
            }
            if (i5 >= i && (i3 == 0 || z2kVar.b == i3 || z2kVar.d)) {
                return z2kVar;
            }
        }
        return null;
    }

    public final z2k w(int i) {
        ArrayList arrayList = (ArrayList) this.c;
        if (arrayList == null) {
            return null;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            z2k z2kVar = (z2k) ((ArrayList) this.c).get(size);
            if (z2kVar.a == i) {
                return z2kVar;
            }
        }
        return null;
    }

    public final void x() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        boolean zBooleanValue;
        ClassLoader classLoader = (ClassLoader) ((yhe) this.c).b;
        try {
            classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
            Method declaredMethod = classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider").getDeclaredMethod("getWindowExtensions", null);
            if (declaredMethod.getReturnType().equals(classLoader.loadClass("androidx.window.extensions.WindowExtensions")) && Modifier.isPublic(declaredMethod.getModifiers())) {
                Method method = classLoader.loadClass("androidx.window.extensions.WindowExtensions").getMethod("getWindowLayoutComponent", null);
                Class<?> clsLoadClass = ((ClassLoader) this.b).loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                if (Modifier.isPublic(method.getModifiers())) {
                    if (method.getReturnType().equals(clsLoadClass)) {
                        try {
                            zBooleanValue = ((Boolean) new j3i(this, (byte) 4).invoke()).booleanValue();
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                            zBooleanValue = false;
                        }
                        if (zBooleanValue) {
                            ql8.a();
                        }
                    }
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError | NoSuchFieldException | NoSuchMethodException unused2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int y(int r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.b
            int[] r0 = (int[]) r0
            r1 = -1
            if (r0 == 0) goto La
            int r0 = r0.length
            if (r5 < r0) goto Lb
        La:
            return r1
        Lb:
            java.lang.Object r0 = r4.c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L51
            z2k r0 = r4.w(r5)
            if (r0 == 0) goto L1e
            java.lang.Object r2 = r4.c
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.remove(r0)
        L1e:
            java.lang.Object r0 = r4.c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            r2 = 0
        L27:
            if (r2 >= r0) goto L3a
            java.lang.Object r3 = r4.c
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.lang.Object r3 = r3.get(r2)
            z2k r3 = (z2k) r3
            int r3 = r3.a
            if (r3 >= r5) goto L3b
            int r2 = r2 + 1
            goto L27
        L3a:
            r2 = r1
        L3b:
            if (r2 == r1) goto L51
            java.lang.Object r0 = r4.c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r0 = r0.get(r2)
            z2k r0 = (z2k) r0
            java.lang.Object r3 = r4.c
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.remove(r2)
            int r0 = r0.a
            goto L52
        L51:
            r0 = r1
        L52:
            java.lang.Object r2 = r4.b
            int[] r2 = (int[]) r2
            if (r0 != r1) goto L62
            int r0 = r2.length
            java.util.Arrays.fill(r2, r5, r0, r1)
            java.lang.Object r4 = r4.b
            int[] r4 = (int[]) r4
            int r4 = r4.length
            return r4
        L62:
            int r0 = r0 + 1
            int r2 = r2.length
            int r0 = java.lang.Math.min(r0, r2)
            java.lang.Object r4 = r4.b
            int[] r4 = (int[]) r4
            java.util.Arrays.fill(r4, r5, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jvg.y(int):int");
    }

    public final void z(int i, int i2) {
        int[] iArr = (int[]) this.b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        t(i3);
        int[] iArr2 = (int[]) this.b;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.b, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.c;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                z2k z2kVar = (z2k) ((ArrayList) this.c).get(size);
                int i4 = z2kVar.a;
                if (i4 >= i) {
                    z2kVar.a = i4 + i2;
                }
            }
        }
    }
}
