package defpackage;

import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.json.b;

/* loaded from: classes.dex */
public final class tth {
    public final String a;
    public final b[] b;
    public final Function1 c;

    public tth(String str, b[] bVarArr, Function1 function1) {
        this.a = str;
        this.b = bVarArr;
        this.c = function1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tth)) {
            return false;
        }
        tth tthVar = (tth) obj;
        return this.a.equals(tthVar.a) && Arrays.equals(this.b, tthVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a;
    }
}
