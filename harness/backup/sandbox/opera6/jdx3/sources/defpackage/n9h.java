package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.MatrixCursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.ArrayMap;
import android.view.Surface;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType;
import com.google.ads.interactivemedia.v3.impl.data.zzbi;
import com.google.ads.interactivemedia.v3.impl.data.zzbj;
import com.google.ads.interactivemedia.v3.impl.data.zzbk;
import com.google.ads.interactivemedia.v3.impl.data.zzbp;
import com.google.ads.interactivemedia.v3.impl.data.zzcf;
import com.google.ads.interactivemedia.v3.impl.data.zzcg;
import com.google.ads.interactivemedia.v3.internal.zzeg;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.opera.android.settings.UserSettingsContentProvider;
import com.opera.api.Callback;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class n9h implements rr9, ch7, ovm, nmn, OnCompleteListener {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public n9h(byte b) {
        this.a = b;
        switch (b) {
            case 13:
                oji ojiVar = new oji();
                ojiVar.a = new ArrayMap(4);
                this.b = ojiVar;
                break;
            case 14:
                break;
            case 15:
                this.b = new ArrayList(1);
                break;
            default:
                this.b = new LinkedHashMap();
                this.c = new LinkedHashMap();
                break;
        }
    }

    public /* synthetic */ n9h(byte b, Object obj, Object obj2, boolean z) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public n9h(Context context) {
        this.a = (byte) 0;
        cv6 cv6Var = bb7.a;
        this.b = sgb.b(mr6.b);
        this.c = z4c.b(new vg4(context, (byte) 15));
    }

    public n9h(zzeg zzegVar) {
        this.a = (byte) 16;
        this.b = new ArrayList(1);
        this.c = zzegVar;
    }

    public /* synthetic */ n9h(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ n9h(wci wciVar) {
        this.a = (byte) 5;
        this.b = new ArrayList((ArrayList) wciVar.b);
        this.c = new ArrayList((ArrayList) wciVar.c);
    }

    public n9h(wub wubVar) {
        this.a = (byte) 4;
        this.c = new Object();
        this.b = wubVar;
    }

    public static boolean n(String str) {
        return str.startsWith("web:") && str.substring(4).contains(";");
    }

    public final void a() {
        cph cphVar = (cph) this.b;
        synchronized (cphVar) {
            cphVar.c = cphVar.a.length;
        }
    }

    public final void b(zg3 zg3Var, Bitmap bitmap) throws IOException {
        IOException iOException = ((uf8) this.c).b;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            zg3Var.b(bitmap);
            throw iOException;
        }
    }

    public final void c(int i) {
        if (((jn) this.c) != null) {
            ArrayList arrayList = (ArrayList) this.b;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                vsp vspVar = (vsp) obj;
                jn jnVar = (jn) this.c;
                if (vspVar.c) {
                    zzcf zzcfVarA = zzcg.a();
                    zzcfVarA.b(i / 100.0f);
                    vspVar.a(JavaScriptMessage$MsgType.volumeChange, jnVar, zzcfVarA.a());
                }
            }
        }
    }

    @Override // defpackage.nmn
    public final void d() {
        ((Callback) this.c).run(Boolean.FALSE);
    }

    @Override // defpackage.nmn
    public final void e() {
        ((Callback) this.c).run(Boolean.FALSE);
    }

    @Override // defpackage.ovm
    public final int f(String str) {
        synchronized (((UserSettingsContentProvider) this.c).b) {
            SharedPreferences sharedPreferences = (SharedPreferences) ((UserSettingsContentProvider) this.c).a.get();
            String strJ = UserSettingsContentProvider.j(sharedPreferences, str);
            if (strJ == null) {
                return 0;
            }
            ((MatrixCursor) this.b).newRow().add(sharedPreferences.getString(strJ, null));
            return 0;
        }
    }

    @Override // defpackage.nmn
    public final void g(omn omnVar) {
        qln qlnVar = (qln) ((qsh) this.b).c;
        String id = omnVar.a.getId();
        vzk vzkVar = qlnVar.j;
        ((ArrayList) vzkVar.d).add(id);
        vzkVar.i0();
        ((Callback) this.c).run(Boolean.TRUE);
    }

    @Override // defpackage.ovm
    public final int h(String str) {
        synchronized (((UserSettingsContentProvider) this.c).b) {
            SharedPreferences sharedPreferences = (SharedPreferences) ((UserSettingsContentProvider) this.c).a.get();
            String strJ = UserSettingsContentProvider.j(sharedPreferences, str);
            if (strJ == null) {
                return 0;
            }
            ((MatrixCursor) this.b).newRow().add(Long.valueOf(sharedPreferences.getLong(strJ, 0L)));
            return 0;
        }
    }

    @Override // defpackage.ovm
    public final int i(String str) {
        int i;
        synchronized (((UserSettingsContentProvider) this.c).b) {
            SharedPreferences sharedPreferences = (SharedPreferences) ((UserSettingsContentProvider) this.c).a.get();
            if ("previous_version_code".equals(str)) {
                ((UserSettingsContentProvider) this.c).h();
                i = ((UserSettingsContentProvider) this.c).d;
            } else {
                String strJ = UserSettingsContentProvider.j(sharedPreferences, str);
                if (strJ == null) {
                    return 0;
                }
                i = sharedPreferences.getInt(strJ, 0);
            }
            ((MatrixCursor) this.b).newRow().add(Integer.valueOf(i));
            return 0;
        }
    }

    public final smj j(long j, boolean z, String str) {
        if (str.isEmpty()) {
            return null;
        }
        synchronized (this.c) {
            smj smjVarL = l(str);
            if (smjVarL != null) {
                return smjVarL;
            }
            sr4 sr4Var = (sr4) xjf.a.get("sites");
            ((wub) this.b).y(new NotificationChannelGroup(sr4Var.a, t8.a.getResources().getString(sr4Var.b)));
            StringBuilder sb = new StringBuilder("web:");
            eyi eyiVarF = eyi.f(str);
            String str2 = (String) eyiVarF.d;
            sb.append((str2 == null || !eyiVarF.b) ? (String) eyiVarF.c : "http://".concat(str2));
            sb.append(";");
            sb.append(j);
            smj smjVar = new smj(sb.toString(), str, z);
            try {
                ((wub) this.b).x(smjVar.a());
                return smjVar;
            } catch (IllegalStateException unused) {
                return null;
            }
        }
    }

    public final void k(String str) {
        synchronized (this.c) {
            smj smjVarL = l(str);
            if (smjVarL != null) {
                ((wub) this.b).A(smjVarL.a);
            }
        }
    }

    public final smj l(String str) throws NumberFormatException {
        eyi eyiVarF = eyi.f(str);
        String str2 = (String) eyiVarF.d;
        String strConcat = (str2 == null || !eyiVarF.b) ? (String) eyiVarF.c : "http://".concat(str2);
        for (smj smjVar : m()) {
            if (smjVar.b.equals(strConcat)) {
                return smjVar;
            }
        }
        return null;
    }

    public final smj[] m() throws NumberFormatException {
        List<NotificationChannel> listF = ((wub) this.b).F();
        ArrayList arrayList = new ArrayList();
        for (NotificationChannel notificationChannel : listF) {
            if (n(notificationChannel.getId())) {
                String[] strArrSplit = notificationChannel.getId().substring(4).split(";");
                String id = notificationChannel.getId();
                String str = strArrSplit[0];
                Long.parseLong(strArrSplit[1]);
                arrayList.add(new smj(id, str, notificationChannel.getImportance() != 0));
            }
        }
        return (smj[]) arrayList.toArray(new smj[arrayList.size()]);
    }

    public final void o(String str, x4l x4lVar, boolean z) {
        if (z) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
            gpk gpkVar = a5l.l;
            Uri uri = Uri.parse(str);
            linkedHashMap.remove(new y4l(new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).build().toString()));
        }
        ((LinkedHashMap) this.b).put(str, x4lVar);
    }

    public final void onComplete(Task task) {
        dpp dppVar = (dpp) this.b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
        synchronized (dppVar.f) {
            dppVar.e.remove(taskCompletionSource);
        }
    }

    @Override // defpackage.rr9
    public final void onFailure(Throwable th) {
        switch (this.a) {
            case 1:
                Objects.toString(th);
                koh kohVar = (koh) this.c;
                int i = kohVar.e;
                if (i < kohVar.c) {
                    kohVar.e = i + 1;
                    pjg pjgVar = new pjg(this, (byte) 18);
                    b2j b2jVar = kohVar.g.d;
                    kohVar.f = x7d.l().schedule(new q2g(b2jVar, pjgVar, (byte) 24), moh.L, TimeUnit.MILLISECONDS);
                    return;
                }
                moh mohVar = kohVar.g;
                synchronized (mohVar.f) {
                    switch (mohVar.h.ordinal()) {
                        case 0:
                        case 1:
                        case 2:
                            if (mohVar.j != -1) {
                                mohVar.j = -1;
                                mohVar.a.o(new so2(-1, moh.m(mohVar.h)));
                            }
                            mohVar.q(loh.h);
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            throw new AssertionError("Encountered encoder setup error while in unexpected state " + mohVar.h + ": " + th);
                    }
                }
                return;
            default:
                jpo.n("Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th, th instanceof ztk);
                ((qp5) this.b).accept(new xo2(1, (Surface) this.c));
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00de A[Catch: all -> 0x01a1, TryCatch #0 {, blocks: (B:24:0x00a5, B:25:0x00ab, B:53:0x0126, B:27:0x00b0, B:28:0x00b7, B:31:0x00bb, B:32:0x00c2, B:33:0x00d5, B:36:0x00d9, B:38:0x00de, B:40:0x00e8, B:41:0x00ef, B:42:0x0104, B:43:0x0105, B:45:0x010b, B:47:0x010f, B:48:0x0116, B:49:0x0117, B:50:0x011e, B:51:0x011f), top: B:69:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0105 A[Catch: all -> 0x01a1, TryCatch #0 {, blocks: (B:24:0x00a5, B:25:0x00ab, B:53:0x0126, B:27:0x00b0, B:28:0x00b7, B:31:0x00bb, B:32:0x00c2, B:33:0x00d5, B:36:0x00d9, B:38:0x00de, B:40:0x00e8, B:41:0x00ef, B:42:0x0104, B:43:0x0105, B:45:0x010b, B:47:0x010f, B:48:0x0116, B:49:0x0117, B:50:0x011e, B:51:0x011f), top: B:69:0x00a5 }] */
    @Override // defpackage.rr9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSuccess(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n9h.onSuccess(java.lang.Object):void");
    }

    public final void p(jvg jvgVar) {
        ArrayList arrayList = (ArrayList) this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((em) obj).a(jvgVar);
        }
        zzeg zzegVar = (zzeg) this.c;
        if (zzegVar != null) {
            zzegVar.a(zzbk.d(System.currentTimeMillis(), (zzbi) null, (zzbj) null, jvgVar, (zzbp) null));
        }
    }

    public final String toString() {
        switch (this.a) {
            case 5:
                return String.format("SplitInstallRequest{modulesNames=%s,languages=%s}", (ArrayList) this.b, (ArrayList) this.c);
            case 16:
                return sko.k("ErrorListenerSupport [errorListeners=", ((ArrayList) this.b).toString(), "]");
            default:
                return super.toString();
        }
    }
}
