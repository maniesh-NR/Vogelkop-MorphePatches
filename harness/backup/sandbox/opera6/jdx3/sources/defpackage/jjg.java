package defpackage;

import android.app.Activity;
import android.app.WallpaperManager;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.view.ViewGroup;
import com.opera.android.OperaApplication;
import com.opera.android.favorites.b;
import com.opera.android.favorites.e;
import com.opera.android.settings.SettingsManager;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes.dex */
public final /* synthetic */ class jjg implements esk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jjg(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object get() throws Throwable {
        Throwable th;
        Cursor cursorQuery;
        File[] fileArrListFiles;
        IOException iOException;
        Throwable th2;
        FileInputStream fileInputStream;
        String message;
        FileInputStream fileInputStream2;
        byte b = this.a;
        Cursor cursor = null;
        FileInputStream fileInputStream3 = null;
        FileInputStream fileInputStream4 = null;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((tjg) obj).n;
            case 1:
                c3j c3jVarD = ((d3j) ((e3j) obj).i()).d(43, false);
                if (c3jVarD != null) {
                    Uri uri = Uri.parse("https://" + c3jVarD + "/");
                    if (uri != null) {
                        return uri;
                    }
                }
                return Uri.parse("https://product.opera-api.com/");
            case 2:
                return ((cj9) ((dj9) obj).i()).a;
            case 3:
                return (tta) ((beh) obj).h.g();
            case 4:
                return Long.valueOf(DatabaseUtils.queryNumEntries(((jlh) obj).getReadableDatabase(), "reading", null));
            case 5:
                String[] strArr = OperaApplication.K;
                return (b1o) ((OperaApplication) ((Activity) ((x7j) obj).b).getApplication()).r.r1.get();
            case 6:
                return Boolean.valueOf(x7d.o(((z7j) obj).a));
            case 7:
                return Boolean.valueOf((((vok) ((ipk) obj).f.i()).a & 4) != 0);
            case 8:
                b bVar = ((e) ((nr8) obj)).f;
                bVar.getClass();
                return sfe.N0(new tkj(bVar), 50);
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                xbf xbfVar = (xbf) obj;
                SettingsManager settingsManager = (SettingsManager) xbfVar.c;
                if (settingsManager.O()) {
                    return null;
                }
                Uri uriT = settingsManager.t(false);
                ArrayList arrayList = new ArrayList();
                if ("file".equals(uriT.getScheme())) {
                    File file = new File(uriT.getPath());
                    if (!file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles(new o3b((byte) 1))) == null) {
                        return null;
                    }
                    for (File file2 : fileArrListFiles) {
                        arrayList.add(Uri.fromFile(file2));
                    }
                } else {
                    ContentResolver contentResolver = ((Context) xbfVar.b).getContentResolver();
                    String treeDocumentId = DocumentsContract.getTreeDocumentId(uriT);
                    try {
                        cursorQuery = contentResolver.query(DocumentsContract.buildChildDocumentsUriUsingTree(DocumentsContract.buildDocumentUriUsingTree(uriT, treeDocumentId), treeDocumentId), new String[]{"document_id", "_display_name"}, null, null, null);
                        try {
                            int columnIndex = cursorQuery.getColumnIndex("document_id");
                            int columnIndex2 = cursorQuery.getColumnIndex("_display_name");
                            if (cursorQuery.moveToFirst()) {
                                do {
                                    if (cursorQuery.getString(columnIndex2).endsWith(".mhtml")) {
                                        arrayList.add(DocumentsContract.buildDocumentUriUsingTree(uriT, cursorQuery.getString(columnIndex)));
                                    }
                                } while (cursorQuery.moveToNext());
                            }
                            cursorQuery.close();
                        } catch (Exception unused) {
                            if (cursorQuery == null) {
                                return null;
                            }
                            cursorQuery.close();
                            return null;
                        } catch (Throwable th3) {
                            th = th3;
                            cursor = cursorQuery;
                            if (cursor == null) {
                                throw th;
                            }
                            cursor.close();
                            throw th;
                        }
                    } catch (Exception unused2) {
                        cursorQuery = null;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                return arrayList;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return WallpaperManager.getInstance((OperaApplication) ((mgh) obj).b);
            case 11:
                try {
                    try {
                        fileInputStream2 = new FileInputStream((File) obj);
                    } catch (Throwable th5) {
                        th2 = th5;
                        fileInputStream = fileInputStream4;
                    }
                } catch (IOException e) {
                    iOException = e;
                }
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(fileInputStream2.available());
                    xvg.n(fileInputStream2, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    StringBuilder sb = new StringBuilder();
                    sb.append(f8a.h.b(byteArray));
                    Locale locale = Locale.US;
                    sb.append(" (size: " + byteArray.length + ")");
                    message = sb.toString();
                    xvg.l(fileInputStream2);
                    fileInputStream4 = sb;
                } catch (IOException e2) {
                    iOException = e2;
                    fileInputStream3 = fileInputStream2;
                    message = iOException.getMessage();
                    xvg.l(fileInputStream3);
                    fileInputStream4 = fileInputStream3;
                    return message;
                } catch (Throwable th6) {
                    th2 = th6;
                    fileInputStream = fileInputStream2;
                    xvg.l(fileInputStream);
                    throw th2;
                }
                return message;
            case 12:
                v3m v3mVar = (v3m) obj;
                return nb6.J(sfe.Q(v3m.c(v3mVar.a), new f15(v3mVar, (byte) 5)));
            case 13:
                return (ViewGroup) ((ViewGroup) obj).findViewById(2131364492);
            case 14:
                return Boolean.valueOf(((ndn) obj).r);
            case 15:
                return new mlh((ztn) obj, (byte) 1);
            case 16:
                return (sz4) obj;
            default:
                return Boolean.valueOf(((q0o) obj).i);
        }
    }
}
