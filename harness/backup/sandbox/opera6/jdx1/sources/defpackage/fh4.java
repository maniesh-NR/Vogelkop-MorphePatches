package defpackage;

import J.N;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.IBinder;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.text.Editable;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.c0;
import androidx.fragment.app.g;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.autofill.AutofillItem;
import com.opera.android.autofill.CreditCard;
import com.opera.android.favorites.FavoritesBridge;
import com.opera.android.favorites.e;
import com.opera.android.widget.GraphView;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final /* synthetic */ class fh4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fh4(WorkDatabase workDatabase, x4o x4oVar) {
        this.a = (byte) 1;
        this.c = workDatabase;
        this.b = x4oVar;
    }

    public /* synthetic */ fh4(gn9 gn9Var, View view, Rect rect) {
        this.a = (byte) 21;
        this.b = view;
        this.c = rect;
    }

    public /* synthetic */ fh4(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        CertificateFactory certificateFactory;
        X509Certificate x509Certificate;
        byte[] bArrDigest;
        byte[] bArrDigest2;
        kq4 kq4Var;
        Iterator it;
        odf odfVar;
        FileOutputStream fileOutputStreamOpenFileOutput;
        lq4 objectOutputStream;
        int i = 2;
        byte b = 0;
        int i2 = 0;
        int size = 0;
        switch (this.a) {
            case 0:
                cqp.J((x4o) this.b, ((UUID) this.c).toString());
                return;
            case 1:
                WorkDatabase workDatabase = (WorkDatabase) this.c;
                x4o x4oVar = (x4o) this.b;
                i5o i5oVarC = workDatabase.C();
                i5oVarC.getClass();
                TreeMap treeMap = e6i.i;
                e6i e6iVarE = aoh.e(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
                e6iVarE.w(1, "offline_ping_sender_work");
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) i5oVarC.a;
                workDatabase_Impl.b();
                Cursor cursorS = workDatabase_Impl.s(e6iVarE);
                try {
                    ArrayList arrayList = new ArrayList(cursorS.getCount());
                    while (cursorS.moveToNext()) {
                        arrayList.add(cursorS.getString(0));
                    }
                    cursorS.close();
                    e6iVarE.release();
                    int size2 = arrayList.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        cqp.J(x4oVar, (String) obj);
                    }
                    return;
                } catch (Throwable th) {
                    cursorS.close();
                    e6iVarE.release();
                    throw th;
                }
            case 2:
                CreditCard creditCard = (CreditCard) this.b;
                dl4 dl4Var = (dl4) this.c;
                String str = ((AutofillItem) creditCard).a;
                jvg jvgVar = dl4Var.h;
                ((gjm) jvgVar.b).c(new uq2(str), (atl) jvgVar.c, new cl4(new cv2(dl4Var, str, (byte) 14), (byte) 0));
                return;
            case 3:
                ode odeVar = (ode) this.b;
                byte[][] bArr = (byte[][]) this.c;
                try {
                    certificateFactory = CertificateFactory.getInstance("X.509");
                } catch (CertificateException unused) {
                    certificateFactory = null;
                }
                if (certificateFactory != null) {
                    ArrayList arrayList2 = new ArrayList(bArr.length);
                    int length = bArr.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 < length) {
                            byte[] bArr2 = bArr[i4];
                            try {
                                x509Certificate = (X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArr2));
                            } catch (ClassCastException | CertificateException unused2) {
                                x509Certificate = null;
                            }
                            if (x509Certificate == null) {
                                kq4Var = null;
                            } else {
                                try {
                                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                                    messageDigest.update(bArr2);
                                    bArrDigest = messageDigest.digest();
                                } catch (NoSuchAlgorithmException unused3) {
                                    bArrDigest = null;
                                }
                                try {
                                    MessageDigest messageDigest2 = MessageDigest.getInstance("SHA-1");
                                    messageDigest2.update(bArr2);
                                    bArrDigest2 = messageDigest2.digest();
                                } catch (NoSuchAlgorithmException unused4) {
                                    bArrDigest2 = null;
                                }
                                kq4Var = new kq4(x509Certificate, bArrDigest, bArrDigest2);
                            }
                            if (kq4Var != null) {
                                arrayList2.add(kq4Var);
                                i4++;
                            }
                        } else {
                            lq4Var = new lq4(arrayList2);
                        }
                    }
                }
                odeVar.n(lq4Var);
                return;
            case 4:
                qb7 qb7Var = (qb7) this.b;
                HashMap map = (HashMap) this.c;
                d12 d12Var = (d12) ((wth) qb7Var.b).b;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    hu4 hu4Var = (hu4) entry.getKey();
                    List list = (List) entry.getValue();
                    long j = hu4Var.a;
                    String str2 = hu4Var.e;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = str2;
                    wfb wfbVar = wfb.c;
                    boolean z = !list.isEmpty();
                    String str4 = hu4Var.c;
                    List list2 = list;
                    ArrayList arrayList5 = new ArrayList(k95.o(list2, 10));
                    for (Iterator it2 = list2.iterator(); it2.hasNext(); it2 = it2) {
                        arrayList5.add(Long.valueOf(((nu4) it2.next()).a));
                    }
                    long j2 = hu4Var.d;
                    arrayList3.add(new sfb(j, str3, (String) null, z, Boolean.FALSE, (qu4) null, str4, arrayList5, j2, j2, wfbVar, (ArrayList) null, (String) null));
                    Iterator it3 = list.iterator();
                    long j3 = -1;
                    while (it3.hasNext()) {
                        nu4 nu4Var = (nu4) it3.next();
                        lu4 lu4Var = nu4Var.c;
                        ArrayList arrayList6 = nu4Var.f;
                        String str5 = nu4Var.d;
                        int iOrdinal = lu4Var.ordinal();
                        if (iOrdinal == 0) {
                            it = it3;
                        } else if (iOrdinal == 1) {
                            it = it3;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            long j4 = j3;
                            long j5 = nu4Var.a;
                            long j6 = hu4Var.a;
                            long j7 = nu4Var.e;
                            String strS = qbe.s(str5, arrayList6, linkedHashMap);
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(qbd.a(linkedHashMap.size()));
                            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                                linkedHashMap2.put(entry2.getKey(), CollectionsKt.k0((Iterable) entry2.getValue()));
                            }
                            mfb mfbVar = mfb.UNDEFINED;
                            j3 = j4;
                            arrayList4.add(new kfb(j3, null, strS, linkedHashMap2, l08.a, j5, j6, j7, j7));
                        } else if (iOrdinal == i) {
                            long j8 = nu4Var.a;
                            long j9 = hu4Var.a;
                            long j10 = nu4Var.e;
                            arrayList4.add(new qgb("user-chat-item", qbe.s(str5, arrayList6, new LinkedHashMap()), j8, j9, j10, j10));
                            it3 = it3;
                            j3 = j8;
                            i = 2;
                        } else {
                            if (iOrdinal != 3) {
                                h9o.p();
                                return;
                            }
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            long j11 = nu4Var.a;
                            it = it3;
                            long j12 = hu4Var.a;
                            long j13 = nu4Var.e;
                            String str6 = nu4Var.h;
                            j3 = j3;
                            String strS2 = qbe.s(str5, arrayList6, linkedHashMap3);
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap(qbd.a(linkedHashMap3.size()));
                            for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
                                linkedHashMap4.put(entry3.getKey(), CollectionsKt.k0((Iterable) entry3.getValue()));
                            }
                            mfb mfbVar2 = mfb.UNDEFINED;
                            arrayList4.add(new kfb(j3, str6, strS2, linkedHashMap4, l08.a, j11, j12, j13, j13));
                        }
                        it3 = it;
                        i = 2;
                    }
                }
                vr9 vr9Var = new vr9((Runnable) new lb4(qb7Var, (byte) 7), 2);
                if (arrayList3.isEmpty()) {
                    vr9Var.run();
                } else {
                    ArrayList arrayList7 = new ArrayList(k95.o(arrayList3, 10));
                    int size3 = arrayList3.size();
                    int i5 = 0;
                    while (i5 < size3) {
                        Object obj2 = arrayList3.get(i5);
                        i5++;
                        sfb sfbVar = (sfb) obj2;
                        arrayList7.add(new Pair(p3p.l(sfbVar.a, "chat/"), sfbVar.a().a.toString()));
                    }
                    d12Var.a(arrayList7, vr9Var);
                }
                if (arrayList4.isEmpty()) {
                    vr9Var.run();
                    return;
                }
                ArrayList arrayList8 = new ArrayList(k95.o(arrayList4, 10));
                int size4 = arrayList4.size();
                int i6 = 0;
                while (i6 < size4) {
                    Object obj3 = arrayList4.get(i6);
                    i6++;
                    tfb tfbVar = (tfb) obj3;
                    long jB = tfbVar.b();
                    long jC = tfbVar.c();
                    StringBuilder sbQ = p3p.q(jB, "chat/", "/item/");
                    sbQ.append(jC);
                    arrayList8.add(new Pair(sbQ.toString(), tfbVar.a().a.toString()));
                }
                d12Var.a(arrayList8, vr9Var);
                return;
            case 5:
                ((iw4) ((zy9) this.b).a).e((IBinder) this.c);
                return;
            case 6:
                OperaApplication operaApplication = (OperaApplication) this.b;
                Runnable runnable = (Runnable) this.c;
                mdh mdhVarG = operaApplication.G();
                mdhVarG.b.d();
                mdhVarG.c();
                mdh.b(mdhVarG, true, (iqi) null, new ldh(1, mdhVarG, mdh.class, "setSpeedDials", "setSpeedDials(Ljava/util/List;)V", 0, (byte) 0), 2);
                e eVarO = operaApplication.o();
                cul culVar = eVarO.c;
                culVar.getClass();
                aul aulVar = new aul(culVar, (byte) 1);
                if (culVar.d) {
                    aulVar.run((Object) null);
                } else {
                    culVar.f.add(0, aulVar);
                }
                ArrayList arrayList9 = new ArrayList();
                e.i(arrayList9, eVarO.f);
                int size5 = arrayList9.size();
                while (b < size5) {
                    long jLongValue = ((Long) arrayList9.get(b)).longValue();
                    i7f i7fVar = FavoritesBridge.a;
                    N.Mw8yLl_M(jLongValue);
                    b++;
                }
                runnable.run();
                return;
            case 7:
                BrowserActivity browserActivity = (BrowserActivity) this.b;
                gh2 gh2Var = (gh2) this.c;
                g7f g7fVar = new g7f(((f35) browserActivity.m0.getValue()).a);
                while (g7fVar.hasNext()) {
                    ((w25) g7fVar.next()).P();
                }
                gh2Var.run();
                return;
            case 8:
                ((ivh) this.b).E((lvh) this.c);
                return;
            case 9:
                xd5 xd5Var = (xd5) this.b;
                xd5Var.getLifecycle().a(new nd5((kcf) this.c, xd5Var, b));
                return;
            case 10:
                srf srfVar = (srf) this.b;
                l7h l7hVar = (l7h) this.c;
                if (srfVar.b != srf.d) {
                    qp2.n("provide() can be called only once.");
                    return;
                }
                synchronized (srfVar) {
                    odfVar = srfVar.a;
                    srfVar.a = null;
                    srfVar.b = l7hVar;
                }
                odfVar.getClass();
                return;
            case 11:
                a7c a7cVar = (a7c) this.b;
                l7h l7hVar2 = (l7h) this.c;
                synchronized (a7cVar) {
                    if (a7cVar.b == null) {
                        a7cVar.a.add(l7hVar2);
                    } else {
                        a7cVar.b.add(l7hVar2.get());
                    }
                }
                return;
            case 12:
                ao5 ao5Var = (ao5) this.b;
                v6f v6fVar = (v6f) this.c;
                try {
                    v6fVar.a(ao5Var.a.b);
                    return;
                } catch (InterruptedException | ExecutionException e) {
                    v6fVar.onError(e);
                    return;
                }
            case 13:
                List<n53> list3 = (List) this.b;
                k73 k73Var = (k73) this.c;
                for (n53 n53Var : list3) {
                    Object obj4 = k73Var.f;
                    o53 o53Var = n53Var.a;
                    Object ep5Var = o53Var.e(obj4) ? new ep5(o53Var.d()) : dp5.a;
                    z1h z1hVar = n53Var.b;
                    z1hVar.getClass();
                    z1hVar.b(ep5Var);
                }
                return;
            case 14:
                z66 z66Var = (z66) this.b;
                Runnable runnable2 = (Runnable) this.c;
                Process.setThreadPriority(z66Var.c);
                StrictMode.ThreadPolicy threadPolicy = z66Var.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
            case 15:
                tc6 tc6Var = (tc6) this.b;
                GraphView graphView = (GraphView) this.c;
                ArrayList arrayListB = tc6Var.x.c.b();
                int measuredWidth = graphView.getMeasuredWidth() / fan.a(24.0f, graphView.getResources());
                int iMax = Math.max(0, arrayListB.size() - measuredWidth);
                while (true) {
                    if (iMax < arrayListB.size()) {
                        if (((ui5) arrayListB.get(iMax)).g() != 0) {
                            size = arrayListB.size() - iMax;
                        } else {
                            iMax++;
                        }
                    }
                }
                new t59(new s64(tc6Var, arrayListB), Math.min(Math.max(3, size), measuredWidth)).d(graphView);
                return;
            case 16:
                ((zvi) this.b).c.I0((Editable) this.c);
                return;
            case 17:
                ((yl6) this.b).h((x5f) this.c);
                return;
            case 18:
                vn6 vn6Var = (vn6) this.b;
                oj9 oj9Var = (oj9) this.c;
                wn6 wn6Var = vn6Var.d;
                if (wn6Var.p == 0 || vn6Var.c) {
                    return;
                }
                Looper looper = wn6Var.t;
                looper.getClass();
                vn6Var.b = wn6Var.f(looper, vn6Var.a, oj9Var, false);
                wn6Var.n.add(vn6Var);
                return;
            case 19:
                tq6 tq6Var = (tq6) this.b;
                Uri uri = (Uri) this.c;
                tq6Var.i = false;
                tq6Var.e(uri);
                return;
            case 20:
                k5o k5oVar = (k5o) this.b;
                HashMap map2 = (HashMap) this.c;
                Context context = (Context) k5oVar.b;
                File filesDir = context.getFilesDir();
                lq4 file = new File(filesDir, "permissions.bin.tmp");
                File file2 = new File(filesDir, "permissions.bin");
                try {
                    fileOutputStreamOpenFileOutput = context.openFileOutput("permissions.bin.tmp", 0);
                    objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(fileOutputStreamOpenFileOutput));
                } catch (IOException unused5) {
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    objectOutputStream.writeInt(1);
                    objectOutputStream.writeInt(map2.size());
                    for (Map.Entry entry4 : map2.entrySet()) {
                        objectOutputStream.writeObject(entry4.getKey());
                        ((jag) entry4.getValue()).c(objectOutputStream);
                    }
                    objectOutputStream.flush();
                    fileOutputStreamOpenFileOutput.getFD().sync();
                    objectOutputStream.close();
                    lq4Var = file.renameTo(file2) ? null : file;
                    if (lq4Var != null) {
                        lq4Var.delete();
                        return;
                    }
                    return;
                } catch (IOException unused6) {
                    lq4Var = objectOutputStream;
                    xvg.l(lq4Var);
                    file.delete();
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    lq4Var = objectOutputStream;
                    xvg.l(lq4Var);
                    file.delete();
                    throw th;
                }
            case 21:
                gn9.j((Rect) this.c, (View) this.b);
                return;
            case 22:
                g gVar = (g) this.b;
                ViewGroup viewGroup = (ViewGroup) this.c;
                ArrayList arrayList10 = gVar.c;
                int size6 = arrayList10.size();
                while (i2 < size6) {
                    Object obj5 = arrayList10.get(i2);
                    i2++;
                    c0 c0Var = ((ew6) obj5).a;
                    View view = c0Var.c.getView();
                    if (view != null) {
                        fki.a(c0Var.a, view, viewGroup);
                    }
                }
                return;
            case 23:
                ow6 ow6Var = (ow6) this.b;
                vtk vtkVar = (vtk) this.c;
                Surface surfaceK = vtkVar.k(ow6Var.c, new jg4(ow6Var, vtkVar, (byte) 2));
                ow6Var.a.g(surfaceK);
                ow6Var.h.put(vtkVar, surfaceK);
                return;
            case 24:
                ((ow6) this.b).k.add((cn2) this.c);
                return;
            case 25:
                final ow6 ow6Var2 = (ow6) this.b;
                final buk bukVar = (buk) this.c;
                ow6Var2.i++;
                lgf lgfVar = ow6Var2.a;
                rs9.d((AtomicBoolean) lgfVar.b, true);
                rs9.c((Thread) lgfVar.d);
                final SurfaceTexture surfaceTexture = new SurfaceTexture(lgfVar.a);
                Size size7 = bukVar.b;
                surfaceTexture.setDefaultBufferSize(size7.getWidth(), size7.getHeight());
                final Surface surface = new Surface(surfaceTexture);
                g7a g7aVar = ow6Var2.c;
                bukVar.b(g7aVar, new ge5((Object) ow6Var2, (Object) bukVar, (byte) 13));
                bukVar.a(surface, g7aVar, new qp5() { // from class: nw6
                    @Override // defpackage.qp5
                    public final void accept(Object obj6) {
                        ow6 ow6Var3 = ow6Var2;
                        buk bukVar2 = bukVar;
                        SurfaceTexture surfaceTexture2 = surfaceTexture;
                        Surface surface2 = surface;
                        synchronized (bukVar2.a) {
                            bukVar2.o = null;
                            bukVar2.p = null;
                        }
                        surfaceTexture2.setOnFrameAvailableListener(null);
                        surfaceTexture2.release();
                        surface2.release();
                        ow6Var3.i--;
                        ow6Var3.d();
                    }
                });
                surfaceTexture.setOnFrameAvailableListener(ow6Var2, ow6Var2.d);
                return;
            case 26:
                ((ay6) ((c37) this.b).b).h.a((r4n) this.c);
                return;
            case 27:
                Callable callable = (Callable) this.b;
                q17 q17Var = (q17) ((eq6) this.c).a;
                try {
                    q17Var.j(callable.call());
                    return;
                } catch (Exception e2) {
                    q17Var.k(e2);
                    return;
                }
            case 28:
                kd7 kd7Var = (kd7) this.b;
                hd7 hd7Var = (hd7) this.c;
                HashMap map3 = kd7Var.l;
                map3.put(hd7Var.a, hd7Var);
                kd7Var.g(nb6.J(map3.values()));
                return;
            default:
                wd7 wd7Var = (wd7) this.b;
                pqh pqhVar = (pqh) this.c;
                if (wd7Var.h) {
                    return;
                }
                hd hdVar = (hd) wd7Var.c.get();
                String str7 = (String) pqhVar.a;
                if (hdVar.b) {
                    hdVar.v(new u5f(str7, (byte) 3));
                    return;
                }
                return;
        }
    }
}
