package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.c;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class iio {

    @NotNull
    public static final hio Companion = new hio();
    public final String a;
    public final String b;
    public final c c;

    public iio(int i, String str, String str2, c cVar) {
        if (7 != (i & 7)) {
            x7d.I(i, 7, gio.b);
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iio)) {
            return false;
        }
        iio iioVar = (iio) obj;
        return Intrinsics.a(this.a, iioVar.a) && Intrinsics.a(this.b, iioVar.b) && Intrinsics.a(this.c, iioVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.a.hashCode() + z1m.f((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return "TemplateConfig(templateId=" + this.a + ", indexUrl=" + this.b + ", templateSettings=" + this.c + ')';
    }
}
