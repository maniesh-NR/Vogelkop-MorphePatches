package defpackage;

import android.net.Uri;
import android.util.Size;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.internal._UtilJvmKt;

/* loaded from: classes.dex */
public final class fco extends l6e {
    @Override // defpackage.l6e, defpackage.eri
    public final lsc g(byte[] bArr, Size size, Size size2, String str) {
        esd esdVarX;
        Uri uri = Uri.parse(this.d);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(uri.getScheme()).encodedAuthority(uri.getEncodedAuthority()).appendPath("images").appendPath("touch").appendPath("search").appendQueryParameter("clid", uri.getQueryParameter("clid")).appendQueryParameter("rpt", "imageview");
        lsc lscVar = new lsc(builder.appendQueryParameter(ImagesContract.URL, str).build().toString(), 0);
        String string = UUID.randomUUID().toString();
        g54 g54Var = new g54(string.getBytes(Charsets.UTF_8));
        g54Var.c = string;
        esd esdVar = sce.e;
        ArrayList arrayList = new ArrayList();
        esd esdVar2 = sce.e;
        if (!Intrinsics.a(esdVar2.b, "multipart")) {
            odf.i(esdVar2, "multipart != ");
            return null;
        }
        try {
            esdVarX = wyh.x("image/jpeg");
        } catch (IllegalArgumentException unused) {
            esdVarX = null;
        }
        arrayList.add(w7d.l("upfile", (String) null, rvh.create(bArr, esdVarX)));
        if (!arrayList.isEmpty()) {
            return l6e.o(lscVar, new sce(g54Var, esdVar2, _UtilJvmKt.toImmutableList(arrayList)));
        }
        qp2.n("Multipart body must have at least one part.");
        return null;
    }

    @Override // defpackage.l6e, defpackage.eri
    public final int m() {
        return 1024;
    }
}
