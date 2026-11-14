package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class jmk {
    public final String a;
    public final imk b;
    public final hmk c;

    public jmk(String str, imk imkVar, hmk hmkVar) {
        this.a = str;
        this.b = imkVar;
        this.c = hmkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmk)) {
            return false;
        }
        jmk jmkVar = (jmk) obj;
        if (this.a.equals(jmkVar.a) && Objects.equals(this.b, jmkVar.b)) {
            return Objects.equals(this.c, jmkVar.c);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
