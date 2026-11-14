package defpackage;

import android.net.Uri;
import android.provider.DocumentsContract;
import com.opera.android.OperaApplication;
import java.io.FileNotFoundException;

/* loaded from: classes.dex */
public abstract class aii extends iji {
    public final String w;
    public final rf7 x;

    /* JADX WARN: Multi-variable type inference failed */
    public aii(mej mejVar, dx3 dx3Var, String str) {
        super(mejVar, dx3Var);
        this.w = str;
        String[] strArr = OperaApplication.K;
        this.x = ((OperaApplication) dx3Var.getApplication()).m().a;
    }

    public final Uri a0(Uri uri, String str) {
        if (uri.getScheme().equals("file")) {
            return uri.buildUpon().appendPath(str).build();
        }
        try {
            return DocumentsContract.createDocument(this.b.getContext().getContentResolver(), DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri)), this.w, str);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    @Override // defpackage.iji
    public final long n(String str) {
        return this.x.f(null, str);
    }
}
