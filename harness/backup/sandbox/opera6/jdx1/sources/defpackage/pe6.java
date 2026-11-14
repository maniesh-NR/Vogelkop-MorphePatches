package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import java.io.File;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* loaded from: classes.dex */
public final class pe6 {
    public static final pe6 b = new pe6(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ pe6(byte b2) {
        this.a = b2;
    }

    public final Object a(Object obj, vrf vrfVar) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                if (!c.q(str, "data:image", false)) {
                    return null;
                }
                try {
                    return x33.a(x33.e, StringsKt.e0(str, "base64,", str), 0, 6);
                } catch (Exception unused) {
                    hzc hzcVarC = hzc.c.c("DataUriByteArrayMapper");
                    String str2 = hzcVarC.b;
                    eaj eajVar = eaj.e;
                    if (hzcVarC.a.a.compareTo(eajVar) > 0) {
                        return null;
                    }
                    hzcVarC.b(eajVar, str2, "Failed to decode data:image uri: ".concat(str), null);
                    return null;
                }
            case 1:
                return m5h.C(((Uri) obj).toString());
            case 2:
                return m5h.a(((File) obj).getPath());
            case 3:
                return m5h.a(((w6g) obj).a.w());
            case 4:
                int iIntValue = ((Number) obj).intValue();
                Context context = vrfVar.a;
                try {
                    if (context.getResources().getResourceEntryName(iIntValue) == null) {
                        return null;
                    }
                    return m5h.C("android.resource://" + context.getPackageName() + "/" + iIntValue);
                } catch (Resources.NotFoundException unused2) {
                    return null;
                }
            default:
                return m5h.C((String) obj);
        }
    }
}
