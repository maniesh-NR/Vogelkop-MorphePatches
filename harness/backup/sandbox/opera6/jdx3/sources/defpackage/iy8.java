package defpackage;

import android.net.Uri;
import android.os.AsyncTask;
import com.leanplum.internal.Constants;
import com.opera.api.Callback;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class iy8 extends AsyncTask {
    public final /* synthetic */ byte a;
    public final Object b;

    public iy8(aip aipVar) {
        this.a = (byte) 2;
        this.b = aipVar;
    }

    public /* synthetic */ iy8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public static void a(orb orbVar, k5o k5oVar) throws JSONException {
        orb orbVarC = orbVar.c("articles");
        Iterator<String> itKeys = orbVarC.a.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            orb orbVarC2 = orbVarC.c(next);
            String strE = orbVarC2.e(Constants.Params.TYPE);
            String strE2 = orbVarC2.e("request_id");
            HashMap map = (HashMap) k5oVar.b;
            if (!map.containsKey(next)) {
                h92 h92Var = new h92(strE, strE2, null);
                h92Var.d.set(true);
                map.put(next, h92Var);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0156 A[PHI: r26
      0x0156: PHI (r26v1 java.lang.String) = 
      (r26v0 java.lang.String)
      (r26v0 java.lang.String)
      (r26v2 java.lang.String)
      (r26v0 java.lang.String)
      (r26v0 java.lang.String)
      (r26v0 java.lang.String)
      (r26v0 java.lang.String)
      (r26v0 java.lang.String)
      (r26v0 java.lang.String)
      (r26v0 java.lang.String)
      (r26v0 java.lang.String)
      (r26v0 java.lang.String)
      (r26v0 java.lang.String)
      (r26v0 java.lang.String)
      (r26v0 java.lang.String)
      (r26v0 java.lang.String)
      (r26v0 java.lang.String)
      (r26v0 java.lang.String)
      (r26v0 java.lang.String)
      (r26v0 java.lang.String)
      (r26v0 java.lang.String)
      (r26v0 java.lang.String)
      (r26v0 java.lang.String)
      (r26v0 java.lang.String)
     binds: [B:6:0x0066, B:75:0x0154, B:72:0x014a, B:69:0x013d, B:66:0x0134, B:63:0x012b, B:60:0x0122, B:57:0x011a, B:54:0x0110, B:51:0x0105, B:48:0x00f9, B:45:0x00ef, B:42:0x00e5, B:39:0x00db, B:36:0x00cf, B:33:0x00c3, B:30:0x00b7, B:27:0x00ad, B:24:0x00a3, B:21:0x0097, B:18:0x008d, B:15:0x0083, B:12:0x0079, B:9:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(defpackage.vpb r27, defpackage.jec r28) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iy8.b(vpb, jec):void");
    }

    public static void c(vpb vpbVar, Set set) {
        for (int i = 0; i < vpbVar.a.length(); i++) {
            set.add(vpbVar.d(i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0105 A[Catch: OutOfMemoryError -> 0x0114, TryCatch #2 {OutOfMemoryError -> 0x0114, blocks: (B:5:0x0014, B:7:0x001e, B:9:0x0024, B:11:0x002a, B:73:0x0101, B:75:0x0105, B:77:0x0109, B:78:0x010e, B:15:0x0042, B:23:0x0056, B:24:0x0059, B:26:0x005b, B:27:0x0060, B:60:0x00dd, B:64:0x00e4, B:66:0x00ec, B:71:0x00fd, B:67:0x00f2, B:69:0x00f6, B:62:0x00e1, B:63:0x00e3, B:29:0x0064, B:31:0x006f, B:33:0x0075, B:40:0x0097, B:45:0x00a9, B:59:0x00da, B:44:0x00a0, B:42:0x009c, B:43:0x009f, B:46:0x00ac, B:48:0x00b6, B:50:0x00be, B:51:0x00c6, B:55:0x00ce, B:58:0x00d8, B:35:0x007f, B:37:0x008d, B:39:0x0091), top: B:97:0x0014, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010e A[Catch: OutOfMemoryError -> 0x0114, TRY_LEAVE, TryCatch #2 {OutOfMemoryError -> 0x0114, blocks: (B:5:0x0014, B:7:0x001e, B:9:0x0024, B:11:0x002a, B:73:0x0101, B:75:0x0105, B:77:0x0109, B:78:0x010e, B:15:0x0042, B:23:0x0056, B:24:0x0059, B:26:0x005b, B:27:0x0060, B:60:0x00dd, B:64:0x00e4, B:66:0x00ec, B:71:0x00fd, B:67:0x00f2, B:69:0x00f6, B:62:0x00e1, B:63:0x00e3, B:29:0x0064, B:31:0x006f, B:33:0x0075, B:40:0x0097, B:45:0x00a9, B:59:0x00da, B:44:0x00a0, B:42:0x009c, B:43:0x009f, B:46:0x00ac, B:48:0x00b6, B:50:0x00be, B:51:0x00c6, B:55:0x00ce, B:58:0x00d8, B:35:0x007f, B:37:0x008d, B:39:0x0091), top: B:97:0x0014, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doInBackground(java.lang.Object[] r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iy8.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    public final void onCancelled(Object obj) {
        switch (this.a) {
            case 2:
                ((aip) this.b).g();
                break;
            default:
                super.onCancelled(obj);
                break;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) throws JSONException {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                orb orbVar = (orb) obj;
                uy8 uy8Var = (uy8) obj2;
                if (orbVar != null) {
                    try {
                        int i = orbVar.a.getInt("version");
                        if (i >= 1) {
                            b(orbVar.b("events"), uy8Var.d);
                            c(orbVar.b("report_click"), uy8Var.q);
                            c(orbVar.b("report_imp"), uy8Var.x);
                            c(orbVar.b("ack_imp"), uy8Var.y);
                        }
                        if (i >= 2) {
                            c(orbVar.b("report_stay"), uy8Var.s);
                            c(orbVar.b("report_share"), uy8Var.r);
                        }
                        if (i >= 3) {
                            b(orbVar.b("video_events"), uy8Var.e);
                        }
                        if (i >= 4 && uy8Var.m.isEmpty()) {
                            orb orbVarC = orbVar.c("experiments");
                            Iterator<String> itKeys = orbVarC.a.keys();
                            HashMap map = new HashMap();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                map.put(next, orbVarC.e(next));
                            }
                            uy8Var.m = map;
                        }
                        if (i >= 5) {
                            c(orbVar.b("report_dislike"), uy8Var.z);
                            c(orbVar.b("report_feedback"), uy8Var.A);
                        }
                        if (i >= 6) {
                            a(orbVar.c("request_data"), uy8Var.H);
                        }
                        if (i >= 7) {
                            b(orbVar.b("clip_events"), uy8Var.f);
                        }
                    } catch (JSONException unused) {
                    }
                }
                uy8Var.j = true;
                HashSet hashSet = uy8Var.c;
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    uy8Var.b(((xqe) it.next()).a());
                }
                hashSet.clear();
                if (uy8Var.a != null) {
                    uy8Var.o.c(false);
                    break;
                }
                break;
            case 1:
                ((Callback) obj2).run((Uri) obj);
                break;
            default:
                ((aip) obj2).g();
                break;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        switch (this.a) {
            case 2:
                super.onPreExecute();
                break;
            default:
                super.onPreExecute();
                break;
        }
    }
}
