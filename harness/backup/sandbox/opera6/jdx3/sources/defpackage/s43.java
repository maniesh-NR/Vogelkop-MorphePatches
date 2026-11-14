package defpackage;

import android.net.Uri;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public abstract class s43 {
    public static final esd c;
    public final ii a = new ii(4);
    public final umi b;

    static {
        esd esdVarX;
        Regex regex = esd.e;
        try {
            esdVarX = wyh.x("application/json");
        } catch (IllegalArgumentException unused) {
            esdVarX = null;
        }
        c = esdVarX;
    }

    public s43(umi umiVar) {
        this.b = umiVar;
    }

    public final fvh a(String str, String str2, String... strArr) {
        Uri.Builder builderAppendEncodedPath = b().buildUpon().appendEncodedPath(str);
        for (int i = 0; i < strArr.length; i += 2) {
            builderAppendEncodedPath.appendQueryParameter(strArr[i], strArr[i + 1]);
        }
        fvh fvhVar = new fvh();
        fvhVar.h(builderAppendEncodedPath.build().toString());
        fvhVar.d("Accept", c.a);
        if (str2 != null) {
            fvhVar.d("Authorization", str2);
        }
        return fvhVar;
    }

    public abstract Uri b();
}
