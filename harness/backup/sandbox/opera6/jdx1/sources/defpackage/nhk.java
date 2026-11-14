package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* loaded from: classes.dex */
public final class nhk implements v7e {
    public final /* synthetic */ byte a;
    public final v7e b;

    public /* synthetic */ nhk(v7e v7eVar, byte b) {
        this.a = b;
        this.b = v7eVar;
    }

    @Override // defpackage.v7e
    public final u7e a(Object obj, int i, int i2, trf trfVar) {
        Uri uriFromFile;
        byte b = this.a;
        v7e v7eVar = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    uriFromFile = null;
                } else if (str.charAt(0) == '/') {
                    uriFromFile = Uri.fromFile(new File(str));
                } else {
                    Uri uri = Uri.parse(str);
                    uriFromFile = uri.getScheme() == null ? Uri.fromFile(new File(str)) : uri;
                }
                if (uriFromFile == null || !v7eVar.b(uriFromFile)) {
                    return null;
                }
                return v7eVar.a(uriFromFile, i, i2, trfVar);
            default:
                return v7eVar.a(new xy9((URL) obj), i, i2, trfVar);
        }
    }

    @Override // defpackage.v7e
    public final boolean b(Object obj) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }
}
