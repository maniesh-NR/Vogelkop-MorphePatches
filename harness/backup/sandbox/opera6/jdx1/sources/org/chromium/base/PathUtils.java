package org.chromium.base;

import android.net.Uri;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.provider.MediaStore;
import android.text.TextUtils;
import defpackage.t8;
import defpackage.tgk;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class PathUtils {
    public static final AtomicBoolean a = new AtomicBoolean();
    public static FutureTask b;
    public static String c;

    public static String a(int i) {
        if (!b.isDone()) {
            tgk tgkVarM = tgk.m();
            try {
                b.run();
                tgkVarM.close();
            } catch (Throwable th) {
                try {
                    tgkVarM.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return ((String[]) b.get())[i];
    }

    public static String[] b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (file != null && !TextUtils.isEmpty(file.getAbsolutePath())) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String[] getAllPrivateDownloadsDirectories() {
        List arrayList = new ArrayList();
        tgk tgkVarM = tgk.m();
        try {
            File[] externalFilesDirs = t8.a.getExternalFilesDirs(Environment.DIRECTORY_DOWNLOADS);
            if (externalFilesDirs != null) {
                arrayList = Arrays.asList(externalFilesDirs);
            }
            tgkVarM.close();
            return b(arrayList);
        } catch (Throwable th) {
            try {
                tgkVarM.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String getCacheDirectory() {
        return a(2);
    }

    public static long getCacheQuotaBytes() {
        try {
            StorageManager storageManager = (StorageManager) t8.a.getSystemService(StorageManager.class);
            return storageManager.getCacheQuotaBytes(storageManager.getUuidForPath(new File(a(2))));
        } catch (Exception unused) {
            return -1L;
        }
    }

    public static String getDataDirectory() {
        return a(0);
    }

    public static String getDownloadsDirectory() {
        tgk tgkVarL = tgk.l();
        try {
            String[] allPrivateDownloadsDirectories = getAllPrivateDownloadsDirectories();
            String str = allPrivateDownloadsDirectories.length == 0 ? "" : allPrivateDownloadsDirectories[0];
            tgkVarL.close();
            return str;
        } catch (Throwable th) {
            try {
                tgkVarL.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String[] getExternalDownloadVolumesNames() {
        ArrayList arrayList = new ArrayList();
        for (String str : MediaStore.getExternalVolumeNames(t8.a)) {
            if (!TextUtils.isEmpty(str) && !str.contains("external_primary")) {
                StorageManager storageManager = (StorageManager) t8.a.getSystemService(StorageManager.class);
                Uri contentUri = MediaStore.Files.getContentUri(str);
                try {
                    File directory = storageManager.getStorageVolume(contentUri).getDirectory();
                    File file = new File(directory, Environment.DIRECTORY_DOWNLOADS);
                    if (!file.isDirectory()) {
                        String absolutePath = file.getAbsolutePath();
                        String absolutePath2 = directory.getAbsolutePath();
                        directory.isDirectory();
                        Locale locale = Locale.US;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Download dir missing: ");
                        sb.append(absolutePath);
                        sb.append(", parent dir:");
                        sb.append(absolutePath2);
                        sb.append(", isDirectory:");
                    }
                    arrayList.add(file);
                } catch (Exception unused) {
                    String.valueOf(contentUri);
                }
            }
        }
        return b(arrayList);
    }

    public static String getExternalStorageDirectory() {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    public static String getThumbnailCacheDirectory() {
        return a(1);
    }
}
