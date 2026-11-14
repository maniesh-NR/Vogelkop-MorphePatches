package defpackage;

import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ecg {
    public CharSequence a;
    public IconCompat b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ecg)) {
            return false;
        }
        ecg ecgVar = (ecg) obj;
        String str = this.d;
        String str2 = ecgVar.d;
        return (str == null && str2 == null) ? Objects.equals(Objects.toString(this.a), Objects.toString(ecgVar.a)) && Objects.equals(this.c, ecgVar.c) && Boolean.valueOf(this.e).equals(Boolean.valueOf(ecgVar.e)) && Boolean.valueOf(this.f).equals(Boolean.valueOf(ecgVar.f)) : Objects.equals(str, str2);
    }

    public final int hashCode() {
        String str = this.d;
        return str != null ? str.hashCode() : Objects.hash(this.a, this.c, Boolean.valueOf(this.e), Boolean.valueOf(this.f));
    }
}
