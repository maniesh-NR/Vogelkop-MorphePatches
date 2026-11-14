package defpackage;

import android.content.Context;
import android.net.Uri;
import com.leanplum.internal.Constants;
import java.net.URL;

/* loaded from: classes.dex */
public abstract class zb5 extends r22 {
    public final ywh e;

    public zb5(Context context, ywh ywhVar, qtm qtmVar) {
        super(context, qtmVar, qtmVar);
        this.e = ywhVar;
    }

    @Override // defpackage.r22
    public final Uri.Builder c() {
        String str;
        String str2;
        this.d = c26.q();
        yla ylaVar = ((d93) this.b).a;
        URL url = ylaVar.a;
        l0c l0cVar = ylaVar.e;
        if (l0cVar != null) {
            str = l0cVar.a;
            str2 = l0cVar.b;
        } else {
            str = "";
            str2 = "";
        }
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(url.getProtocol()).encodedAuthority(url.getAuthority()).appendEncodedPath("v1/localnews").appendQueryParameter("product", "opera").appendQueryParameter(Constants.Keys.COUNTRY, str).appendQueryParameter("language", str2);
        return builder;
    }
}
