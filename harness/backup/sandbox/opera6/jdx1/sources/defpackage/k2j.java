package defpackage;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@h2j(with = j2j.class)
/* loaded from: classes.dex */
public final class k2j {

    @NotNull
    public static final i2j Companion = new i2j();
    public byte[] a;
    public n9h b;

    public k2j(byte[] bArr) {
        this.a = bArr;
    }

    public final Object a(KSerializer kSerializer) {
        Object objI;
        n9h n9hVar = this.b;
        if (n9hVar == null || (objI = n9hVar.b) == null) {
            byte[] bArr = this.a;
            objI = bArr != null ? nxg.i(bArr, kSerializer) : null;
        }
        this.b = null;
        this.a = null;
        return objI;
    }
}
