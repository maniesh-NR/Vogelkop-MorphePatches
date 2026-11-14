package defpackage;

import J.N;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.SystemClock;
import android.text.format.DateFormat;
import com.opera.android.vpn.VpnReceiver;
import com.opera.api.Callback;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class qq8 implements kc9, yb4 {
    public long a;
    public final Object b;
    public Object c;

    public qq8() {
        j1n j1nVar = j1n.a;
        this.b = new k1n();
        this.c = new k1n();
    }

    public qq8(long j, bp bpVar) {
        this.a = j;
        this.b = bpVar;
        tr3 tr3Var = new tr3();
        tr3Var.d = this;
        tr3Var.c = new LinkedHashMap(0, 0.75f, true);
        tr3Var.a = j;
        if (j > 0) {
            this.c = tr3Var;
        } else {
            qp2.o("maxSize <= 0");
            throw null;
        }
    }

    public /* synthetic */ qq8(long j, Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
        this.a = j;
    }

    public qq8(ContentResolver contentResolver, Uri uri) {
        this.b = contentResolver;
        this.c = uri;
        long jAvailable = 0;
        InputStream inputStreamE = null;
        try {
            inputStreamE = E();
            if (inputStreamE != null) {
                jAvailable = inputStreamE.available();
            }
        } catch (IOException unused) {
        } catch (Throwable th) {
            xvg.l(inputStreamE);
            throw th;
        }
        xvg.l(inputStreamE);
        this.a = jAvailable;
    }

    public qq8(Context context) {
        this.b = context;
        this.a = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
    }

    public qq8(Context context, ydn ydnVar) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.c = ydnVar;
        this.a = ru9.c(applicationContext).a.getLong("vpn.resume_timestamp", 0L);
        k();
    }

    public qq8(Callback callback) {
        this.b = callback;
        this.c = new LinkedHashMap();
    }

    public qq8(List list, long j, k6m k6mVar) {
        this.b = list;
        this.a = j;
        this.c = k6mVar;
    }

    public static void s(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                s(file2);
            }
        }
        if (!file.exists() || file.delete()) {
            return;
        }
        s49.m(sko.k("Failed to delete '", file.getAbsolutePath(), "'"));
    }

    public static File u(File file, String str) {
        File file2 = new File(file, str);
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            return file2;
        }
        qp2.o("split ID cannot be placed in target directory");
        return null;
    }

    public static void v(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            }
            qp2.o("File input must be directory when it exists.");
        } else {
            file.mkdirs();
            if (file.isDirectory()) {
                return;
            }
            s49.m("Unable to create directory: ".concat(String.valueOf(file.getAbsolutePath())));
        }
    }

    @Override // defpackage.kc9
    public final InputStream E() {
        return ((ContentResolver) this.b).openInputStream((Uri) this.c);
    }

    public final void b(long j, long j2) {
        ((k1n) this.b).a(j, Float.intBitsToFloat((int) (j2 >> 32)));
        ((k1n) this.c).a(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public final int c() {
        yb4 yb4Var = (yb4) this.b;
        if (yb4Var != null) {
            return yb4Var.c();
        }
        return 1;
    }

    public final hbl d() {
        return (hbl) this.c;
    }

    public final long e() {
        yb4 yb4Var = (yb4) this.b;
        if (yb4Var != null) {
            return yb4Var.e();
        }
        long j = this.a;
        if (j != -1) {
            return j;
        }
        qp2.n("No timestamp is available.");
        return 0L;
    }

    public final sxh f(Context context) {
        return new sxh(2132022185, new Object[]{DateFormat.getTimeFormat(context).format(new Date((System.currentTimeMillis() - SystemClock.elapsedRealtime()) + this.a))});
    }

    public final boolean g() {
        return this.a != 0;
    }

    public final String h() {
        long j = this.a;
        this.a = 1 + j;
        return String.valueOf(j);
    }

    public final void i(hjm hjmVar) {
        vb0 vb0Var;
        int i;
        int iOrdinal = hjmVar.ordinal();
        if (iOrdinal == 0) {
            vb0Var = vb0.c;
            i = 0;
        } else {
            if (iOrdinal != 1) {
                return;
            }
            vb0Var = vb0.d;
            i = 3;
        }
        N.Mf9jHO_s(this.a, i, (Object) null);
        ((x5f) this.b).w0(vb0Var);
    }

    public final void j(orb orbVar) {
        Function1 function1 = (Function1) ((LinkedHashMap) this.c).remove(orbVar.e("id"));
        if (function1 == null) {
            return;
        }
        function1.invoke(orbVar);
    }

    public final void k() {
        long j = this.a;
        Context context = (Context) this.b;
        if (j != 0) {
            int i = VpnReceiver.a;
            ((AlarmManager) context.getSystemService("alarm")).set(3, j, PendingIntent.getBroadcast(context, 0, VpnReceiver.a(context), 201326592));
            return;
        }
        int i2 = VpnReceiver.a;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, VpnReceiver.a(context), 603979776);
        if (broadcast == null) {
            return;
        }
        alarmManager.cancel(broadcast);
    }

    public final void l(orb orbVar, Function1 function1) {
        ((LinkedHashMap) this.c).put(orbVar.e("id"), function1);
        ((Callback) this.b).run(orbVar.a.toString());
    }

    @Override // defpackage.kc9
    public final long length() {
        return this.a;
    }

    public final void m(wsd wsdVar, jva jvaVar, Map map, long j) {
        tr3 tr3Var = (tr3) this.c;
        long j2 = tr3Var.a;
        LinkedHashMap linkedHashMap = (LinkedHashMap) tr3Var.c;
        if (j > j2) {
            Object objRemove = linkedHashMap.remove(wsdVar);
            if (objRemove != null) {
                tr3Var.b = tr3Var.k() - tr3Var.n(wsdVar, objRemove);
                tr3Var.j(wsdVar, objRemove, (dmh) null);
            }
            ((bp) this.b).a0(wsdVar, jvaVar, map, j);
            return;
        }
        dmh dmhVar = new dmh(jvaVar, map, j);
        Object objPut = linkedHashMap.put(wsdVar, dmhVar);
        tr3Var.b = tr3Var.n(wsdVar, dmhVar) + tr3Var.k();
        if (objPut != null) {
            tr3Var.b = tr3Var.k() - tr3Var.n(wsdVar, objPut);
            tr3Var.j(wsdVar, objPut, dmhVar);
        }
        tr3Var.p(tr3Var.a);
    }

    public final void n(long j) {
        if (j == this.a) {
            return;
        }
        this.a = j;
        nv6 nv6VarB = ru9.c((Context) this.b).b();
        ((SharedPreferences.Editor) nv6VarB.a).putLong("vpn.resume_timestamp", this.a);
        nv6VarB.w();
        k();
    }

    public final HashSet o() {
        File file = new File(x(), "verified-splits");
        v(file);
        HashSet hashSet = new HashSet();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isFile() && file2.getName().endsWith(".apk") && !file2.canWrite()) {
                    hashSet.add(new eqp(file2, file2.getName().substring(0, r4.length() - 4)));
                }
            }
        }
        return hashSet;
    }

    public final vb4 p() {
        yb4 yb4Var = (yb4) this.b;
        return yb4Var != null ? yb4Var.p() : vb4.a;
    }

    public final wb4 q() {
        yb4 yb4Var = (yb4) this.b;
        return yb4Var != null ? yb4Var.q() : wb4.a;
    }

    public final void r() {
        File fileW = w();
        String[] list = fileW.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(Long.toString(this.a))) {
                    File file = new File(fileW, str);
                    file.toString();
                    s(file);
                }
            }
        }
    }

    public final ub4 t() {
        yb4 yb4Var = (yb4) this.b;
        return yb4Var != null ? yb4Var.t() : ub4.a;
    }

    public final File w() {
        if (((File) this.c) == null) {
            Context context = (Context) this.b;
            if (context == null) {
                qp2.n("context must be non-null to populate null filesDir");
                return null;
            }
            this.c = context.getFilesDir();
        }
        File file = new File((File) this.c, "splitcompat");
        v(file);
        return file;
    }

    public final File x() {
        File file = new File(w(), Long.toString(this.a));
        v(file);
        return file;
    }
}
