package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class rlj extends dd7 {
    public final /* synthetic */ byte a = 0;
    public Context b;
    public Uri c;

    public /* synthetic */ rlj() {
    }

    public rlj(Context context, Uri uri) {
        this.b = context;
        this.c = uri;
    }

    @Override // defpackage.dd7
    public final boolean a() {
        switch (this.a) {
            case 0:
                Context context = this.b;
                Uri uri = this.c;
                if (context.checkCallingOrSelfUriPermission(uri, 1) != 0 || TextUtils.isEmpty(z4o.t0(context, uri, "mime_type"))) {
                    break;
                }
                break;
            default:
                Context context2 = this.b;
                Uri uri2 = this.c;
                if (context2.checkCallingOrSelfUriPermission(uri2, 1) != 0 || TextUtils.isEmpty(z4o.t0(context2, uri2, "mime_type"))) {
                    break;
                }
                break;
        }
        return false;
    }

    @Override // defpackage.dd7
    public final boolean b() {
        switch (this.a) {
        }
        return z4o.q(this.b, this.c);
    }

    @Override // defpackage.dd7
    public final boolean c() {
        switch (this.a) {
        }
        return DocumentsContract.deleteDocument(this.b.getContentResolver(), this.c);
    }

    @Override // defpackage.dd7
    public final boolean d() {
        switch (this.a) {
        }
        return z4o.Q(this.b, this.c);
    }

    @Override // defpackage.dd7
    public final String g() {
        switch (this.a) {
        }
        return z4o.t0(this.b, this.c, "_display_name");
    }

    @Override // defpackage.dd7
    public final String h() {
        switch (this.a) {
            case 0:
                String strT0 = z4o.t0(this.b, this.c, "mime_type");
                if ("vnd.android.document/directory".equals(strT0)) {
                    return null;
                }
                return strT0;
            default:
                String strT02 = z4o.t0(this.b, this.c, "mime_type");
                if ("vnd.android.document/directory".equals(strT02)) {
                    return null;
                }
                return strT02;
        }
    }

    @Override // defpackage.dd7
    public final Uri i() {
        switch (this.a) {
        }
        return this.c;
    }

    @Override // defpackage.dd7
    public final long j() {
        switch (this.a) {
        }
        return z4o.s0(this.b, this.c, "_size", 0L);
    }

    @Override // defpackage.dd7
    public final boolean k(String str) throws FileNotFoundException {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                try {
                    Uri uriRenameDocument = DocumentsContract.renameDocument(this.b.getContentResolver(), this.c, str);
                    if (uriRenameDocument == null) {
                        return false;
                    }
                    this.c = uriRenameDocument;
                    return true;
                } catch (Exception unused) {
                    return false;
                }
        }
    }

    public final dd7[] l() {
        Context context = this.b;
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = this.c;
        Uri uriBuildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                try {
                    cursorQuery = contentResolver.query(uriBuildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
                    while (cursorQuery.moveToNext()) {
                        arrayList.add(DocumentsContract.buildDocumentUriUsingTree(this.c, cursorQuery.getString(0)));
                    }
                    try {
                        u35.p(cursorQuery);
                    } catch (RuntimeException e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    Cursor cursor = cursorQuery;
                    if (cursor == null) {
                        throw th;
                    }
                    try {
                        u35.p(cursor);
                        throw th;
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (Exception unused) {
                        throw th;
                    }
                }
            } catch (Exception e3) {
                e3.toString();
                Cursor cursor2 = cursorQuery;
                if (cursor2 != null) {
                    try {
                        u35.p(cursor2);
                    } catch (RuntimeException e4) {
                        throw e4;
                    }
                }
            }
        } catch (Exception unused2) {
        }
        Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[0]);
        dd7[] dd7VarArr = new dd7[uriArr.length];
        for (int i = 0; i < uriArr.length; i++) {
            dd7VarArr[i] = new rlj(context, uriArr[i]);
        }
        return dd7VarArr;
    }
}
