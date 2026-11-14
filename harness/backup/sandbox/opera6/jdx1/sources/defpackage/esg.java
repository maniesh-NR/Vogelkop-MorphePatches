package defpackage;

import android.animation.Animator;
import android.app.job.JobInfo;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Rect;
import android.os.PersistableBundle;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.stats.WakeLock;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.opera.ads.mediation.admob.OperaMediationAdapter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import java.util.TreeMap;
import kotlin.jvm.functions.Function1;
import org.chromium.components.background_task_scheduler.b;
import org.chromium.components.background_task_scheduler.c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class esg implements ycl, rxd, bd6, p9g, zun, roo, b5b, fkk, zkf {
    public static final Object d = new Object();
    public static p4o e;
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public esg(byte b) {
        this.a = b;
        switch (b) {
            case 12:
                this.b = new c37((byte) 20);
                break;
            case 13:
                this.b = new HashMap();
                this.c = new eq6((byte) 6);
                break;
            case 14:
                esg esgVar = rr7.b;
                this.b = new ua7((ua7) esgVar.b);
                this.c = Arrays.copyOf((long[]) esgVar.c, 10);
                break;
            case 19:
                this.b = new i5a(null);
                this.c = new HashMap();
                break;
            default:
                this.b = new i16(new i06((byte) 17));
                this.c = new i16(new hv5());
                break;
        }
    }

    public /* synthetic */ esg(byte b, Object obj, Object obj2, boolean z) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public esg(int i, int i2, Rect rect, int[] iArr, int[] iArr2) {
        this.a = (byte) 26;
        this.b = new Rect(rect.left, rect.top, i - rect.right, i2 - rect.bottom);
        int[] iArr3 = new int[iArr.length];
        int[] iArr4 = new int[iArr2.length];
        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        System.arraycopy(iArr2, 0, iArr4, 0, iArr2.length);
        this.c = new Rect(iArr3[0], iArr4[0], iArr3[1], iArr4[1]);
    }

    public esg(Context context) {
        this.a = (byte) 1;
        this.b = context;
        this.c = new bx1((byte) 2);
    }

    public esg(Context context, umi umiVar) {
        this.a = (byte) 6;
        this.b = umiVar;
        this.c = hom.t(context.getApplicationContext());
    }

    public esg(View view, ybf ybfVar) {
        this.a = (byte) 27;
        this.b = view;
        this.c = ybfVar;
        G();
    }

    public esg(WorkDatabase_Impl workDatabase_Impl) {
        this.a = (byte) 0;
        this.b = workDatabase_Impl;
        this.c = new b37(workDatabase_Impl, (byte) 1);
    }

    public esg(bpd bpdVar, tm8 tm8Var) {
        this.a = (byte) 16;
        this.b = tm8Var;
        Objects.requireNonNull(bpdVar);
        this.c = bpdVar;
    }

    public esg(csh cshVar, int[] iArr) {
        this.a = (byte) 25;
        this.b = h1b.s(cshVar);
        this.c = iArr;
    }

    public esg(d84 d84Var, r9i r9iVar, String str) {
        this.a = (byte) 7;
        this.b = d84Var;
        this.c = r9iVar;
        if (str != null) {
            r9iVar.M(str, new iu2(d84Var, (byte) 8));
        }
    }

    public /* synthetic */ esg(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj2;
        this.c = obj;
    }

    public esg(ncn ncnVar) {
        this.a = (byte) 22;
        Animator.AnimatorListener kcVar = new kc(this, (byte) 18);
        this.b = ncnVar;
        ncnVar.b.addListener(kcVar);
    }

    public esg(r49 r49Var) {
        this.a = (byte) 29;
        this.c = r49Var;
    }

    public esg(yq1 yq1Var) {
        this.a = (byte) 4;
        this.c = yq1Var;
        this.b = yq1Var;
    }

    public esg(zpa zpaVar, kq0 kq0Var) {
        this.a = (byte) 3;
        this.b = zpaVar;
        this.c = kq0Var;
        z4c.b(new pa(this, (byte) 12));
    }

    public esg(byte[] bArr) {
        this.a = (byte) 23;
        this.b = bArr;
    }

    public static Task n(Context context, Intent intent, boolean z) {
        p4o p4oVar;
        synchronized (d) {
            p4oVar = e;
            if (p4oVar == null) {
                p4oVar = new p4o(context);
                e = p4oVar;
            }
        }
        if (!z) {
            return p4oVar.b(intent).continueWith(new bx1((byte) 2), new yt7((byte) 16));
        }
        if (i3j.w().C(context)) {
            synchronized (sgb.h) {
                if (sgb.i == null) {
                    WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                    sgb.i = wakeLock;
                    wakeLock.setReferenceCounted(true);
                }
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                if (!booleanExtra) {
                    sgb.i.acquire(60000L);
                }
                p4oVar.b(intent).addOnCompleteListener(new r2n(intent, (byte) 5));
            }
        } else {
            p4oVar.b(intent);
        }
        return Tasks.forResult(-1);
    }

    public final void A(sng sngVar, Object obj) {
        HashMap map = (HashMap) this.c;
        i5a i5aVar = (i5a) map.get(sngVar);
        if (i5aVar == null) {
            i5aVar = new i5a(sngVar);
            i5aVar.d = i5aVar;
            i5a i5aVar2 = (i5a) this.b;
            i5aVar.d = i5aVar2.d;
            i5aVar.c = i5aVar2;
            i5aVar2.d = i5aVar;
            i5aVar.d.c = i5aVar;
            map.put(sngVar, i5aVar);
        } else {
            sngVar.a();
        }
        ArrayList arrayList = i5aVar.b;
        if (arrayList == null) {
            arrayList = new ArrayList();
            i5aVar.b = arrayList;
        }
        arrayList.add(obj);
    }

    public final ho2 B() throws IOException {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(s());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i2 = ho2.h;
        byte b = (byte) (((byte) (0 | 2)) | 1);
        int i3 = vep.B(5)[iOptInt];
        if (i3 == 0) {
            t3p.q("Null registrationStatus");
            return null;
        }
        byte b2 = (byte) (((byte) (b | 2)) | 1);
        if (b2 == 3 && i3 != 0) {
            return new ho2(strOptString, i3, strOptString2, strOptString3, jOptLong2, jOptLong, strOptString4);
        }
        StringBuilder sb = new StringBuilder();
        if (i3 == 0) {
            sb.append(" registrationStatus");
        }
        if ((b2 & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((b2 & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        pza.i(sb, "Missing required properties:");
        return null;
    }

    public final void C(String str) {
        x97 x97Var;
        synchronized (this) {
            Object obj = ((HashMap) this.b).get(str);
            qyn.l(obj, "Argument must not be null");
            x97Var = (x97) obj;
            int i = x97Var.b;
            if (i < 1) {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + x97Var.b);
            }
            int i2 = i - 1;
            x97Var.b = i2;
            if (i2 == 0) {
                x97 x97Var2 = (x97) ((HashMap) this.b).remove(str);
                if (!x97Var2.equals(x97Var)) {
                    throw new IllegalStateException("Removed the wrong lock, expected to remove: " + x97Var + ", but actually removed: " + x97Var2 + ", safeKey: " + str);
                }
                eq6 eq6Var = (eq6) this.c;
                synchronized (((ArrayDeque) eq6Var.a)) {
                    try {
                        if (((ArrayDeque) eq6Var.a).size() < 10) {
                            ((ArrayDeque) eq6Var.a).offer(x97Var2);
                        }
                    } finally {
                    }
                }
            }
        }
        x97Var.a.unlock();
    }

    public final Object D() {
        Object obj = (i5a) this.b;
        i5a i5aVar = obj;
        while (true) {
            i5aVar = i5aVar.d;
            boolean zEquals = i5aVar.equals(obj);
            sng sngVar = i5aVar.a;
            if (zEquals) {
                return null;
            }
            ArrayList arrayList = i5aVar.b;
            int size = arrayList != null ? arrayList.size() : 0;
            Object objRemove = size > 0 ? i5aVar.b.remove(size - 1) : null;
            if (objRemove != null) {
                return objRemove;
            }
            i5a i5aVar2 = i5aVar.d;
            i5aVar2.c = i5aVar.c;
            i5aVar.c.d = i5aVar2;
            ((HashMap) this.c).remove(sngVar);
            sngVar.a();
        }
    }

    public void E(int i, float f) {
    }

    public final void F(tun tunVar) {
        ((tb9) this.c).V((ja2) this.b, true);
    }

    public final void G() {
        View view = (View) this.b;
        ybf ybfVar = (ybf) this.c;
        int iC = ybfVar.c();
        int iF = ybfVar.f();
        l5b l5bVar = q9n.c;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams.getMarginStart() == iC && marginLayoutParams.getMarginEnd() == iF) {
                return;
            }
            marginLayoutParams.setMarginStart(iC);
            marginLayoutParams.setMarginEnd(iF);
            view.setLayoutParams(layoutParams);
        }
    }

    public final void a() {
        ((cn) this.b).onAdLoaded((k8) this.c);
    }

    @Override // defpackage.fkk
    public final gkk apply() {
        z3c z3cVar = (z3c) this.b;
        s3c s3cVarU = u();
        if (s3cVarU != null) {
            z3cVar.b(s3cVarU, false);
        }
        return z3cVar.e(this.c);
    }

    public final a5b b() {
        return new a5b((x5f) this.b, (String) this.c, (byte) 1);
    }

    public final void c() {
    }

    @Override // defpackage.fkk
    public final void cancel() {
        s3c s3cVarU = u();
        if ((s3cVarU != null ? s3cVarU.f : null) != null) {
            ((z3c) this.b).g(this.c);
        }
    }

    @Override // defpackage.bd6
    public final ed6 createDataSource() {
        return new dr6((String) this.c, (c37) this.b);
    }

    public final void d(AdError adError) {
        OperaMediationAdapter.access$000((OperaMediationAdapter) this.c, "initialize: onError, error=" + adError);
        ((InitializationCompleteCallback) this.b).onInitializationFailed(adError.getMessage());
    }

    public final void e() {
        OperaMediationAdapter.access$000((OperaMediationAdapter) this.c, "initialize: onSuccess");
        ((InitializationCompleteCallback) this.b).onInitializationSucceeded();
    }

    public final void f(boolean z) {
    }

    public final void g(cm cmVar) {
        ((cn) this.b).g(cmVar);
        pfp.a(new vl9((k8) this.c, (byte) 2));
    }

    public final x4b h(Context context) {
        return new x4b(context.getString(2132019218), (nf) null);
    }

    @Override // defpackage.fkk
    public final boolean i(mgf mgfVar) {
        s3c s3cVarU = u();
        f8g f8gVar = s3cVarU != null ? s3cVarU.f : null;
        if (f8gVar == null || f8gVar.c()) {
            return true;
        }
        ttj ttjVarT = bwg.t();
        Function1 function1E = ttjVarT != null ? ttjVarT.e() : null;
        ttj ttjVarX = bwg.x(ttjVarT);
        try {
            return f8gVar.e(mgfVar);
        } catch (Throwable th) {
            try {
                s3cVarU.getClass();
                throw th;
            } finally {
                bwg.A(ttjVarT, ttjVarX, function1E);
            }
        }
    }

    @Override // defpackage.fkk
    public final boolean j() {
        f8g f8gVar;
        s3c s3cVarU = u();
        if (s3cVarU == null || (f8gVar = s3cVarU.f) == null) {
            return true;
        }
        return f8gVar.c();
    }

    @Override // defpackage.p9g
    public final void k(int[] iArr, String[] strArr) {
        tm8 tm8Var = (tm8) this.b;
        if (iArr.length != 0) {
            if (iArr[0] != 0 || ((aeb) ((mlf) ((bpd) this.c).b).b).a.h()) {
                d23 d23Var = tm8Var.u;
                if (d23Var != null) {
                    d23Var.onResult(sm8.c());
                    return;
                }
                return;
            }
            d23 d23Var2 = tm8Var.u;
            if (d23Var2 != null) {
                d23Var2.onResult(sm8.b(tm8Var.a, tm8Var));
            }
        }
    }

    public final void l(b bVar) {
        JobInfo.Builder builder = (JobInfo.Builder) this.b;
        PersistableBundle persistableBundle = (PersistableBundle) this.c;
        boolean z = bVar.e;
        long j = bVar.b;
        if (z) {
            persistableBundle.putLong("_background_task_schedule_time", System.currentTimeMillis());
            persistableBundle.putLong("_background_task_end_time", j);
        }
        builder.setExtras(persistableBundle);
        if (bVar.c) {
            long j2 = bVar.a;
            if (j2 < 0) {
                j2 = 0;
            }
            builder.setMinimumLatency(j2);
        }
        if (bVar.d) {
            if (z) {
                j += 1000;
            }
            builder.setOverrideDeadline(j);
        }
    }

    public final void m(c cVar) {
        JobInfo.Builder builder = (JobInfo.Builder) this.b;
        PersistableBundle persistableBundle = (PersistableBundle) this.c;
        boolean z = cVar.d;
        long j = cVar.b;
        boolean z2 = cVar.c;
        long j2 = cVar.a;
        if (z) {
            persistableBundle.putLong("_background_task_schedule_time", System.currentTimeMillis());
            persistableBundle.putLong("_background_task_interval_time", j2);
            if (z2) {
                persistableBundle.putLong("_background_task_flex_time", j);
            }
        }
        builder.setExtras(persistableBundle);
        if (z2) {
            builder.setPeriodic(j2, j);
        } else {
            builder.setPeriodic(j2);
        }
    }

    public final x4b o(Context context) {
        return null;
    }

    public final void onAdClicked() {
    }

    public final String p(Context context) {
        return context.getString(2132018338);
    }

    public final String q(Context context) {
        return context.getString(2132018337, context.getString(2132017591));
    }

    public final Object r(sng sngVar) {
        HashMap map = (HashMap) this.c;
        i5a i5aVar = (i5a) map.get(sngVar);
        if (i5aVar == null) {
            i5aVar = new i5a(sngVar);
            map.put(sngVar, i5aVar);
        } else {
            sngVar.a();
        }
        i5a i5aVar2 = i5aVar.d;
        i5aVar2.c = i5aVar.c;
        i5aVar.c.d = i5aVar2;
        i5a i5aVar3 = (i5a) this.b;
        i5aVar.d = i5aVar3;
        i5a i5aVar4 = i5aVar3.c;
        i5aVar.c = i5aVar4;
        i5aVar4.d = i5aVar;
        i5aVar.d.c = i5aVar;
        ArrayList arrayList = i5aVar.b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return i5aVar.b.remove(size - 1);
        }
        return null;
    }

    public final File s() {
        if (((File) this.b) == null) {
            synchronized (this) {
                if (((File) this.b) == null) {
                    String str = "PersistedInstallation." + ((r49) this.c).g() + ".json";
                    r49 r49Var = (r49) this.c;
                    r49Var.a();
                    File file = new File(r49Var.a.getNoBackupFilesDir(), str);
                    this.b = file;
                    if (file.exists()) {
                        return (File) this.b;
                    }
                    r49 r49Var2 = (r49) this.c;
                    r49Var2.a();
                    File file2 = new File(r49Var2.a.getFilesDir(), str);
                    if (file2.exists() && !file2.renameTo((File) this.b)) {
                        new IOException("Unable to move the file from back up to non back up directory");
                        return file2;
                    }
                }
            }
        }
        return (File) this.b;
    }

    public final Long t(String str) {
        TreeMap treeMap = e6i.i;
        e6i e6iVarE = aoh.e(1, "SELECT long_value FROM Preference where `key`=?");
        e6iVarE.w(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.b;
        workDatabase_Impl.b();
        Cursor cursorS = workDatabase_Impl.s(e6iVarE);
        try {
            Long lValueOf = null;
            if (cursorS.moveToFirst() && !cursorS.isNull(0)) {
                lValueOf = Long.valueOf(cursorS.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorS.close();
            e6iVarE.release();
        }
    }

    public final String toString() {
        switch (this.a) {
            case 19:
                StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
                Object obj = (i5a) this.b;
                i5a i5aVar = obj;
                boolean z = false;
                while (true) {
                    i5aVar = i5aVar.c;
                    if (i5aVar.equals(obj)) {
                        if (z) {
                            sb.delete(sb.length() - 2, sb.length());
                        }
                        sb.append(" )");
                        return sb.toString();
                    }
                    sb.append('{');
                    sb.append(i5aVar.a);
                    sb.append(':');
                    ArrayList arrayList = i5aVar.b;
                    sb.append(arrayList != null ? arrayList.size() : 0);
                    sb.append("}, ");
                    z = true;
                }
            default:
                return super.toString();
        }
    }

    public final s3c u() {
        z3c z3cVar = (z3c) this.b;
        m3c m3cVar = (m3c) z3cVar.j.g(this.c);
        if (m3cVar != null) {
            return (s3c) z3cVar.f.g(m3cVar);
        }
        return null;
    }

    public final void v(ho2 ho2Var) throws JSONException, IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", ho2Var.a);
            jSONObject.put("Status", vep.A(ho2Var.b));
            jSONObject.put("AuthToken", ho2Var.c);
            jSONObject.put("RefreshToken", ho2Var.d);
            jSONObject.put("TokenCreationEpochInSecs", ho2Var.f);
            jSONObject.put("ExpiresInSecs", ho2Var.e);
            jSONObject.put("FisError", ho2Var.g);
            r49 r49Var = (r49) this.c;
            r49Var.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", r49Var.a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(s())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public final void w(dsg dsgVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.b;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((b37) this.c).p(dsgVar);
            workDatabase_Impl.v();
        } finally {
            workDatabase_Impl.p();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(java.lang.String r7, nt5 r8) throws m2 {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.tm6
            if (r0 == 0) goto L13
            r0 = r8
            tm6 r0 = (defpackage.tm6) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            tm6 r0 = new tm6
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.ybh.y(r8)
            return r8
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r3
        L31:
            java.lang.String r7 = r0.t
            defpackage.ybh.y(r8)
            goto L4c
        L37:
            defpackage.ybh.y(r8)
            java.lang.Object r8 = r6.c
            lq6 r8 = (lq6) r8
            ip6 r8 = r8.a
            f99 r8 = r8.e
            r0.t = r7
            r0.w = r5
            java.lang.Object r8 = defpackage.cs5.E(r8, r0)
            if (r8 == r1) goto L72
        L4c:
            java.util.Map r8 = (java.util.Map) r8
            java.lang.Object r7 = r8.get(r7)
            d98 r7 = (d98) r7
            if (r7 != 0) goto L59
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L59:
            e98 r8 = r7.f
            if (r8 == 0) goto L64
            boolean r8 = r8.a
            if (r8 != r5) goto L64
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L64:
            java.lang.Object r6 = r6.b
            vm6 r6 = (vm6) r6
            r0.t = r3
            r0.w = r4
            java.lang.Object r6 = r6.a(r7, r0)
            if (r6 != r1) goto L73
        L72:
            return r1
        L73:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.esg.x(java.lang.String, nt5):java.lang.Object");
    }

    public final AutofillId y(long j) {
        return ((ContentCaptureSession) this.b).newAutofillId(((View) this.c).getAutofillId(), j);
    }

    public final Task z(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = (Context) this.b;
        bx1 bx1Var = (bx1) this.c;
        boolean z = PlatformVersion.isAtLeastO() && context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z2 = (intent.getFlags() & 268435456) != 0;
        return (!z || z2) ? Tasks.call(bx1Var, new d9(context, intent, (byte) 3)).continueWithTask(bx1Var, new hg7(context, intent, z2)) : n(context, intent, z2);
    }
}
