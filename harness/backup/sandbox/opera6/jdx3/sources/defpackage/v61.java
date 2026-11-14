package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import com.opera.android.OperaApplication;
import java.io.File;
import java.util.Locale;

/* loaded from: classes.dex */
public final class v61 {
    public final Context a;

    public /* synthetic */ v61(Context context) {
        this.a = context;
    }

    public v61(OperaApplication operaApplication) {
        this.a = operaApplication.getApplicationContext();
    }

    public static Uri a(File file) {
        return DocumentsContract.buildTreeDocumentUri("com.android.providers.downloads.documents", "raw:" + file.getAbsolutePath());
    }

    public static String b(Context context, Uri uri) {
        String treeDocumentId;
        String lastPathSegment = uri.getLastPathSegment();
        if (DocumentsContract.isDocumentUri(context, uri)) {
            return aik.b(dd7.e(context, uri).g(), lastPathSegment);
        }
        try {
            treeDocumentId = DocumentsContract.getTreeDocumentId(uri);
        } catch (IllegalArgumentException unused) {
            treeDocumentId = null;
        }
        return treeDocumentId != null ? aik.b(dd7.f(context, uri).g(), lastPathSegment) : lastPathSegment;
    }

    public static String c(File file) {
        return String.format(Locale.US, "%c: %c%c%c", Character.valueOf(file.isDirectory() ? 'd' : file.isFile() ? 'f' : '?'), Character.valueOf(file.canRead() ? 'r' : ' '), Character.valueOf(file.canWrite() ? 'w' : ' '), Character.valueOf(file.isHidden() ? 'h' : ' '));
    }

    public static Uri d(Context context, Uri uri) {
        String treeDocumentId;
        if (!DocumentsContract.isDocumentUri(context, uri)) {
            try {
                treeDocumentId = DocumentsContract.getTreeDocumentId(uri);
            } catch (IllegalArgumentException unused) {
                treeDocumentId = null;
            }
            if (treeDocumentId != null) {
            }
            return null;
        }
        treeDocumentId = DocumentsContract.getDocumentId(uri);
        if ("com.android.providers.downloads.documents".equals(uri.getAuthority())) {
            if (treeDocumentId.startsWith("raw:")) {
                return Uri.fromFile(new File(treeDocumentId.substring(4)));
            }
            return null;
        }
        if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
            int iIndexOf = treeDocumentId.indexOf(58, 1);
            String strSubstring = treeDocumentId.substring(0, iIndexOf);
            String strSubstring2 = treeDocumentId.substring(iIndexOf + 1);
            if ("primary".equals(strSubstring)) {
                return Uri.fromFile(new File(Environment.getExternalStorageDirectory(), strSubstring2));
            }
        }
        return null;
    }
}
