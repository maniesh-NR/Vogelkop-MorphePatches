package com.leanplum.internal;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.leanplum.Leanplum;
import com.leanplum.Var;
import com.leanplum.internal.Constants;
import defpackage.sko;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes.dex */
public class FileManager {
    public static Map<String, String> filenameToURLs = null;
    private static boolean initializing = false;
    static final Object initializingLock = new Object();
    private static boolean isInitialized = false;
    public static Var<HashMap<String, Object>> resources;
    private static ResourceUpdateCallback updateCallback;

    public enum DownloadFileResult {
        NONE,
        EXISTS_IN_ASSETS,
        DOWNLOADING
    }

    static class HashResults {
        final String hash;
        final int size;

        public HashResults(String str, int i) {
            this.hash = str;
            this.size = i;
        }
    }

    interface ResourceUpdateCallback {
        void onResourceSyncFinish();
    }

    private static String appBundlePath() {
        return "";
    }

    private static String bundlePath() {
        return Leanplum.getContext().getDir("Leanplum_Bundle", 0).getAbsolutePath();
    }

    private static List<Pattern> compilePatterns(List<String> list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            try {
                arrayList.add(Pattern.compile(str));
            } catch (PatternSyntaxException unused) {
                Log.e(sko.k("Ignoring malformed resource syncing pattern: \"", str, "\". Patterns must be regular expressions."), new Object[0]);
            }
        }
        return arrayList;
    }

    private static String documentsPath() {
        Context context = Leanplum.getContext();
        if (context != null) {
            return context.getDir("Leanplum_Documents", 0).getAbsolutePath();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void enableResourceSyncing(java.util.List<java.util.regex.Pattern> r12, java.util.List<java.util.regex.Pattern> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.internal.FileManager.enableResourceSyncing(java.util.List, java.util.List):void");
    }

    public static void enableResourceSyncing(List<String> list, List<String> list2, boolean z) {
        initializing = true;
        if (isInitialized) {
            return;
        }
        try {
            final List<Pattern> listCompilePatterns = compilePatterns(list);
            final List<Pattern> listCompilePatterns2 = compilePatterns(list2);
            if (z) {
                OperationQueue.sharedInstance().addParallelOperation(new Runnable() { // from class: com.leanplum.internal.FileManager.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            FileManager.enableResourceSyncing(listCompilePatterns, listCompilePatterns2);
                        } catch (Throwable th) {
                            Log.exception(th);
                        }
                    }
                });
            } else {
                enableResourceSyncing(listCompilePatterns, listCompilePatterns2);
            }
        } catch (Throwable th) {
            Log.exception(th);
        }
    }

    public static boolean fileExistsAtPath(String str) {
        return str != null && new File(str).exists();
    }

    public static HashResults fileMD5HashCreateWithPath(InputStream inputStream) throws Throwable {
        InputStream digestInputStream;
        Throwable th;
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                try {
                    digestInputStream = new DigestInputStream(inputStream, messageDigest);
                    try {
                        byte[] bArr = new byte[8192];
                        int i = 0;
                        while (true) {
                            int i2 = digestInputStream.read(bArr);
                            if (i2 != -1) {
                                i += i2;
                            } else {
                                try {
                                    break;
                                } catch (IOException e) {
                                    Log.d("Failed to close InputStream.", e.getMessage());
                                }
                            }
                        }
                        digestInputStream.close();
                        byte[] bArrDigest = messageDigest.digest();
                        StringBuilder sb = new StringBuilder();
                        for (byte b : bArrDigest) {
                            String hexString = Integer.toHexString(b & 255);
                            if (hexString.length() == 1) {
                                sb.append('0');
                            }
                            sb.append(hexString);
                        }
                        return new HashResults(sb.toString(), i);
                    } catch (Throwable th2) {
                        th = th2;
                        if (digestInputStream != null) {
                            try {
                                digestInputStream.close();
                            } catch (IOException e2) {
                                Log.d("Failed to close InputStream.", e2.getMessage());
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    digestInputStream = inputStream;
                    th = th3;
                }
            } catch (IOException e3) {
                e3.printStackTrace();
                return null;
            }
        } catch (NoSuchAlgorithmException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    private static String fileRelativeTo(String str, String str2) {
        return sko.v(str, "/", str2);
    }

    public static String fileRelativeToAppBundle(String str) {
        if (str == null) {
            return null;
        }
        return fileRelativeTo(appBundlePath(), str);
    }

    public static String fileRelativeToDocuments(String str) {
        if (str == null) {
            return null;
        }
        return fileRelativeTo(documentsPath(), str);
    }

    public static String fileRelativeToLPBundle(String str) {
        if (str == null) {
            return null;
        }
        return fileRelativeTo(bundlePath(), str);
    }

    public static String fileValue(String str) {
        return fileValue(str, str, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        if (r4.booleanValue() != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String fileValue(java.lang.String r2, java.lang.String r3, java.lang.Boolean r4) throws java.io.IOException {
        /*
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L15
            java.lang.String r0 = fileRelativeToAppBundle(r3)
            boolean r1 = fileExistsAtPath(r0)
            if (r1 == 0) goto L15
            return r0
        L15:
            if (r4 != 0) goto L41
            android.content.Context r4 = com.leanplum.Leanplum.getContext()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L48
            android.content.res.AssetManager r4 = r4.getAssets()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L48
            java.io.InputStream r3 = r4.open(r2)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L48
            if (r3 == 0) goto L47
            r3.close()     // Catch: java.lang.Exception -> L29
            return r2
        L29:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to close InputStream: "
            r4.<init>(r0)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.leanplum.internal.Log.d(r3, r4)
            return r2
        L3f:
            r2 = move-exception
            throw r2
        L41:
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L48
        L47:
            return r2
        L48:
            java.lang.String r4 = fileRelativeToLPBundle(r2)
            boolean r0 = fileExistsAtPath(r4)
            if (r0 != 0) goto L7b
            java.lang.String r4 = fileRelativeToDocuments(r2)
            boolean r0 = fileExistsAtPath(r4)
            if (r0 != 0) goto L7b
            java.lang.String r4 = fileRelativeToAppBundle(r2)
            boolean r2 = fileExistsAtPath(r4)
            if (r2 != 0) goto L7b
            java.lang.String r4 = fileRelativeToLPBundle(r3)
            boolean r2 = fileExistsAtPath(r4)
            if (r2 != 0) goto L7b
            java.lang.String r4 = fileRelativeToAppBundle(r3)
            boolean r2 = fileExistsAtPath(r4)
            if (r2 != 0) goto L7b
            return r3
        L7b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.internal.FileManager.fileValue(java.lang.String, java.lang.String, java.lang.Boolean):java.lang.String");
    }

    public static int getFileSize(String str) {
        if (str == null) {
            return -1;
        }
        return (int) new File(str).length();
    }

    public static boolean initializing() {
        return initializing;
    }

    public static boolean isNewerLocally(Map<String, Object> map, Map<String, Object> map2) {
        if (map2 == null) {
            return true;
        }
        String str = (String) map.get(Constants.Keys.HASH);
        String str2 = (String) map2.get(Constants.Keys.HASH);
        Integer num = (Integer) map.get(Constants.Keys.SIZE);
        Integer num2 = (Integer) map2.get(Constants.Keys.SIZE);
        if (num2 != null && (num == null || num.equals(num2))) {
            if (str == null) {
                return false;
            }
            if (str2 != null && str.equals(str2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isResourceSyncingEnabled() {
        return initializing || isInitialized;
    }

    public static DownloadFileResult maybeDownloadFile(boolean z, String str, String str2, String str3, Runnable runnable) {
        if (str != null && !str.equals(str2) && (!z || VarCache.getResIdFromPath(str) == 0)) {
            InputStream inputStreamOpen = null;
            try {
                inputStreamOpen = Leanplum.getContext().getResources().getAssets().open(str);
            } catch (IOException unused) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException e) {
                        Log.d("Failed to close InputStream.", e.getMessage());
                    }
                }
            } catch (Throwable th) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException e2) {
                        Log.d("Failed to close InputStream.", e2.getMessage());
                    }
                }
                throw th;
            }
            if (inputStreamOpen != null) {
                DownloadFileResult downloadFileResult = DownloadFileResult.EXISTS_IN_ASSETS;
                try {
                    inputStreamOpen.close();
                    return downloadFileResult;
                } catch (IOException e3) {
                    Log.d("Failed to close InputStream.", e3.getMessage());
                    return downloadFileResult;
                }
            }
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (IOException e4) {
                    Log.d("Failed to close InputStream.", e4.getMessage());
                }
            }
            if (!fileExistsAtPath(fileRelativeToAppBundle(str)) && !fileExistsAtPath(fileRelativeToDocuments(str))) {
                Map<String, String> map = filenameToURLs;
                if (map != null && map.containsKey(str) && str3 == null) {
                    str3 = filenameToURLs.get(str);
                }
                FileTransferManager.getInstance().downloadFile(str, str3, runnable, runnable);
                return DownloadFileResult.DOWNLOADING;
            }
        }
        return DownloadFileResult.NONE;
    }

    public static void setFilenameToURLs(Map<String, String> map) {
        filenameToURLs = map;
    }

    public static void setResourceSyncFinishBlock(ResourceUpdateCallback resourceUpdateCallback) {
        updateCallback = resourceUpdateCallback;
    }

    public static InputStream stream(boolean z, Boolean bool, Boolean bool2, String str, String str2, byte[] bArr) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Context context = Leanplum.getContext();
            if (z && str.equals(str2) && bArr != null) {
                return new ByteArrayInputStream(bArr);
            }
            if (!z || !str.equals(str2) || bArr != null) {
                if (bool2 == null) {
                    try {
                        return context.getAssets().open(str);
                    } catch (IOException unused) {
                    }
                } else if (bool2.booleanValue() || (bool.booleanValue() && str.equals(str2))) {
                    return context.getAssets().open(str);
                }
                return new FileInputStream(new File(str));
            }
            int iGenerateIdFromResourceName = Util.generateIdFromResourceName(str);
            if (iGenerateIdFromResourceName == 0) {
                return null;
            }
            Resources resources2 = context.getResources();
            return context.getContentResolver().openInputStream(Uri.parse("android.resource://" + resources2.getResourcePackageName(iGenerateIdFromResourceName) + '/' + resources2.getResourceTypeName(iGenerateIdFromResourceName) + '/' + resources2.getResourceEntryName(iGenerateIdFromResourceName)));
        } catch (IOException e) {
            Log.d("Failed to load a stream." + e.getMessage(), new Object[0]);
            return null;
        }
    }
}
