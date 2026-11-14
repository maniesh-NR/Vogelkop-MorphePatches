package ads_mobile_sdk;

import defpackage.u2j;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class kq0 implements u2j {
    public static final kq0 a = new kq0();
    public static final jq0 b = jq0.q();

    @Override // defpackage.u2j
    public final Object getDefaultValue() {
        return b;
    }

    @Override // defpackage.u2j
    public final Object readFrom(InputStream inputStream) {
        try {
            return jq0.a(inputStream);
        } catch (Exception e) {
            vr3 vr3Var = xu0.a;
            xu0.c("Stored data has been corrupted: " + e, null);
            return b;
        }
    }

    @Override // defpackage.u2j
    public final Unit writeTo(Object obj, OutputStream outputStream) {
        ((jq0) obj).a(outputStream);
        return Unit.a;
    }
}
