package org.chromium.base;

import J.N;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import defpackage.dd7;
import defpackage.rlj;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class ContentUriUtils {
    public static Uri a(String str, String str2, String str3, String str4) {
        ContentResolver contentResolver = t8.a.getContentResolver();
        String[] strArr = {"_display_name", "document_id"};
        Uri uriBuildTreeDocumentUri = DocumentsContract.buildTreeDocumentUri(str, str2);
        Uri uriBuildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uriBuildTreeDocumentUri, str3);
        try {
            Cursor cursorQuery = contentResolver.query(uriBuildChildDocumentsUriUsingTree, strArr, "_display_name = ?", new String[]{str4}, null);
            while (cursorQuery.moveToNext()) {
                try {
                    if (!cursorQuery.isNull(0) && !cursorQuery.isNull(1) && str4.equals(cursorQuery.getString(0))) {
                        Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(uriBuildTreeDocumentUri, cursorQuery.getString(1));
                        cursorQuery.close();
                        return uriBuildDocumentUriUsingTree;
                    }
                } finally {
                }
            }
            cursorQuery.close();
            return null;
        } catch (Exception unused) {
            String.format(Locale.US, "Failed to find child %s, query=%s ", str4, uriBuildChildDocumentsUriUsingTree);
            return null;
        }
    }

    public static AssetFileDescriptor b(String str, String str2) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        if ("w".equals(str2)) {
            return null;
        }
        ContentResolver contentResolver = t8.a.getContentResolver();
        Uri uri = Uri.parse(str);
        try {
            if (f(uri)) {
                String[] streamTypes = contentResolver.getStreamTypes(uri, "*/*");
                assetFileDescriptorOpenAssetFileDescriptor = (streamTypes == null || streamTypes.length <= 0) ? null : contentResolver.openTypedAssetFileDescriptor(uri, streamTypes[0], null);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, str2);
            }
            if (assetFileDescriptorOpenAssetFileDescriptor == null || assetFileDescriptorOpenAssetFileDescriptor.getStartOffset() == 0) {
                return assetFileDescriptorOpenAssetFileDescriptor;
            }
            joh.j(assetFileDescriptorOpenAssetFileDescriptor);
            throw new SecurityException("Cannot open files with non-zero offset type.");
        } catch (Exception unused) {
            Locale locale = Locale.US;
            return null;
        }
    }

    public static String buildDocumentUriUsingTree(String str, String str2) {
        try {
            return DocumentsContract.buildDocumentUriUsingTree(Uri.parse(str), Uri.decode(str2)).toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String c(Context context, Uri uri) {
        String[] streamTypes;
        String extensionFromMimeType;
        if (uri != null) {
            if (DocumentsContract.isTreeUri(uri) && !DocumentsContract.isDocumentUri(context, uri)) {
                try {
                    uri = dd7.f(context, uri).c;
                } catch (Exception unused) {
                }
            }
            Uri uri2 = uri;
            ContentResolver contentResolver = context.getContentResolver();
            try {
                Cursor cursorQuery = contentResolver.query(uri2, null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.getCount() >= 1) {
                            cursorQuery.moveToFirst();
                            int columnIndex = cursorQuery.getColumnIndex("_display_name");
                            if (columnIndex != -1) {
                                String string = cursorQuery.getString(columnIndex);
                                int columnIndex2 = cursorQuery.getColumnIndex("flags");
                                if ((columnIndex2 > -1 && (cursorQuery.getLong(columnIndex2) & 512) != 0) && (streamTypes = contentResolver.getStreamTypes(uri2, "*/*")) != null && streamTypes.length > 0 && (extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(streamTypes[0])) != null) {
                                    string = string + "." + extensionFromMimeType;
                                }
                                cursorQuery.close();
                                return string;
                            }
                        }
                        cursorQuery.close();
                    } finally {
                    }
                }
            } catch (RuntimeException unused2) {
                String.format(Locale.US, "Cannot get display name for %s", uri2);
                return "";
            }
        }
        return "";
    }

    public static void close(ParcelFileDescriptor parcelFileDescriptor) {
        joh.j(parcelFileDescriptor);
    }

    public static boolean contentUriExists(String str) throws IOException {
        AssetFileDescriptor assetFileDescriptorB = b(str, "r");
        if (assetFileDescriptorB != null) {
            try {
                assetFileDescriptorB.close();
            } catch (IOException unused) {
            }
            return true;
        }
        if (assetFileDescriptorB != null) {
            try {
                assetFileDescriptorB.close();
            } catch (IOException unused2) {
            }
        }
        try {
            return dd7.f(t8.a, Uri.parse(str)).d();
        } catch (Exception unused3) {
            return false;
        }
    }

    public static boolean d(Uri uri) {
        if (uri == null) {
            return false;
        }
        if (!"content".equals(uri.getScheme())) {
            return true;
        }
        try {
            Cursor cursorQuery = t8.a.getContentResolver().query(uri, null, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        boolean z = (cursorQuery.getColumnIndex("_display_name") == -1 || cursorQuery.getColumnIndex("_size") == -1) ? false : true;
                        cursorQuery.close();
                        return z;
                    }
                    cursorQuery.close();
                } finally {
                }
            }
        } catch (Exception unused) {
            String.format(Locale.US, "Failed to query Openable columns for URI: %s", uri);
        }
        return false;
    }

    public static boolean delete(String str) {
        Uri uri = Uri.parse(str);
        ContentResolver contentResolver = t8.a.getContentResolver();
        try {
            if (DocumentsContract.deleteDocument(contentResolver, uri)) {
                return true;
            }
        } catch (Exception e) {
            e.getMessage();
            Locale locale = Locale.US;
        }
        try {
            return contentResolver.delete(uri, null, null) > 0;
        } catch (Exception e2) {
            e2.getMessage();
            Locale locale2 = Locale.US;
            return false;
        }
    }

    public static boolean e(Context context, Uri uri) {
        ApplicationInfo applicationInfo;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            return false;
        }
        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(authority.substring(authority.lastIndexOf(64) + 1), 0);
        return (providerInfoResolveContentProvider == null || (applicationInfo = providerInfoResolveContentProvider.applicationInfo) == null || applicationInfo.uid != Process.myUid()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean f(android.net.Uri r8) {
        /*
            r1 = 0
            if (r8 == 0) goto L53
            android.content.Context r0 = t8.a
            boolean r0 = android.provider.DocumentsContract.isDocumentUri(r0, r8)
            if (r0 == 0) goto L53
            android.content.Context r0 = t8.a
            android.content.ContentResolver r2 = r0.getContentResolver()
            r6 = 0
            r7 = 0
            r4 = 0
            r5 = 0
            r3 = r8
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.NullPointerException -> L53
            if (r8 == 0) goto L53
            int r0 = r8.getCount()     // Catch: java.lang.Throwable -> L47
            r2 = 1
            if (r0 < r2) goto L43
            r8.moveToFirst()     // Catch: java.lang.Throwable -> L47
            java.lang.String r0 = "flags"
            int r0 = r8.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L47
            r3 = -1
            if (r0 <= r3) goto L3c
            long r3 = r8.getLong(r0)     // Catch: java.lang.Throwable -> L47
            r5 = 512(0x200, double:2.53E-321)
            long r3 = r3 & r5
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L3d
        L3c:
            r2 = r1
        L3d:
            r8.close()     // Catch: java.lang.NullPointerException -> L53
            return r2
        L41:
            r2 = r0
            goto L49
        L43:
            r8.close()     // Catch: java.lang.NullPointerException -> L53
            return r1
        L47:
            r0 = move-exception
            goto L41
        L49:
            r8.close()     // Catch: java.lang.Throwable -> L4d
            goto L52
        L4d:
            r0 = move-exception
            r8 = r0
            r2.addSuppressed(r8)     // Catch: java.lang.NullPointerException -> L53
        L52:
            throw r2     // Catch: java.lang.NullPointerException -> L53
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.ContentUriUtils.f(android.net.Uri):boolean");
    }

    public static void g(int i, long j, String str, boolean z) throws FileNotFoundException {
        Uri uriBuildChildDocumentsUriUsingTree;
        Uri uri;
        String string;
        String[] strArr = {"document_id", "_display_name", "mime_type", "_size", "last_modified"};
        Uri uri2 = Uri.parse(str);
        try {
            rlj rljVarF = dd7.f(t8.a, uri2);
            uriBuildChildDocumentsUriUsingTree = z ? DocumentsContract.buildChildDocumentsUriUsingTree(rljVarF.c, DocumentsContract.getDocumentId(rljVarF.c)) : rljVarF.c;
        } catch (Exception unused) {
            uriBuildChildDocumentsUriUsingTree = null;
        }
        if (uriBuildChildDocumentsUriUsingTree != null) {
            uri = uriBuildChildDocumentsUriUsingTree;
        } else {
            if (z) {
                return;
            }
            if (!DocumentsContract.isDocumentUri(t8.a, uri2)) {
                AssetFileDescriptor assetFileDescriptorB = b(str, "r");
                if (assetFileDescriptorB != null) {
                    N.MiiPNW$z(j, str, (Object) null, false, assetFileDescriptorB.getLength(), 0L);
                    joh.j(assetFileDescriptorB);
                    return;
                }
                return;
            }
            uri = uri2;
        }
        try {
            Cursor cursorQuery = t8.a.getContentResolver().query(uri, strArr, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    if (z) {
                        string = cursorQuery.isNull(0) ? null : DocumentsContract.buildDocumentUriUsingTree(uri, cursorQuery.getString(0)).toString();
                    } else {
                        string = str;
                    }
                    String string2 = cursorQuery.isNull(1) ? null : cursorQuery.getString(1);
                    boolean z2 = !cursorQuery.isNull(2) && "vnd.android.document/directory".equals(cursorQuery.getString(2));
                    long j2 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                    long j3 = cursorQuery.isNull(4) ? 0L : cursorQuery.getLong(4);
                    if ((i & 1) != 0 || z2) {
                        if ((i & 2) != 0 || !z2) {
                            N.MiiPNW$z(j, string, string2, z2, j2, j3);
                        }
                    }
                } finally {
                }
            }
            cursorQuery.close();
        } catch (Exception unused2) {
        }
    }

    public static String getChildDocumentOrQuery(String str, String str2, String str3, boolean z, boolean z2) {
        String documentId;
        if (z) {
            str3 = "vnd.android.document/directory";
        } else if (str3.isEmpty()) {
            str3 = "application/octet-string";
        }
        try {
            Uri uri = Uri.parse(str);
            String treeDocumentId = DocumentsContract.getTreeDocumentId(uri);
            try {
                documentId = DocumentsContract.getDocumentId(uri);
            } catch (Exception unused) {
                documentId = treeDocumentId;
            }
            Uri uriA = a(uri.getAuthority(), treeDocumentId, documentId, str2);
            if (uriA != null) {
                return uriA.toString();
            }
            if (z2) {
                return new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).appendPath("create-child-document").appendPath("tree").appendPath(treeDocumentId).appendPath("document").appendPath(documentId).appendPath("mime-type").appendPath(str3).appendPath("display-name").appendPath(str2).build().toString();
            }
            return null;
        } catch (Exception unused2) {
            return null;
        }
    }

    public static String getDocumentFromQuery(String str, boolean z) {
        if (!isCreateChildDocumentQuery(str)) {
            return null;
        }
        Uri uri = Uri.parse(str);
        List<String> pathSegments = uri.getPathSegments();
        String str2 = pathSegments.get(2);
        String str3 = pathSegments.get(4);
        String str4 = pathSegments.get(6);
        String str5 = pathSegments.get(8);
        ContentResolver contentResolver = t8.a.getContentResolver();
        Uri uriA = a(uri.getAuthority(), str2, str3, str5);
        if (uriA != null) {
            return uriA.toString();
        }
        if (z) {
            try {
                return DocumentsContract.createDocument(contentResolver, DocumentsContract.buildDocumentUriUsingTree(DocumentsContract.buildTreeDocumentUri(uri.getAuthority(), str2), str3), str4, str5).toString();
            } catch (Exception e) {
                e.getMessage();
                Locale locale = Locale.US;
            }
        }
        return null;
    }

    public static int getFd(ParcelFileDescriptor parcelFileDescriptor) {
        return parcelFileDescriptor.getFd();
    }

    public static void getFileInfo(String str, long j) throws FileNotFoundException {
        g(3, j, str, false);
    }

    public static String getMimeType(String str) {
        ContentResolver contentResolver = t8.a.getContentResolver();
        Uri uri = Uri.parse(str);
        if (!f(uri)) {
            return contentResolver.getType(uri);
        }
        String[] streamTypes = contentResolver.getStreamTypes(uri, "*/*");
        if (streamTypes == null || streamTypes.length <= 0) {
            return null;
        }
        return streamTypes[0];
    }

    public static String h(Uri uri, String str) throws IOException {
        ContentResolver contentResolver = t8.a.getContentResolver();
        String[] streamTypes = contentResolver.getStreamTypes(uri, str);
        if (streamTypes != null && streamTypes.length != 0 && str.equals(streamTypes[0])) {
            try {
                AssetFileDescriptor assetFileDescriptorOpenTypedAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uri, streamTypes[0], null);
                if (assetFileDescriptorOpenTypedAssetFileDescriptor != null) {
                    try {
                        FileInputStream fileInputStreamCreateInputStream = assetFileDescriptorOpenTypedAssetFileDescriptor.createInputStream();
                        try {
                            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStreamCreateInputStream, StandardCharsets.UTF_8);
                            try {
                                StringBuilder sb = new StringBuilder();
                                char[] cArr = new char[8192];
                                while (true) {
                                    int i = inputStreamReader.read(cArr);
                                    if (i <= 0) {
                                        break;
                                    }
                                    sb.append(cArr, 0, i);
                                }
                                String string = sb.toString();
                                inputStreamReader.close();
                                if (fileInputStreamCreateInputStream != null) {
                                    fileInputStreamCreateInputStream.close();
                                }
                                assetFileDescriptorOpenTypedAssetFileDescriptor.close();
                                return string;
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                }
                if (assetFileDescriptorOpenTypedAssetFileDescriptor != null) {
                    assetFileDescriptorOpenTypedAssetFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static boolean isCreateChildDocumentQuery(String str) {
        List<String> pathSegments = Uri.parse(str).getPathSegments();
        return pathSegments.size() == 9 && "create-child-document".equals(pathSegments.get(0)) && "tree".equals(pathSegments.get(1)) && "document".equals(pathSegments.get(3)) && "mime-type".equals(pathSegments.get(5)) && "display-name".equals(pathSegments.get(7));
    }

    public static boolean isDocumentUri(String str) {
        return DocumentsContract.isDocumentUri(t8.a, Uri.parse(str));
    }

    public static boolean isUriFromThisApp(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return e(t8.a, Uri.parse(str));
        } catch (Exception unused) {
            return false;
        }
    }

    public static void listDirectory(String str, int i, long j) throws FileNotFoundException {
        g(i, j, str, true);
    }

    public static String maybeGetDisplayName(String str) {
        try {
            String strC = c(t8.a, Uri.parse(str));
            if (TextUtils.isEmpty(strC)) {
                return null;
            }
            return strC;
        } catch (Exception unused) {
            Locale locale = Locale.US;
            return null;
        }
    }

    public static ParcelFileDescriptor openContentUri(String str, String str2) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorB = b(str, str2);
        if (assetFileDescriptorB != null) {
            return assetFileDescriptorB.getParcelFileDescriptor();
        }
        return null;
    }
}
