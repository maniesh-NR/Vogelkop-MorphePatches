package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.webkit.MimeTypeMap;
import defpackage.p3p;
import defpackage.t19;
import defpackage.t3p;
import defpackage.u19;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class FileProvider extends ContentProvider {
    private static final String ATTR_NAME = "name";
    private static final String ATTR_PATH = "path";
    private static final String DISPLAYNAME_FIELD = "displayName";
    private static final String META_DATA_FILE_PROVIDER_PATHS = "android.support.FILE_PROVIDER_PATHS";
    private static final String TAG_CACHE_PATH = "cache-path";
    private static final String TAG_EXTERNAL = "external-path";
    private static final String TAG_EXTERNAL_CACHE = "external-cache-path";
    private static final String TAG_EXTERNAL_FILES = "external-files-path";
    private static final String TAG_EXTERNAL_MEDIA = "external-media-path";
    private static final String TAG_FILES_PATH = "files-path";
    private static final String TAG_ROOT_PATH = "root-path";
    private String mAuthority;
    private t19 mLocalPathStrategy;
    private final Object mLock;
    private final int mResourceId;
    private static final String[] COLUMNS = {"_display_name", "_size"};
    private static final File DEVICE_ROOT = new File("/");
    private static final HashMap<String, t19> sCache = new HashMap<>();

    public FileProvider() {
        this(0);
    }

    public FileProvider(int i) {
        this.mLock = new Object();
        this.mResourceId = i;
    }

    private static File buildPath(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    private static Object[] copyOf(Object[] objArr, int i) {
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }

    private static String[] copyOf(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    public static XmlResourceParser getFileProviderPathsMetaData(Context context, String str, ProviderInfo providerInfo, int i) {
        if (providerInfo == null) {
            qp2.o(sko.j("Couldn't find meta-data for provider with authority ", str));
            return null;
        }
        if (providerInfo.metaData == null && i != 0) {
            Bundle bundle = new Bundle(1);
            providerInfo.metaData = bundle;
            bundle.putInt(META_DATA_FILE_PROVIDER_PATHS, i);
        }
        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), META_DATA_FILE_PROVIDER_PATHS);
        if (xmlResourceParserLoadXmlMetaData != null) {
            return xmlResourceParserLoadXmlMetaData;
        }
        qp2.o("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        return null;
    }

    private t19 getLocalPathStrategy() {
        t19 pathStrategy;
        synchronized (this.mLock) {
            if (this.mAuthority == null) {
                throw new NullPointerException("mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
            }
            pathStrategy = this.mLocalPathStrategy;
            if (pathStrategy == null) {
                pathStrategy = getPathStrategy(getContext(), this.mAuthority, this.mResourceId);
                this.mLocalPathStrategy = pathStrategy;
            }
        }
        return pathStrategy;
    }

    private static t19 getPathStrategy(Context context, String str, int i) {
        t19 pathStrategy;
        HashMap<String, t19> map = sCache;
        synchronized (map) {
            pathStrategy = map.get(str);
            if (pathStrategy == null) {
                try {
                    try {
                        pathStrategy = parsePathStrategy(context, str, i);
                        map.put(str, pathStrategy);
                    } catch (XmlPullParserException e) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                    }
                } catch (IOException e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                }
            }
        }
        return pathStrategy;
    }

    public static Uri getUriForFile(Context context, String str, File file) throws IOException {
        u19 u19Var = (u19) getPathStrategy(context, str, 0);
        u19Var.getClass();
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : u19Var.b.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (removeTrailingSlash(canonicalPath).startsWith(removeTrailingSlash(path) + '/') && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry == null) {
                qp2.o(sko.j("Failed to find configured root that contains ", canonicalPath));
                return null;
            }
            String path2 = ((File) entry.getValue()).getPath();
            return new Uri.Builder().scheme("content").authority(u19Var.a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
        } catch (IOException unused) {
            s49.l(file, "Failed to resolve canonical path for ");
            return null;
        }
    }

    @SuppressLint({"StreamFiles"})
    public static Uri getUriForFile(Context context, String str, File file, String str2) {
        return getUriForFile(context, str, file).buildUpon().appendQueryParameter(DISPLAYNAME_FIELD, str2).build();
    }

    private static int modeToMode(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        qp2.o(sko.j("Invalid mode: ", str));
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static defpackage.t19 parsePathStrategy(android.content.Context r6, java.lang.String r7, int r8) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            u19 r0 = new u19
            r0.<init>(r7)
            android.content.pm.PackageManager r1 = r6.getPackageManager()
            r2 = 128(0x80, float:1.8E-43)
            android.content.pm.ProviderInfo r1 = r1.resolveContentProvider(r7, r2)
            android.content.res.XmlResourceParser r7 = getFileProviderPathsMetaData(r6, r7, r1, r8)
        L13:
            int r8 = r7.next()
            r1 = 1
            if (r8 == r1) goto Lc0
            r1 = 2
            if (r8 != r1) goto L13
            java.lang.String r8 = r7.getName()
            java.lang.String r1 = "name"
            r2 = 0
            java.lang.String r1 = r7.getAttributeValue(r2, r1)
            java.lang.String r3 = "path"
            java.lang.String r3 = r7.getAttributeValue(r2, r3)
            java.lang.String r4 = "root-path"
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L39
            java.io.File r8 = androidx.core.content.FileProvider.DEVICE_ROOT
            goto L98
        L39:
            java.lang.String r4 = "files-path"
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L46
            java.io.File r8 = r6.getFilesDir()
            goto L98
        L46:
            java.lang.String r4 = "cache-path"
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L53
            java.io.File r8 = r6.getCacheDir()
            goto L98
        L53:
            java.lang.String r4 = "external-path"
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L60
            java.io.File r8 = android.os.Environment.getExternalStorageDirectory()
            goto L98
        L60:
            java.lang.String r4 = "external-files-path"
            boolean r4 = r4.equals(r8)
            r5 = 0
            if (r4 == 0) goto L73
            java.io.File[] r8 = r6.getExternalFilesDirs(r2)
            int r4 = r8.length
            if (r4 <= 0) goto L97
            r8 = r8[r5]
            goto L98
        L73:
            java.lang.String r4 = "external-cache-path"
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L85
            java.io.File[] r8 = r6.getExternalCacheDirs()
            int r4 = r8.length
            if (r4 <= 0) goto L97
            r8 = r8[r5]
            goto L98
        L85:
            java.lang.String r4 = "external-media-path"
            boolean r8 = r4.equals(r8)
            if (r8 == 0) goto L97
            java.io.File[] r8 = r6.getExternalMediaDirs()
            int r4 = r8.length
            if (r4 <= 0) goto L97
            r8 = r8[r5]
            goto L98
        L97:
            r8 = r2
        L98:
            if (r8 == 0) goto L13
            java.lang.String[] r3 = new java.lang.String[]{r3}
            java.io.File r8 = buildPath(r8, r3)
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto Lba
            java.io.File r8 = r8.getCanonicalFile()     // Catch: java.io.IOException -> Lb3
            java.util.HashMap r2 = r0.b
            r2.put(r1, r8)
            goto L13
        Lb3:
            r6 = move-exception
            java.lang.String r7 = "Failed to resolve canonical path for "
            yt7.g(r7, r8, r6)
            return r2
        Lba:
            java.lang.String r6 = "Name must not be empty"
            qp2.o(r6)
            return r2
        Lc0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.FileProvider.parsePathStrategy(android.content.Context, java.lang.String, int):t19");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String removeTrailingSlash(String str) {
        return (str.length() <= 0 || str.charAt(str.length() - 1) != '/') ? str : p3p.h(1, 0, str);
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
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
        if (str == null || str.trim().isEmpty()) {
            t3p.u("Provider must have a non-empty authority");
            return;
        }
        String str2 = providerInfo.authority.split(";")[0];
        synchronized (this.mLock) {
            this.mAuthority = str2;
        }
        HashMap<String, t19> map = sCache;
        synchronized (map) {
            map.remove(str2);
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return ((u19) getLocalPathStrategy()).a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        File fileA = ((u19) getLocalPathStrategy()).a(uri);
        int iLastIndexOf = fileA.getName().lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileA.getName().substring(iLastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @SuppressLint({"UnknownNullness"})
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return ParcelFileDescriptor.open(((u19) getLocalPathStrategy()).a(uri), modeToMode(str));
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        File fileA = ((u19) getLocalPathStrategy()).a(uri);
        String queryParameter = uri.getQueryParameter(DISPLAYNAME_FIELD);
        if (strArr == null) {
            strArr = COLUMNS;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = queryParameter == null ? fileA.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(fileA.length());
            }
            i2 = i;
        }
        String[] strArrCopyOf = copyOf(strArr3, i2);
        Object[] objArrCopyOf = copyOf(objArr, i2);
        MatrixCursor matrixCursor = new MatrixCursor(strArrCopyOf, 1);
        matrixCursor.addRow(objArrCopyOf);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
