package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.opera.ad.interstitial.AdActivity;
import com.opera.android.bookmarks.b;
import com.opera.android.bookmarks.c;
import com.opera.android.bookmarks.h;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.zip.ZipFile;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class wjj implements re, r6l, jqo, htp {
    public static wjj e;
    public final Object a;
    public Object b;
    public Object c;
    public Object d;

    public wjj() {
        this.a = new PriorityQueue(new omj((byte) 12));
        this.b = new Handler(Looper.getMainLooper());
        if (Build.VERSION.SDK_INT < 30) {
            this.c = new qsh(new grl(this, (byte) 0));
        } else {
            this.c = new mhj(new grl(this, (byte) 0));
        }
    }

    public wjj(Context context, ActionMode.Callback callback) {
        this.b = context;
        this.a = callback;
        this.c = new ArrayList();
        this.d = new hkj(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public wjj(Context context, i53 i53Var, LinkedHashSet linkedHashSet) {
        ml3 ml3Var;
        this.a = context;
        this.b = i53Var;
        String string = context.getString(2132017604, DateFormat.getDateInstance(3, Locale.getDefault()).format(new Date(System.currentTimeMillis())));
        List listI = ((h) i53Var).o().i();
        if (d(string, listI) != null) {
            int i = 1;
            while (true) {
                if (i >= 1001) {
                    ml3Var = null;
                    break;
                }
                String str = string + " (" + i + ")";
                if (d(str, listI) == null) {
                    i53 i53Var2 = (i53) this.b;
                    kkj kkjVar = new kkj(-1L, str, null, false);
                    c cVarO = ((h) i53Var2).o();
                    i53Var2.getClass();
                    ml3Var = (ml3) h.i(kkjVar, cVarO);
                    break;
                }
                i++;
            }
        } else {
            kkj kkjVar2 = new kkj(-1L, string, null, false);
            c cVarO2 = ((h) i53Var).o();
            i53Var.getClass();
            ml3Var = (ml3) h.i(kkjVar2, cVarO2);
        }
        this.c = ml3Var;
        ehc ehcVarB = a.b();
        ArrayList arrayList = new ArrayList(linkedHashSet);
        exg.A(arrayList, x6l.a);
        ml3 ml3Var2 = (ml3) this.c;
        if (ml3Var2 != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                d7l d7lVar = (d7l) ((b2l) obj);
                if (!d7lVar.n0()) {
                    i53 i53Var3 = (i53) this.b;
                    lkj lkjVarK = lkj.k(-1L, d7lVar.l0(), d7lVar.h0());
                    i53Var3.getClass();
                    pl3 pl3Var = (pl3) h.i(lkjVarK, ml3Var2);
                    if (pl3Var != null) {
                        ehcVarB.add(pl3Var);
                    }
                }
            }
        }
        this.d = a.a(ehcVarB);
        ml3 ml3Var3 = (ml3) this.c;
        if (ml3Var3 == 0 || !ml3Var3.isEmpty()) {
            return;
        }
        h hVar = (h) ((i53) this.b);
        hVar.getClass();
        hVar.q((b) ml3Var3);
        this.c = null;
    }

    public wjj(Context context, qq8 qq8Var) {
        u7k u7kVar = new u7k();
        this.a = qq8Var;
        this.b = context;
        this.c = u7kVar;
    }

    public wjj(NestedScrollView nestedScrollView) {
        this.a = new n9n(this);
        this.b = new ho3(this, (byte) 10);
        this.c = nestedScrollView;
        can canVar = new can();
        this.d = canVar;
        q9n.g(nestedScrollView, new z61(this, (byte) 27));
        canVar.b(true);
    }

    public wjj(grg grgVar, j1k j1kVar) {
        this.a = grgVar;
        this.b = j1kVar;
        this.c = z4c.b(a43.z);
        this.d = z4c.b(new qm(this, (byte) 11));
    }

    public /* synthetic */ wjj(Object obj, Object obj2, Object obj3, Object obj4) {
        this.d = obj;
        this.a = obj2;
        this.b = obj3;
        this.c = obj4;
    }

    public wjj(ArrayList arrayList) {
        this.a = arrayList;
        this.b = new LinkedHashMap();
        this.c = new ArrayList();
        this.d = new ArrayList();
    }

    public wjj(k8n k8nVar) {
        if (k8nVar == null) {
            t3p.q("params == null");
            throw null;
        }
        this.a = k8nVar;
        int i = k8nVar.a;
        q0 q0Var = (q0) k8nVar.d;
        bp bpVar = new bp();
        if (q0Var == null) {
            t3p.q("digest == null");
            throw null;
        }
        bpVar.b = y87.a(q0Var);
        bpVar.a = i;
        this.b = bpVar;
        this.c = new byte[i];
        this.d = new byte[i];
    }

    public wjj(nx5 nx5Var, wg5 wg5Var, ah5 ah5Var, r3 r3Var) {
        this.a = nx5Var;
        this.b = r3Var;
        this.c = xf8.h(Integer.MAX_VALUE, (h04) null, (Function1) null, 6);
        this.d = new eme((byte) 12);
        unb unbVar = nx5Var.l().get(ulp.h);
        if (unbVar != null) {
            unbVar.s(new tmi(wg5Var, this, ah5Var, (byte) 2));
        }
    }

    public wjj(oji ojiVar) {
        this.a = ojiVar;
    }

    public wjj(u9o u9oVar) {
        this.b = null;
        this.c = null;
        this.d = null;
        this.a = u9oVar;
    }

    public static ml3 d(String str, List list) {
        Object next;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            al3 al3Var = (al3) next;
            if (Intrinsics.a(al3Var.getTitle(), str) && al3Var.g()) {
                break;
            }
        }
        if (next instanceof ml3) {
            return (ml3) next;
        }
        return null;
    }

    public final void a() {
        ((g94) this.b).l((ahb) ((uuj) this.d).b);
        ((AdActivity) this.c).finish();
    }

    public final void a(int i) {
        ((TextView) this.a).setText(String.format(Locale.US, "Skip %1$ds", Integer.valueOf(i)));
    }

    @Override // defpackage.htp
    public final void b(ZipFile zipFile, HashSet hashSet) {
        ((utp) this.d).c((eqp) this.a, hashSet, new tvk(this));
    }

    public final byte[] c(byte[] bArr, int i, e6f e6fVar) {
        bp bpVar = (bp) this.b;
        int i2 = ((k8n) this.a).a;
        if (bArr.length != i2) {
            qp2.o(p3p.i(i2, "startHash needs to be ", "bytes"));
            return null;
        }
        e6fVar.a();
        if (i > 15) {
            qp2.o("max chain length must not be greater than w");
            return null;
        }
        if (i == 0) {
            return bArr;
        }
        byte[] bArrC = c(bArr, i - 1, e6fVar);
        gzb gzbVar = new gzb((byte) 1);
        ((q9o) gzbVar).a = ((q9o) e6fVar).a;
        ((q9o) gzbVar).b = ((q9o) e6fVar).b;
        gzbVar.e = e6fVar.e;
        gzbVar.f = e6fVar.f;
        gzbVar.g = i - 1;
        ((q9o) gzbVar).d = (byte) 0;
        e6f e6fVar2 = new e6f(gzbVar);
        byte[] bArrA = bpVar.a((byte[]) this.d, e6fVar2.a());
        gzb gzbVar2 = new gzb((byte) 1);
        ((q9o) gzbVar2).a = ((q9o) e6fVar2).a;
        ((q9o) gzbVar2).b = ((q9o) e6fVar2).b;
        gzbVar2.e = e6fVar2.e;
        gzbVar2.f = e6fVar2.f;
        gzbVar2.g = e6fVar2.g;
        ((q9o) gzbVar2).d = (byte) 1;
        byte[] bArrA2 = bpVar.a((byte[]) this.d, new e6f(gzbVar2).a());
        byte[] bArr2 = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr2[i3] = (byte) (bArrC[i3] ^ bArrA2[i3]);
        }
        int length = bArrA.length;
        int i4 = bpVar.a;
        if (length != i4) {
            qp2.o("wrong key length");
            return null;
        }
        if (i2 == i4) {
            return bpVar.f(0, bArrA, bArr2);
        }
        qp2.o("wrong in length");
        return null;
    }

    public final isk e(se seVar) {
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            isk iskVar = (isk) arrayList.get(i);
            if (iskVar != null && iskVar.b == seVar) {
                return iskVar;
            }
        }
        isk iskVar2 = new isk((Context) this.b, seVar);
        arrayList.add(iskVar2);
        return iskVar2;
    }

    public final bxk f(e6f e6fVar) {
        k8n k8nVar = (k8n) this.a;
        byte[][] bArr = new byte[k8nVar.c][];
        int i = 0;
        while (true) {
            int i2 = k8nVar.c;
            if (i >= i2) {
                return new bxk(k8nVar, bArr);
            }
            gzb gzbVar = new gzb((byte) 1);
            ((q9o) gzbVar).a = ((q9o) e6fVar).a;
            ((q9o) gzbVar).b = ((q9o) e6fVar).b;
            gzbVar.e = e6fVar.e;
            gzbVar.f = i;
            gzbVar.g = e6fVar.g;
            ((q9o) gzbVar).d = ((q9o) e6fVar).d;
            e6fVar = new e6f(gzbVar);
            if (i < 0 || i >= i2) {
                break;
            }
            bArr[i] = c(((bp) this.b).a((byte[]) this.c, dbh.I(32, i)), 15, e6fVar);
            i++;
        }
        qp2.o("index out of bounds");
        return null;
    }

    public final if1 g(long j, if1 if1Var, if1 if1Var2) {
        if1 if1Var3;
        if1 if1VarC = (if1) this.c;
        if (if1VarC == null) {
            if1VarC = if1Var.c();
            this.c = if1VarC;
        }
        int iB = if1VarC.b();
        int i = 0;
        while (true) {
            if1Var3 = (if1) this.c;
            if (i >= iB) {
                break;
            }
            if (if1Var3 == null) {
                if1Var3 = null;
            }
            oji ojiVar = (oji) this.a;
            if1Var.getClass();
            long j2 = j / 1000000;
            i89 i89VarA = ((f82) ojiVar.a).a(if1Var2.a(i));
            long j3 = i89VarA.c;
            if1Var3.e((((Math.signum(i89VarA.a) * g61.a(j3 > 0 ? j2 / j3 : 1.0f).b) * i89VarA.b) / j3) * 1000.0f, i);
            i++;
        }
        if (if1Var3 == null) {
            return null;
        }
        return if1Var3;
    }

    @Override // defpackage.r6l
    public final pxh h() {
        ehc ehcVar = (ehc) this.d;
        return new txh(new Object[]{Integer.valueOf(ehcVar.d())}, 2131886145, ehcVar.d());
    }

    public final byte[] i(byte[] bArr, e6f e6fVar) {
        gzb gzbVar = new gzb((byte) 1);
        ((q9o) gzbVar).a = ((q9o) e6fVar).a;
        ((q9o) gzbVar).b = ((q9o) e6fVar).b;
        gzbVar.e = e6fVar.e;
        return ((bp) this.b).a(bArr, new e6f(gzbVar).a());
    }

    public final void j(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = ((k8n) this.a).a;
        if (length != i) {
            qp2.o("size of secretKeySeed needs to be equal to size of digest");
            return;
        }
        if (bArr2 == null) {
            t3p.q("publicSeed == null");
        } else if (bArr2.length != i) {
            qp2.o("size of publicSeed needs to be equal to size of digest");
        } else {
            this.c = bArr;
            this.d = bArr2;
        }
    }

    public final boolean k(se seVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.a).onActionItemClicked(e(seVar), new vtd((Context) this.b, (msk) menuItem));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.r6l
    public final void l() {
        i53 i53Var = (i53) this.b;
        i53Var.e((ehc) this.d);
        ml3 ml3Var = (ml3) this.c;
        if (ml3Var == 0 || !ml3Var.isEmpty()) {
            return;
        }
        h hVar = (h) i53Var;
        hVar.getClass();
        hVar.q((b) ml3Var);
        this.c = null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: e22 */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        if (((android.content.res.XmlResourceParser) r0.a).getName().equals("manifest") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
    
        r4 = ((android.content.res.XmlResourceParser) r0.a).getAttributeValue("http://schemas.android.com/apk/res/android", "versionCode");
        r5 = ((android.content.res.XmlResourceParser) r0.a).getAttributeValue("http://schemas.android.com/apk/res/android", "versionCodeMajor");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
    
        if (r4 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0096, code lost:
    
        r4 = java.lang.Integer.parseInt(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
    
        if (r5 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009c, code lost:
    
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a2, code lost:
    
        r4 = (r4 & 4294967295L) | (java.lang.Integer.parseInt(r5) << 32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b4, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c4, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(defpackage.sko.j("Couldn't parse versionCodeMajor to int: ", r11.getMessage()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c5, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d5, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(defpackage.sko.j("Couldn't parse versionCode to int: ", r11.getMessage()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00dd, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("Manifest entry doesn't contain 'versionCode' attribute.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(java.io.File[] r12) throws org.xmlpull.v1.XmlPullParserException, e22, java.lang.NoSuchMethodException, android.content.pm.PackageManager.NameNotFoundException, java.lang.SecurityException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wjj.m(java.io.File[]):boolean");
    }

    public final boolean n(File[] fileArr) throws PackageManager.NameNotFoundException {
        X509Certificate x509Certificate;
        Context context = (Context) this.b;
        PackageInfo packageInfo = (PackageInfo) this.d;
        ArrayList arrayList = null;
        if (packageInfo == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
                this.d = packageInfo;
            } catch (PackageManager.NameNotFoundException unused) {
                packageInfo = null;
            }
        }
        if (packageInfo != null && packageInfo.signatures != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Signature signature : packageInfo.signatures) {
                try {
                    x509Certificate = (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
                } catch (CertificateException unused2) {
                    x509Certificate = null;
                }
                if (x509Certificate != null) {
                    arrayList2.add(x509Certificate);
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        int length = fileArr.length;
        while (true) {
            length--;
            if (length < 0) {
                return true;
            }
            try {
                X509Certificate[][] x509CertificateArrK = fac.K(fileArr[length].getAbsolutePath());
                if (x509CertificateArrK == null || x509CertificateArrK.length == 0 || x509CertificateArrK[0].length == 0 || arrayList.isEmpty()) {
                    return false;
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    X509Certificate x509Certificate2 = (X509Certificate) obj;
                    for (X509Certificate[] x509CertificateArr : x509CertificateArrK) {
                        int i2 = x509CertificateArr[0].equals(x509Certificate2) ? 0 : i2 + 1;
                    }
                    return false;
                }
            } catch (Exception unused3) {
                return false;
            }
        }
    }

    public final void p(se seVar) {
        ((ActionMode.Callback) this.a).onDestroyActionMode(e(seVar));
    }

    public final boolean q(se seVar, itd itdVar) {
        ActionMode.Callback callback = (ActionMode.Callback) this.a;
        isk iskVarE = e(seVar);
        hkj hkjVar = (hkj) this.d;
        rud rudVar = (Menu) hkjVar.get(itdVar);
        if (rudVar == null) {
            rudVar = new rud((Context) this.b, itdVar);
            hkjVar.put(itdVar, rudVar);
        }
        return callback.onCreateActionMode(iskVarE, rudVar);
    }

    public final boolean v(se seVar, itd itdVar) {
        ActionMode.Callback callback = (ActionMode.Callback) this.a;
        isk iskVarE = e(seVar);
        hkj hkjVar = (hkj) this.d;
        rud rudVar = (Menu) hkjVar.get(itdVar);
        if (rudVar == null) {
            rudVar = new rud((Context) this.b, itdVar);
            hkjVar.put(itdVar, rudVar);
        }
        return callback.onPrepareActionMode(iskVarE, rudVar);
    }
}
