package org.chromium.components.download;

import J.N;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.FileUtils;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.leanplum.internal.Clock;
import defpackage.ff7;
import defpackage.ir5;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public final class DownloadCollectionBridge {
    public static final ArrayList a = new ArrayList(Arrays.asList("tar.gz", "tar.z", "tar.bz2", "tar.bz", "user.js"));
    public static ir5 b = new ir5();

    public static Uri a(String str, String str2, String str3, String str4) {
        Uri uri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
        b.getClass();
        Objects.requireNonNull(uri);
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        ContentValues contentValues = new ContentValues();
        Objects.requireNonNull(str);
        contentValues.put("_display_name", str);
        Objects.requireNonNull(str2);
        contentValues.put("mime_type", str2);
        contentValues.put("date_added", Long.valueOf(jCurrentTimeMillis));
        contentValues.put("date_modified", Long.valueOf(jCurrentTimeMillis));
        contentValues.put("is_pending", (Integer) 1);
        b.getClass();
        Uri uri2 = Uri.parse(str3);
        Uri uri3 = TextUtils.isEmpty(str4) ? null : Uri.parse(str4);
        if (uri2 == null) {
            contentValues.remove("download_uri");
        } else {
            contentValues.put("download_uri", uri2.toString());
        }
        if (uri3 == null) {
            contentValues.remove("referer_uri");
        } else {
            contentValues.put("referer_uri", uri3.toString());
        }
        contentValues.put("date_expires", Long.valueOf(((N.M7rZ5uJE() * Clock.DAY_MILLIS) + System.currentTimeMillis()) / 1000));
        try {
            return t8.a.getContentResolver().insert(uri, contentValues);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean copyFileToIntermediateUri(String str, String str2) throws IOException {
        try {
            Context context = t8.a;
            Uri uri = Uri.parse(str2);
            Objects.requireNonNull(context);
            Objects.requireNonNull(uri);
            OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uri);
            FileInputStream fileInputStream = new FileInputStream(str);
            FileUtils.copy(fileInputStream, outputStreamOpenOutputStream);
            fileInputStream.close();
            outputStreamOpenOutputStream.close();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String createIntermediateUriForPublish(String str, String str2, String str3, String str4) {
        String strSubstring;
        Uri uriA = a(str, str2, str3, str4);
        if (uriA != null) {
            return uriA.toString();
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HHmmss.SSS", Locale.getDefault());
        ArrayList arrayList = a;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                int iLastIndexOf = str.lastIndexOf(46);
                strSubstring = iLastIndexOf == -1 ? str : str.substring(0, iLastIndexOf);
            } else {
                Object obj = arrayList.get(i);
                i++;
                String str5 = (String) obj;
                if (str.endsWith(str5)) {
                    String strSubstring2 = str.substring(0, str.length() - str5.length());
                    if (strSubstring2.endsWith(".")) {
                        strSubstring = p3p.h(1, 0, strSubstring2);
                        break;
                    }
                }
            }
        }
        String strSubstring3 = str.substring(strSubstring.length());
        StringBuilder sbR = p3p.r(strSubstring, " - ");
        sbR.append(simpleDateFormat.format(new Date()));
        sbR.append(strSubstring3);
        Uri uriA2 = a(sbR.toString(), str2, str3, str4);
        if (uriA2 == null) {
            return null;
        }
        return uriA2.toString();
    }

    public static void deleteIntermediateUri(String str) {
        Context context = t8.a;
        Uri uri = Uri.parse(str);
        Objects.requireNonNull(context);
        Objects.requireNonNull(uri);
        try {
            context.getContentResolver().delete(uri, null, null);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean fileNameExists(java.lang.String r10) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "_id"
            r1 = 0
            android.net.Uri r2 = android.provider.MediaStore.Downloads.EXTERNAL_CONTENT_URI     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L41
            android.content.Context r3 = t8.a     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L41
            android.content.ContentResolver r4 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L41
            android.net.Uri r5 = android.provider.MediaStore.setIncludePending(r2)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L41
            java.lang.String[] r6 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L41
            java.lang.String r7 = "_display_name LIKE ?1"
            java.lang.String[] r8 = new java.lang.String[]{r10}     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L41
            r9 = 0
            android.database.Cursor r10 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L41
            if (r10 != 0) goto L23
            if (r10 == 0) goto L47
            goto L44
        L23:
            boolean r3 = r10.moveToNext()     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L42
            if (r3 == 0) goto L44
            int r0 = r10.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L42
            int r0 = r10.getInt(r0)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L42
            long r3 = (long) r0     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L42
            android.net.Uri r1 = android.content.ContentUris.withAppendedId(r2, r3)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L42
            goto L44
        L37:
            r0 = move-exception
            r1 = r10
            goto L3b
        L3a:
            r0 = move-exception
        L3b:
            if (r1 == 0) goto L40
            r1.close()
        L40:
            throw r0
        L41:
            r10 = r1
        L42:
            if (r10 == 0) goto L47
        L44:
            r10.close()
        L47:
            if (r1 == 0) goto L4b
            r10 = 1
            goto L4c
        L4b:
            r10 = 0
        L4c:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.components.download.DownloadCollectionBridge.fileNameExists(java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0052 A[PHI: r8
      0x0052: PHI (r8v4 android.database.Cursor) = (r8v3 android.database.Cursor), (r8v7 android.database.Cursor) binds: [B:26:0x0050, B:18:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getDisplayName(java.lang.String r8) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "_display_name"
            android.content.Context r1 = t8.a
            android.content.ContentResolver r2 = r1.getContentResolver()
            r1 = 0
            android.net.Uri r8 = android.net.Uri.parse(r8)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4f
            java.lang.String r3 = "media"
            java.lang.String r4 = r8.getAuthority()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4f
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4f
            if (r3 == 0) goto L1d
            android.net.Uri r8 = android.provider.MediaStore.setIncludePending(r8)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4f
        L1d:
            r3 = r8
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4f
            r6 = 0
            r7 = 0
            r5 = 0
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4f
            if (r8 == 0) goto L44
            boolean r2 = r8.moveToNext()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L50
            if (r2 == 0) goto L44
            int r0 = r8.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L50
            r2 = -1
            if (r0 == r2) goto L44
            java.lang.String r0 = r8.getString(r0)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L50
            r8.close()
            return r0
        L40:
            r0 = move-exception
            r1 = r8
        L42:
            r8 = r0
            goto L49
        L44:
            if (r8 == 0) goto L55
            goto L52
        L47:
            r0 = move-exception
            goto L42
        L49:
            if (r1 == 0) goto L4e
            r1.close()
        L4e:
            throw r8
        L4f:
            r8 = r1
        L50:
            if (r8 == 0) goto L55
        L52:
            r8.close()
        L55:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.components.download.DownloadCollectionBridge.getDisplayName(java.lang.String):java.lang.String");
    }

    public static int openIntermediateUri(String str) throws FileNotFoundException {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = t8.a.getContentResolver().openFileDescriptor(Uri.parse(str), "rw");
            ContentValues contentValues = new ContentValues();
            contentValues.put("date_expires", Long.valueOf(((N.M7rZ5uJE() * Clock.DAY_MILLIS) + System.currentTimeMillis()) / 1000));
            t8.a.getContentResolver().update(Uri.parse(str), contentValues, null, null);
            return parcelFileDescriptorOpenFileDescriptor.detachFd();
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String publishDownload(java.lang.String r8) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "mime_type"
            android.content.Context r1 = t8.a
            android.content.ContentResolver r2 = r1.getContentResolver()
            r1 = 0
            android.net.Uri r3 = android.net.Uri.parse(r8)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L42
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L42
            r6 = 0
            r7 = 0
            r5 = 0
            android.database.Cursor r3 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L42
            if (r3 == 0) goto L33
            int r4 = r3.getCount()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L43
            if (r4 == 0) goto L33
            boolean r4 = r3.moveToNext()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L43
            if (r4 == 0) goto L33
            int r4 = r3.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L43
            java.lang.String r4 = r3.getString(r4)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L43
            goto L34
        L2f:
            r0 = move-exception
            r8 = r0
            r1 = r3
            goto L3c
        L33:
            r4 = r1
        L34:
            if (r3 == 0) goto L49
            r3.close()
            goto L49
        L3a:
            r0 = move-exception
            r8 = r0
        L3c:
            if (r1 == 0) goto L41
            r1.close()
        L41:
            throw r8
        L42:
            r3 = r1
        L43:
            if (r3 == 0) goto L48
            r3.close()
        L48:
            r4 = r1
        L49:
            android.content.Context r3 = t8.a
            android.net.Uri r8 = android.net.Uri.parse(r8)
            java.util.Objects.requireNonNull(r3)
            java.util.Objects.requireNonNull(r8)
            android.content.ContentValues r5 = new android.content.ContentValues
            r5.<init>()
            java.lang.String r6 = "is_pending"
            r7 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r5.put(r6, r7)
            java.lang.String r6 = "date_expires"
            r5.putNull(r6)
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: java.lang.Exception -> L70
            r3.update(r8, r5, r1, r1)     // Catch: java.lang.Exception -> L70
        L70:
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 != 0) goto L81
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch: java.lang.Exception -> L81
            r3.<init>()     // Catch: java.lang.Exception -> L81
            r3.put(r0, r4)     // Catch: java.lang.Exception -> L81
            r2.update(r8, r3, r1, r1)     // Catch: java.lang.Exception -> L81
        L81:
            java.lang.String r8 = r8.toString()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.components.download.DownloadCollectionBridge.publishDownload(java.lang.String):java.lang.String");
    }

    public static boolean renameDownloadUri(String str, String str2) {
        ContentValues contentValues = new ContentValues();
        Uri uri = Uri.parse(str);
        contentValues.put("_display_name", str2);
        return t8.a.getContentResolver().update(uri, contentValues, null, null) == 1;
    }

    public static boolean shouldPublishDownload(String str) {
        if (str == null) {
            return false;
        }
        b.getClass();
        return !(r0 instanceof ff7);
    }
}
