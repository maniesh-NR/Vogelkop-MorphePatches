package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.DocumentsContract;
import java.io.FileNotFoundException;

/* loaded from: classes.dex */
public final /* synthetic */ class yii implements n5o {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Uri b;

    public /* synthetic */ yii(Uri uri, byte b) {
        this.a = b;
        this.b = uri;
    }

    public final Object g(Object obj) throws FileNotFoundException {
        byte b = this.a;
        Uri uri = this.b;
        ContentResolver contentResolver = (ContentResolver) obj;
        switch (b) {
            case 0:
                return rf7.k(contentResolver, uri);
            default:
                try {
                    DocumentsContract.deleteDocument(contentResolver, uri);
                    return null;
                } catch (Exception unused) {
                    return null;
                }
        }
    }
}
