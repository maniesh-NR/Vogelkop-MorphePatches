package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class gon implements u2j {
    public static final gon a = new gon();
    public static final fon b = fon.g();

    public final Object getDefaultValue() {
        return b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wx5 */
    public final Object readFrom(InputStream inputStream) throws wx5 {
        try {
            return fon.s(inputStream);
        } catch (bjb e) {
            throw new wx5("Cannot read proto.", e);
        }
    }

    public final Unit writeTo(Object obj, OutputStream outputStream) {
        ((fon) obj).writeTo(outputStream);
        return Unit.a;
    }
}
