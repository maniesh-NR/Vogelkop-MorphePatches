package defpackage;

import J.N;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.os.StatFs;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.opera.android.OperaApplication;
import com.opera.android.downloads.DownloadItem;
import com.opera.android.downloads.DownloadProvider;
import com.opera.android.settings.SettingsManager;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class rf7 {
    public volatile boolean d;
    public final b59 h;
    public final j4c i;
    public nc0 j;
    public boolean k;
    public final bf7 a = new bf7(this, 2);
    public final h7f b = new h7f();
    public final ArrayList c = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final WeakHashMap f = new WeakHashMap();
    public final nrl g = new nrl((byte) 26);

    public rf7(Context context) {
        this.h = w1h.l(context, vml.d, "download-items", new bg1[0]);
        String[] strArr = OperaApplication.K;
        this.i = ((OperaApplication) context.getApplicationContext()).r.P0;
    }

    public static o29 g(re7 re7Var) {
        return c5o.m().o(re7Var.f(), h(re7Var));
    }

    public static String h(re7 re7Var) {
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(new File(re7Var.f())).toString()));
        return mimeTypeFromExtension == null ? re7Var.m : mimeTypeFromExtension;
    }

    public static String i(Uri uri) {
        return uri == null ? "null" : "file".equals(uri.getScheme()) ? j(new File(uri.getPath())) : uri.toString();
    }

    public static String j(File file) {
        try {
            return file.getCanonicalPath();
        } catch (IOException unused) {
            return "absolute: " + file.getAbsolutePath();
        }
    }

    public static HashMap k(ContentResolver contentResolver, Uri uri) {
        HashMap map = new HashMap();
        if (!uri.getScheme().equals("file")) {
            String treeDocumentId = DocumentsContract.getTreeDocumentId(uri);
            try {
                Cursor cursorQuery = contentResolver.query(DocumentsContract.buildChildDocumentsUriUsingTree(DocumentsContract.buildDocumentUriUsingTree(uri, treeDocumentId), treeDocumentId), new String[]{"document_id", "_display_name", "_size"}, null, null, null);
                try {
                    int columnIndex = cursorQuery.getColumnIndex("document_id");
                    int columnIndex2 = cursorQuery.getColumnIndex("_display_name");
                    int columnIndex3 = cursorQuery.getColumnIndex("_size");
                    if (cursorQuery.moveToFirst()) {
                        do {
                            if (cursorQuery.isNull(columnIndex3) || cursorQuery.getLong(columnIndex3) > 0) {
                                map.put(cursorQuery.getString(columnIndex2), cursorQuery.getString(columnIndex));
                            }
                        } while (cursorQuery.moveToNext());
                    }
                    cursorQuery.close();
                    return map;
                } finally {
                }
            } catch (Exception unused) {
            }
        }
        return map;
    }

    public static boolean m(Context context, dd7 dd7Var, o29 o29Var, String str, boolean z) {
        if (z && !dd7Var.d()) {
            return false;
        }
        if (o29Var == o29.HTML || o29Var.d()) {
            return true;
        }
        Uri uriI = dd7Var.i();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(268435456);
        if ("file".equals(uriI.getScheme())) {
            String[] strArr = aik.a;
            uriI = DownloadProvider.b(context, uriI, str == null ? "" : str);
        }
        intent.setDataAndType(uriI, str);
        intent.addFlags(1);
        return !r9n.I(context, intent, 0L).isEmpty();
    }

    public static boolean n(Context context, re7 re7Var, boolean z) {
        dd7 dd7VarE = re7Var.e();
        if (dd7VarE == null) {
            dd7VarE = dd7.e(context, v61.a(new File(re7Var.f())));
        }
        String strH = h(re7Var);
        try {
            return m(context, dd7VarE, c5o.m().o(re7Var.f(), strH), strH, z);
        } catch (IllegalArgumentException e) {
            HashMap map = new HashMap();
            map.put("download_dir_env", j(s29.c()));
            map.put("download_dir_primary", j(Environment.getExternalStorageDirectory()));
            map.put("download_dir_transient", j(s29.e(context)));
            String[] strArr = OperaApplication.K;
            map.put("download_dir_default", i(((OperaApplication) context.getApplicationContext()).J().m()));
            map.put("download_location", i(re7Var.d));
            Uri uriG = re7Var.g();
            if (uriG != null) {
                String strF = re7Var.f();
                String string = uriG.toString();
                if (string.endsWith(strF)) {
                    uriG = Uri.parse(string.substring(0, string.length() - strF.length()));
                }
            }
            map.put("download_resolved", i(uriG));
            map.put("download_mime", strH);
            ks3.E(e, map);
            return false;
        }
    }

    public final re7 a(xf7 xf7Var, DownloadItem downloadItem, Uri uri, int i, int i2, boolean z) {
        int iN;
        if (this.d) {
            t40.e();
            return null;
        }
        if (!this.f.containsKey(xf7Var)) {
            pf7 pf7Var = new pf7(this, xf7Var);
            this.f.put(xf7Var, pf7Var);
            xf7Var.b.b.b(pf7Var);
        }
        if (!z && i == 0 && (iN = ((SettingsManager) this.i.get()).n("concurrent_downloads")) > 0) {
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            int i3 = 0;
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                if (((re7) obj).j()) {
                    i3++;
                }
            }
            if (i3 >= iN) {
                N.MUhg9A8g(xf7Var.b.a, downloadItem.getId(), 3);
            }
        }
        re7 re7Var = new re7(xf7Var, downloadItem, uri, i, i2);
        if (z) {
            Uri uriG = re7Var.g();
            if (uriG != null) {
                HashSet hashSet = s29.a;
                if ("file".equals(uriG.getScheme())) {
                    File parentFile = new File(uriG.getPath()).getParentFile();
                    if (re7Var.h().equals(parentFile) || xf7Var.d.b.getCacheDir().equals(parentFile)) {
                        this.e.add(re7Var);
                        return re7Var;
                    }
                }
            }
            if (!re7Var.s) {
                re7Var.s = true;
            }
            re7Var.w();
        } else {
            this.j = re7Var.c();
            ((SharedPreferences) this.h.get()).edit().putInt("last_downloaded_file_type", this.j.a).apply();
        }
        this.c.add(0, re7Var);
        re7Var.u.b(this.a);
        h7f h7fVar = this.b;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((qf7) g7fVarH.next()).f(re7Var);
        }
        return re7Var;
    }

    public final void b(qf7 qf7Var) {
        this.b.b(qf7Var);
    }

    public final void c(re7 re7Var, vwh vwhVar) {
        if (this.c.contains(re7Var)) {
            re7Var.r();
            dd7 dd7VarE = re7Var.e();
            if (dd7VarE != null && !dd7VarE.c() && vwhVar != null) {
                vwhVar.f(new glj(2132018606, 5000));
            }
            t(re7Var);
            h7f h7fVar = this.b;
            g7f g7fVarH = am2.h(h7fVar, h7fVar);
            while (g7fVarH.hasNext()) {
                ((qf7) g7fVarH.next()).d(re7Var);
            }
        }
    }

    public final re7 d(long j) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            re7 re7Var = (re7) obj;
            if (re7Var.o == j) {
                return re7Var;
            }
        }
        return null;
    }

    public final re7 e(Uri uri, int i) {
        while (true) {
            ArrayList arrayList = this.c;
            if (i >= arrayList.size()) {
                return null;
            }
            re7 re7Var = (re7) arrayList.get(i);
            if (uri.equals(re7Var.g())) {
                return re7Var;
            }
            i++;
        }
    }

    public final long f(re7 re7Var, String str) {
        Uri uri;
        try {
            StatFs statFs = new StatFs(str);
            long blockSizeLong = statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
            long jMtKdjaqG = N.MtKdjaqG(str);
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                re7 re7Var2 = (re7) obj;
                if (re7Var2.m() && re7Var2.i() && re7Var2 != re7Var && (uri = re7Var2.d) != null && !TextUtils.isEmpty(uri.getPath()) && jMtKdjaqG == N.MtKdjaqG(uri.getPath())) {
                    blockSizeLong -= Math.max(0L, re7Var2.j - re7Var2.i);
                }
            }
            return blockSizeLong;
        } catch (IllegalArgumentException unused) {
            return -1L;
        }
    }

    public final List l() {
        ArrayList arrayList = this.c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            re7 re7Var = (re7) obj;
            if (re7Var.p() && re7Var.m()) {
                arrayList2.add(re7Var);
            }
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public final boolean o(Context context, re7 re7Var, Uri uri, o29 o29Var, String str, boolean z) {
        boolean z2 = true;
        if (!o29Var.d() || z) {
            int iOrdinal = o29Var.ordinal();
            if ((iOrdinal == 6 || iOrdinal == 7 || iOrdinal == 11) && !z) {
                xgf xgfVar = new xgf(uri.toString());
                xgfVar.n = true;
                zi4.u(context, xgfVar);
            } else {
                try {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setFlags(268435456);
                    if ("file".equals(uri.getScheme())) {
                        String[] strArr = aik.a;
                        uri = DownloadProvider.b(context, uri, str == null ? "" : str);
                    }
                    intent.setDataAndType(uri, str);
                    intent.addFlags(1);
                    if (z) {
                        intent = Intent.createChooser(intent, context.getString(2132018717));
                    }
                    context.startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                    z2 = false;
                }
            }
        } else {
            zhj.a(new gld(), 4099).c(context);
            egd egdVar = re7Var != null ? new egd(re7Var) : new egd(uri);
            String[] strArr2 = OperaApplication.K;
            tjg tjgVarX = ((OperaApplication) context.getApplicationContext()).x();
            tjgVarX.e(new egd[]{egdVar}, new kjg(tjgVarX, (byte) 2));
        }
        if (z2 && re7Var != null) {
            h7f h7fVar = this.b;
            g7f g7fVarH = am2.h(h7fVar, h7fVar);
            while (g7fVarH.hasNext()) {
                ((qf7) g7fVarH.next()).e(re7Var);
            }
        }
        return z2;
    }

    public final void p(re7 re7Var, Context context, vwh vwhVar, boolean z) {
        boolean zO;
        Uri uriG = re7Var.g();
        if (uriG == null || !n(context, re7Var, true)) {
            zO = false;
        } else {
            String strH = h(re7Var);
            zO = o(context, re7Var, uriG, c5o.m().o(re7Var.f(), strH), strH, z);
        }
        if (zO) {
            return;
        }
        vwhVar.f(new glj(2132018630, 2500));
    }

    public final boolean q(Context context, vwh vwhVar, Uri uri, String str, boolean z) {
        dd7 bkhVar = "file".equals(uri.getScheme()) ? new bkh(new File(uri.getPath())) : dd7.e(context, uri);
        o29 o29VarO = c5o.m().o(bkhVar.g(), str);
        boolean zO = m(context, bkhVar, o29VarO, str, true) ? o(context, null, uri, o29VarO, str, z) : false;
        if (!zO) {
            vwhVar.f(new glj(2132018630, 2500));
        }
        return zO;
    }

    public final void r() {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            re7 re7Var = (re7) obj;
            if (re7Var.m() || re7Var.w) {
                re7Var.s();
            }
        }
    }

    public final void s(re7 re7Var) {
        if (this.c.contains(re7Var)) {
            re7Var.r();
            t(re7Var);
            h7f h7fVar = this.b;
            g7f g7fVarH = am2.h(h7fVar, h7fVar);
            while (g7fVarH.hasNext()) {
                ((qf7) g7fVarH.next()).h(re7Var);
            }
        }
    }

    public final void t(re7 re7Var) {
        if (this.d) {
            t40.e();
            return;
        }
        this.c.remove(re7Var);
        re7Var.t(this.a);
        if (!re7Var.j() || this.k) {
            return;
        }
        this.k = true;
        vml.c(new of7(this, (byte) 0));
    }

    public final void u(qf7 qf7Var) {
        this.b.c(qf7Var);
    }

    public final void v() {
        if (this.d) {
            qp2.n("nested processing");
        } else {
            this.d = true;
        }
    }

    public final void w() {
        if (this.d) {
            this.d = false;
        } else {
            qp2.n("no processing");
        }
    }
}
