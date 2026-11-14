package com.opera.android.downloads;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.opera.android.Lazy;
import defpackage.g77;
import defpackage.t3p;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class DownloadProvider extends ContentProvider {
    public static final String[] b = {"_display_name", "_size"};
    public static final Object c = new Object();
    public static g77 d;
    public static k32 e;
    public g77 a;

    public static g77 a(Context context, String str) throws IOException {
        if (e == null) {
            k32 k32Var = new k32(context, (byte) 5);
            e = k32Var;
            Lazy.e(k32Var, vml.d);
        }
        k32 k32Var2 = e;
        g77 g77Var = new g77();
        g77Var.b = new HashMap();
        g77Var.a = str;
        g77Var.c = k32Var2;
        g77Var.c(s29.e(context), "transient");
        g77Var.c(s29.c(), "downloads");
        g77Var.c(Environment.getExternalStorageDirectory(), "primary");
        return g77Var;
    }

    public static Uri b(Context context, Uri uri, String str) throws IOException {
        g77 g77VarA;
        if (!"file".equals(uri.getScheme())) {
            qp2.o("Only file URI supported");
            return null;
        }
        String str2 = context.getPackageName() + ".DownloadProvider";
        synchronized (c) {
            g77VarA = d;
            if (g77VarA == null) {
                g77VarA = a(context, str2);
                d = g77VarA;
            }
        }
        File file = new File(uri.getPath());
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : ((HashMap) g77VarA.b).entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (canonicalPath.startsWith(path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry == null) {
                qp2.o(sko.j("Failed to find configured root that contains ", canonicalPath));
                return null;
            }
            String path2 = ((File) entry.getValue()).getPath();
            return new Uri.Builder().scheme("content").authority((String) g77VarA.a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).appendQueryParameter("hash", g77.l(file, (byte[]) ((k32) g77VarA.c).get())).build().buildUpon().appendQueryParameter("mt", str).build();
        } catch (IOException e2) {
            yt7.g("Failed to resolve canonical path for ", file, e2);
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        g77 g77VarA;
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            t3p.u("Provider must not be exported");
            return;
        }
        if (!providerInfo.grantUriPermissions) {
            t3p.u("Provider must grant uri permissions");
            return;
        }
        String str = providerInfo.authority;
        synchronized (c) {
            g77VarA = d;
            if (g77VarA == null) {
                g77VarA = a(context, str);
                d = g77VarA;
            }
        }
        this.a = g77VarA;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) throws IOException {
        this.a.k(uri);
        String queryParameter = uri.getQueryParameter("mt");
        return TextUtils.isEmpty(queryParameter) ? "*/*" : queryParameter;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) throws IOException {
        int i;
        File fileK = this.a.k(uri);
        if ("r".equals(str)) {
            i = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i = 738197504;
        } else if ("wa".equals(str)) {
            i = 704643072;
        } else if ("rw".equals(str)) {
            i = 939524096;
        } else {
            if (!"rwt".equals(str)) {
                qp2.o(sko.k("Bad mode '", str, "'"));
                return null;
            }
            i = 1006632960;
        }
        return ParcelFileDescriptor.open(fileK, i);
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) throws IOException {
        File fileK = this.a.k(uri);
        if (strArr == null) {
            strArr = b;
        }
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(2);
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                arrayList.add("_display_name");
                arrayList2.add(fileK.getName());
            } else if ("_size".equals(str3)) {
                arrayList.add("_size");
                arrayList2.add(Long.valueOf(fileK.length()));
            }
        }
        MatrixCursor matrixCursor = new MatrixCursor((String[]) arrayList.toArray(new String[0]), 1);
        matrixCursor.addRow(arrayList2.toArray(new Object[0]));
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
