package defpackage;

import J.N;
import ads_mobile_sdk.cm1;
import ads_mobile_sdk.dj0;
import ads_mobile_sdk.f63;
import ads_mobile_sdk.fl0;
import ads_mobile_sdk.g43;
import ads_mobile_sdk.ia3;
import ads_mobile_sdk.k43;
import ads_mobile_sdk.mm0;
import ads_mobile_sdk.n83;
import ads_mobile_sdk.rp1;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.work.impl.WorkDatabase_Impl;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class d9 implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d9(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException, NumberFormatException {
        int[] iArr;
        ServiceInfo serviceInfo;
        String str;
        String str2;
        int i;
        String strA;
        int i2 = -1;
        int i3 = 0;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        boolean z = false;
        String str3 = null;
        switch (this.a) {
            case 0:
                AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) this.b;
                WebContentsAccessibilityImpl webContentsAccessibilityImpl = (WebContentsAccessibilityImpl) this.c;
                int i4 = Integer.parseInt(accessibilityNodeInfoCompat.o());
                if (!webContentsAccessibilityImpl.R() || (iArr = (int[]) N.MsZWwV2L(webContentsAccessibilityImpl.e, i4)) == null) {
                    return null;
                }
                return new Object[]{webContentsAccessibilityImpl.o(iArr[0]), Integer.valueOf(iArr[1]), Integer.valueOf(iArr[2]), webContentsAccessibilityImpl.o(iArr[3]), Integer.valueOf(iArr[4]), Integer.valueOf(iArr[5])};
            case 1:
                hd6 hd6Var = (hd6) this.b;
                byte[] bArr = (byte[]) this.c;
                boolean z2 = hd6Var.d;
                Bitmap bitmapC = m41.c(bArr.length, hd6Var.c, bArr);
                return z2 ? m41.y(bitmapC) : bitmapC;
            case 2:
                hd6 hd6Var2 = (hd6) this.b;
                Uri uri = (Uri) this.c;
                ed6 ed6VarCreateDataSource = hd6Var2.b.createDataSource();
                int i5 = hd6Var2.c;
                boolean z3 = hd6Var2.d;
                try {
                    hn6 hn6Var = (hn6) ed6VarCreateDataSource;
                    hn6Var.b(new nd6(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 0));
                    byte[] bArrCopyOf = new byte[1024];
                    int i6 = 0;
                    while (i3 != -1) {
                        if (i6 == bArrCopyOf.length) {
                            bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length << 1);
                        }
                        i3 = hn6Var.read(bArrCopyOf, i6, bArrCopyOf.length - i6);
                        if (i3 != -1) {
                            i6 += i3;
                        }
                    }
                    byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i6);
                    Bitmap bitmapC2 = m41.c(bArrCopyOf2.length, i5, bArrCopyOf2);
                    if (z3) {
                        bitmapC2 = m41.y(bitmapC2);
                    }
                    hn6Var.close();
                    return bitmapC2;
                } catch (Throwable th) {
                    ((hn6) ed6VarCreateDataSource).close();
                    throw th;
                }
            case 3:
                Context context = (Context) this.b;
                Intent intent = (Intent) this.c;
                i3j i3jVarW = i3j.w();
                ((ArrayDeque) i3jVarW.d).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (i3jVarW) {
                    String str4 = (String) i3jVarW.a;
                    if (str4 != null) {
                        str3 = str4;
                    } else {
                        ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 0);
                        if (resolveInfoResolveService != null && (serviceInfo = resolveInfoResolveService.serviceInfo) != null && context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                            if (str.startsWith(".")) {
                                str2 = context.getPackageName() + serviceInfo.name;
                                i3jVarW.a = str2;
                            } else {
                                str2 = serviceInfo.name;
                                i3jVarW.a = str2;
                            }
                            str3 = str2;
                        }
                    }
                }
                if (str3 != null) {
                    intent2.setClassName(context.getPackageName(), str3);
                }
                try {
                    if ((i3jVarW.C(context) ? sgb.a0(context, intent2) : context.startService(intent2)) == null) {
                        i2 = 404;
                    }
                } catch (IllegalStateException e) {
                    e.toString();
                    i = 402;
                    i2 = i;
                    return Integer.valueOf(i2);
                } catch (SecurityException unused) {
                    i = 401;
                    i2 = i;
                    return Integer.valueOf(i2);
                }
                return Integer.valueOf(i2);
            case 4:
                n2d n2dVar = (n2d) this.b;
                String str5 = (String) this.c;
                boolean z4 = n2dVar.i;
                Context context2 = n2dVar.getContext();
                if (!z4) {
                    return u2d.b(context2, str5, null);
                }
                HashMap map = u2d.a;
                return u2d.b(context2, str5, "asset_" + str5);
            case 5:
                wub wubVar = (wub) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                iri iriVar = ((q6e) wubVar.a).b;
                iri.o(3, iriVar.h(true));
                iri.o(4, iriVar.h(true));
                iri.o(2, iriVar.h(true));
                iri.o(1, iriVar.h(true));
                iriVar.m(arrayList);
                return null;
            case 6:
                a0j a0jVar = (a0j) this.b;
                EditorInfo editorInfo = (EditorInfo) this.c;
                gnl gnlVar = (gnl) a0jVar.h;
                gnlVar.f = false;
                InputConnection inputConnectionOnCreateInputConnection = ((ViewGroup) a0jVar.c).onCreateInputConnection(editorInfo);
                gnlVar.f = true;
                return inputConnectionOnCreateInputConnection;
            case 7:
                v5o v5oVar = (v5o) this.b;
                z5o z5oVar = (z5o) this.c;
                String str6 = z5oVar.c;
                i5o i5oVar = z5oVar.h;
                if (v5oVar instanceof t5o) {
                    zic wicVar = ((t5o) v5oVar).a;
                    int iF = i5oVar.f(str6);
                    d5o d5oVarB = z5oVar.g.B();
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) d5oVarB.a;
                    workDatabase_Impl.b();
                    uzk uzkVar = (uzk) d5oVarB.b;
                    ap9 ap9VarF = uzkVar.f();
                    ap9VarF.w(1, str6);
                    try {
                        workDatabase_Impl.c();
                        try {
                            ap9VarF.h();
                            workDatabase_Impl.v();
                            if (iF != 0) {
                                if (iF == 2) {
                                    h5o h5oVar = z5oVar.a;
                                    if (wicVar instanceof yic) {
                                        int i7 = a6o.a;
                                        qs7.x().getClass();
                                        if (h5oVar.c()) {
                                            z5oVar.b();
                                        } else {
                                            i5oVar.n(3, str6);
                                            i5oVar.m(str6, ((yic) wicVar).a);
                                            long jCurrentTimeMillis = System.currentTimeMillis();
                                            c37 c37Var = z5oVar.i;
                                            ArrayList arrayListP = c37Var.p(str6);
                                            int size = arrayListP.size();
                                            int i8 = 0;
                                            while (i8 < size) {
                                                Object obj = arrayListP.get(i8);
                                                i8++;
                                                String str7 = (String) obj;
                                                if (i5oVar.f(str7) == 5) {
                                                    TreeMap treeMap = e6i.i;
                                                    e6i e6iVarE = aoh.e(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                                                    e6iVarE.w(1, str7);
                                                    WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) c37Var.a;
                                                    workDatabase_Impl2.b();
                                                    Cursor cursorS = workDatabase_Impl2.s(e6iVarE);
                                                    try {
                                                        if ((cursorS.moveToFirst() && cursorS.getInt(0) != 0) != false) {
                                                            int i9 = a6o.a;
                                                            qs7.x().getClass();
                                                            i5oVar.n(1, str7);
                                                            i5oVar.l(jCurrentTimeMillis, str7);
                                                        }
                                                    } finally {
                                                        cursorS.close();
                                                        e6iVarE.release();
                                                    }
                                                }
                                            }
                                        }
                                    } else if (wicVar instanceof xic) {
                                        int i10 = a6o.a;
                                        qs7.x().getClass();
                                        z5oVar.a(-256);
                                        z = true;
                                    } else {
                                        int i11 = a6o.a;
                                        qs7.x().getClass();
                                        if (h5oVar.c()) {
                                            z5oVar.b();
                                        } else {
                                            if (wicVar == null) {
                                                wicVar = new wic();
                                            }
                                            z5oVar.d(wicVar);
                                        }
                                    }
                                } else if (!z1m.a(iF)) {
                                    z5oVar.a(-512);
                                    z = true;
                                }
                            }
                        } finally {
                            workDatabase_Impl.p();
                        }
                    } finally {
                        uzkVar.m(ap9VarF);
                    }
                } else if (v5oVar instanceof s5o) {
                    z5oVar.d(((s5o) v5oVar).a);
                } else {
                    if (!(v5oVar instanceof u5o)) {
                        h9o.p();
                        return null;
                    }
                    int i12 = ((u5o) v5oVar).a;
                    int iF2 = i5oVar.f(str6);
                    if (iF2 == 0 || z1m.a(iF2)) {
                        int i13 = a6o.a;
                        qs7.x().getClass();
                    } else {
                        int i14 = a6o.a;
                        qs7 qs7VarX = qs7.x();
                        z1m.x(iF2);
                        qs7VarX.getClass();
                        i5oVar.n(1, str6);
                        i5oVar.o(i12, str6);
                        i5oVar.h(-1L, str6);
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 8:
                g43 g43Var = (g43) this.b;
                Context context3 = (Context) this.c;
                cm1 cm1VarA = g43Var.a.a();
                if (cm1VarA == null) {
                    g43Var.d.b(fl0.EVENT_ID_DG_ENGINE_NULL_HANDLE);
                    return "";
                }
                synchronized (cm1VarA) {
                    dj0 dj0Var = cm1VarA.b;
                    ia3 ia3Var = dj0Var.b;
                    ia3Var.getClass();
                    HashMap map2 = new HashMap();
                    Iterator it = ia3Var.a.iterator();
                    while (it.hasNext()) {
                        ((opo) it.next()).a(map2);
                    }
                    dj0Var.a(map2);
                    map2.put("f", "q");
                    map2.put("ctx", context3);
                    map2.put("aid", null);
                    byte[] bArrA = cm1VarA.a(map2);
                    if (cm1VarA.d) {
                        map2.clear();
                    }
                    strA = cm1.a(bArrA);
                }
                if (strA != null) {
                    return strA;
                }
                g43Var.d.b(fl0.EVENT_ID_DG_ENGINE_NULL_QUERY_SIGNALS);
                return "";
            case 9:
                k43 k43Var = (k43) this.b;
                Context context4 = (Context) this.c;
                HashMap map3 = new HashMap();
                k43Var.g.a(fl0.EVENT_ID_ORCAS_ENGINE_COMPOSE_STATE, (Runnable) new h4m(k43Var, map3, context4, (byte) 15));
                String strA2 = k43Var.a(map3);
                map3.clear();
                return strA2;
            case 10:
                mm0 mm0Var = (mm0) this.b;
                Object obj2 = this.c;
                synchronized (mm0Var) {
                    kfo.A(mm0Var.a);
                    File file = new File(mm0Var.a.getParent(), mm0Var.a.getName() + ".temp");
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            mm0Var.c.a(obj2, fileOutputStream);
                            fileOutputStream.close();
                            if (!file.renameTo(mm0Var.a)) {
                                throw new IOException("Failed to rename file.");
                            }
                        } finally {
                        }
                    } catch (IOException e2) {
                        file.delete();
                        throw e2;
                    }
                }
                return null;
            default:
                rp1 rp1Var = (rp1) this.b;
                f63 f63Var = (f63) this.c;
                DexClassLoader dexClassLoader = rp1Var.l;
                n83 n83Var = rp1Var.d;
                byte[] bArr2 = rp1Var.k;
                String str8 = f63Var.a;
                String str9 = f63Var.b;
                Class<?>[] clsArr = f63Var.c;
                try {
                    n83Var.getClass();
                    byte[] bArrA2 = n83.a(str8, bArr2);
                    Charset charset = n83.a;
                    return dexClassLoader.loadClass(new String(bArrA2, charset)).getMethod(new String(n83.a(str9, bArr2), charset), clsArr);
                } catch (hbp | ClassNotFoundException | NoSuchMethodException | NullPointerException e3) {
                    h9o.o(e3);
                    return null;
                }
        }
    }
}
