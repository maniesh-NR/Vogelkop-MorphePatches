package defpackage;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;

/* loaded from: classes.dex */
public abstract class dd7 {
    public static rlj e(Context context, Uri uri) {
        rlj rljVar = new rlj();
        rljVar.b = context;
        rljVar.c = uri;
        return rljVar;
    }

    public static rlj f(Context context, Uri uri) {
        String treeDocumentId = DocumentsContract.getTreeDocumentId(uri);
        if (DocumentsContract.isDocumentUri(context, uri)) {
            treeDocumentId = DocumentsContract.getDocumentId(uri);
        }
        if (treeDocumentId == null) {
            qp2.o(fki.p(uri, "Could not get document ID from Uri: "));
            return null;
        }
        Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(uri, treeDocumentId);
        if (uriBuildDocumentUriUsingTree != null) {
            return new rlj(context, uriBuildDocumentUriUsingTree);
        }
        t3p.q(fki.p(uri, "Failed to build documentUri from a tree: "));
        return null;
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract String g();

    public abstract String h();

    public abstract Uri i();

    public abstract long j();

    public abstract boolean k(String str);
}
