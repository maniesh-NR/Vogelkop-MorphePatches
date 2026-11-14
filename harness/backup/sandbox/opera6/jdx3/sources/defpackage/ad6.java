package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ad6 implements u2j {
    public static final ad6 a = new ad6();
    public static final fdk b = me6.b;

    public final Object getDefaultValue() {
        return b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wx5 */
    public final Object readFrom(InputStream inputStream) throws wx5 {
        try {
            crb crbVar = me6.c;
            crbVar.getClass();
            return cqp.L(crbVar, fdk.Companion.serializer(), inputStream);
        } catch (o2j e) {
            throw new wx5("Unable to read ntp", e);
        }
    }

    public final Unit writeTo(Object obj, OutputStream outputStream) {
        crb crbVar = me6.c;
        crbVar.getClass();
        cqp.O(crbVar, fdk.Companion.serializer(), (fdk) obj, outputStream);
        return Unit.a;
    }
}
