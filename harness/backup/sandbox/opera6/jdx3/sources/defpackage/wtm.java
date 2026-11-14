package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.webkit.WebViewStartUpResult;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzdd;
import com.google.android.gms.internal.play_billing.zzjn;
import com.leanplum.utils.SizeUtil;
import com.opera.ad.entity.Macros;
import com.opera.android.widget.UrlFieldEditText;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.chromium.net.X509Util;
import org.chromium.support_lib_boundary.WebViewStartUpResultBoundaryInterface;

/* loaded from: classes.dex */
public final class wtm implements nmn, WebViewStartUpResult, zzdd, jtp {
    public static volatile wtm d;
    public Object a;
    public Object b;
    public Object c;

    public wtm(byte b) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        switch (b) {
            case 8:
                this.b = new ArrayDeque();
                this.c = null;
                this.a = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                break;
            default:
                this.a = CertificateFactory.getInstance("X.509");
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidCAStore");
                    this.b = keyStore;
                    try {
                        keyStore.load(null);
                    } catch (IOException unused) {
                    }
                    this.c = new File(System.getenv("ANDROID_ROOT") + "/etc/security/cacerts");
                } catch (KeyStoreException unused2) {
                }
                anf anfVar = new anf((byte) 3);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.security.action.KEYCHAIN_CHANGED");
                intentFilter.addAction("android.security.action.KEY_ACCESS_CHANGED");
                intentFilter.addAction("android.security.action.TRUST_STORE_CHANGED");
                t8.Q(t8.a, anfVar, intentFilter);
                break;
        }
    }

    public wtm(Context context, qro qroVar, vdp vdpVar) {
        this.a = vdpVar;
        this.b = context.getApplicationContext();
        new urj(qroVar);
        this.c = new rgh(context, qroVar);
    }

    public wtm(ConstraintLayout constraintLayout, UrlFieldEditText urlFieldEditText) {
        this.a = constraintLayout;
        this.b = urlFieldEditText;
        this.c = z4c.b(new m2n(this, (byte) 0));
        constraintLayout.addOnLayoutChangeListener(new z22(this, (byte) 18));
    }

    public /* synthetic */ wtm(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ wtm(boolean z, Object obj, Object obj2, Object obj3) {
        this.a = obj2;
        this.b = obj3;
        this.c = obj;
    }

    public static wtm b() {
        if (d == null) {
            synchronized (X509Util.d()) {
                if (d == null) {
                    d = new wtm((byte) 6);
                }
            }
        }
        return d;
    }

    public final void a(int i) {
        int i2;
        ArrayList arrayList;
        int i3;
        switch (h8p.a[vep.A(i)]) {
            case 1:
                i2 = 8;
                break;
            case 2:
                i2 = 12;
                break;
            case 3:
                i2 = 9;
                break;
            case 4:
                i2 = 10;
                break;
            case 5:
                i2 = 11;
                break;
            case 6:
                i2 = 16;
                break;
            case 7:
                i2 = 23;
                break;
            case 8:
                i2 = 24;
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                i2 = 7;
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                i2 = 21;
                break;
            case 11:
                i2 = 22;
                break;
            case 12:
                i2 = 19;
                break;
            case 13:
                i2 = 20;
                break;
            case 14:
                i2 = 17;
                break;
            case 15:
                i2 = 18;
                break;
            case 16:
                i2 = 13;
                break;
            case 17:
                i2 = 14;
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                i2 = 15;
                break;
            default:
                return;
        }
        ArrayList arrayList2 = (ArrayList) this.a;
        int i4 = 0;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            arrayList = null;
        } else {
            ArrayList arrayList3 = (ArrayList) this.a;
            int size = arrayList3.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList3.get(i5);
                i5++;
                pho phoVar = (pho) obj;
                if (phoVar.a != i2 || (arrayList = phoVar.b) == null || arrayList.isEmpty()) {
                }
            }
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            int size2 = arrayList.size();
            while (i4 < size2) {
                Object obj2 = arrayList.get(i4);
                i4++;
                String str = (String) obj2;
                euo euoVar = (euo) this.b;
                if (euoVar != null) {
                    String str2 = t8p.J ? "auto" : "manual";
                    int i6 = euoVar.I;
                    if (i6 == 1) {
                        i3 = 400;
                    } else if (i6 == 2) {
                        i3 = 401;
                    } else {
                        if (i6 != 3) {
                            throw null;
                        }
                        i3 = 900;
                    }
                    String strP = f1p.a().p(lno.a(str, new Macros(str2, i3)));
                    if (!TextUtils.isEmpty(strP)) {
                        phj.t(strP, i2);
                    }
                }
            }
        }
        sc scVar = (sc) this.c;
        if (scVar != null) {
            scVar.b(i2);
        }
    }

    @Override // defpackage.jtp
    public final void c(otp otpVar, File file, boolean z) throws IOException {
        ((HashSet) this.a).add(file);
        if (z) {
            return;
        }
        eqp eqpVar = (eqp) this.b;
        String str = eqpVar.b;
        ZipEntry zipEntry = otpVar.b;
        eqpVar.a.getAbsolutePath();
        zipEntry.getName();
        file.getAbsolutePath();
        ZipFile zipFile = (ZipFile) this.c;
        byte[] bArr = new byte[4096];
        if (file.exists()) {
            file.delete();
        }
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                file.setWritable(false, true);
                file.setWritable(false, false);
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i <= 0) {
                        fileOutputStream.close();
                        inputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } finally {
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    w1h.B(th, th2);
                }
            }
            throw th;
        }
    }

    @Override // defpackage.nmn
    public final void d() {
        ((lmn) ((l45) this.c).c).c();
    }

    @Override // defpackage.nmn
    public final void e() {
        ((lmn) ((l45) this.c).c).f();
    }

    public final void f(vb0 vb0Var) {
        hf0 hf0Var;
        oen oenVar = (oen) ((kze) this.c).g();
        x5f x5fVar = (x5f) this.a;
        Integer num = oenVar.a;
        CharSequence charSequence = oenVar.b;
        String string = charSequence != null ? charSequence.toString() : null;
        zpa zpaVar = x5fVar.d;
        x56 x56VarF = zpa.F();
        tt0 tt0Var = new tt0(2443, -1, 3);
        tt0Var.q(0, 1, vb0Var);
        if (num != null) {
            tt0Var.p(1, 1, num.intValue());
        }
        if (!TextUtils.isEmpty(string)) {
            tt0Var.q(2, string != null ? 1 : 0, string);
        }
        de0 de0VarC = x56VarF.C(zpaVar);
        List list = (List) de0VarC.n(3);
        if (list == null || list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            de0VarC.q(3, 1, arrayList);
            hf0Var = new hf0(de0VarC, 3, arrayList);
        } else {
            hf0Var = new hf0(de0VarC, 3, list);
        }
        hf0Var.add(tt0Var);
        x5fVar.U0(x56VarF);
    }

    @Override // defpackage.nmn
    public final void g(omn omnVar) {
        aln alnVar = omnVar.a;
        l45 l45Var = (l45) this.c;
        o2c o2cVar = (o2c) l45Var.b;
        lmn lmnVar = (lmn) l45Var.c;
        if (lmnVar == l45.g) {
            return;
        }
        lmnVar.e(alnVar);
        new qjn(((qln) l45Var.a).g, alnVar.c((Context) this.a, o2cVar), (ilm) this.b, o2cVar);
    }

    public final Long getMaxTimePerTaskInUiThreadMillis() {
        return ((WebViewStartUpResultBoundaryInterface) this.c).getMaxTimePerTaskInUiThreadMillis();
    }

    public final List getNonUiThreadBlockingStartUpLocations() {
        return (ArrayList) this.b;
    }

    public final Long getTotalTimeInUiThreadMillis() {
        return ((WebViewStartUpResultBoundaryInterface) this.c).getTotalTimeInUiThreadMillis();
    }

    public final List getUiThreadBlockingStartUpLocations() {
        return (ArrayList) this.a;
    }

    public final boolean h() {
        return (((Activity) this.a).getResources().getConfiguration().uiMode & 48) == 32;
    }

    public final void zza(Throwable th) {
        boolean z = th instanceof TimeoutException;
        mrp mrpVar = (mrp) this.c;
        if (z) {
            mrpVar.G(28, xrp.q, zzjn.zzaX);
            zzc.zzp("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            mrpVar.G(28, xrp.q, zzjn.zzaQ);
            zzc.zzp("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        ((iv) this.b).run();
    }

    public final void zzb(Object obj) {
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        mrp mrpVar = (mrp) this.c;
        if (iIntValue <= 0) {
            ((iv) this.b).run();
            return;
        }
        mf3 mf3VarA = xrp.a(num.intValue(), "Billing override value was set by a license tester.");
        mrpVar.G(7, mf3VarA, zzjn.zzaO);
        ((ms7) this.a).accept(mf3VarA);
    }
}
