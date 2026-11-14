package org.chromium.base;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Pair;
import androidx.annotation.Nullable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class VirtualDocumentPath {
    public final String a;
    public final String b;
    public final String c;
    public final ContentResolver d = t8.a.getContentResolver();

    public static class CreateOrOpenResult {
        public final Uri a;
        public final boolean b;

        public CreateOrOpenResult(boolean z, Uri uri) {
            this.a = uri;
            this.b = z;
        }

        public final String getContentUriString() {
            return this.a.toString();
        }

        public final boolean getCreated() {
            return this.b;
        }
    }

    public VirtualDocumentPath(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Nullable
    public static VirtualDocumentPath parse(String str) {
        if (!str.startsWith("/")) {
            if (str.startsWith("content://")) {
                Uri uri = Uri.parse(str);
                if (!DocumentsContract.isTreeUri(uri)) {
                    return null;
                }
                try {
                    DocumentsContract.getDocumentId(uri);
                    return null;
                } catch (IllegalArgumentException unused) {
                    String authority = uri.getAuthority();
                    if (authority != null && !authority.isEmpty()) {
                        return new VirtualDocumentPath(authority, Uri.encode(DocumentsContract.getTreeDocumentId(uri)), "");
                    }
                }
            }
            return null;
        }
        if (str.contains("//")) {
            return null;
        }
        if (str.endsWith("/")) {
            str = p3p.h(1, 0, str);
        }
        String[] strArrSplit = str.split("/", 6);
        if (strArrSplit.length < 5 || !strArrSplit[0].isEmpty() || !strArrSplit[1].equals("SAF")) {
            return null;
        }
        String str2 = strArrSplit[2];
        String str3 = strArrSplit[3];
        String str4 = strArrSplit[4];
        String str5 = strArrSplit.length > 5 ? strArrSplit[5] : "";
        if (str3.equals("tree")) {
            return new VirtualDocumentPath(str2, str4, str5);
        }
        return null;
    }

    public final Uri a() {
        boolean z;
        String str = this.c;
        String[] strArrSplit = str.isEmpty() ? new String[0] : str.split("/");
        Uri uriBuildTreeDocumentUri = DocumentsContract.buildTreeDocumentUri(this.a, Uri.decode(this.b));
        String treeDocumentId = DocumentsContract.getTreeDocumentId(uriBuildTreeDocumentUri);
        String[] strArr = {"_display_name", "document_id"};
        for (String str2 : strArrSplit) {
            try {
                Cursor cursorQuery = this.d.query(DocumentsContract.buildChildDocumentsUriUsingTree(uriBuildTreeDocumentUri, treeDocumentId), strArr, "_display_name = ?", new String[]{str2}, null);
                if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                    return null;
                }
                int columnIndex = cursorQuery.getColumnIndex("_display_name");
                int columnIndex2 = cursorQuery.getColumnIndex("document_id");
                while (true) {
                    if (!cursorQuery.isNull(columnIndex) && !cursorQuery.isNull(columnIndex2) && str2.equals(cursorQuery.getString(columnIndex))) {
                        treeDocumentId = cursorQuery.getString(columnIndex2);
                        z = true;
                        break;
                    }
                    if (!cursorQuery.moveToNext()) {
                        z = false;
                        break;
                    }
                }
                cursorQuery.close();
                if (!z) {
                    return null;
                }
            } catch (Exception unused) {
                return null;
            }
        }
        Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(uriBuildTreeDocumentUri, treeDocumentId);
        if (strArrSplit.length == 0) {
            Cursor cursorQuery2 = this.d.query(uriBuildDocumentUriUsingTree, new String[]{"document_id"}, null, null, null);
            if (cursorQuery2 == null) {
                return null;
            }
            if (!cursorQuery2.moveToFirst()) {
                return null;
            }
        }
        return uriBuildDocumentUriUsingTree;
    }

    public final Pair b() {
        String str = this.c;
        String[] strArrSplit = str.isEmpty() ? new String[0] : str.split("/");
        if (strArrSplit.length == 0) {
            return null;
        }
        int length = strArrSplit.length - 1;
        String[] strArr = new String[length];
        System.arraycopy(strArrSplit, 0, strArr, 0, length);
        return new Pair(new VirtualDocumentPath(this.a, this.b, String.join("/", strArr)), strArrSplit[strArrSplit.length - 1]);
    }

    @Nullable
    public final CreateOrOpenResult createOrOpen() throws FileNotFoundException {
        Pair pairB = b();
        if (pairB == null) {
            return null;
        }
        VirtualDocumentPath virtualDocumentPath = (VirtualDocumentPath) pairB.first;
        String str = (String) pairB.second;
        Uri uriA = a();
        if (uriA != null) {
            return new CreateOrOpenResult(false, uriA);
        }
        Uri uriA2 = virtualDocumentPath.a();
        if (uriA2 == null) {
            return null;
        }
        try {
            Uri uriCreateDocument = DocumentsContract.createDocument(this.d, uriA2, "", str);
            if (uriCreateDocument == null) {
                return null;
            }
            return new CreateOrOpenResult(true, uriCreateDocument);
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean mkdir() {
        Uri uriA;
        Pair pairB = b();
        if (pairB == null) {
            return false;
        }
        VirtualDocumentPath virtualDocumentPath = (VirtualDocumentPath) pairB.first;
        String str = (String) pairB.second;
        if (a() == null && (uriA = virtualDocumentPath.a()) != null) {
            return DocumentsContract.createDocument(this.d, uriA, "vnd.android.document/directory", str) != null;
        }
        return false;
    }

    public final String resolveToContentUriString() {
        Uri uriA = a();
        return uriA == null ? "" : uriA.toString();
    }

    public final String toString() {
        String str = this.c;
        boolean zIsEmpty = str.isEmpty();
        String str2 = this.b;
        String str3 = this.a;
        if (zIsEmpty) {
            return p3p.w("/SAF/", str3, "/tree/", str2);
        }
        StringBuilder sbN = z1m.n("/SAF/", str3, "/tree/", str2, "/");
        sbN.append(str);
        return sbN.toString();
    }

    public final boolean writeFile(byte[] bArr) throws IOException {
        CreateOrOpenResult createOrOpenResultCreateOrOpen = createOrOpen();
        if (createOrOpenResultCreateOrOpen != null) {
            try {
                OutputStream outputStreamOpenOutputStream = this.d.openOutputStream(createOrOpenResultCreateOrOpen.a);
                if (outputStreamOpenOutputStream != null) {
                    try {
                        outputStreamOpenOutputStream.write(bArr);
                        outputStreamOpenOutputStream.close();
                        return true;
                    } finally {
                    }
                }
                if (outputStreamOpenOutputStream != null) {
                    outputStreamOpenOutputStream.close();
                }
            } catch (Exception unused) {
                String.valueOf(createOrOpenResultCreateOrOpen.a);
                return false;
            }
        }
        return false;
    }
}
